package dev.hoot.bot.script.blocking_events

import dev.hoot.api.game.Game
import dev.hoot.api.game.GameThread
import dev.hoot.api.widgets.Widgets
import net.runelite.api.MenuAction

class WelcomeScreenEvent : BlockingEvent() {
    companion object {
        fun isOpen(): Boolean {
            val play = Widgets.get(378) { it.hasAction("Play") }
            val newPlay = Widgets.get(413) { it.hasAction("Play") }
            return (play != null && !GameThread.invokeLater { play.isHidden })
                    || (newPlay != null && !GameThread.invokeLater { newPlay.isHidden })
        }
    }

    override fun validate(): Boolean {
        return isOpen()
    }

    override fun loop(): Int {
        val play = Widgets.get(378) { it.hasAction("Play") }
        val newPlay = Widgets.get(413) { it.hasAction("Play") }

        if (play != null && !GameThread.invokeLater { play.isHidden }) {
            GameThread.invoke { Game.getClient().invokeMenuAction("", "", 1, MenuAction.CC_OP.id, -1, play.id) }
            return 1000
        }

        if (newPlay != null && !GameThread.invokeLater { newPlay.isHidden }) {
            GameThread.invoke { Game.getClient().invokeMenuAction("", "", 1, MenuAction.CC_OP.id, -1, newPlay.id) }
            return 1000
        }

        return 1000
    }
}
