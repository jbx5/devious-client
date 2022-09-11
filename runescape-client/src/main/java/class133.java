import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
public class class133 extends class129 {
	@ObfuscatedName("m")
	public static short[] field1589;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1847310195
	)
	int field1586;
	@ObfuscatedName("p")
	byte field1588;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	final class132 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leo;)V"
	)
	class133(class132 var1) {
		this.this$0 = var1;
		this.field1586 = -1; // L: 128
	} // L: 131

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqq;B)V",
		garbageValue = "-41"
	)
	void vmethod3320(Buffer var1) {
		this.field1586 = var1.readUnsignedShort(); // L: 134
		this.field1588 = var1.readByte(); // L: 135
	} // L: 136

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Led;I)V",
		garbageValue = "-538131930"
	)
	void vmethod3313(ClanSettings var1) {
		var1.method3151(this.field1586, this.field1588); // L: 139
	} // L: 140
}
