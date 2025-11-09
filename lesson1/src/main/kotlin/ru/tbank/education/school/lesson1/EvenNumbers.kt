package ru.tbank.education.school.lesson1

/**
 * Сумма четных чисел.
 */
fun sumEvenNumbers(numbers: Array<Int>): Int {
    var res = 0
    for (num in numbers) {
        if (num % 2 == 0) res += num
    }
    return res
}
