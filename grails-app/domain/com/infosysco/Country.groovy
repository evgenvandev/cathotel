package com.infosysco

class Country {

	static belongsTo = Hotel

	String name
	String capital

    static constraints = {
		name(maxSize: 255)
		capital(maxSize: 128)
    }
	
	String toString() {
		"${name}"
	}
}
