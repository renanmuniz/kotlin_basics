fun main() {
    var name: String = "Renan"
//    name = null  //Cannot set null for default in kotlin

    var name2: String? = "Renan"
    name2 = null //Using ? after the type allow to set null
    println(name2)

    var age: Int = 32
//    age = null

    var age2: Int? = 32
    age2 = null

    var person = Person("Renan")
//    person = null

    var person2: Person? = Person("Renan")
    person2 = null

    println(name.length) //5
    println(name2?.length) //null
    name2 = "Renan"
    println(name2?.length) //5

    //Elvis operator

    var lastName: String? = "Renan Muniz"
    var length: Int = if (lastName != null) lastName.length else 0
    println(length) //11

    var length2: Int = lastName?.length ?: 0
    println(length2) //11

    lastName = null
    var length3: Int = lastName?.length ?: 0
    println(length3) //0

}