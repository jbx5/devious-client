import java.util.BitSet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nr")
public class class342 extends Node {
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1297812659
	)
	int field3699;
	@ObfuscatedName("al")
	BitSet field3698;

	class342(int var1) {
		this.field3699 = var1;
		this.field3698 = new BitSet(128);
	}
}
