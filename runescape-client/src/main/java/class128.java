import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
public class class128 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -591006283
	)
	public final int field1507;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	public class128 field1497;
	@ObfuscatedName("ar")
	float[][] field1504;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lrz;"
	)
	final class462[] field1499;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lrz;"
	)
	class462[] field1500;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lrz;"
	)
	class462[] field1501;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	class462 field1502;
	@ObfuscatedName("ac")
	boolean field1503;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	class462 field1498;
	@ObfuscatedName("az")
	boolean field1505;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	class462 field1508;
	@ObfuscatedName("av")
	float[][] field1509;
	@ObfuscatedName("ax")
	float[][] field1506;
	@ObfuscatedName("as")
	float[][] field1496;

	@ObfuscatedSignature(
		descriptor = "(ILuj;Z)V"
	)
	public class128(int var1, Buffer var2, boolean var3) {
		this.field1502 = new class462();
		this.field1503 = true;
		this.field1498 = new class462();
		this.field1505 = true;
		this.field1508 = new class462();
		this.field1507 = var2.readShort();
		this.field1499 = new class462[var1];
		this.field1500 = new class462[this.field1499.length];
		this.field1501 = new class462[this.field1499.length];
		this.field1504 = new float[this.field1499.length][3];

		for (int var4 = 0; var4 < this.field1499.length; ++var4) {
			this.field1499[var4] = new class462(var2, var3);
			this.field1504[var4][0] = var2.method9268();
			this.field1504[var4][1] = var2.method9268();
			this.field1504[var4][2] = var2.method9268();
		}

		this.method3040();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-36"
	)
	void method3040() {
		this.field1509 = new float[this.field1499.length][3];
		this.field1506 = new float[this.field1499.length][3];
		this.field1496 = new float[this.field1499.length][3];
		class462 var1 = WorldMapDecoration.method4928();

		for (int var2 = 0; var2 < this.field1499.length; ++var2) {
			class462 var3 = this.method3041(var2);
			var1.method8435(var3);
			var1.method8437();
			this.field1509[var2] = var1.method8438();
			this.field1506[var2][0] = var3.field4772[12];
			this.field1506[var2][1] = var3.field4772[13];
			this.field1506[var2][2] = var3.field4772[14];
			this.field1496[var2] = var3.method8450();
		}

		var1.method8459();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Lrz;",
		garbageValue = "1567155502"
	)
	class462 method3041(int var1) {
		return this.field1499[var1];
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Lrz;",
		garbageValue = "211716274"
	)
	class462 method3042(int var1) {
		if (this.field1500[var1] == null) {
			this.field1500[var1] = new class462(this.method3041(var1));
			if (this.field1497 != null) {
				this.field1500[var1].method8445(this.field1497.method3042(var1));
			} else {
				this.field1500[var1].method8445(class462.field4769);
			}
		}

		return this.field1500[var1];
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IS)Lrz;",
		garbageValue = "6325"
	)
	class462 method3043(int var1) {
		if (this.field1501[var1] == null) {
			this.field1501[var1] = new class462(this.method3042(var1));
			this.field1501[var1].method8437();
		}

		return this.field1501[var1];
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lrz;I)V",
		garbageValue = "1841353885"
	)
	void method3044(class462 var1) {
		this.field1502.method8435(var1);
		this.field1503 = true;
		this.field1505 = true;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Lrz;",
		garbageValue = "37"
	)
	class462 method3045() {
		return this.field1502;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Lrz;",
		garbageValue = "155823310"
	)
	class462 method3051() {
		if (this.field1503) {
			this.field1498.method8435(this.method3045());
			if (this.field1497 != null) {
				this.field1498.method8445(this.field1497.method3051());
			}

			this.field1503 = false;
		}

		return this.field1498;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)Lrz;",
		garbageValue = "80"
	)
	public class462 method3055(int var1) {
		if (this.field1505) {
			this.field1508.method8435(this.method3043(var1));
			this.field1508.method8445(this.method3051());
			this.field1505 = false;
		}

		return this.field1508;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-2041613656"
	)
	float[] method3047(int var1) {
		return this.field1509[var1];
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-1019764578"
	)
	float[] method3049(int var1) {
		return this.field1506[var1];
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)[F",
		garbageValue = "4"
	)
	float[] method3050(int var1) {
		return this.field1496[var1];
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "-566534946"
	)
	public static String method3069(CharSequence var0) {
		long var3 = 0L;
		int var5 = var0.length();

		for (int var6 = 0; var6 < var5; ++var6) {
			var3 *= 37L;
			char var7 = var0.charAt(var6);
			if (var7 >= 'A' && var7 <= 'Z') {
				var3 += (long)(var7 + 1 - 65);
			} else if (var7 >= 'a' && var7 <= 'z') {
				var3 += (long)(var7 + 1 - 97);
			} else if (var7 >= '0' && var7 <= '9') {
				var3 += (long)(var7 + 27 - 48);
			}

			if (var3 >= 177917621779460413L) {
				break;
			}
		}

		while (0L == var3 % 37L && 0L != var3) {
			var3 /= 37L;
		}

		String var8 = HitSplatDefinition.base37DecodeLong(var3);
		if (var8 == null) {
			var8 = "";
		}

		return var8;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZI)[B",
		garbageValue = "-232126704"
	)
	public static byte[] method3079(Object var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0 instanceof byte[]) {
			byte[] var6 = (byte[])((byte[])var0);
			if (var1) {
				int var4 = var6.length;
				byte[] var5 = new byte[var4];
				System.arraycopy(var6, 0, var5, 0, var4);
				return var5;
			} else {
				return var6;
			}
		} else if (var0 instanceof AbstractByteArrayCopier) {
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0;
			return var2.get();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)Ljava/lang/String;",
		garbageValue = "1233783388"
	)
	public static String method3076(Buffer var0) {
		return DevicePcmPlayerProvider.method323(var0, 32767);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "41"
	)
	public static int method3081(int var0) {
		return class158.method3413(ViewportMouse.ViewportMouse_entityTags[var0]);
	}
}
