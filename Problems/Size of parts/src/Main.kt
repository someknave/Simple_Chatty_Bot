import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val count = scanner.nextInt()
    var perfect = 0
    var fix = 0
    var reject = 0
    for (i in 0 until count) {
        val it = scanner.nextInt()
        when {
            it == 0 -> perfect++
            it == 1 -> fix++
            it == -1 -> reject++
        }
    }
    println("$perfect $fix $reject")
}
