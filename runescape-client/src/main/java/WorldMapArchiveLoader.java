import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ox")
@Implements("WorldMapArchiveLoader")
public class WorldMapArchiveLoader {
	@ObfuscatedName("j")
	@Export("cacheName")
	String cacheName;

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "Llh;")
	@Export("archive")
	AbstractArchive archive;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = -1239125603)
	@Export("percentLoaded")
	int percentLoaded;

	@ObfuscatedName("w")
	@Export("loaded")
	boolean loaded;

	@ObfuscatedSignature(descriptor = "(Llh;)V")
	WorldMapArchiveLoader(AbstractArchive var1) {
		this.percentLoaded = 0;
		this.loaded = false;
		this.archive = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "-1356083812")
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-22")
	@Export("load")
	int load() {
		if (this.percentLoaded < 33) {
			if (!this.archive.tryLoadFileByNames(WorldMapCacheName.field2865.name, this.cacheName)) {
				return this.percentLoaded;
			}
			this.percentLoaded = 33;
		}
		if (this.percentLoaded == 33) {
			if (this.archive.isValidFileName(WorldMapCacheName.field2866.name, this.cacheName) && !this.archive.tryLoadFileByNames(WorldMapCacheName.field2866.name, this.cacheName)) {
				return this.percentLoaded;
			}
			this.percentLoaded = 66;
		}
		if (this.percentLoaded == 66) {
			if (!this.archive.tryLoadFileByNames(this.cacheName, WorldMapCacheName.field2868.name)) {
				return this.percentLoaded;
			}
			this.percentLoaded = 100;
			this.loaded = true;
		}
		return this.percentLoaded;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-923588263")
	@Export("isLoaded")
	boolean isLoaded() {
		return this.loaded;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1790621398")
	@Export("getPercentLoaded")
	int getPercentLoaded() {
		return this.percentLoaded;
	}
}