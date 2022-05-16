package db

import example.PlaneType
import example.PlaneTypeService
import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class PlaneTypeServiceSpec extends Specification {

    PlaneTypeService planeTypeService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new example.PlaneType(...).save(flush: true, failOnError: true)
        //new example.PlaneType(...).save(flush: true, failOnError: true)
        //example.PlaneType planeType = new example.PlaneType(...).save(flush: true, failOnError: true)
        //new example.PlaneType(...).save(flush: true, failOnError: true)
        //new example.PlaneType(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //planeType.id
    }

    void "test get"() {
        setupData()

        expect:
        planeTypeService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<PlaneType> planeTypeList = planeTypeService.list(max: 2, offset: 2)

        then:
        planeTypeList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        planeTypeService.count() == 5
    }

    void "test delete"() {
        Long planeTypeId = setupData()

        expect:
        planeTypeService.count() == 5

        when:
        planeTypeService.delete(planeTypeId)
        sessionFactory.currentSession.flush()

        then:
        planeTypeService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        PlaneType planeType = new PlaneType()
        planeTypeService.save(planeType)

        then:
        planeType.id != null
    }
}
