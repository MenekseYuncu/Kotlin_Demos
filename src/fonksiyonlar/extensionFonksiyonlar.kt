package fonksiyonlar

fun main (args: Array<String>){
  //  var sonuc = triple(sayi = 5)
    //println(sonuc)

    println(5.triple())
    println(10.triple())


    println("kotlin" .reversed()) //yazılan şeylerin tersten yazılmasını sağlar

    var list = arrayListOf("kotlin","java","c#","javascript")
    for (item in list) println(item)
    list.swap(x = 0,y = 3)

    println()
    for (item in list) println(item)
}

//fun triple(sayi: Int): Int = sayi * 3

fun Int.triple() =this*3

fun ArrayList<String>.swap(x: Int,y: Int){
    val temp = this[x]
    this[x]=this[y]
    this[y] = temp
}