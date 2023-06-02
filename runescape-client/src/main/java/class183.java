import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
final class class183 implements ThreadFactory {
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "Lkt;"
   )
   @Export("worldMapEvent")
   static WorldMapEvent worldMapEvent;
   @ObfuscatedName("fp")
   @ObfuscatedGetter(
      longValue = 4970118341205214433L
   )
   static long field1893;

   public Thread newThread(Runnable var1) {
      return new Thread(var1, "OSRS Maya Anim Load");
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IB)Lhf;",
      garbageValue = "77"
   )
   public static FloorUnderlayDefinition method3553(int var0) {
      FloorUnderlayDefinition var1 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var0);
         var1 = new FloorUnderlayDefinition();
         if (var2 != null) {
            var1.decode(new Buffer(var2), var0);
         }

         var1.postDecode();
         FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }
}
