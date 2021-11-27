package OOP.kalitim

fun main(args:Array<String>) {
    var otomobil = Otomobil()
    otomobil.model = 2020
    otomobil.calisma()

    println("Aracın modeli: ${otomobil.model}")

    var arac = Arac()
    arac.renk = "siyah"
    arac.yavaslama()
    println("Aracın rengi: ${arac.renk}")
}

open class Arac(var renk: String? = null,var model: Int? = null){
    fun calisma() = println("Araç çalışıyor")
    fun hizlanma() = println("Araç hızlanıyor")
    fun yavaslama() = println("Araç yavaşlıyor")

}
open class TekerlekliArac(var tekerlek: Boolean = true):Arac(){

}
class Otomobil: TekerlekliArac(){

}