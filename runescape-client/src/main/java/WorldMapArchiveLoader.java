import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oo")
@Implements("WorldMapArchiveLoader")
public class WorldMapArchiveLoader {
	@ObfuscatedName("am")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("b")
	@Export("cacheName")
	String cacheName;
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"Lln;")

	@Export("archive")
	AbstractArchive archive;
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 
	-1677535767)

	@Export("percentLoaded")
	int percentLoaded;
	@ObfuscatedName("l")
	@Export("loaded")
	boolean loaded;

	@ObfuscatedSignature(descriptor = 
	"(Lln;)V")

	WorldMapArchiveLoader(AbstractArchive var1) {
		this.percentLoaded = 0;
		this.loaded = false;
		this.archive = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;I)V", garbageValue = 
	"36138809")

	@Export("reset")
	void reset(String var1) {
		if ((var1 != null) && (!var1.isEmpty())) {
			if (var1 != this.cacheName) {
				this.cacheName = var1;
				this.percentLoaded = 0;
				this.loaded = false;
				this.load();
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"1816632619")

	@Export("load")
	int load() {
		if (this.percentLoaded < 33) {
			if (!this.archive.tryLoadFileByNames(WorldMapCacheName.field2414.name, this.cacheName)) {
				return this.percentLoaded;
			}

			this.percentLoaded = 33;
		}

		if (this.percentLoaded == 33) {
			if (this.archive.isValidFileName(WorldMapCacheName.field2418.name, this.cacheName) && (!this.archive.tryLoadFileByNames(WorldMapCacheName.field2418.name, this.cacheName))) {
				return this.percentLoaded;
			}

			this.percentLoaded = 66;
		}

		if (this.percentLoaded == 66) {
			if (!this.archive.tryLoadFileByNames(this.cacheName, WorldMapCacheName.field2417.name)) {
				return this.percentLoaded;
			}

			this.percentLoaded = 100;
			this.loaded = true;
		}

		return this.percentLoaded;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(S)Z", garbageValue = 
	"4676")

	@Export("isLoaded")
	boolean isLoaded() {
		return this.loaded;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"-1760303453")

	@Export("getPercentLoaded")
	int getPercentLoaded() {
		return this.percentLoaded;
	}
}