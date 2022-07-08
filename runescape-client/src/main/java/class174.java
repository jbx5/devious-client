import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("fu")
public class class174 {
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "Lct;")
	@Export("World_request")
	static UrlRequest World_request;

	@ObfuscatedName("br")
	@ObfuscatedGetter(intValue = 1359206661)
	static int field1891;

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(IB)Lgf;", garbageValue = "-64")
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "16")
	static final boolean method3458() {
		return ViewportMouse.ViewportMouse_isInViewport;
	}
}