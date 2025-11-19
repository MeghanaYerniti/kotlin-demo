fun IfConditions() {

    // We can have only else block with no else
    // if(), else if(), else

    println("Enter a number: ")
    val input1 = readln()
    val inputAsInteger = input1.toIntOrNull()
    if(inputAsInteger != null){
        val evenOrOdd = if(inputAsInteger % 2 == 0) {  // verifying a condition and assigning value to val
            "You entered even number"
        }else{
            "You entered odd number"
        }
    }else {
        println("Entered a valid number")
    }

}