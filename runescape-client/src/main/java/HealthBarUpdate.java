import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -2099337445
   )
   @Export("cycle")
   int cycle;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1755264669
   )
   @Export("health")
   int health;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -230167291
   )
   @Export("health2")
   int health2;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1970776735
   )
   @Export("cycleOffset")
   int cycleOffset;

   HealthBarUpdate(int var1, int var2, int var3, int var4) {
      this.cycle = var1;
      this.health = var2;
      this.health2 = var3;
      this.cycleOffset = var4;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "-1406934532"
   )
   @Export("set")
   void set(int var1, int var2, int var3, int var4) {
      this.cycle = var1;
      this.health = var2;
      this.health2 = var3;
      this.cycleOffset = var4;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V",
      garbageValue = "-2080899398"
   )
   public static void method2341(Applet var0, String var1) {
      class32.field175 = var0;
      if (var1 != null) {
         class32.field176 = var1;
      }

   }
}
