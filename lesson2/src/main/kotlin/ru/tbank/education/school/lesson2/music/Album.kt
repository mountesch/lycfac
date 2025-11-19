package ru.tbank.education.school.lesson2.music

data class Album (
    val name: String,
    private val tracks: MutableList<Track> = mutableListOf()
) {
    fun addTrack(track: Track) = tracks.add(track) // Adding tracks to the album
}