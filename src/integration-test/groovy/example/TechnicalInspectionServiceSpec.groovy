package example

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class TechnicalInspectionServiceSpec extends Specification {

    TechnicalInspectionService technicalInspectionService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new TechnicalInspection(...).save(flush: true, failOnError: true)
        //new TechnicalInspection(...).save(flush: true, failOnError: true)
        //TechnicalInspection technicalInspection = new TechnicalInspection(...).save(flush: true, failOnError: true)
        //new TechnicalInspection(...).save(flush: true, failOnError: true)
        //new TechnicalInspection(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //technicalInspection.id
    }

    void "test get"() {
        setupData()

        expect:
        technicalInspectionService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<TechnicalInspection> technicalInspectionList = technicalInspectionService.list(max: 2, offset: 2)

        then:
        technicalInspectionList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        technicalInspectionService.count() == 5
    }

    void "test delete"() {
        Long technicalInspectionId = setupData()

        expect:
        technicalInspectionService.count() == 5

        when:
        technicalInspectionService.delete(technicalInspectionId)
        sessionFactory.currentSession.flush()

        then:
        technicalInspectionService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        TechnicalInspection technicalInspection = new TechnicalInspection()
        technicalInspectionService.save(technicalInspection)

        then:
        technicalInspection.id != null
    }
}
