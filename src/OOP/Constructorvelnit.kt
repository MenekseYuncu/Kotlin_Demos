package OOP

fun main(args:Array<String>){
    var p = Person(name = "Menekşe",age = 21)
    var p2= Person(name = "Mina")
    var  p3 = Person(age = 13)

    var user = User(firstName = "Menekşe",userAge = 21)



}
class Person(var name: String? =null,age: Int? = null){
}

class User(firstName: String,userAge: Int){
    var  name: String? = null
    var age: Int? = null

    init {
        name = firstName.capitalize()
        age = userAge

        println("First Name: $name" )
        println("Age: $age")

    }

}