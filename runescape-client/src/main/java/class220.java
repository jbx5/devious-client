import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("hq")
public class class220 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "0")
	public static void method4530() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5);
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "741847652")
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (ReflectionCheck.loadInterface(var0)) {
			ArchiveDiskAction.runComponentCloseListeners(Widget.Widget_interfaceComponents[var0], var1);
		}
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(descriptor = "(Lku;B)V", garbageValue = "106")
	@Export("invalidateWidget")
	static void invalidateWidget(Widget var0) {
		if (var0 != null && var0.cycle == Client.field705) {
			Client.field610[var0.rootIndex] = true;
		}
	}
}