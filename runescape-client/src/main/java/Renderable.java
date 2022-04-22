import java.awt.Component;
import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
@Implements("Renderable")
public abstract class Renderable extends DualNode {
	@ObfuscatedName("ck")
	@ObfuscatedGetter(intValue = 
	-268241925)

	@Export("height")
	public int height;

	protected Renderable() {
		this.height = 1000;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(B)Liq;", garbageValue = 
	"103")

	@Export("getModel")
	protected Model getModel() {
		return null;
	}

	@ObfuscatedName("co")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		Model var11 = this.getModel();
		if (var11 != null) {
			this.height = var11.height;
			var11.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9);
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lln;Lln;Lln;Lln;I)V", garbageValue = 
	"2037776497")

	public static void method4917(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, AbstractArchive var3) {
		Widget.Widget_archive = var0;
		class162.Widget_modelsArchive = var1;
		SoundCache.Widget_spritesArchive = var2;
		class17.Widget_fontsArchive = var3;
		Widget.Widget_interfaceComponents = new Widget[Widget.Widget_archive.getGroupCount()][];
		WorldMapSectionType.Widget_loadedInterfaces = new boolean[Widget.Widget_archive.getGroupCount()];
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/awt/Component;B)V", garbageValue = 
	"39")

	static void method4928(Component var0) {
		var0.removeKeyListener(KeyHandler.KeyHandler_instance);
		var0.removeFocusListener(KeyHandler.KeyHandler_instance);
		KeyHandler.field128 = -1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(III)V", garbageValue = 
	"1452098348")

	public static void method4926(int var0, int var1) {
		VarbitComposition var2 = UserComparator6.method2643(var0);
		int var3 = var2.baseVar;
		int var4 = var2.startBit;
		int var5 = var2.endBit;
		int var6 = Varps.Varps_masks[var5 - var4];
		if ((var1 < 0) || (var1 > var6)) {
			var1 = 0;
		}

		var6 <<= var4;
		Varps.Varps_main[var3] = (Varps.Varps_main[var3] & (~var6)) | ((var1 << var4) & var6);
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1929107749")

	static void method4925() {
		Client.mouseLastLastPressedTimeMillis = -1L;
		class120.mouseRecorder.index = 0;
		Varcs.hasFocus = true;
		Client.hadFocus = true;
		Client.field585 = -1L;
		UrlRequest.method2564();
		Client.packetWriter.clearBuffer();
		Client.packetWriter.packetBuffer.offset = 0;
		Client.packetWriter.serverPacket = null;
		Client.packetWriter.field1324 = null;
		Client.packetWriter.field1325 = null;
		Client.packetWriter.field1313 = null;
		Client.packetWriter.serverPacketLength = 0;
		Client.packetWriter.field1322 = 0;
		Client.rebootTimer = 0;
		Client.logoutTimer = 0;
		Client.hintArrowType = 0;
		Client.menuOptionsCount = 0;
		Client.isMenuOpen = false;
		ClientPacket.method5176(0);
		Actor.method2177();
		Client.isItemSelected = 0;
		Client.isSpellSelected = false;
		Client.soundEffectCount = 0;
		Client.camAngleY = 0;
		Client.oculusOrbState = 0;
		VarcInt.field1841 = null;
		Client.minimapState = 0;
		Client.field714 = -1;
		Client.destinationX = 0;
		Client.destinationY = 0;
		Client.playerAttackOption = AttackOption.AttackOption_hidden;
		Client.npcAttackOption = AttackOption.AttackOption_hidden;
		Client.npcCount = 0;
		Players.Players_count = 0;

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) {
			Players.field1276[var0] = null;
			Players.field1286[var0] = class193.field2185;
		}

		for (var0 = 0; var0 < 2048; ++var0) {
			Client.players[var0] = null;
		}

		for (var0 = 0; var0 < 32768; ++var0) {
			Client.npcs[var0] = null;
		}

		Client.combatTargetPlayerIndex = -1;
		Client.projectiles.clear();
		Client.graphicsObjects.clear();

		int var2;
		for (var0 = 0; var0 < 4; ++var0) {
			for (int var1 = 0; var1 < 104; ++var1) {
				for (var2 = 0; var2 < 104; ++var2) {
					Client.groundItems[var0][var1][var2] = null;
				}
			}
		}

		Client.pendingSpawns = new NodeDeque();
		Decimator.friendSystem.clear();

		for (var0 = 0; var0 < VarpDefinition.VarpDefinition_fileCount; ++var0) {
			VarpDefinition var4 = class134.VarpDefinition_get(var0);
			if (var4 != null) {
				Varps.Varps_temp[var0] = 0;
				Varps.Varps_main[var0] = 0;
			}
		}

		class160.varcs.clearTransient();
		Client.followerIndex = -1;
		if (Client.rootInterface != (-1)) {
			var0 = Client.rootInterface;
			if ((var0 != (-1)) && WorldMapSectionType.Widget_loadedInterfaces[var0]) {
				Widget.Widget_archive.clearFilesGroup(var0);
				if (Widget.Widget_interfaceComponents[var0] != null) {
					boolean var5 = true;

					for (var2 = 0; var2 < Widget.Widget_interfaceComponents[var0].length; ++var2) {
						if (Widget.Widget_interfaceComponents[var0][var2] != null) {
							if (Widget.Widget_interfaceComponents[var0][var2].type != 2) {
								Widget.Widget_interfaceComponents[var0][var2] = null;
							} else {
								var5 = false;
							}
						}
					}

					if (var5) {
						Widget.Widget_interfaceComponents[var0] = null;
					}

					WorldMapSectionType.Widget_loadedInterfaces[var0] = false;
				}
			}
		}

		for (InterfaceParent var3 = ((InterfaceParent) (Client.interfaceParents.first())); var3 != null; var3 = ((InterfaceParent) (Client.interfaceParents.next()))) {
			Script.closeInterface(var3, true);
		}

		Client.rootInterface = -1;
		Client.interfaceParents = new NodeHashTable(8);
		Client.meslayerContinueWidget = null;
		Client.menuOptionsCount = 0;
		Client.isMenuOpen = false;
		Client.playerAppearance.update(((int[]) (null)), new int[]{ 0, 0, 0, 0, 0 }, false, -1);

		for (var0 = 0; var0 < 8; ++var0) {
			Client.playerMenuActions[var0] = null;
			Client.playerOptionsPriorities[var0] = false;
		}

		UserComparator10.method2622();
		Client.isLoading = true;

		for (var0 = 0; var0 < 100; ++var0) {
			Client.field715[var0] = true;
		}

		class4.method17();
		ClientPacket.friendsChat = null;
		class154.guestClanSettings = null;
		Arrays.fill(Client.currentClanSettings, ((Object) (null)));
		class21.guestClanChannel = null;
		Arrays.fill(Client.currentClanChannels, ((Object) (null)));

		for (var0 = 0; var0 < 8; ++var0) {
			Client.grandExchangeOffers[var0] = new GrandExchangeOffer();
		}

		class83.grandExchangeEvents = null;
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(descriptor = 
	"(IIIII)V", garbageValue = 
	"-2093926598")

	@Export("selectSpell")
	static void selectSpell(int var0, int var1, int var2, int var3) {
		Widget var4 = ItemComposition.getWidgetChild(var0, var1);
		if ((var4 != null) && (var4.onTargetEnter != null)) {
			ScriptEvent var5 = new ScriptEvent();
			var5.widget = var4;
			var5.args = var4.onTargetEnter;
			ClanSettings.runScriptEvent(var5);
		}

		Client.selectedSpellItemId = var3;
		Client.isSpellSelected = true;
		Timer.selectedSpellWidget = var0;
		Client.selectedSpellChildIndex = var1;
		class17.selectedSpellFlags = var2;
		class346.invalidateWidget(var4);
	}
}