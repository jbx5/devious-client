import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("cr")
public class class92 {
	@ObfuscatedName("uc")
	@ObfuscatedSignature(descriptor = "Lou;")
	@Export("platformInfo")
	static PlatformInfo platformInfo;

	@ObfuscatedName("iw")
	@ObfuscatedSignature(descriptor = "[Lqj;")
	@Export("headIconHintSprites")
	static SpritePixels[] headIconHintSprites;

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Llc;S)V", garbageValue = "29302")
	public static void method2442(AbstractArchive var0) {
		VarcInt.VarcInt_archive = var0;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1752725574")
	public static void method2441() {
		DbRowType.DBRowType_cache.clear();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)I", garbageValue = "0")
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1;
	}
}