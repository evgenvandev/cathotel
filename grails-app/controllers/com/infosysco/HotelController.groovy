package com.infosysco

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class HotelController {

    HotelService hotelService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

	def search = {
		def collUnique = uniqueColl(com.infosysco.Country.list())
		//def collUnique = com.infosysco.Country.list().unique()
		//return [countres: com.infosysco.Country.list().toSet()]
		return [countres: collUnique]
	}
	
	def uniqueColl(def list) {
		Set uniqueColl = []
		list.each{
			if (!uniqueColl.contains(it)) {
				uniqueColl << it
			}
		}
		return uniqueColl
	}
	
	def results = {
		//def findCountry = new Country(name: "${params.country}")
		//def hotels = Hotel.findAllByNameAndCountryLike("%${params.hotelsearch}%", findCountry)
		//def hotels = Hotel.findAllByCountryAndNameLike(findCountry, "%${params.hotelsearch}%")
		//def hotels = Hotel.findAllByCountryAndNameLike(new Country(name: "params.country"), "%${params.hotelsearch}%")
		//def hotels = Hotel.findAllByNameLike("%${params.hotelsearch}%")
		/*def hotelToFind = new Hotel(name: "%${params.hotelsearch}%")
		def hotels = Hotel.findAll(hotelToFind)*/
		
		/*def hotels = Hotel.createCriteria().list {
			and {
				ilike('name', "%${params.hotelsearch}%")
				country {
					eq('name', "${params.country}")
				}
			}
		}*/
		
		def hotels = Hotel.withCriteria{
			and {
				ilike('name', "%${params.hotelsearch}%")
				country {
					eq('name', "${params.country}")
				}
			}
			order("star", "desc")
			order("name", "asc")
		}
		
		return [hotels: hotels, term: params.hotelsearch, termcountry: params.country]
	}
	
    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond hotelService.list(params), model:[hotelCount: hotelService.count()]
    }

    def show(Long id) {
        respond hotelService.get(id)
    }

    def create() {
        respond new Hotel(params)
    }

    def save(Hotel hotel) {
        if (hotel == null) {
            notFound()
            return
        }

        try {
            hotelService.save(hotel)
        } catch (ValidationException e) {
            respond hotel.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'hotel.label', default: 'Hotel'), hotel.id])
                redirect hotel
            }
            '*' { respond hotel, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond hotelService.get(id)
    }

    def update(Hotel hotel) {
        if (hotel == null) {
            notFound()
            return
        }

        try {
            hotelService.save(hotel)
        } catch (ValidationException e) {
            respond hotel.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'hotel.label', default: 'Hotel'), hotel.id])
                redirect hotel
            }
            '*'{ respond hotel, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        hotelService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'hotel.label', default: 'Hotel'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'hotel.label', default: 'Hotel'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
