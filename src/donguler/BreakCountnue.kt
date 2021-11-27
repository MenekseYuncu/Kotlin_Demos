package donguler

fun main (args:Array<String>){
    //BREAK
    /*for (i in 1..5){
        if ( i==5){
            break
        }
        println(i)
    }
    var sayi : Int
    var toplam= 0

    while (true){
        println("sayı gir:")
        sayi = readLine()!!.toInt()

        if (sayi == 0) break

        toplam += sayi
    }
    println("toplam= $toplam")

     */
    //COUNTİNUE
    /*
    for (i in 1..5){
        println("$i döngü başladı")
        if (i>1 && i<5 ) continue
        println("$i döngü sonu")
    }*/

    // girilen 5 adet sayıdan sadece pozitif olanları toplayan program

    var sayi :Int
    var toplam=0

    for (i in 1..5){
        println("sayı gir:")
        sayi = readLine()!!.toInt()

        if (sayi <= 0) continue
        toplam += sayi
    }
    println("toplam = $toplam")
}

