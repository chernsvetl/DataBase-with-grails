package example

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class TechnicalInspectionController {

    TechnicalInspectionService technicalInspectionService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond technicalInspectionService.list(params), model:[technicalInspectionCount: technicalInspectionService.count()]
    }

    def show(Long id) {
        respond technicalInspectionService.get(id)
    }

    def create() {
        respond new TechnicalInspection(params)
    }

    def save(TechnicalInspection technicalInspection) {
        if (technicalInspection == null) {
            notFound()
            return
        }

        try {
            technicalInspectionService.save(technicalInspection)
        } catch (ValidationException e) {
            respond technicalInspection.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'technicalInspection.label', default: 'TechnicalInspection'), technicalInspection.id])
                redirect technicalInspection
            }
            '*' { respond technicalInspection, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond technicalInspectionService.get(id)
    }

    def update(TechnicalInspection technicalInspection) {
        if (technicalInspection == null) {
            notFound()
            return
        }

        try {
            technicalInspectionService.save(technicalInspection)
        } catch (ValidationException e) {
            respond technicalInspection.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'technicalInspection.label', default: 'TechnicalInspection'), technicalInspection.id])
                redirect technicalInspection
            }
            '*'{ respond technicalInspection, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        technicalInspectionService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'technicalInspection.label', default: 'TechnicalInspection'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'technicalInspection.label', default: 'TechnicalInspection'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
