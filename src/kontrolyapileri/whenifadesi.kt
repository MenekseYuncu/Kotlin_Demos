package kontrolyapileri

fun main (args:Array<String>){
    /*
    * when (koşula tabi tutulacak değişken)
    * else (hiçbir koşul sağlanmadığında çalışılacak kodlar)*/

    /*var sayi =7
    when(sayi){
        1 -> println("sayi 1")
        2 -> println("sayı 2")
        5 -> println("sayı 5")
        else -> println("bilinmeyen sayı")

        var sayi =0
        var sonuc =when(sayi){
            0,1->"sıfır veya bir"
            else-> "bilinmeyen sayı"
        }
        println(sonuc)
     */
    var x=13
    when(x){
        in 1..10 -> println("1 ile 10 arasında")
        !in 1..10 -> println("1 ile 10 arasında değil")
    }
}