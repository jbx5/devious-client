import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lq")
public class class298 {
   @ObfuscatedName("hy")
   @ObfuscatedSignature(
      descriptor = "(Ldi;II)V",
      garbageValue = "-2052019601"
   )
   @Export("updateActorSequence")
   static final void updateActorSequence(Actor var0, int var1) {
      int var4;
      int var9;
      if (var0.spotAnimation >= Client.cycle) {
         int var2 = Math.max(1, var0.spotAnimation - Client.cycle);
         var9 = var0.field1155 * 1292107776 + var0.field1203 * 128;
         var4 = var0.field1155 * 1292107776 + var0.field1205 * 128;
         var0.x += (var9 - var0.x) / var2;
         var0.y += (var4 - var0.y) / var2;
         var0.field1225 = 0;
         var0.orientation = var0.field1209;
      } else if (var0.field1208 >= Client.cycle) {
         boolean var10 = var0.field1208 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0;
         if (!var10) {
            SequenceDefinition var3 = WorldMapLabelSize.SequenceDefinition_get(var0.sequence);
            if (var3 != null && !var3.isCachedModelIdSet()) {
               var10 = var0.sequenceFrameCycle + 1 > var3.frameLengths[var0.sequenceFrame];
            } else {
               var10 = true;
            }
         }

         if (var10) {
            var9 = var0.field1208 - var0.spotAnimation;
            var4 = Client.cycle - var0.spotAnimation;
            int var5 = var0.field1155 * 1292107776 + var0.field1203 * 128;
            int var6 = var0.field1155 * 1292107776 + var0.field1205 * 128;
            int var7 = var0.field1155 * 1292107776 + var0.field1173 * 128;
            int var8 = var0.field1155 * 1292107776 + var0.field1206 * 128;
            var0.x = (var4 * var7 + var5 * (var9 - var4)) / var9;
            var0.y = (var8 * var4 + var6 * (var9 - var4)) / var9;
         }

         var0.field1225 = 0;
         var0.orientation = var0.field1209;
         var0.rotation = var0.orientation;
      } else {
         Clock.method3550(var0);
      }

      if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) {
         var0.sequence = -1;
         var0.spotAnimation = 0;
         var0.field1208 = 0;
         var0.clearSpotAnimations();
         var0.x = var0.field1155 * 1292107776 + var0.pathX[0] * 128;
         var0.y = var0.field1155 * 1292107776 + var0.pathY[0] * 128;
         var0.method2364();
      }

      if (Projectile.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) {
         var0.sequence = -1;
         var0.spotAnimation = 0;
         var0.field1208 = 0;
         var0.clearSpotAnimations();
         var0.x = var0.field1155 * 1292107776 + var0.pathX[0] * 128;
         var0.y = var0.field1155 * 1292107776 + var0.pathY[0] * 128;
         var0.method2364();
      }

      PcmPlayer.method797(var0);
      class104.method2671(var0);
   }
}
