import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.util.Arrays;
import net.runelite.mapping.Export;
@ObfuscatedName("ca")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("bg")
	@ObfuscatedSignature(descriptor = "Lkf;")
	static GameBuild field1207;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = -1242546393)
	@Export("cycle")
	int cycle;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -333746695)
	@Export("health")
	int health;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -1619212285)
	@Export("health2")
	int health2;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 620561973)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(IIIII)V", garbageValue = "2027546548")
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(Lku;II)V", garbageValue = "-2006263821")
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field3445 == null) {
			throw new RuntimeException();
		} else {
			if (var0.field3514 == null) {
				var0.field3514 = new int[var0.field3445.length];
			}
			var0.field3514[var1] = Integer.MAX_VALUE;
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", garbageValue = "1835802021")
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0;
		Login.Login_response2 = var1;
		Login.Login_response3 = var2;
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-623463912")
	static void method2274() {
		Client.mouseLastLastPressedTimeMillis = 1L;
		class309.mouseRecorder.index = 0;
		class125.hasFocus = true;
		Client.hadFocus = true;
		Client.field725 = -1L;
		class33.reflectionChecks = new IterableNodeDeque();
		Client.packetWriter.clearBuffer();
		Client.packetWriter.packetBuffer.offset = 0;
		Client.packetWriter.serverPacket = null;
		Client.packetWriter.field1339 = null;
		Client.packetWriter.field1338 = null;
		Client.packetWriter.field1333 = null;
		Client.packetWriter.serverPacketLength = 0;
		Client.packetWriter.field1332 = 0;
		Client.rebootTimer = 0;
		Client.logoutTimer = 0;
		Client.hintArrowType = 0;
		ItemComposition.method3712();
		MouseHandler.MouseHandler_idleCycles = 0;
		class17.method262();
		Client.isItemSelected = 0;
		Client.isSpellSelected = false;
		Client.soundEffectCount = 0;
		Client.camAngleY = 0;
		Client.oculusOrbState = 0;
		class302.field3596 = null;
		Client.minimapState = 0;
		Client.field518 = -1;
		Client.destinationX = 0;
		Client.destinationY = 0;
		Client.playerAttackOption = AttackOption.AttackOption_hidden;
		Client.npcAttackOption = AttackOption.AttackOption_hidden;
		Client.npcCount = 0;
		class129.method2905();
		int var0;
		for (var0 = 0; var0 < 2048; ++var0) {
			Client.players[var0] = null;
		}
		for (var0 = 0; var0 < 32768; ++var0) {
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
		MusicPatchPcmStream.friendSystem.clear();
		for (var0 = 0; var0 < VarpDefinition.field1811; ++var0) {
			VarpDefinition var1 = MouseRecorder.VarpDefinition_get(var0);
			if (var1 != null) {
				Varps.Varps_temp[var0] = 0;
				Varps.Varps_main[var0] = 0;
			}
		}
		class151.varcs.clearTransient();
		Client.followerIndex = -1;
		if (Client.rootInterface != -1) {
			WallDecoration.method4514(Client.rootInterface);
		}
		for (InterfaceParent var3 = ((InterfaceParent) (Client.interfaceParents.first())); var3 != null; var3 = ((InterfaceParent) (Client.interfaceParents.next()))) {
			Canvas.closeInterface(var3, true);
		}
		Client.rootInterface = -1;
		Client.interfaceParents = new NodeHashTable(8);
		Client.meslayerContinueWidget = null;
		ItemComposition.method3712();
		Client.playerAppearance.update(((int[]) (null)), new int[]{ 0, 0, 0, 0, 0 }, false, -1);
		for (var0 = 0; var0 < 8; ++var0) {
			Client.playerMenuActions[var0] = null;
			Client.playerOptionsPriorities[var0] = false;
		}
		class127.method2888();
		Client.isLoading = true;
		for (var0 = 0; var0 < 100; ++var0) {
			Client.field610[var0] = true;
		}
		Calendar.method5510();
		class13.friendsChat = null;
		SecureRandomCallable.guestClanSettings = null;
		Arrays.fill(Client.currentClanSettings, ((Object) (null)));
		class17.guestClanChannel = null;
		Arrays.fill(Client.currentClanChannels, ((Object) (null)));
		for (var0 = 0; var0 < 8; ++var0) {
			Client.grandExchangeOffers[var0] = new GrandExchangeOffer();
		}
		class302.grandExchangeEvents = null;
	}
}