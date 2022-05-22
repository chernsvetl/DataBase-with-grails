package example

import grails.gorm.services.Service

@Service(Town)
interface TownService {

    Town get(Serializable id)

    List<Town> list(Map args)

    Long count()

    void delete(Serializable id)

    Town save(Town town)

}