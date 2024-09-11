import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
public class class149 extends class150 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1567694481
	)
	int field1703;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;)V"
	)
	class149(class153 var1) {
		this.this$0 = var1;
		this.field1703 = -1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvf;B)V",
		garbageValue = "127"
	)
	void vmethod3778(Buffer var1) {
		this.field1703 = var1.readUnsignedShort();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lgo;B)V",
		garbageValue = "32"
	)
	void vmethod3771(ClanSettings var1) {
		var1.method3582(this.field1703);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "0"
	)
	public static int method3465(int var0) {
		return var0 >> 17 & 7;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZB)I",
		garbageValue = "-101"
	)
	static int method3466(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var3 = false;
			boolean var4 = false;
			int var5 = 0;
			int var6 = var0.length();

			for (int var7 = 0; var7 < var6; ++var7) {
				char var8 = var0.charAt(var7);
				if (var7 == 0) {
					if (var8 == '-') {
						var3 = true;
						continue;
					}

					if (var8 == '+') {
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') {
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') {
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') {
						throw new NumberFormatException();
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) {
					throw new NumberFormatException();
				}

				if (var3) {
					var10 = -var10;
				}

				int var9 = var10 + var5 * var1;
				if (var9 / var1 != var5) {
					throw new NumberFormatException();
				}

				var5 = var9;
				var4 = true;
			}

			if (!var4) {
				throw new NumberFormatException();
			} else {
				return var5;
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(FFFFLfr;S)V",
		garbageValue = "160"
	)
	static void method3468(float var0, float var1, float var2, float var3, class137 var4) {
		float var5 = var1 - var0;
		float var6 = var2 - var1;
		float var7 = var3 - var2;
		float var8 = var6 - var5;
		var4.field1624 = var7 - var6 - var8;
		var4.field1608 = var8 + var8 + var8;
		var4.field1616 = var5 + var5 + var5;
		var4.field1615 = var0;
	}

	@ObfuscatedName("nv")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1243580972"
	)
	static boolean method3458(int var0) {
		for (int var1 = 0; var1 < Client.field514; ++var1) {
			if (Client.field752[var1] == var0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "357918503"
	)
	static final int method3467() {
		float var0 = 200.0F * ((float)class461.clientPreferences.getBrightness() - 0.5F);
		return 100 - Math.round(var0);
	}
}
