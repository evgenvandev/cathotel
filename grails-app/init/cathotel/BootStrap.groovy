//package cathotel
package com.infosysco

class BootStrap {

    def init = { servletContext ->
	
		def russia = new Country(name: 'Россия', capital: 'Москва').save()
		def england = new Country(name: 'Англия', capital: 'Лондон').save()
		def france = new Country(name: 'Франция', capital: 'Париж').save()
		def germany = new Country(name: 'Германия', capital: 'Берлин').save()
		def china = new Country(name: 'Китай', capital: 'Пекин').save()
		def usa = new Country(name: 'Соединённые Штаты Америки', capital: 'Вашингтон').save()
		new Hotel(name: 'Жёлтая Площадь', country: russia, star: 3, homepage: 'http://yandex.ru').save()
		new Hotel(name: 'Красный Тауэр', country: england, star: 3, homepage: 'http://google.com').save()
		new Hotel(name: 'Красная Площадь', country: russia, star: 5, homepage: 'http://yandex.ru').save()
		new Hotel(name: 'Красная Башня', country: france, star: 4, homepage: 'http://google.com').save()
		new Hotel(name: 'Красная Стена', country: germany, star: 5, homepage: 'http://google.com').save()
		new Hotel(name: 'Красный дракон', country: china, star: 3, homepage: 'http://google.com').save()
		
		new Hotel(name: 'Жёлтая Тауэр', country: england, star: 5, homepage: 'http://google.com').save()
		new Hotel(name: 'Жёлтая Башня', country: france, star: 2, homepage: 'http://google.com').save()
		new Hotel(name: 'Жёлтая Стена', country: germany, star: 2, homepage: 'http://google.com').save()
		new Hotel(name: 'Жёлтый дракон', country: china, star: 4, homepage: 'http://google.com').save()
		new Hotel(name: 'Жёлтая статуя', country: usa, star: 4, homepage: 'http://google.com').save()
		
		new Hotel(name: 'Зелённая Площадь', country: russia, star: 5, homepage: 'http://yandex.ru').save()
		
		new Hotel(name: 'Янтарная Площадь', country: russia, star: 5, homepage: 'http://yandex.ru').save()
    }
    def destroy = {
    }
}
