open class Human(val name:String){
    open fun attack(){
        println("$name use Fist Attack!")
    }
}

class Mage(name:String): Human(name){
    override fun attack(){
        println("$name use Fireball!")
    }
}
fun main(){
    Human("Jack").attack()
}