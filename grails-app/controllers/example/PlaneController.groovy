package example

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class PlaneController {

    PlaneService planeService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond planeService.list(params), model:[planeCount: planeService.count()]
    }

    def show(Long id) {
        respond planeService.get(id)
    }

    def create() {
        respond new Plane(params)
    }

    def save(Plane plane) {
        if (plane == null) {
            notFound()
            return
        }

        try {
            planeService.save(plane)
        } catch (ValidationException e) {
            respond plane.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'plane.label', default: 'Plane'), plane.id])
                redirect plane
            }
            '*' { respond plane, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond planeService.get(id)
    }

    def update(Plane plane) {
        if (plane == null) {
            notFound()
            return
        }

        try {
            planeService.save(plane)
        } catch (ValidationException e) {
            respond plane.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'plane.label', default: 'Plane'), plane.id])
                redirect plane
            }
            '*'{ respond plane, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        planeService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'plane.label', default: 'Plane'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'plane.label', default: 'Plane'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
