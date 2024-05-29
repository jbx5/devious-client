import java.util.Arrays;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rj")
public class class449 {
	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "10"
	)
	static void method8388() {
		Client.mouseLastLastPressedTimeMillis = 1L;
		if (Message.mouseRecorder != null) {
			Message.mouseRecorder.index = 0;
		}

		HttpAuthenticationHeader.hasFocus = true;
		Client.hadFocus = true;
		Client.field768 = -1L;
		class36.reflectionChecks = new IterableNodeDeque();
		Client.packetWriter.clearBuffer();
		Client.packetWriter.packetBuffer.offset = 0;
		Client.packetWriter.serverPacket = null;
		Client.packetWriter.field1474 = null;
		Client.packetWriter.field1475 = null;
		Client.packetWriter.field1476 = null;
		Client.packetWriter.serverPacketLength = 0;
		Client.packetWriter.field1470 = 0;
		Client.rebootTimer = 0;
		Client.logoutTimer = 0;
		Client.hintArrowType = 0;
		Huffman.method7078();
		MouseHandler.MouseHandler_idleCycles = 0;
		WorldView.method2642();
		Client.isItemSelected = 0;
		Client.isSpellSelected = false;
		Client.soundEffectCount = 0;
		Client.camAngleY = 0;
		Client.oculusOrbState = 0;
		Decimator.field413 = null;
		Client.minimapState = 0;
		Client.field771 = -1;
		Client.destinationX = 0;
		Client.destinationY = 0;
		Client.playerAttackOption = AttackOption.AttackOption_hidden;
		Client.npcAttackOption = AttackOption.AttackOption_hidden;
		class358.topLevelWorldView.clear();
		class33.friendSystem.clear();
		if (VarpDefinition.field2003 > 5000) {
		}

		int var0;
		if (Client.field540) {
			VarbitComposition.method4078();
		} else {
			for (var0 = 0; var0 < VarpDefinition.field2003; ++var0) {
				VarpDefinition var1 = class249.VarpDefinition_get(var0);
				if (var1 != null) {
					Varps.Varps_temp[var0] = 0;
					Varps.Varps_main[var0] = 0;
				}
			}
		}

		if (WorldMapCacheName.varcs != null) {
			WorldMapCacheName.varcs.clearTransient();
		}

		Client.followerIndex = -1;
		if (Client.rootInterface != -1) {
			AsyncRestClient.widgetDefinition.method6540(Client.rootInterface);
		}

		for (InterfaceParent var2 = (InterfaceParent)Client.interfaceParents.first(); var2 != null; var2 = (InterfaceParent)Client.interfaceParents.next()) {
			MouseHandler.closeInterface(var2, true);
		}

		Client.rootInterface = -1;
		Client.interfaceParents = new NodeHashTable(8);
		Client.meslayerContinueWidget = null;
		Huffman.method7078();
		Client.playerAppearance.method6566((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1);

		for (var0 = 0; var0 < 8; ++var0) {
			Client.playerMenuActions[var0] = null;
			Client.playerOptionsPriorities[var0] = false;
		}

		class146.method3220();
		Client.isLoading = true;

		for (var0 = 0; var0 < 100; ++var0) {
			Client.validRootWidgets[var0] = true;
		}

		if (Client.packetWriter != null && Client.packetWriter.isaacCipher != null) {
			PacketBufferNode var3 = WorldMapElement.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher);
			var3.packetBuffer.writeByte(class534.getWindowedMode());
			var3.packetBuffer.writeShort(GameEngine.canvasWidth);
			var3.packetBuffer.writeShort(DbTable.canvasHeight);
			Client.packetWriter.addNode(var3);
		}

		class108.friendsChat = null;
		KitDefinition.guestClanSettings = null;
		Arrays.fill(Client.currentClanSettings, (Object)null);
		Language.guestClanChannel = null;
		Arrays.fill(Client.currentClanChannels, (Object)null);

		for (var0 = 0; var0 < 8; ++var0) {
			Client.grandExchangeOffers[var0] = new GrandExchangeOffer();
		}

		class160.grandExchangeEvents = null;
	}

	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;",
		garbageValue = "269764461"
	)
	static String method8387(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://";
		if (Client.gameBuild == 1) {
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) {
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) {
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) {
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) {
			var0 = "local";
		}

		String var3 = "";
		if (class432.field4745 != null) {
			var3 = "/p=" + class432.field4745;
		}

		String var4 = "runescape.com";
		return var2 + var0 + "." + var4 + "/l=" + class188.clientLanguage + "/a=" + class165.field1813 + var3 + "/";
	}
}
