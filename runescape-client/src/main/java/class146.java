import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
@ObfuscatedName("ei")
public class class146 extends class128 {
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = -1116196147)
	int field1667;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -445187805)
	int field1666;

	@ObfuscatedSignature(descriptor = "Lec;")
	final class131 this$0;

	@ObfuscatedSignature(descriptor = "(Lec;)V")
	class146(class131 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lqw;I)V", garbageValue = "-423569520")
	void vmethod3155(Buffer var1) {
		this.field1667 = var1.readInt();
		this.field1666 = var1.readInt();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lez;I)V", garbageValue = "-1755436064")
	void vmethod3154(ClanSettings var1) {
		var1.method2992(this.field1667, this.field1666);
	}
}