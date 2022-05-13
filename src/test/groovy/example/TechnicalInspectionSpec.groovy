package example

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class TechnicalInspectionSpec extends Specification implements DomainUnitTest<TechnicalInspection> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
