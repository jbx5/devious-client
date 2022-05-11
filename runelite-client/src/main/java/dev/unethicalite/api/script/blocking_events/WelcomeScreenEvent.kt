package dev.unethicalite.api.script.blocking_events

import dev.unethicalite.api.game.Game
import dev.unethicalite.api.widgets.Widgets
import net.runelite.api.MenuAction

class WelcomeScreenEvent : BlockingEvent() {
    companion object {
        fun isOpen(): Boolean {
            val play = Widgets.get(378) { it.hasAction("Play") }
            val newPlay = Widgets.get(413) { it.hasAction("Play") }
            return Widgets.isVisible(play) || Widgets.isVisible(newPlay)
        }
    }

    override fun validate(): Boolean {
        return isOpen()
    }

    override fun loop(): Int {
        val play = Widgets.get(378) { it.hasAction("Play") }
        val newPlay = Widgets.get(413) { it.hasAction("Play") }

        if (Widgets.isVisible(play)) {
            Game.getClient().interact(1, MenuAction.CC_OP.id, -1, play.id)
            return -1
        }

        if (Widgets.isVisible(play)) {
            Game.getClient().interact(1, MenuAction.CC_OP.id, -1, newPlay.id)
            return -1
        }

        return -1
    }
}
