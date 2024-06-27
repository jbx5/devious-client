import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
public class class180 extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("field1864")
	public static EvictingDualNodeHashTable field1864;
	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;

	static {
		field1864 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "45"
	)
	public static final void method3580() {
		ViewportMouse.ViewportMouse_isInViewport = false;
		ViewportMouse.ViewportMouse_entityCount = 0;
	}

	@ObfuscatedName("po")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1863984052"
	)
	static void method3579(int var0) {
		SequenceDefinition var1 = class353.SequenceDefinition_get(var0);
		if (var1.isCachedModelIdSet()) {
			if (ClientPacket.method6093(var1.SequenceDefinition_cachedModelId) == 2) {
				Client.field800.add(var1.SequenceDefinition_cachedModelId);
			}

		}
	}
}
