fun main() {

    println("############  Main Method: ############")

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

    // for performing expression with in the print
    val x = 12
    println("Is x an even number? ${x % 2 == 0}")

    val num1 = 12
    val num2 = 14
    val areBothEven = num1 % 2 == 0 || num2 % 2 == 0 && num1 + num2 == 25
    // here && is always prioritized => num1 % 2 == 0 || (num2 % 2 == 0 && num1 + num2 == 25)
    println("Is num1 an even number? $areBothEven")

    // taking inout from user using a method
    inputFromUser()

//     calling null safety method
    nullSafety()

//     calling if conditions method
    IfConditions()


//     calling when expressions
    whenExpressions()

//     try, catch, finally, throw

//     arrays - immutable(we can change values in it but can't add or delete or change size
    arrays()

//     loops - while,
    loops()

//     iterables
    println("Enter a string:")
    val input = readln()
    for (character in input) {
        println(character)
    }

    // build string
    val result = buildString {
        append("Hello, ")
        append("Meghana!")
    }
    println(result)

//     function call
    val sum1: Int = sum(10,20)
    val sum2 : Int = sum(10)  // takes default value for b
    val sum3 : Int = sum(b=20) // takes default value for a
    println("Sum = " + sum1)
    // printing using string template operator
    println("Sum =  $sum1")
    println("Sum= $sum2")
    println("Sum= $sum3")

//    extension function
    println("Enter a String: ")
    val string1 = readln()
    println(string1.reverseString())

//    lambda functions
    lambdaFunctions()

//    varargs - allows a function to accept 0 or more arguments of the same type.
    println(sumAll(1, 2))
    println(sumAll(1, 2, 3, 4))
    println(sumAll())
    val arr = intArrayOf(1, 2, 3)
    println(sumAll(*arr)) // spread operator → unpacks array into separate arguments.

//    class, interface, abstract class, open class

//    sealed interface, sealed class
//    All subclasses must be known at compile time, All subclasses must be in the same file, Useful for representing fixed types, like states, results, errors
//    no need to write else for when expression bcz all cls are known at compile time only, for type-safe

//    enum classes - value of the enum values is always defined before compile time, this differ enum from sealed class
    println(greetMe(Country.USA))
    for(country in Country.entries) {
        println(country.code)
    }

//    Singleton - Globally accessible, Only one object exists; Used for managers, helpers, database connections, configuration, etc.
    Logger.log("Application started")
    Logger.log("Something happened")

    println(Config.appName)
    Config.version = "2.0"
    println(Config.version)

//    generics
    val favoriteNumbers = intArrayOf(1, 2, 3, 69)
    val helloWorld = "Hello world!"
    val evenNumbers = favoriteNumbers.filter { it % 2 == 0 }
    val lettersOnly = helloWorld.filter { it.isLetter() }

    val stringList = listOf("Meghana", "Arjun", "Ram")
    val integers = listOf(1,2,3,4)
    val filteredStrings = stringList.myFilter{ currentString -> currentString.length > 3 }
    val filteredNumbers = integers.myFilter { currentNumber -> currentNumber > 3 }
    println(filteredStrings)
    println(filteredNumbers)

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

fun sumAll(vararg numbers: Int): Int { // varargs should be last parameter of the function
    var sum = 0
    for (n in numbers) {
        sum += n
    }
    return sum
}

// enum class
enum class Country(val code: String) {
    GERMANY("ge"), FRANCE("fr"), USA("usa")
}
fun greetMe (country: Country): String {
    return when (country) {
        Country.GERMANY -> "Hello Germany"
        Country.FRANCE -> "Hello France"
        Country.USA -> "Hello USA"
    }
}

// singleton
object Logger {
    fun log(message: String) {
        println("LOG: $message")
    }
}
object Config {
    var appName = "My Kotlin App"
    var version = "1.0"
}object NetworkManager {
    init {
        println("Network Manager Initialized")
    }

    fun connect() {
        println("Connected to server")
    }
}

// generics
fun <T> List<T>.myFilter (predicate: (T) -> Boolean): List<T> {
    val result = mutableListOf<T>()
    for (element in this) {
        if (predicate (element)) {
            result.add(element)
        }
    }
    return result.toList()
}

// generics sealed and interfaces
sealed interface Result<out D, out E> {
    data class Success<D>(val data: D): Result<D, Nothing> // This type can never hold any data.
    data class Failure<E> (val error: E): Result<Nothing, E>
}
