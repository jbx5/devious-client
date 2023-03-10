import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
   @ObfuscatedName("vc")
   @ObfuscatedSignature(
      descriptor = "Lrt;"
   )
   @Export("platformInfo")
   static PlatformInfo platformInfo;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lsy;"
   )
   public static Buffer field1223;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -259594641
   )
   @Export("cycle")
   int cycle;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 773379775
   )
   @Export("health")
   int health;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 323434117
   )
   @Export("health2")
   int health2;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -685069757
   )
   @Export("cycleOffset")
   int cycleOffset;

   HealthBarUpdate(int var1, int var2, int var3, int var4) {
      this.cycle = var1;
      this.health = var2;
      this.health2 = var3;
      this.cycleOffset = var4;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "-1435919028"
   )
   @Export("set")
   void set(int var1, int var2, int var3, int var4) {
      this.cycle = var1;
      this.health = var2;
      this.health2 = var3;
      this.cycleOffset = var4;
   }
}
