package example

import grails.gorm.services.Service

@Service(FlightDelay)
interface FlightDelayService {

    FlightDelay get(Serializable id)

    List<FlightDelay> list(Map args)

    Long count()

    void delete(Serializable id)

    FlightDelay save(FlightDelay flightDelay)

}