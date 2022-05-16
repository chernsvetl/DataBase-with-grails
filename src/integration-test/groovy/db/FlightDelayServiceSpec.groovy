package db

import example.FlightDelay
import example.FlightDelayService
import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class FlightDelayServiceSpec extends Specification {

    FlightDelayService flightDelayService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new example.FlightDelay(...).save(flush: true, failOnError: true)
        //new example.FlightDelay(...).save(flush: true, failOnError: true)
        //example.FlightDelay flightDelay = new example.FlightDelay(...).save(flush: true, failOnError: true)
        //new example.FlightDelay(...).save(flush: true, failOnError: true)
        //new example.FlightDelay(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //flightDelay.id
    }

    void "test get"() {
        setupData()

        expect:
        flightDelayService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<FlightDelay> flightDelayList = flightDelayService.list(max: 2, offset: 2)

        then:
        flightDelayList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        flightDelayService.count() == 5
    }

    void "test delete"() {
        Long flightDelayId = setupData()

        expect:
        flightDelayService.count() == 5

        when:
        flightDelayService.delete(flightDelayId)
        sessionFactory.currentSession.flush()

        then:
        flightDelayService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        FlightDelay flightDelay = new FlightDelay()
        flightDelayService.save(flightDelay)

        then:
        flightDelay.id != null
    }
}
