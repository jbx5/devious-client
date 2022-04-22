import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
public enum class83 implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lcs;")

	field1064(0, -1),
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Lcs;")

	field1066(1, 2),
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"Lcs;")

	field1062(2, 3),
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"Lcs;")

	field1061(3, 4),
	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"Lcs;")

	field1067(4, 5),
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"Lcs;")

	field1065(5, 6);

	@ObfuscatedName("uk")
	@ObfuscatedSignature(descriptor = 
	"Llu;")

	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 
	-106805987)

	final int field1060;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	-672454085)

	final int field1063;

	class83(int var3, int var4) {
		this.field1060 = var3;
		this.field1063 = var4;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"16")

	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1063;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(descriptor = 
	"(ILky;IIIII[FI)Lky;", garbageValue = 
	"-511868196")

	static Widget method2111(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
		Widget var8 = new Widget();
		var8.type = var0;
		var8.parentId = var1.id;
		var8.childIndex = var2;
		var8.isIf3 = true;
		var8.xAlignment = var3;
		var8.yAlignment = var4;
		var8.widthAlignment = var5;
		var8.heightAlignment = var6;
		var8.rawX = ((int) (var7[0] * ((float) (var1.width))));
		var8.rawY = ((int) (var7[1] * ((float) (var1.height))));
		var8.rawWidth = ((int) (var7[2] * ((float) (var1.width))));
		var8.rawHeight = ((int) (((float) (var1.height)) * var7[3]));
		return var8;
	}}