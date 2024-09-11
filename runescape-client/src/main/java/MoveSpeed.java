import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kk")
@Implements("MoveSpeed")
public enum MoveSpeed implements Enum {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	field3038((byte)-1, 0.0F),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	field3037((byte)0, 0.5F),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	field3036((byte)1, 1.0F),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	field3039((byte)2, 2.0F),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	field3047((byte)3, 1.5F),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	field3040((byte)4, 2.5F),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	field3042((byte)5, 3.0F),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	field3041((byte)6, 3.5F),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	field3044((byte)7, 4.0F);

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[Lkk;"
	)
	public static MoveSpeed[] field3043;
	@ObfuscatedName("ar")
	@Export("id")
	public final byte id;
	@ObfuscatedName("al")
	@Export("moveSpeed")
	public final float moveSpeed;

	static {
		MoveSpeed[] var0 = new MoveSpeed[]{field3036, field3040, field3047, field3038, field3044, field3042, field3039, field3041, field3037};
		field3043 = var0;
		UserComparator4.method3169();
	}

	MoveSpeed(byte var3, float var4) {
		this.id = var3;
		this.moveSpeed = var4;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-350930589"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)Ljava/lang/String;",
		garbageValue = "61"
	)
	public static String method5703(CharSequence var0) {
		int var1 = var0.length();
		StringBuilder var2 = new StringBuilder(var1);

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') {
				if (var4 == ' ') {
					var2.append('+');
				} else {
					byte var5 = JagexCache.charToByteCp1252(var4);
					var2.append('%');
					int var6 = var5 >> 4 & 15;
					if (var6 >= 10) {
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}

					var6 = var5 & 15;
					if (var6 >= 10) {
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}
				}
			} else {
				var2.append(var4);
			}
		}

		return var2.toString();
	}
}
