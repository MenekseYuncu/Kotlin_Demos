package OOP.kalitim

fun main(args:Array<String>) {
    var ogretmen = Ogretmen(name = "Ali",age = 25)
    ogretmen.dersVerme()

    println()

    var futbolcu = Futbolcu(name = "Mehmet",age = 22)
    futbolcu.futbolOynama()

    println()
    var isAdamı = IsAdamı(name = "Veli",age = 35)
    isAdamı.calisma()


}
open class  Kisi(var name: String, var age: Int){
    init {
        println("Ad: $name")
        println("Yaş: $age")
    }
}
class Ogretmen(name: String,age: Int): Kisi(name,age){
    fun dersVerme() = println("$name ders veriyor")
}
class  Futbolcu(name: String,age: Int):Kisi(name,age){
    fun futbolOynama() = println("$name futbol oynuyor")
}
class IsAdamı(name: String,age: Int): Kisi(name,age){
    fun calisma() = println("$name çalışıyor")
}

