package example

class Passenger {

    Human humanId

    static hasOne = [tickets:Ticket]

    static constraints = {
        tickets nullable: true
    }

    String toString(){
     humanId
    }
}
