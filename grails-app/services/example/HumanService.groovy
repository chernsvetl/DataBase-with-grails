package example

import grails.gorm.services.Service

@Service(Human)
interface HumanService {

    Human get(Serializable id)

    List<Human> list(Map args)

    Long count()

    void delete(Serializable id)

    Human save(Human human)

}