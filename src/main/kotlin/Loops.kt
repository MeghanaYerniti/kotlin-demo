fun loops() {

    println("How many numbers will you enter?")
    val amountOfNumbers = readln().toIntOrNull() ?: 0
    var sum = 0
    var i = 0

    // while loop
    while(i < amountOfNumbers) {
        println("Please enter number #${i + 1}")
//        val number = readln().toIntOrNull() ?: continue // will ask for inout until you entered a valid input
//        val number = readln().toIntOrNull() ?: 0
        val number = readln().toIntOrNull() ?: break

        sum += number
        i++
    }

    println("The total sum is $sum")

    // for loop
    println("How many numbers will you enter?")
    val amountOfNumbers1 = readln().toIntOrNull() ?: 0
    val numbers = mutableListOf<Int>()
    for(i in 0 until amountOfNumbers1) {
        println("Please enter number #${i + 1}")
        val number = readln().toIntOrNull() ?: continue // if number is not entered then it will ignore it
        numbers.add (number)
    }
    println("Numbers: $numbers")

    for(i in numbers) {
        println(i)
    }

    // accessing from reverse or last index
    println("Enter a string:")
    val input = readln()
    for (character in input.lastIndex downTo 0) {
        println(character)
    }

}