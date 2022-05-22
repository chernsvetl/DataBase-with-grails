package example

import grails.gorm.services.Service

@Service(Brigade)
interface BrigadeService {

    Brigade get(Serializable id)

    List<Brigade> list(Map args)

    Long count()

    void delete(Serializable id)

    Brigade save(Brigade brigade)

}