import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kk")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("qd")
	@ObfuscatedSignature(
		descriptor = "[Lmt;"
	)
	static Widget[] field3003;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 2145670215
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -8386743
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1267645941
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1;
		this.decoration = var2;
		this.rotation = var3;
	}
}
