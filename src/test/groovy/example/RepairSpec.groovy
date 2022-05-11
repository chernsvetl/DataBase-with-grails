package example

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class RepairSpec extends Specification implements DomainUnitTest<Repair> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
