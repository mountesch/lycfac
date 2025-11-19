package ru.tbank.education.school.lesson2.music

class Podcast (
    title: String,
    durationSec: Int,
    private val host: String // Podcast host
) : AudioItem(title, durationSec) {
    override fun info(): String { // Getting full information about this podcast
        return "Podcast: $title (host: $host, ${durationSec}s)"
    }
}