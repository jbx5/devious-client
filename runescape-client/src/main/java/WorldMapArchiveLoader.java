import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("os")
@Implements("WorldMapArchiveLoader")
public class WorldMapArchiveLoader {
	@ObfuscatedName("eo")
	@ObfuscatedSignature(descriptor = "Llu;")
	@Export("archive4")
	static Archive archive4;

	@ObfuscatedName("c")
	@Export("cacheName")
	String cacheName;

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("archive")
	AbstractArchive archive;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 40243639)
	@Export("percentLoaded")
	int percentLoaded = 0;

	@ObfuscatedName("j")
	@Export("loaded")
	boolean loaded = false;

	@ObfuscatedSignature(descriptor = "(Llc;)V")
	WorldMapArchiveLoader(AbstractArchive var1) {
		this.archive = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "-823191393")
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "2069050115")
	@Export("load")
	int load() {
		if (this.percentLoaded < 33) {
			if (!this.archive.tryLoadFileByNames(WorldMapCacheName.field2861.name, this.cacheName)) {
				return this.percentLoaded;
			}
			this.percentLoaded = 33;
		}
		if (this.percentLoaded == 33) {
			if (this.archive.isValidFileName(WorldMapCacheName.field2863.name, this.cacheName) && !this.archive.tryLoadFileByNames(WorldMapCacheName.field2863.name, this.cacheName)) {
				return this.percentLoaded;
			}
			this.percentLoaded = 66;
		}
		if (this.percentLoaded == 66) {
			if (!this.archive.tryLoadFileByNames(this.cacheName, WorldMapCacheName.field2864.name)) {
				return this.percentLoaded;
			}
			this.percentLoaded = 100;
			this.loaded = true;
		}
		return this.percentLoaded;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-1397935060")
	@Export("isLoaded")
	boolean isLoaded() {
		return this.loaded;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-810632026")
	@Export("getPercentLoaded")
	int getPercentLoaded() {
		return this.percentLoaded;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(II)Lpq;", garbageValue = "-823191393")
	@Export("getDbTableType")
	public static DbTableType getDbTableType(int var0) {
		DbTableType var1 = ((DbTableType) (DbTableType.DBTableType_cache.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = DbTableType.field4682.takeFile(39, var0);
			var1 = new DbTableType();
			if (var2 != null) {
				var1.method7621(new Buffer(var2));
			}
			var1.method7626();
			DbTableType.DBTableType_cache.put(var1, ((long) (var0)));
			return var1;
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "-525080077")
	public static int method7221(int var0) {
		if (var0 > 0) {
			return 1;
		} else {
			return var0 < 0 ? -1 : 0;
		}
	}
}