import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
@Implements("NpcOverrides")
public class NpcOverrides {
	@ObfuscatedName("hr")
	static int[] field2029;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		longValue = -3325561176002089741L
	)
	public long field2026;
	@ObfuscatedName("ae")
	@Export("modelIds")
	int[] modelIds;
	@ObfuscatedName("ao")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("at")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("ac")
	@Export("useLocalPlayer")
	public boolean useLocalPlayer;

	public NpcOverrides(long var1, int[] var3, short[] var4, short[] var5, boolean var6) {
		this.useLocalPlayer = false;
		this.field2026 = var1;
		this.modelIds = var3;
		this.recolorTo = var4;
		this.retextureTo = var5;
		this.useLocalPlayer = var6;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "29"
	)
	public static int method3686(int var0) {
		return var0 >>> 4 & class508.field5059;
	}

	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "(Lmi;I)I",
		garbageValue = "-282927864"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get((long)var0.childIndex + ((long)var0.id << 32));
		return var1 != null ? var1.integer : var0.flags;
	}
}
