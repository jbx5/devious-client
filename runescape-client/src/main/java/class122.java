import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
public class class122 extends DualNode {
	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = 
	"Lpd;")

	@Export("NetCache_reference")
	static Buffer NetCache_reference;
	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = 
	"Llq;")

	@Export("Widget_archive")
	public static AbstractArchive Widget_archive;
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	514562923)

	int field1486;
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"[[Ldi;")

	public class117[][] field1480;
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"[[Ldi;")

	class117[][] field1490;
	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 
	1741171979)

	int field1483;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	-123796151)

	int field1484;
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"Lgq;")

	public Skeleton field1485;
	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 
	1830571413)

	int field1482;
	@ObfuscatedName("f")
	boolean field1487;

	@ObfuscatedSignature(descriptor = 
	"(Llq;Llq;IZ)V", garbageValue = 
	"0")

	public class122(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1480 = null;
		this.field1490 = null;
		this.field1482 = 0;
		this.field1486 = var3;
		byte[] var5 = var1.takeFile((this.field1486 >> 16) & 65535, this.field1486 & 65535);
		Buffer var6 = new Buffer(var5);
		int var7 = var6.readUnsignedByte();
		int var8 = var6.readUnsignedShort();
		byte[] var9 = var2.getFile(var8, 0);
		this.field1485 = new Skeleton(var8, var9);
		this.method2758(var6, var7);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;II)V", garbageValue = 
	"-1270112984")

	void method2758(Buffer var1, int var2) {
		this.field1483 = var1.readUnsignedShort();
		this.field1484 = var1.readUnsignedShort();
		this.field1482 = var1.readUnsignedByte();
		int var3 = var1.readUnsignedShort();
		this.field1490 = new class117[this.field1485.method4120().method4098()][];
		this.field1480 = new class117[this.field1485.method4119()][];

		for (int var4 = 0; var4 < var3; ++var4) {
			int var6 = var1.readUnsignedByte();
			class118[] var7 = new class118[]{ class118.field1452, class118.field1444, class118.field1443, class118.field1446, class118.field1445, class118.field1448 };
			class118 var8 = ((class118) (ChatChannel.findEnumerated(var7, var6)));
			if (var8 == null) {
				var8 = class118.field1452;
			}

			int var15 = var1.readShortSmart();
			int var10 = var1.readUnsignedByte();
			class119 var11 = ((class119) (ChatChannel.findEnumerated(AbstractWorldMapIcon.method5059(), var10)));
			if (var11 == null) {
				var11 = class119.field1457;
			}

			class117 var12 = new class117();
			var12.method2722(var1, var2);
			int var13 = var8.method2727();
			class117[][] var14;
			if (var8 == class118.field1444) {
				var14 = this.field1490;
			} else {
				var14 = this.field1480;
			}

			if (var14[var15] == null) {
				var14[var15] = new class117[var13];
			}

			var14[var15][var11.method2751()] = var12;
			if (var8 == class118.field1445) {
				this.field1487 = true;
			}
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"-1494944281")

	int method2759() {
		return this.field1483;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(S)I", garbageValue = 
	"-18228")

	int method2767() {
		return this.field1484;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"-1883189895")

	public int method2783() {
		return this.field1482;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"-1616413534")

	public int method2771() {
		return this.method2767() - this.method2759();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(B)Z", garbageValue = 
	"-2")

	public boolean method2784() {
		return this.field1487;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(ILdq;IIB)V", garbageValue = 
	"5")

	public void method2763(int var1, class115 var2, int var3, int var4) {
		class387 var5 = HealthBarDefinition.method3428();
		this.method2764(var5, var3, var2, var1);
		this.method2766(var5, var3, var2, var1);
		this.method2765(var5, var3, var2, var1);
		var2.method2654(var5);
		var5.method7095();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(Lnu;ILdq;II)V", garbageValue = 
	"-966244253")

	void method2764(class387 var1, int var2, class115 var3, int var4) {
		float[] var5 = var3.method2658(this.field1482);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1490[var2] != null) {
			class117 var9 = this.field1490[var2][0];
			class117 var10 = this.field1490[var2][1];
			class117 var11 = this.field1490[var2][2];
			if (var9 != null) {
				var6 = var9.method2700(var4);
			}

			if (var10 != null) {
				var7 = var10.method2700(var4);
			}

			if (var11 != null) {
				var8 = var11.method2700(var4);
			}
		}

		class386 var16 = KeyHandler.method378();
		var16.method7032(1.0F, 0.0F, 0.0F, var6);
		class386 var14 = KeyHandler.method378();
		var14.method7032(0.0F, 1.0F, 0.0F, var7);
		class386 var15 = KeyHandler.method378();
		var15.method7032(0.0F, 0.0F, 1.0F, var8);
		class386 var12 = KeyHandler.method378();
		var12.method7036(var15);
		var12.method7036(var16);
		var12.method7036(var14);
		class387 var13 = HealthBarDefinition.method3428();
		var13.method7069(var12);
		var1.method7109(var13);
		var16.method7043();
		var14.method7043();
		var15.method7043();
		var12.method7043();
		var13.method7095();
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"(Lnu;ILdq;II)V", garbageValue = 
	"-43276704")

	void method2765(class387 var1, int var2, class115 var3, int var4) {
		float[] var5 = var3.method2652(this.field1482);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1490[var2] != null) {
			class117 var9 = this.field1490[var2][3];
			class117 var10 = this.field1490[var2][4];
			class117 var11 = this.field1490[var2][5];
			if (var9 != null) {
				var6 = var9.method2700(var4);
			}

			if (var10 != null) {
				var7 = var10.method2700(var4);
			}

			if (var11 != null) {
				var8 = var11.method2700(var4);
			}
		}

		var1.field4347[12] = var6;
		var1.field4347[13] = var7;
		var1.field4347[14] = var8;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(Lnu;ILdq;IB)V", garbageValue = 
	"-10")

	void method2766(class387 var1, int var2, class115 var3, int var4) {
		float[] var5 = var3.method2687(this.field1482);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1490[var2] != null) {
			class117 var9 = this.field1490[var2][6];
			class117 var10 = this.field1490[var2][7];
			class117 var11 = this.field1490[var2][8];
			if (var9 != null) {
				var6 = var9.method2700(var4);
			}

			if (var10 != null) {
				var7 = var10.method2700(var4);
			}

			if (var11 != null) {
				var8 = var11.method2700(var4);
			}
		}

		class387 var12 = HealthBarDefinition.method3428();
		var12.method7066(var6, var7, var8);
		var1.method7109(var12);
		var12.method7095();
	}
}