package ru.tbank.education.school.lesson2.music

import javax.swing.plaf.basic.BasicHTML

fun manageProfile(user: User) {
    println(user.getSubscriptionStatus())
    println("Do you want to manage your subscription? yes/no")
    var ans = readlnOrNull().toString()
    if (ans == "yes") {
        println("Enter a command to proceed: subscribe/unsubscribe")
        var sub = readlnOrNull().toString()
        if (sub == "subscribe") {
            println("Choose the type of subscription: BASIC/PREMIUM")
            var type = readlnOrNull()?.toUpperCase()
            val subtype = when (type) {
                "BASIC" -> Subscription.BASIC
                "PREMIUM" -> Subscription.PREMIUM
                else -> {
                    println("Invalid input. Subscription type must be 'BASIC' or 'PREMIUM'.")
                    return
                }
            }
            user.subscribe(subtype)
        } else {
            user.unsubscribe();
        }
        println(user.getSubscriptionStatus())
    }
}