import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("WorldMapElement_archive")
	public static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lhw;"
	)
	@Export("WorldMapElement_cached")
	public static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1357659579
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1308036587
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1423427751
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("aw")
	@Export("name")
	public String name;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 2043006879
	)
	public int field2011;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 902578553
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("ag")
	public boolean field2004;
	@ObfuscatedName("ai")
	public boolean field2012;
	@ObfuscatedName("ax")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("ar")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("aj")
	int[] field2013;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -382399201
	)
	int field2002;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1762205745
	)
	int field2017;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -50187643
	)
	int field2018;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 2055496749
	)
	int field2019;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("am")
	int[] field2022;
	@ObfuscatedName("ac")
	byte[] field2023;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 540587115
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
		this.field2004 = true;
		this.field2012 = false;
		this.menuActions = new String[5];
		this.field2002 = Integer.MAX_VALUE;
		this.field2017 = Integer.MAX_VALUE;
		this.field2018 = Integer.MIN_VALUE;
		this.field2019 = Integer.MIN_VALUE;
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
		this.category = -1;
		this.objectId = var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "-2011784720"
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lur;IS)V",
		garbageValue = "-29043"
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
			this.field2011 = var1.readMedium();
		} else if (var2 == 5) {
			var1.readMedium();
		} else if (var2 == 6) {
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) {
				var6 = var1.readUnsignedByte();
				if ((var6 & 1) == 0) {
					this.field2004 = false;
				}

				if ((var6 & 2) == 2) {
					this.field2012 = true;
				}
			} else if (var2 == 8) {
				var1.readUnsignedByte();
			} else if (var2 >= 10 && var2 <= 14) {
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) {
				var6 = var1.readUnsignedByte();
				this.field2013 = new int[var6 * 2];

				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) {
					this.field2013[var4] = var1.readShort();
				}

				var1.readInt();
				var4 = var1.readUnsignedByte();
				this.field2022 = new int[var4];

				int var5;
				for (var5 = 0; var5 < this.field2022.length; ++var5) {
					this.field2022[var5] = var1.readInt();
				}

				this.field2023 = new byte[var6];

				for (var5 = 0; var5 < var6; ++var5) {
					this.field2023[var5] = var1.readByte();
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
					HorizontalAlignment[] var3 = new HorizontalAlignment[]{HorizontalAlignment.field2087, HorizontalAlignment.field2090, HorizontalAlignment.HorizontalAlignment_centered};
					this.horizontalAlignment = (HorizontalAlignment)KitDefinition.findEnumerated(var3, var1.readUnsignedByte());
				} else if (var2 == 30) {
					this.verticalAlignment = (VerticalAlignment)KitDefinition.findEnumerated(class130.method3014(), var1.readUnsignedByte());
				}
			}
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1294022438"
	)
	public void method3743() {
		if (this.field2013 != null) {
			for (int var1 = 0; var1 < this.field2013.length; var1 += 2) {
				if (this.field2013[var1] < this.field2002) {
					this.field2002 = this.field2013[var1];
				} else if (this.field2013[var1] > this.field2018) {
					this.field2018 = this.field2013[var1];
				}

				if (this.field2013[var1 + 1] < this.field2017) {
					this.field2017 = this.field2013[var1 + 1];
				} else if (this.field2013[var1 + 1] > this.field2019) {
					this.field2019 = this.field2013[var1 + 1];
				}
			}
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lvg;",
		garbageValue = "917391848"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1;
		return this.getSprite(var2);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)Lvg;",
		garbageValue = "4"
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
				var2 = GraphicsObject.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0);
				if (var2 != null) {
					HitSplatDefinition_cached.put(var2, (long)var1);
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-656155168"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-685240157"
	)
	public static void method3742(int var0, int var1, int var2, int var3) {
		if (class321.musicSongs.size() > 1 && class321.musicSongs.get(0) != null && ((MusicSong)class321.musicSongs.get(0)).midiPcmStream.isReady() && class321.musicSongs.get(1) != null && ((MusicSong)class321.musicSongs.get(1)).midiPcmStream.isReady()) {
			WorldMapSection2.method5289(var0, var1, var2, var3);
			class321.field3498.add(new SwapSongTask((SongTask)null));
			ArrayList var4 = new ArrayList();
			var4.add(new DelayFadeTask(new FadeInTask((SongTask)null, 1, false, class321.field3503), class321.field3502));
			var4.add(new DelayFadeTask(new FadeOutTask((SongTask)null, 0, false, class321.field3501), class321.musicPlayerStatus));
			class321.field3498.add(new ConcurrentMidiTask((SongTask)null, var4));
			if (class321.field3496.get(0) != null && class321.field3496.get(1) != null) {
				MusicSong var5 = (MusicSong)class321.field3496.get(0);
				class321.field3496.set(0, class321.musicSongs.get(1));
				class321.field3496.set(1, var5);
			}
		}

	}
}
