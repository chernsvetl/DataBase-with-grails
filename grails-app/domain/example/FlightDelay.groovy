package example

class FlightDelay {

    Flight flightId
    String delayReason

    static constraints = {
       delayReason nullable: false, maxSize: 50
    }
    static belongsTo = Flight  // right?
}
