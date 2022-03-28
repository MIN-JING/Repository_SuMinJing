open class Human(open val name: String) {
    open fun attack() {
        println("$name use Fist Attack!")
    }
}
//${name}的錯誤: Don't use curly braces when inserting a simple variable into a string template. Use curly braces only for longer expressions.
//在字串範本中插入簡單變數不要使用大括號，大括號，即Lambda表達式，僅在較長運算式使用。
//Property 'name' could be private。
//val name可以private ?

class Mage(name: String, private val hasMana: Boolean) : Human(name) {
    override fun attack() {
        println("$name use Fireball!")
    }
    fun manaTest() {
        if (!hasMana){
            println("$name 's mana is empty!")
        } else {
            println("$name has the mana!")
        }
    }
}
//因為子類別Mage要從超類別Human繼承name的String宣告，name 需為public，不需在超類別private name。

fun main() {
    Human("Jack").attack()
    Mage("Rose", false).attack()
    Mage("Rose", false).manaTest()
}
//錯誤: Local variable name 'HumanA' should start with a lowercase letter.
//局部變數建議以小寫首字母命名。
//Names of functions, properties and local variables start with a lowercase letter and use camel case and no underscores.
//函數、屬性、局部變數的名稱使用駝峰式大小寫、無下底線。