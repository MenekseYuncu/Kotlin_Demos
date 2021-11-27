package collections

/*
  Array : mutable (sabit)
  Collections

  Immutable (read only)
  1. Immutable List -> listOf
  2. Immutable Map -> mapOf
  3. Immutable Set -> setOf

  Mutable (read and write)
  1. Mutable list -> Arraylist,arraylistOf,mutableListOf
  2. Mutable map -> HashMap,hashMapOf,mutableMapOf
  3. Mutable set -> mutableSetOf,hashSetOf
  */

fun main (args:Array<String>){
    var array =Array<Int>(size = 5) {0} //bütün içerik değerleri 0 oldu
    var array2 = arrayOf(1,2,3)
    println(array2[2])
    array2[0]= 20
    println(array2[0])

    for (i in array2) println(i)

}