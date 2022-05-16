package db

import example.Passenger
import example.PassengerService
import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class PassengerServiceSpec extends Specification {

    PassengerService passengerService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new example.Passenger(...).save(flush: true, failOnError: true)
        //new example.Passenger(...).save(flush: true, failOnError: true)
        //example.Passenger passenger = new example.Passenger(...).save(flush: true, failOnError: true)
        //new example.Passenger(...).save(flush: true, failOnError: true)
        //new example.Passenger(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //passenger.id
    }

    void "test get"() {
        setupData()

        expect:
        passengerService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Passenger> passengerList = passengerService.list(max: 2, offset: 2)

        then:
        passengerList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        passengerService.count() == 5
    }

    void "test delete"() {
        Long passengerId = setupData()

        expect:
        passengerService.count() == 5

        when:
        passengerService.delete(passengerId)
        sessionFactory.currentSession.flush()

        then:
        passengerService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Passenger passenger = new Passenger()
        passengerService.save(passenger)

        then:
        passenger.id != null
    }
}
