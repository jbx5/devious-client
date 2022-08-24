import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("dk")
public class class122 extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 47124249)
	int field1500;

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "[[Ldj;")
	public class117[][] field1499 = null;

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "[[Ldj;")
	class117[][] field1501 = null;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lge;")
	public Skeleton field1498;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -1241117003)
	int field1502 = 0;

	@ObfuscatedName("q")
	boolean field1503;

	@ObfuscatedSignature(descriptor = "(Lls;Lls;IZ)V")
	class122(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1500 = var3;
		byte[] var5 = var1.takeFile(this.field1500 >> 16 & '￿', this.field1500 & '￿');
		Buffer var6 = new Buffer(var5);
		int var7 = var6.readUnsignedByte();
		int var8 = var6.readUnsignedShort();
		byte[] var9;
		if (var4) {
			var9 = var2.getFile(0, var8);
		} else {
			var9 = var2.getFile(var8, 0);
		}
		this.field1498 = new Skeleton(var8, var9);
		this.method2738(var6, var7);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Lqr;II)V", garbageValue = "1821026276")
	void method2738(Buffer var1, int var2) {
		var1.readUnsignedShort();
		var1.readUnsignedShort();
		this.field1502 = var1.readUnsignedByte();
		int var3 = var1.readUnsignedShort();
		this.field1501 = new class117[this.field1498.method4044().method4035()][];
		this.field1499 = new class117[this.field1498.method4042()][];
		for (int var4 = 0; var4 < var3; ++var4) {
			int var6 = var1.readUnsignedByte();
			class118[] var7 = new class118[]{ class118.field1464, class118.field1457, class118.field1458, class118.field1459, class118.field1465, class118.field1461 };
			class118 var8 = ((class118) (GameEngine.findEnumerated(var7, var6)));
			if (var8 == null) {
				var8 = class118.field1464;
			}
			int var15 = var1.readShortSmart();
			int var10 = var1.readUnsignedByte();
			class119 var11 = ((class119) (GameEngine.findEnumerated(AttackOption.method2359(), var10)));
			if (var11 == null) {
				var11 = class119.field1488;
			}
			class117 var12 = new class117();
			var12.method2685(var1, var2);
			int var13 = var8.method2714();
			class117[][] var14;
			if (var8 == class118.field1457) {
				var14 = this.field1501;
			} else {
				var14 = this.field1499;
			}
			if (var14[var15] == null) {
				var14[var15] = new class117[var13];
			}
			var14[var15][var11.method2723()] = var12;
			if (var8 == class118.field1465) {
				this.field1503 = true;
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-331412620")
	public int method2753() {
		return this.field1502;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "965641583")
	public boolean method2743() {
		return this.field1503;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(ILdp;III)V", garbageValue = "-1989117578")
	public void method2740(int var1, class115 var2, int var3, int var4) {
		class388 var5 = Language.method5989();
		this.method2741(var5, var3, var2, var1);
		this.method2737(var5, var3, var2, var1);
		this.method2742(var5, var3, var2, var1);
		var2.method2664(var5);
		var5.method6946();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lny;ILdp;IB)V", garbageValue = "-13")
	void method2741(class388 var1, int var2, class115 var3, int var4) {
		float[] var5 = var3.method2648(this.field1502);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1501[var2] != null) {
			class117 var9 = this.field1501[var2][0];
			class117 var10 = this.field1501[var2][1];
			class117 var11 = this.field1501[var2][2];
			if (var9 != null) {
				var6 = var9.method2705(var4);
			}
			if (var10 != null) {
				var7 = var10.method2705(var4);
			}
			if (var11 != null) {
				var8 = var11.method2705(var4);
			}
		}
		class387 var16 = SpriteMask.method5460();
		var16.method6883(1.0F, 0.0F, 0.0F, var6);
		class387 var14 = SpriteMask.method5460();
		var14.method6883(0.0F, 1.0F, 0.0F, var7);
		class387 var15 = SpriteMask.method5460();
		var15.method6883(0.0F, 0.0F, 1.0F, var8);
		class387 var12 = SpriteMask.method5460();
		var12.method6885(var15);
		var12.method6885(var16);
		var12.method6885(var14);
		class388 var13 = Language.method5989();
		var13.method6918(var12);
		var1.method6954(var13);
		var16.method6881();
		var14.method6881();
		var15.method6881();
		var12.method6881();
		var13.method6946();
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(Lny;ILdp;II)V", garbageValue = "-1790393470")
	void method2742(class388 var1, int var2, class115 var3, int var4) {
		float[] var5 = var3.method2649(this.field1502);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1501[var2] != null) {
			class117 var9 = this.field1501[var2][3];
			class117 var10 = this.field1501[var2][4];
			class117 var11 = this.field1501[var2][5];
			if (var9 != null) {
				var6 = var9.method2705(var4);
			}
			if (var10 != null) {
				var7 = var10.method2705(var4);
			}
			if (var11 != null) {
				var8 = var11.method2705(var4);
			}
		}
		var1.field4398[12] = var6;
		var1.field4398[13] = var7;
		var1.field4398[14] = var8;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(Lny;ILdp;II)V", garbageValue = "-1739320011")
	void method2737(class388 var1, int var2, class115 var3, int var4) {
		float[] var5 = var3.method2647(this.field1502);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1501[var2] != null) {
			class117 var9 = this.field1501[var2][6];
			class117 var10 = this.field1501[var2][7];
			class117 var11 = this.field1501[var2][8];
			if (var9 != null) {
				var6 = var9.method2705(var4);
			}
			if (var10 != null) {
				var7 = var10.method2705(var4);
			}
			if (var11 != null) {
				var8 = var11.method2705(var4);
			}
		}
		class388 var12 = Language.method5989();
		var12.method6928(var6, var7, var8);
		var1.method6954(var12);
		var12.method6946();
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(descriptor = "(Lkn;IIII)V", garbageValue = "-1486048779")
	@Export("drawCompass")
	static final void drawCompass(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.getSpriteMask(false);
		if (var4 != null) {
			if (Client.minimapState < 3) {
				class16.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}
		}
	}
}