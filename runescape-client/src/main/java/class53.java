import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
public class class53 extends Node {
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -977763419
	)
	@Export("otpMedium")
	static int otpMedium;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lbx;"
	)
	class47 field351;

	public class53() {
		this.field351 = null;
	}

	@ObfuscatedSignature(
		descriptor = "(Lcv;)V"
	)
	class53(VorbisSample var1) {
		if (var1 != null) {
			this.field351 = new class47(var1, (RawSound)null);
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Lbt;)V"
	)
	public class53(RawSound var1) {
		this.field351 = new class47((VorbisSample)null, var1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-925391311"
	)
	public boolean method1096() {
		return this.field351 == null;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lbt;",
		garbageValue = "1961444927"
	)
	public RawSound method1095() {
		if (this.field351 != null && this.field351.field316.tryLock()) {
			RawSound var1;
			try {
				var1 = this.method1097();
			} finally {
				this.field351.field316.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lbt;",
		garbageValue = "-96589694"
	)
	public RawSound method1094() {
		if (this.field351 != null) {
			this.field351.field316.lock();

			RawSound var1;
			try {
				var1 = this.method1097();
			} finally {
				this.field351.field316.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lbt;",
		garbageValue = "-1970113950"
	)
	RawSound method1097() {
		if (this.field351.field317 == null) {
			this.field351.field317 = this.field351.field315.toRawSound((int[])null);
			this.field351.field315 = null;
		}

		return this.field351.field317;
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1624794329"
	)
	static void method1110() {
		Client.mouseLastLastPressedTimeMillis = 1L;
		Message.mouseRecorder.index = 0;
		class357.hasFocus = true;
		Client.hadFocus = true;
		Client.field638 = -1L;
		class36.reflectionChecks = new IterableNodeDeque();
		Client.packetWriter.clearBuffer();
		Client.packetWriter.packetBuffer.offset = 0;
		Client.packetWriter.serverPacket = null;
		Client.packetWriter.field1414 = null;
		Client.packetWriter.field1409 = null;
		Client.packetWriter.field1416 = null;
		Client.packetWriter.serverPacketLength = 0;
		Client.packetWriter.field1412 = 0;
		Client.rebootTimer = 0;
		Client.logoutTimer = 0;
		Client.hintArrowType = 0;
		class160.method3434();
		WorldMapEvent.method5097(0);
		LoginScreenAnimation.method2531();
		Client.isItemSelected = 0;
		Client.isSpellSelected = false;
		Client.soundEffectCount = 0;
		Client.camAngleY = 0;
		Client.oculusOrbState = 0;
		MidiPcmStream.field3456 = null;
		Client.minimapState = 0;
		Client.field601 = -1;
		Client.destinationX = 0;
		Client.destinationY = 0;
		Client.playerAttackOption = AttackOption.AttackOption_hidden;
		Client.npcAttackOption = AttackOption.AttackOption_hidden;
		Client.npcCount = 0;
		Players.Players_count = 0;

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) {
			Players.field1357[var0] = null;
			Players.field1356[var0] = class228.field2409;
		}

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
		class12.friendSystem.clear();
		if (VarpDefinition.field1815 > 5000) {
		}

		for (var0 = 0; var0 < VarpDefinition.field1815; ++var0) {
			VarpDefinition var1 = FloorOverlayDefinition.VarpDefinition_get(var0);
			if (var1 != null) {
				Varps.Varps_temp[var0] = 0;
				Varps.Varps_main[var0] = 0;
			}
		}

		class176.varcs.clearTransient();
		Client.followerIndex = -1;
		if (Client.rootInterface != -1) {
			HealthBarDefinition.widgetDefinition.method6283(Client.rootInterface);
		}

		for (InterfaceParent var3 = (InterfaceParent)Client.interfaceParents.first(); var3 != null; var3 = (InterfaceParent)Client.interfaceParents.next()) {
			class302.closeInterface(var3, true);
		}

		Client.rootInterface = -1;
		Client.interfaceParents = new NodeHashTable(8);
		Client.meslayerContinueWidget = null;
		class160.method3434();
		Client.playerAppearance.method6314((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1);

		for (var0 = 0; var0 < 8; ++var0) {
			Client.playerMenuActions[var0] = null;
			Client.playerOptionsPriorities[var0] = false;
		}

		class59.method1185();
		Client.isLoading = true;

		for (var0 = 0; var0 < 100; ++var0) {
			Client.validRootWidgets[var0] = true;
		}

		if (Client.packetWriter != null && Client.packetWriter.isaacCipher != null) {
			PacketBufferNode var5 = class113.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher);
			var5.packetBuffer.writeByte(ApproximateRouteStrategy.getWindowedMode());
			var5.packetBuffer.writeShort(Language.canvasWidth);
			var5.packetBuffer.writeShort(class47.canvasHeight);
			Client.packetWriter.addNode(var5);
		}

		class20.friendsChat = null;
		class478.guestClanSettings = null;
		Arrays.fill(Client.currentClanSettings, (Object)null);
		ItemContainer.guestClanChannel = null;
		Arrays.fill(Client.currentClanChannels, (Object)null);

		for (var0 = 0; var0 < 8; ++var0) {
			Client.grandExchangeOffers[var0] = new GrandExchangeOffer();
		}

		class6.grandExchangeEvents = null;
		Client.field494 = false;
	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "50042051"
	)
	static void method1111() {
		if (Client.isSpellSelected) {
			Widget var0 = HealthBarDefinition.widgetDefinition.getWidgetChild(class348.selectedSpellWidget, Client.selectedSpellChildIndex);
			if (var0 != null && var0.onTargetLeave != null) {
				ScriptEvent var1 = new ScriptEvent();
				var1.widget = var0;
				var1.args = var0.onTargetLeave;
				class157.runScriptEvent(var1);
			}

			Client.selectedSpellItemId = -1;
			Client.isSpellSelected = false;
			class159.invalidateWidget(var0);
		}
	}
}
