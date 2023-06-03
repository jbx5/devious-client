import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
@Implements("BoundaryObject")
public final class BoundaryObject {
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1322040305
   )
   @Export("z")
   int z;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1395173813
   )
   @Export("x")
   int x;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 2147061777
   )
   @Export("y")
   int y;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -312981103
   )
   @Export("orientationA")
   int orientationA;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -272343979
   )
   @Export("orientationB")
   int orientationB;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lim;"
   )
   @Export("renderable1")
   public Renderable renderable1;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lim;"
   )
   @Export("renderable2")
   public Renderable renderable2;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      longValue = -1669611721957992963L
   )
   @Export("tag")
   public long tag = 0L;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 1298585617
   )
   @Export("flags")
   int flags = 0;

   BoundaryObject() {
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)J",
      garbageValue = "-149818697"
   )
   public static final synchronized long method5027() {
      long var0 = System.currentTimeMillis();
      if (var0 < class300.field3364) {
         class300.field3365 += class300.field3364 - var0;
      }

      class300.field3364 = var0;
      return var0 + class300.field3365;
   }

   @ObfuscatedName("jc")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIIIII)V",
      garbageValue = "190093423"
   )
   static final void method5026(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      PendingSpawn var10 = null;

      for(PendingSpawn var11 = (PendingSpawn)Client.pendingSpawns.last(); var11 != null; var11 = (PendingSpawn)Client.pendingSpawns.previous()) {
         if (var0 == var11.plane && var11.x == var1 && var2 == var11.y && var3 == var11.type) {
            var10 = var11;
            break;
         }
      }

      if (var10 == null) {
         var10 = new PendingSpawn();
         var10.plane = var0;
         var10.type = var3;
         var10.x = var1;
         var10.y = var2;
         var10.field1143 = -1;
         DirectByteArrayCopier.method6568(var10);
         Client.pendingSpawns.addFirst(var10);
      }

      var10.field1148 = var4;
      var10.field1142 = var5;
      var10.field1141 = var6;
      var10.delay = var8;
      var10.hitpoints = var9;
      var10.method2346(var7);
   }
}
