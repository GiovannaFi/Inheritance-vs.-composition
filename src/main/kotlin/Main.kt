fun main() {
    println("----interfaces----")
    val children1 = Son("Maria", 45, true)
    println(children1.parentDetails())

    val children2 = Daughter("Matteo", 50, false)
    println(children2.parentDetails())

    println("----inheritance----")
    val children3 = Daughter2("Luca", 53, false)
    println(children3.parentDetails())

    val children4 = Son2("Laura", 58, true)
    println(children4.parentDetails())
}