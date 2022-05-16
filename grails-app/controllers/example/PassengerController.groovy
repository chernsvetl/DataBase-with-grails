package example

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class PassengerController {

    PassengerService passengerService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond passengerService.list(params), model:[passengerCount: passengerService.count()]
    }

    def show(Long id) {
        respond passengerService.get(id)
    }

    def create() {
        respond new Passenger(params)
    }

    def save(Passenger passenger) {
        if (passenger == null) {
            notFound()
            return
        }

        try {
            passengerService.save(passenger)
        } catch (ValidationException e) {
            respond passenger.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'passenger.label', default: 'Passenger'), passenger.id])
                redirect passenger
            }
            '*' { respond passenger, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond passengerService.get(id)
    }

    def update(Passenger passenger) {
        if (passenger == null) {
            notFound()
            return
        }

        try {
            passengerService.save(passenger)
        } catch (ValidationException e) {
            respond passenger.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'passenger.label', default: 'Passenger'), passenger.id])
                redirect passenger
            }
            '*'{ respond passenger, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        passengerService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'passenger.label', default: 'Passenger'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'passenger.label', default: 'Passenger'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
