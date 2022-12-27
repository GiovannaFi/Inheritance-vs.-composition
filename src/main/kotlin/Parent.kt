interface Parent {
    val name : String
    val age : Int
    val isMom : Boolean
    fun parentDetails(): String{
        return "Parent's name: $name, age: $age, is this parent a mom? $isMom"
    }
}