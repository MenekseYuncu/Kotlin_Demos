package OOP.objectvecompobject

fun main(args:Array<String>){
    var result = MyObject.multiple(x = 2,y = 6)
    println(result)
    MyObject.a
    MyObject.b
    println(Math.min(20,30))

    val person = object :Person(){
        override fun writeCode() {
            println("ı dont want write code. ı'm not a programmer ")
        }
    }
    person.eat()
    person.talk()
    person.writeCode()
    println(person.javaClass)

    val person2 = Person()
    println(person2.javaClass)
}

object  ObjectExample {
    //property
    //metod
}

object  MyObject{
    var a: Int = 0
    var b: Int = 2

    fun multiple(x:Int ,y: Int):Int = x * y
}

open class Person(){
    fun eat() = println("eating food")
    fun  talk()= println("Talking people")

    open fun writeCode() = println("writing code")
}