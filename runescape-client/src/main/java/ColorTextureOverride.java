import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
@ObfuscatedName("fy")
@Implements("ColorTextureOverride")
public class ColorTextureOverride
{
	@ObfuscatedName("q")
	public short[] colorToReplaceWith;

	@ObfuscatedName("f")
	public short[] textureToReplaceWith;

	ColorTextureOverride(int var1) {
		ItemComposition var2 = EnumComposition.ItemDefinition_get(var1);
		if (var2.method3737()) {
			this.colorToReplaceWith = new short[var2.recolorTo.length];
			System.arraycopy(var2.recolorTo, 0, this.colorToReplaceWith, 0, this.colorToReplaceWith.length);
		}
		if (var2.method3728()) {
			this.textureToReplaceWith = new short[var2.retextureTo.length];
			System.arraycopy(var2.retextureTo, 0, this.textureToReplaceWith, 0, this.textureToReplaceWith.length);
		}
	}
}