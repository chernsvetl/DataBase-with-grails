package example

class Employee {

static belongsTo = [brigade:Brigade]
    Human humanId
    Date startWorkExperience
    Integer salary

    static constraints = {
        humanId nullable: false, unique: true
        startWorkExperience nullable: false
        salary min  : 1, nullable: false
        brigade nullable: false
    }

    String toString(){
        id
    }

}
