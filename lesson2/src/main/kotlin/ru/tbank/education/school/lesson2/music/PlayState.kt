package ru.tbank.education.school.lesson2.music

sealed class PlayState {
    object Playing: PlayState()
    object Stopped: PlayState()
    object Paused: PlayState()
}