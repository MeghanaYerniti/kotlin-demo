fun loops() {

//        for loop

    // Loop through a range
    for (i in 1..5) {
        println(i)
    }

    // Loop with step
    for (i in 1..10 step 2) {
        println(i)
    }

    // Reverse loop
    for (i in 10 downTo 1) {
        println(i)
    }

    // using until
    for(i in 10 until 20){
        println(i)
    }

    // Loop through a list
    val names = listOf("Meghana", "Abhi", "Riya")
    for (name in names) {
        println(name)
    }

    // Loop with index
    for ((index, value) in names.withIndex()) {
        println("$index → $value")
    }


//    while loop

    // Basic while
    var i1 = 1
    while (i1 <= 5) {
        println(i1)
        i1++
    }

    // Infinite loop (use break)
    while (true) {
        println("Running...")
        break
    }

//    do while loop

    // basic
    var i2 = 1
    do {
        println(i2)
        i2++
    } while (i2 <= 5)

//    for each

    // simple
    names.forEach {
        println(it)
    }

    // with index
    names.forEachIndexed { index, value ->
        println("$index → $value")
    }

//    Loops with Conditions (when + loops)
    for (i in 1..10) {
        when {
            i % 2 == 0 -> println("$i is even")
            else -> println("$i is odd")
        }
    }


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