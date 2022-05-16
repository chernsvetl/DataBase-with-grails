package example

import grails.gorm.services.Service

@Service(Plane)
interface PlaneService {

    Plane get(Serializable id)

    List<Plane> list(Map args)

    Long count()

    void delete(Serializable id)

    Plane save(Plane plane)

}