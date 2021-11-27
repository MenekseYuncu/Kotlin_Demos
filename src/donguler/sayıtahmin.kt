package donguler

import java.util.*

// sayı tahmin uygulaması
fun main (args:Array<String>){
    /*for (i in 1..5) {
        var rastgele = Random()
        var sayi = rastgele.nextInt(5) +1
        println(sayi)
    }

     */
    var rastgele = Random()
    var sayi = rastgele.nextInt(100) +1
    var tahmin :Int
    var sayac = 1

    while (true){
        println("tahmin et :")
        tahmin = readLine()!!.toInt()

        if (tahmin > sayi) {
            println("Sayıyı Küçültün")
            sayac++
        }else if (tahmin< sayi){
            println("sayıyı büyültün")
            sayac++
        }else if (tahmin == sayi){
            println("tebrikler $sayac seferde doğru")
            break
        }


    }
}