package example

class Department {


    String name
    HeadDepartment headDepartment


    static constraints = {
        name unique: true, blank: false, size: 2..100
        headDepartment nullable: false, unique: true // or not unique
    }

    /*
    static mapping = {
        headDepartment cascade: 'all-delete-orphan'
    }

     */
   // static belongsTo = example.Brigade
}
