import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
public class class182 extends DualNode {
	@ObfuscatedName("sm")
	@ObfuscatedSignature(descriptor = 
	"Lao;")

	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;
	static 
	{
		new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(II)Lgp;", garbageValue = 
	"-1343847522")

	@Export("getParamDefinition")
	public static ParamComposition getParamDefinition(int var0) {
		ParamComposition var1 = ((ParamComposition) (ParamComposition.ParamDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ParamComposition.ParamDefinition_archive.takeFile(11, var0);
			var1 = new ParamComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			ParamComposition.ParamDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}
}