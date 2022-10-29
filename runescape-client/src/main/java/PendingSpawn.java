import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
   @ObfuscatedName("kb")
   @ObfuscatedGetter(
      intValue = -218447275
   )
   @Export("oculusOrbFocalPointY")
   static int oculusOrbFocalPointY;
   @ObfuscatedName("ng")
   @ObfuscatedSignature(
      descriptor = "Lbu;"
   )
   @Export("tempMenuAction")
   static MenuAction tempMenuAction;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1263397621
   )
   @Export("plane")
   int plane;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -842145695
   )
   @Export("type")
   int type;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1177382329
   )
   @Export("x")
   int x;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 108970709
   )
   @Export("y")
   int y;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -629751609
   )
   @Export("objectId")
   int objectId;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 876767589
   )
   int field1125;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 405039167
   )
   int field1126;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1279879293
   )
   int field1127;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 365543913
   )
   int field1120;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1709598819
   )
   int field1129;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -2023596541
   )
   int field1130 = 31;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 592744411
   )
   @Export("delay")
   int delay = 0;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -313479829
   )
   @Export("hitpoints")
   int hitpoints = -1;

   PendingSpawn() {
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "14"
   )
   void method2310(int var1) {
      this.field1130 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "62"
   )
   boolean method2311(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return (this.field1130 & 1 << var1) != 0;
      } else {
         return true;
      }
   }
}
