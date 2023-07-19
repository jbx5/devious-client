import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
public class class200 extends DualNode {
	static {
		new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "(Lmt;I)V",
		garbageValue = "937591187"
	)
	@Export("invalidateWidget")
	public static void invalidateWidget(Widget var0) {
		if (var0 != null && var0.cycle == Client.field528) {
			Client.field718[var0.rootIndex] = true;
		}

	}
}
