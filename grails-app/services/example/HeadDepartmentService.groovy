package example

import grails.gorm.services.Service

@Service(HeadDepartment)
interface HeadDepartmentService {

    HeadDepartment get(Serializable id)

    List<HeadDepartment> list(Map args)

    Long count()

    void delete(Serializable id)

    HeadDepartment save(HeadDepartment headDepartment)

}