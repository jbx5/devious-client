import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vq")
@Implements("FillMode")
public enum FillMode implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lvq;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lvq;"
	)
	field5444(1, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lvq;"
	)
	field5446(2, 2);

	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -484581119
	)
	public final int field5443;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1671682405
	)
	final int field5447;

	FillMode(int var3, int var4) {
		this.field5443 = var3;
		this.field5447 = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2071992588"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5447;
	}
}
