package example

import grails.gorm.services.Service

@Service(TechnicalInspection)
interface TechnicalInspectionService {

    TechnicalInspection get(Serializable id)

    List<TechnicalInspection> list(Map args)

    Long count()

    void delete(Serializable id)

    TechnicalInspection save(TechnicalInspection technicalInspection)

}