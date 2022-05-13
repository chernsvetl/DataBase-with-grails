package example

import java.sql.Timestamp

class Flight {

    String type
    Plane planeId
    Town townId
    Timestamp flightTime
    Boolean isCancelled
    Boolean isDepartureAbroad

    static constraints = {
        type nullable: false, maxSize: 30
        planeId nullable: false
        townId nullable: false
        flightTime nullable: false
        isCancelled nullable: false
        isDepartureAbroad nullable: false
    }
}
