import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cm")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
   @ObfuscatedName("ns")
   @ObfuscatedSignature(
      descriptor = "Lbs;"
   )
   @Export("tempMenuAction")
   static MenuAction tempMenuAction;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -768872951
   )
   @Export("plane")
   int plane;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1473814219
   )
   @Export("type")
   int type;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1941580187
   )
   @Export("x")
   int x;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 301883379
   )
   @Export("y")
   int y;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1863285855
   )
   @Export("objectId")
   int objectId;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1543631763
   )
   int field1175;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1082491127
   )
   int field1166;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -323138543
   )
   int field1167;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -910085015
   )
   int field1168;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1613827299
   )
   int field1169;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -1272901055
   )
   int field1165 = 31;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 583629257
   )
   @Export("delay")
   int delay = 0;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 1183420635
   )
   @Export("hitpoints")
   int hitpoints = -1;

   PendingSpawn() {
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-39"
   )
   void method2338(int var1) {
      this.field1165 = var1;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-2145111937"
   )
   boolean method2341(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return (this.field1165 & 1 << var1) != 0;
      } else {
         return true;
      }
   }
}
