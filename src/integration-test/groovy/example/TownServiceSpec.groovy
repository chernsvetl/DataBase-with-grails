package example

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class TownServiceSpec extends Specification {

    TownService townService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new example.Town(...).save(flush: true, failOnError: true)
        //new example.Town(...).save(flush: true, failOnError: true)
        //example.Town town = new example.Town(...).save(flush: true, failOnError: true)
        //new example.Town(...).save(flush: true, failOnError: true)
        //new example.Town(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //town.id
    }

    void "test get"() {
        setupData()

        expect:
        townService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Town> townList = townService.list(max: 2, offset: 2)

        then:
        townList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        townService.count() == 5
    }

    void "test delete"() {
        Long townId = setupData()

        expect:
        townService.count() == 5

        when:
        townService.delete(townId)
        sessionFactory.currentSession.flush()

        then:
        townService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Town town = new Town()
        townService.save(town)

        then:
        town.id != null
    }
}
