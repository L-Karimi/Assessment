fun main(){
string()
    numbers()
    sentence()
    output()
}
fun string(){
    val  school = "codeHive"
    println(school.get(5))
    println(school[4,4,5])
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