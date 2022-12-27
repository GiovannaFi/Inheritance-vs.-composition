open class Parent2(open val name : String, open val age : Int, open val isMom : Boolean) {
    fun parentDetails(): String{
        return "Parent's name: $name, age: $age, is this parent a mom? $isMom"
    }
}