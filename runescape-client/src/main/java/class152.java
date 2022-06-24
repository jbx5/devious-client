import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
@ObfuscatedName("ef")
public class class152 extends class128 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 557898497)
	int field1715;

	@ObfuscatedName("v")
	@ObfuscatedGetter(longValue = -6189068569361167089L)
	long field1716;

	@ObfuscatedSignature(descriptor = "Lej;")
	final class131 this$0;

	@ObfuscatedSignature(descriptor = "(Lej;)V")
	class152(class131 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lqt;B)V", garbageValue = "5")
	void vmethod3150(Buffer var1) {
		this.field1715 = var1.readInt();
		this.field1716 = var1.readLong();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Len;I)V", garbageValue = "-1718344311")
	void vmethod3149(ClanSettings var1) {
		var1.method2967(this.field1715, this.field1716);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(III)I", garbageValue = "2011587938")
	static int method3147(int var0, int var1) {
		ItemContainer var2 = ((ItemContainer) (ItemContainer.itemContainers.get(((long) (var0)))));
		if (var2 == null) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1;
		}
	}
}