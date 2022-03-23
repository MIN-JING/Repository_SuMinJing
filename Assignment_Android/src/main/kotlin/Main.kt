//fun main(args: Array<String>) {
//    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")
//}

class Human (private val name: String ) {
    fun attack() {
        println("$name use Fist Attack!")
    }
}
//${name}的錯誤: Don't use curly braces when inserting a simple variable into a string template. Use curly braces only for longer expressions.
//在字串範本中插入簡單變數不要使用大括號，大括號僅在較長運算式使用。
//Property 'name' could be private。
//name可以private ???
fun main() {
    val humanA = Human("Jack")
    humanA.attack()
}
//變數HumanA的錯誤: Local variable name 'HumanA' should start with a lowercase letter.
//局部變數建議以小寫首字母命名。
//Names of functions, properties and local variables start with a lowercase letter and use camel case and no underscores.
//函數、屬性、局部變數的名稱使用駝峰式大小寫、無下底線
