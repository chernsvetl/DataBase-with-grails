package example

import grails.gorm.services.Service

@Service(Repair)
interface RepairService {

    Repair get(Serializable id)

    List<Repair> list(Map args)

    Long count()

    void delete(Serializable id)

    Repair save(Repair repair)

}