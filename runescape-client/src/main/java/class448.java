import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qf")
public class class448 extends class412 implements class261 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Llg;"
   )
   final AbstractArchive field4819;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lje;"
   )
   final DemotingHashTable field4818 = new DemotingHashTable(64);
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 45732989
   )
   final int field4817;

   @ObfuscatedSignature(
      descriptor = "(Llq;ILmo;Llg;)V"
   )
   public class448(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
      super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0);
      this.field4819 = var4;
      this.field4817 = var2;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(II)Loz;",
      garbageValue = "-481589875"
   )
   protected class414 vmethod8207(int var1) {
      synchronized(this.field4818) {
         class413 var2 = (class413)this.field4818.get((long)var1);
         if (var2 == null) {
            var2 = this.method8211(var1);
            this.field4818.method5318(var2, (long)var1);
         }

         return var2;
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(IS)Loa;",
      garbageValue = "-26927"
   )
   class413 method8211(int var1) {
      byte[] var2 = this.field4819.takeFile(this.field4817, var1);
      class413 var3 = new class413(var1);
      if (var2 != null) {
         var3.method7768(new Buffer(var2));
      }

      return var3;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1409186712"
   )
   public void method8210() {
      synchronized(this.field4818) {
         this.field4818.clear();
      }
   }

   public Iterator iterator() {
      return new class447(this);
   }
}
