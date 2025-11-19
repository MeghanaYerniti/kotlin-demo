fun arrays() {

    // arrays - immutable(we can change values in it but can't add or delete or change size

    val intArray = intArrayOf(1,2,3,4) + 5 // here array contains 1,2,3,4,5
    println(intArray)
    println(intArray.contentToString())

    val list = ArrayList<String>()
    list.add("One")
    list.add("Two")
    list.add("Three")
    println(list)

}