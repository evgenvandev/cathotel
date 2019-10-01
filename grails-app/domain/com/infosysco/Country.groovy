package com.infosysco

class Country {

	static hasMany = [hotels : Hotel]

	String name
	String capital

    static constraints = {
		name(maxSize: 255, unique: true)
		capital(maxSize: 128)
    }
	
	static mapping = {
		hotels sort: 'name'
	}
	
	String toString() {
		"${name}"
	}
}
