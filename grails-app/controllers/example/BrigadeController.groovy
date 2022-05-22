package example

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class BrigadeController {

    BrigadeService brigadeService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond brigadeService.list(params), model:[brigadeCount: brigadeService.count()]
    }

    def show(Long id) {
        respond brigadeService.get(id)
    }

    def create() {
        respond new Brigade(params)
    }

    def save(Brigade brigade) {
        if (brigade == null) {
            notFound()
            return
        }

        try {
            brigadeService.save(brigade)
        } catch (ValidationException e) {
            respond brigade.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'brigade.label', default: 'Brigade'), brigade.id])
                redirect brigade
            }
            '*' { respond brigade, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond brigadeService.get(id)
    }

    def update(Brigade brigade) {
        if (brigade == null) {
            notFound()
            return
        }

        try {
            brigadeService.save(brigade)
        } catch (ValidationException e) {
            respond brigade.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'brigade.label', default: 'Brigade'), brigade.id])
                redirect brigade
            }
            '*'{ respond brigade, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        brigadeService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'brigade.label', default: 'Brigade'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'brigade.label', default: 'Brigade'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
