import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
@Implements("PlayerCompositionColorTextureOverride")
public class PlayerCompositionColorTextureOverride {
	@ObfuscatedName("ai")
	@Export("playerCompositionRecolorTo")
	public short[] playerCompositionRecolorTo;
	@ObfuscatedName("ay")
	@Export("playerCompositionRetextureTo")
	public short[] playerCompositionRetextureTo;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -696863097
	)
	public int field1868;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1537294829
	)
	public int field1873;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 691042437
	)
	public int field1874;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1412606641
	)
	public int field1875;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1581438825
	)
	public int field1876;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	public Model field1867;

	public PlayerCompositionColorTextureOverride(int var1) {
		this.field1868 = -1;
		this.field1873 = -1;
		this.field1874 = -1;
		this.field1875 = -1;
		ItemComposition var2 = Bounds.ItemDefinition_get(var1);
		if (var2.method4273()) {
			this.playerCompositionRecolorTo = new short[var2.recolorTo.length];
			System.arraycopy(var2.recolorTo, 0, this.playerCompositionRecolorTo, 0, this.playerCompositionRecolorTo.length);
		}

		if (var2.method4288()) {
			this.playerCompositionRetextureTo = new short[var2.retextureTo.length];
			System.arraycopy(var2.retextureTo, 0, this.playerCompositionRetextureTo, 0, this.playerCompositionRetextureTo.length);
		}

		this.field1876 = var2.model;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "39274700"
	)
	public boolean method3829() {
		return this.playerCompositionRecolorTo != null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1317446268"
	)
	public boolean method3830() {
		return this.playerCompositionRetextureTo != null;
	}
}
