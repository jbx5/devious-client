import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("ap")
@Implements("DevicePcmPlayer")
public class DevicePcmPlayer extends PcmPlayer {
    @ObfuscatedName("c")
    @Export("format")
    AudioFormat format;

    @ObfuscatedName("l")
    @Export("line")
    SourceDataLine line;

    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 1555148237)
    @Export("capacity2")
    int capacity2;

    @ObfuscatedName("e")
    @Export("byteSamples")
    byte[] byteSamples;

    DevicePcmPlayer() {
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "62")
    @Export("init")
    protected void init() {
        this.format = new AudioFormat(((float) (PcmPlayer.field305)), 16, PcmPlayer.PcmPlayer_stereo ? 2 : 1, true, false);
        this.byteSamples = new byte[256 << (PcmPlayer.PcmPlayer_stereo ? 2 : 1)];
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1020940076")
    @Export("open")
    protected void open(int var1) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.format, var1 << (PcmPlayer.PcmPlayer_stereo ? 2 : 1));
            this.line = ((SourceDataLine) (AudioSystem.getLine(var2)));
            this.line.open();
            this.line.start();
            this.capacity2 = var1;
        } catch (LineUnavailableException var3) {
            if (class9.method67(var1) != 1) {
                this.open(GrandExchangeOfferNameComparator.method5702(var1));
            } else {
                this.line = null;
                throw var3;
            }
        }
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(B)I", garbageValue = "2")
    @Export("position")
    protected int position() {
        return this.capacity2 - (this.line.available() >> (PcmPlayer.PcmPlayer_stereo ? 2 : 1));
    }

    @ObfuscatedName("e")
    @Export("write")
    protected void write() {
        int var1 = 256;
        if (PcmPlayer.PcmPlayer_stereo) {
            var1 <<= 1;
        }
        for (int var2 = 0; var2 < var1; ++var2) {
            int var3 = super.samples[var2];
            if (((var3 + 8388608) & (-16777216)) != 0) {
                var3 = 8388607 ^ (var3 >> 31);
            }
            this.byteSamples[var2 * 2] = ((byte) (var3 >> 8));
            this.byteSamples[(var2 * 2) + 1] = ((byte) (var3 >> 16));
        }
        this.line.write(this.byteSamples, 0, var1 << 1);
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-375742034")
    @Export("close")
    protected void close() {
        if (this.line != null) {
            this.line.close();
            this.line = null;
        }
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-128")
    @Export("discard")
    protected void discard() {
        this.line.flush();
    }
}