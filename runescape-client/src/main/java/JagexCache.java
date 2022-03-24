




import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.Implements; import net.runelite.mapping.ObfuscatedGetter; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("sw")
	@ObfuscatedGetter(intValue = 
	-1318999061)

	static int field1737;
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Llq;")

	@Export("EnumDefinition_archive")
	public static AbstractArchive EnumDefinition_archive;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	728211147)

	@Export("idxCount")
	public static int idxCount;
	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = 
	"Lpz;")

	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Lpz;")

	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = 
	"Lpz;")

	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("es")
	@ObfuscatedSignature(descriptor = 
	"Llu;")

	@Export("archive18")
	static Archive archive18;
	@ObfuscatedName("pl")
	@ObfuscatedSignature(descriptor = 
	"Lcm;")

	@Export("varcs")
	static Varcs varcs;
	static 
	{
		JagexCache_randomDat = null;
		JagexCache_dat2File = null;
		JagexCache_idx255File = null;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(IIB)I", garbageValue = 
	"-95")

	public static int method3206(int var0, int var1) {
		int var2;
		for (var2 = 1; var1 > 1; var1 >>= 1) {
			if ((var1 & 1) != 0) {
				var2 = var0 * var2;
			}

			var0 *= var0;
		}

		if (var1 == 1) {
			return var0 * var2;
		} else {
			return var2;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(B)[Ld;", garbageValue = 
	"3")

	public static class6[] method3224() {
		return new class6[]{ class6.field22 };
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(IZI)Ljava/lang/String;", garbageValue = 
	"-49864634")

	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		return var1 && (var0 >= 0) ? class345.method6478(var0, 10, var1) : Integer.toString(var0);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(descriptor = 
	"(ILbo;ZI)I", garbageValue = 
	"-1964989648")

	static int method3227(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) {
			Client.logoutTimer = 250;
			return 1;
		} else if ((var0 != 5631) && (var0 != 5633)) {
			if (var0 == 5632) {
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 26;
				return 1;
			} else {
				return 2;
			}
		} else {
			ChatChannel.Interpreter_stringStackSize -= 2;
			return 1;
		}
	}
}