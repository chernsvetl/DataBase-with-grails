package example

class Plane {

    static hasMany = [flights:Flight, technicalInspections:TechnicalInspection, repairs:Repair]
    static belongsTo = [planeType:PlaneType]

    Brigade technicalBrigade
    Brigade pilotBrigade
    Brigade serviceBrigade
    Date startUsingDate

    static constraints = {
        planeType nullable: false
        technicalBrigade nullable: false
        pilotBrigade nullable: false
        serviceBrigade nullable: false
        startUsingDate nullable: false
        flights nullable: true
        repairs nullable: true
        technicalInspections nullable: true
    }

   String toString(){
     id
    }
}
