import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
public class class143 extends class129 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1346810261
	)
	int field1668;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	final class132 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leo;)V"
	)
	class143(class132 var1) {
		this.this$0 = var1;
		this.field1668 = -1; // L: 213
	} // L: 215

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqq;B)V",
		garbageValue = "-41"
	)
	void vmethod3320(Buffer var1) {
		this.field1668 = var1.readUnsignedShort(); // L: 218
	} // L: 219

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Led;I)V",
		garbageValue = "-538131930"
	)
	void vmethod3313(ClanSettings var1) {
		var1.method3121(this.field1668); // L: 222
	} // L: 223
}
