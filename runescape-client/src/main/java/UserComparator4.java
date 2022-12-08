import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
   @ObfuscatedName("h")
   @Export("reversed")
   final boolean reversed;

   public UserComparator4(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Loa;Loa;I)I",
      garbageValue = "1724042479"
   )
   @Export("compare_bridged")
   int compare_bridged(Buddy var1, Buddy var2) {
      return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
   }

   public int compare(Object var1, Object var2) {
      return this.compare_bridged((Buddy)var1, (Buddy)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("ju")
   @ObfuscatedSignature(
      descriptor = "(Lcm;B)V",
      garbageValue = "0"
   )
   static final void method2809(PendingSpawn var0) {
      long var1 = 0L;
      int var3 = -1;
      int var4 = 0;
      int var5 = 0;
      if (var0.type == 0) {
         var1 = ReflectionCheck.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
      }

      if (var0.type == 1) {
         var1 = ReflectionCheck.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
      }

      if (var0.type == 2) {
         var1 = ReflectionCheck.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
      }

      if (var0.type == 3) {
         var1 = ReflectionCheck.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y);
      }

      if (var1 != 0L) {
         int var6 = ReflectionCheck.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1);
         var3 = Occluder.Entity_unpackID(var1);
         var4 = var6 & 31;
         var5 = var6 >> 6 & 3;
      }

      var0.objectId = var3;
      var0.field1166 = var4;
      var0.field1175 = var5;
   }
}
