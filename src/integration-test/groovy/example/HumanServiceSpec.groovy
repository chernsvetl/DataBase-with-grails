package example

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class HumanServiceSpec extends Specification {

    HumanService humanService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new example.Human(...).save(flush: true, failOnError: true)
        //new example.Human(...).save(flush: true, failOnError: true)
        //example.Human human = new example.Human(...).save(flush: true, failOnError: true)
        //new example.Human(...).save(flush: true, failOnError: true)
        //new example.Human(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //human.id
    }

    void "test get"() {
        setupData()

        expect:
        humanService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Human> humanList = humanService.list(max: 2, offset: 2)

        then:
        humanList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        humanService.count() == 5
    }

    void "test delete"() {
        Long humanId = setupData()

        expect:
        humanService.count() == 5

        when:
        humanService.delete(humanId)
        sessionFactory.currentSession.flush()

        then:
        humanService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Human human = new Human()
        humanService.save(human)

        then:
        human.id != null
    }
}
