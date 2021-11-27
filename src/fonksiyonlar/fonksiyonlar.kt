package fonksiyonlar

/*
* fonksiyonlar
* 1-Parametreli -Parametresiz
* 2-Dönüş değerli olan -olmayan
* */

fun main (args:Array<String>){
    messageYaz("Selam")

    var mesaj = getMessage()
    println(mesaj)

    var nameLastName= getName(name = "Menekse",lastName = "Yüncü")
    println(nameLastName)
}
/*
  fun fonksiyonAdi(parametreler){
   //Çalışılacak kodlar
   )
* */
fun helloWorld(){
    println("hello world")
}
fun helloWorld2() = println("hello world 2")

fun messageYaz(message:String){
    println("Mesajınız: $message")
}
fun getMessage():String{
    return "welcome"
}
fun getMessage2():String = "welcome"

fun getName(name:String,lastName:String):String = "Adınız: $name Soyadınız: $lastName"

fun myFunc(): Unit = println("Fonksiyon Çalıştı")