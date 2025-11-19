package ru.tbank.education.school.lesson2.music

class Playlist (
    val name: String
) {
    private val items = mutableListOf<AudioItem>() // List of items

    fun addItem(item: AudioItem) = items.add(item) // Adding items to the playlist

    fun printInfo() { // Printing all the playlist
        println("Name: $name")
        items.forEach { println(" - ${it.info()}") }
    }
}