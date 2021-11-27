package collections


fun main (args:Array<String>){
    // Set: Verileri unique (tek) olarak barındıran yapı

    //ımmutable Set
    /*var set = setOf<Int>(1,2,3,4,5,6,7,8,9,9,9,10)
    println(set.size)

     */
    var set2 = mutableSetOf<Int>(1,2,3,4,5,6,7,8,9,9,9,10)
    set2.add(12)
    set2.add(12)

    for (i in  set2) println(i)

    set2.remove(element = 5) // silmek

    println()
    for (i in set2) println(i)

    var set3 = hashSetOf<Int>(1,2,3,4,5,6,7,8,9,9,9,10)
    println()
    for (i in set2) println(i)

}