package db

import example.MedicalExamination
import example.MedicalExaminationService
import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class MedicalExaminationServiceSpec extends Specification {

    MedicalExaminationService medicalExaminationService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new example.MedicalExamination(...).save(flush: true, failOnError: true)
        //new example.MedicalExamination(...).save(flush: true, failOnError: true)
        //example.MedicalExamination medicalExamination = new example.MedicalExamination(...).save(flush: true, failOnError: true)
        //new example.MedicalExamination(...).save(flush: true, failOnError: true)
        //new example.MedicalExamination(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //medicalExamination.id
    }

    void "test get"() {
        setupData()

        expect:
        medicalExaminationService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<MedicalExamination> medicalExaminationList = medicalExaminationService.list(max: 2, offset: 2)

        then:
        medicalExaminationList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        medicalExaminationService.count() == 5
    }

    void "test delete"() {
        Long medicalExaminationId = setupData()

        expect:
        medicalExaminationService.count() == 5

        when:
        medicalExaminationService.delete(medicalExaminationId)
        sessionFactory.currentSession.flush()

        then:
        medicalExaminationService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        MedicalExamination medicalExamination = new MedicalExamination()
        medicalExaminationService.save(medicalExamination)

        then:
        medicalExamination.id != null
    }
}
