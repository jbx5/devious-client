import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
public class class175 extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("field1842")
	static EvictingDualNodeHashTable field1842;

	static {
		field1842 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SI)V",
		garbageValue = "450419066"
	)
	public static void method3558(String[] var0, short[] var1) {
		NPCComposition.sortItemsByName(var0, var1, 0, var0.length - 1);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Lqg;",
		garbageValue = "-1682414796"
	)
	public static class424 method3560() {
		synchronized(class424.field4704) {
			if (class424.field4706 == 0) {
				return new class424();
			} else {
				class424.field4704[--class424.field4706].method7789();
				return class424.field4704[class424.field4706];
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1434182904"
	)
	public static String method3562(String var0) {
		return var0 != null && !var0.isEmpty() && var0.charAt(0) != '#' ? var0 : "";
	}

	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "979184681"
	)
	static void method3559(int var0) {
		class188.tempMenuAction = new MenuAction();
		class188.tempMenuAction.param0 = Client.menuArguments1[var0];
		class188.tempMenuAction.param1 = Client.menuArguments2[var0];
		class188.tempMenuAction.opcode = Client.menuOpcodes[var0];
		class188.tempMenuAction.identifier = Client.menuIdentifiers[var0];
		class188.tempMenuAction.itemId = Client.menuItemIds[var0];
		class188.tempMenuAction.action = Client.menuActions[var0];
		class188.tempMenuAction.target = Client.menuTargets[var0];
		class188.tempMenuAction.worldViewId = Client.menuWorldViewIds[var0];
	}

	@ObfuscatedName("ol")
	@ObfuscatedSignature(
		descriptor = "(Lnx;I)Z",
		garbageValue = "1740313426"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden;
	}
}
