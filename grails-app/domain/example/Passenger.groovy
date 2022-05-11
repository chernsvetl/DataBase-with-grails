package example

class Passenger {
    Human human
    //static belongsTo = Human

    static constraints = {
        //human unique: true
    }
    static belongsTo = Human
}
