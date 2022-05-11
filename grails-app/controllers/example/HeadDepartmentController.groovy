package example

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class HeadDepartmentController {

    HeadDepartmentService headDepartmentService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond headDepartmentService.list(params), model:[headDepartmentCount: headDepartmentService.count()]
    }

    def show(Long id) {
        respond headDepartmentService.get(id)
    }

    def create() {
        respond new HeadDepartment(params)
    }

    def save(HeadDepartment headDepartment) {
        if (headDepartment == null) {
            notFound()
            return
        }

        try {
            headDepartmentService.save(headDepartment)
        } catch (ValidationException e) {
            respond headDepartment.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'headDepartment.label', default: 'HeadDepartment'), headDepartment.id])
                redirect headDepartment
            }
            '*' { respond headDepartment, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond headDepartmentService.get(id)
    }

    def update(HeadDepartment headDepartment) {
        if (headDepartment == null) {
            notFound()
            return
        }

        try {
            headDepartmentService.save(headDepartment)
        } catch (ValidationException e) {
            respond headDepartment.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'headDepartment.label', default: 'HeadDepartment'), headDepartment.id])
                redirect headDepartment
            }
            '*'{ respond headDepartment, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        headDepartmentService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'headDepartment.label', default: 'HeadDepartment'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'headDepartment.label', default: 'HeadDepartment'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
