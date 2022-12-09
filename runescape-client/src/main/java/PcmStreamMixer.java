import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("az")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lmq;"
   )
   @Export("subStreams")
   NodeDeque subStreams = new NodeDeque();
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lmq;"
   )
   NodeDeque field288 = new NodeDeque();
   @ObfuscatedName("v")
   int field287 = 0;
   @ObfuscatedName("x")
   int field290 = -1;

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Laa;)V"
   )
   @Export("addSubStream")
   public final synchronized void addSubStream(PcmStream var1) {
      this.subStreams.addLast(var1);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Laa;)V"
   )
   @Export("removeSubStream")
   public final synchronized void removeSubStream(PcmStream var1) {
      var1.remove();
   }

   @ObfuscatedName("v")
   void method727() {
      if (this.field287 > 0) {
         for(PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field288.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field288.previous()) {
            var1.field429 -= this.field287;
         }

         this.field290 -= this.field287;
         this.field287 = 0;
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Lpl;Lbo;)V"
   )
   void method719(Node var1, PcmStreamMixerListener var2) {
      while(this.field288.sentinel != var1 && ((PcmStreamMixerListener)var1).field429 <= var2.field429) {
         var1 = var1.previous;
      }

      NodeDeque.NodeDeque_addBefore(var2, var1);
      this.field290 = ((PcmStreamMixerListener)this.field288.sentinel.previous).field429;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(Lbo;)V"
   )
   void method720(PcmStreamMixerListener var1) {
      var1.remove();
      var1.remove2();
      Node var2 = this.field288.sentinel.previous;
      if (var2 == this.field288.sentinel) {
         this.field290 = -1;
      } else {
         this.field290 = ((PcmStreamMixerListener)var2).field429;
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "()Laa;"
   )
   @Export("firstSubStream")
   protected PcmStream firstSubStream() {
      return (PcmStream)this.subStreams.last();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "()Laa;"
   )
   @Export("nextSubStream")
   protected PcmStream nextSubStream() {
      return (PcmStream)this.subStreams.previous();
   }

   @ObfuscatedName("r")
   protected int vmethod5753() {
      return 0;
   }

   @ObfuscatedName("u")
   @Export("fill")
   public final synchronized void fill(int[] var1, int var2, int var3) {
      do {
         if (this.field290 < 0) {
            this.updateSubStreams(var1, var2, var3);
            return;
         }

         if (var3 + this.field287 < this.field290) {
            this.field287 += var3;
            this.updateSubStreams(var1, var2, var3);
            return;
         }

         int var4 = this.field290 - this.field287;
         this.updateSubStreams(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.field287 += var4;
         this.method727();
         PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field288.last();
         synchronized(var5) {
            int var7 = var5.update();
            if (var7 < 0) {
               var5.field429 = 0;
               this.method720(var5);
            } else {
               var5.field429 = var7;
               this.method719(var5.previous, var5);
            }
         }
      } while(var3 != 0);

   }

   @ObfuscatedName("b")
   @Export("updateSubStreams")
   void updateSubStreams(int[] var1, int var2, int var3) {
      for(PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) {
         var4.update(var1, var2, var3);
      }

   }

   @ObfuscatedName("j")
   @Export("skip")
   public final synchronized void skip(int var1) {
      do {
         if (this.field290 < 0) {
            this.skipSubStreams(var1);
            return;
         }

         if (this.field287 + var1 < this.field290) {
            this.field287 += var1;
            this.skipSubStreams(var1);
            return;
         }

         int var2 = this.field290 - this.field287;
         this.skipSubStreams(var2);
         var1 -= var2;
         this.field287 += var2;
         this.method727();
         PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field288.last();
         synchronized(var3) {
            int var5 = var3.update();
            if (var5 < 0) {
               var3.field429 = 0;
               this.method720(var3);
            } else {
               var3.field429 = var5;
               this.method719(var3.previous, var3);
            }
         }
      } while(var1 != 0);

   }

   @ObfuscatedName("g")
   @Export("skipSubStreams")
   void skipSubStreams(int var1) {
      for(PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) {
         var2.skip(var1);
      }

   }
}
