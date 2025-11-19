fun nullSafety() {

    println("############  Null Safety Method: ############")

    // !!, ?, ?:,

    // accepting null
    println("Enter a number or else exception is threw: ")
    val input1 = readln()
    val input2 = input1.toIntOrNull() // accepts null or int
    println("You entered: $input2")
    val isEven = input2!! % 2==0 // !! throws error if you didn't enter a number
    println("Is entered number is even: $isEven")

    // assigning default value
    println("Enter a number or else 0 is assigned: ")
    val input3 = readln()
    val input4 = input3.toIntOrNull() ?: 0 // ?: assigning default value
    println("You entered: $input4")
    val isOdd = input4 % 2 != 0 // works even without !!
    println(input4)
    println("Is entered number is odd: $isOdd")

    val name: String? = null  // can be null
    println(name?.length)     // safe call

}