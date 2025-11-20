fun lambdaFunctions() {

    println("Enter a string:")
    val input = readln()
    val favoriteNumbers = intArrayOf(1, 2, 3, 69)

    val evenNumbers = favoriteNumbers.filter { it % 2 == 0 }

    // storing lambda function in a variable
    // here parameter type is String and return type is boolean
    val lambda: (Char) -> Boolean = {
        it.isLetter()
    }

    // directly using the lambda function
    val lettersOnly1 = input.filter {
        it.isLetter()
    }

    val lettersOnly2 = input.filter(lambda)

    println(evenNumbers)
    println(lettersOnly1)
    println(lettersOnly2)

}