package example

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class TownController {

    TownService townService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond townService.list(params), model:[townCount: townService.count()]
    }

    def show(Long id) {
        respond townService.get(id)
    }

    def create() {
        respond new Town(params)
    }

    def save(Town town) {
        if (town == null) {
            notFound()
            return
        }

        try {
            townService.save(town)
        } catch (ValidationException e) {
            respond town.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'town.label', default: 'Town'), town.id])
                redirect town
            }
            '*' { respond town, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond townService.get(id)
    }

    def update(Town town) {
        if (town == null) {
            notFound()
            return
        }

        try {
            townService.save(town)
        } catch (ValidationException e) {
            respond town.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'town.label', default: 'Town'), town.id])
                redirect town
            }
            '*'{ respond town, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        townService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'town.label', default: 'Town'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'town.label', default: 'Town'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
