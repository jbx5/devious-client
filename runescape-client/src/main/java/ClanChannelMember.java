import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
@Implements("ClanChannelMember")
public class ClanChannelMember {
   @ObfuscatedName("f")
   @Export("rank")
   public byte rank;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1827219617
   )
   @Export("world")
   public int world;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lsi;"
   )
   @Export("username")
   public Username username;

   ClanChannelMember() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IB)Lgy;",
      garbageValue = "-111"
   )
   @Export("getParamDefinition")
   public static ParamComposition getParamDefinition(int var0) {
      ParamComposition var1 = (ParamComposition)ParamComposition.ParamDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = ParamComposition.ParamDefinition_archive.takeFile(11, var0);
         var1 = new ParamComposition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         var1.postDecode();
         ParamComposition.ParamDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(IIIZIZB)V",
      garbageValue = "-20"
   )
   @Export("doWorldSorting")
   static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
      if (var0 < var1) {
         int var6 = (var0 + var1) / 2;
         int var7 = var0;
         World var8 = class88.World_worlds[var6];
         class88.World_worlds[var6] = class88.World_worlds[var1];
         class88.World_worlds[var1] = var8;

         for(int var9 = var0; var9 < var1; ++var9) {
            World var11 = class88.World_worlds[var9];
            int var12 = Players.compareWorlds(var11, var8, var2, var3);
            int var10;
            if (var12 != 0) {
               if (var3) {
                  var10 = -var12;
               } else {
                  var10 = var12;
               }
            } else if (var4 == -1) {
               var10 = 0;
            } else {
               int var13 = Players.compareWorlds(var11, var8, var4, var5);
               if (var5) {
                  var10 = -var13;
               } else {
                  var10 = var13;
               }
            }

            if (var10 <= 0) {
               World var14 = class88.World_worlds[var9];
               class88.World_worlds[var9] = class88.World_worlds[var7];
               class88.World_worlds[var7++] = var14;
            }
         }

         class88.World_worlds[var1] = class88.World_worlds[var7];
         class88.World_worlds[var7] = var8;
         doWorldSorting(var0, var7 - 1, var2, var3, var4, var5);
         doWorldSorting(var7 + 1, var1, var2, var3, var4, var5);
      }

   }
}
