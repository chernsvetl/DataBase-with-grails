package example

class Department {


   String name
    HeadDepartment headDepartment

    static constraints = {
        name unique: true, blank: false, size: 2..100
        headDepartment nullable: false, unique: true // or not unique
    }
    static belongsTo = HeadDepartment
    // начальники - Employee (сделать связь, однако таблицы создаются одновременно)
}
