import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
@ObfuscatedName("ek")
public class class135 extends class128 {
	@ObfuscatedName("fp")
	@ObfuscatedGetter(intValue = 1093142301)
	static int field1593;

	@ObfuscatedName("o")
	boolean field1592;

	@ObfuscatedName("q")
	byte field1594;

	@ObfuscatedName("f")
	byte field1590;

	@ObfuscatedName("u")
	byte field1587;

	@ObfuscatedName("c")
	byte field1591;

	@ObfuscatedSignature(descriptor = "Lec;")
	final class131 this$0;

	@ObfuscatedSignature(descriptor = "(Lec;)V")
	class135(class131 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lqw;I)V", garbageValue = "-423569520")
	void vmethod3155(Buffer var1) {
		this.field1592 = var1.readUnsignedByte() == 1;
		this.field1594 = var1.readByte();
		this.field1590 = var1.readByte();
		this.field1587 = var1.readByte();
		this.field1591 = var1.readByte();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lez;I)V", garbageValue = "-1755436064")
	void vmethod3154(ClanSettings var1) {
		var1.allowGuests = this.field1592;
		var1.field1631 = this.field1594;
		var1.field1619 = this.field1590;
		var1.field1632 = this.field1587;
		var1.field1621 = this.field1591;
	}
}