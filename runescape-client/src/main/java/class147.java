import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
public class class147 extends class143 {
	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 739864291
	)
	int field1663;
	@ObfuscatedName("ay")
	byte field1662;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfr;)V"
	)
	class147(class146 var1) {
		this.this$0 = var1;
		this.field1663 = -1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)V",
		garbageValue = "1"
	)
	void vmethod3412(Buffer var1) {
		this.field1663 = var1.readUnsignedShort();
		this.field1662 = var1.readByte();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lfx;B)V",
		garbageValue = "-72"
	)
	void vmethod3419(ClanSettings var1) {
		var1.method3236(this.field1663, this.field1662);
	}
}
