import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("fa")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "[Lfa;")
	@Export("WorldMapElement_cached")
	static WorldMapElement[] WorldMapElement_cached;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -547648511)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lii;")
	@Export("WorldMapElement_cachedSprites")
	static EvictingDualNodeHashTable WorldMapElement_cachedSprites;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = -1275448415)
	@Export("objectId")
	public final int objectId;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = -15519353)
	@Export("sprite1")
	public int sprite1;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = -555095945)
	@Export("sprite2")
	int sprite2;

	@ObfuscatedName("w")
	@Export("name")
	public String name;

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = -1169351291)
	public int field1834;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 1620342619)
	@Export("textSize")
	public int textSize;

	@ObfuscatedName("t")
	public boolean field1830;

	@ObfuscatedName("z")
	public boolean field1837;

	@ObfuscatedName("r")
	@Export("menuActions")
	public String[] menuActions;

	@ObfuscatedName("u")
	@Export("menuTargetName")
	public String menuTargetName;

	@ObfuscatedName("k")
	int[] field1840;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = -671925561)
	int field1841;

	@ObfuscatedName("x")
	@ObfuscatedGetter(intValue = -2029697455)
	int field1842;

	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = -512044121)
	int field1843;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = -673813715)
	int field1827;

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "Lfk;")
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "Lft;")
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;

	@ObfuscatedName("n")
	int[] field1833;

	@ObfuscatedName("o")
	byte[] field1844;

	@ObfuscatedName("m")
	@ObfuscatedGetter(intValue = 1429465133)
	@Export("category")
	public int category;

	static {
		WorldMapElement_cachedSprites = new EvictingDualNodeHashTable(256);
	}

	WorldMapElement(int var1) {
		this.sprite1 = -1;
		this.sprite2 = -1;
		this.textSize = 0;
		this.field1830 = true;
		this.field1837 = false;
		this.menuActions = new String[5];
		this.field1841 = Integer.MAX_VALUE;
		this.field1842 = Integer.MAX_VALUE;
		this.field1843 = Integer.MIN_VALUE;
		this.field1827 = Integer.MIN_VALUE;
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
		this.category = -1;
		this.objectId = var1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lqt;I)V", garbageValue = "-585264130")
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Lqt;II)V", garbageValue = "-976528863")
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.sprite1 = var1.readNullableLargeSmart();
		} else if (var2 == 2) {
			this.sprite2 = var1.readNullableLargeSmart();
		} else if (var2 == 3) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.field1834 = var1.readMedium();
		} else if (var2 == 5) {
			var1.readMedium();
		} else if (var2 == 6) {
			this.textSize = var1.readUnsignedByte();
		} else {
			int var3;
			if (var2 == 7) {
				var3 = var1.readUnsignedByte();
				if ((var3 & 1) == 0) {
					this.field1830 = false;
				}
				if ((var3 & 2) == 2) {
					this.field1837 = true;
				}
			} else if (var2 == 8) {
				var1.readUnsignedByte();
			} else if (var2 >= 10 && var2 <= 14) {
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) {
				var3 = var1.readUnsignedByte();
				this.field1840 = new int[var3 * 2];
				int var4;
				for (var4 = 0; var4 < var3 * 2; ++var4) {
					this.field1840[var4] = var1.readShort();
				}
				var1.readInt();
				var4 = var1.readUnsignedByte();
				this.field1833 = new int[var4];
				int var5;
				for (var5 = 0; var5 < this.field1833.length; ++var5) {
					this.field1833[var5] = var1.readInt();
				}
				this.field1844 = new byte[var3];
				for (var5 = 0; var5 < var3; ++var5) {
					this.field1844[var5] = var1.readByte();
				}
			} else if (var2 != 16) {
				if (var2 == 17) {
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) {
					var1.readNullableLargeSmart();
				} else if (var2 == 19) {
					this.category = var1.readUnsignedShort();
				} else if (var2 == 21) {
					var1.readInt();
				} else if (var2 == 22) {
					var1.readInt();
				} else if (var2 == 23) {
					var1.readUnsignedByte();
					var1.readUnsignedByte();
					var1.readUnsignedByte();
				} else if (var2 == 24) {
					var1.readShort();
					var1.readShort();
				} else if (var2 == 25) {
					var1.readNullableLargeSmart();
				} else if (var2 == 28) {
					var1.readUnsignedByte();
				} else if (var2 == 29) {
					this.horizontalAlignment = ((HorizontalAlignment) (Actor.findEnumerated(ModeWhere.method6076(), var1.readUnsignedByte())));
				} else if (var2 == 30) {
					this.verticalAlignment = ((VerticalAlignment) (Actor.findEnumerated(class124.method2820(), var1.readUnsignedByte())));
				}
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1501827845")
	void method3377() {
		if (this.field1840 != null) {
			for (int var1 = 0; var1 < this.field1840.length; var1 += 2) {
				if (this.field1840[var1] < this.field1841) {
					this.field1841 = this.field1840[var1];
				} else if (this.field1840[var1] > this.field1843) {
					this.field1843 = this.field1840[var1];
				}
				if (this.field1840[var1 + 1] < this.field1842) {
					this.field1842 = this.field1840[var1 + 1];
				} else if (this.field1840[var1 + 1] > this.field1827) {
					this.field1827 = this.field1840[var1 + 1];
				}
			}
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(ZI)Lqe;", garbageValue = "-1796697978")
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1;
		return this.getSprite(var2);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(IB)Lqe;", garbageValue = "32")
	@Export("getSprite")
	SpritePixels getSprite(int var1) {
		if (var1 < 0) {
			return null;
		} else {
			SpritePixels var2 = ((SpritePixels) (WorldMapElement_cachedSprites.get(((long) (var1)))));
			if (var2 != null) {
				return var2;
			} else {
				var2 = class7.SpriteBuffer_getSprite(class121.WorldMapElement_archive, var1, 0);
				if (var2 != null) {
					WorldMapElement_cachedSprites.put(var2, ((long) (var1)));
				}
				return var2;
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "835027569")
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId;
	}
}