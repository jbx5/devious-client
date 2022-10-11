import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ps")
@Implements("WorldMapArchiveLoader")
public class WorldMapArchiveLoader {
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1691366293
   )
   @Export("ItemDefinition_fileCount")
   public static int ItemDefinition_fileCount;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1773810981
   )
   static int field4685;
   @ObfuscatedName("h")
   @Export("cacheName")
   String cacheName;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Llg;"
   )
   @Export("archive")
   AbstractArchive archive;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -1039345667
   )
   @Export("percentLoaded")
   int percentLoaded = 0;
   @ObfuscatedName("d")
   @Export("loaded")
   boolean loaded = false;

   @ObfuscatedSignature(
      descriptor = "(Llg;)V"
   )
   WorldMapArchiveLoader(AbstractArchive var1) {
      this.archive = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-2123990611"
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

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "77"
   )
   @Export("load")
   int load() {
      if (this.percentLoaded < 33) {
         if (!this.archive.tryLoadFileByNames(WorldMapCacheName.field2949.name, this.cacheName)) {
            return this.percentLoaded;
         }

         this.percentLoaded = 33;
      }

      if (this.percentLoaded == 33) {
         if (this.archive.isValidFileName(WorldMapCacheName.field2948.name, this.cacheName) && !this.archive.tryLoadFileByNames(WorldMapCacheName.field2948.name, this.cacheName)) {
            return this.percentLoaded;
         }

         this.percentLoaded = 66;
      }

      if (this.percentLoaded == 66) {
         if (!this.archive.tryLoadFileByNames(this.cacheName, WorldMapCacheName.field2952.name)) {
            return this.percentLoaded;
         }

         this.percentLoaded = 100;
         this.loaded = true;
      }

      return this.percentLoaded;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "280221262"
   )
   @Export("isLoaded")
   boolean isLoaded() {
      return this.loaded;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "4"
   )
   @Export("getPercentLoaded")
   int getPercentLoaded() {
      return this.percentLoaded;
   }
}
