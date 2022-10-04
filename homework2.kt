//Exercise#1
fun main() {
    for (number in 0..100) {
        if (number == 71) {
            println("IT'S OVER 70!!!")
        } else {
            println(number)
        }
    }
}
//Exercise#2
fun main() {
    var temperature = 35

    while (temperature > 10){

        when(temperature){
            30 -> {
                println("Its Hot")
            }
            20 -> {
                println("Its Comfy")
            }
            15 -> {
                println("Its Cold")
            }
            else -> {
                println(temperature)
            }
        }
        temperature--
    }
}