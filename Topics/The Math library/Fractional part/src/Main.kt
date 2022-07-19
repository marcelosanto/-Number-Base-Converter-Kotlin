import kotlin.math.*

fun main() {
    val number = readln()
    val regex = Regex("\\.\\d")
    print(regex.find(number)?.value?.replace(".","") ?: "0")
}