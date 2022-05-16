package db

import example.Brigade
import example.BrigadeService
import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class BrigadeServiceSpec extends Specification {

    BrigadeService brigadeService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new example.Brigade(...).save(flush: true, failOnError: true)
        //new example.Brigade(...).save(flush: true, failOnError: true)
        //example.Brigade brigade = new example.Brigade(...).save(flush: true, failOnError: true)
        //new example.Brigade(...).save(flush: true, failOnError: true)
        //new example.Brigade(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //brigade.id
    }

    void "test get"() {
        setupData()

        expect:
        brigadeService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Brigade> brigadeList = brigadeService.list(max: 2, offset: 2)

        then:
        brigadeList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        brigadeService.count() == 5
    }

    void "test delete"() {
        Long brigadeId = setupData()

        expect:
        brigadeService.count() == 5

        when:
        brigadeService.delete(brigadeId)
        sessionFactory.currentSession.flush()

        then:
        brigadeService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Brigade brigade = new Brigade()
        brigadeService.save(brigade)

        then:
        brigade.id != null
    }
}
