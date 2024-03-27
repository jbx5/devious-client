import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
public class class53 extends Node {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lbw;"
	)
	class47 field358;

	public class53() {
		this.field358 = null;
	}

	@ObfuscatedSignature(
		descriptor = "(Lcr;)V"
	)
	class53(VorbisSample var1) {
		if (var1 != null) {
			this.field358 = new class47(var1, (RawSound)null);
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Lbr;)V"
	)
	public class53(RawSound var1) {
		this.field358 = new class47((VorbisSample)null, var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2057267673"
	)
	public boolean method1042() {
		return this.field358 == null;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lbr;",
		garbageValue = "1245283918"
	)
	public RawSound method1043() {
		if (this.field358 != null && this.field358.field321.tryLock()) {
			RawSound var1;
			try {
				var1 = this.method1051();
			} finally {
				this.field358.field321.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(S)Lbr;",
		garbageValue = "128"
	)
	public RawSound method1044() {
		if (this.field358 != null) {
			this.field358.field321.lock();

			RawSound var1;
			try {
				var1 = this.method1051();
			} finally {
				this.field358.field321.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Lbr;",
		garbageValue = "2125705135"
	)
	RawSound method1051() {
		if (this.field358.field320 == null) {
			this.field358.field320 = this.field358.field322.toRawSound((int[])null);
			this.field358.field322 = null;
		}

		return this.field358.field320;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lpv;B)I",
		garbageValue = "-86"
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
			var9 = Tile.standardizeChar(var9, var2);
			var10 = Tile.standardizeChar(var10, var2);
			if (var10 != var9 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) {
				var9 = Character.toLowerCase(var9);
				var10 = Character.toLowerCase(var10);
				if (var10 != var9) {
					return class470.lowercaseChar(var9, var2) - class470.lowercaseChar(var10, var2);
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
				if (var20 != var18) {
					return class470.lowercaseChar(var18, var2) - class470.lowercaseChar(var20, var2);
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
					return class470.lowercaseChar(var20, var2) - class470.lowercaseChar(var13, var2);
				}
			}

			return 0;
		}
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1553306645"
	)
	static final void method1052(int var0, int var1) {
		if (Client.hintArrowType == 2) {
			class129.worldToScreen(Client.hintArrowSubX * 64 + (Client.hintArrowX - GrandExchangeOfferOwnWorldComparator.baseX * 64 << 7), Client.hintArrowSubY * 64 + (Client.hintArrowY - DevicePcmPlayerProvider.baseY * 64 << 7), Client.hintArrowHeight * 4);
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) {
				class137.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}

		}
	}
}
