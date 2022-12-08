import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
public class AABB {
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -2055361545
   )
   int xMid;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1890114663
   )
   int yMid;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1812849095
   )
   int zMid;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 320710353
   )
   int xMidOffset;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1128965299
   )
   int yMidOffset;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 678945951
   )
   int zMidOffset;

   AABB(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.xMid = var1;
      this.yMid = var2;
      this.zMid = var3;
      this.xMidOffset = var4;
      this.yMidOffset = var5;
      this.zMidOffset = var6;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(II)Lga;",
      garbageValue = "-1342591919"
   )
   @Export("SequenceDefinition_get")
   public static SequenceDefinition SequenceDefinition_get(int var0) {
      SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = SequenceDefinition.SequenceDefinition_archive.takeFile(12, var0);
         var1 = new SequenceDefinition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         var1.postDecode();
         SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("id")
   @ObfuscatedSignature(
      descriptor = "(B)Lmq;",
      garbageValue = "-51"
   )
   public static NodeDeque method4611() {
      return Client.scriptEvents;
   }
}
