package ru.tbank.education.school.lesson2

import User
import ru.tbank.education.school.lesson2.music.PlayState
import ru.tbank.education.school.lesson2.music.Playlist
import ru.tbank.education.school.lesson2.music.manageFavourite
import ru.tbank.education.school.lesson2.music.manageProfile
import ru.tbank.education.school.lesson2.music.printMenu
import ru.tbank.education.school.lesson2.music.showState

fun main() {
    println("""Welcome to our music service!
Enter your name: """)
    val name = readlnOrNull().toString()
    val favourite = Playlist("My favourites")
    val user = User(name, favourite)
    println("""Thank you. Now we are ready to start.
Choose a section to proceed:
1 - My Profile and subscription
2 - Manage my favourite playlist
3 - Show the state of the player
4 - Play
5 - Pause the player
6 - Stop the player
exit - leave the service"""")

    var state: PlayState = PlayState.Stopped

    var cmd = readlnOrNull().toString()
    while (cmd != "exit") {
        if (cmd == "1") manageProfile(user)
        else if (cmd == "2") manageFavourite(user)
        else if (cmd == "3") showState(state)
        else if (cmd == "4") state = PlayState.Playing
        else if (cmd == "5") state = PlayState.Paused
        else if (cmd == "6") state = PlayState.Stopped
        printMenu()
    }
}
