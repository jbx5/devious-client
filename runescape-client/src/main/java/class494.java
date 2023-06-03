import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tb")
public class class494 extends DualNode {
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "[Lsw;"
   )
   class490[] field4989;
   @ObfuscatedName("ax")
   List field4991;

   @ObfuscatedSignature(
      descriptor = "(Lnq;I)V"
   )
   public class494(AbstractArchive var1, int var2) {
      byte[] var3 = var1.takeFile(var2, 0);
      this.method8802(new Buffer(var3));
   }

   @ObfuscatedSignature(
      descriptor = "(Lnq;II)V"
   )
   public class494(AbstractArchive var1, int var2, int var3) {
      byte[] var4 = var1.takeFile(var2, var3 + 1);
      this.method8802(new Buffer(var4));
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ltz;I)V",
      garbageValue = "1347371252"
   )
   void method8802(Buffer var1) {
      int var2 = var1.packBytesToInt();
      this.field4989 = new class490[var2];
      this.field4991 = new ArrayList(var2);

      for(int var3 = 0; var3 < var2; ++var3) {
         this.field4989[var3] = (class490)GameObject.findEnumerated(class490.method8761(), var1.readUnsignedByte());
         int var4 = var1.packBytesToInt();
         HashMap var5 = new HashMap(var4);

         while(var4-- > 0) {
            Object var6 = this.field4989[var3].method8758(var1);
            int var7 = var1.packBytesToInt();
            ArrayList var8 = new ArrayList();

            while(var7-- > 0) {
               int var9 = var1.packBytesToInt();
               var8.add(var9);
            }

            var5.put(var6, var8);
         }

         this.field4991.add(var3, var5);
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;II)Ljava/util/List;",
      garbageValue = "2136063107"
   )
   public List method8803(Object var1, int var2) {
      if (var2 < 0) {
         var2 = 0;
      }

      Map var3 = (Map)this.field4991.get(var2);
      return (List)var3.get(var1);
   }
}
