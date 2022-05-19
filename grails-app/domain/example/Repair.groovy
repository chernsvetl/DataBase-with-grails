package example


class Repair {
    static belongsTo = [plane:Plane]

    Date startTime
    Date endTime

    static constraints = {

        startTime nullable: false
        endTime nullable: false
    }

    String toString(){
        id
    }
}
