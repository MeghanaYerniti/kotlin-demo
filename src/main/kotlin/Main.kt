fun main() {
    println("Hello!")

    // val is immutable
    val n1 = 10
    val n2 : Float = 5.123f
    val n3 : Double = 5.123
    val n4 : Boolean = true
    val name: String = "Meghana"
    println(n1)
    println(n2)
    println(n3)
    println(n4)
    println(name)

    // string templates
    val greeting = "Hello, $name"
    val complex = "Sum is ${5 + 3}"
    println(greeting)
    println(complex)

    // var is mutable
    var n5 = 8
    println(n5)
    n5 = 18
    println(n5)

// function call
    val sum1: Int = sum(10,20)
    println("Sum = " + sum1)
    // printing using string template operator
    println("Sum =  $sum1")

    // for performing expression with in the print
    val x = 12
    println("Is x an even number? ${x % 2 == 0}")

    val num1 = 12
    val num2 = 14
    val areBothEven = num1 % 2 == 0 || num2 % 2 == 0 && num1 + num2 == 25
    // here && is always prioritized => num1 % 2 == 0 || (num2 % 2 == 0 && num1 + num2 == 25)
    println("Is num1 an even number? $areBothEven")

}
