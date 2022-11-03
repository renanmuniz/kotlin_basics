class User (var firstName: String = "", var lastName: String = ""){

    //Executa primeiro o construtor default que está na "assinatura" da classe.
    //e depois executas os blocos de inicialização.

    init {
        println("This is a initializer block!")
        println("")
    }

    constructor(firstName: String): this(firstName, "") {
        this.firstName = firstName
        println("another constructor")
    }

    fun printFullName() {
        println("$firstName $lastName")
    }

    fun updateFirstName(newName: String) {
        firstName = newName
    }

    fun firstNameLenght() {
        println(firstName.length)
    }
}