package example

class Brigade {

    String name
    Department department


    static constraints = {
        name blank: false, maxSize: 100, unique: true, nullable: false
        department nullable: false
    }
    static belongsTo = Department
    // добавить id работника, но как... если belongsTo ту-ту..
}
