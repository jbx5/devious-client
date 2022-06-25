import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("da")
public class class122 extends DualNode {
	@ObfuscatedName("dw")
	@Export("mouseCam")
	static boolean mouseCam;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 1032049851)
	int field1521;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "[[Ldo;")
	public class117[][] field1518;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "[[Ldo;")
	class117[][] field1519;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 2048888313)
	int field1520;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = -1006791161)
	int field1524;

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "Lgm;")
	public Skeleton field1523;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 2081794131)
	int field1522;

	@ObfuscatedName("w")
	boolean field1525;

	@ObfuscatedSignature(descriptor = "(Llh;Llh;IZ)V")
	class122(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1518 = null;
		this.field1519 = null;
		this.field1522 = 0;
		this.field1521 = var3;
		byte[] var5 = var1.takeFile(this.field1521 >> 16 & 65535, this.field1521 & 65535);
		Buffer var6 = new Buffer(var5);
		int var7 = var6.readUnsignedByte();
		int var8 = var6.readUnsignedShort();
		byte[] var9;
		if (var4) {
			var9 = var2.getFile(0, var8);
		} else {
			var9 = var2.getFile(var8, 0);
		}
		this.field1523 = new Skeleton(var8, var9);
		this.method2762(var6, var7);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Lqt;IB)V", garbageValue = "73")
	void method2762(Buffer var1, int var2) {
		this.field1520 = var1.readUnsignedShort();
		this.field1524 = var1.readUnsignedShort();
		this.field1522 = var1.readUnsignedByte();
		int var3 = var1.readUnsignedShort();
		this.field1519 = new class117[this.field1523.method4150().method4130()][];
		this.field1518 = new class117[this.field1523.method4148()][];
		for (int var4 = 0; var4 < var3; ++var4) {
			class118 var5 = class82.method2116(var1.readUnsignedByte());
			int var6 = var1.readShortSmartSub64();
			class119 var7 = class19.method254(var1.readUnsignedByte());
			class117 var8 = new class117();
			var8.method2702(var1, var2);
			int var9 = var5.method2736();
			class117[][] var10;
			if (var5 == class118.field1477) {
				var10 = this.field1519;
			} else {
				var10 = this.field1518;
			}
			if (var10[var6] == null) {
				var10[var6] = new class117[var9];
			}
			var10[var6][var7.method2747()] = var8;
			if (var5 == class118.field1480) {
				this.field1525 = true;
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-44")
	int method2786() {
		return this.field1520;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1215555890")
	int method2765() {
		return this.field1524;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-60")
	public int method2766() {
		return this.field1522;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1618023267")
	public int method2767() {
		return this.method2765() - this.method2786();
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-631493485")
	public boolean method2778() {
		return this.field1525;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(ILdc;III)V", garbageValue = "-6832140")
	public void method2790(int var1, class115 var2, int var3, int var4) {
		class387 var5 = MenuAction.method1884();
		this.method2770(var5, var3, var2, var1);
		this.method2772(var5, var3, var2, var1);
		this.method2779(var5, var3, var2, var1);
		var2.method2656(var5);
		var5.method6968();
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(Lny;ILdc;II)V", garbageValue = "1743460808")
	void method2770(class387 var1, int var2, class115 var3, int var4) {
		float[] var5 = var3.method2660(this.field1522);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1519[var2] != null) {
			class117 var9 = this.field1519[var2][0];
			class117 var10 = this.field1519[var2][1];
			class117 var11 = this.field1519[var2][2];
			if (var9 != null) {
				var6 = var9.method2701(var4);
			}
			if (var10 != null) {
				var7 = var10.method2701(var4);
			}
			if (var11 != null) {
				var8 = var11.method2701(var4);
			}
		}
		class386 var22;
		synchronized(class386.field4389) {
			if (class386.field4385 == 0) {
				var22 = new class386();
			} else {
				class386.field4389[--class386.field4385].method6951();
				var22 = class386.field4389[class386.field4385];
			}
		}
		var22.method6945(1.0F, 0.0F, 0.0F, var6);
		class386 var23;
		synchronized(class386.field4389) {
			if (class386.field4385 == 0) {
				var23 = new class386();
			} else {
				class386.field4389[--class386.field4385].method6951();
				var23 = class386.field4389[class386.field4385];
			}
		}
		var23.method6945(0.0F, 1.0F, 0.0F, var7);
		class386 var13;
		synchronized(class386.field4389) {
			if (class386.field4385 == 0) {
				var13 = new class386();
			} else {
				class386.field4389[--class386.field4385].method6951();
				var13 = class386.field4389[class386.field4385];
			}
		}
		var13.method6945(0.0F, 0.0F, 1.0F, var8);
		class386 var15;
		synchronized(class386.field4389) {
			if (class386.field4385 == 0) {
				var15 = new class386();
			} else {
				class386.field4389[--class386.field4385].method6951();
				var15 = class386.field4389[class386.field4385];
			}
		}
		var15.method6938(var13);
		var15.method6938(var22);
		var15.method6938(var23);
		class387 var17 = MenuAction.method1884();
		var17.method6967(var15);
		var1.method6962(var17);
		var22.method6936();
		var23.method6936();
		var13.method6936();
		var15.method6936();
		var17.method6968();
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(Lny;ILdc;II)V", garbageValue = "75323291")
	void method2779(class387 var1, int var2, class115 var3, int var4) {
		float[] var5 = var3.method2661(this.field1522);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1519[var2] != null) {
			class117 var9 = this.field1519[var2][3];
			class117 var10 = this.field1519[var2][4];
			class117 var11 = this.field1519[var2][5];
			if (var9 != null) {
				var6 = var9.method2701(var4);
			}
			if (var10 != null) {
				var7 = var10.method2701(var4);
			}
			if (var11 != null) {
				var8 = var11.method2701(var4);
			}
		}
		var1.field4394[12] = var6;
		var1.field4394[13] = var7;
		var1.field4394[14] = var8;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lny;ILdc;II)V", garbageValue = "518596926")
	void method2772(class387 var1, int var2, class115 var3, int var4) {
		float[] var5 = var3.method2679(this.field1522);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1519[var2] != null) {
			class117 var9 = this.field1519[var2][6];
			class117 var10 = this.field1519[var2][7];
			class117 var11 = this.field1519[var2][8];
			if (var9 != null) {
				var6 = var9.method2701(var4);
			}
			if (var10 != null) {
				var7 = var10.method2701(var4);
			}
			if (var11 != null) {
				var8 = var11.method2701(var4);
			}
		}
		class387 var12 = MenuAction.method1884();
		var12.method6964(var6, var7, var8);
		var1.method6962(var12);
		var12.method6968();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(II)Lgr;", garbageValue = "51486487")
	public static HitSplatDefinition method2800(int var0) {
		HitSplatDefinition var1 = ((HitSplatDefinition) (HitSplatDefinition.HitSplatDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0);
			var1 = new HitSplatDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}
			HitSplatDefinition.HitSplatDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(IIIB)I", garbageValue = "58")
	public static int method2763(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var0;
		} else if (var2 == 1) {
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 : 7 - var1;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(II)Ljava/lang/String;", garbageValue = "-1164971790")
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">";
	}
}