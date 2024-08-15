import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lw")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("aj")
	static int[][][] field3177;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1671439443
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -149249467
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 152436995
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1;
		this.decoration = var2;
		this.rotation = var3;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "0"
	)
	public static int method5951(int var0) {
		return (var0 & class541.field5324) - 1;
	}

	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1974642218"
	)
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0;
	}
}
