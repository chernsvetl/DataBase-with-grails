package example

import java.sql.Timestamp

class Repair {

    Plane planeId
    Timestamp startTime
    Timestamp endTime
    /*    id bigserial primary key,
    plane_id bigint	not null references plane on delete cascade,
    start_time timestamp not null,
    end_time timestamp not null

     */
    static constraints = {
        planeId nullable: false
        startTime nullable: false
        endTime nullable: false
    }
}
