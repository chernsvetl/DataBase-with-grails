package example

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class TownExampleController {

    TownExampleService townExampleService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond townExampleService.list(params), model:[townExampleCount: townExampleService.count()]
    }

    def show(Long id) {
        respond townExampleService.get(id)
    }

    def create() {
        respond new TownExample(params)
    }

    def save(TownExample townExample) {
        if (townExample == null) {
            notFound()
            return
        }

        try {
            townExampleService.save(townExample)
        } catch (ValidationException e) {
            respond townExample.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'townExample.label', default: 'TownExample'), townExample.id])
                redirect townExample
            }
            '*' { respond townExample, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond townExampleService.get(id)
    }

    def update(TownExample townExample) {
        if (townExample == null) {
            notFound()
            return
        }

        try {
            townExampleService.save(townExample)
        } catch (ValidationException e) {
            respond townExample.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'townExample.label', default: 'TownExample'), townExample.id])
                redirect townExample
            }
            '*'{ respond townExample, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        townExampleService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'townExample.label', default: 'TownExample'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'townExample.label', default: 'TownExample'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
