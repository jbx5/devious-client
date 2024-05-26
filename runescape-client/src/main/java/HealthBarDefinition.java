import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("HealthBarDefinition_archive")
	public static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	public static AbstractArchive field2064;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("HealthBarDefinition_cached")
	public static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -56080381
	)
	public int field2066;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1523218731
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -163670565
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -210082955
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1523585491
	)
	public int field2069;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1179892719
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 188716697
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -100178739
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1200593249
	)
	@Export("width")
	public int width;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1512758997
	)
	@Export("widthPadding")
	public int widthPadding;

	static {
		HealthBarDefinition_cached = new EvictingDualNodeHashTable(64);
		HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
	}

	public HealthBarDefinition() {
		this.int1 = 255;
		this.int2 = 255;
		this.int3 = -1;
		this.field2069 = 1;
		this.int5 = 70;
		this.frontSpriteID = -1;
		this.backSpriteID = -1;
		this.width = 30;
		this.widthPadding = 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lua;B)V",
		garbageValue = "123"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lua;II)V",
		garbageValue = "-971106859"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 3) {
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 4) {
			this.int3 = 0;
		} else if (var2 == 5) {
			this.int5 = var1.readUnsignedShort();
		} else if (var2 == 6) {
			var1.readUnsignedByte();
		} else if (var2 == 7) {
			this.frontSpriteID = var1.readNullableLargeSmart();
		} else if (var2 == 8) {
			this.backSpriteID = var1.readNullableLargeSmart();
		} else if (var2 == 11) {
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) {
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) {
			this.widthPadding = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Lvc;",
		garbageValue = "882348518"
	)
	@Export("getFrontSprite")
	public SpritePixels getFrontSprite() {
		if (this.frontSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.frontSpriteID);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class542.SpriteBuffer_getSprite(field2064, this.frontSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Lvc;",
		garbageValue = "21"
	)
	@Export("getBackSprite")
	public SpritePixels getBackSprite() {
		if (this.backSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.backSpriteID);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class542.SpriteBuffer_getSprite(field2064, this.backSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID);
				}

				return var1;
			}
		}
	}
}
