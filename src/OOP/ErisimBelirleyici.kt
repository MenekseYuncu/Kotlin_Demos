package OOP

/*
 public -> Herkese açık. Tüm sınıflar erişebilir .
 private -> Sadece kendi sınıflarından erişim sağlanabilir .
 protected -> Kendi sınıfı ve alt sııflarından erişebilir
 internal -> Sadece kendi modülünden erişim*/

fun main(args:Array<String>) {

}
class  PublicClass{
    val i = 1
    fun func(){
        var pc = PrivateClass()
       // pc.a


    }
}
private class PrivateClass{
    private val a =0
    private fun privatefunch(){}
}

open class A{
    protected val b =2
}
class B: A(){
    fun getMethod()= b
}
class C{
    fun getValue(){
        var a = A()

    }
}