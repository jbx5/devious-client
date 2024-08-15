import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tf")
public abstract class class513 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1774109329
	)
	int field5139;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1395718219
	)
	int field5140;
	@ObfuscatedName("ad")
	double field5141;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1128149071
	)
	int field5142;

	class513(int var1, int var2) {
		this.field5139 = 0;
		this.field5140 = 0;
		this.field5141 = 0.0D;
		this.field5142 = 0;
		this.field5139 = var1;
		this.field5140 = 0;
		this.field5142 = var2 >= 0 && var2 <= 27 ? var2 : 0;
		this.field5141 = class359.method6934(this.field5140, this.field5139, this.field5142);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1959507309"
	)
	public void method9043() {
		if (this.field5140 < this.field5139) {
			++this.field5140;
			this.field5141 = class359.method6934(this.field5140, this.field5139, this.field5142);
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)D",
		garbageValue = "29"
	)
	double method9044() {
		return this.field5141;
	}

	@ObfuscatedName("am")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L);
	}
}
