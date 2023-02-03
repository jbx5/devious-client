import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qc")
public class class467 extends DualNode {
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "[Lqn;"
   )
   class463[] field4914;
   @ObfuscatedName("z")
   List field4913;

   @ObfuscatedSignature(
      descriptor = "(Lln;I)V"
   )
   public class467(AbstractArchive var1, int var2) {
      byte[] var3 = var1.takeFile(var2, 0);
      this.method8553(new Buffer(var3));
   }

   @ObfuscatedSignature(
      descriptor = "(Lln;II)V"
   )
   public class467(AbstractArchive var1, int var2, int var3) {
      byte[] var4 = var1.takeFile(var2, var3 + 1);
      this.method8553(new Buffer(var4));
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lrd;I)V",
      garbageValue = "-1407265611"
   )
   void method8553(Buffer var1) {
      int var2 = var1.packBytesToInt();
      this.field4914 = new class463[var2];
      this.field4913 = new ArrayList(var2);

      for(int var3 = 0; var3 < var2; ++var3) {
         this.field4914[var3] = (class463)class4.findEnumerated(class463.method8503(), var1.readUnsignedByte());
         int var4 = var1.packBytesToInt();
         HashMap var5 = new HashMap(var4);

         while(var4-- > 0) {
            Object var6 = this.field4914[var3].method8507(var1);
            int var7 = var1.packBytesToInt();
            ArrayList var8 = new ArrayList();

            while(var7-- > 0) {
               int var9 = var1.packBytesToInt();
               var8.add(var9);
            }

            var5.put(var6, var8);
         }

         this.field4913.add(var3, var5);
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;II)Ljava/util/List;",
      garbageValue = "693163868"
   )
   public List method8548(Object var1, int var2) {
      if (var2 < 0) {
         var2 = 0;
      }

      Map var3 = (Map)this.field4913.get(var2);
      return (List)var3.get(var1);
   }

   @ObfuscatedName("hx")
   @ObfuscatedSignature(
      descriptor = "(IIIB)V",
      garbageValue = "48"
   )
   @Export("worldToScreen")
   static final void worldToScreen(int var0, int var1, int var2) {
      if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
         int var3 = GrandExchangeOfferNameComparator.getTileHeight(var0, var1, class103.Client_plane) - var2;
         var0 -= ClanSettings.cameraX;
         var3 -= UserComparator10.cameraY;
         var1 -= class366.cameraZ;
         int var4 = Rasterizer3D.Rasterizer3D_sine[class103.cameraPitch];
         int var5 = Rasterizer3D.Rasterizer3D_cosine[class103.cameraPitch];
         int var6 = Rasterizer3D.Rasterizer3D_sine[class285.cameraYaw];
         int var7 = Rasterizer3D.Rasterizer3D_cosine[class285.cameraYaw];
         int var8 = var6 * var1 + var0 * var7 >> 16;
         var1 = var7 * var1 - var0 * var6 >> 16;
         var0 = var8;
         var8 = var3 * var5 - var4 * var1 >> 16;
         var1 = var5 * var1 + var4 * var3 >> 16;
         if (var1 >= 50) {
            Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2;
            Client.viewportTempY = Client.viewportHeight / 2 + var8 * Client.viewportZoom / var1;
         } else {
            Client.viewportTempX = -1;
            Client.viewportTempY = -1;
         }

      } else {
         Client.viewportTempX = -1;
         Client.viewportTempY = -1;
      }
   }
}
