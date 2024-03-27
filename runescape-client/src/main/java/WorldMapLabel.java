import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kz")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("az")
	@Export("text")
	String text;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 105380619
	)
	@Export("width")
	int width;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -358328625
	)
	@Export("height")
	int height;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILki;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1;
		this.width = var2;
		this.height = var3;
		this.size = var4;
	}
}
