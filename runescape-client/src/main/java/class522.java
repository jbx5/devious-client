import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ud")
public class class522 implements Enum {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	public static final class522 field5158;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	public static final class522 field5160;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	public static final class522 field5155;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1379155053
	)
	public final int field5156;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 845451401
	)
	public final int field5157;
	@ObfuscatedName("ao")
	public final Class field5153;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ltt;"
	)
	final class518 field5159;

	static {
		field5158 = new class522(2, 0, Integer.class, new class519());
		field5160 = new class522(0, 1, Long.class, new class521());
		field5155 = new class522(1, 2, String.class, new class523());
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Ltt;)V"
	)
	class522(int var1, int var2, Class var3, class518 var4) {
		this.field5156 = var1;
		this.field5157 = var2;
		this.field5153 = var3;
		this.field5159 = var4;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "800883718"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5157;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)Ljava/lang/Object;",
		garbageValue = "-1737742685"
	)
	public Object method9112(Buffer var1) {
		return this.field5159.vmethod9133(var1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[II)V",
		garbageValue = "1497515026"
	)
	public static void method9132(String[] var0, int[] var1) {
		class157.quicksortStringsWithCorrespondingIntegers(var0, var1, 0, var0.length - 1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Lud;",
		garbageValue = "2049519405"
	)
	public static class522[] method9125() {
		return new class522[]{field5158, field5160, field5155};
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "969266966"
	)
	public static int method9108() {
		return ++MouseHandler.MouseHandler_idleCycles - 1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lur;I)V",
		garbageValue = "110718303"
	)
	public static void method9109(Object var0, Buffer var1) {
		class518 var2 = method9110(var0.getClass());
		var2.vmethod9136(var0, var1);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;B)Ltt;",
		garbageValue = "38"
	)
	static class518 method9110(Class var0) {
		class522[] var2 = method9125();
		int var3 = 0;

		class522 var1;
		while (true) {
			if (var3 >= var2.length) {
				var1 = null;
				break;
			}

			class522 var4 = var2[var3];
			if (var4.field5153 == var0) {
				var1 = var4;
				break;
			}

			++var3;
		}

		if (var1 == null) {
			throw new IllegalArgumentException();
		} else {
			return var1.field5159;
		}
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(I)Lia;",
		garbageValue = "-2146551374"
	)
	public static IndexCheck method9126() {
		return Client.indexCheck;
	}

	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "([Lnt;IIIZB)V",
		garbageValue = "-61"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) {
			Widget var6 = var0[var5];
			if (var6 != null && var6.parentId == var1) {
				class94.alignWidgetSize(var6, var2, var3, var4);
				WorldMapData_0.alignWidgetPosition(var6, var2, var3);
				if (var6.scrollX > var6.scrollWidth - var6.width) {
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) {
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) {
					var6.scrollY = var6.scrollHeight - var6.height;
				}

				if (var6.scrollY < 0) {
					var6.scrollY = 0;
				}

				if (var6.type == 0) {
					IsaacCipher.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	}

	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1572651621"
	)
	static final void method9128(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		NPC.clientPreferences.updateSoundEffectVolume(var0);
	}
}
