//package cathotel
package com.infosysco

class BootStrap {

    def init = { servletContext ->
	
		new Hotel(name: 'Жёлтая Площадь', country: new Country(name: 'Россия', capital: 'Москва'), star: 3, homepage: 'http://yandex.ru').save()
		new Hotel(name: 'Янтарная Площадь', country: new Country(name: 'Россия', capital: 'Москва'), star: 5).save()
		new Hotel(name: 'Красная Площадь', country: new Country(name: 'Россия', capital: 'Москва'), star: 5, homepage: 'http://yandex.ru').save()
		new Hotel(name: 'Красный Тауэр', country: new Country(name: 'Англия', capital: 'Лондон'), star: 3, homepage: 'http://google.com').save()
		new Hotel(name: 'Красная Башня', country: new Country(name: 'Франция', capital: 'Париж'), star: 4, homepage: 'http://google.com').save()
		new Hotel(name: 'Красная Стена', country: new Country(name: 'Германия', capital: 'Берлин'), star: 5).save()
		new Hotel(name: 'Красный дракон', country: new Country(name: 'Китай', capital: 'Пекин'), star: 3, homepage: 'http://google.com').save()
		
		new Hotel(name: 'Жёлтая Тауэр', country: new Country(name: 'Англия', capital: 'Лондон'), star: 5, homepage: 'http://google.com').save()
		new Hotel(name: 'Жёлтая Башня', country: new Country(name: 'Франция', capital: 'Париж'), star: 2, homepage: 'http://google.com').save()
		new Hotel(name: 'Жёлтая Стена', country: new Country(name: 'Германия', capital: 'Берлин'), star: 2).save()
		new Hotel(name: 'Жёлтая дракон', country: new Country(name: 'Китай', capital: 'Пекин'), star: 4, homepage: 'http://google.com').save()
		new Hotel(name: 'Жёлтая статуя', country: new Country(name: 'Соединённые Штаты Америки', capital: 'Вашингтон'), star: 4, homepage: 'http://google.com').save()
		
		new Hotel(name: 'Зелённая Площадь', country: new Country(name: 'Россия', capital: 'Москва'), star: 5, homepage: 'http://yandex.ru').save()
    }
    def destroy = {
    }
}
