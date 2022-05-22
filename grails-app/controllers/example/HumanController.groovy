package example

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class HumanController {

    HumanService humanService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond humanService.list(params), model:[humanCount: humanService.count()]
    }

    def show(Long id) {
        respond humanService.get(id)
    }

    def create() {
        respond new Human(params)
    }

    def save(Human human) {
        if (human == null) {
            notFound()
            return
        }

        try {
            humanService.save(human)
        } catch (ValidationException e) {
            respond human.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'human.label', default: 'Human'), human.id])
                redirect human
            }
            '*' { respond human, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond humanService.get(id)
    }

    def update(Human human) {
        if (human == null) {
            notFound()
            return
        }

        try {
            humanService.save(human)
        } catch (ValidationException e) {
            respond human.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'human.label', default: 'Human'), human.id])
                redirect human
            }
            '*'{ respond human, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        humanService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'human.label', default: 'Human'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'human.label', default: 'Human'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
