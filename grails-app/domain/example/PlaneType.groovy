package example

class PlaneType {

    static hasMany = [plains:Plane]
    String name
    Integer capacity
    Integer speed

    static constraints = {
        name blank: false, nullable: false, maxSize: 50
        capacity nullable: false
        speed nullable: false

    }
     String toString(){
        name
    }
}
