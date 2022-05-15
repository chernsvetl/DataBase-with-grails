package example

class Brigade {

    String name
    Department department



    static constraints = {
        name blank: false, maxSize: 100, unique: true, nullable: false
        department nullable: false

    }
    //static mapping = {
      //  id column: 'code', type: 'integer'
   // }
/*
    static mapping = {
        department cascade: 'all-delete-orphan'
    }

 */
}
