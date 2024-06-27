import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
@Implements("NpcOverrides")
public class NpcOverrides {
	@ObfuscatedName("ur")
	@ObfuscatedGetter(
		intValue = -724193621
	)
	static int field1983;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = 270217235349849859L
	)
	public long field1981;
	@ObfuscatedName("ad")
	@Export("modelIds")
	int[] modelIds;
	@ObfuscatedName("ag")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("ak")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("ap")
	@Export("useLocalPlayer")
	public boolean useLocalPlayer;

	public NpcOverrides(long var1, int[] var3, short[] var4, short[] var5, boolean var6) {
		this.useLocalPlayer = false;
		this.field1981 = var1;
		this.modelIds = var3;
		this.recolorTo = var4;
		this.retextureTo = var5;
		this.useLocalPlayer = var6;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILuy;I)Z",
		garbageValue = "1547081377"
	)
	public static boolean method3699(int var0, class542 var1) {
		return (var0 & var1.rsOrdinal()) != 0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1184142435"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">";
	}
}
