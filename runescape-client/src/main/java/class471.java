import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("st")
public class class471 extends DualNode {
   @ObfuscatedName("kt")
   @ObfuscatedGetter(
      intValue = 2039604875
   )
   @Export("cameraZ")
   static int cameraZ;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "[Lrf;"
   )
   class467[] field4875;
   @ObfuscatedName("an")
   List field4876;

   @ObfuscatedSignature(
      descriptor = "(Lne;I)V"
   )
   public class471(AbstractArchive var1, int var2) {
      byte[] var3 = var1.takeFile(var2, 0);
      this.method8513(new Buffer(var3));
   }

   @ObfuscatedSignature(
      descriptor = "(Lne;II)V"
   )
   public class471(AbstractArchive var1, int var2, int var3) {
      byte[] var4 = var1.takeFile(var2, var3 + 1);
      this.method8513(new Buffer(var4));
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lsy;I)V",
      garbageValue = "2066420776"
   )
   void method8513(Buffer var1) {
      int var2 = var1.packBytesToInt();
      this.field4875 = new class467[var2];
      this.field4876 = new ArrayList(var2);

      for(int var3 = 0; var3 < var2; ++var3) {
         this.field4875[var3] = (class467)SpriteMask.findEnumerated(class467.method8480(), var1.readUnsignedByte());
         int var4 = var1.packBytesToInt();
         HashMap var5 = new HashMap(var4);

         while(var4-- > 0) {
            Object var6 = this.field4875[var3].method8465(var1);
            int var7 = var1.packBytesToInt();
            ArrayList var8 = new ArrayList();

            while(var7-- > 0) {
               int var9 = var1.packBytesToInt();
               var8.add(var9);
            }

            var5.put(var6, var8);
         }

         this.field4876.add(var3, var5);
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;II)Ljava/util/List;",
      garbageValue = "1213630934"
   )
   public List method8512(Object var1, int var2) {
      if (var2 < 0) {
         var2 = 0;
      }

      Map var3 = (Map)this.field4876.get(var2);
      return (List)var3.get(var1);
   }
}
