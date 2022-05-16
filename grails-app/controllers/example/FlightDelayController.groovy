package example

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class FlightDelayController {

    FlightDelayService flightDelayService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond flightDelayService.list(params), model:[flightDelayCount: flightDelayService.count()]
    }

    def show(Long id) {
        respond flightDelayService.get(id)
    }

    def create() {
        respond new FlightDelay(params)
    }

    def save(FlightDelay flightDelay) {
        if (flightDelay == null) {
            notFound()
            return
        }

        try {
            flightDelayService.save(flightDelay)
        } catch (ValidationException e) {
            respond flightDelay.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'flightDelay.label', default: 'FlightDelay'), flightDelay.id])
                redirect flightDelay
            }
            '*' { respond flightDelay, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond flightDelayService.get(id)
    }

    def update(FlightDelay flightDelay) {
        if (flightDelay == null) {
            notFound()
            return
        }

        try {
            flightDelayService.save(flightDelay)
        } catch (ValidationException e) {
            respond flightDelay.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'flightDelay.label', default: 'FlightDelay'), flightDelay.id])
                redirect flightDelay
            }
            '*'{ respond flightDelay, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        flightDelayService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'flightDelay.label', default: 'FlightDelay'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'flightDelay.label', default: 'FlightDelay'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
