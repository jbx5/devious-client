import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
public class class144 extends class129 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = 415707554004215271L
	)
	long field1675;
	@ObfuscatedName("p")
	String field1671;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -569552251
	)
	int field1672;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	final class132 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leo;)V"
	)
	class144(class132 var1) {
		this.this$0 = var1;
		this.field1675 = -1L; // L: 93
		this.field1671 = null; // L: 94
		this.field1672 = 0; // L: 95
	} // L: 97

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqq;B)V",
		garbageValue = "-41"
	)
	void vmethod3320(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 100
			--var1.offset; // L: 101
			this.field1675 = var1.readLong(); // L: 102
		}

		this.field1671 = var1.readStringCp1252NullTerminatedOrNull(); // L: 104
		this.field1672 = var1.readUnsignedShort(); // L: 105
	} // L: 106

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Led;I)V",
		garbageValue = "-538131930"
	)
	void vmethod3313(ClanSettings var1) {
		var1.method3117(this.field1675, this.field1671, this.field1672); // L: 109
	} // L: 110

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IZIZI)V",
		garbageValue = "897607215"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (World.World_worlds != null) { // L: 171
			ClanChannel.doWorldSorting(0, World.World_worlds.length - 1, var0, var1, var2, var3); // L: 172
		}

	} // L: 174
}
