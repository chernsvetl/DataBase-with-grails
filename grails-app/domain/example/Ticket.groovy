package example

class Ticket {

    Passenger passengerId
    Flight flightId
    String status
    Boolean isLuggage
    Float price

    static constraints = {
        passengerId nullable: false
        flightId nullable: false
        status nullable: false, maxSize: 30
        isLuggage nullable: false
        price nullable: false
    }
    static belongsTo = Passenger
    /*
    static mapping = {
       passengerId cascade: 'all-delete-orphan'
   }

     */
}
