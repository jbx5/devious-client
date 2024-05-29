import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("VarbitDefinition_archive")
	static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("VarbitDefinition_cached")
	static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("aa")
	static final int[] field2221;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	@Export("ItemDefinition_fontPlain11")
	static Font ItemDefinition_fontPlain11;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1882753779
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1148518977
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -2059703331
	)
	@Export("endBit")
	public int endBit;

	static {
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64);
		field2221 = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			field2221[var1] = var0 - 1;
			var0 += var0;
		}

	}

	VarbitComposition() {
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lua;B)V",
		garbageValue = "7"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lua;IB)V",
		garbageValue = "1"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.baseVar = var1.readUnsignedShort();
			this.startBit = var1.readUnsignedByte();
			this.endBit = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1954901642"
	)
	public static void method4078() {
		Arrays.fill(Varps.Varps_temp, 0);
		Arrays.fill(Varps.Varps_main, 0);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)[Lvc;",
		garbageValue = "1667279669"
	)
	static SpritePixels[] method4089() {
		SpritePixels[] var0 = new SpritePixels[SpriteBufferProperties.SpriteBuffer_spriteCount];

		for (int var1 = 0; var1 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var1) {
			SpritePixels var2 = var0[var1] = new SpritePixels();
			var2.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
			var2.height = class351.SpriteBuffer_spriteHeight;
			var2.xOffset = SpriteBufferProperties.SpriteBuffer_xOffsets[var1];
			var2.yOffset = SpriteBufferProperties.SpriteBuffer_yOffsets[var1];
			var2.subWidth = SpriteBufferProperties.SpriteBuffer_spriteWidths[var1];
			var2.subHeight = SpriteBufferProperties.SpriteBuffer_spriteHeights[var1];
			int var3 = var2.subHeight * var2.subWidth;
			byte[] var4 = PlayerCompositionColorTextureOverride.SpriteBuffer_pixels[var1];
			var2.pixels = new int[var3];

			for (int var5 = 0; var5 < var3; ++var5) {
				var2.pixels[var5] = UrlRequest.SpriteBuffer_spritePalette[var4[var5] & 255];
			}
		}

		SpriteBufferProperties.SpriteBuffer_xOffsets = null;
		SpriteBufferProperties.SpriteBuffer_yOffsets = null;
		SpriteBufferProperties.SpriteBuffer_spriteWidths = null;
		SpriteBufferProperties.SpriteBuffer_spriteHeights = null;
		UrlRequest.SpriteBuffer_spritePalette = null;
		PlayerCompositionColorTextureOverride.SpriteBuffer_pixels = null;
		return var0;
	}
}
