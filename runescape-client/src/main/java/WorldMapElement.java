import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("WorldMapElement_archive")
	public static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "[Lfh;"
	)
	@Export("WorldMapElement_cached")
	public static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 517354743
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("WorldMapElement_cachedSprites")
	static EvictingDualNodeHashTable WorldMapElement_cachedSprites;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 666751609
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -46725577
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1619334869
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("q")
	@Export("name")
	public String name;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 2069218199
	)
	public int field1845;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 527391355
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("v")
	public boolean field1855;
	@ObfuscatedName("h")
	public boolean field1856;
	@ObfuscatedName("t")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("u")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("d")
	int[] field1859;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1422588785
	)
	int field1861;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -864218917
	)
	int field1851;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 2028882753
	)
	int field1857;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1627228615
	)
	int field1863;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("i")
	int[] field1866;
	@ObfuscatedName("r")
	byte[] field1867;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 270915399
	)
	@Export("category")
	public int category;

	static {
		WorldMapElement_cachedSprites = new EvictingDualNodeHashTable(256); // L: 16
	}

	public WorldMapElement(int var1) {
		this.sprite1 = -1; // L: 18
		this.sprite2 = -1; // L: 19
		this.textSize = 0; // L: 22
		this.field1855 = true; // L: 24
		this.field1856 = false; // L: 25
		this.menuActions = new String[5]; // L: 26
		this.field1861 = Integer.MAX_VALUE; // L: 29
		this.field1851 = Integer.MAX_VALUE; // L: 30
		this.field1857 = Integer.MIN_VALUE; // L: 31
		this.field1863 = Integer.MIN_VALUE; // L: 32
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered; // L: 33
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered; // L: 34
		this.category = -1; // L: 37
		this.objectId = var1; // L: 40
	} // L: 41

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lqq;B)V",
		garbageValue = "38"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 52
			if (var2 == 0) { // L: 53
				return; // L: 56
			}

			this.decodeNext(var1, var2); // L: 54
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqq;IB)V",
		garbageValue = "33"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 59
			this.sprite1 = var1.readNullableLargeSmart();
		} else if (var2 == 2) { // L: 60
			this.sprite2 = var1.readNullableLargeSmart();
		} else if (var2 == 3) { // L: 61
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 62
			this.field1845 = var1.readMedium();
		} else if (var2 == 5) { // L: 63
			var1.readMedium(); // L: 64
		} else if (var2 == 6) { // L: 66
			this.textSize = var1.readUnsignedByte();
		} else {
			int var3;
			if (var2 == 7) { // L: 67
				var3 = var1.readUnsignedByte(); // L: 68
				if ((var3 & 1) == 0) { // L: 69
					this.field1855 = false;
				}

				if ((var3 & 2) == 2) { // L: 70
					this.field1856 = true;
				}
			} else if (var2 == 8) { // L: 72
				var1.readUnsignedByte(); // L: 73
			} else if (var2 >= 10 && var2 <= 14) { // L: 75
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) { // L: 76
				var3 = var1.readUnsignedByte(); // L: 77
				this.field1859 = new int[var3 * 2]; // L: 78

				int var4;
				for (var4 = 0; var4 < var3 * 2; ++var4) { // L: 79
					this.field1859[var4] = var1.readShort();
				}

				var1.readInt(); // L: 80
				var4 = var1.readUnsignedByte(); // L: 81
				this.field1866 = new int[var4]; // L: 82

				int var5;
				for (var5 = 0; var5 < this.field1866.length; ++var5) { // L: 83
					this.field1866[var5] = var1.readInt();
				}

				this.field1867 = new byte[var3]; // L: 84

				for (var5 = 0; var5 < var3; ++var5) { // L: 85
					this.field1867[var5] = var1.readByte();
				}
			} else if (var2 != 16) { // L: 87
				if (var2 == 17) { // L: 88
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) { // L: 89
					var1.readNullableLargeSmart(); // L: 90
				} else if (var2 == 19) { // L: 92
					this.category = var1.readUnsignedShort();
				} else if (var2 == 21) { // L: 93
					var1.readInt(); // L: 94
				} else if (var2 == 22) { // L: 96
					var1.readInt(); // L: 97
				} else if (var2 == 23) { // L: 99
					var1.readUnsignedByte(); // L: 100
					var1.readUnsignedByte(); // L: 101
					var1.readUnsignedByte(); // L: 102
				} else if (var2 == 24) { // L: 104
					var1.readShort(); // L: 105
					var1.readShort(); // L: 106
				} else if (var2 == 25) { // L: 108
					var1.readNullableLargeSmart(); // L: 109
				} else if (var2 == 28) { // L: 111
					var1.readUnsignedByte(); // L: 112
				} else if (var2 == 29) { // L: 114
					this.horizontalAlignment = (HorizontalAlignment)Varps.findEnumerated(SoundCache.method834(), var1.readUnsignedByte()); // L: 115
				} else if (var2 == 30) { // L: 117
					this.verticalAlignment = (VerticalAlignment)Varps.findEnumerated(Message.method1144(), var1.readUnsignedByte()); // L: 118
				}
			}
		}

	} // L: 121

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	public void method3538() {
		if (this.field1859 != null) { // L: 124
			for (int var1 = 0; var1 < this.field1859.length; var1 += 2) { // L: 125
				if (this.field1859[var1] < this.field1861) { // L: 126
					this.field1861 = this.field1859[var1];
				} else if (this.field1859[var1] > this.field1857) {
					this.field1857 = this.field1859[var1]; // L: 127
				}

				if (this.field1859[var1 + 1] < this.field1851) { // L: 128
					this.field1851 = this.field1859[var1 + 1];
				} else if (this.field1859[var1 + 1] > this.field1863) {
					this.field1863 = this.field1859[var1 + 1]; // L: 129
				}
			}
		}

	} // L: 132

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ZB)Lqi;",
		garbageValue = "62"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1; // L: 135
		return this.getSprite(var2); // L: 136
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)Lqi;",
		garbageValue = "936206529"
	)
	@Export("getSprite")
	SpritePixels getSprite(int var1) {
		if (var1 < 0) { // L: 140
			return null;
		} else {
			SpritePixels var2 = (SpritePixels)WorldMapElement_cachedSprites.get((long)var1); // L: 141
			if (var2 != null) { // L: 142
				return var2;
			} else {
				var2 = class114.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0); // L: 143
				if (var2 != null) { // L: 144
					WorldMapElement_cachedSprites.put(var2, (long)var1); // L: 145
				}

				return var2; // L: 147
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "21708"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId; // L: 151
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "74"
	)
	static final int method3556(int var0, int var1, int var2) {
		int var3 = var0 / var2; // L: 945
		int var4 = var0 & var2 - 1; // L: 946
		int var5 = var1 / var2; // L: 947
		int var6 = var1 & var2 - 1; // L: 948
		int var7 = Script.method2129(var3, var5); // L: 949
		int var8 = Script.method2129(var3 + 1, var5); // L: 950
		int var9 = Script.method2129(var3, var5 + 1); // L: 951
		int var10 = Script.method2129(var3 + 1, var5 + 1); // L: 952
		int var11 = Bounds.method7094(var7, var8, var4, var2); // L: 953
		int var12 = Bounds.method7094(var9, var10, var4, var2); // L: 954
		return Bounds.method7094(var11, var12, var6, var2); // L: 955
	}
}
