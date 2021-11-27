package fonksiyonlar

fun main (args:Array<String>){
    //var sonuc = topla (sayi1 = 5,sayi2 = 6)
   // println(sonuc)
       var sonuc = hesapla(sayi1 = 3,sayi2 = 8,islem = "*")
    println(sonuc)
}
fun topla(sayi1: Int,sayi2: Int): Int = sayi1 + sayi2
fun cikar(sayi1: Int,sayi2: Int): Int = sayi1 - sayi2
fun carp(sayi1: Int,sayi2: Int): Int = sayi1 * sayi2
fun bol(sayi1: Int,sayi2: Int): Int = sayi1 / sayi2

fun hesapla(sayi1: Int,sayi2: Int,islem:String):Int = when (islem){
    "+"-> sayi1 +sayi2
    "-"-> sayi1 -sayi2
    "*"-> sayi1 *sayi2
    "/"-> sayi1 -sayi2
    else -> 0

}