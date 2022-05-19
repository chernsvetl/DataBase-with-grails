package example

class Flight {

    static belongsTo = [plane:Plane]
    static hasMany = [passengers:Passenger, tickets:Ticket]

    StatusOption statusFlight
    Town townId
    Date flightTime
    Boolean isCancelled
    Boolean isDepartureAbroad

    static constraints = {
        statusFlight blank: false, size: 2..12
        townId nullable: false
        flightTime nullable: false
        isCancelled nullable: false
        isDepartureAbroad nullable: false
        tickets nullable: true
        passengers nullable: true
    }

    String toString(){
       id
    }

}
