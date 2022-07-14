import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
@ObfuscatedName("fy")
@Implements("PlayerCompositionColorTextureOverride")
public class PlayerCompositionColorTextureOverride
{
	@ObfuscatedName("q")
	public short[] playerCompositionRecolorTo;

	@ObfuscatedName("f")
	public short[] playerCompositionRetextureTo;

	PlayerCompositionColorTextureOverride(int var1) {
		ItemComposition var2 = EnumComposition.ItemDefinition_get(var1);
		if (var2.method3737()) {
			this.playerCompositionRecolorTo = new short[var2.recolorTo.length];
			System.arraycopy(var2.recolorTo, 0, this.playerCompositionRecolorTo, 0, this.playerCompositionRecolorTo.length);
		}
		if (var2.method3728()) {
			this.playerCompositionRetextureTo = new short[var2.retextureTo.length];
			System.arraycopy(var2.retextureTo, 0, this.playerCompositionRetextureTo, 0, this.playerCompositionRetextureTo.length);
		}
	}
}