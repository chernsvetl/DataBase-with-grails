package db

import example.Flight
import example.FlightService
import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class FlightServiceSpec extends Specification {

    FlightService flightService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new example.Flight(...).save(flush: true, failOnError: true)
        //new example.Flight(...).save(flush: true, failOnError: true)
        //example.Flight flight = new example.Flight(...).save(flush: true, failOnError: true)
        //new example.Flight(...).save(flush: true, failOnError: true)
        //new example.Flight(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //flight.id
    }

    void "test get"() {
        setupData()

        expect:
        flightService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Flight> flightList = flightService.list(max: 2, offset: 2)

        then:
        flightList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        flightService.count() == 5
    }

    void "test delete"() {
        Long flightId = setupData()

        expect:
        flightService.count() == 5

        when:
        flightService.delete(flightId)
        sessionFactory.currentSession.flush()

        then:
        flightService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Flight flight = new Flight()
        flightService.save(flight)

        then:
        flight.id != null
    }
}
