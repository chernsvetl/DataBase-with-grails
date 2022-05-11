package example

class Town {
    String name
    Integer distance

    static constraints = {
     name nullable: false, blank: false, maxSize: 50
     distance nullable: false
    }
}
