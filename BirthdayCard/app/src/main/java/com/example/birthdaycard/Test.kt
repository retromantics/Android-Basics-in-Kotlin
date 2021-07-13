package com.example.birthdaycard

fun congrat() {
    val age = 5 *365
    val name = "Rover"
    println("Happy Birthday, ${name}!")

    // Let's print a cake!
    println("   ,,,,,   ")
    println("   |||||   ")
    println(" =========")
    println("@@@@@@@@@@@")
    println("{~@~@~@~@~}")
    println("@@@@@@@@@@@")

    // This prints an empty line.
    println("")

    println("You are already ${age}  days old!")
    println("${age}  days old is the very best age to celebrate!")
}

fun main() {
    var border ="`-._,-'"
    val timesToRepeat = 4
    printBorder(border, timesToRepeat)
    println("Happy Birthday, Jhansi!")
    printBorder(border, timesToRepeat)
}

fun printBorder(border: String , times: Int) {
    repeat(times){
        print(border)
    }
    println()
}