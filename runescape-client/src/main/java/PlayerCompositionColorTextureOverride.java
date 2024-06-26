import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
@Implements("PlayerCompositionColorTextureOverride")
public class PlayerCompositionColorTextureOverride {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("ag")
	@Export("playerCompositionRecolorTo")
	public short[] playerCompositionRecolorTo;
	@ObfuscatedName("ak")
	@Export("playerCompositionRetextureTo")
	public short[] playerCompositionRetextureTo;

	PlayerCompositionColorTextureOverride(int var1) {
		ItemComposition var2 = class164.ItemDefinition_get(var1);
		if (var2.method3977()) {
			this.playerCompositionRecolorTo = new short[var2.recolorTo.length];
			System.arraycopy(var2.recolorTo, 0, this.playerCompositionRecolorTo, 0, this.playerCompositionRecolorTo.length);
		}

		if (var2.method3978()) {
			this.playerCompositionRetextureTo = new short[var2.retextureTo.length];
			System.arraycopy(var2.retextureTo, 0, this.playerCompositionRetextureTo, 0, this.playerCompositionRetextureTo.length);
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Lfr;",
		garbageValue = "65367968"
	)
	static class143 method3537(int var0) {
		class143[] var1 = new class143[]{class143.field1663, class143.field1666, class143.field1662, class143.field1667, class143.field1671, class143.field1670, class143.field1668, class143.field1664, class143.field1669};
		class143 var2 = (class143)class210.findEnumerated(var1, var0);
		if (var2 == null) {
			var2 = class143.field1669;
		}

		return var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([BB)[B",
		garbageValue = "52"
	)
	static byte[] method3539(byte[] var0) {
		int var1 = var0.length;
		byte[] var2 = new byte[var1];
		System.arraycopy(var0, 0, var2, 0, var1);
		return var2;
	}
}
