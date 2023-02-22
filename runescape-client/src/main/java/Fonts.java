import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rs")
@Implements("Fonts")
public class Fonts {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   @Export("spritesArchive")
   AbstractArchive spritesArchive;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   @Export("fontsArchive")
   AbstractArchive fontsArchive;
   @ObfuscatedName("ac")
   @Export("map")
   HashMap map;

   @ObfuscatedSignature(
      descriptor = "(Lne;Lne;)V"
   )
   public Fonts(AbstractArchive var1, AbstractArchive var2) {
      this.spritesArchive = var1;
      this.fontsArchive = var2;
      this.map = new HashMap();
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "([Lry;I)Ljava/util/HashMap;",
      garbageValue = "1210819555"
   )
   @Export("createMap")
   public HashMap createMap(FontName[] var1) {
      HashMap var2 = new HashMap();
      FontName[] var3 = var1;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         FontName var5 = var3[var4];
         if (this.map.containsKey(var5)) {
            var2.put(var5, this.map.get(var5));
         } else {
            Font var6 = class478.method8894(this.spritesArchive, this.fontsArchive, var5.name, "");
            if (var6 != null) {
               this.map.put(var5, var6);
               var2.put(var5, var6);
            }
         }
      }

      return var2;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Lsq;I)I",
      garbageValue = "-253247961"
   )
   static int method8249(PacketBuffer var0) {
      int var1 = var0.readBits(2);
      int var2;
      if (var1 == 0) {
         var2 = 0;
      } else if (var1 == 1) {
         var2 = var0.readBits(5);
      } else if (var1 == 2) {
         var2 = var0.readBits(8);
      } else {
         var2 = var0.readBits(11);
      }

      return var2;
   }
}
