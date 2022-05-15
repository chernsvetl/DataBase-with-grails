package example

import java.sql.Timestamp

class Repair {

    Plane planeId
    Timestamp startTime
    Timestamp endTime

    static constraints = {
        planeId nullable: false
        startTime nullable: false
        endTime nullable: false
    }
}
