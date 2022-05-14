package example

import org.hibernate.mapping.ManyToOne

class Passenger {
    Human human
    //static hasMany = [ticketId:Ticket]
    //static ManyToOne = [human:Human]
    //static belongsTo = [human:Human]
    static constraints = {

    }
}
