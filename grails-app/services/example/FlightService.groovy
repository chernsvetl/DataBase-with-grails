package example

import grails.gorm.services.Service

@Service(Flight)
interface FlightService {

    Flight get(Serializable id)

    List<Flight> list(Map args)

    Long count()

    void delete(Serializable id)

    Flight save(Flight flight)

}