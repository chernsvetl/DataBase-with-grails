package example

class TechnicalInspection {

    static belongsTo = [plane:Plane]
    Date inspectionTime
    Boolean isExecutedInspection


    static constraints = {

        inspectionTime nullable: false
        isExecutedInspection nullable: false
    }

    String toString(){
       id
    }
}
