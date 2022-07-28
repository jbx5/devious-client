import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("fi")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("HealthBarDefinition_archive")
	public static AbstractArchive HealthBarDefinition_archive;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Llc;")
	public static AbstractArchive field1867;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lia;")
	@Export("HealthBarDefinition_cached")
	public static EvictingDualNodeHashTable HealthBarDefinition_cached = new EvictingDualNodeHashTable(64);

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Lia;")
	@Export("HealthBarDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64);

	@ObfuscatedName("bh")
	@ObfuscatedGetter(intValue = -133294807)
	static int field1864;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 2071720317)
	public int field1879;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 1693646113)
	@Export("int1")
	public int int1 = 255;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 2023940309)
	@Export("int2")
	public int int2 = 255;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = -593192551)
	@Export("int3")
	public int int3 = -1;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = -1064921901)
	public int field1872 = 1;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 679969197)
	@Export("int5")
	public int int5 = 70;

	@ObfuscatedName("x")
	@ObfuscatedGetter(intValue = -896018383)
	@Export("frontSpriteID")
	int frontSpriteID = -1;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 355495379)
	@Export("backSpriteID")
	int backSpriteID = -1;

	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = 1723689519)
	@Export("width")
	public int width = 30;

	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 896637811)
	@Export("widthPadding")
	public int widthPadding = 0;

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lqw;I)V", garbageValue = "451365314")
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lqw;II)V", garbageValue = "1666740492")
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(B)Lqj;", garbageValue = "61")
	@Export("getFrontSprite")
	public SpritePixels getFrontSprite() {
		if (this.frontSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = ((SpritePixels) (HealthBarDefinition_cachedSprites.get(((long) (this.frontSpriteID)))));
			if (var1 != null) {
				return var1;
			} else {
				var1 = SoundSystem.SpriteBuffer_getSprite(field1867, this.frontSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, ((long) (this.frontSpriteID)));
				}
				return var1;
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(I)Lqj;", garbageValue = "-1635351520")
	@Export("getBackSprite")
	public SpritePixels getBackSprite() {
		if (this.backSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = ((SpritePixels) (HealthBarDefinition_cachedSprites.get(((long) (this.backSpriteID)))));
			if (var1 != null) {
				return var1;
			} else {
				var1 = SoundSystem.SpriteBuffer_getSprite(field1867, this.backSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, ((long) (this.backSpriteID)));
				}
				return var1;
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lqy;II)V", garbageValue = "-1208790636")
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset;
		Players.Players_pendingUpdateCount = 0;
		WorldMapLabelSize.method4532(var0);
		NetCache.method5973(var0);
		if (var0.offset - var2 != var1) {
			throw new RuntimeException(var0.offset - var2 + " " + var1);
		}
	}
}