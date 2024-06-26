import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
public class class151 extends class147 {
	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field1715;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 278243013
	)
	int field1712;
	@ObfuscatedName("ad")
	byte field1716;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	final class150 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	class151(class150 var1) {
		this.this$0 = var1;
		this.field1712 = -1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;B)V",
		garbageValue = "118"
	)
	void vmethod3528(Buffer var1) {
		this.field1712 = var1.readUnsignedShort();
		this.field1716 = var1.readByte();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lgk;B)V",
		garbageValue = "3"
	)
	void vmethod3530(ClanSettings var1) {
		var1.method3360(this.field1712, this.field1716);
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "57"
	)
	static final int method3293(int var0) {
		return Math.min(Math.max(var0, 128), 383);
	}
}
