package example

class Department {

    static hasMany = [brigades:Brigade]
    String name
    Human headDepartment


    static constraints = {
       name unique: true, blank: false, size: 2..100
        headDepartment nullable: false, unique: true
    }

    String toString(){
        name
    }
}
