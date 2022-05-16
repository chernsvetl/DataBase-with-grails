package example

import grails.gorm.services.Service

@Service(PlaneType)
interface PlaneTypeService {

    PlaneType get(Serializable id)

    List<PlaneType> list(Map args)

    Long count()

    void delete(Serializable id)

    PlaneType save(PlaneType planeType)

}