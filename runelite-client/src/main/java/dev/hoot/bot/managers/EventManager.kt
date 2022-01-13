package dev.hoot.bot.managers

import dev.hoot.api.game.Game
import dev.hoot.api.input.Keyboard
import dev.hoot.bot.Bot
import dev.hoot.bot.config.BotConfig
import dev.hoot.bot.config.DisableRenderCallbacks
import dev.hoot.bot.managers.interaction.InteractionConfig
import dev.hoot.bot.script.events.ScriptChanged
import dev.hoot.bot.script.events.ScriptState
import net.runelite.client.eventbus.Subscribe
import net.runelite.client.game.WorldService
import net.runelite.client.util.WorldUtil
import net.runelite.api.Client
import net.runelite.api.GameState
import net.runelite.api.World
import net.runelite.api.events.DialogProcessed
import net.runelite.api.events.GameStateChanged
import net.runelite.api.events.GameTick
import net.runelite.client.events.ConfigChanged
import net.runelite.client.ui.DrawManager
import org.slf4j.LoggerFactory
import java.awt.event.KeyEvent
import java.util.*
import java.util.concurrent.Executors
import javax.inject.Inject
import javax.inject.Singleton
import kotlin.concurrent.thread
import kotlin.math.max
import kotlin.math.min
import kotlin.math.round

@Singleton
class EventManager @Inject constructor(
        private val client: Client,
        private val worldService: WorldService,
        private val scriptManager: ScriptManager,
        private val fpsManager: FpsManager,
        private val interactConfig: InteractionConfig,
        private val botConfig: BotConfig
) {
    private val random = Random()
    private var randomDelay = 0L

    companion object {
        private val log = LoggerFactory.getLogger(EventManager::class.java)
    }


    private val disableRenderCallbacks = DisableRenderCallbacks()
    var worldSet = false

    @Suppress("UNUSED_PARAMETER")
    @Subscribe
    private fun onGameTick(e: GameTick) {
        if (!botConfig.neverLog()) {
            return
        }

        if (checkIdleLogout()) {
            randomDelay = randomDelay()
            Executors.newSingleThreadExecutor()
                    .submit(this::pressKey)
        }
    }

    @Subscribe
    private fun onGameStateChanged(e: GameStateChanged) {
        if (e.gameState == GameState.LOGIN_SCREEN) {
            if (!worldSet) {
                val world = System.getProperty("cli.world") ?: return
                setCliWorld(world.toInt())
            }
        }

        if (e.gameState == GameState.LOGIN_SCREEN) {
            Game.getClient().clearNPCCache()
            Game.getClient().clearItemCache()
            Game.getClient().clearObjectCache()
        }
    }

    @Subscribe
    private fun onConfigChanged(e: ConfigChanged) {
        if (e.group != "hoot") {
            return
        }

        when (e.key) {
            "fpsLimit" -> fpsManager.reloadConfig(e.newValue.toInt())
            "renderOff" -> {
                val enabled = e.newValue.toBoolean()
                client.setIsHidingEntities(enabled)
                client.isLowCpu = enabled

                if (enabled) {
                    client.drawCallbacks = disableRenderCallbacks
                } else {
                    client.drawCallbacks = null
                }
            }
        }
    }

    @Subscribe
    private fun onDialogProcessed(e: DialogProcessed) {
        if (!interactConfig.debugDialogs()) {
            return
        }

        log.info(e.toString())
    }

    @Subscribe
    private fun onScriptChanged(e: ScriptChanged) {
        log.info("Script state changed: " + e.name + " [" + e.state + "]")

        if (e.state === ScriptState.RESTARTING) {
            thread { scriptManager.restartScript() }
        }
    }

    private fun setCliWorld(cliWorld: Int) {
        val correctedWorld = if (cliWorld < 300) cliWorld + 300 else cliWorld
        if (correctedWorld <= 300 || client.world == correctedWorld) {
            return
        }

        val worldResult = worldService.worlds ?: return
        val world = worldResult.findWorld(correctedWorld) ?: return

        val rsWorld: World = client.createWorld()
        rsWorld.activity = world.activity
        rsWorld.address = world.address
        rsWorld.id = world.id
        rsWorld.playerCount = world.players
        rsWorld.location = world.location
        rsWorld.types = WorldUtil.toWorldTypes(world.types)
        client.changeWorld(rsWorld)
    }

    private fun checkIdleLogout(): Boolean {
        var idleClientTicks = client.keyboardIdleTicks
        if (client.mouseIdleTicks < idleClientTicks) {
            idleClientTicks = client.mouseIdleTicks
        }

        return idleClientTicks >= randomDelay
    }

    private fun randomDelay(): Long {
        return clamp(round(random.nextGaussian() * 8000)).toLong()
    }

    private fun clamp(value: Double): Double {
        return max(1.0, min(13000.0, value))
    }

    private fun pressKey() {
        Keyboard.pressed(KeyEvent.VK_UP)
        Keyboard.released(KeyEvent.VK_UP)
        Keyboard.typed(KeyEvent.VK_UP)
    }
}
