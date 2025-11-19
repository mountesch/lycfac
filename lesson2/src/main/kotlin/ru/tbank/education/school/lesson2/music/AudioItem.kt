package ru.tbank.education.school.lesson2.music

abstract class AudioItem( // Abstract class of any audio items
    val title: String,
    protected val durationSec: Int
) {
    open fun info(): String = "$title: ($durationSec)s" // get the information about this item
}