package donguler

fun main (args:Array<String>){
   /*disdongu@ for (i in 1..3){
       icdongu@ for (j in 1..5){
            println("i = $i; j = $j")

            if (i == 2) break@disdongu
        }
    }

    */

    disdongu@ for (i in 1..4){
        icdongu@ for (j in 1..5){
            println("i = $i; j = $j ")

            if ( i == 2) continue@disdongu
        }
    }

}