package example

class Brigade {

    static hasOne = [employee:Employee]
    static belongsTo = [department:Department]

    String name

    static constraints = {
        name blank: false, maxSize: 500, unique: true, nullable: false
        employee nullable: true
    }

  String toString(){
        name
    }

}
