fun main() {


    println(addNumbers(5, 3))
    var result = addNumbers(5, 3)
    println(addNumbers2(result))

    println("-------------------------------")
    println(sum(2.0,2.0))
    println(sum(5.0,5.0, "*"))
    println("-------------------------------")
    print("Mashael")
    println("-------------------------------")
    println(multi(3,9))
}

    fun addNumbers(num1: Int, num2: Int): Boolean {
        return num1 > num2

    }
    fun addNumbers2(n: Boolean): Boolean {
        return !n
    }
    fun sum(n1: Double, n2: Double, s: String = "+"){
        when(s){
            "+" -> {
                println(n1 + n2)
            }
            "-" -> {
                println(n1 - n2)
            }
            "*" -> {
                println(n1 * n2)
            }
            "/" -> {
                println(n1 / n2)
            }
            else -> {
                println("Please insert only except operations")
            }
        }

    }
    fun print(s: String){
        println(s)
    }
    fun multi(n1: Int, n2: Int): Int{
        return n1 * n2
    }

