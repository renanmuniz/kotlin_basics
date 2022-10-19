fun main() {
    println("Hello World Kotlin!")

    //Variables:
    var fullname = "Donn Felker"
    println(fullname)

    fullname = "John felker"
    println(fullname)

    println(fullname.isEmpty()) //false

    //var para variaveis que podem trocar de valores.
    //val para variaveis que nao trocam de valores.

    val naoMudaValor = 10
    //naoMudaValor = 20 "val cannot be assigned"
    println(naoMudaValor) //10
    println(naoMudaValor.inc()) //11
    println(naoMudaValor) //10

//    fullname = 10 //Nao aceita pois ao criar foi atribuido uma String, entao nao muda mais seu tipo.

    println(fullname::class) //String
    println(naoMudaValor::class) //int

    val preco: Double = 10.5
    println(preco)
    println(preco::class) //double

    //val preco2: Double = "10.5" //Type mismatch. Required:    Double    Found:    String

    val myByte = 8 //8-bit sogned integer
    val myShort: Short = 16 //16-bit signed integer
    val myInt: Int = 32 //32-bit signed integer
    val myLong: Long = 64 //64-bit signed integer

    // decimals
    val myFloat: Float = 32.00F //32-bit floating point number
    val myDouble: Double = 64.00 //64-bit floating point number

    println(myByte.toDouble()::class) //double
    println(myByte.toLong()::class) //long

    //var bigLong  //Erro! This variable must either have a type annotation or be initialized
    var bigLong: Long
    bigLong = 10
    println(bigLong) //10
    println(bigLong::class) //long

    val newInt = myInt + 100
    println(newInt)  //132

    val newInt2 = myInt.plus(100)
    println(newInt2)  //132


    var name: String = "ReNaN"
    println(name.length) //5
    println(name.replaceFirstChar { it.lowercase() }) //reNaN
    println(name.lowercase()) //renan

    val c: Char = 'x'  //16-bit Unicode Character
    println(c) //c
    println(c::class) //char

    var message = "Hello World!\nThis is a Kotlin course!"
    println(message)
//    Hello World!
//    This is a Kotlin course!


    // Dá pra fazer assim tbm:
    message = """
        Olá!
        Esse é um curso de Kotlin!
        Bem-vindo!
    """.trimIndent()
    println(message)
//    Olá!
//    Esse é um curso de Kotlin!
//    Bem-vindo!


    name = "Renan"
    var age = 32

    println("Hello $name! Your age is: $age and your name is ${name.length} long")
    //Hello Renan! Your age is: 32 and your name is 5 long


    //Boolean

    var isBlank: Boolean = false

    println(isBlank) //false
    println(isBlank.not()) //true
    println(!isBlank.not()) //false

    isBlank = "notBlank".isBlank()
    println(isBlank) //false

    isBlank = "".isBlank()
    println(isBlank) //true
























}