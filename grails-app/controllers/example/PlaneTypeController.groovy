package example

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class PlaneTypeController {

    PlaneTypeService planeTypeService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond planeTypeService.list(params), model:[planeTypeCount: planeTypeService.count()]
    }

    def show(Long id) {
        respond planeTypeService.get(id)
    }

    def create() {
        respond new PlaneType(params)
    }

    def save(PlaneType planeType) {
        if (planeType == null) {
            notFound()
            return
        }

        try {
            planeTypeService.save(planeType)
        } catch (ValidationException e) {
            respond planeType.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'planeType.label', default: 'PlaneType'), planeType.id])
                redirect planeType
            }
            '*' { respond planeType, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond planeTypeService.get(id)
    }

    def update(PlaneType planeType) {
        if (planeType == null) {
            notFound()
            return
        }

        try {
            planeTypeService.save(planeType)
        } catch (ValidationException e) {
            respond planeType.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'planeType.label', default: 'PlaneType'), planeType.id])
                redirect planeType
            }
            '*'{ respond planeType, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        planeTypeService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'planeType.label', default: 'PlaneType'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'planeType.label', default: 'PlaneType'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
