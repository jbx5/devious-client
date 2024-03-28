import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
public class class203 extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("field2023")
	public static EvictingDualNodeHashTable field2023;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1976190519
	)
	public static int field2080;

	static {
		field2023 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1180056437"
	)
	@Export("menuActionByIdx")
	static final void menuActionByIdx(int var0) {
		if (var0 >= 0) {
			int var1 = Client.menuArguments1[var0];
			int var2 = Client.menuArguments2[var0];
			int var3 = Client.menuOpcodes[var0];
			int var4 = Client.menuIdentifiers[var0];
			int var5 = Client.menuItemIds[var0];
			String var6 = Client.menuActions[var0];
			String var7 = Client.menuTargets[var0];
			CollisionMap.menuAction(var1, var2, var3, var4, var5, var6, var7, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
		}
	}
}
