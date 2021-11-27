package OOP.dataclass

fun main(args:Array<String>) {
    val person = Person(name = "Ali",age = 23)
    println("name = ${person.name}.age = ${person.age}")

    println("name = ${person.component1()}, age = ${person.component2()}")

    val person2 = person.copy(name = "Emre")
    println("name = ${person2.name}.age = ${person2.age}")
    println(person2.toString())

    val  person3 = person2.copy()

    println("person hashcode = ${person.hashCode()}")
    println("person2 hashcode = ${person2.hashCode()}")
    println("person3 hashcode = ${person3.hashCode()}")

    if (person.equals(person2)) println("person eşittir person2")
    else println("person eşit değil person2")

    if (person2.equals(person3)) println("person2 eşittir person3")
    else println("person2 eşit değil person3")

}

data class  Person(var name: String,var age: Int)