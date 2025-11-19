package ru.tbank.education.school.lesson2.music

class User (
    val name: String,
    private val playlist: Playlist
) {
    fun addToPlaylist(item: AudioItem) = playlist.addItem(item)
    fun showPlaylist(playlist: Playlist) {
        println("User: $name")
        playlist.printInfo()
    }
}