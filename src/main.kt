fun main() {
    string( )

    numbers()
    sentence()
    output()
}
fun string(school:String): String {
var name = school.get(4)+ school.get(5).toString() +school.get(6)+ school.get(7)
    return  name
   println(name)

}
fun numbers(){
    val a = 9
    val b = 2
    var total = a % b
    println(total)
}
fun sentence (){
    val p = "Lucy"
    val z = 22
    println("Hi, my name is $p and i am $z years old.")
}
fun output(){
    val animal = "elephant"
    println(animal.length)
}