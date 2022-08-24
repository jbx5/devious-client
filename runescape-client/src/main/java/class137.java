import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("ef")
public class class137 extends class128 {
	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "Lmg;")
	@Export("ItemDefinition_fontPlain11")
	static Font ItemDefinition_fontPlain11;

	@ObfuscatedName("ig")
	@ObfuscatedGetter(intValue = -146328941)
	static int field1593;

	@ObfuscatedName("s")
	String field1591;

	@ObfuscatedSignature(descriptor = "Lei;")
	final class131 this$0;

	@ObfuscatedSignature(descriptor = "(Lei;)V")
	class137(class131 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lqr;I)V", garbageValue = "-885940784")
	void vmethod3087(Buffer var1) {
		this.field1591 = var1.readStringCp1252NullTerminated();
		var1.readInt();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Leh;B)V", garbageValue = "0")
	void vmethod3084(ClanSettings var1) {
		var1.name = this.field1591;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(IIIIB)V", garbageValue = "-96")
	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
		ItemContainer var4 = ((ItemContainer) (ItemContainer.itemContainers.get(((long) (var0)))));
		if (var4 == null) {
			var4 = new ItemContainer();
			ItemContainer.itemContainers.put(var4, ((long) (var0)));
		}
		if (var4.ids.length <= var1) {
			int[] var5 = new int[var1 + 1];
			int[] var6 = new int[var1 + 1];
			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) {
				var5[var7] = var4.ids[var7];
				var6[var7] = var4.quantities[var7];
			}
			for (var7 = var4.ids.length; var7 < var1; ++var7) {
				var5[var7] = -1;
				var6[var7] = 0;
			}
			var4.ids = var5;
			var4.quantities = var6;
		}
		var4.ids[var1] = var2;
		var4.quantities[var1] = var3;
	}
}