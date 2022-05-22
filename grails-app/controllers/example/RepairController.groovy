package example

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class RepairController {

    RepairService repairService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond repairService.list(params), model:[repairCount: repairService.count()]
    }

    def show(Long id) {
        respond repairService.get(id)
    }

    def create() {
        respond new Repair(params)
    }

    def save(Repair repair) {
        if (repair == null) {
            notFound()
            return
        }

        try {
            repairService.save(repair)
        } catch (ValidationException e) {
            respond repair.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'repair.label', default: 'Repair'), repair.id])
                redirect repair
            }
            '*' { respond repair, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond repairService.get(id)
    }

    def update(Repair repair) {
        if (repair == null) {
            notFound()
            return
        }

        try {
            repairService.save(repair)
        } catch (ValidationException e) {
            respond repair.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'repair.label', default: 'Repair'), repair.id])
                redirect repair
            }
            '*'{ respond repair, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        repairService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'repair.label', default: 'Repair'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'repair.label', default: 'Repair'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
