import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tp")
@Implements("WorldMapArchiveLoader")
public class WorldMapArchiveLoader {
	@ObfuscatedName("ap")
	@Export("cacheName")
	String cacheName;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("archive")
	AbstractArchive archive;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -854808799
	)
	@Export("percentLoaded")
	int percentLoaded;
	@ObfuscatedName("av")
	@Export("loaded")
	boolean loaded;

	@ObfuscatedSignature(
		descriptor = "(Lok;)V"
	)
	WorldMapArchiveLoader(AbstractArchive var1) {
		this.percentLoaded = 0;
		this.loaded = false;
		this.archive = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-524005317"
	)
	@Export("reset")
	void reset(String var1) {
		if (var1 != null && !var1.isEmpty()) {
			if (var1 != this.cacheName) {
				this.cacheName = var1;
				this.percentLoaded = 0;
				this.loaded = false;
				this.load();
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-14"
	)
	@Export("load")
	int load() {
		if (this.cacheName == null) {
			this.percentLoaded = 100;
			this.loaded = true;
		} else {
			if (this.percentLoaded < 33) {
				if (!this.archive.tryLoadFileByNames(WorldMapCacheName.field2738.name, this.cacheName)) {
					return this.percentLoaded;
				}

				this.percentLoaded = 33;
			}

			if (this.percentLoaded == 33) {
				if (this.archive.isValidFileName(WorldMapCacheName.field2739.name, this.cacheName) && !this.archive.tryLoadFileByNames(WorldMapCacheName.field2739.name, this.cacheName)) {
					return this.percentLoaded;
				}

				this.percentLoaded = 66;
			}

			if (this.percentLoaded == 66) {
				if (!this.archive.tryLoadFileByNames(this.cacheName, WorldMapCacheName.field2741.name)) {
					return this.percentLoaded;
				}

				this.percentLoaded = 100;
				this.loaded = true;
			}
		}

		return this.percentLoaded;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1504653592"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		return this.loaded;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1155216193"
	)
	@Export("getPercentLoaded")
	int getPercentLoaded() {
		return this.percentLoaded;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lok;Ljava/lang/String;Ljava/lang/String;I)[Lvv;",
		garbageValue = "1107623391"
	)
	@Export("getFont")
	public static IndexedSprite[] getFont(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			IndexedSprite[] var5;
			if (!class146.method3260(var0, var3, var4)) {
				var5 = null;
			} else {
				IndexedSprite[] var7 = new IndexedSprite[SpriteBufferProperties.SpriteBuffer_spriteCount];

				for (int var8 = 0; var8 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var8) {
					IndexedSprite var9 = var7[var8] = new IndexedSprite();
					var9.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
					var9.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
					var9.xOffset = UserComparator4.SpriteBuffer_xOffsets[var8];
					var9.yOffset = LoginPacket.SpriteBuffer_yOffsets[var8];
					var9.subWidth = SpriteBufferProperties.SpriteBuffer_spriteWidths[var8];
					var9.subHeight = class315.SpriteBuffer_spriteHeights[var8];
					var9.palette = SpriteBufferProperties.SpriteBuffer_spritePalette;
					var9.pixels = SpriteBufferProperties.SpriteBuffer_pixels[var8];
				}

				Calendar.method7029();
				var5 = var7;
			}

			return var5;
		}
	}
}
