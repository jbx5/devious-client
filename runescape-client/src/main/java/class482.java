import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sk")
public class class482 extends DualNode {
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "[Lsh;"
   )
   class478[] field4964;
   @ObfuscatedName("au")
   List field4962;

   @ObfuscatedSignature(
      descriptor = "(Lnm;I)V"
   )
   public class482(AbstractArchive var1, int var2) {
      byte[] var3 = var1.takeFile(var2, 0);
      this.method8948(new Buffer(var3));
   }

   @ObfuscatedSignature(
      descriptor = "(Lnm;II)V"
   )
   public class482(AbstractArchive var1, int var2, int var3) {
      byte[] var4 = var1.takeFile(var2, var3 + 1);
      this.method8948(new Buffer(var4));
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lsg;I)V",
      garbageValue = "1796406235"
   )
   void method8948(Buffer var1) {
      int var2 = var1.packBytesToInt();
      this.field4964 = new class478[var2];
      this.field4962 = new ArrayList(var2);

      for(int var3 = 0; var3 < var2; ++var3) {
         this.field4964[var3] = (class478)StructComposition.findEnumerated(class478.method8889(), var1.readUnsignedByte());
         int var4 = var1.packBytesToInt();
         HashMap var5 = new HashMap(var4);

         while(var4-- > 0) {
            Object var6 = this.field4964[var3].method8895(var1);
            int var7 = var1.packBytesToInt();
            ArrayList var8 = new ArrayList();

            while(var7-- > 0) {
               int var9 = var1.packBytesToInt();
               var8.add(var9);
            }

            var5.put(var6, var8);
         }

         this.field4962.add(var3, var5);
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;II)Ljava/util/List;",
      garbageValue = "-1777573466"
   )
   public List method8949(Object var1, int var2) {
      if (var2 < 0) {
         var2 = 0;
      }

      Map var3 = (Map)this.field4962.get(var2);
      return (List)var3.get(var1);
   }
}
