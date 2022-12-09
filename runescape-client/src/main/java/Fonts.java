import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pz")
@Implements("Fonts")
public class Fonts {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   @Export("spritesArchive")
   AbstractArchive spritesArchive;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   @Export("fontsArchive")
   AbstractArchive fontsArchive;
   @ObfuscatedName("v")
   @Export("map")
   HashMap map;

   @ObfuscatedSignature(
      descriptor = "(Lly;Lly;)V"
   )
   public Fonts(AbstractArchive var1, AbstractArchive var2) {
      this.spritesArchive = var1;
      this.fontsArchive = var2;
      this.map = new HashMap();
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "([Lpt;I)Ljava/util/HashMap;",
      garbageValue = "-1014513679"
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
            AbstractArchive var7 = this.spritesArchive;
            AbstractArchive var8 = this.fontsArchive;
            String var9 = var5.name;
            int var10 = var7.getGroupId(var9);
            int var11 = var7.getFileId(var10, "");
            Font var6 = Timer.method7358(var7, var8, var10, var11);
            if (var6 != null) {
               this.map.put(var5, var6);
               var2.put(var5, var6);
            }
         }
      }

      return var2;
   }
}
