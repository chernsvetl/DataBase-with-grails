package example

class Employee {

    Human employeeId
    Brigade brigadeId
    Date startWorkExperience
    Integer salary

    static constraints = {
        employeeId nullable: false
        brigadeId nullable: false
        startWorkExperience nullable: false
        salary min  : 1
    }
    //static belongsTo = example.Brigade


}
