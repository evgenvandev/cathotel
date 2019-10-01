package com.infosysco

class Hotel {

	String name
	Integer star
	String homepage
	
	static belongsTo = [country : Country]

    static constraints = {
		name(maxSize: 255, unique: true)
		country()
		star(inList:[1, 2, 3, 4, 5])
		homepage(url: true, nullable: true)
    }
	
	static mapping = {
		sort name: 'asc'
	}
	
	String toString() {
		"${name}"
	}
}
