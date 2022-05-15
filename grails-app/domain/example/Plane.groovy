package example

class Plane {

    PlaneType typeId
    Brigade technicalBrigade
    Brigade pilotBrigade
    Brigade serviceBrigade
    Date startUsingDate

    static constraints = {
        typeId nullable: false
        technicalBrigade nullable: false
        pilotBrigade nullable: false
        serviceBrigade nullable: false
        startUsingDate nullable: false
    }
    /*
    static ManyToOne = example.PlaneType
    static ManyToOne = example.Brigade

     */
}
