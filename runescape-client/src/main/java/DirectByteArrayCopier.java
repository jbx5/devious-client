import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mt")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
   @ObfuscatedName("at")
   @Export("directBuffer")
   ByteBuffer directBuffer;

   DirectByteArrayCopier() {
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)[B",
      garbageValue = "-2143916315"
   )
   @Export("get")
   byte[] get() {
      byte[] var1 = new byte[this.directBuffer.capacity()];
      this.directBuffer.position(0);
      this.directBuffer.get(var1);
      return var1;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "([BI)V",
      garbageValue = "-752004447"
   )
   @Export("set")
   void set(byte[] var1) {
      this.directBuffer = ByteBuffer.allocateDirect(var1.length);
      this.directBuffer.position(0);
      this.directBuffer.put(var1);
   }

   @ObfuscatedName("js")
   @ObfuscatedSignature(
      descriptor = "(Ldv;B)V",
      garbageValue = "-55"
   )
   static final void method6568(PendingSpawn var0) {
      long var1 = 0L;
      int var3 = -1;
      int var4 = 0;
      int var5 = 0;
      if (var0.type == 0) {
         var1 = class36.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
      }

      if (var0.type == 1) {
         var1 = class36.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
      }

      if (var0.type == 2) {
         var1 = class36.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
      }

      if (var0.type == 3) {
         var1 = class36.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y);
      }

      if (var1 != 0L) {
         int var6 = class36.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1);
         var3 = class215.Entity_unpackID(var1);
         var4 = var6 & 31;
         var5 = var6 >> 6 & 3;
      }

      var0.objectId = var3;
      var0.field1133 = var4;
      var0.field1140 = var5;
   }
}
