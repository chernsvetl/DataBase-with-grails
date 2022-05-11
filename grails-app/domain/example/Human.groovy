package example


class Human {

    String fullName
    Date birthday
    String gender
    Integer childrenNumber

    //static OneToOne = Passenger
    //static OneToOne = HeadDepartment

    static constraints = {
        fullName  blank: false, size: 2..100
        birthday nullable: false
        gender nullable: false, size: 4..4
        childrenNumber nullable: false, min: 0
    }


}




