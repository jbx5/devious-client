import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("hq")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lhq;")
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lhq;")
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lhq;")
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;

	@ObfuscatedName("ha")
	@ObfuscatedGetter(intValue = -794445137)
	@Export("baseY")
	static int baseY;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 1344743675)
	final int field2671;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = -1890052329)
	final int field2672;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = -241742535)
	final int field2676;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(2, 0, 4);
		WorldMapLabelSize_medium = new WorldMapLabelSize(0, 1, 2);
		WorldMapLabelSize_large = new WorldMapLabelSize(1, 2, 0);
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field2671 = var1;
		this.field2672 = var2;
		this.field2676 = var3;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(FI)Z", garbageValue = "2012056978")
	boolean method4567(float var1) {
		return var1 >= ((float) (this.field2676));
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)[Lhq;", garbageValue = "2063977691")
	static WorldMapLabelSize[] method4568() {
		return new WorldMapLabelSize[]{ WorldMapLabelSize_small, WorldMapLabelSize_large, WorldMapLabelSize_medium };
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(II)Z", garbageValue = "-480347083")
	public static boolean method4575(int var0) {
		return var0 == WorldMapDecorationType.field3544.id;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "1")
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) {
			if (WorldMapSection2.loadInterface(var0)) {
				Widget[] var1 = SoundCache.Widget_interfaceComponents[var0];
				for (int var2 = 0; var2 < var1.length; ++var2) {
					Widget var3 = var1[var2];
					if (var3.onLoad != null) {
						ScriptEvent var4 = new ScriptEvent();
						var4.widget = var3;
						var4.args = var3.onLoad;
						class135.runScript(var4, 5000000, 0);
					}
				}
			}
		}
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(descriptor = "(IS)V", garbageValue = "-23388")
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field711 = 0L;
		if (var0 >= 2) {
			Client.isResizable = true;
		} else {
			Client.isResizable = false;
		}
		if (class9.getWindowedMode() == 1) {
			class353.client.setMaxCanvasSize(765, 503);
		} else {
			class353.client.setMaxCanvasSize(7680, 2160);
		}
		if (Client.gameState >= 25) {
			SpriteMask.method5522();
		}
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1407297152")
	static void method4566(int var0) {
		class20.tempMenuAction = new MenuAction();
		class20.tempMenuAction.param0 = Client.menuArguments1[var0];
		class20.tempMenuAction.param1 = Client.menuArguments2[var0];
		class20.tempMenuAction.opcode = Client.menuOpcodes[var0];
		class20.tempMenuAction.identifier = Client.menuIdentifiers[var0];
		class20.tempMenuAction.action = Client.menuActions[var0];
	}
}