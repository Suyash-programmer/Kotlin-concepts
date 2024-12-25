import kotlin.random.Random
fun main(){
    val start = 1
    var end = 6

    println("Random number : ${Random.nextInt(start,end+1)}")
    println("Random Boolean value : ${Random.nextBoolean()}")
}
