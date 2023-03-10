import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
@Implements("World")
public class World {
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 1803797909
   )
   @Export("World_count")
   static int World_count = 0;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -2132066839
   )
   @Export("World_listCount")
   static int World_listCount = 0;
   @ObfuscatedName("aq")
   @Export("World_sortOption2")
   static int[] World_sortOption2 = new int[]{1, 1, 1, 1};
   @ObfuscatedName("ap")
   @Export("World_sortOption1")
   static int[] World_sortOption1 = new int[]{0, 1, 2, 3};
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 366203181
   )
   @Export("id")
   int id;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -690420005
   )
   @Export("properties")
   int properties;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -1973783975
   )
   @Export("population")
   int population;
   @ObfuscatedName("ay")
   @Export("host")
   String host;
   @ObfuscatedName("am")
   @Export("activity")
   String activity;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = 1730133331
   )
   @Export("location")
   int location;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 922757633
   )
   @Export("index")
   int index;

   World() {
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1197157416"
   )
   @Export("isMembersOnly")
   boolean isMembersOnly() {
      return (1 & this.properties) != 0;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1562139493"
   )
   boolean method1833() {
      return (2 & this.properties) != 0;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1443165181"
   )
   @Export("isPvp")
   boolean isPvp() {
      return (4 & this.properties) != 0;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "2136415118"
   )
   boolean method1785() {
      return (8 & this.properties) != 0;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1167638922"
   )
   @Export("isDeadman")
   boolean isDeadman() {
      return (536870912 & this.properties) != 0;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "2065068860"
   )
   @Export("isBeta")
   boolean isBeta() {
      return (33554432 & this.properties) != 0;
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1238444309"
   )
   boolean method1820() {
      return (1073741824 & this.properties) != 0;
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "32"
   )
   boolean method1789() {
      return (256 & this.properties) != 0;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "2"
   )
   boolean method1790() {
      return (134217728 & this.properties) != 0;
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(Lmy;B)I",
      garbageValue = "2"
   )
   static int method1830(Widget var0) {
      if (var0.type != 11) {
         --HealthBar.Interpreter_stringStackSize;
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
         return 1;
      } else {
         String var1 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var0.method6109(var1);
         return 1;
      }
   }
}
