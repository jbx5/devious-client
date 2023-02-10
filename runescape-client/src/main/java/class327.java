import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("ll")
public class class327 {
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-344515388"
   )
   public static boolean method6445(int var0) {
      return var0 >= WorldMapDecorationType.field3763.id && var0 <= WorldMapDecorationType.field3764.id;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;",
      garbageValue = "-502354535"
   )
   @Export("loadClassFromDescriptor")
   static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
      if (var0.equals("B")) {
         return Byte.TYPE;
      } else if (var0.equals("I")) {
         return Integer.TYPE;
      } else if (var0.equals("S")) {
         return Short.TYPE;
      } else if (var0.equals("J")) {
         return Long.TYPE;
      } else if (var0.equals("Z")) {
         return Boolean.TYPE;
      } else if (var0.equals("F")) {
         return Float.TYPE;
      } else if (var0.equals("D")) {
         return Double.TYPE;
      } else if (var0.equals("C")) {
         return Character.TYPE;
      } else {
         return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0);
      }
   }
}
