package example

class Gender {

    String name

    static constraints = {
        name blank: false, size: 2..12, unique: true
    }

    String toString(){
        name
    }
}
