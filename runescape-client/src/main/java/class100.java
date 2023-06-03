import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
public class class100 {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(II)Ljava/lang/String;",
      garbageValue = "405828754"
   )
   static String method2624(int var0) {
      return "<img=" + var0 + ">";
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(II)Lhn;",
      garbageValue = "451118805"
   )
   @Export("VarpDefinition_get")
   public static VarpDefinition VarpDefinition_get(int var0) {
      VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class305.VarpDefinition_archive.takeFile(16, var0);
         var1 = new VarpDefinition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         VarpDefinition.VarpDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "80451609"
   )
   @Export("savePreferences")
   static void savePreferences() {
      AccessFile var0 = null;

      try {
         var0 = FontName.getPreferencesFile("", GameBuild.field3841.name, true);
         Buffer var1 = class10.clientPreferences.toBuffer();
         var0.write(var1.array, 0, var1.offset);
      } catch (Exception var3) {
      }

      try {
         if (var0 != null) {
            var0.closeSync(true);
         }
      } catch (Exception var2) {
      }

   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;ZLjava/lang/String;ZI)V",
      garbageValue = "-486098991"
   )
   static void method2626(String var0, boolean var1, String var2, boolean var3) {
      if (var1) {
         if (!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
               Desktop.getDesktop().browse(new URI(var0));
               return;
            } catch (Exception var5) {
            }
         }

         if (class31.field160.startsWith("win") && !var3) {
            class14.method183(var0, 0, "openjs");
            return;
         }

         if (class31.field160.startsWith("mac")) {
            class14.method183(var0, 1, var2);
            return;
         }

         class14.method183(var0, 2, "openjs");
      } else {
         class14.method183(var0, 3, "openjs");
      }

   }
}
