fun nullSafety() {
    println("Hello, World!")
    val x: String? = null // accepts null
    println(x?.length) // safe even if its null
    //throws null point exception
//    println(x!!.length)
}