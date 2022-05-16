package db

import example.Repair
import example.RepairService
import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class RepairServiceSpec extends Specification {

    RepairService repairService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new example.Repair(...).save(flush: true, failOnError: true)
        //new example.Repair(...).save(flush: true, failOnError: true)
        //example.Repair repair = new example.Repair(...).save(flush: true, failOnError: true)
        //new example.Repair(...).save(flush: true, failOnError: true)
        //new example.Repair(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //repair.id
    }

    void "test get"() {
        setupData()

        expect:
        repairService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Repair> repairList = repairService.list(max: 2, offset: 2)

        then:
        repairList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        repairService.count() == 5
    }

    void "test delete"() {
        Long repairId = setupData()

        expect:
        repairService.count() == 5

        when:
        repairService.delete(repairId)
        sessionFactory.currentSession.flush()

        then:
        repairService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Repair repair = new Repair()
        repairService.save(repair)

        then:
        repair.id != null
    }
}
