package example


class Human {

    String fullName
    Date birthday
    Gender gender
    Integer childrenNumber

    //static OneToOne = Passenger
    //static OneToOne = HeadDepartment

    static constraints = {
        fullName  blank: false, size: 2..100
        birthday nullable: false
        gender blank: false, size: 2..10
        childrenNumber nullable: false, min: 0
    }

}




