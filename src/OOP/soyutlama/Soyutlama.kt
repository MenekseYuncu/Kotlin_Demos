package OOP.soyutlama
/*Soyutlama
 1-Soyut sınıftan nesne türetilmez
 2-Eğer bir sınıfın içerisinde soyut bir metod varsa mutlaka o sınıfta soyut olmalıdır.
 3-Soyut sınıflardan soyut alt sınıflar türetilebilir.
  Bu durumda üst sınıfın soyut metodunu override etmek zorunda değildir. */
fun main(args:Array<String>) {
    var ahmet = Ogretmen(ad = "Ahmet")
    ahmet.isTanimi(isTanimi = "Matematik öğretmeni")
    ahmet.yasGoster(yas = 25)
}
abstract class Kisi(ad: String){
    init {
        println("Ad: $ad")
    }
    fun yasGoster(yas: Int){
        println("Yaş: $yas")
    }
    abstract fun isTanimi(isTanimi: String)
}
class Ogretmen(ad:String):Kisi(ad){
    override fun isTanimi(isTanimi: String) {
        println(isTanimi)
    }
}