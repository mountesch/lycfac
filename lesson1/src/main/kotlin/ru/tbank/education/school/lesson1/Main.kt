package ru.tbank.education.school.lesson1

fun main() {
    val a = readLine()
    if (a.isNullOrEmpty()) {
        print("Error\n")
        return
    }
    val res = a.calculate()
    res?.let {
        println("Result: $res")
    } ?: println("Error")
}


