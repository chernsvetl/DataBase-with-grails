package example

class MedicalExamination {

    Employee employeeId
    Date medicalExamination
    Boolean isPassed

    static constraints = {

    employeeId nullable: false
        medicalExamination nullable: false
        isPassed nullable: false


    }
}
