package example

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class StatusOptionController {

    StatusOptionService statusOptionService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond statusOptionService.list(params), model:[statusOptionCount: statusOptionService.count()]
    }

    def show(Long id) {
        respond statusOptionService.get(id)
    }

    def create() {
        respond new StatusOption(params)
    }

    def save(StatusOption statusOption) {
        if (statusOption == null) {
            notFound()
            return
        }

        try {
            statusOptionService.save(statusOption)
        } catch (ValidationException e) {
            respond statusOption.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'statusOption.label', default: 'StatusOption'), statusOption.id])
                redirect statusOption
            }
            '*' { respond statusOption, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond statusOptionService.get(id)
    }

    def update(StatusOption statusOption) {
        if (statusOption == null) {
            notFound()
            return
        }

        try {
            statusOptionService.save(statusOption)
        } catch (ValidationException e) {
            respond statusOption.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'statusOption.label', default: 'StatusOption'), statusOption.id])
                redirect statusOption
            }
            '*'{ respond statusOption, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        statusOptionService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'statusOption.label', default: 'StatusOption'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'statusOption.label', default: 'StatusOption'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
