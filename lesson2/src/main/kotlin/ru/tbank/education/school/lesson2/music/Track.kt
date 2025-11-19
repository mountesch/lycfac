package ru.tbank.education.school.lesson2.music

class Track (
    title: String,
    durationSec: Int,
    private var artist: String
) : AudioItem(title, durationSec) {
    constructor(title: String, durationSec: Int) :
            this(title, durationSec, "Unknown artist")

    val fullTitle: String // Getting full title
        get() = "$artist - $title"

    override fun info(): String { // Returns full information about this track
        return "Track: $fullTitle ${durationSec}s"
    }

    fun getDuration(): Int = durationSec // Getting the duration of this track
}