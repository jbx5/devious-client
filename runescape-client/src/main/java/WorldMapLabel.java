import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jk")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("at")
	@Export("text")
	String text;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -415719505
	)
	@Export("width")
	int width;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -481945253
	)
	@Export("height")
	int height;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILio;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1;
		this.width = var2;
		this.height = var3;
		this.size = var4;
	}
}
