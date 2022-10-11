import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
@Implements("ItemLayer")
public final class ItemLayer {
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 678178861
   )
   @Export("z")
   int z;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 216434323
   )
   @Export("x")
   int x;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1157533321
   )
   @Export("y")
   int y;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lhd;"
   )
   @Export("first")
   Renderable first;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lhd;"
   )
   @Export("second")
   Renderable second;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Lhd;"
   )
   @Export("third")
   Renderable third;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      longValue = -3757426312921201891L
   )
   @Export("tag")
   long tag;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 307553393
   )
   @Export("height")
   int height;

   ItemLayer() {
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "110475346"
   )
   static int method4054(int var0, int var1) {
      long var2 = (long)((var0 << 16) + var1);
      return UserComparator6.NetCache_currentResponse != null && var2 == UserComparator6.NetCache_currentResponse.key ? class420.NetCache_responseArchiveBuffer.offset * 99 / (class420.NetCache_responseArchiveBuffer.array.length - UserComparator6.NetCache_currentResponse.padding) + 1 : 0;
   }

   @ObfuscatedName("mf")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
      garbageValue = "1447216161"
   )
   static String method4055(String var0) {
      PlayerType[] var1 = class303.PlayerType_values();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         PlayerType var3 = var1[var2];
         if (var3.modIcon != -1 && var0.startsWith(class268.method5367(var3.modIcon))) {
            var0 = var0.substring(6 + Integer.toString(var3.modIcon).length());
            break;
         }
      }

      return var0;
   }
}
