import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("st")
@Implements("WorldMapArchiveLoader")
public class WorldMapArchiveLoader {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -335289281
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("as")
	@Export("cacheName")
	String cacheName;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("archive")
	AbstractArchive archive;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -415949189
	)
	@Export("percentLoaded")
	int percentLoaded;
	@ObfuscatedName("az")
	@Export("loaded")
	boolean loaded;

	@ObfuscatedSignature(
		descriptor = "(Lnd;)V"
	)
	WorldMapArchiveLoader(AbstractArchive var1) {
		this.percentLoaded = 0;
		this.loaded = false;
		this.archive = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1672803687"
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "6387"
	)
	@Export("load")
	int load() {
		if (this.cacheName == null) {
			this.percentLoaded = 100;
			this.loaded = true;
		} else {
			if (this.percentLoaded < 33) {
				if (!this.archive.tryLoadFileByNames(WorldMapCacheName.field3046.name, this.cacheName)) {
					return this.percentLoaded;
				}

				this.percentLoaded = 33;
			}

			if (this.percentLoaded == 33) {
				if (this.archive.isValidFileName(WorldMapCacheName.field3051.name, this.cacheName) && !this.archive.tryLoadFileByNames(WorldMapCacheName.field3051.name, this.cacheName)) {
					return this.percentLoaded;
				}

				this.percentLoaded = 66;
			}

			if (this.percentLoaded == 66) {
				if (!this.archive.tryLoadFileByNames(this.cacheName, WorldMapCacheName.field3049.name)) {
					return this.percentLoaded;
				}

				this.percentLoaded = 100;
				this.loaded = true;
			}
		}

		return this.percentLoaded;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "114"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		return this.loaded;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "125"
	)
	@Export("getPercentLoaded")
	int getPercentLoaded() {
		return this.percentLoaded;
	}
}
