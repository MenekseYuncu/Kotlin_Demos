package donguler

fun main (args:Array<String>){
    /*While Döngüsü
     While (koşul) {
        //çalışılacak kodlar
     }

    var i =1
    while (i <= 10 ){
        println("kotlin")
        i++
    }


   //0 ile 100 arası çift sayılar
    var sayi =0
    while (sayi <=100){
        println(sayi)
        sayi+=2
    }
    0 ile 100 arasında tek sayıların toplamı

    var sayi =0
    var toplam =0
    while (sayi<= 100){
        if (sayi % 2 == 1){
            toplam = toplam + sayi // toplam += sayi
        }
        sayi++
    }
    println("tek sayıların toplamı = $toplam")
     */
    /*DO-While Döngüsü
      do {
      //çalışılacak kodlar
      }while (şart)
    //1 den 10 a kadar olan sayılaarın yazılmasıi

    var i = 1
    do {
        println(i)
        i++
    }while (i<11)

     */
    //kullanıcı adı ve şifre doğru girilene kadar ad ve şifre isteme

    var ad: String
    var sifre:String
    do {
        println("adınızı girin:")
        ad = readLine().toString()

        println("şifre giriniz:")
        sifre = readLine().toString()
    }while (ad != "kotlin" && sifre != "123")

    println("giriş başarılı")

}