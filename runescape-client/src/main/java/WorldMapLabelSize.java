import java.util.Arrays;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kc")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("ak")
	@Export("userHomeDirectory")
	static String userHomeDirectory;
	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	@Export("fontBold12")
	public static Font fontBold12;
	@ObfuscatedName("jw")
	static int[] field3032;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 926448983
	)
	final int field3031;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1659033163
	)
	final int field3030;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1454761311
	)
	final int field3026;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(0, 0, 4);
		WorldMapLabelSize_medium = new WorldMapLabelSize(1, 1, 2);
		WorldMapLabelSize_large = new WorldMapLabelSize(2, 2, 0);
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field3031 = var1;
		this.field3030 = var2;
		this.field3026 = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(FB)Z",
		garbageValue = "27"
	)
	boolean method5527(float var1) {
		return var1 >= (float)this.field3026;
	}

	@ObfuscatedName("ax")
	static int method5531(long var0) {
		return (int)(var0 >>> 14 & 3L);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2075816911"
	)
	public static void method5532() {
		Iterator var0 = class332.musicSongs.iterator();

		while (true) {
			MusicSong var1;
			do {
				if (!var0.hasNext()) {
					class332.musicSongs.clear();
					return;
				}

				var1 = (MusicSong)var0.next();
			} while(var1 == null);

			var1.midiPcmStream.clear();
			var1.midiPcmStream.method6247();
			var1.midiPcmStream.setPcmStreamVolume(0);
			var1.midiPcmStream.field3604 = 0;
			int var2 = var1.musicTrackGroupId;
			int var3 = var1.musicTrackFileId;
			Iterator var4 = class332.field3569.iterator();

			while (var4.hasNext()) {
				class338 var5 = (class338)var4.next();
				var5.vmethod6445(var2, var3);
			}
		}
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-70"
	)
	static void method5528() {
		Client.mouseLastLastPressedTimeMillis = -1L;
		if (Friend.mouseRecorder != null) {
			Friend.mouseRecorder.index = 0;
		}

		class327.hasFocus = true;
		Client.hadFocus = true;
		Client.field676 = -1L;
		class36.reflectionChecks = new IterableNodeDeque();
		Client.packetWriter.clearBuffer();
		Client.packetWriter.packetBuffer.offset = 0;
		Client.packetWriter.serverPacket = null;
		Client.packetWriter.field1455 = null;
		Client.packetWriter.field1448 = null;
		Client.packetWriter.field1444 = null;
		Client.packetWriter.serverPacketLength = 0;
		Client.packetWriter.field1453 = 0;
		Client.rebootTimer = 0;
		Client.logoutTimer = 0;
		Client.hintArrowType = 0;
		Client.menu.menuOptionsCount = 0;
		Client.isMenuOpen = false;
		WorldMapRenderer.method5788(0);
		Messages.Messages_channels.clear();
		Messages.Messages_hashTable.clear();
		Messages.Messages_queue.clear();
		Messages.Messages_count = 0;
		Client.isItemSelected = 0;
		Client.isSpellSelected = false;
		Client.soundEffectCount = 0;
		Client.camAngleY = 0;
		Client.oculusOrbState = 0;
		class139.field1622 = null;
		Client.minimapState = 0;
		Client.field742 = -1;
		Client.destinationX = 0;
		Client.destinationY = 0;
		Client.playerAttackOption = AttackOption.AttackOption_hidden;
		Client.npcAttackOption = AttackOption.AttackOption_hidden;
		if (ConcurrentMidiTask.topLevelWorldView != null) {
			ConcurrentMidiTask.topLevelWorldView.clear();
		}

		class277.friendSystem.clear();
		if (VarpDefinition.field2453 > 5000) {
		}

		int var0;
		if (Client.field516) {
			Arrays.fill(Varps.Varps_temp, 0);
			Arrays.fill(Varps.Varps_main, 0);
		} else {
			for (var0 = 0; var0 < VarpDefinition.field2453; ++var0) {
				VarpDefinition var1 = GrandExchangeOffer.VarpDefinition_get(var0);
				if (var1 != null) {
					Varps.Varps_temp[var0] = 0;
					Varps.Varps_main[var0] = 0;
				}
			}
		}

		if (ObjectComposition.varcs != null) {
			ObjectComposition.varcs.clearTransient();
		}

		Client.followerIndex = -1;
		if (Client.rootInterface != -1) {
			FloorUnderlayDefinition.widgetDefinition.method6547(Client.rootInterface);
		}

		for (InterfaceParent var2 = (InterfaceParent)Client.interfaceParents.first(); var2 != null; var2 = (InterfaceParent)Client.interfaceParents.next()) {
			class59.closeInterface(var2, true);
		}

		Client.rootInterface = -1;
		Client.interfaceParents = new NodeHashTable(8);
		Client.meslayerContinueWidget = null;
		Client.menu.menuOptionsCount = 0;
		Client.isMenuOpen = false;
		Client.playerAppearance.method6605((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1);

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
			PacketBufferNode var3 = class218.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher);
			var3.packetBuffer.writeByte(LoginPacket.getWindowedMode());
			var3.packetBuffer.writeShort(NPC.canvasWidth);
			var3.packetBuffer.writeShort(ApproximateRouteStrategy.canvasHeight);
			Client.packetWriter.addNode(var3);
		}

		HttpRequestTask.friendsChat = null;
		class363.guestClanSettings = null;
		Arrays.fill(Client.currentClanSettings, (Object)null);
		class47.guestClanChannel = null;
		Arrays.fill(Client.currentClanChannels, (Object)null);

		for (var0 = 0; var0 < 8; ++var0) {
			Client.grandExchangeOffers[var0] = new GrandExchangeOffer();
		}

		SwapSongTask.grandExchangeEvents = null;
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-573044606"
	)
	static final boolean method5530(int var0) {
		if (var0 < 0) {
			return false;
		} else {
			int var1 = Client.menu.menuOpcodes[var0];
			if (var1 >= 2000) {
				var1 -= 2000;
			}

			return var1 == 1007;
		}
	}
}
