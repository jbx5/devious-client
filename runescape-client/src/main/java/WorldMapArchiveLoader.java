import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rk")
@Implements("WorldMapArchiveLoader")
public class WorldMapArchiveLoader {
   @ObfuscatedName("an")
   @Export("cacheName")
   String cacheName;
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   @Export("archive")
   AbstractArchive archive;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 1826343151
   )
   @Export("percentLoaded")
   int percentLoaded = 0;
   @ObfuscatedName("aq")
   @Export("loaded")
   boolean loaded = false;

   @ObfuscatedSignature(
      descriptor = "(Lne;)V"
   )
   WorldMapArchiveLoader(AbstractArchive var1) {
      this.archive = var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "73331641"
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

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1820796726"
   )
   @Export("load")
   int load() {
      if (this.percentLoaded < 33) {
         if (!this.archive.tryLoadFileByNames(WorldMapCacheName.field3014.name, this.cacheName)) {
            return this.percentLoaded;
         }

         this.percentLoaded = 33;
      }

      if (this.percentLoaded == 33) {
         if (this.archive.isValidFileName(WorldMapCacheName.field3016.name, this.cacheName) && !this.archive.tryLoadFileByNames(WorldMapCacheName.field3016.name, this.cacheName)) {
            return this.percentLoaded;
         }

         this.percentLoaded = 66;
      }

      if (this.percentLoaded == 66) {
         if (!this.archive.tryLoadFileByNames(this.cacheName, WorldMapCacheName.field3017.name)) {
            return this.percentLoaded;
         }

         this.percentLoaded = 100;
         this.loaded = true;
      }

      return this.percentLoaded;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1032385715"
   )
   @Export("isLoaded")
   boolean isLoaded() {
      return this.loaded;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "17"
   )
   @Export("getPercentLoaded")
   int getPercentLoaded() {
      return this.percentLoaded;
   }
}
