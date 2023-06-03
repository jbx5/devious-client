import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sr")
@Implements("Fonts")
public class Fonts {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lnq;"
   )
   @Export("spritesArchive")
   AbstractArchive spritesArchive;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lnq;"
   )
   @Export("fontsArchive")
   AbstractArchive fontsArchive;
   @ObfuscatedName("av")
   @Export("map")
   HashMap map;

   @ObfuscatedSignature(
      descriptor = "(Lnq;Lnq;)V"
   )
   public Fonts(AbstractArchive var1, AbstractArchive var2) {
      this.spritesArchive = var1;
      this.fontsArchive = var2;
      this.map = new HashMap();
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "([Lsb;B)Ljava/util/HashMap;",
      garbageValue = "46"
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
            Font var6 = class478.method8649(this.spritesArchive, this.fontsArchive, var5.name, "");
            if (var6 != null) {
               this.map.put(var5, var6);
               var2.put(var5, var6);
            }
         }
      }

      return var2;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Lny;II)V",
      garbageValue = "-1908099645"
   )
   public static void method8576(Archive var0, int var1) {
      class411.field4561.offset = var1 * 8 + 5;
      if (class411.field4561.offset >= class411.field4561.array.length) {
         if (var0.field4242) {
            var0.method6648();
         } else {
            throw new RuntimeException("");
         }
      } else {
         int var2 = class411.field4561.readInt();
         int var3 = class411.field4561.readInt();
         var0.loadIndex(var2, var3);
      }
   }
}
