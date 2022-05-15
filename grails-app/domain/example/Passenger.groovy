package example

class Passenger {
    Human human


    static hasMany = [tickets: Ticket]
    /*
    static mapping = {
        tickets cascade: 'all-delete-orphan'
    }

     */
    //static hasMany = [ticketId:example.Ticket]
    //static ManyToOne = [human:example.Human]
    //static belongsTo = [human:example.Human]
    static constraints = {

    }

}
