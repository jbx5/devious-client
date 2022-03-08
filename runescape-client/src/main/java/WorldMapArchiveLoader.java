import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("og")
@Implements("WorldMapArchiveLoader")
public class WorldMapArchiveLoader {
    @ObfuscatedName("r")
    @Export("cacheName")
    String cacheName;

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "Lkq;")
    @Export("archive")
    AbstractArchive archive;

    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = 800710137)
    @Export("percentLoaded")
    int percentLoaded;

    @ObfuscatedName("w")
    @Export("loaded")
    boolean loaded;

    @ObfuscatedSignature(descriptor = "(Lkq;)V")
    WorldMapArchiveLoader(AbstractArchive var1) {
        this.percentLoaded = 0;
        this.loaded = false;
        this.archive = var1;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "-554023932")
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

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-90257675")
    @Export("load")
    int load() {
        if (this.percentLoaded < 33) {
            if (!this.archive.tryLoadFileByNames(WorldMapCacheName.field2790.name, this.cacheName)) {
                return this.percentLoaded;
            }
            this.percentLoaded = 33;
        }
        if (this.percentLoaded == 33) {
            if (this.archive.isValidFileName(WorldMapCacheName.field2791.name, this.cacheName) && (!this.archive.tryLoadFileByNames(WorldMapCacheName.field2791.name, this.cacheName))) {
                return this.percentLoaded;
            }
            this.percentLoaded = 66;
        }
        if (this.percentLoaded == 66) {
            if (!this.archive.tryLoadFileByNames(this.cacheName, WorldMapCacheName.field2795.name)) {
                return this.percentLoaded;
            }
            this.percentLoaded = 100;
            this.loaded = true;
        }
        return this.percentLoaded;
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "1656521822")
    @Export("isLoaded")
    boolean isLoaded() {
        return this.loaded;
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1532954307")
    @Export("getPercentLoaded")
    int getPercentLoaded() {
        return this.percentLoaded;
    }
}