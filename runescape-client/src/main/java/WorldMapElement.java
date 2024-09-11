import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lhf;"
	)
	@Export("WorldMapElement_cached")
	public static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1901462683
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1156980651
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1323596015
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("at")
	@Export("name")
	public String name;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 253024691
	)
	public int field1904;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1285016691
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("ad")
	public boolean field1906;
	@ObfuscatedName("ah")
	public boolean field1909;
	@ObfuscatedName("ap")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("ab")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("az")
	int[] field1898;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 765602613
	)
	int field1903;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 328277065
	)
	int field1912;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 848582829
	)
	int field1913;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1365672441
	)
	int field1914;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lhg;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("av")
	int[] field1917;
	@ObfuscatedName("aw")
	byte[] field1918;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1050328213
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
		this.field1906 = true;
		this.field1909 = false;
		this.menuActions = new String[5];
		this.field1903 = Integer.MAX_VALUE;
		this.field1912 = Integer.MAX_VALUE;
		this.field1913 = Integer.MIN_VALUE;
		this.field1914 = Integer.MIN_VALUE;
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
		this.category = -1;
		this.objectId = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lvf;I)V",
		garbageValue = "-481475058"
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvf;II)V",
		garbageValue = "416203806"
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
			this.field1904 = var1.readMedium();
		} else if (var2 == 5) {
			var1.readMedium();
		} else if (var2 == 6) {
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) {
				var6 = var1.readUnsignedByte();
				if ((var6 & 1) == 0) {
					this.field1906 = false;
				}

				if ((var6 & 2) == 2) {
					this.field1909 = true;
				}
			} else if (var2 == 8) {
				var1.readUnsignedByte();
			} else if (var2 >= 10 && var2 <= 14) {
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) {
				var6 = var1.readUnsignedByte();
				this.field1898 = new int[var6 * 2];

				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) {
					this.field1898[var4] = var1.readShort();
				}

				var1.readInt();
				var4 = var1.readUnsignedByte();
				this.field1917 = new int[var4];

				int var5;
				for (var5 = 0; var5 < this.field1917.length; ++var5) {
					this.field1917[var5] = var1.readInt();
				}

				this.field1918 = new byte[var6];

				for (var5 = 0; var5 < var6; ++var5) {
					this.field1918[var5] = var1.readByte();
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
					HorizontalAlignment[] var3 = new HorizontalAlignment[]{HorizontalAlignment.field1985, HorizontalAlignment.field1984, HorizontalAlignment.HorizontalAlignment_centered};
					this.horizontalAlignment = (HorizontalAlignment)ArchiveDiskAction.findEnumerated(var3, var1.readUnsignedByte());
				} else if (var2 == 30) {
					VerticalAlignment[] var7 = new VerticalAlignment[]{VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field2060, VerticalAlignment.field2055};
					this.verticalAlignment = (VerticalAlignment)ArchiveDiskAction.findEnumerated(var7, var1.readUnsignedByte());
				}
			}
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "505668555"
	)
	public void method3824() {
		if (this.field1898 != null) {
			for (int var1 = 0; var1 < this.field1898.length; var1 += 2) {
				if (this.field1898[var1] < this.field1903) {
					this.field1903 = this.field1898[var1];
				} else if (this.field1898[var1] > this.field1913) {
					this.field1913 = this.field1898[var1];
				}

				if (this.field1898[var1 + 1] < this.field1912) {
					this.field1912 = this.field1898[var1 + 1];
				} else if (this.field1898[var1 + 1] > this.field1914) {
					this.field1914 = this.field1898[var1 + 1];
				}
			}
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lvv;",
		garbageValue = "-1845420283"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1;
		return this.getSprite(var2);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Lvv;",
		garbageValue = "1753784711"
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
				var2 = AbstractUserComparator.SpriteBuffer_getSprite(class142.WorldMapElement_archive, var1, 0);
				if (var2 != null) {
					HitSplatDefinition_cached.put(var2, (long)var1);
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "21334365"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-1598214665"
	)
	public static final synchronized long method3843() {
		long var0 = System.currentTimeMillis();
		if (var0 < class330.field3595) {
			class330.field3596 += class330.field3595 - var0;
		}

		class330.field3595 = var0;
		return var0 + class330.field3596;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "47"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var1 == null ? 0 : var1.size();
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "7"
	)
	static int method3845(int var0, Script var1, boolean var2) {
		if (var0 == 7463) {
			boolean var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
			class388.method7521(var3);
			return 1;
		} else {
			return 2;
		}
	}
}
