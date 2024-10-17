import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qb")
public class class440 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	class436 field4867;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -788490109
	)
	int field4865;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 581064793
	)
	int field4866;

	@ObfuscatedSignature(
		descriptor = "(Lql;II)V"
	)
	class440(class436 var1, int var2, int var3) {
		this.field4865 = 0;
		this.field4866 = 0;
		this.field4867 = var1;
		this.field4865 = var2;
		this.field4866 = var3;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-38626521"
	)
	public String method8665() {
		if (this.method8678()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method8663());

			for (int var2 = this.field4865; var2 < this.field4866; ++var2) {
				class438 var3 = this.field4867.method8444(var2);
				var1.append(var3.field4839);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-83720937"
	)
	boolean method8661(int var1) {
		return this.field4867.method8515() == 2 || this.field4867.method8515() == 1 && (!this.field4867.field4832 || this.field4866 - 1 != var1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	public boolean method8678() {
		return this.field4866 == this.field4865;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	public int method8663() {
		return this.field4866 - this.field4865;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lqm;I)Z",
		garbageValue = "-1455839657"
	)
	boolean method8664(class438 var1) {
		if (this.field4867.field4834 == 2) {
			return true;
		} else if (this.field4867.field4834 == 0) {
			return false;
		} else {
			return this.field4867.method8411() != var1;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1044097647"
	)
	int method8686() {
		if (this.method8678()) {
			return 0;
		} else {
			class438 var1 = this.field4867.method8444(this.field4866 - 1);
			if (var1.field4839 == '\n') {
				return 0;
			} else if (this.method8664(var1)) {
				return this.field4867.field4833.advances[42];
			} else {
				int var2 = this.field4867.field4833.advances[var1.field4839];
				if (var2 == 0) {
					return var1.field4839 == '\t' ? this.field4867.field4833.advances[32] * 3 : this.field4867.field4833.advances[32];
				} else {
					return var2;
				}
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Luy;",
		garbageValue = "91"
	)
	public class527 method8666() {
		if (this.method8678()) {
			return new class527(0, 0);
		} else {
			class438 var1 = this.field4867.method8444(this.field4866 - 1);
			return new class527(var1.field4840 + this.method8686(), var1.field4841);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqm;",
		garbageValue = "-93"
	)
	public class438 method8667(int var1) {
		return var1 >= 0 && var1 < this.method8663() ? this.field4867.method8444(this.field4865 + var1) : null;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lpe;Lpe;IZI)Lja;",
		garbageValue = "-1873063381"
	)
	public static Frames method8689(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true;
		int[] var5 = var0.getGroupFileIds(var2);

		for (int var6 = 0; var6 < var5.length; ++var6) {
			byte[] var7 = var0.getFile(var2, var5[var6]);
			if (var7 == null) {
				var4 = false;
			} else {
				int var8 = (var7[0] & 255) << 8 | var7[1] & 255;
				byte[] var9;
				if (var3) {
					var9 = var1.getFile(0, var8);
				} else {
					var9 = var1.getFile(var8, 0);
				}

				if (var9 == null) {
					var4 = false;
				}
			}
		}

		if (!var4) {
			return null;
		} else {
			try {
				return new Frames(var0, var1, var2, var3);
			} catch (Exception var11) {
				return null;
			}
		}
	}
}
