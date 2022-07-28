import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("om")
public class class394 extends class395 {
	public class394(int var1) {
		super(var1);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lqw;II)V", garbageValue = "-1563970648")
	void vmethod7115(Buffer var1, int var2) {
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(IIIZII)J", garbageValue = "1613525807")
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4) {
		long var5 = ((long) ((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14)) | (((long) (var4)) & 4294967295L) << 17;
		if (var3) {
			var5 |= 65536L;
		}
		return var5;
	}
}