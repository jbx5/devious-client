import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
@Implements("NpcOverrides")
public class NpcOverrides {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = 4282587655698285525L
	)
	public long field2001;
	@ObfuscatedName("aw")
	@Export("modelIds")
	int[] modelIds;
	@ObfuscatedName("ak")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("aj")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("ai")
	@Export("useLocalPlayer")
	public boolean useLocalPlayer;

	public NpcOverrides(long var1, int[] var3, short[] var4, short[] var5, boolean var6) {
		this.useLocalPlayer = false;
		this.field2001 = var1;
		this.modelIds = var3;
		this.recolorTo = var4;
		this.retextureTo = var5;
		this.useLocalPlayer = var6;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1170097408"
	)
	public static int method3989(int var0) {
		if (var0 > 0) {
			return 1;
		} else {
			return var0 < 0 ? -1 : 0;
		}
	}
}
