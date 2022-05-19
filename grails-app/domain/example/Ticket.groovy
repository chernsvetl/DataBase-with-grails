package example

class Ticket {

    static belongsTo = [passenger:Passenger,flights: Flight]

    StatusOption status
    Boolean isLuggage
    Float price


    static constraints = {

        status blank: false, size: 2..10
        isLuggage nullable: false
        price nullable: false
        passenger nullable: true
    }

    String toString(){
      id
    }

}
