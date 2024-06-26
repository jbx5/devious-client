import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ue")
public class class534 implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lue;"
	)
	public static final class534 field5290;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lue;"
	)
	public static final class534 field5284;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lue;"
	)
	public static final class534 field5286;
	@ObfuscatedName("au")
	static int[] field5292;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1930464263
	)
	static int field5285;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 2037116603
	)
	public final int field5287;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 224872429
	)
	public final int field5288;
	@ObfuscatedName("an")
	public final Class field5291;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Luc;"
	)
	final class530 field5289;

	static {
		field5290 = new class534(0, 0, Integer.class, new class531());
		field5284 = new class534(2, 1, Long.class, new class533());
		field5286 = new class534(1, 2, String.class, new class535());
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Luc;)V"
	)
	class534(int var1, int var2, Class var3, class530 var4) {
		this.field5287 = var1;
		this.field5288 = var2;
		this.field5291 = var3;
		this.field5289 = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2071992588"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5288;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvp;B)Ljava/lang/Object;",
		garbageValue = "0"
	)
	public Object method9409(Buffer var1) {
		return this.field5289.vmethod9426(var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)[Lue;",
		garbageValue = "-2074696111"
	)
	public static class534[] method9415() {
		return new class534[]{field5286, field5290, field5284};
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lvp;B)V",
		garbageValue = "56"
	)
	public static void method9407(Object var0, Buffer var1) {
		Class var3 = var0.getClass();
		class534[] var5 = method9415();
		int var6 = 0;

		class534 var4;
		while (true) {
			if (var6 >= var5.length) {
				var4 = null;
				break;
			}

			class534 var7 = var5[var6];
			if (var3 == var7.field5291) {
				var4 = var7;
				break;
			}

			++var6;
		}

		if (var4 == null) {
			throw new IllegalArgumentException();
		} else {
			class530 var2 = var4.field5289;
			var2.vmethod9425(var0, var1);
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1531563159"
	)
	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.ids.length; ++var2) {
				var1.ids[var2] = -1;
				var1.quantities[var2] = 0;
			}

		}
	}

	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "(Lnx;I)Z",
		garbageValue = "1537601654"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) {
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) {
				int var2 = Canvas.method325(var0, var1);
				int var3 = var0.cs1ComparisonValues[var1];
				if (var0.cs1Comparisons[var1] == 2) {
					if (var2 >= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) {
					if (var2 <= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) {
					if (var3 == var2) {
						return false;
					}
				} else if (var2 != var3) {
					return false;
				}
			}

			return true;
		}
	}
}
