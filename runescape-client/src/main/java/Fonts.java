import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qq")
@Implements("Fonts")
public class Fonts {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   @Export("spritesArchive")
   AbstractArchive spritesArchive;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   @Export("fontsArchive")
   AbstractArchive fontsArchive;
   @ObfuscatedName("v")
   @Export("map")
   HashMap map;

   @ObfuscatedSignature(
      descriptor = "(Lln;Lln;)V"
   )
   public Fonts(AbstractArchive var1, AbstractArchive var2) {
      this.spritesArchive = var1;
      this.fontsArchive = var2;
      this.map = new HashMap();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "([Lqy;I)Ljava/util/HashMap;",
      garbageValue = "655550139"
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
            Font var6 = ScriptFrame.method1152(this.spritesArchive, this.fontsArchive, var5.name, "");
            if (var6 != null) {
               this.map.put(var5, var6);
               var2.put(var5, var6);
            }
         }
      }

      return var2;
   }
}
