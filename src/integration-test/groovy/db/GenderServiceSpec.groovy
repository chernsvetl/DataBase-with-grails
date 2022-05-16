package db

import example.Gender
import example.GenderService
import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class GenderServiceSpec extends Specification {

    GenderService genderService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new example.Gender(...).save(flush: true, failOnError: true)
        //new example.Gender(...).save(flush: true, failOnError: true)
        //example.Gender gender = new example.Gender(...).save(flush: true, failOnError: true)
        //new example.Gender(...).save(flush: true, failOnError: true)
        //new example.Gender(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //gender.id
    }

    void "test get"() {
        setupData()

        expect:
        genderService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Gender> genderList = genderService.list(max: 2, offset: 2)

        then:
        genderList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        genderService.count() == 5
    }

    void "test delete"() {
        Long genderId = setupData()

        expect:
        genderService.count() == 5

        when:
        genderService.delete(genderId)
        sessionFactory.currentSession.flush()

        then:
        genderService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Gender gender = new Gender()
        genderService.save(gender)

        then:
        gender.id != null
    }
}
