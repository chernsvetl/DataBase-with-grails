package example


class Repair {
    static belongsTo = [plane:Plane]
   //Plane plane

    Date startTime
    Date endTime

    static constraints = {

        startTime nullable: false, validator: { if (it != null && it.after(new Date())) return ["invalid date"] }
        endTime nullable: false, validator: { if (it != null && it.after(new Date())) return ["invalid date"] }
    }

    String toString() {
        return "$id"
    }

}
