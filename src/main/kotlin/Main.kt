fun main() {

//    println("############  Main Method: ############")
//
//    println("Hello!")
//
//    // val is immutable
//    val n1 = 10
//    val n2 : Float = 5.123f
//    val n3 : Double = 5.123
//    val n4 : Boolean = true
//    val name: String = "Meghana"
//    println(n1)
//    println(n2)
//    println(n3)
//    println(n4)
//    println(name)
//
//    // string templates
//    val greeting = "Hello, $name"
//    val complex = "Sum is ${5 + 3}"
//    println(greeting)
//    println(complex)
//
//    // var is mutable
//    var n5 = 8
//    println(n5)
//    n5 = 18
//    println(n5)
//
//    // for performing expression with in the print
//    val x = 12
//    println("Is x an even number? ${x % 2 == 0}")
//
//    val num1 = 12
//    val num2 = 14
//    val areBothEven = num1 % 2 == 0 || num2 % 2 == 0 && num1 + num2 == 25
//    // here && is always prioritized => num1 % 2 == 0 || (num2 % 2 == 0 && num1 + num2 == 25)
//    println("Is num1 an even number? $areBothEven")
//
//    // taking inout from user using a method
//    inputFromUser()
//
//     calling null safety method
//    nullSafety()

    // calling if conditions method
//    IfConditions()


    // calling when expressions
//    whenExpressions()

    // try, catch, finally, throw

    // arrays - immutable(we can change values in it but can't add or delete or change size
//    arrays()

    // loops - while,
//    loops()

//     iterables
//    println("Enter a string:")
//    val input = readln()
//    for (character in input) {
//        println(character)
//    }

//    // build string
//    val result = buildString {
//        append("Hello, ")
//        append("Meghana!")
//    }
//    println(result)

////     function call
//    val sum1: Int = sum(10,20)
//    val sum2 : Int = sum(10)  // takes default value for b
//    val sum3 : Int = sum(b=20) // takes default value for a
//    println("Sum = " + sum1)
//    // printing using string template operator
//    println("Sum =  $sum1")
//    println("Sum= $sum2")
//    println("Sum= $sum3")

////    extension function
//    println("Enter a String: ")
//    val string1 = readln()
//    println(string1.reverseString())

//    lambda functions
    lambdaFunctions()

}

fun sum(a: Int = 200, b: Int = 100): Int {

    println("############  Sum Method: ############")

    return a + b

}

// extension function -
fun String.reverseString() : String {
    val finalString = buildString {
        for(i in this@reverseString.lastIndex  downTo 0) {
        append (this@reverseString[i])
        }
    }
    return finalString
}