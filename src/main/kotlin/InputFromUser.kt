fun inputFromUser(){
    // taking input from user
    println("Enter your name: ")
    val input1 = readln() // takes input as string
    println("Hello $input1")
    println(input1 + 5)

    println("Enter a number: ")
    val input2 = readln().toInt() // taking input as Integer
    println("You have entered: $input2")
    println(input2 + 5)
}