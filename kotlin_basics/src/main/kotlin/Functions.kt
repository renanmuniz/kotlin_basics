fun main() {
    sayHi()

    helloWorld("Renan")

    var result: Int = sum(2,3)
    println(result)

    //Pode-se noemar os parametros para melhor identificar ou passar em ordens diferentes:
    var result2: Int = sum(n2=2,n1=3)
    println(result2)

    //Parametros com valor default nao prcisam ser passados, a nao seu que deseje mudar seu valor.
    var result3: Int = sum(n1=2,n2=3, multiply = 2)
    println(result3)

    printBookInfo("Kotlin for beginners", "martin")
    printBookInfo("Kotlin for beginners", "martin", "john")
    printBookInfo("Kotlin for beginners", "martin", "john", "Susan")
    printBookInfo("Kotlin for beginners", "martin", "john","Susan", "Kevin")
    printBookInfo("Kotlin for beginners")


}

fun sayHi() = println("Hi!")

fun helloWorld(name: String) {
    println("Hello World")
    welcomeToKotlin(name)
}

fun welcomeToKotlin(name: String) {
    println("Welcome to Kotlin $name!")
}

fun sum(n1: Int, n2: Int, multiply: Int = 1): Int {
    return (n1 + n2) * multiply
}

//function overloading

fun printBookInfo(title: String, author: String) {
    println("$title - Author: $author")
}

fun printBookInfo(title: String, author: String, author2: String) {
    println("$title - Authors: $author, $author2")
}

//using varargs

fun printBookInfo(title: String, vararg authors: String) {
    println("$title - Authors: $authors") //isso imprime a informacao do objet varargs "[Ljava.lang.String;@a09ee92"
    println("$title - Authors:")
    authors.forEach { print("$it, ") }
}


