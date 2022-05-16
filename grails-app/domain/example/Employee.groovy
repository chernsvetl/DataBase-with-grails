package example

class Employee {

    Human employee
    Brigade brigadeId
    Date startWorkExperience
    Integer salary

    static constraints = {
        employee nullable: false
        brigadeId nullable: false
        startWorkExperience nullable: false
        salary min  : 1
    }
    //static belongsTo = example.Brigade


}
