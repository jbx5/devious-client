import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gr")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lgr;"
	)
	@Export("WorldMapElement_cached")
	public static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1760689129
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -351523479
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -880575015
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("ac")
	@Export("name")
	public String name;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 90303527
	)
	public int field1830;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 501324725
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("av")
	public boolean field1825;
	@ObfuscatedName("ax")
	public boolean field1824;
	@ObfuscatedName("as")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("ay")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("ak")
	int[] field1837;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1354879599
	)
	int field1834;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -488083685
	)
	int field1839;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1506509263
	)
	int field1840;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -867132631
	)
	int field1831;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lhg;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("an")
	int[] field1844;
	@ObfuscatedName("ag")
	byte[] field1845;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -974886963
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
		this.field1825 = true;
		this.field1824 = false;
		this.menuActions = new String[5];
		this.field1834 = Integer.MAX_VALUE;
		this.field1839 = Integer.MAX_VALUE;
		this.field1840 = Integer.MIN_VALUE;
		this.field1831 = Integer.MIN_VALUE;
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
		this.category = -1;
		this.objectId = var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "-987728818"
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Luj;IB)V",
		garbageValue = "0"
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
			this.field1830 = var1.readMedium();
		} else if (var2 == 5) {
			var1.readMedium();
		} else if (var2 == 6) {
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) {
				var6 = var1.readUnsignedByte();
				if ((var6 & 1) == 0) {
					this.field1825 = false;
				}

				if ((var6 & 2) == 2) {
					this.field1824 = true;
				}
			} else if (var2 == 8) {
				var1.readUnsignedByte();
			} else if (var2 >= 10 && var2 <= 14) {
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) {
				var6 = var1.readUnsignedByte();
				this.field1837 = new int[var6 * 2];

				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) {
					this.field1837[var4] = var1.readShort();
				}

				var1.readInt();
				var4 = var1.readUnsignedByte();
				this.field1844 = new int[var4];

				int var5;
				for (var5 = 0; var5 < this.field1844.length; ++var5) {
					this.field1844[var5] = var1.readInt();
				}

				this.field1845 = new byte[var6];

				for (var5 = 0; var5 < var6; ++var5) {
					this.field1845[var5] = var1.readByte();
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
					HorizontalAlignment[] var3 = new HorizontalAlignment[]{HorizontalAlignment.field1909, HorizontalAlignment.field1905, HorizontalAlignment.HorizontalAlignment_centered};
					this.horizontalAlignment = (HorizontalAlignment)class12.findEnumerated(var3, var1.readUnsignedByte());
				} else if (var2 == 30) {
					VerticalAlignment[] var7 = new VerticalAlignment[]{VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field1972, VerticalAlignment.field1970};
					this.verticalAlignment = (VerticalAlignment)class12.findEnumerated(var7, var1.readUnsignedByte());
				}
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1778533168"
	)
	public void method3580() {
		if (this.field1837 != null) {
			for (int var1 = 0; var1 < this.field1837.length; var1 += 2) {
				if (this.field1837[var1] < this.field1834) {
					this.field1834 = this.field1837[var1];
				} else if (this.field1837[var1] > this.field1840) {
					this.field1840 = this.field1837[var1];
				}

				if (this.field1837[var1 + 1] < this.field1839) {
					this.field1839 = this.field1837[var1 + 1];
				} else if (this.field1837[var1 + 1] > this.field1831) {
					this.field1831 = this.field1837[var1 + 1];
				}
			}
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ZB)Luz;",
		garbageValue = "9"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1;
		return this.getSprite(var2);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Luz;",
		garbageValue = "539086783"
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
				var2 = IgnoreList.SpriteBuffer_getSprite(class432.WorldMapElement_archive, var1, 0);
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
		garbageValue = "314107499"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Laa;I)Lao;",
		garbageValue = "2008844718"
	)
	public static class3 method3590(class6 var0) {
		switch(var0.field11) {
		case 0:
			return new class0();
		default:
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1025083911"
	)
	public static void method3589() {
		StructComposition.StructDefinition_cached.clear();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-10"
	)
	@Export("isCharPrintable")
	public static boolean isCharPrintable(char var0) {
		if (var0 >= ' ' && var0 <= '~') {
			return true;
		} else if (var0 >= 160 && var0 <= 255) {
			return true;
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376;
		}
	}
}
