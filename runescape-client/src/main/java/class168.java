import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
public class class168 extends class144 {
	@ObfuscatedName("aw")
	@Export("ItemDefinition_inMembersWorld")
	public static boolean ItemDefinition_inMembersWorld;
	@ObfuscatedName("ar")
	static int[][][] field1833;
	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "[Lvl;"
	)
	static IndexedSprite[] field1834;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 964807945
	)
	int field1828;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		longValue = -8904895067247999199L
	)
	long field1827;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class168(class147 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "1253598633"
	)
	void vmethod3420(Buffer var1) {
		this.field1828 = var1.readInt();
		this.field1827 = var1.readLong();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfp;B)V",
		garbageValue = "-123"
	)
	void vmethod3419(ClanSettings var1) {
		var1.method3257(this.field1828, this.field1827);
	}
}
