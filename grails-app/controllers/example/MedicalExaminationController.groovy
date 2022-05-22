package example

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class MedicalExaminationController {

    MedicalExaminationService medicalExaminationService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond medicalExaminationService.list(params), model:[medicalExaminationCount: medicalExaminationService.count()]
    }

    def show(Long id) {
        respond medicalExaminationService.get(id)
    }

    def create() {
        respond new MedicalExamination(params)
    }

    def save(MedicalExamination medicalExamination) {
        if (medicalExamination == null) {
            notFound()
            return
        }

        try {
            medicalExaminationService.save(medicalExamination)
        } catch (ValidationException e) {
            respond medicalExamination.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'medicalExamination.label', default: 'MedicalExamination'), medicalExamination.id])
                redirect medicalExamination
            }
            '*' { respond medicalExamination, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond medicalExaminationService.get(id)
    }

    def update(MedicalExamination medicalExamination) {
        if (medicalExamination == null) {
            notFound()
            return
        }

        try {
            medicalExaminationService.save(medicalExamination)
        } catch (ValidationException e) {
            respond medicalExamination.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'medicalExamination.label', default: 'MedicalExamination'), medicalExamination.id])
                redirect medicalExamination
            }
            '*'{ respond medicalExamination, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        medicalExaminationService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'medicalExamination.label', default: 'MedicalExamination'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'medicalExamination.label', default: 'MedicalExamination'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
