package net.unethicalite.api.script.blocking_events

import net.unethicalite.api.game.Game
import net.runelite.api.GameState

class ResizableEvent : BlockingEvent() {
    override fun validate(): Boolean {
        if (Game.getState() != GameState.LOGGED_IN) {
            return false
        }

        return Game.getClient().windowedMode != 1 || Game.getClient().preferences.windowMode != 1
    }

    override fun loop(): Int {
        if (Game.getClient().windowedMode != 1) {
            Game.getClient().windowedMode = 1
            return 1000
        }

        if (Game.getClient().preferences.windowMode != 1) {
            Game.getClient().preferences.windowMode = 1
        }

        return 1000
    }
}
