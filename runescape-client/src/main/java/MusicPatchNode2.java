import java.util.Arrays;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mx")
@Implements("MusicPatchNode2")
public class MusicPatchNode2 {
	@ObfuscatedName("da")
	static boolean field3427;
	@ObfuscatedName("ac")
	byte[] field3420;
	@ObfuscatedName("al")
	byte[] field3418;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -618668773
	)
	int field3419;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1136181051
	)
	int field3425;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1078343365
	)
	int field3417;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -15797553
	)
	int field3421;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -438322831
	)
	int field3423;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -526087587
	)
	int field3424;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1354169945
	)
	int field3426;

	MusicPatchNode2() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "15"
	)
	static void method5929(boolean var0) {
		byte var1 = 0;
		boolean var2 = class91.clientPreferences.method2562() >= Client.field717;
		if (!var2) {
			var1 = 12;
		} else if (class159.client.containsAccessAndRefreshToken() || class159.client.method1249() || class159.client.containsSessionAndCharacterId()) {
			var1 = 10;
		}

		GameEngine.setLoginIndex(var1);
		if (var0) {
			Login.Login_username = "";
			Login.Login_password = "";
			ClientPreferences.field1295 = 0;
			class186.otp = "";
		}

		class188.method3619();
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
			Login.currentLoginField = 1;
		} else {
			Login.currentLoginField = 0;
		}

	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	static void method5928() {
		Client.mouseLastLastPressedTimeMillis = 1L;
		class233.mouseRecorder.index = 0;
		KeyHandler.hasFocus = true;
		Client.hadFocus = true;
		Client.field760 = -1L;
		class36.reflectionChecks = new IterableNodeDeque();
		Client.packetWriter.clearBuffer();
		Client.packetWriter.packetBuffer.offset = 0;
		Client.packetWriter.serverPacket = null;
		Client.packetWriter.field1431 = null;
		Client.packetWriter.field1420 = null;
		Client.packetWriter.field1433 = null;
		Client.packetWriter.serverPacketLength = 0;
		Client.packetWriter.field1429 = 0;
		Client.rebootTimer = 0;
		Client.logoutTimer = 0;
		Client.hintArrowType = 0;
		class91.method2347();
		class138.method3081(0);
		Messages.Messages_channels.clear();
		Messages.Messages_hashTable.clear();
		Messages.Messages_queue.clear();
		Messages.Messages_count = 0;
		Client.isItemSelected = 0;
		Client.isSpellSelected = false;
		Client.soundEffectCount = 0;
		Client.camAngleY = 0;
		Client.oculusOrbState = 0;
		WallDecoration.field2871 = null;
		Client.minimapState = 0;
		Client.field763 = -1;
		Client.destinationX = 0;
		Client.destinationY = 0;
		Client.playerAttackOption = AttackOption.AttackOption_hidden;
		Client.npcAttackOption = AttackOption.AttackOption_hidden;
		Client.npcCount = 0;
		class11.method112();

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) {
			Client.players[var0] = null;
		}

		for (var0 = 0; var0 < 65536; ++var0) {
			Client.npcs[var0] = null;
		}

		Client.combatTargetPlayerIndex = -1;
		Client.projectiles.clear();
		Client.graphicsObjects.clear();

		for (var0 = 0; var0 < 4; ++var0) {
			for (int var4 = 0; var4 < 104; ++var4) {
				for (int var2 = 0; var2 < 104; ++var2) {
					Client.groundItems[var0][var4][var2] = null;
				}
			}
		}

		Client.pendingSpawns = new NodeDeque();
		InvDefinition.friendSystem.clear();
		if (VarpDefinition.field1924 > 5000) {
		}

		for (var0 = 0; var0 < VarpDefinition.field1924; ++var0) {
			VarpDefinition var1 = class150.VarpDefinition_get(var0);
			if (var1 != null) {
				Varps.Varps_temp[var0] = 0;
				Varps.Varps_main[var0] = 0;
			}
		}

		class33.varcs.clearTransient();
		Client.followerIndex = -1;
		if (Client.rootInterface != -1) {
			class33.widgetDefinition.method6243(Client.rootInterface);
		}

		for (InterfaceParent var3 = (InterfaceParent)Client.interfaceParents.first(); var3 != null; var3 = (InterfaceParent)Client.interfaceParents.next()) {
			ArchiveDisk.closeInterface(var3, true);
		}

		Client.rootInterface = -1;
		Client.interfaceParents = new NodeHashTable(8);
		Client.meslayerContinueWidget = null;
		class91.method2347();
		Client.playerAppearance.method6267((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1);

		for (var0 = 0; var0 < 8; ++var0) {
			Client.playerMenuActions[var0] = null;
			Client.playerOptionsPriorities[var0] = false;
		}

		Tile.method4515();
		Client.isLoading = true;

		for (var0 = 0; var0 < 100; ++var0) {
			Client.validRootWidgets[var0] = true;
		}

		class517.method9051();
		class358.friendsChat = null;
		VerticalAlignment.guestClanSettings = null;
		Arrays.fill(Client.currentClanSettings, (Object)null);
		ClanChannelMember.guestClanChannel = null;
		Arrays.fill(Client.currentClanChannels, (Object)null);

		for (var0 = 0; var0 < 8; ++var0) {
			Client.grandExchangeOffers[var0] = new GrandExchangeOffer();
		}

		Varps.grandExchangeEvents = null;
		Client.field615 = false;
	}
}
