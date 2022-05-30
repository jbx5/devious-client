package net.unethicalite.api.script.blocking_events;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.unethicalite.api.account.GameAccount;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.client.Static;
import org.jboss.aerogear.security.otp.Totp;

import java.util.Locale;
import java.util.function.Function;

@Slf4j
@RequiredArgsConstructor
public class LoginEvent extends BlockingEvent
{
	private final BlockingEventManager blockingEventManager;
	private Totp totp = null;
	private long timer = 0;
	private long validateTime = -1;
	private long maxLoginScreenTime = 1_800_000;

	@Override
	public boolean validate()
	{
		boolean validate = !Game.isLoggedIn() && Game.getGameAccount() != null;
		if (validate && validateTime < 0)
		{
			validateTime = System.currentTimeMillis();
		}

		if (!validate)
		{
			validateTime = -1;
		}

		return validate;
	}

	@Override
	public int loop()
	{
		String loginMessage = Static.getClient().getLoginMessage();
		Client client = Static.getClient();

		if (validateTime > -1 && System.currentTimeMillis() - validateTime >= maxLoginScreenTime)
		{
			log.info("Spent longer than 10 mins in login screen, exiting client.");
			System.exit(0);
		}

		if (client.getWorldList() == null)
		{
			Worlds.loadWorlds();
			return 1000;
		}

		if (client.isWorldSelectOpen())
		{
			client.setWorldSelectOpen(false);
			return 1000;
		}

		if (loginMessage.toLowerCase(Locale.ROOT).contains("update"))
		{
			log.info("Game was updated, exiting client.");
			System.exit(0);
		}

		for (var entry : blockingEventManager.getLoginMessageHandlers().entrySet())
		{
			Response response = entry.getKey();
			Function<Response, Integer> handler = entry.getValue();
			if (loginMessage.contains(response.line1))
			{
				return handler.apply(response);
			}
		}

		return login();
	}

	public int login()
	{
		Client client = Static.getClient();
		int loginState = client.getLoginIndex();
		GameAccount gameAccount = Game.getGameAccount();
		if (gameAccount == null)
		{
			log.warn("No account set, stopping login event.");
			return -1000;
		}

		switch (loginState)
		{
			case State.AUTHENTICATOR:
				if (gameAccount.getAuth() != null)
				{
					totp = new Totp(gameAccount.getAuth());
				}
				else
				{
					log.error("We are on auth screen, but auth code was not set.");
					return -1000;
				}

				client.setOtp(totp.now());
				Keyboard.sendEnter();
				return 1000;

			case State.ENTER_CREDENTIALS:
				if (Game.getState() == GameState.LOGGING_IN)
				{
					timer = 0;
					return 1000;
				}

				client.setUsername(gameAccount.getUsername());
				client.setPassword(gameAccount.getPassword());
				Keyboard.sendEnter();
				Keyboard.sendEnter();
				return 1000;

			case State.MAIN_MENU:
			case State.BEEN_DISCONNECTED:
				client.setLoginIndex(State.ENTER_CREDENTIALS);
				return 1000;

			case State.DISABLED:
			case State.INVALID_CREDENTIALS:
				log.warn("Invalid account set.");
				return 5000;

			default:
				log.warn("Cannot handle login state {}", loginState);
				return 1000;
		}
	}

	public interface State
	{
		int MAIN_MENU = 0;
		int BETA_WORLD = 1;
		int ENTER_CREDENTIALS = 2;
		int INVALID_CREDENTIALS = 3;
		int AUTHENTICATOR = 4;
		int DISABLED = 14;
		int BEEN_DISCONNECTED = 24;
	}

	@RequiredArgsConstructor
	@Getter
	public enum Response
	{
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

		private final int code;
		private final String line1;
		private final String line2;
		private final String line3;

		public String getMessage()
		{
			return line1 + " " + line2 + " " + line3;
		}

		public static Response forCode(int code)
		{
			for (Response value : values())
			{
				if (value.code == code)
				{
					return value;
				}
			}

			return null;
		}

		public static Response forMessage(String contained)
		{
			for (Response value : values())
			{
				if (value.getMessage().toLowerCase(Locale.ROOT).contains(contained.toLowerCase(Locale.ROOT)))
				{
					return value;
				}
			}

			return null;
		}
	}
}
