package degiskenler

fun main (args:Array<String>){
    var a:String?=null
    println(a?.length)

    //operatörler
    //Atama operatörü
    var x=5
    var y=10
    println(x)
    println(y)

    x=y
    println(x)
    println(y)

    //aritmetik operatörler
    var z=5
    z++  //z+=2 ile z=+2 aynı şey
    println(z)

    //ilişkisel operatörler
    //<,>,<=,>=,==,!=(!= eişt değil mi )true or false seklinde gelir
    var b:Int=6
    var c:Int=9
    println(b<c)

    //Mantıkasal operatörler
    //(&& ve demek ikisinden biri false ise cevap false)
    //(|| veya demek ikisinden biri true ise cevap true)

    var q= true
    var t= false
    println(q || t)
    println(q && t)

    // Birleştirme operatörleri

    var dersAdi: String= "kotlin"
    var dersAdi2:String="Java"

    println("$dersAdi dersleri")
    println("${dersAdi2.length} uzunluğunda")
}