//package cathotel
package com.infosysco

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

		"/"(controller: "hotel", action: "search")
        //"/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
