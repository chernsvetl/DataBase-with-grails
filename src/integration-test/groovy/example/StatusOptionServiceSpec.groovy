package example

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class StatusOptionServiceSpec extends Specification {

    StatusOptionService statusOptionService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new StatusOption(...).save(flush: true, failOnError: true)
        //new StatusOption(...).save(flush: true, failOnError: true)
        //StatusOption statusOption = new StatusOption(...).save(flush: true, failOnError: true)
        //new StatusOption(...).save(flush: true, failOnError: true)
        //new StatusOption(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //statusOption.id
    }

    void "test get"() {
        setupData()

        expect:
        statusOptionService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<StatusOption> statusOptionList = statusOptionService.list(max: 2, offset: 2)

        then:
        statusOptionList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        statusOptionService.count() == 5
    }

    void "test delete"() {
        Long statusOptionId = setupData()

        expect:
        statusOptionService.count() == 5

        when:
        statusOptionService.delete(statusOptionId)
        sessionFactory.currentSession.flush()

        then:
        statusOptionService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        StatusOption statusOption = new StatusOption()
        statusOptionService.save(statusOption)

        then:
        statusOption.id != null
    }
}
