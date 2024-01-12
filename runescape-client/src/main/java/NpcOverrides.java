import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hb")
@Implements("NpcOverrides")
public class NpcOverrides {
	@ObfuscatedName("ki")
	@ObfuscatedGetter(
		intValue = 1511812829
	)
	static int field1944;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		longValue = 673336549290330359L
	)
	public long field1943;
	@ObfuscatedName("ap")
	@Export("modelIds")
	int[] modelIds;
	@ObfuscatedName("af")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("aj")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("aq")
	@Export("useLocalPlayer")
	public boolean useLocalPlayer;

	public NpcOverrides(long var1, int[] var3, short[] var4, short[] var5, boolean var6) {
		this.useLocalPlayer = false;
		this.field1943 = var1;
		this.modelIds = var3;
		this.recolorTo = var4;
		this.retextureTo = var5;
		this.useLocalPlayer = var6;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Low;Low;Low;I)V",
		garbageValue = "1762838554"
	)
	public static void method3715(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		SequenceDefinition.SequenceDefinition_archive = var0;
		SequenceDefinition.SequenceDefinition_animationsArchive = var1;
		class332.SequenceDefinition_skeletonsArchive = var2;
	}
}
