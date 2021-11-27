package OOP.soyutlama

fun main(args:Array<String>) {
    guneGoreHesapla(Gunler.PAZARTESİ, deger = 100)
    println(Renk.MAVİ)
    println(Renk.KIRMIZI)
    println(Renk.YESİL)
    println(Gunler.PAZAR)
}

fun guneGoreHesapla(gun: Gunler, deger: Int ):Int =
    when (gun){
        Gunler.PAZARTESİ ->  deger + 6
        Gunler.SALİ -> deger * 5
        Gunler.CARSAMBA -> deger
        Gunler.PERSEMBE -> deger * deger
        Gunler.CUMA -> deger - 2
        Gunler.CUMARTESİ -> deger - 5
        Gunler.PAZAR -> deger +10
        else -> -1

    }


enum class Gunler {
    PAZARTESİ, SALİ, CARSAMBA, PERSEMBE, CUMA, CUMARTESİ, PAZAR
}
enum class Renk(val rgb: Int){
    KIRMIZI (0xFF0000),
    YESİL ( 0x00FF00),
    MAVİ (0x0000FF)

}