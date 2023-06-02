import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
public class class294 {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Llj;"
   )
   public static final class294 field3206 = new class294(4);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Llj;"
   )
   public static final class294 field3199 = new class294(11);
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Llj;"
   )
   public static final class294 field3207 = new class294(5);
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Llj;"
   )
   public static final class294 field3201 = new class294(14);
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Llj;"
   )
   public static final class294 field3198 = new class294(16);
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Llj;"
   )
   public static final class294 field3203 = new class294(4);
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Llj;"
   )
   public static final class294 field3202 = new class294(2);
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "Llj;"
   )
   public static final class294 field3205 = new class294(5);
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "Llj;"
   )
   public static final class294 field3208 = new class294(7);
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Llj;"
   )
   public static final class294 field3204 = new class294(14);
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Llj;"
   )
   public static final class294 field3200 = new class294(6);

   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "4"
   )
   class294(int var1) {
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "67"
   )
   public static void method5664(int var0) {
      if (var0 != -1) {
         if (class143.Widget_loadedInterfaces[var0]) {
            Widget.Widget_archive.clearFilesGroup(var0);
            if (class16.Widget_interfaceComponents[var0] != null) {
               for(int var1 = 0; var1 < class16.Widget_interfaceComponents[var0].length; ++var1) {
                  if (class16.Widget_interfaceComponents[var0][var1] != null) {
                     class16.Widget_interfaceComponents[var0][var1] = null;
                  }
               }

               class16.Widget_interfaceComponents[var0] = null;
               class143.Widget_loadedInterfaces[var0] = false;
            }
         }
      }
   }
}
