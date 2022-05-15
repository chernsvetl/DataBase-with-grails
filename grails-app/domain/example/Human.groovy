package example


class Human {

    String fullName
    Date birthday
    Gender gender
    Integer childrenNumber



    static constraints = {
        fullName  blank: false, size: 2..100
        birthday nullable: false
        gender blank: false, size: 2..10
        childrenNumber nullable: false
    }

}




