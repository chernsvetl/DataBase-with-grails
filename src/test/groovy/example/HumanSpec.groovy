package example

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class HumanSpec extends Specification implements DomainUnitTest<Human> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
