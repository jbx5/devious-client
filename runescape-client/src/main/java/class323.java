import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mm")
public class class323 {
   @ObfuscatedName("gc")
   @ObfuscatedGetter(
      intValue = 52013663
   )
   static int field3524;

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)V",
      garbageValue = "-38"
   )
   public static void method5998(Applet var0, String var1) {
      class31.field162 = var0;
      if (var1 != null) {
         class31.field160 = var1;
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lnq;I)V",
      garbageValue = "276922095"
   )
   public static void method6002(AbstractArchive var0) {
      FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var0;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(CB)Z",
      garbageValue = "-17"
   )
   @Export("isCharPrintable")
   public static boolean isCharPrintable(char var0) {
      if (var0 >= ' ' && var0 <= '~') {
         return true;
      } else if (var0 >= 160 && var0 <= 255) {
         return true;
      } else {
         return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376;
      }
   }
}
