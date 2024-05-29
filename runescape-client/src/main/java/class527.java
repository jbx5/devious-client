import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ud")
class class527 implements Iterator {
	@ObfuscatedName("fl")
	static boolean field5252;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -382792011
	)
	int field5254;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Luj;"
	)
	final class528 this$0;

	@ObfuscatedSignature(
		descriptor = "(Luj;)V"
	)
	class527(class528 var1) {
		this.this$0 = var1;
	}

	public boolean hasNext() {
		return this.field5254 < this.this$0.method8899();
	}

	public Object next() {
		int var1 = ++this.field5254 - 1;
		class487 var2 = (class487)this.this$0.field5256.get((long)var1);
		return var2 != null ? var2 : this.this$0.method9466(var1);
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SIII)V",
		garbageValue = "-2098336736"
	)
	@Export("sortItemsByName")
	public static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			short var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					short var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			sortItemsByName(var0, var1, var2, var5 - 1);
			sortItemsByName(var0, var1, var5 + 1, var3);
		}

	}
}
