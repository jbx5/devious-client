import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lb")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	static final WorldMapID field3133;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	static final WorldMapID field3134;
	@ObfuscatedName("ap")
	@Export("ByteArrayPool_altSizeArrayCounts")
	static int[] ByteArrayPool_altSizeArrayCounts;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1244405373
	)
	@Export("value")
	final int value;

	static {
		field3133 = new WorldMapID(0);
		field3134 = new WorldMapID(1);
	}

	WorldMapID(int var1) {
		this.value = var1;
	}
}
