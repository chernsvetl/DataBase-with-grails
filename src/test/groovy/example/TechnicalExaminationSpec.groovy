package example

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class TechnicalExaminationSpec extends Specification implements DomainUnitTest<TechnicalExamination> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
