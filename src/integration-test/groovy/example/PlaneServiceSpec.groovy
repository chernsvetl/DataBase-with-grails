package example

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class PlaneServiceSpec extends Specification {

    PlaneService planeService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Plane(...).save(flush: true, failOnError: true)
        //new Plane(...).save(flush: true, failOnError: true)
        //Plane plane = new Plane(...).save(flush: true, failOnError: true)
        //new Plane(...).save(flush: true, failOnError: true)
        //new Plane(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //plane.id
    }

    void "test get"() {
        setupData()

        expect:
        planeService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Plane> planeList = planeService.list(max: 2, offset: 2)

        then:
        planeList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        planeService.count() == 5
    }

    void "test delete"() {
        Long planeId = setupData()

        expect:
        planeService.count() == 5

        when:
        planeService.delete(planeId)
        sessionFactory.currentSession.flush()

        then:
        planeService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Plane plane = new Plane()
        planeService.save(plane)

        then:
        plane.id != null
    }
}
