import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lnh;"
   )
   @Export("subStreams")
   NodeDeque subStreams = new NodeDeque();
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lnh;"
   )
   NodeDeque field272 = new NodeDeque();
   @ObfuscatedName("aw")
   int field273 = 0;
   @ObfuscatedName("ac")
   int field274 = -1;

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lbp;)V"
   )
   @Export("addSubStream")
   public final synchronized void addSubStream(PcmStream var1) {
      this.subStreams.addLast(var1);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lbp;)V"
   )
   @Export("removeSubStream")
   public final synchronized void removeSubStream(PcmStream var1) {
      var1.remove();
   }

   @ObfuscatedName("aw")
   void method730() {
      if (this.field273 > 0) {
         for(PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field272.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field272.previous()) {
            var1.field411 -= this.field273;
         }

         this.field274 -= this.field273;
         this.field273 = 0;
      }

   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lrp;Lcs;)V"
   )
   void method731(Node var1, PcmStreamMixerListener var2) {
      while(this.field272.sentinel != var1 && ((PcmStreamMixerListener)var1).field411 <= var2.field411) {
         var1 = var1.previous;
      }

      NodeDeque.NodeDeque_addBefore(var2, var1);
      this.field274 = ((PcmStreamMixerListener)this.field272.sentinel.previous).field411;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(Lcs;)V"
   )
   void method737(PcmStreamMixerListener var1) {
      var1.remove();
      var1.remove2();
      Node var2 = this.field272.sentinel.previous;
      if (var2 == this.field272.sentinel) {
         this.field274 = -1;
      } else {
         this.field274 = ((PcmStreamMixerListener)var2).field411;
      }

   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "()Lbp;"
   )
   @Export("firstSubStream")
   protected PcmStream firstSubStream() {
      return (PcmStream)this.subStreams.last();
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "()Lbp;"
   )
   @Export("nextSubStream")
   protected PcmStream nextSubStream() {
      return (PcmStream)this.subStreams.previous();
   }

   @ObfuscatedName("al")
   protected int vmethod5949() {
      return 0;
   }

   @ObfuscatedName("at")
   @Export("fill")
   public final synchronized void fill(int[] var1, int var2, int var3) {
      do {
         if (this.field274 < 0) {
            this.updateSubStreams(var1, var2, var3);
            return;
         }

         if (var3 + this.field273 < this.field274) {
            this.field273 += var3;
            this.updateSubStreams(var1, var2, var3);
            return;
         }

         int var4 = this.field274 - this.field273;
         this.updateSubStreams(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.field273 += var4;
         this.method730();
         PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field272.last();
         synchronized(var5) {
            int var7 = var5.update();
            if (var7 < 0) {
               var5.field411 = 0;
               this.method737(var5);
            } else {
               var5.field411 = var7;
               this.method731(var5.previous, var5);
            }
         }
      } while(var3 != 0);

   }

   @ObfuscatedName("aa")
   @Export("updateSubStreams")
   void updateSubStreams(int[] var1, int var2, int var3) {
      for(PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) {
         var4.update(var1, var2, var3);
      }

   }

   @ObfuscatedName("ay")
   @Export("skip")
   public final synchronized void skip(int var1) {
      do {
         if (this.field274 < 0) {
            this.skipSubStreams(var1);
            return;
         }

         if (this.field273 + var1 < this.field274) {
            this.field273 += var1;
            this.skipSubStreams(var1);
            return;
         }

         int var2 = this.field274 - this.field273;
         this.skipSubStreams(var2);
         var1 -= var2;
         this.field273 += var2;
         this.method730();
         PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field272.last();
         synchronized(var3) {
            int var5 = var3.update();
            if (var5 < 0) {
               var3.field411 = 0;
               this.method737(var3);
            } else {
               var3.field411 = var5;
               this.method731(var3.previous, var3);
            }
         }
      } while(var1 != 0);

   }

   @ObfuscatedName("ao")
   @Export("skipSubStreams")
   void skipSubStreams(int var1) {
      for(PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) {
         var2.skip(var1);
      }

   }
}
