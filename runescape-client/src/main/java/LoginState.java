import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
@Implements("LoginState")
public class LoginState {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	@Export("SHUTDOWN_PREVIOUS_CONNECTION")
	static final LoginState SHUTDOWN_PREVIOUS_CONNECTION;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	@Export("INIT_MOUSEHANDLER_SOCKET")
	static final LoginState INIT_MOUSEHANDLER_SOCKET;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	@Export("UNMAPPED_20")
	static final LoginState UNMAPPED_20;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	@Export("READ_LOGIN_STATUS")
	static final LoginState READ_LOGIN_STATUS;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	@Export("READ_RANDOM_VERIFICATION_NUMBER")
	static final LoginState READ_RANDOM_VERIFICATION_NUMBER;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	@Export("WRITE_INITIAL_LOGIN_PACKET")
	static final LoginState WRITE_INITIAL_LOGIN_PACKET;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	@Export("READ_CLIENT_INFO_STATUS")
	static final LoginState READ_CLIENT_INFO_STATUS;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	@Export("READ_DIGEST_PARSER_PACKET_SIZE")
	static final LoginState READ_DIGEST_PARSER_PACKET_SIZE;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	@Export("SUBMIT_DIGEST_PARSER_TASK")
	static final LoginState SUBMIT_DIGEST_PARSER_TASK;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	@Export("WRITE_DIGEST_PARSER_RESULT")
	static final LoginState WRITE_DIGEST_PARSER_RESULT;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	@Export("READ_STATE_11_PACKET_SIZE")
	static final LoginState READ_STATE_11_PACKET_SIZE;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	@Export("UNMAPPED_11")
	static final LoginState UNMAPPED_11;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	@Export("READ_PROFILE_TRANSFER_TIME")
	static final LoginState READ_PROFILE_TRANSFER_TIME;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	@Export("PROFILE_TRANSFER")
	static final LoginState PROFILE_TRANSFER;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	@Export("UNMAPPED")
	static final LoginState UNMAPPED;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	@Export("READ_ACCOUNT_INFO")
	static final LoginState READ_ACCOUNT_INFO;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	@Export("SET_SERVER_PROTOCOL")
	static final LoginState SET_SERVER_PROTOCOL;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	@Export("UPDATE_PLAYER_AND_LOAD_REGIONS")
	static final LoginState UPDATE_PLAYER_AND_LOAD_REGIONS;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	@Export("UNMAPPED_17")
	static final LoginState UNMAPPED_17;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	@Export("UNMAPPED_18")
	static final LoginState UNMAPPED_18;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	@Export("UNMAPPED_19")
	static final LoginState UNMAPPED_19;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	@Export("REFRESHING_TOKEN")
	static final LoginState REFRESHING_TOKEN;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	@Export("TOKEN_RESPONSE")
	static final LoginState TOKEN_RESPONSE;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	@Export("UNMAPPED_21")
	static final LoginState UNMAPPED_21;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	@Export("READ_ACCOUNT_INFO_PACKET_SIZE")
	static final LoginState READ_ACCOUNT_INFO_PACKET_SIZE;

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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-106"
	)
	static int method1282(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1036152468"
	)
	@Export("updateLoginIndex")
	static void updateLoginIndex(int var0) {
		if (var0 != Login.loginIndex) {
			Login.loginIndex = var0;
		}
	}

	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "(Lny;III)V",
		garbageValue = "-1856457959"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) {
			if (var0 != null && class289.method6090(var0) != null) {
				Client.clickedWidget = var0;
				Client.clickedWidgetParent = class289.method6090(var0);
				Client.widgetClickX = var1;
				Client.widgetClickY = var2;
				class140.widgetDragDuration = 0;
				Client.isDraggingWidget = false;
				int var3 = class537.method9781();
				if (var3 != -1) {
					class439.tempMenuAction = new MenuAction();
					class439.tempMenuAction.param0 = Client.menu.menuArguments1[var3];
					class439.tempMenuAction.param1 = Client.menu.menuArguments2[var3];
					class439.tempMenuAction.opcode = Client.menu.menuOpcodes[var3];
					class439.tempMenuAction.identifier = Client.menu.menuIdentifiers[var3];
					class439.tempMenuAction.itemId = Client.menu.menuItemIds[var3];
					class439.tempMenuAction.action = Client.menu.menuActions[var3];
					class439.tempMenuAction.target = Client.menu.menuTargets[var3];
					class439.tempMenuAction.worldViewId = Client.menu.menuWorldViewIds[var3];
					class439.tempMenuAction.field935 = Client.menu.menuShiftClick[var3];
				}

			}
		}
	}

	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "23"
	)
	static final void method1279(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		class461.clientPreferences.updateSoundEffectVolume(var0);
	}
}
