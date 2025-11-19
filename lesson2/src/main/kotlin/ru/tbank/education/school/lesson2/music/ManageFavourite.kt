package ru.tbank.education.school.lesson2.music

import User

fun manageFavourite(user: User) {
    println("""What do ypu want to do with your playlist?
Choose an option:
1 - Show the playlist
2 - Add a track
3 - Add a podcast
4 - Go back to the menu"""")
    var cmd = readlnOrNull().toString()
    if (cmd == "4") return
    if (cmd == "1") user.showPlaylist(playlist = user.playlist)
    else if (cmd == "2") {
        println("Enter the name of the track you want to add:")
        var name = readlnOrNull().toString()
        println("Enter the duration (sec) of the track you want to add:")
        var duration = readlnOrNull()?.toInt()
        println("Enter the artist of the track you want to add:")
        var artist = readlnOrNull().toString()
        var track = Track(name, duration, artist)
        user.playlist.addItem(track)
    } else if (cmd == "3") {
        println("Enter the name of the podcast you want to add:")
        var name = readlnOrNull().toString()
        println("Enter the duration (sec) of the podcast you want to add:")
        var duration = readlnOrNull()?.toInt()
        println("Enter the host of the podcast you want to add:")
        var artist = readlnOrNull().toString()
        var track = Track(name, duration, artist)
        user.playlist.addItem(track)
    }
    println("An item has been added to your playlist")
}