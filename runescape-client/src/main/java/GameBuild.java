import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("md")
@Implements("GameBuild")
public class GameBuild {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lmd;"
   )
   @Export("LIVE")
   static final GameBuild LIVE = new GameBuild("LIVE", 0);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lmd;"
   )
   @Export("BUILDLIVE")
   static final GameBuild BUILDLIVE = new GameBuild("BUILDLIVE", 3);
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lmd;"
   )
   @Export("RC")
   static final GameBuild RC = new GameBuild("RC", 1);
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lmd;"
   )
   @Export("WIP")
   static final GameBuild WIP = new GameBuild("WIP", 2);
   @ObfuscatedName("fb")
   @ObfuscatedSignature(
      descriptor = "Lnd;"
   )
   @Export("archive7")
   static Archive archive7;
   @ObfuscatedName("au")
   @Export("name")
   public final String name;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -978256915
   )
   @Export("buildId")
   final int buildId;

   GameBuild(String var1, int var2) {
      this.name = var1;
      this.buildId = var2;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IB)Lsm;",
      garbageValue = "97"
   )
   @Export("getDbTableType")
   public static DbTableType getDbTableType(int var0) {
      DbTableType var1 = (DbTableType)DbTableType.DBTableType_cache.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = DbTableType.field4961.takeFile(39, var0);
         var1 = new DbTableType();
         if (var2 != null) {
            var1.method8929(new Buffer(var2));
         }

         var1.method8934();
         DbTableType.DBTableType_cache.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(IIII)I",
      garbageValue = "-347521940"
   )
   @Export("hslToRgb")
   static final int hslToRgb(int var0, int var1, int var2) {
      if (var2 > 179) {
         var1 /= 2;
      }

      if (var2 > 192) {
         var1 /= 2;
      }

      if (var2 > 217) {
         var1 /= 2;
      }

      if (var2 > 243) {
         var1 /= 2;
      }

      int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
      return var3;
   }
}
