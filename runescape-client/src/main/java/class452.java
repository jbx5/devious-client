import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rc")
public class class452 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("ItemDefinition_fontPlain11")
	public static Font ItemDefinition_fontPlain11;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -953571091
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;
	@ObfuscatedName("au")
	float[] field4756;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1920274461
	)
	int field4757;

	class452(float[] var1, int var2) {
		this.field4756 = var1;
		this.field4757 = var2;
	}
}
