package bot

import java.util.*


val scanner = Scanner(System.`in`) // Do not change this line

fun main() {
    greet("Non-Violent Entity", "2020") // change it as you need
    remindName()
    guessAge()
    count()
    test()
    end()
}

fun greet(assistantName: String, birthYear: String) {
    println("Hello! My name is " + assistantName + ".")
    println("I was created in " + birthYear + ". The Begining of the End.")
    println("Please, remind me your name.")
}

fun remindName() {
    val name = scanner.nextLine()
    println("What a great name you have, " + name + "! *smirk*")
}

fun guessAge() {
    println("Let me guess your age.")
    println("Say me remainders of dividing your age by 3, 5 and 7.")
    val rem3 = scanner.nextInt()
    val rem5 = scanner.nextInt()
    val rem7 = scanner.nextInt()
    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105
    println("Your age is $age; that's a good time to start programming!")
}

fun count() {
    println("Now I will prove to you that I can count to any number you want.")
    val num = scanner.nextInt()
    for (i in 0..num) {
        print(i)
        println("!")
    }
}

fun test() {
    println("Let's test your programming knowledge.")
    println("Why was I written in Kotlin?")
    println("1. Kotlin is the best language for any purpose.")
    println("2. I am too sophisticated to be programmed in another language.")
    println("3. My creator was learning to code in Kotlin.")
    println("4. I was actually written in Java.")
    for (i in 0..100) {
        val num = scanner.nextInt()
        if (num == 3) return
        if (num in 1..4) {
            println("Please, try again.")
            continue
        }
        println("Please enter a number from 1 to 4.")
    }
}

fun end() {
    println("Congratulations, have a nice day!") // Do not change this text
}
