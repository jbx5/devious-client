import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Llq;")

	@Export("VarbitDefinition_archive")
	public static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Liq;")

	@Export("VarbitDefinition_cached")
	public static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("n")
	static final int[] field1983;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	-603401275)

	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 
	-902508973)

	@Export("startBit")
	public int startBit;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	-1508398865)

	@Export("endBit")
	public int endBit;
	static 
	{
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64);
		field1983 = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			field1983[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;B)V", garbageValue = 
	"58")

	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		} 
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;IB)V", garbageValue = 
	"-96")

	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.baseVar = var1.readUnsignedShort();
			this.startBit = var1.readUnsignedByte();
			this.endBit = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(Ldi;FI)F", garbageValue = 
	"-1168558464")

	static float method3555(class117 var0, float var1) {
		if (var0 == null) {
			return 0.0F;
		} else {
			float var2;
			if (var0.field1432 == var1) {
				var2 = 0.0F;
			} else if (var1 == var0.field1433) {
				var2 = 1.0F;
			} else {
				var2 = (var1 - var0.field1432) / (var0.field1433 - var0.field1432);
			}

			float var3;
			if (var0.field1438) {
				var3 = var2;
			} else {
				float[] var4 = new float[]{ var0.field1440[0] - var2, var0.field1440[1], var0.field1440[2], var0.field1440[3] };
				float[] var5 = new float[5];
				int var6 = class154.method3129(var4, 3, 0.0F, true, 1.0F, true, var5);
				if (var6 == 1) {
					var3 = var5[0];
				} else {
					var3 = 0.0F;
				}
			}

			return ((var0.field1435[1] + (((var0.field1435[3] * var3) + var0.field1435[2]) * var3)) * var3) + var0.field1435[0];
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"(IB)Z", garbageValue = 
	"13")

	public static boolean method3561(int var0) {
		return ((var0 >> 31) & 1) != 0;
	}
}