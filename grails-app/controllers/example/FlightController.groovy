package example

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class FlightController {

    FlightService flightService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond flightService.list(params), model:[flightCount: flightService.count()]
    }

    def show(Long id) {
        respond flightService.get(id)
    }

    def create() {
        respond new Flight(params)
    }

    def save(Flight flight) {
        if (flight == null) {
            notFound()
            return
        }

        try {
            flightService.save(flight)
        } catch (ValidationException e) {
            respond flight.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'flight.label', default: 'Flight'), flight.id])
                redirect flight
            }
            '*' { respond flight, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond flightService.get(id)
    }

    def update(Flight flight) {
        if (flight == null) {
            notFound()
            return
        }

        try {
            flightService.save(flight)
        } catch (ValidationException e) {
            respond flight.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'flight.label', default: 'Flight'), flight.id])
                redirect flight
            }
            '*'{ respond flight, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        flightService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'flight.label', default: 'Flight'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'flight.label', default: 'Flight'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
