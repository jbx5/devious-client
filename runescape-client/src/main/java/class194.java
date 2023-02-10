import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
public class class194 extends DualNode {
   static {
      new EvictingDualNodeHashTable(64);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(ILrd;B)Lfy;",
      garbageValue = "-87"
   )
   public static PlayerCompositionColorTextureOverride method3810(int var0, Buffer var1) {
      int var2 = var1.readUnsignedByte();
      boolean var3 = (var2 & 1) != 0;
      boolean var4 = (var2 & 2) != 0;
      PlayerCompositionColorTextureOverride var5 = new PlayerCompositionColorTextureOverride(var0);
      int var6;
      int[] var7;
      boolean var8;
      int var9;
      short var10;
      if (var3) {
         var6 = var1.readUnsignedByte();
         var7 = new int[]{var6 & 15, var6 >> 4 & 15};
         var8 = var5.playerCompositionRecolorTo != null && var7.length == var5.playerCompositionRecolorTo.length;

         for(var9 = 0; var9 < 2; ++var9) {
            if (var7[var9] != 15) {
               var10 = (short)var1.readUnsignedShort();
               if (var8) {
                  var5.playerCompositionRecolorTo[var7[var9]] = var10;
               }
            }
         }
      }

      if (var4) {
         var6 = var1.readUnsignedByte();
         var7 = new int[]{var6 & 15, var6 >> 4 & 15};
         var8 = var5.playerCompositionRetextureTo != null && var7.length == var5.playerCompositionRetextureTo.length;

         for(var9 = 0; var9 < 2; ++var9) {
            if (var7[var9] != 15) {
               var10 = (short)var1.readUnsignedShort();
               if (var8) {
                  var5.playerCompositionRetextureTo[var7[var9]] = var10;
               }
            }
         }
      }

      return var5;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Z",
      garbageValue = "1472562241"
   )
   static boolean method3807(String var0) {
      if (var0 == null) {
         return false;
      } else {
         try {
            new URL(var0);
            return true;
         } catch (MalformedURLException var2) {
            return false;
         }
      }
   }

   @ObfuscatedName("mn")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "1730669881"
   )
   static void method3809(boolean var0) {
      Client.leftClickOpensMenu = var0;
   }
}
