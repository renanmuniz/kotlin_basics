fun main() {

    var user = User("firstName", "lastName")
    user.printFullName()
    user.firstName = "Donn"
    user.lastName = "Felker"

    var friend = User("firstName", "lastName")
    friend.printFullName()
    friend.firstName = "Jane"
    friend.lastName = "Doe"

    var neighboor = User("Albert")
    neighboor.printFullName()

    user.printFullName()
    friend.printFullName()

    user.updateFirstName("John")
    user.printFullName()
    user.firstNameLenght()





}

