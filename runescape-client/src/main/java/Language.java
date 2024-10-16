import java.util.Arrays;
import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("pn")
@Implements("Language")
public class Language implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lpn;"
	)
	@Export("Language_valuesOrdered")
	static final Language[] Language_valuesOrdered;
	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	static Archive field4701;
	@ObfuscatedName("ae")
	final String field4690;
	@ObfuscatedName("am")
	@Export("language")
	final String language;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 305188491
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field4721, 0, "GB");
		Language_DE = new Language("DE", "de", "German", ModeWhere.field4721, 1, "DE");
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field4721, 2, "FR");
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4721, 3, "BR");
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4707, 4, "NL");
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4707, 5, "ES");
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4721, 6, "MX");
		Language[] var0 = method7858();
		Language_valuesOrdered = new Language[var0.length];
		Language[] var1 = var0;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			Language var3 = var1[var2];
			if (Language_valuesOrdered[var3.id] != null) {
				throw new IllegalStateException();
			}

			Language_valuesOrdered[var3.id] = var3;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpa;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field4690 = var1;
		this.language = var2;
		this.id = var5;
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1837624059"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2131621832"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language;
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[Lpn;",
		garbageValue = "1289095481"
	)
	static Language[] method7858() {
		return new Language[]{Language_NL, Language_FR, Language_DE, Language_PT, Language_ES, Language_EN, Language_ES_MX};
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)Lpn;",
		garbageValue = "2"
	)
	public static Language method7848(int var0) {
		return var0 >= 0 && var0 < Language_valuesOrdered.length ? Language_valuesOrdered[var0] : null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILda;ZI)I",
		garbageValue = "1791002298"
	)
	static int method7859(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? UserComparator2.scriptDotWidget : HttpRequestTask.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETX) {
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETY) {
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) {
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) {
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) {
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1309300556"
	)
	static void method7860() {
		Client.mouseLastLastPressedTimeMillis = -1L;
		if (IgnoreList.mouseRecorder != null) {
			IgnoreList.mouseRecorder.index = 0;
		}

		WorldMapEvent.hasFocus = true;
		Client.hadFocus = true;
		Client.field709 = -1L;
		RestClientThreadFactory.method204();
		Client.packetWriter.clearBuffer();
		Client.packetWriter.packetBuffer.offset = 0;
		Client.packetWriter.serverPacket = null;
		Client.packetWriter.field1478 = null;
		Client.packetWriter.field1479 = null;
		Client.packetWriter.field1480 = null;
		Client.packetWriter.serverPacketLength = 0;
		Client.packetWriter.field1467 = 0;
		Client.rebootTimer = 0;
		Client.logoutTimer = 0;
		Client.hintArrowType = 0;
		class4.method16();
		MouseHandler.MouseHandler_idleCycles = 0;
		Messages.Messages_channels.clear();
		Messages.Messages_hashTable.clear();
		Messages.Messages_queue.clear();
		Messages.Messages_count = 0;
		Client.isItemSelected = 0;
		Client.isSpellSelected = false;
		Client.soundEffectCount = 0;
		Client.camAngleY = 0;
		Client.oculusOrbState = 0;
		class77.field922 = null;
		Client.minimapState = 0;
		Client.field578 = -1;
		Client.destinationX = 0;
		Client.destinationY = 0;
		Client.playerAttackOption = AttackOption.AttackOption_hidden;
		Client.npcAttackOption = AttackOption.AttackOption_hidden;
		Client.worldViewManager.clear();
		Client.playerUpdateManager.method3090();
		ItemContainer.friendSystem.clear();
		if (ModelData0.field2933 > 5000) {
		}

		int var0;
		if (Client.field596) {
			Arrays.fill(Varps.Varps_temp, 0);
			Arrays.fill(Varps.Varps_main, 0);
		} else {
			for (var0 = 0; var0 < ModelData0.field2933; ++var0) {
				VarpDefinition var1 = ReflectionCheck.VarpDefinition_get(var0);
				if (var1 != null) {
					Varps.Varps_temp[var0] = 0;
					Varps.Varps_main[var0] = 0;
				}
			}
		}

		if (class508.varcs != null) {
			class508.varcs.clearTransient();
		}

		Client.followerIndex = -1;
		if (Client.rootInterface != -1) {
			class416.widgetDefinition.method6893(Client.rootInterface);
		}

		for (InterfaceParent var2 = (InterfaceParent)Client.interfaceParents.first(); var2 != null; var2 = (InterfaceParent)Client.interfaceParents.next()) {
			class421.closeInterface(var2, true);
		}

		Client.rootInterface = -1;
		Client.interfaceParents = new NodeHashTable(8);
		Client.meslayerContinueWidget = null;
		class4.method16();
		Client.playerAppearance.method6928((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1);

		for (var0 = 0; var0 < 8; ++var0) {
			Client.playerMenuActions[var0] = null;
			Client.playerOptionsPriorities[var0] = false;
		}

		ItemContainer.itemContainers = new NodeHashTable(32);
		Client.isLoading = true;

		for (var0 = 0; var0 < 100; ++var0) {
			Client.validRootWidgets[var0] = true;
		}

		if (Client.packetWriter != null && Client.packetWriter.isaacCipher != null) {
			PacketBufferNode var3 = class113.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher);
			var3.packetBuffer.writeByte(LoginPacket.getWindowedMode());
			var3.packetBuffer.writeShort(HttpRequestTask.canvasWidth);
			var3.packetBuffer.writeShort(class268.canvasHeight);
			Client.packetWriter.addNode(var3);
		}

		PendingSpawn.friendsChat = null;
		Client.guestClanSettings = null;
		Arrays.fill(Client.currentClanSettings, (Object)null);
		class158.guestClanChannel = null;
		Arrays.fill(Client.currentClanChannels, (Object)null);

		for (var0 = 0; var0 < 8; ++var0) {
			Client.grandExchangeOffers[var0] = new GrandExchangeOffer();
		}

		MusicSong.grandExchangeEvents = null;
		Client.viewportOffsetX = 0;
		Client.viewportOffsetY = 0;
		Client.viewportWidth = 0;
		Client.viewportHeight = 0;
	}
}
