import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ja")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	@Export("WorldMapElement_archive")
	static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1170299435
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("vy")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	@Export("platformInfo")
	static PlatformInfo platformInfo;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 649633335
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 21856781
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1921719637
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("ac")
	@Export("name")
	public String name;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -709171253
	)
	public int field2473;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -336865221
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("al")
	public boolean field2469;
	@ObfuscatedName("aj")
	public boolean field2474;
	@ObfuscatedName("as")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("aw")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("af")
	int[] field2470;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 565076629
	)
	int field2478;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 989541673
	)
	int field2471;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 606429281
	)
	int field2480;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -914672539
	)
	int field2479;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("ak")
	int[] field2476;
	@ObfuscatedName("ai")
	byte[] field2485;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1915204725
	)
	@Export("category")
	public int category;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(256);
	}

	WorldMapElement(int var1) {
		this.sprite1 = -1;
		this.sprite2 = -1;
		this.textSize = 0;
		this.field2469 = true;
		this.field2474 = false;
		this.menuActions = new String[5];
		this.field2478 = Integer.MAX_VALUE;
		this.field2471 = Integer.MAX_VALUE;
		this.field2480 = Integer.MIN_VALUE;
		this.field2479 = Integer.MIN_VALUE;
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
		this.category = -1;
		this.objectId = var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvg;B)V",
		garbageValue = "0"
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lvg;II)V",
		garbageValue = "2102123400"
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
			this.field2473 = var1.readMedium();
		} else if (var2 == 5) {
			var1.readMedium();
		} else if (var2 == 6) {
			this.textSize = var1.readUnsignedByte();
		} else {
			int var3;
			if (var2 == 7) {
				var3 = var1.readUnsignedByte();
				if ((var3 & 1) == 0) {
					this.field2469 = false;
				}

				if ((var3 & 2) == 2) {
					this.field2474 = true;
				}
			} else if (var2 == 8) {
				var1.readUnsignedByte();
			} else if (var2 >= 10 && var2 <= 14) {
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) {
				var3 = var1.readUnsignedByte();
				this.field2470 = new int[var3 * 2];

				int var4;
				for (var4 = 0; var4 < var3 * 2; ++var4) {
					this.field2470[var4] = var1.readShort();
				}

				var1.readInt();
				var4 = var1.readUnsignedByte();
				this.field2476 = new int[var4];

				int var5;
				for (var5 = 0; var5 < this.field2476.length; ++var5) {
					this.field2476[var5] = var1.readInt();
				}

				this.field2485 = new byte[var3];

				for (var5 = 0; var5 < var3; ++var5) {
					this.field2485[var5] = var1.readByte();
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
					this.horizontalAlignment = (HorizontalAlignment)class134.findEnumerated(Projection.method4175(), var1.readUnsignedByte());
				} else if (var2 == 30) {
					this.verticalAlignment = (VerticalAlignment)class134.findEnumerated(class252.method5015(), var1.readUnsignedByte());
				}
			}
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "30"
	)
	void method4791() {
		if (this.field2470 != null) {
			for (int var1 = 0; var1 < this.field2470.length; var1 += 2) {
				if (this.field2470[var1] < this.field2478) {
					this.field2478 = this.field2470[var1];
				} else if (this.field2470[var1] > this.field2480) {
					this.field2480 = this.field2470[var1];
				}

				if (this.field2470[var1 + 1] < this.field2471) {
					this.field2471 = this.field2470[var1 + 1];
				} else if (this.field2470[var1 + 1] > this.field2479) {
					this.field2479 = this.field2470[var1 + 1];
				}
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ZB)Lvc;",
		garbageValue = "-124"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1;
		return this.getSprite(var2);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Lvc;",
		garbageValue = "430937913"
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
				var2 = class195.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0);
				if (var2 != null) {
					HitSplatDefinition_cached.put(var2, (long)var1);
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IZIZI)V",
		garbageValue = "539900145"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (class319.World_worlds != null) {
			class223.doWorldSorting(0, class319.World_worlds.length - 1, var0, var1, var2, var3);
		}

	}
}
