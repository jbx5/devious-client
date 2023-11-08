import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
public class class139 extends DualNode {
	@ObfuscatedName("ac")
	static ThreadPoolExecutor field1595;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -982980799
	)
	int field1599;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[[Lfm;"
	)
	public class131[][] field1596;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[[Lfm;"
	)
	class131[][] field1597;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	public Skeleton field1600;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 808756239
	)
	int field1598;
	@ObfuscatedName("au")
	boolean field1606;
	@ObfuscatedName("al")
	Future field1602;
	@ObfuscatedName("az")
	List field1603;

	@ObfuscatedSignature(
		descriptor = "(Lol;Lol;IZ)V"
	)
	class139(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1596 = null;
		this.field1597 = null;
		this.field1598 = 0;
		this.field1599 = var3;
		byte[] var5 = var1.takeFile(this.field1599 >> 16 & 65535, this.field1599 & 65535);
		Buffer var6 = new Buffer(var5);
		int var7 = var6.readUnsignedByte();
		int var8 = var6.readUnsignedShort();
		byte[] var9;
		if (var4) {
			var9 = var2.getFile(0, var8);
		} else {
			var9 = var2.getFile(var8, 0);
		}

		this.field1600 = new Skeleton(var8, var9);
		this.field1603 = new ArrayList();
		this.field1602 = field1595.submit(new class138(this, var6, var7));
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Luj;II)V",
		garbageValue = "-170957792"
	)
	void method3163(Buffer var1, int var2) {
		var1.readUnsignedShort();
		var1.readUnsignedShort();
		this.field1598 = var1.readUnsignedByte();
		int var3 = var1.readUnsignedShort();
		this.field1597 = new class131[this.field1600.method5317().method5269()][];
		this.field1596 = new class131[this.field1600.method5316()][];
		class130[] var4 = new class130[var3];

		int var5;
		int var7;
		int var9;
		for (var5 = 0; var5 < var3; ++var5) {
			var7 = var1.readUnsignedByte();
			class132 var16 = (class132)class12.findEnumerated(Language.method7187(), var7);
			if (var16 == null) {
				var16 = class132.field1549;
			}

			var9 = var1.readShortSmart();
			int var11 = var1.readUnsignedByte();
			class133[] var12 = new class133[]{class133.field1575, class133.field1559, class133.field1568, class133.field1579, class133.field1562, class133.field1560, class133.field1564, class133.field1565, class133.field1566, class133.field1567, class133.field1563, class133.field1573, class133.field1570, class133.field1571, class133.field1572, class133.field1561, class133.field1569};
			class133 var13 = (class133)class12.findEnumerated(var12, var11);
			if (var13 == null) {
				var13 = class133.field1575;
			}

			class131 var20 = new class131();
			var20.method3128(var1, var2);
			var4[var5] = new class130(this, var20, var16, var13, var9);
			int var14 = var16.method3136();
			class131[][] var15;
			if (var16 == class132.field1550) {
				var15 = this.field1597;
			} else {
				var15 = this.field1596;
			}

			if (var15[var9] == null) {
				var15[var9] = new class131[var14];
			}

			if (var16 == class132.field1557) {
				this.field1606 = true;
			}
		}

		var5 = var3 / FloorDecoration.field2713;
		int var6 = var3 % FloorDecoration.field2713;
		int var8 = 0;

		for (var9 = 0; var9 < FloorDecoration.field2713; ++var9) {
			var7 = var8;
			var8 += var5;
			if (var6 > 0) {
				++var8;
				--var6;
			}

			if (var8 == var7) {
				break;
			}

			this.field1603.add(field1595.submit(new class134(this, var7, var8, var4)));
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "136"
	)
	public boolean method3164() {
		if (this.field1602 == null && this.field1603 == null) {
			return true;
		} else {
			if (this.field1602 != null) {
				if (!this.field1602.isDone()) {
					return false;
				}

				this.field1602 = null;
			}

			boolean var1 = true;

			for (int var2 = 0; var2 < this.field1603.size(); ++var2) {
				if (!((Future)this.field1603.get(var2)).isDone()) {
					var1 = false;
				} else {
					this.field1603.remove(var2);
					--var2;
				}
			}

			if (!var1) {
				return false;
			} else {
				this.field1603 = null;
				return true;
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "53"
	)
	public int method3190() {
		return this.field1598;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-99"
	)
	public boolean method3187() {
		return this.field1606;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILej;III)V",
		garbageValue = "-685417553"
	)
	public void method3167(int var1, class128 var2, int var3, int var4) {
		class462 var5 = WorldMapDecoration.method4928();
		this.method3166(var5, var3, var2, var1);
		this.method3192(var5, var3, var2, var1);
		this.method3169(var5, var3, var2, var1);
		var2.method3044(var5);
		var5.method8459();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lrz;ILej;II)V",
		garbageValue = "2098789523"
	)
	void method3166(class462 var1, int var2, class128 var3, int var4) {
		float[] var5 = var3.method3047(this.field1598);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1597[var2] != null) {
			class131 var9 = this.field1597[var2][0];
			class131 var10 = this.field1597[var2][1];
			class131 var11 = this.field1597[var2][2];
			if (var9 != null) {
				var6 = var9.method3100(var4);
			}

			if (var10 != null) {
				var7 = var10.method3100(var4);
			}

			if (var11 != null) {
				var8 = var11.method3100(var4);
			}
		}

		class461 var16 = class214.method4228();
		var16.method8408(1.0F, 0.0F, 0.0F, var6);
		class461 var14 = class214.method4228();
		var14.method8408(0.0F, 1.0F, 0.0F, var7);
		class461 var15 = class214.method4228();
		var15.method8408(0.0F, 0.0F, 1.0F, var8);
		class461 var12 = class214.method4228();
		var12.method8410(var15);
		var12.method8410(var16);
		var12.method8410(var14);
		class462 var13 = WorldMapDecoration.method4928();
		var13.method8446(var12);
		var1.method8445(var13);
		var16.method8424();
		var14.method8424();
		var15.method8424();
		var12.method8424();
		var13.method8459();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lrz;ILej;II)V",
		garbageValue = "1029943917"
	)
	void method3169(class462 var1, int var2, class128 var3, int var4) {
		float[] var5 = var3.method3049(this.field1598);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1597[var2] != null) {
			class131 var9 = this.field1597[var2][3];
			class131 var10 = this.field1597[var2][4];
			class131 var11 = this.field1597[var2][5];
			if (var9 != null) {
				var6 = var9.method3100(var4);
			}

			if (var10 != null) {
				var7 = var10.method3100(var4);
			}

			if (var11 != null) {
				var8 = var11.method3100(var4);
			}
		}

		var1.field4772[12] = var6;
		var1.field4772[13] = var7;
		var1.field4772[14] = var8;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lrz;ILej;IB)V",
		garbageValue = "-43"
	)
	void method3192(class462 var1, int var2, class128 var3, int var4) {
		float[] var5 = var3.method3050(this.field1598);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1597[var2] != null) {
			class131 var9 = this.field1597[var2][6];
			class131 var10 = this.field1597[var2][7];
			class131 var11 = this.field1597[var2][8];
			if (var9 != null) {
				var6 = var9.method3100(var4);
			}

			if (var10 != null) {
				var7 = var10.method3100(var4);
			}

			if (var11 != null) {
				var8 = var11.method3100(var4);
			}
		}

		class462 var12 = WorldMapDecoration.method4928();
		var12.method8443(var6, var7, var8);
		var1.method8445(var12);
		var12.method8459();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-1858381549"
	)
	@Export("randomDatData2")
	public static byte[] randomDatData2() {
		byte[] var0 = new byte[24];

		try {
			JagexCache.JagexCache_randomDat.seek(0L);
			JagexCache.JagexCache_randomDat.readFully(var0);

			int var1;
			for (var1 = 0; var1 < 24 && var0[var1] == 0; ++var1) {
			}

			if (var1 >= 24) {
				throw new IOException();
			}
		} catch (Exception var4) {
			for (int var2 = 0; var2 < 24; ++var2) {
				var0[var2] = -1;
			}
		}

		return var0;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-1700881747"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0;
		Login.Login_response2 = var1;
		Login.Login_response3 = var2;
	}
}
