package example

import grails.gorm.services.Service

@Service(Passenger)
interface PassengerService {

    Passenger get(Serializable id)

    List<Passenger> list(Map args)

    Long count()

    void delete(Serializable id)

    Passenger save(Passenger passenger)

}