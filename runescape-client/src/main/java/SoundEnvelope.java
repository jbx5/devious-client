import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ai")
@Implements("SoundEnvelope")
public class SoundEnvelope {
   @ObfuscatedName("a")
   @Export("segments")
   int segments = 2;
   @ObfuscatedName("f")
   @Export("durations")
   int[] durations = new int[2];
   @ObfuscatedName("c")
   @Export("phases")
   int[] phases = new int[2];
   @ObfuscatedName("h")
   @Export("start")
   int start;
   @ObfuscatedName("j")
   @Export("end")
   int end;
   @ObfuscatedName("y")
   @Export("max")
   int max;
   @ObfuscatedName("d")
   @Export("form")
   int form;
   @ObfuscatedName("n")
   @Export("ticks")
   int ticks;
   @ObfuscatedName("r")
   @Export("phaseIndex")
   int phaseIndex;
   @ObfuscatedName("l")
   @Export("step")
   int step;
   @ObfuscatedName("s")
   @Export("amplitude")
   int amplitude;

   SoundEnvelope() {
      this.durations[0] = 0;
      this.durations[1] = 65535;
      this.phases[0] = 0;
      this.phases[1] = 65535;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lqr;)V"
   )
   @Export("decode")
   final void decode(Buffer var1) {
      this.form = var1.readUnsignedByte();
      this.start = var1.readInt();
      this.end = var1.readInt();
      this.decodeSegments(var1);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lqr;)V"
   )
   @Export("decodeSegments")
   final void decodeSegments(Buffer var1) {
      this.segments = var1.readUnsignedByte();
      this.durations = new int[this.segments];
      this.phases = new int[this.segments];

      for(int var2 = 0; var2 < this.segments; ++var2) {
         this.durations[var2] = var1.readUnsignedShort();
         this.phases[var2] = var1.readUnsignedShort();
      }

   }

   @ObfuscatedName("c")
   @Export("reset")
   final void reset() {
      this.ticks = 0;
      this.phaseIndex = 0;
      this.step = 0;
      this.amplitude = 0;
      this.max = 0;
   }

   @ObfuscatedName("x")
   @Export("doStep")
   final int doStep(int var1) {
      if (this.max >= this.ticks) {
         this.amplitude = this.phases[this.phaseIndex++] << 15;
         if (this.phaseIndex >= this.segments) {
            this.phaseIndex = this.segments - 1;
         }

         this.ticks = (int)((double)this.durations[this.phaseIndex] / 65536.0 * (double)var1);
         if (this.ticks > this.max) {
            this.step = ((this.phases[this.phaseIndex] << 15) - this.amplitude) / (this.ticks - this.max);
         }
      }

      this.amplitude += this.step;
      ++this.max;
      return this.amplitude - this.step >> 15;
   }
}
