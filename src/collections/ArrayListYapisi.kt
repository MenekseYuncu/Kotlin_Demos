package collections

fun main (args:Array<String>){
    /*var list = listOf<String>("kotlin","java","Asp.net","phyton","Ruby") //Immutable sabit
    //list[2] = "CSharp" //eleman değiştirilmez ,silinmez,eklenmez

    for (i in  list) println(i)

    for (i in 0..list.size-1) println(list[i])

     */

    var list= mutableListOf<String>("kotlin","java","Asp.net","phyton","Ruby")
    println("------ilk hali------")
    for (i in list) println(i)

    println()
    println("------Eleman Değiştirme-----")
    list[2]= "CSharp"
    for (i in list) println(i)

    println()
    println("-----Eleman ekleme-----")
    list.add("JavaScript")
    for (i in list) println(i)

    println()
    println("-----Eleman ismine göre silme ----")
    list.remove(element = "java")
    for (i in  list) println(i)

    println()
    println("----Eleman index değerine göre silme-----")
    list.removeAt(index = 0)
    for (i in list) println(i)
}