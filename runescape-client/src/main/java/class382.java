import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ol")
public enum class382 implements Enum {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	field4452(-1),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	field4456(0),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	field4453(1),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	field4454(2);

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	static WorldView field4458;
	@ObfuscatedName("vx")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1388826437
	)
	final int field4455;

	class382(int var3) {
		this.field4455 = var3;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-350930589"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4455;
	}
}
