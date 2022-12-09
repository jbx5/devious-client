import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
public enum class204 implements MouseWheel {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lgs;"
   )
   field2354((byte)-1),
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lgs;"
   )
   field2356((byte)0),
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lgs;"
   )
   field2355((byte)1),
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lgs;"
   )
   field2357((byte)2);

   @ObfuscatedName("m")
   public byte field2358;

   class204(byte var3) {
      this.field2358 = var3;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "96"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field2358;
   }

   @ObfuscatedName("je")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1945373310"
   )
   static final void method4182() {
      for(PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) {
         if (var0.hitpoints == -1) {
            var0.delay = 0;
            UserComparator4.method2809(var0);
         } else {
            var0.remove();
         }
      }

   }
}
