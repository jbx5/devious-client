import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("WorldMapElement_archive")
	public static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lgv;"
	)
	@Export("WorldMapElement_cached")
	public static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -691696597
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 2072628321
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 136196307
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -191734477
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("az")
	@Export("name")
	public String name;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1726711249
	)
	public int field1873;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -982771965
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("ah")
	public boolean field1867;
	@ObfuscatedName("aj")
	public boolean field1876;
	@ObfuscatedName("af")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("ax")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("an")
	int[] field1878;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 438515125
	)
	int field1880;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -731494081
	)
	int field1881;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 244407737
	)
	int field1882;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1270222061
	)
	int field1883;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lhk;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("ac")
	int[] field1886;
	@ObfuscatedName("ab")
	byte[] field1865;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1542604189
	)
	@Export("category")
	public int category;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(256);
	}

	public WorldMapElement(int var1) {
		this.sprite1 = -1;
		this.sprite2 = -1;
		this.textSize = 0;
		this.field1867 = true;
		this.field1876 = false;
		this.menuActions = new String[5];
		this.field1880 = Integer.MAX_VALUE;
		this.field1881 = Integer.MAX_VALUE;
		this.field1882 = Integer.MIN_VALUE;
		this.field1883 = Integer.MIN_VALUE;
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
		this.category = -1;
		this.objectId = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "-1667648408"
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
		descriptor = "(Luq;IS)V",
		garbageValue = "-3153"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.sprite1 = var1.readNullableLargeSmart();
		} else if (var2 == 2) {
			this.sprite2 = var1.readNullableLargeSmart();
		} else if (var2 == 3) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.field1873 = var1.readMedium();
		} else if (var2 == 5) {
			var1.readMedium();
		} else if (var2 == 6) {
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) {
				var6 = var1.readUnsignedByte();
				if ((var6 & 1) == 0) {
					this.field1867 = false;
				}

				if ((var6 & 2) == 2) {
					this.field1876 = true;
				}
			} else if (var2 == 8) {
				var1.readUnsignedByte();
			} else if (var2 >= 10 && var2 <= 14) {
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) {
				var6 = var1.readUnsignedByte();
				this.field1878 = new int[var6 * 2];

				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) {
					this.field1878[var4] = var1.readShort();
				}

				var1.readInt();
				var4 = var1.readUnsignedByte();
				this.field1886 = new int[var4];

				int var5;
				for (var5 = 0; var5 < this.field1886.length; ++var5) {
					this.field1886[var5] = var1.readInt();
				}

				this.field1865 = new byte[var6];

				for (var5 = 0; var5 < var6; ++var5) {
					this.field1865[var5] = var1.readByte();
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
					this.horizontalAlignment = (HorizontalAlignment)class356.findEnumerated(ObjectSound.method1953(), var1.readUnsignedByte());
				} else if (var2 == 30) {
					VerticalAlignment[] var3 = new VerticalAlignment[]{VerticalAlignment.field2015, VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field2019};
					this.verticalAlignment = (VerticalAlignment)class356.findEnumerated(var3, var1.readUnsignedByte());
				}
			}
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1766481744"
	)
	public void method3590() {
		if (this.field1878 != null) {
			for (int var1 = 0; var1 < this.field1878.length; var1 += 2) {
				if (this.field1878[var1] < this.field1880) {
					this.field1880 = this.field1878[var1];
				} else if (this.field1878[var1] > this.field1882) {
					this.field1882 = this.field1878[var1];
				}

				if (this.field1878[var1 + 1] < this.field1881) {
					this.field1881 = this.field1878[var1 + 1];
				} else if (this.field1878[var1 + 1] > this.field1883) {
					this.field1883 = this.field1878[var1 + 1];
				}
			}
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ZB)Lvd;",
		garbageValue = "-28"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1;
		return this.getSprite(var2);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)Lvd;",
		garbageValue = "-21"
	)
	@Export("getSprite")
	SpritePixels getSprite(int var1) {
		if (var1 < 0) {
			return null;
		} else {
			SpritePixels var2 = (SpritePixels)HitSplatDefinition_cached.get((long)var1);
			if (var2 != null) {
				return var2;
			} else {
				var2 = FileSystem.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0);
				if (var2 != null) {
					HitSplatDefinition_cached.put(var2, (long)var1);
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1080881820"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Lng;III)V",
		garbageValue = "140980928"
	)
	public static void method3580(Widget var0, int var1, int var2) {
		PlayerComposition var3 = var0.field3774;
		boolean var4 = var2 != var3.gender;
		var3.gender = var2;
		if (var4) {
			int var5;
			int var6;
			if (var3.gender == var1) {
				for (var5 = 0; var5 < PlayerComposition.equipmentIndices.length; ++var5) {
					var6 = PlayerComposition.equipmentIndices[var5];
					if (var3.equipment[var6] > 0 && var3.equipment[var6] < 512) {
						var3.equipment[var6] = var3.field3666[var6];
					}
				}
			} else {
				if (var3.equipment[0] < 512 || WorldMapLabel.method5041(var3)) {
					var3.equipment[class207.field2280.field2289] = 1;
				}

				for (var5 = 0; var5 < 7; ++var5) {
					var6 = PlayerComposition.equipmentIndices[var5];
					if (var3.equipment[var6] > 0 && var3.equipment[var6] < 512) {
						int[] var7 = var3.equipment;

						for (int var8 = 0; var8 < KitDefinition.KitDefinition_fileCount; ++var8) {
							KitDefinition var9 = GrandExchangeOfferWorldComparator.KitDefinition_get(var8);
							if (var9 != null && !var9.nonSelectable && var9.bodypartID == var5 + (var2 == 1 ? 7 : 0)) {
								var7[PlayerComposition.equipmentIndices[var5]] = var8 + 256;
								break;
							}
						}
					}
				}
			}
		}

		var3.method6477();
	}
}
