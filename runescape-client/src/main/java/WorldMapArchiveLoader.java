import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qz")
@Implements("WorldMapArchiveLoader")
public class WorldMapArchiveLoader {
   @ObfuscatedName("z")
   @Export("cacheName")
   String cacheName;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   @Export("archive")
   AbstractArchive archive;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -1472132627
   )
   @Export("percentLoaded")
   int percentLoaded = 0;
   @ObfuscatedName("n")
   @Export("loaded")
   boolean loaded = false;

   @ObfuscatedSignature(
      descriptor = "(Lln;)V"
   )
   WorldMapArchiveLoader(AbstractArchive var1) {
      this.archive = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)V",
      garbageValue = "-27"
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

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-685502052"
   )
   @Export("load")
   int load() {
      if (this.percentLoaded < 33) {
         if (!this.archive.tryLoadFileByNames(WorldMapCacheName.field3016.name, this.cacheName)) {
            return this.percentLoaded;
         }

         this.percentLoaded = 33;
      }

      if (this.percentLoaded == 33) {
         if (this.archive.isValidFileName(WorldMapCacheName.field3011.name, this.cacheName) && !this.archive.tryLoadFileByNames(WorldMapCacheName.field3011.name, this.cacheName)) {
            return this.percentLoaded;
         }

         this.percentLoaded = 66;
      }

      if (this.percentLoaded == 66) {
         if (!this.archive.tryLoadFileByNames(this.cacheName, WorldMapCacheName.field3014.name)) {
            return this.percentLoaded;
         }

         this.percentLoaded = 100;
         this.loaded = true;
      }

      return this.percentLoaded;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "770767761"
   )
   @Export("isLoaded")
   boolean isLoaded() {
      return this.loaded;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "32"
   )
   @Export("getPercentLoaded")
   int getPercentLoaded() {
      return this.percentLoaded;
   }
}
