package example


class MedicalExamination {

    Employee employee
    Date medicalExamination
    Boolean isPassed

    static constraints = {

        employee nullable: false
        medicalExamination nullable: false
        isPassed nullable: false
    }

    String toString(){
        id
    }
}
