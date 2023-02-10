import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("g")
@Implements("DevicePcmPlayer")
public class DevicePcmPlayer extends PcmPlayer {
   @ObfuscatedName("f")
   @Export("format")
   AudioFormat format;
   @ObfuscatedName("w")
   @Export("line")
   SourceDataLine line;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 975690549
   )
   @Export("capacity2")
   int capacity2;
   @ObfuscatedName("s")
   @Export("byteSamples")
   byte[] byteSamples;

   DevicePcmPlayer() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1600330502"
   )
   @Export("init")
   protected void init() {
      this.format = new AudioFormat((float)class284.field3321, 16, PcmPlayer.PcmPlayer_stereo ? 2 : 1, true, false);
      this.byteSamples = new byte[256 << (PcmPlayer.PcmPlayer_stereo ? 2 : 1)];
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "742720329"
   )
   @Export("open")
   protected void open(int var1) throws LineUnavailableException {
      try {
         DataLine.Info var2 = new DataLine.Info(SourceDataLine.class, this.format, var1 << (PcmPlayer.PcmPlayer_stereo ? 2 : 1));
         this.line = (SourceDataLine)AudioSystem.getLine(var2);
         this.line.open();
         this.line.start();
         this.capacity2 = var1;
      } catch (LineUnavailableException var3) {
         if (class366.method7028(var1) != 1) {
            this.open(class4.method21(var1));
         } else {
            this.line = null;
            throw var3;
         }
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1573553273"
   )
   @Export("position")
   protected int position() {
      return this.capacity2 - (this.line.available() >> (PcmPlayer.PcmPlayer_stereo ? 2 : 1));
   }

   @ObfuscatedName("s")
   @Export("write")
   protected void write() {
      int var1 = 256;
      if (PcmPlayer.PcmPlayer_stereo) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = super.samples[var2];
         if ((var3 + 8388608 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.byteSamples[var2 * 2] = (byte)(var3 >> 8);
         this.byteSamples[var2 * 2 + 1] = (byte)(var3 >> 16);
      }

      this.line.write(this.byteSamples, 0, var1 << 1);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-892812272"
   )
   @Export("close")
   protected void close() {
      if (this.line != null) {
         this.line.close();
         this.line = null;
      }

   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1285037243"
   )
   @Export("discard")
   protected void discard() {
      this.line.flush();
   }
}
