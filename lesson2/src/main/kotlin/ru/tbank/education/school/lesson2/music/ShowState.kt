package ru.tbank.education.school.lesson2.music

fun showState(state: PlayState) {
    when(state) {
        is PlayState.Playing -> println("Currently playing")
        is PlayState.Paused -> println("Currently paused")
        is PlayState.Stopped -> println("Player stopped")
    }
}