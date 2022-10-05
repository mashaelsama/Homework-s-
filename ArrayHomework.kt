fun main() {
var numbers = arrayListOf<Double>(2.2, 5.67, 9.99, 2.34, 5.5)
var sum = 0.0
for(i in numbers){
    sum += i
}

var result = sum / numbers.size
println(result)
}