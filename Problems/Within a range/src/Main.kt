import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val s1 = scanner.nextInt()
    val e1 = scanner.nextInt()
    val s2 = scanner.nextInt()
    val e2 = scanner.nextInt()
    val inside = scanner.nextInt()
    print(inside in s1..e1 || inside in s2..e2)
}