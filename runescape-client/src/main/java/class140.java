import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
public class class140 extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -2048217997
	)
	int field1639;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[[Lfr;"
	)
	public class132[][] field1632;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[[Lfr;"
	)
	class132[][] field1634;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	public Skeleton field1635;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 955178619
	)
	int field1636;
	@ObfuscatedName("as")
	boolean field1633;
	@ObfuscatedName("ao")
	Future field1638;
	@ObfuscatedName("au")
	List field1637;

	@ObfuscatedSignature(
		descriptor = "(Lof;Lof;IZ)V"
	)
	class140(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1632 = null;
		this.field1634 = null;
		this.field1636 = 0;
		this.field1639 = var3;
		byte[] var5 = var1.takeFile(this.field1639 >> 16 & 65535, this.field1639 & 65535);
		Buffer var6 = new Buffer(var5);
		int var7 = var6.readUnsignedByte();
		int var8 = var6.readUnsignedShort();
		byte[] var9;
		if (var4) {
			var9 = var2.getFile(0, var8);
		} else {
			var9 = var2.getFile(var8, 0);
		}

		this.field1635 = new Skeleton(var8, var9);
		this.field1637 = new ArrayList();
		this.field1638 = GrandExchangeOfferUnitPriceComparator.field4467.submit(new class139(this, var6, var7));
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Luq;II)V",
		garbageValue = "-883395869"
	)
	void method3153(Buffer var1, int var2) {
		var1.readUnsignedShort();
		var1.readUnsignedShort();
		this.field1636 = var1.readUnsignedByte();
		int var3 = var1.readUnsignedShort();
		this.field1634 = new class132[this.field1635.method5414().method5345()][];
		this.field1632 = new class132[this.field1635.method5411()][];
		class131[] var4 = new class131[var3];

		int var5;
		int var7;
		int var9;
		for (var5 = 0; var5 < var3; ++var5) {
			var7 = var1.readUnsignedByte();
			class133[] var16 = new class133[]{class133.field1590, class133.field1580, class133.field1586, class133.field1591, class133.field1583, class133.field1584};
			class133 var17 = (class133)class356.findEnumerated(var16, var7);
			if (var17 == null) {
				var17 = class133.field1590;
			}

			var9 = var1.readShortSmart();
			int var11 = var1.readUnsignedByte();
			class134 var12 = (class134)class356.findEnumerated(class136.method3142(), var11);
			if (var12 == null) {
				var12 = class134.field1595;
			}

			class132 var13 = new class132();
			var13.method3099(var1, var2);
			var4[var5] = new class131(this, var13, var17, var12, var9);
			int var14 = var17.method3111();
			class132[][] var15;
			if (var17 == class133.field1580) {
				var15 = this.field1634;
			} else {
				var15 = this.field1632;
			}

			if (var15[var9] == null) {
				var15[var9] = new class132[var14];
			}

			if (var17 == class133.field1583) {
				this.field1633 = true;
			}
		}

		var5 = var3 / class520.field5121;
		int var6 = var3 % class520.field5121;
		int var8 = 0;

		for (var9 = 0; var9 < class520.field5121; ++var9) {
			var7 = var8;
			var8 += var5;
			if (var6 > 0) {
				++var8;
				--var6;
			}

			if (var7 == var8) {
				break;
			}

			this.field1637.add(GrandExchangeOfferUnitPriceComparator.field4467.submit(new class135(this, var7, var8, var4)));
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1351092140"
	)
	public boolean method3160() {
		if (this.field1638 == null && this.field1637 == null) {
			return true;
		} else {
			if (this.field1638 != null) {
				if (!this.field1638.isDone()) {
					return false;
				}

				this.field1638 = null;
			}

			boolean var1 = true;

			for (int var2 = 0; var2 < this.field1637.size(); ++var2) {
				if (!((Future)this.field1637.get(var2)).isDone()) {
					var1 = false;
				} else {
					this.field1637.remove(var2);
					--var2;
				}
			}

			if (!var1) {
				return false;
			} else {
				this.field1637 = null;
				return true;
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "23"
	)
	public int method3155() {
		return this.field1636;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "2"
	)
	public boolean method3156() {
		return this.field1633;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILez;IIB)V",
		garbageValue = "0"
	)
	public void method3159(int var1, class129 var2, int var3, int var4) {
		class469 var5 = UserComparator9.method2965();
		this.method3172(var5, var3, var2, var1);
		this.method3165(var5, var3, var2, var1);
		this.method3158(var5, var3, var2, var1);
		var2.method3027(var5);
		var5.method8648();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lsr;ILez;II)V",
		garbageValue = "1394144447"
	)
	void method3172(class469 var1, int var2, class129 var3, int var4) {
		float[] var5 = var3.method3061(this.field1636);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1634[var2] != null) {
			class132 var9 = this.field1634[var2][0];
			class132 var10 = this.field1634[var2][1];
			class132 var11 = this.field1634[var2][2];
			if (var9 != null) {
				var6 = var9.method3085(var4);
			}

			if (var10 != null) {
				var7 = var10.method3085(var4);
			}

			if (var11 != null) {
				var8 = var11.method3085(var4);
			}
		}

		class468 var16 = class350.method6940();
		var16.method8592(1.0F, 0.0F, 0.0F, var6);
		class468 var14 = class350.method6940();
		var14.method8592(0.0F, 1.0F, 0.0F, var7);
		class468 var15 = class350.method6940();
		var15.method8592(0.0F, 0.0F, 1.0F, var8);
		class468 var12 = class350.method6940();
		var12.method8594(var15);
		var12.method8594(var16);
		var12.method8594(var14);
		class469 var13 = UserComparator9.method2965();
		var13.method8660(var12);
		var1.method8633(var13);
		var16.method8597();
		var14.method8597();
		var15.method8597();
		var12.method8597();
		var13.method8648();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lsr;ILez;IB)V",
		garbageValue = "52"
	)
	void method3158(class469 var1, int var2, class129 var3, int var4) {
		float[] var5 = var3.method3031(this.field1636);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1634[var2] != null) {
			class132 var9 = this.field1634[var2][3];
			class132 var10 = this.field1634[var2][4];
			class132 var11 = this.field1634[var2][5];
			if (var9 != null) {
				var6 = var9.method3085(var4);
			}

			if (var10 != null) {
				var7 = var10.method3085(var4);
			}

			if (var11 != null) {
				var8 = var11.method3085(var4);
			}
		}

		var1.field4843[12] = var6;
		var1.field4843[13] = var7;
		var1.field4843[14] = var8;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lsr;ILez;II)V",
		garbageValue = "492204297"
	)
	void method3165(class469 var1, int var2, class129 var3, int var4) {
		float[] var5 = var3.method3063(this.field1636);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1634[var2] != null) {
			class132 var9 = this.field1634[var2][6];
			class132 var10 = this.field1634[var2][7];
			class132 var11 = this.field1634[var2][8];
			if (var9 != null) {
				var6 = var9.method3085(var4);
			}

			if (var10 != null) {
				var7 = var10.method3085(var4);
			}

			if (var11 != null) {
				var8 = var11.method3085(var4);
			}
		}

		class469 var12 = UserComparator9.method2965();
		var12.method8631(var6, var7, var8);
		var1.method8633(var12);
		var12.method8648();
	}

	@ObfuscatedName("aq")
	static double method3167(double var0) {
		return Math.exp(var0 * -var0 / 2.0D) / Math.sqrt(6.283185307179586D);
	}
}
