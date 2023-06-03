import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sg")
@Implements("WorldMapArchiveLoader")
public class WorldMapArchiveLoader {
   @ObfuscatedName("ax")
   @Export("cacheName")
   String cacheName;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lnq;"
   )
   @Export("archive")
   AbstractArchive archive;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 645796695
   )
   @Export("percentLoaded")
   int percentLoaded = 0;
   @ObfuscatedName("ak")
   @Export("loaded")
   boolean loaded = false;

   @ObfuscatedSignature(
      descriptor = "(Lnq;)V"
   )
   WorldMapArchiveLoader(AbstractArchive var1) {
      this.archive = var1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)V",
      garbageValue = "7"
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

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "602609215"
   )
   @Export("load")
   int load() {
      if (this.cacheName == null) {
         this.percentLoaded = 100;
         this.loaded = true;
      } else {
         if (this.percentLoaded < 33) {
            if (!this.archive.tryLoadFileByNames(WorldMapCacheName.field3044.name, this.cacheName)) {
               return this.percentLoaded;
            }

            this.percentLoaded = 33;
         }

         if (this.percentLoaded == 33) {
            if (this.archive.isValidFileName(WorldMapCacheName.field3045.name, this.cacheName) && !this.archive.tryLoadFileByNames(WorldMapCacheName.field3045.name, this.cacheName)) {
               return this.percentLoaded;
            }

            this.percentLoaded = 66;
         }

         if (this.percentLoaded == 66) {
            if (!this.archive.tryLoadFileByNames(this.cacheName, WorldMapCacheName.field3047.name)) {
               return this.percentLoaded;
            }

            this.percentLoaded = 100;
            this.loaded = true;
         }
      }

      return this.percentLoaded;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "18"
   )
   @Export("isLoaded")
   boolean isLoaded() {
      return this.loaded;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "697183667"
   )
   @Export("getPercentLoaded")
   int getPercentLoaded() {
      return this.percentLoaded;
   }
}
