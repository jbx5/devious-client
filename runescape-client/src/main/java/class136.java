import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
public class class136 extends class129 {
	@ObfuscatedName("qq")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	@Export("mouseWheel")
	static class159 mouseWheel;
	@ObfuscatedName("c")
	boolean field1607;
	@ObfuscatedName("p")
	byte field1608;
	@ObfuscatedName("f")
	byte field1609;
	@ObfuscatedName("n")
	byte field1610;
	@ObfuscatedName("k")
	byte field1614;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	final class132 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leo;)V"
	)
	class136(class132 var1) {
		this.this$0 = var1; // L: 248
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqq;B)V",
		garbageValue = "-41"
	)
	void vmethod3320(Buffer var1) {
		this.field1607 = var1.readUnsignedByte() == 1; // L: 251
		this.field1608 = var1.readByte(); // L: 252
		this.field1609 = var1.readByte(); // L: 253
		this.field1610 = var1.readByte(); // L: 254
		this.field1614 = var1.readByte(); // L: 255
	} // L: 256

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Led;I)V",
		garbageValue = "-538131930"
	)
	void vmethod3313(ClanSettings var1) {
		var1.allowGuests = this.field1607; // L: 259
		var1.field1631 = this.field1608; // L: 260
		var1.field1632 = this.field1609; // L: 261
		var1.field1633 = this.field1610; // L: 262
		var1.field1634 = this.field1614; // L: 263
	} // L: 264

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/Date;",
		garbageValue = "1"
	)
	static Date method3074() {
		java.util.Calendar var0 = java.util.Calendar.getInstance(); // L: 1094
		var0.set(2, 0); // L: 1095
		var0.set(5, 1); // L: 1096
		var0.set(1, 1900); // L: 1097
		return var0.getTime(); // L: 1098
	}
}
