package dev.hoot.bot.managers

import net.runelite.client.input.KeyListener
import net.runelite.client.input.KeyManager
import net.runelite.client.input.MouseListener
import net.runelite.client.input.MouseManager
import java.awt.event.KeyEvent
import java.awt.event.MouseEvent
import javax.inject.Inject

class InputManager @Inject constructor(
        private val scriptManager: ScriptManager,
        keyManager: KeyManager,
        mouseManager: MouseManager
) : KeyListener, MouseListener {
    companion object {
        var lastClickX = -1
        var lastClickY = -1
        var lastMovedX = -1
        var lastMovedY = -1
    }

    init {
        keyManager.registerKeyListener(this)
        mouseManager.registerMouseListener(this)
    }

    override fun mouseClicked(mouseEvent: MouseEvent): MouseEvent {
        if (scriptManager.isScriptRunning && mouseEvent.source != "hoot") {
            mouseEvent.consume()
            return mouseEvent
        }

//        client.callbacks.post(GameMouseEvent(mouseEvent, System.currentTimeMillis()))
        lastClickX = mouseEvent.x
        lastClickY = mouseEvent.y
        return mouseEvent
    }

    override fun mousePressed(mouseEvent: MouseEvent): MouseEvent {
        if (scriptManager.isScriptRunning && mouseEvent.source != "hoot") {
            mouseEvent.consume()
            return mouseEvent
        }

//        client.callbacks.post(GameMouseEvent(mouseEvent, System.currentTimeMillis()))
        lastClickX = mouseEvent.x
        lastClickY = mouseEvent.y
        return mouseEvent
    }

    override fun mouseReleased(mouseEvent: MouseEvent): MouseEvent {
        if (scriptManager.isScriptRunning && mouseEvent.source != "hoot") {
            mouseEvent.consume()
            return mouseEvent
        }

//        client.callbacks.post(GameMouseEvent(mouseEvent, System.currentTimeMillis()))
        lastClickX = mouseEvent.x
        lastClickY = mouseEvent.y
        return mouseEvent
    }

    override fun mouseEntered(mouseEvent: MouseEvent): MouseEvent {
        if (scriptManager.isScriptRunning && mouseEvent.source != "hoot") {
            mouseEvent.consume()
            return mouseEvent
        }

//        client.callbacks.post(GameMouseEvent(mouseEvent, System.currentTimeMillis()))
        return mouseEvent
    }

    override fun mouseExited(mouseEvent: MouseEvent): MouseEvent {
        if (scriptManager.isScriptRunning && mouseEvent.source != "hoot") {
            mouseEvent.consume()
            return mouseEvent
        }

//        client.callbacks.post(GameMouseEvent(mouseEvent, System.currentTimeMillis()))
        return mouseEvent
    }

    override fun mouseDragged(mouseEvent: MouseEvent): MouseEvent {
        if (scriptManager.isScriptRunning && mouseEvent.source != "hoot") {
            mouseEvent.consume()
            return mouseEvent
        }

//        client.callbacks.post(GameMouseEvent(mouseEvent, System.currentTimeMillis()))
        return mouseEvent
    }

    override fun mouseMoved(mouseEvent: MouseEvent): MouseEvent {
        if (scriptManager.isScriptRunning && mouseEvent.source != "hoot") {
            mouseEvent.consume()
            return mouseEvent
        }

//        client.callbacks.post(GameMouseEvent(mouseEvent, System.currentTimeMillis()))
        lastMovedX = mouseEvent.x
        lastMovedY = mouseEvent.y
        return mouseEvent
    }

    override fun keyTyped(e: KeyEvent) {
//        client.callbacks.post(GameKeyboardEvent(e, System.currentTimeMillis()))
    }

    override fun keyPressed(e: KeyEvent) {
//        client.callbacks.post(GameKeyboardEvent(e, System.currentTimeMillis()))
    }

    override fun keyReleased(e: KeyEvent) {
//        client.callbacks.post(GameKeyboardEvent(e, System.currentTimeMillis()))
    }
}
