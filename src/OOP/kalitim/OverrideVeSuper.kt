package OOP.kalitim


fun main(args:Array<String>) {
    var girl = Girl()
    girl.displayAge(15)

    var girl2 = Girl()
    girl2.name = null
    println("Name ${girl2.name}")
}
open class Person(){
    open fun displayAge(age: Int){
        println("Age: $age")
    }
    open var name: String? = null
    get() = field
    set(value) {
        field = value
    }
}
class Girl:Person(){
    override fun displayAge(age: Int) {
        println("Age: $age")
    }

    override var name: String? = null
        get() = field
        set(value) {
            field=if (value == null) "No name" else value
        }
}

