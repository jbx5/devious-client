import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
public class class138 extends DualNode {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1871715735
	)
	int field1602;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[[Lfx;"
	)
	public class131[][] field1598;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[[Lfx;"
	)
	class131[][] field1599;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	public Skeleton field1601;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 189412585
	)
	int field1604;
	@ObfuscatedName("ar")
	boolean field1603;
	@ObfuscatedName("ae")
	Future field1600;
	@ObfuscatedName("aa")
	List field1597;

	@ObfuscatedSignature(
		descriptor = "(Low;Low;IZ)V",
		garbageValue = "0"
	)
	public class138(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1598 = null;
		this.field1599 = null;
		this.field1604 = 0;
		this.field1602 = var3;
		byte[] var5 = var1.takeFile(this.field1602 >> 16 & 65535, this.field1602 & 65535);
		Buffer var6 = new Buffer(var5);
		int var7 = var6.readUnsignedByte();
		int var8 = var6.readUnsignedShort();
		byte[] var9 = var2.getFile(var8, 0);
		this.field1601 = new Skeleton(var8, var9);
		this.field1597 = new ArrayList();
		this.field1600 = AsyncHttpResponse.field85.submit(new class135(this, var6, var7));
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;IB)V",
		garbageValue = "-101"
	)
	void method3158(Buffer var1, int var2) {
		var1.readUnsignedShort();
		var1.readUnsignedShort();
		this.field1604 = var1.readUnsignedByte();
		int var3 = var1.readUnsignedShort();
		this.field1599 = new class131[this.field1601.method5373().method5323()][];
		this.field1598 = new class131[this.field1601.method5372()][];
		class130[] var4 = new class130[var3];

		int var5;
		int var7;
		int var9;
		for (var5 = 0; var5 < var3; ++var5) {
			var7 = var1.readUnsignedByte();
			class132 var14 = (class132)GrandExchangeEvents.findEnumerated(BuddyRankComparator.method2996(), var7);
			if (var14 == null) {
				var14 = class132.field1555;
			}

			var9 = var1.readShortSmart();
			class133 var16 = class53.method1096(var1.readUnsignedByte());
			class131 var17 = new class131();
			var17.method3083(var1, var2);
			var4[var5] = new class130(this, var17, var14, var16, var9);
			int var12 = var14.method3117();
			class131[][] var13;
			if (var14 == class132.field1553) {
				var13 = this.field1599;
			} else {
				var13 = this.field1598;
			}

			if (var13[var9] == null) {
				var13[var9] = new class131[var12];
			}

			if (var14 == class132.field1556) {
				this.field1603 = true;
			}
		}

		var5 = var3 / class74.field897;
		int var6 = var3 % class74.field897;
		int var8 = 0;

		for (var9 = 0; var9 < class74.field897; ++var9) {
			var7 = var8;
			var8 += var5;
			if (var6 > 0) {
				++var8;
				--var6;
			}

			if (var8 == var7) {
				break;
			}

			this.field1597.add(AsyncHttpResponse.field85.submit(new class137(this, var7, var8, var4)));
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "714723337"
	)
	public boolean method3159() {
		if (this.field1600 == null && this.field1597 == null) {
			return true;
		} else {
			if (this.field1600 != null) {
				if (!this.field1600.isDone()) {
					return false;
				}

				this.field1600 = null;
			}

			boolean var1 = true;

			for (int var2 = 0; var2 < this.field1597.size(); ++var2) {
				if (!((Future)this.field1597.get(var2)).isDone()) {
					var1 = false;
				} else {
					this.field1597.remove(var2);
					--var2;
				}
			}

			if (!var1) {
				return false;
			} else {
				this.field1597 = null;
				return true;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-50964561"
	)
	public int method3160() {
		return this.field1604;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1751305567"
	)
	public boolean method3161() {
		return this.field1603;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILez;III)V",
		garbageValue = "-1787937822"
	)
	public void method3162(int var1, class128 var2, int var3, int var4) {
		class466 var5 = class255.method5035();
		this.method3163(var5, var3, var2, var1);
		this.method3183(var5, var3, var2, var1);
		this.method3164(var5, var3, var2, var1);
		var2.method3053(var5);
		var5.method8559();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lrh;ILez;II)V",
		garbageValue = "284391843"
	)
	void method3163(class466 var1, int var2, class128 var3, int var4) {
		float[] var5 = var3.method3051(this.field1604);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1599[var2] != null) {
			class131 var9 = this.field1599[var2][0];
			class131 var10 = this.field1599[var2][1];
			class131 var11 = this.field1599[var2][2];
			if (var9 != null) {
				var6 = var9.method3086(var4);
			}

			if (var10 != null) {
				var7 = var10.method3086(var4);
			}

			if (var11 != null) {
				var8 = var11.method3086(var4);
			}
		}

		class465 var22;
		synchronized(class465.field4800) {
			if (class465.field4801 == 0) {
				var22 = new class465();
			} else {
				class465.field4800[--class465.field4801].method8515();
				var22 = class465.field4800[class465.field4801];
			}
		}

		var22.method8514(1.0F, 0.0F, 0.0F, var6);
		class465 var23;
		synchronized(class465.field4800) {
			if (class465.field4801 == 0) {
				var23 = new class465();
			} else {
				class465.field4800[--class465.field4801].method8515();
				var23 = class465.field4800[class465.field4801];
			}
		}

		var23.method8514(0.0F, 1.0F, 0.0F, var7);
		class465 var13;
		synchronized(class465.field4800) {
			if (class465.field4801 == 0) {
				var13 = new class465();
			} else {
				class465.field4800[--class465.field4801].method8515();
				var13 = class465.field4800[class465.field4801];
			}
		}

		var13.method8514(0.0F, 0.0F, 1.0F, var8);
		class465 var15;
		synchronized(class465.field4800) {
			if (class465.field4801 == 0) {
				var15 = new class465();
			} else {
				class465.field4800[--class465.field4801].method8515();
				var15 = class465.field4800[class465.field4801];
			}
		}

		var15.method8531(var13);
		var15.method8531(var22);
		var15.method8531(var23);
		class466 var17 = class255.method5035();
		var17.method8590(var15);
		var1.method8552(var17);
		var22.method8533();
		var23.method8533();
		var13.method8533();
		var15.method8533();
		var17.method8559();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lrh;ILez;IB)V",
		garbageValue = "9"
	)
	void method3164(class466 var1, int var2, class128 var3, int var4) {
		float[] var5 = var3.method3054(this.field1604);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1599[var2] != null) {
			class131 var9 = this.field1599[var2][3];
			class131 var10 = this.field1599[var2][4];
			class131 var11 = this.field1599[var2][5];
			if (var9 != null) {
				var6 = var9.method3086(var4);
			}

			if (var10 != null) {
				var7 = var10.method3086(var4);
			}

			if (var11 != null) {
				var8 = var11.method3086(var4);
			}
		}

		var1.field4809[12] = var6;
		var1.field4809[13] = var7;
		var1.field4809[14] = var8;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lrh;ILez;II)V",
		garbageValue = "-1361275855"
	)
	void method3183(class466 var1, int var2, class128 var3, int var4) {
		float[] var5 = var3.method3040(this.field1604);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1599[var2] != null) {
			class131 var9 = this.field1599[var2][6];
			class131 var10 = this.field1599[var2][7];
			class131 var11 = this.field1599[var2][8];
			if (var9 != null) {
				var6 = var9.method3086(var4);
			}

			if (var10 != null) {
				var7 = var10.method3086(var4);
			}

			if (var11 != null) {
				var8 = var11.method3086(var4);
			}
		}

		class466 var12 = class255.method5035();
		var12.method8579(var6, var7, var8);
		var1.method8552(var12);
		var12.method8559();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-30"
	)
	public static boolean method3165(int var0) {
		return var0 == WorldMapDecorationType.field3906.id;
	}

	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "37"
	)
	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0);

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
			var1 = var1.substring(0, var2) + "," + var1.substring(var2);
		}

		if (var1.length() > 9) {
			return " " + class208.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + class208.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + class208.colorStartTag(16776960) + var1 + "</col>";
		}
	}
}
