package example

import grails.gorm.services.Service

@Service(StatusOption)
interface StatusOptionService {

    StatusOption get(Serializable id)

    List<StatusOption> list(Map args)

    Long count()

    void delete(Serializable id)

    StatusOption save(StatusOption statusOption)

}