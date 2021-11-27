package donguler

// Girilen sayıya kadar olan asal sayıları bulma
fun main (args: Array<String>){
    var ustSinir : Int
    var bolensayi:Int
    println("üst sınırı giriiz:")
    ustSinir = readLine()!!.toInt()

    for (i in 2..ustSinir){
        bolensayi = 0

        for (j in 1..i){
            if (i % j ==0) bolensayi++
        }
        if (bolensayi == 2) println(i)
    }

}