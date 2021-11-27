package collections


fun main(args:Array<String>){
    //Map : verileri anahtar - deger ikileriyle tutar.
     var map = mapOf<Int,String>() // ımmutable ,sabit eleman
    var map2 = mapOf<Int,String>()
    for (anahtar in map2.keys) println("anahtar: $anahtar Değer: ${map2[anahtar]}")
}