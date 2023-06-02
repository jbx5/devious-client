import java.util.Comparator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pm")
class class408 implements Comparator {
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lpj;"
   )
   final class407 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lpj;)V"
   )
   class408(class407 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;I)I",
      garbageValue = "1421575480"
   )
   int method7679(Map.Entry var1, Map.Entry var2) {
      return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
   }

   public int compare(Object var1, Object var2) {
      return this.method7679((Map.Entry)var1, (Map.Entry)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("hl")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-8"
   )
   static final void method7686() {
      ApproximateRouteStrategy.method1186(UserComparator8.field1415, WallDecoration.field2828, Clock.field1883);
      InvDefinition.method3561(Clock.field1884, class53.field368);
      if (UserComparator8.field1415 == class208.cameraX && WallDecoration.field2828 == class152.cameraY && Clock.field1883 == ByteArrayPool.cameraZ && Clock.field1884 == MusicPatchNode.cameraPitch && class53.field368 == class291.cameraYaw) {
         Client.field691 = false;
         Client.isCameraLocked = false;
         Client.field764 = false;
         Client.field725 = false;
         HealthBarUpdate.field1233 = 0;
         class137.field1605 = 0;
         HitSplatDefinition.field2142 = 0;
         BufferedSource.field4636 = 0;
         class209.field2322 = 0;
         LoginScreenAnimation.field1255 = 0;
         UserComparator4.field1410 = 0;
         class126.field1469 = 0;
         class217.field2401 = 0;
         class85.field1044 = 0;
         Client.field540 = null;
         Client.field769 = null;
         Client.field768 = null;
      }

   }
}
