package example

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class TownExampleServiceSpec extends Specification {

    TownExampleService townExampleService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new TownExample(...).save(flush: true, failOnError: true)
        //new TownExample(...).save(flush: true, failOnError: true)
        //TownExample townExample = new TownExample(...).save(flush: true, failOnError: true)
        //new TownExample(...).save(flush: true, failOnError: true)
        //new TownExample(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //townExample.id
    }

    void "test get"() {
        setupData()

        expect:
        townExampleService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<TownExample> townExampleList = townExampleService.list(max: 2, offset: 2)

        then:
        townExampleList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        townExampleService.count() == 5
    }

    void "test delete"() {
        Long townExampleId = setupData()

        expect:
        townExampleService.count() == 5

        when:
        townExampleService.delete(townExampleId)
        sessionFactory.currentSession.flush()

        then:
        townExampleService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        TownExample townExample = new TownExample()
        townExampleService.save(townExample)

        then:
        townExample.id != null
    }
}
