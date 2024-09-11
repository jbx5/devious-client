import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
@Implements("PlayerCompositionColorTextureOverride")
public class PlayerCompositionColorTextureOverride {
	@ObfuscatedName("go")
	@ObfuscatedGetter(
		intValue = -884459947
	)
	static int field1869;
	@ObfuscatedName("ag")
	@Export("playerCompositionRecolorTo")
	public short[] playerCompositionRecolorTo;
	@ObfuscatedName("am")
	@Export("playerCompositionRetextureTo")
	public short[] playerCompositionRetextureTo;

	public PlayerCompositionColorTextureOverride(int var1) {
		ItemComposition var2 = MouseRecorder.ItemDefinition_get(var1);
		if (var2.method4229()) {
			this.playerCompositionRecolorTo = new short[var2.recolorTo.length];
			System.arraycopy(var2.recolorTo, 0, this.playerCompositionRecolorTo, 0, this.playerCompositionRecolorTo.length);
		}

		if (var2.method4228()) {
			this.playerCompositionRetextureTo = new short[var2.retextureTo.length];
			System.arraycopy(var2.retextureTo, 0, this.playerCompositionRetextureTo, 0, this.playerCompositionRetextureTo.length);
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIS)Ldt;",
		garbageValue = "-18109"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = (var1 << 8) + var0;
		Script var5 = class136.getScript(var3, var0);
		if (var5 != null) {
			return var5;
		} else {
			int var4 = class28.method432(var2, var0);
			var5 = class136.getScript(var4, var0);
			if (var5 != null) {
				return var5;
			} else {
				int var6 = var0 + -512;
				var5 = class136.getScript(var6, var0);
				return var5 != null ? var5 : null;
			}
		}
	}
}
