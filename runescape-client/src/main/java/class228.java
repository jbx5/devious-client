import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
public class class228 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Lek;"
	)
	class127[] field2514;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -2137547161
	)
	int field2515;

	@ObfuscatedSignature(
		descriptor = "(Lty;I)V"
	)
	class228(Buffer var1, int var2) {
		this.field2514 = new class127[var2];
		this.field2515 = var1.readUnsignedByte();

		for (int var3 = 0; var3 < this.field2514.length; ++var3) {
			class127 var4 = new class127(this.field2515, var1, false);
			this.field2514[var3] = var4;
		}

		this.method4494();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-5"
	)
	void method4494() {
		class127[] var1 = this.field2514;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class127 var3 = var1[var2];
			if (var3.field1505 >= 0) {
				var3.field1500 = this.field2514[var3.field1505];
			}
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "3739"
	)
	public int method4493() {
		return this.field2514.length;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Lek;",
		garbageValue = "1197556608"
	)
	class127 method4496(int var1) {
		return var1 >= this.method4493() ? null : this.field2514[var1];
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)[Lek;",
		garbageValue = "104"
	)
	class127[] method4511() {
		return this.field2514;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lfz;II)V",
		garbageValue = "233488741"
	)
	void method4498(class137 var1, int var2) {
		this.method4497(var1, var2, (boolean[])null, false);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lfz;I[ZZI)V",
		garbageValue = "2080039921"
	)
	void method4497(class137 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method3082();
		int var6 = 0;
		class127[] var7 = this.method4511();

		for (int var8 = 0; var8 < var7.length; ++var8) {
			class127 var9 = var7[var8];
			if (var3 == null || var4 == var3[var6]) {
				var1.method3059(var2, var9, var6, var5);
			}

			++var6;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lut;",
		garbageValue = "1151848897"
	)
	public static PrivateChatMode method4513(int var0) {
		PrivateChatMode[] var1 = new PrivateChatMode[]{PrivateChatMode.field5207, PrivateChatMode.field5206, PrivateChatMode.field5205};
		PrivateChatMode[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			PrivateChatMode var4 = var2[var3];
			if (var0 == var4.field5208) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1771033339"
	)
	public static int method4505(int var0) {
		return class304.field3378[var0];
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1328962536"
	)
	public static int method4502(int var0, int var1) {
		int var2 = var0 >>> 31;
		return (var0 + var2) / var1 - var2;
	}
}
