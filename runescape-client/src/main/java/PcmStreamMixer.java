import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lmo;"
   )
   @Export("subStreams")
   NodeDeque subStreams = new NodeDeque();
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lmo;"
   )
   NodeDeque field281 = new NodeDeque();
   @ObfuscatedName("s")
   int field280 = 0;
   @ObfuscatedName("z")
   int field283 = -1;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lan;)V"
   )
   @Export("addSubStream")
   public final synchronized void addSubStream(PcmStream var1) {
      this.subStreams.addLast(var1);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Lan;)V"
   )
   @Export("removeSubStream")
   public final synchronized void removeSubStream(PcmStream var1) {
      var1.remove();
   }

   @ObfuscatedName("v")
   void method702() {
      if (this.field280 > 0) {
         for(PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field281.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field281.previous()) {
            var1.field417 -= this.field280;
         }

         this.field283 -= this.field280;
         this.field280 = 0;
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(Lpr;Lbz;)V"
   )
   void method703(Node var1, PcmStreamMixerListener var2) {
      while(this.field281.sentinel != var1 && ((PcmStreamMixerListener)var1).field417 <= var2.field417) {
         var1 = var1.previous;
      }

      NodeDeque.NodeDeque_addBefore(var2, var1);
      this.field283 = ((PcmStreamMixerListener)this.field281.sentinel.previous).field417;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(Lbz;)V"
   )
   void method704(PcmStreamMixerListener var1) {
      var1.remove();
      var1.remove2();
      Node var2 = this.field281.sentinel.previous;
      if (var2 == this.field281.sentinel) {
         this.field283 = -1;
      } else {
         this.field283 = ((PcmStreamMixerListener)var2).field417;
      }

   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "()Lan;"
   )
   @Export("firstSubStream")
   protected PcmStream firstSubStream() {
      return (PcmStream)this.subStreams.last();
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "()Lan;"
   )
   @Export("nextSubStream")
   protected PcmStream nextSubStream() {
      return (PcmStream)this.subStreams.previous();
   }

   @ObfuscatedName("n")
   protected int vmethod5793() {
      return 0;
   }

   @ObfuscatedName("l")
   @Export("fill")
   public final synchronized void fill(int[] var1, int var2, int var3) {
      do {
         if (this.field283 < 0) {
            this.updateSubStreams(var1, var2, var3);
            return;
         }

         if (var3 + this.field280 < this.field283) {
            this.field280 += var3;
            this.updateSubStreams(var1, var2, var3);
            return;
         }

         int var4 = this.field283 - this.field280;
         this.updateSubStreams(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.field280 += var4;
         this.method702();
         PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field281.last();
         synchronized(var5) {
            int var7 = var5.update();
            if (var7 < 0) {
               var5.field417 = 0;
               this.method704(var5);
            } else {
               var5.field417 = var7;
               this.method703(var5.previous, var5);
            }
         }
      } while(var3 != 0);

   }

   @ObfuscatedName("k")
   @Export("updateSubStreams")
   void updateSubStreams(int[] var1, int var2, int var3) {
      for(PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) {
         var4.update(var1, var2, var3);
      }

   }

   @ObfuscatedName("c")
   @Export("skip")
   public final synchronized void skip(int var1) {
      do {
         if (this.field283 < 0) {
            this.skipSubStreams(var1);
            return;
         }

         if (this.field280 + var1 < this.field283) {
            this.field280 += var1;
            this.skipSubStreams(var1);
            return;
         }

         int var2 = this.field283 - this.field280;
         this.skipSubStreams(var2);
         var1 -= var2;
         this.field280 += var2;
         this.method702();
         PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field281.last();
         synchronized(var3) {
            int var5 = var3.update();
            if (var5 < 0) {
               var3.field417 = 0;
               this.method704(var3);
            } else {
               var3.field417 = var5;
               this.method703(var3.previous, var3);
            }
         }
      } while(var1 != 0);

   }

   @ObfuscatedName("r")
   @Export("skipSubStreams")
   void skipSubStreams(int var1) {
      for(PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) {
         var2.skip(var1);
      }

   }
}
