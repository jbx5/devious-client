import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
   @ObfuscatedName("em")
   @ObfuscatedSignature(
      descriptor = "Llm;"
   )
   @Export("archive13")
   static Archive archive13;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1966483205
   )
   @Export("plane")
   int plane;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 827005237
   )
   @Export("type")
   int type;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 602578105
   )
   @Export("x")
   int x;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -890591527
   )
   @Export("y")
   int y;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -852502005
   )
   @Export("objectId")
   int objectId;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1719605699
   )
   int field1148;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 933994981
   )
   int field1149;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1534871701
   )
   int field1150;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 518048967
   )
   int field1151;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -354364767
   )
   int field1152;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -854755163
   )
   int field1153 = 31;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 1645697629
   )
   @Export("delay")
   int delay = 0;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -2085294823
   )
   @Export("hitpoints")
   int hitpoints = -1;

   PendingSpawn() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "178165513"
   )
   void method2414(int var1) {
      this.field1153 = var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-211927889"
   )
   boolean method2415(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return (this.field1153 & 1 << var1) != 0;
      } else {
         return true;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ljava/io/File;B)V",
      garbageValue = "1"
   )
   public static void method2421(File var0) {
      FileSystem.FileSystem_cacheDir = var0;
      if (!FileSystem.FileSystem_cacheDir.exists()) {
         throw new RuntimeException("");
      } else {
         FileSystem.FileSystem_hasPermissions = true;
      }
   }

   @ObfuscatedName("gr")
   @ObfuscatedSignature(
      descriptor = "(Lcl;IIB)V",
      garbageValue = "-1"
   )
   @Export("performPlayerAnimation")
   static void performPlayerAnimation(Player var0, int var1, int var2) {
      if (var0.sequence == var1 && var1 != -1) {
         int var3 = class85.SequenceDefinition_get(var1).field2308;
         if (var3 == 1) {
            var0.sequenceFrame = 0;
            var0.sequenceFrameCycle = 0;
            var0.sequenceDelay = var2;
            var0.field1205 = 0;
         }

         if (var3 == 2) {
            var0.field1205 = 0;
         }
      } else if (var1 == -1 || var0.sequence == -1 || class85.SequenceDefinition_get(var1).field2292 >= class85.SequenceDefinition_get(var0.sequence).field2292) {
         var0.sequence = var1;
         var0.sequenceFrame = 0;
         var0.sequenceFrameCycle = 0;
         var0.sequenceDelay = var2;
         var0.field1205 = 0;
         var0.field1230 = var0.pathLength;
      }

   }
}
