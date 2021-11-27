package donguler

fun main (args:Array<String>){
    1..5 //1,2,3,4,5
    6..20 //6,7,8,9,,,20

    1.rangeTo(other= 10) //1,2,3,4,5,,7,8,9,10

    5 downTo 1 //5,4,3,2,1
    7 downTo 2 //7,6,,,,2
    10.downTo(to = 1) //10,9,8,7,,,,,1

    5 downTo 1 step 2 //5,3,1 ikişer azaltma
}