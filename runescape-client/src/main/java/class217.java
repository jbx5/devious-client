import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("in")
public enum class217 implements MouseWheel {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	field2405((byte)-1),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	field2406((byte)0),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	field2410((byte)1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	field2407((byte)2);

	@ObfuscatedName("ap")
	@Export("Tiles_underlays2")
	static byte[][][] Tiles_underlays2;
	@ObfuscatedName("ac")
	public byte field2408;

	class217(byte var3) {
		this.field2408 = var3;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "41"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field2408;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "-19"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">";
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1754323091"
	)
	public static int method4241(int var0) {
		return (var0 & class508.field5058) - 1;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-4242"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) {
			if (ModeWhere.loadInterface(var0)) {
				Widget[] var1 = PacketBufferNode.Widget_interfaceComponents[var0];

				for (int var2 = 0; var2 < var1.length; ++var2) {
					Widget var3 = var1[var2];
					if (var3.onLoad != null) {
						ScriptEvent var4 = new ScriptEvent();
						var4.widget = var3;
						var4.args = var3.onLoad;
						NPC.runScript(var4, 5000000, 0);
					}
				}

			}
		}
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/Object;",
		garbageValue = "-77"
	)
	static Object method4239(int var0) {
		return class172.method3458((class502)KeyHandler.findEnumerated(class502.method8922(), var0));
	}
}
