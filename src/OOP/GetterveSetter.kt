package OOP

fun main(args:Array<String>) {
    var user1 = Users()
    user1.actualAge = 15
    user1.age = 15
    println("user1 actual Age: ${user1.actualAge}")
    println("user1 Age: ${user1.age}")

    var user2 = Users()
    user2.actualAge = 35
    user2.age = 35
    println("user2 actual Age: ${user2.actualAge}")
    println("user2 Age: ${user2.age}")



}
class Users{
    var age: Int = 0
    get() = field
    set(value) {
        field = if (value < 18)
            18
        else if (value >= 18 && value <=30)
            value
        else
            value - 3
    }
    var actualAge: Int = 0
}