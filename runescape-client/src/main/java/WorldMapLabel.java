import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("am")
	@Export("text")
	String text;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -567280081
	)
	@Export("width")
	int width;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 636723921
	)
	@Export("height")
	int height;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILjm;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1;
		this.width = var2;
		this.height = var3;
		this.size = var4;
	}
}
