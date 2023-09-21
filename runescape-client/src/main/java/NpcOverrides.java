import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("he")
@Implements("NpcOverrides")
public class NpcOverrides {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = 1811898534278658869L
	)
	public long field2040;
	@ObfuscatedName("al")
	@Export("modelIds")
	int[] modelIds;
	@ObfuscatedName("ak")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("ax")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("ao")
	@Export("useLocalPlayer")
	public boolean useLocalPlayer;

	public NpcOverrides(long var1, int[] var3, short[] var4, short[] var5, boolean var6) {
		this.useLocalPlayer = false;
		this.field2040 = var1;
		this.modelIds = var3;
		this.recolorTo = var4;
		this.retextureTo = var5;
		this.useLocalPlayer = var6;
	}
}
