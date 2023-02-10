import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1205456479
   )
   @Export("cycle")
   int cycle;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1905009045
   )
   @Export("health")
   int health;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 481450881
   )
   @Export("health2")
   int health2;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1800793113
   )
   @Export("cycleOffset")
   int cycleOffset;

   HealthBarUpdate(int var1, int var2, int var3, int var4) {
      this.cycle = var1;
      this.health = var2;
      this.health2 = var3;
      this.cycleOffset = var4;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IIIIB)V",
      garbageValue = "88"
   )
   @Export("set")
   void set(int var1, int var2, int var3, int var4) {
      this.cycle = var1;
      this.health = var2;
      this.health2 = var3;
      this.cycleOffset = var4;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "-1170890753"
   )
   static void method2442(String var0, String var1, String var2) {
      ReflectionCheck.method696(7);
      class70.setLoginResponseString(var0, var1, var2);
   }
}
