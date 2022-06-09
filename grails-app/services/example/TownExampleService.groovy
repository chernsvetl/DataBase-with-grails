package example

import grails.gorm.services.Service

@Service(TownExample)
interface TownExampleService {

    TownExample get(Serializable id)

    List<TownExample> list(Map args)

    Long count()

    void delete(Serializable id)

    TownExample save(TownExample townExample)

}