package example

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class HeadDepartmentServiceSpec extends Specification {

    HeadDepartmentService headDepartmentService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new HeadDepartment(...).save(flush: true, failOnError: true)
        //new HeadDepartment(...).save(flush: true, failOnError: true)
        //HeadDepartment headDepartment = new HeadDepartment(...).save(flush: true, failOnError: true)
        //new HeadDepartment(...).save(flush: true, failOnError: true)
        //new HeadDepartment(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //headDepartment.id
    }

    void "test get"() {
        setupData()

        expect:
        headDepartmentService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<HeadDepartment> headDepartmentList = headDepartmentService.list(max: 2, offset: 2)

        then:
        headDepartmentList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        headDepartmentService.count() == 5
    }

    void "test delete"() {
        Long headDepartmentId = setupData()

        expect:
        headDepartmentService.count() == 5

        when:
        headDepartmentService.delete(headDepartmentId)
        sessionFactory.currentSession.flush()

        then:
        headDepartmentService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        HeadDepartment headDepartment = new HeadDepartment()
        headDepartmentService.save(headDepartment)

        then:
        headDepartment.id != null
    }
}
