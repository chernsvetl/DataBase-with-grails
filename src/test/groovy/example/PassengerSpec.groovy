package example

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class PassengerSpec extends Specification implements DomainUnitTest<Passenger> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
