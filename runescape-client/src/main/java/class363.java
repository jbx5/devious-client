import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nu")
public class class363 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	static final class363 field3974;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	static final class363 field3970;
	@ObfuscatedName("gt")
	@Export("characterId")
	static String characterId;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1415350717
	)
	final int field3971;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1877149343
	)
	final int field3972;

	static {
		field3974 = new class363(51, 27, 800, 0, 16, 16);
		field3970 = new class363(25, 28, 800, 656, 40, 40);
	}

	class363(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field3971 = var5;
		this.field3972 = var6;
	}
}
