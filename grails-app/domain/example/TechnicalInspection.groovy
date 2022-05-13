package example

import java.sql.Timestamp

class TechnicalInspection {

    Plane planeId
    Timestamp inspectionTime
    Boolean isExecutedInspection

    /*     id bigserial primary key,
    plane_id bigint 	not null references plane on delete cascade,
    inspection_time timestamp not null,
    is_executed_inspection boolean not null

     */
    static constraints = {
        planeId nullable: false
        inspectionTime nullable: false
        isExecutedInspection nullable: false
    }
}
