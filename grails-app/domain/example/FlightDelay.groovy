package example

class FlightDelay {

    String delayReason
    Flight flight

    static constraints = {
        delayReason nullable: false, maxSize: 50
    }
    static belongsTo = Flight  // right?
}
