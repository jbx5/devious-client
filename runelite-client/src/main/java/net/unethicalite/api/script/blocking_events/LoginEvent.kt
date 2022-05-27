package net.unethicalite.api.script.blocking_events

import net.unethicalite.api.game.Game
import net.unethicalite.api.game.Worlds
import net.unethicalite.api.input.Keyboard
import net.unethicalite.client.minimal.MinimalClient
import net.runelite.api.GameState
import org.jboss.aerogear.security.otp.Totp
import kotlin.system.exitProcess

class LoginEvent : BlockingEvent() {

    private var totp: Totp? = null
    private var timer = 0
    private var validateTime: Long = -1
    var maxLoginScreenTime = 1_800_000

    override fun validate(): Boolean {
        val validate = !Game.isLoggedIn() && MinimalClient.gameAccount != null
        if (validate && validateTime < 0) {
            validateTime = System.currentTimeMillis()
        }

        if (!validate) {
            validateTime = -1
        }

        return validate
    }

    override fun loop(): Int {
        val loginMessage = Game.getClient().loginMessage

        if (validateTime > -1 && System.currentTimeMillis() - validateTime >= maxLoginScreenTime) {
            println("Spent longer than 10 mins in login screen, restarting client.")
            exitProcess(0)
        }

        if (Game.getClient().worldList == null) {
            Worlds.loadWorlds()
            return 1000
        }

        if (Game.getClient().isWorldSelectOpen) {
            Game.getClient().isWorldSelectOpen = false
            return 1000
        }

        if (loginMessage.lowercase().contains("update")) {
            exitProcess(0)
        }

        for ((response, handler) in BlockingEventManager.loginMessageHandlers) {
            if (loginMessage.contains(response.line1)) {
                return handler.invoke(response)
            }
        }

        return login()
    }

    fun login(): Int {
        val loginState = Game.getClient().loginIndex
        val gameAccount = MinimalClient.gameAccount

        when (loginState) {
            State.AUTHENTICATOR -> {
                if (gameAccount?.auth != null) {
                    totp = Totp(gameAccount.auth)
                } else {
                    println("auth screen, but no authenticator was set")
                    return -1
                }

                Game.getClient().setOtp(totp!!.now())
                Keyboard.sendEnter()
                return 1000
            }

            State.ENTER_CREDENTIALS -> {
                if (gameAccount != null) {
                    if (Game.getState() == GameState.LOGGING_IN) {
                        timer = 0
                        return 1000
                    }

                    Game.getClient().username = gameAccount.username
                    Game.getClient().password = gameAccount.password
                    Keyboard.sendEnter()
                    Keyboard.sendEnter()
                    return 1000
                }

                println("no account set, stopping login handler")
                return -1
            }

            State.MAIN_MENU -> {
                Game.getClient().loginIndex = State.ENTER_CREDENTIALS
                return 1000
            }

            State.BEEN_DISCONNECTED -> {
                Game.getClient().loginIndex = State.ENTER_CREDENTIALS
                return 1000
            }

            State.DISABLED, State.INVALID_CREDENTIALS -> {
                return 1000
            }

            else -> {
                println("cannot handle loginstate $loginState")
                return 100
            }
        }
    }

    interface State {
        companion object {
            const val MAIN_MENU = 0
            const val BETA_WORLD = 1
            const val ENTER_CREDENTIALS = 2
            const val INVALID_CREDENTIALS = 3
            const val AUTHENTICATOR = 4
            const val DISABLED = 14
            const val BEEN_DISCONNECTED = 24
        }
    }

    enum class Response(val code: Int, val line1: String, val line2: String, val line3: String) {
        CONNECTION_TIMED_OUT(-3, "Connection timed out.", "Please try using a different world.", ""),
        ERROR_CONNECTING(-2, "", "Error connecting to server.", "Please try using a different world."),
        NO_SERVER_RESPONSE(-1, "No response from server.", "Please try using a different world.", ""),
        INVALID_CREDENTIALS(3, "Invalid credentials.", "", ""),
        ACCOUNT_DISABLED(4, "Your account has been disabled.", "Please visit the support page for assistance.", ""),
        ACCOUNT_NOT_LOGGED_OUT(5, "Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes."),
        RUNESCAPE_UPDATE(6, "RuneScape has been updated!", "Please reload this page.", ""),
        WORLD_FULL(7, "This world is full.", "Please use a different world.", ""),
        LOGIN_SERVER_OFFLINE(8, "Unable to connect.", "Login server offline.", ""),
        LOGIN_LIMIT(9, "Login limit exceeded.", "Too many connections from your address.", ""),
        BAD_SESSION_ID(10, "Unable to connect.", "Bad session id.", ""),
        ACCOUNT_STOLEN(11, "We suspect someone knows your password.", "Press 'change your password' on front page.", ""),
        MEMBERSHIP_REQUIRED(12, "You need a members account to login to this world.", "Please subscribe, or use a different world.", ""),
        COULD_NOT_COMPLETE(13, "Could not complete login.", "Please try using a different world.", ""),
        SERVER_BEING_UPDATED(14, "The server is being updated.", "Please wait 1 minute and try again.", ""),
        TOO_MANY_ATTEMPTS(16, "Too many login attempts.", "Please wait a few minutes before trying again.", ""),
        MEMBERS_ONLY_AREA(17, "You are standing in a members-only area.", "To play on this world move to a free area first", ""),
        ACCOUNT_LOCKED(18, "Account locked as we suspect it has been stolen.", "Please visit the support page for assistance.", ""),
        WORLD_CLOSED_BETA(19, "This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world."),
        INVALID_LOGIN_SERVER(20, "Invalid loginserver requested.", "Please try using a different world.", ""),
        MALFORMED_LOGIN_PACKET(22, "Malformed login packet.", "Please try again.", ""),
        NO_SERVER_REPLY(23, "No reply from loginserver.", "Please wait 1 minute and try again.", ""),
        ERROR_LOADING_PROFILE(24, "Error loading your profile.", "Please contact customer support.", ""),
        UNEXPECTED_SERVER_RESPONSE(25, "Unexpected loginserver response.", "Please try using a different world.", ""),
        COMPUTER_ADDRESS_BLOCKED(26, "This computers address has been blocked", "as it was used to break our rules.", ""),
        SERVICE_UNAVAILABLE(27, "", "Service unavailable.", ""),
        NO_DISPLAY_NAME_SET(31, "Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game."),
        UNSUCCESSFUL_ACCOUNT_LOGIN_ATTEMPT(32, "Your attempt to log into your account was", "unsuccessful.  Don't worry, you can sort", "this out by visiting the billing system."),
        ACCOUNT_INACCESSIBLE(37, "Your account is currently inaccessible.", "Please try again in a few minutes.", ""),
        VOTE_REQUIRED(38, "You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!"),
        ENTER_AUTH(56, "Enter the 6-digit code generated by your", "authenticator app.", ""),
        INCORRECT_AUTH_CODE(57, "The code you entered was incorrect.", "Please try again.", ""),
        RUNESCAPE_UPDATE_2(68, "RuneScape has been updated!", "Please reload this page.", "");

        val message: String
            get() = "$line1 $line2 $line3"

        companion object {
            fun forCode(code: Int): Response? {
                for (response in values()) {
                    if (response.code == code) {
                        return response
                    }
                }
                return null
            }

            fun forMessage(contained: String): Response? {
                for (response in values()) {
                    if (response.message.lowercase().contains(contained.lowercase())) {
                        return response
                    }
                }
                return null
            }
        }
    }
}
