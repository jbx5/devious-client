import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lme;"
   )
   @Export("subStreams")
   NodeDeque subStreams = new NodeDeque();
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lme;"
   )
   NodeDeque field272 = new NodeDeque();
   @ObfuscatedName("c")
   int field274 = 0;
   @ObfuscatedName("x")
   int field275 = -1;

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lay;)V"
   )
   @Export("addSubStream")
   public final synchronized void addSubStream(PcmStream var1) {
      this.subStreams.addLast(var1);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lay;)V"
   )
   @Export("removeSubStream")
   public final synchronized void removeSubStream(PcmStream var1) {
      var1.remove();
   }

   @ObfuscatedName("c")
   void method720() {
      if (this.field274 > 0) {
         for(PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field272.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field272.previous()) {
            var1.field411 -= this.field274;
         }

         this.field275 -= this.field274;
         this.field274 = 0;
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Lpk;Lbp;)V"
   )
   void method721(Node var1, PcmStreamMixerListener var2) {
      while(this.field272.sentinel != var1 && ((PcmStreamMixerListener)var1).field411 <= var2.field411) {
         var1 = var1.previous;
      }

      NodeDeque.NodeDeque_addBefore(var2, var1);
      this.field275 = ((PcmStreamMixerListener)this.field272.sentinel.previous).field411;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lbp;)V"
   )
   void method722(PcmStreamMixerListener var1) {
      var1.remove();
      var1.remove2();
      Node var2 = this.field272.sentinel.previous;
      if (var2 == this.field272.sentinel) {
         this.field275 = -1;
      } else {
         this.field275 = ((PcmStreamMixerListener)var2).field411;
      }

   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "()Lay;"
   )
   @Export("firstSubStream")
   protected PcmStream firstSubStream() {
      return (PcmStream)this.subStreams.last();
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "()Lay;"
   )
   @Export("nextSubStream")
   protected PcmStream nextSubStream() {
      return (PcmStream)this.subStreams.previous();
   }

   @ObfuscatedName("d")
   protected int vmethod5648() {
      return 0;
   }

   @ObfuscatedName("n")
   @Export("fill")
   public final synchronized void fill(int[] var1, int var2, int var3) {
      do {
         if (this.field275 < 0) {
            this.updateSubStreams(var1, var2, var3);
            return;
         }

         if (var3 + this.field274 < this.field275) {
            this.field274 += var3;
            this.updateSubStreams(var1, var2, var3);
            return;
         }

         int var4 = this.field275 - this.field274;
         this.updateSubStreams(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.field274 += var4;
         this.method720();
         PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field272.last();
         synchronized(var5) {
            int var7 = var5.update();
            if (var7 < 0) {
               var5.field411 = 0;
               this.method722(var5);
            } else {
               var5.field411 = var7;
               this.method721(var5.previous, var5);
            }
         }
      } while(var3 != 0);

   }

   @ObfuscatedName("r")
   @Export("updateSubStreams")
   void updateSubStreams(int[] var1, int var2, int var3) {
      for(PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) {
         var4.update(var1, var2, var3);
      }

   }

   @ObfuscatedName("l")
   @Export("skip")
   public final synchronized void skip(int var1) {
      do {
         if (this.field275 < 0) {
            this.skipSubStreams(var1);
            return;
         }

         if (this.field274 + var1 < this.field275) {
            this.field274 += var1;
            this.skipSubStreams(var1);
            return;
         }

         int var2 = this.field275 - this.field274;
         this.skipSubStreams(var2);
         var1 -= var2;
         this.field274 += var2;
         this.method720();
         PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field272.last();
         synchronized(var3) {
            int var5 = var3.update();
            if (var5 < 0) {
               var3.field411 = 0;
               this.method722(var3);
            } else {
               var3.field411 = var5;
               this.method721(var3.previous, var3);
            }
         }
      } while(var1 != 0);

   }

   @ObfuscatedName("s")
   @Export("skipSubStreams")
   void skipSubStreams(int var1) {
      for(PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) {
         var2.skip(var1);
      }

   }
}
