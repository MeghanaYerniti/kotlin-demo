fun whenExpressions() {

    println("Enter a number: ")
    val input1 = readln()
    val inputAsInteger = input1.toIntOrNull()
    if(inputAsInteger != null){

        // when expression
        val evenOrOdd = when {
            inputAsInteger % 2 ==0 -> "You entered even number"
            inputAsInteger < 10 -> "You entered a odd number which is less that 10"
            else -> "You entered a odd number"
        }
        println(evenOrOdd)
    }else {
        println("Entered a valid number")
    }

    println("Enter a number: ")
    val input2 = readln()
    val inputAsInteger2 = input2.toIntOrNull()
    if(inputAsInteger2 != null){

        // when expression - passing parameter
        val evenOrOdd = when(inputAsInteger2) {
            0 -> "You entered 0"
            in 1..20 -> "You entered number between 10 and 20" // checking in a range
            // in 1..10 - include 1,10
            // in 1 until 10 - include 1, but not 10
            else -> "You entered a number which is greater that 20"
        }
        println(evenOrOdd)
    }else {
        println("Entered a valid number")
    }

}