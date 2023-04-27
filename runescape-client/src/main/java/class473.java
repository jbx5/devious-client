import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("su")
public class class473 extends class430 implements class275 {
   @ObfuscatedName("ev")
   @Export("mouseCam")
   static boolean mouseCam;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lnm;"
   )
   final AbstractArchive field4937;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   final DemotingHashTable field4936 = new DemotingHashTable(64);
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -418179859
   )
   final int field4938;

   @ObfuscatedSignature(
      descriptor = "(Lmr;ILnx;Lnm;)V"
   )
   public class473(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
      super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0);
      this.field4937 = var4;
      this.field4938 = var2;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(IB)Lqg;",
      garbageValue = "0"
   )
   protected class432 vmethod8824(int var1) {
      synchronized(this.field4936) {
         class431 var2 = (class431)this.field4936.get((long)var1);
         if (var2 == null) {
            var2 = this.method8838(var1);
            this.field4936.method5646(var2, (long)var1);
         }

         return var2;
      }
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(II)Lqb;",
      garbageValue = "-989370023"
   )
   class431 method8838(int var1) {
      byte[] var2 = this.field4937.takeFile(this.field4938, var1);
      class431 var3 = new class431(var1);
      if (var2 != null) {
         var3.method8303(new Buffer(var2));
      }

      return var3;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-105"
   )
   public void method8823() {
      synchronized(this.field4936) {
         this.field4936.clear();
      }
   }

   public Iterator iterator() {
      return new class472(this);
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(B)[Lhd;",
      garbageValue = "-126"
   )
   static HorizontalAlignment[] method8839() {
      return new HorizontalAlignment[]{HorizontalAlignment.field1990, HorizontalAlignment.field1992, HorizontalAlignment.HorizontalAlignment_centered};
   }
}
