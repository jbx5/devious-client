import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tg")
@Implements("WorldMapArchiveLoader")
public class WorldMapArchiveLoader {
	@ObfuscatedName("ar")
	@Export("cacheName")
	String cacheName;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("archive")
	AbstractArchive archive;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1090501963
	)
	@Export("percentLoaded")
	int percentLoaded;
	@ObfuscatedName("az")
	@Export("loaded")
	boolean loaded;

	@ObfuscatedSignature(
		descriptor = "(Lof;)V"
	)
	WorldMapArchiveLoader(AbstractArchive var1) {
		this.percentLoaded = 0;
		this.loaded = false;
		this.archive = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1896550144"
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1681935043"
	)
	@Export("load")
	int load() {
		if (this.cacheName == null) {
			this.percentLoaded = 100;
			this.loaded = true;
		} else {
			if (this.percentLoaded < 33) {
				if (!this.archive.tryLoadFileByNames(WorldMapCacheName.field2678.name, this.cacheName)) {
					return this.percentLoaded;
				}

				this.percentLoaded = 33;
			}

			if (this.percentLoaded == 33) {
				if (this.archive.isValidFileName(WorldMapCacheName.field2681.name, this.cacheName) && !this.archive.tryLoadFileByNames(WorldMapCacheName.field2681.name, this.cacheName)) {
					return this.percentLoaded;
				}

				this.percentLoaded = 66;
			}

			if (this.percentLoaded == 66) {
				if (!this.archive.tryLoadFileByNames(this.cacheName, WorldMapCacheName.field2682.name)) {
					return this.percentLoaded;
				}

				this.percentLoaded = 100;
				this.loaded = true;
			}
		}

		return this.percentLoaded;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "899894301"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		return this.loaded;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1758478616"
	)
	@Export("getPercentLoaded")
	int getPercentLoaded() {
		return this.percentLoaded;
	}
}
