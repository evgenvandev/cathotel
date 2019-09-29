package com.infosysco

class Hotel {

	String name
	Country country
	Integer star
	String homepage

    static constraints = {
		name(maxSize: 255)
		country()
		star(size: 1..5)
		homepage(url: true, nullable: true)
    }
	
	static mapping = {
		country lazy: false
		sort name: 'asc'
	}
}
