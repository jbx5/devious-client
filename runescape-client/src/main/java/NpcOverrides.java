import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("hp")
@Implements("NpcOverrides")
public class NpcOverrides {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = -7765607775079087559L
	)
	public long field1996;
	@ObfuscatedName("ae")
	@Export("modelIds")
	int[] modelIds;
	@ObfuscatedName("ag")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("am")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("ax")
	@Export("useLocalPlayer")
	public boolean useLocalPlayer;

	public NpcOverrides(long var1, int[] var3, short[] var4, short[] var5, boolean var6) {
		this.useLocalPlayer = false;
		this.field1996 = var1;
		this.modelIds = var3;
		this.recolorTo = var4;
		this.retextureTo = var5;
		this.useLocalPlayer = var6;
	}
}
