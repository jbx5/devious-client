import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
public class class122 extends DualNode {
	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 
	756927065)

	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("be")
	@ObfuscatedSignature(descriptor = 
	"Lpe;")

	@Export("loginType")
	static LoginType loginType;
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	-1723408099)

	int field1470;
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"[[Ldt;")

	public class117[][] field1474;
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"[[Ldt;")

	class117[][] field1471;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	2014722717)

	int field1469;
	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 
	-332212275)

	int field1473;
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"Lha;")

	public Skeleton field1472;
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 
	1571742799)

	int field1475;
	@ObfuscatedName("l")
	boolean field1476;

	@ObfuscatedSignature(descriptor = 
	"(Lln;Lln;IZ)V", garbageValue = 
	"0")

	public class122(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1474 = null;
		this.field1471 = null;
		this.field1475 = 0;
		this.field1470 = var3;
		byte[] var5 = var1.takeFile((this.field1470 >> 16) & 65535, this.field1470 & 65535);
		Buffer var6 = new Buffer(var5);
		int var7 = var6.readUnsignedByte();
		int var8 = var6.readUnsignedShort();
		byte[] var9 = var2.getFile(var8, 0);
		this.field1472 = new Skeleton(var8, var9);
		this.method2780(var6, var7);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;II)V", garbageValue = 
	"-1615717546")

	void method2780(Buffer var1, int var2) {
		this.field1469 = var1.readUnsignedShort();
		this.field1473 = var1.readUnsignedShort();
		this.field1475 = var1.readUnsignedByte();
		int var3 = var1.readUnsignedShort();
		this.field1471 = new class117[this.field1472.method4721().method4698()][];
		this.field1474 = new class117[this.field1472.method4720()][];

		for (int var4 = 0; var4 < var3; ++var4) {
			class118 var5 = TriBool.method6838(var1.readUnsignedByte());
			int var6 = var1.readShortSmart();
			int var8 = var1.readUnsignedByte();
			class119 var9 = ((class119) (MusicPatchPcmStream.findEnumerated(GrandExchangeOfferTotalQuantityComparator.method5977(), var8)));
			if (var9 == null) {
				var9 = class119.field1449;
			}

			class117 var10 = new class117();
			var10.method2708(var1, var2);
			int var11 = var5.method2739();
			class117[][] var12;
			if (var5 == class118.field1430) {
				var12 = this.field1471;
			} else {
				var12 = this.field1474;
			}

			if (var12[var6] == null) {
				var12[var6] = new class117[var11];
			}

			var12[var6][var9.method2751()] = var10;
			if (var5 == class118.field1434) {
				this.field1476 = true;
			}
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"35")

	int method2764() {
		return this.field1469;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"1732677053")

	int method2781() {
		return this.field1473;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(S)I", garbageValue = 
	"30516")

	public int method2766() {
		return this.field1475;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"5")

	public int method2762() {
		return this.method2781() - this.method2764();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"-1927278316")

	public boolean method2768() {
		return this.field1476;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(ILda;III)V", garbageValue = 
	"-1716818444")

	public void method2796(int var1, class115 var2, int var3, int var4) {
		class387 var5;
		synchronized(class387.field4346) {
			if (class387.field4347 == 0) {
				var5 = new class387();
			} else {
				class387.field4346[--class387.field4347].method7011();
				var5 = class387.field4346[class387.field4347];
			}
		}

		this.method2763(var5, var3, var2, var1);
		this.method2793(var5, var3, var2, var1);
		this.method2771(var5, var3, var2, var1);
		var2.method2676(var5);
		var5.method7029();
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(Lnt;ILda;II)V", garbageValue = 
	"-1176349802")

	void method2763(class387 var1, int var2, class115 var3, int var4) {
		float[] var5 = var3.method2672(this.field1475);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1471[var2] != null) {
			class117 var9 = this.field1471[var2][0];
			class117 var10 = this.field1471[var2][1];
			class117 var11 = this.field1471[var2][2];
			if (var9 != null) {
				var6 = var9.method2709(var4);
			}

			if (var10 != null) {
				var7 = var10.method2709(var4);
			}

			if (var11 != null) {
				var8 = var11.method2709(var4);
			}
		}

		class386 var17 = class120.method2761();
		var17.method6984(1.0F, 0.0F, 0.0F, var6);
		class386 var18 = class120.method2761();
		var18.method6984(0.0F, 1.0F, 0.0F, var7);
		class386 var19 = class120.method2761();
		var19.method6984(0.0F, 0.0F, 1.0F, var8);
		class386 var12 = class120.method2761();
		var12.method6986(var19);
		var12.method6986(var17);
		var12.method6986(var18);
		class387 var13;
		synchronized(class387.field4346) {
			if (class387.field4347 == 0) {
				var13 = new class387();
			} else {
				class387.field4346[--class387.field4347].method7011();
				var13 = class387.field4346[class387.field4347];
			}
		}

		var13.method7006(var12);
		var1.method7017(var13);
		var17.method6988();
		var18.method6988();
		var19.method6988();
		var12.method6988();
		var13.method7029();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"(Lnt;ILda;IB)V", garbageValue = 
	"-70")

	void method2771(class387 var1, int var2, class115 var3, int var4) {
		float[] var5 = var3.method2673(this.field1475);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1471[var2] != null) {
			class117 var9 = this.field1471[var2][3];
			class117 var10 = this.field1471[var2][4];
			class117 var11 = this.field1471[var2][5];
			if (var9 != null) {
				var6 = var9.method2709(var4);
			}

			if (var10 != null) {
				var7 = var10.method2709(var4);
			}

			if (var11 != null) {
				var8 = var11.method2709(var4);
			}
		}

		var1.field4348[12] = var6;
		var1.field4348[13] = var7;
		var1.field4348[14] = var8;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(Lnt;ILda;II)V", garbageValue = 
	"16711935")

	void method2793(class387 var1, int var2, class115 var3, int var4) {
		float[] var5 = var3.method2674(this.field1475);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1471[var2] != null) {
			class117 var9 = this.field1471[var2][6];
			class117 var10 = this.field1471[var2][7];
			class117 var11 = this.field1471[var2][8];
			if (var9 != null) {
				var6 = var9.method2709(var4);
			}

			if (var10 != null) {
				var7 = var10.method2709(var4);
			}

			if (var11 != null) {
				var8 = var11.method2709(var4);
			}
		}

		class387 var14;
		synchronized(class387.field4346) {
			if (class387.field4347 == 0) {
				var14 = new class387();
			} else {
				class387.field4346[--class387.field4347].method7011();
				var14 = class387.field4346[class387.field4347];
			}
		}

		var14.method7049(var6, var7, var8);
		var1.method7017(var14);
		var14.method7029();
	}
}