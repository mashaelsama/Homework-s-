fun main() {
var numbers = arrayListOf<Int>(1, 2, 3,4, 5)
var sum = 0
for(i in numbers){
    sum += i
}

var result = sum / numbers.size
println(result)
}