import kotlin.math.*

fun main() {
    val a =  readln().toDouble()
    val b = readln().toDouble()
    val c = readln().toDouble()

    val x1 = (-b + sqrt(b * b - 4 * a * c)) / (2 * a)
    val x2 = (-b - sqrt(b * b - 4 * a * c)) / (2 * a)

    println(if (x1 < x2) "$x1 $x2" else "$x2 $x1")
}