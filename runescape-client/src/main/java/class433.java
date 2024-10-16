import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qz")
public class class433 implements Iterator {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	class434 field4807;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 2107197061
	)
	int field4806;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1657149479
	)
	int field4805;

	@ObfuscatedSignature(
		descriptor = "(Lqr;)V"
	)
	class433(class434 var1) {
		this.field4806 = 0;
		this.field4805 = this.field4807.field4815;
		this.field4807 = var1;
	}

	public boolean hasNext() {
		return this.field4806 < this.field4807.field4813;
	}

	public Object next() {
		if (this.field4807.field4815 != this.field4805) {
			throw new ConcurrentModificationException();
		} else if (this.field4806 < this.field4807.field4813) {
			Object var1 = this.field4807.field4814[this.field4806].field4802;
			++this.field4806;
			return var1;
		} else {
			throw new NoSuchElementException();
		}
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "1102939715"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var2 = new short[16];
		int var3 = 0;

		for (int var4 = 0; var4 < ItemComposition.ItemDefinition_fileCount; ++var4) {
			ItemComposition var9 = Bounds.ItemDefinition_get(var4);
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) {
				if (var3 >= 250) {
					ClanChannel.foundItemIdCount = -1;
					Ignored.foundItemIds = null;
					return;
				}

				if (var3 >= var2.length) {
					short[] var6 = new short[var2.length * 2];

					for (int var7 = 0; var7 < var3; ++var7) {
						var6[var7] = var2[var7];
					}

					var2 = var6;
				}

				var2[var3++] = (short)var4;
			}
		}

		Ignored.foundItemIds = var2;
		class198.foundItemIndex = 0;
		ClanChannel.foundItemIdCount = var3;
		String[] var8 = new String[ClanChannel.foundItemIdCount];

		for (int var5 = 0; var5 < ClanChannel.foundItemIdCount; ++var5) {
			var8[var5] = Bounds.ItemDefinition_get(var2[var5]).name;
		}

		short[] var10 = Ignored.foundItemIds;
		PacketWriter.sortItemsByName(var8, var10, 0, var8.length - 1);
	}
}
