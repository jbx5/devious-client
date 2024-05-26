import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
@Implements("LoginState")
public class LoginState {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	@Export("SHUTDOWN_PREVIOUS_CONNECTION")
	static final LoginState SHUTDOWN_PREVIOUS_CONNECTION;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	@Export("INIT_MOUSEHANDLER_SOCKET")
	static final LoginState INIT_MOUSEHANDLER_SOCKET;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	@Export("UNMAPPED_20")
	static final LoginState UNMAPPED_20;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	@Export("READ_LOGIN_STATUS")
	static final LoginState READ_LOGIN_STATUS;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	@Export("READ_RANDOM_VERIFICATION_NUMBER")
	static final LoginState READ_RANDOM_VERIFICATION_NUMBER;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	@Export("WRITE_INITIAL_LOGIN_PACKET")
	static final LoginState WRITE_INITIAL_LOGIN_PACKET;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	@Export("READ_CLIENT_INFO_STATUS")
	static final LoginState READ_CLIENT_INFO_STATUS;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	@Export("READ_DIGEST_PARSER_PACKET_SIZE")
	static final LoginState READ_DIGEST_PARSER_PACKET_SIZE;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	@Export("SUBMIT_DIGEST_PARSER_TASK")
	static final LoginState SUBMIT_DIGEST_PARSER_TASK;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	@Export("WRITE_DIGEST_PARSER_RESULT")
	static final LoginState WRITE_DIGEST_PARSER_RESULT;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	@Export("READ_STATE_11_PACKET_SIZE")
	static final LoginState READ_STATE_11_PACKET_SIZE;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	@Export("UNMAPPED_11")
	static final LoginState UNMAPPED_11;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	@Export("READ_PROFILE_TRANSFER_TIME")
	static final LoginState READ_PROFILE_TRANSFER_TIME;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	@Export("PROFILE_TRANSFER")
	static final LoginState PROFILE_TRANSFER;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	@Export("UNMAPPED")
	static final LoginState UNMAPPED;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	@Export("READ_ACCOUNT_INFO")
	static final LoginState READ_ACCOUNT_INFO;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	@Export("SET_SERVER_PROTOCOL")
	static final LoginState SET_SERVER_PROTOCOL;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	@Export("UPDATE_PLAYER_AND_LOAD_REGIONS")
	static final LoginState UPDATE_PLAYER_AND_LOAD_REGIONS;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	@Export("UNMAPPED_17")
	static final LoginState UNMAPPED_17;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	@Export("UNMAPPED_18")
	static final LoginState UNMAPPED_18;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	@Export("UNMAPPED_19")
	static final LoginState UNMAPPED_19;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	@Export("REFRESHING_TOKEN")
	static final LoginState REFRESHING_TOKEN;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	@Export("TOKEN_RESPONSE")
	static final LoginState TOKEN_RESPONSE;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	@Export("UNMAPPED_21")
	static final LoginState UNMAPPED_21;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	@Export("READ_ACCOUNT_INFO_PACKET_SIZE")
	static final LoginState READ_ACCOUNT_INFO_PACKET_SIZE;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("archive4")
	static Archive archive4;

	static {
		SHUTDOWN_PREVIOUS_CONNECTION = new LoginState();
		INIT_MOUSEHANDLER_SOCKET = new LoginState();
		UNMAPPED_20 = new LoginState();
		READ_LOGIN_STATUS = new LoginState();
		READ_RANDOM_VERIFICATION_NUMBER = new LoginState();
		WRITE_INITIAL_LOGIN_PACKET = new LoginState();
		READ_CLIENT_INFO_STATUS = new LoginState();
		READ_DIGEST_PARSER_PACKET_SIZE = new LoginState();
		SUBMIT_DIGEST_PARSER_TASK = new LoginState();
		WRITE_DIGEST_PARSER_RESULT = new LoginState();
		READ_STATE_11_PACKET_SIZE = new LoginState();
		UNMAPPED_11 = new LoginState();
		READ_PROFILE_TRANSFER_TIME = new LoginState();
		PROFILE_TRANSFER = new LoginState();
		UNMAPPED = new LoginState();
		READ_ACCOUNT_INFO = new LoginState();
		SET_SERVER_PROTOCOL = new LoginState();
		UPDATE_PLAYER_AND_LOAD_REGIONS = new LoginState();
		UNMAPPED_17 = new LoginState();
		UNMAPPED_18 = new LoginState();
		UNMAPPED_19 = new LoginState();
		REFRESHING_TOKEN = new LoginState();
		TOKEN_RESPONSE = new LoginState();
		UNMAPPED_21 = new LoginState();
		READ_ACCOUNT_INFO_PACKET_SIZE = new LoginState();
	}

	LoginState() {
	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(Ldt;Ldh;IB)V",
		garbageValue = "-81"
	)
	static final void method1226(WorldView var0, Actor var1, int var2) {
		MenuAction.worldToScreen(var0, var1.x, var1.y, var2);
	}
}
