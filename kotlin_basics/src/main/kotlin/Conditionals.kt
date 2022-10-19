fun main() {
    var calories = 2500
    if(calories > 2000) {
        println("You've cosnsumed all your calories for the day")
    }

    calories = 1900
    if(calories > 2000) {
        println("You've consumed all your calories for the day")
    } else {
        println("You've not consumed all your calories for the day")
    }


    val age = 9
    if(age > 10)
        println("is greater than 10")
    else
        println("is less than 10")
    println("this is out of the if scope")


    var bool1: Boolean = true
    var bool2: Boolean = false

    if(bool1 && bool2)
        println("Statement is true - 1")

    if(bool1 && !bool2)
        println("Statement is true - 2")

    if(bool1 || bool2)
        println("Statement is true - 3")

    if(!bool1 || bool2)
        println("Statement is true - 4")


    //Igualdades estruturais
    // == equal
    // != inequality
    println("Igualdades estruturais")
    var name1 = "Renan"
    var name2 = "Muniz"
    println(name1 == name2) //false

    name2 = "Renan"
    println(name1 == name2) //true



    //Igualdades referenciais
    println("Igualdades referenciais")
    var a = Person("Renan")
    var b = Person("Muniz")

    println(a === b) //false
    println(a !== b) //true




}

class Person (var name: String)