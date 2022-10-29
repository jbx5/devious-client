import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
public class class156 {
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;ZB)Lqv;",
      garbageValue = "-62"
   )
   @Export("getPreferencesFile")
   public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
      File var3 = new File(class303.cacheDir, "preferences" + var0 + ".dat");
      if (var3.exists()) {
         try {
            AccessFile var10 = new AccessFile(var3, "rw", 10000L);
            return var10;
         } catch (IOException var9) {
         }
      }

      String var4 = "";
      if (JagexCache.cacheGamebuild == 33) {
         var4 = "_rc";
      } else if (JagexCache.cacheGamebuild == 34) {
         var4 = "_wip";
      }

      File var5 = new File(class37.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
      AccessFile var6;
      if (!var2 && var5.exists()) {
         try {
            var6 = new AccessFile(var5, "rw", 10000L);
            return var6;
         } catch (IOException var8) {
         }
      }

      try {
         var6 = new AccessFile(var3, "rw", 10000L);
         return var6;
      } catch (IOException var7) {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "2"
   )
   public static void method3225() {
      VarpDefinition.VarpDefinition_cached.clear();
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "52"
   )
   static int method3226(int var0) {
      return (int)((Math.log((double)var0) / Interpreter.field853 - 7.0) * 256.0);
   }
}
