package OOP


class ClassName{
    //property
    //methods
}

fun main(args:Array<String>) {
    var lamp =Lamp()
    lamp.isOn = true
    lamp.turOn()
    lamp.turnOff()

    var lamp2 = Lamp()
    lamp2.isOn

    var araba = Araba()
    araba.model = 2017
    araba.renk = "siyah"
    araba.calisma()
    araba.hizlanma()

}

class Lamp{
    var isOn: Boolean= false

    fun turOn(){
        isOn = true
    }
    fun  turnOff(){
        isOn = false
    }
}