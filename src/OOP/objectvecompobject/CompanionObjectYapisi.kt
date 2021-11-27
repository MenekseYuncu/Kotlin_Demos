package OOP.objectvecompobject

fun main(args:Array<String>) {
    val user = User()
    user.Funch()
    user.name

    User.callMe()
    User.age
}

class User{
    var name: String? = null

    companion object{
        var age: Int = 20
        fun callMe() = println("called")
    }
    fun Funch() = println("function")
}