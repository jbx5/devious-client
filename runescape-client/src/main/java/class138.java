import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
public class class138 extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -855552635
	)
	int field1637;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[[Lfm;"
	)
	public class131[][] field1633;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[[Lfm;"
	)
	class131[][] field1634;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	public Skeleton field1635;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1978354313
	)
	int field1636;
	@ObfuscatedName("ao")
	boolean field1643;
	@ObfuscatedName("ad")
	Future field1638;
	@ObfuscatedName("al")
	List field1639;

	@ObfuscatedSignature(
		descriptor = "(Loc;Loc;IZ)V",
		garbageValue = "0"
	)
	public class138(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1633 = null;
		this.field1634 = null;
		this.field1636 = 0;
		this.field1637 = var3;
		byte[] var5 = var1.takeFile(this.field1637 >> 16 & 65535, this.field1637 & 65535);
		Buffer var6 = new Buffer(var5);
		int var7 = var6.readUnsignedByte();
		int var8 = var6.readUnsignedShort();
		byte[] var9 = var2.getFile(var8, 0);
		this.field1635 = new Skeleton(var8, var9);
		this.field1639 = new ArrayList();
		this.field1638 = class328.field3567.submit(new class135(this, var6, var7));
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;IB)V",
		garbageValue = "26"
	)
	void method3086(Buffer var1, int var2) {
		var1.readUnsignedShort();
		var1.readUnsignedShort();
		this.field1636 = var1.readUnsignedByte();
		int var3 = var1.readUnsignedShort();
		this.field1634 = new class131[this.field1635.method4697().method4642()][];
		this.field1633 = new class131[this.field1635.method4695()][];
		class130[] var4 = new class130[var3];

		int var5;
		int var7;
		for (var5 = 0; var5 < var3; ++var5) {
			class132 var12 = Language.method7195(var1.readUnsignedByte());
			var7 = var1.readShortSmart();
			class133 var13 = AbstractWorldMapData.method5682(var1.readUnsignedByte());
			class131 var14 = new class131();
			var14.method3017(var1, var2);
			var4[var5] = new class130(this, var14, var12, var13, var7);
			int var10 = var12.method3049();
			class131[][] var15;
			if (var12 == class132.field1583) {
				var15 = this.field1634;
			} else {
				var15 = this.field1633;
			}

			if (var15[var7] == null) {
				var15[var7] = new class131[var10];
			}

			if (var12 == class132.field1586) {
				this.field1643 = true;
			}
		}

		var5 = var3 / class154.field1730;
		int var6 = var3 % class154.field1730;
		int var8 = 0;

		for (int var9 = 0; var9 < class154.field1730; ++var9) {
			var7 = var8;
			var8 += var5;
			if (var6 > 0) {
				++var8;
				--var6;
			}

			if (var7 == var8) {
				break;
			}

			this.field1639.add(class328.field3567.submit(new class137(this, var7, var8, var4)));
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "13"
	)
	public boolean method3087() {
		if (this.field1638 == null && this.field1639 == null) {
			return true;
		} else {
			if (this.field1638 != null) {
				if (!this.field1638.isDone()) {
					return false;
				}

				this.field1638 = null;
			}

			boolean var1 = true;

			for (int var2 = 0; var2 < this.field1639.size(); ++var2) {
				if (!((Future)this.field1639.get(var2)).isDone()) {
					var1 = false;
				} else {
					this.field1639.remove(var2);
					--var2;
				}
			}

			if (!var1) {
				return false;
			} else {
				this.field1639 = null;
				return true;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-18"
	)
	public int method3091() {
		return this.field1636;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2042733866"
	)
	public boolean method3089() {
		return this.field1643;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILei;IIS)V",
		garbageValue = "-17614"
	)
	public void method3090(int var1, class128 var2, int var3, int var4) {
		class470 var5 = HealthBar.method2579();
		this.method3106(var5, var3, var2, var1);
		this.method3093(var5, var3, var2, var1);
		this.method3092(var5, var3, var2, var1);
		var2.method2964(var5);
		var5.method8460();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lsq;ILei;IS)V",
		garbageValue = "-6583"
	)
	void method3106(class470 var1, int var2, class128 var3, int var4) {
		float[] var5 = var3.method2983(this.field1636);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1634[var2] != null) {
			class131 var9 = this.field1634[var2][0];
			class131 var10 = this.field1634[var2][1];
			class131 var11 = this.field1634[var2][2];
			if (var9 != null) {
				var6 = var9.method3025(var4);
			}

			if (var10 != null) {
				var7 = var10.method3025(var4);
			}

			if (var11 != null) {
				var8 = var11.method3025(var4);
			}
		}

		class469 var16 = WorldMapData_0.method5232();
		var16.method8383(1.0F, 0.0F, 0.0F, var6);
		class469 var14 = WorldMapData_0.method5232();
		var14.method8383(0.0F, 1.0F, 0.0F, var7);
		class469 var15 = WorldMapData_0.method5232();
		var15.method8383(0.0F, 0.0F, 1.0F, var8);
		class469 var12 = WorldMapData_0.method5232();
		var12.method8382(var15);
		var12.method8382(var16);
		var12.method8382(var14);
		class470 var13 = HealthBar.method2579();
		var13.method8432(var12);
		var1.method8414(var13);
		var16.method8386();
		var14.method8386();
		var15.method8386();
		var12.method8386();
		var13.method8460();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lsq;ILei;IS)V",
		garbageValue = "16165"
	)
	void method3092(class470 var1, int var2, class128 var3, int var4) {
		float[] var5 = var3.method2969(this.field1636);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1634[var2] != null) {
			class131 var9 = this.field1634[var2][3];
			class131 var10 = this.field1634[var2][4];
			class131 var11 = this.field1634[var2][5];
			if (var9 != null) {
				var6 = var9.method3025(var4);
			}

			if (var10 != null) {
				var7 = var10.method3025(var4);
			}

			if (var11 != null) {
				var8 = var11.method3025(var4);
			}
		}

		var1.field4872[12] = var6;
		var1.field4872[13] = var7;
		var1.field4872[14] = var8;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lsq;ILei;IB)V",
		garbageValue = "-33"
	)
	void method3093(class470 var1, int var2, class128 var3, int var4) {
		float[] var5 = var3.method2959(this.field1636);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1634[var2] != null) {
			class131 var9 = this.field1634[var2][6];
			class131 var10 = this.field1634[var2][7];
			class131 var11 = this.field1634[var2][8];
			if (var9 != null) {
				var6 = var9.method3025(var4);
			}

			if (var10 != null) {
				var7 = var10.method3025(var4);
			}

			if (var11 != null) {
				var8 = var11.method3025(var4);
			}
		}

		class470 var12 = HealthBar.method2579();
		var12.method8410(var6, var7, var8);
		var1.method8414(var12);
		var12.method8460();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lhf;",
		garbageValue = "1476190089"
	)
	public static Clock method3101() {
		try {
			return new NanoClock();
		} catch (Throwable var1) {
			return new MilliClock();
		}
	}
}
