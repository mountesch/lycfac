package ru.tbank.education.school.lesson2.music

class User (
    val name: String,
    val playlist: Playlist
) {

    // Managing user's playlist
    fun addToPlaylist(item: AudioItem) = playlist.addItem(item)
    fun showPlaylist(playlist: Playlist) {
        println("User: $name")
        playlist.printInfo()
    }

    // Managing user's subscription
    private var subscriptionStatus: Subscription? = null
    fun subscribe(type: Subscription) {
        subscriptionStatus = type
        println("You've subscribed to the ${type.name} plan")
    }

    fun unsubscribe() {
        subscriptionStatus = null
        println("You've been unsubscribed")
    }

    fun getSubscriptionStatus() {
        return (subscriptionStatus?.let { "Currently subscribed to ${it.name} plan" }
            ?: "$name has no subscription") as Unit
    }
}