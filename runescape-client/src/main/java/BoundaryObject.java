import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ka")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1500771725
	)
	@Export("z")
	int z;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 793298009
	)
	@Export("x")
	int x;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 420163547
	)
	@Export("y")
	int y;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1674755825
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1214908109
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = -1505290071759269005L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1410344811
	)
	@Export("flags")
	int flags;

	BoundaryObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lpn;B)I",
		garbageValue = "59"
	)
	@Export("compareStrings")
	public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
		int var3 = var0.length();
		int var4 = var1.length();
		int var5 = 0;
		int var6 = 0;
		byte var7 = 0;
		byte var8 = 0;

		while (var5 - var7 < var3 || var6 - var8 < var4) {
			if (var5 - var7 >= var3) {
				return -1;
			}

			if (var6 - var8 >= var4) {
				return 1;
			}

			char var9;
			if (var7 != 0) {
				var9 = (char)var7;
				boolean var14 = false;
			} else {
				var9 = var0.charAt(var5++);
			}

			char var10;
			if (var8 != 0) {
				var10 = (char)var8;
				boolean var15 = false;
			} else {
				var10 = var1.charAt(var6++);
			}

			byte var11;
			if (var9 == 198) {
				var11 = 69;
			} else if (var9 == 230) {
				var11 = 101;
			} else if (var9 == 223) {
				var11 = 115;
			} else if (var9 == 338) {
				var11 = 69;
			} else if (var9 == 339) {
				var11 = 101;
			} else {
				var11 = 0;
			}

			var7 = var11;
			byte var12;
			if (var10 == 198) {
				var12 = 69;
			} else if (var10 == 230) {
				var12 = 101;
			} else if (var10 == 223) {
				var12 = 115;
			} else if (var10 == 338) {
				var12 = 69;
			} else if (var10 == 339) {
				var12 = 101;
			} else {
				var12 = 0;
			}

			var8 = var12;
			var9 = class88.standardizeChar(var9, var2);
			var10 = class88.standardizeChar(var10, var2);
			if (var10 != var9 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) {
				var9 = Character.toLowerCase(var9);
				var10 = Character.toLowerCase(var10);
				if (var9 != var10) {
					return DelayFadeTask.lowercaseChar(var9, var2) - DelayFadeTask.lowercaseChar(var10, var2);
				}
			}
		}

		int var16 = Math.min(var3, var4);

		int var17;
		char var20;
		for (var17 = 0; var17 < var16; ++var17) {
			if (var2 == Language.Language_FR) {
				var5 = var3 - 1 - var17;
				var6 = var4 - 1 - var17;
			} else {
				var6 = var17;
				var5 = var17;
			}

			char var18 = var0.charAt(var5);
			var20 = var1.charAt(var6);
			if (var20 != var18 && Character.toUpperCase(var18) != Character.toUpperCase(var20)) {
				var18 = Character.toLowerCase(var18);
				var20 = Character.toLowerCase(var20);
				if (var18 != var20) {
					return DelayFadeTask.lowercaseChar(var18, var2) - DelayFadeTask.lowercaseChar(var20, var2);
				}
			}
		}

		var17 = var3 - var4;
		if (var17 != 0) {
			return var17;
		} else {
			for (int var19 = 0; var19 < var16; ++var19) {
				var20 = var0.charAt(var19);
				char var13 = var1.charAt(var19);
				if (var13 != var20) {
					return DelayFadeTask.lowercaseChar(var20, var2) - DelayFadeTask.lowercaseChar(var13, var2);
				}
			}

			return 0;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lpe;B)I",
		garbageValue = "-69"
	)
	static int method5596(AbstractArchive var0) {
		int var1 = Login.field958.length + Login.field959.length;
		String[] var2 = Login.field960;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			String var4 = var2[var3];
			if (var0.getGroupId(var4) != -1) {
				++var1;
			}
		}

		return var1;
	}
}
