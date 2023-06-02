import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ku")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lku;"
   )
   public static final WorldMapCacheName field3049 = new WorldMapCacheName("details");
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lku;"
   )
   public static final WorldMapCacheName field3044 = new WorldMapCacheName("compositemap");
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lku;"
   )
   public static final WorldMapCacheName field3045 = new WorldMapCacheName("compositetexture");
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lku;"
   )
   static final WorldMapCacheName field3046 = new WorldMapCacheName("area");
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Lku;"
   )
   public static final WorldMapCacheName field3047 = new WorldMapCacheName("labels");
   @ObfuscatedName("jy")
   @Export("regionMapArchiveIds")
   static int[] regionMapArchiveIds;
   @ObfuscatedName("ap")
   @Export("name")
   public final String name;

   WorldMapCacheName(String var1) {
      this.name = var1;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)[B",
      garbageValue = "1038180461"
   )
   public static byte[] method5532() {
      byte[] var0 = new byte[24];

      try {
         JagexCache.JagexCache_randomDat.seek(0L);
         JagexCache.JagexCache_randomDat.readFully(var0);

         int var1;
         for(var1 = 0; var1 < 24 && var0[var1] == 0; ++var1) {
         }

         if (var1 >= 24) {
            throw new IOException();
         }
      } catch (Exception var4) {
         for(int var2 = 0; var2 < 24; ++var2) {
            var0[var2] = -1;
         }
      }

      return var0;
   }
}
