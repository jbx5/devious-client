import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
public class class121 {
   @ObfuscatedName("a")
   @Export("cacheParentPaths")
   public static String[] cacheParentPaths;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1166574037
   )
   int field1502;
   @ObfuscatedName("e")
   float field1497;
   @ObfuscatedName("v")
   float field1496 = Float.MAX_VALUE;
   @ObfuscatedName("x")
   float field1499 = Float.MAX_VALUE;
   @ObfuscatedName("m")
   float field1500 = Float.MAX_VALUE;
   @ObfuscatedName("q")
   float field1498 = Float.MAX_VALUE;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Ldq;"
   )
   class121 field1501;

   class121() {
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lqy;II)V",
      garbageValue = "1617793347"
   )
   void method2884(Buffer var1, int var2) {
      this.field1502 = var1.readShort();
      this.field1497 = var1.method8556();
      this.field1496 = var1.method8556();
      this.field1499 = var1.method8556();
      this.field1500 = var1.method8556();
      this.field1498 = var1.method8556();
   }

   @ObfuscatedName("ia")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-912452366"
   )
   static boolean method2887() {
      return (Client.drawPlayerNames & 2) != 0;
   }
}
