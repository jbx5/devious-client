import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
public class class194 extends DualNode {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("field1915")
	public static EvictingDualNodeHashTable field1915;
	@ObfuscatedName("ac")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;

	static {
		field1915 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "82"
	)
	public static void method3797() {
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(Lmd;I)V",
		garbageValue = "279781873"
	)
	static void method3795(PacketBufferNode var0) {
		var0.packetBuffer.method9712(class177.archive8.hash);
		var0.packetBuffer.writeIntME(class141.field1656.hash);
		var0.packetBuffer.writeInt(class332.field3638.hash);
		var0.packetBuffer.writeInt(GameObject.archive6.hash);
		var0.packetBuffer.writeIntME(class104.archive13.hash);
		var0.packetBuffer.writeIntIME(class135.field1637.hash);
		var0.packetBuffer.method9712(class138.archive10.hash);
	}

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZIB)V",
		garbageValue = "65"
	)
	static final void method3796(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7, int var8) {
		if (!Client.isMenuOpen) {
			if (Client.menuOptionsCount < 500) {
				Client.menuActions[Client.menuOptionsCount] = var0;
				Client.menuTargets[Client.menuOptionsCount] = var1;
				Client.menuOpcodes[Client.menuOptionsCount] = var2;
				Client.menuIdentifiers[Client.menuOptionsCount] = var3;
				Client.menuArguments1[Client.menuOptionsCount] = var4;
				Client.menuArguments2[Client.menuOptionsCount] = var5;
				Client.menuItemIds[Client.menuOptionsCount] = var6;
				Client.field677[Client.menuOptionsCount] = var8;
				Client.menuShiftClick[Client.menuOptionsCount] = var7;
				++Client.menuOptionsCount;
			}

		}
	}

	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1541825141"
	)
	static final void method3794(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0);
		var0 = 100 - var0;
		float var1 = (float)var0 / 200.0F + 0.5F;
		Rasterizer3D.method4681((double)var1);
		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).setBrightness((double)var1);
		if (class6.worldMap != null) {
			class6.worldMap.method9228();
		}

		ClanSettings.method3331();
		class459.clientPreferences.updateBrightness((double)var1);
	}
}
