import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
public abstract class class163 extends Node {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Luf;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;

	class163() {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "-1435141567"
	)
	abstract void vmethod3524(Buffer var1);

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lgj;I)V",
		garbageValue = "902480534"
	)
	abstract void vmethod3523(ClanChannel var1);

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1202060921"
	)
	@Export("updateLoginIndex")
	static void updateLoginIndex(int var0) {
		if (var0 != Login.loginIndex) {
			Login.loginIndex = var0;
		}
	}
}
