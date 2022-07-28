import javax.sound.sampled.LineUnavailableException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import javax.sound.sampled.DataLine;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioFormat;
import net.runelite.mapping.Export;
@ObfuscatedName("ag")
@Implements("DevicePcmPlayer")
public class DevicePcmPlayer extends PcmPlayer {
	@ObfuscatedName("o")
	@Export("format")
	AudioFormat format;

	@ObfuscatedName("q")
	@Export("line")
	SourceDataLine line;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -30144037)
	@Export("capacity2")
	int capacity2;

	@ObfuscatedName("u")
	@Export("byteSamples")
	byte[] byteSamples;

	DevicePcmPlayer() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1912003377")
	@Export("init")
	protected void init() {
		this.format = new AudioFormat(((float) (class301.field3595)), 16, PcmPlayer.PcmPlayer_stereo ? 2 : 1, true, false);
		this.byteSamples = new byte[256 << (PcmPlayer.PcmPlayer_stereo ? 2 : 1)];
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-870519251")
	@Export("open")
	protected void open(int var1) throws LineUnavailableException {
		try {
			DataLine.Info var2 = new DataLine.Info(SourceDataLine.class, this.format, var1 << (PcmPlayer.PcmPlayer_stereo ? 2 : 1));
			this.line = ((SourceDataLine) (AudioSystem.getLine(var2)));
			this.line.open();
			this.line.start();
			this.capacity2 = var1;
		} catch (LineUnavailableException var3) {
			if (class21.method302(var1) != 1) {
				this.open(FloorOverlayDefinition.method3800(var1));
			} else {
				this.line = null;
				throw var3;
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1295373245")
	@Export("position")
	protected int position() {
		return this.capacity2 - (this.line.available() >> (PcmPlayer.PcmPlayer_stereo ? 2 : 1));
	}

	@ObfuscatedName("u")
	@Export("write")
	protected void write() {
		int var1 = 256;
		if (PcmPlayer.PcmPlayer_stereo) {
			var1 <<= 1;
		}
		for (int var2 = 0; var2 < var1; ++var2) {
			int var3 = super.samples[var2];
			if ((var3 + 8388608 & -16777216) != 0) {
				var3 = 8388607 ^ var3 >> 31;
			}
			this.byteSamples[var2 * 2] = ((byte) (var3 >> 8));
			this.byteSamples[var2 * 2 + 1] = ((byte) (var3 >> 16));
		}
		this.line.write(this.byteSamples, 0, var1 << 1);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-40")
	@Export("close")
	protected void close() {
		if (this.line != null) {
			this.line.close();
			this.line = null;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-15")
	@Export("discard")
	protected void discard() {
		this.line.flush();
	}
}