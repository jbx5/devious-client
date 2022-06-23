import javax.sound.sampled.LineUnavailableException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.AudioFormat;
import net.runelite.mapping.Export;
@ObfuscatedName("ad")
@Implements("DevicePcmPlayer")
public class DevicePcmPlayer extends PcmPlayer {
	@ObfuscatedName("c")
	@Export("format")
	AudioFormat format;

	@ObfuscatedName("v")
	@Export("line")
	SourceDataLine line;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -1450561083)
	@Export("capacity2")
	int capacity2;

	@ObfuscatedName("f")
	@Export("byteSamples")
	byte[] byteSamples;

	DevicePcmPlayer() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-609921240")
	@Export("init")
	protected void init() {
		this.format = new AudioFormat(((float) (PcmPlayer.field287)), 16, BuddyRankComparator.PcmPlayer_stereo ? 2 : 1, true, false);
		this.byteSamples = new byte[256 << (BuddyRankComparator.PcmPlayer_stereo ? 2 : 1)];
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1372651644")
	@Export("open")
	protected void open(int var1) throws LineUnavailableException {
		try {
			Info var2 = new Info(SourceDataLine.class, this.format, var1 << (BuddyRankComparator.PcmPlayer_stereo ? 2 : 1));
			this.line = ((SourceDataLine) (AudioSystem.getLine(var2)));
			this.line.open();
			this.line.start();
			this.capacity2 = var1;
		} catch (LineUnavailableException var3) {
			if (class269.method5223(var1) != 1) {
				this.open(class135.method2910(var1));
			} else {
				this.line = null;
				throw var3;
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "2144118703")
	@Export("position")
	protected int position() {
		return this.capacity2 - (this.line.available() >> (BuddyRankComparator.PcmPlayer_stereo ? 2 : 1));
	}

	@ObfuscatedName("f")
	@Export("write")
	protected void write() {
		int var1 = 256;
		if (BuddyRankComparator.PcmPlayer_stereo) {
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-49")
	@Export("close")
	protected void close() {
		if (this.line != null) {
			this.line.close();
			this.line = null;
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "35")
	@Export("discard")
	protected void discard() {
		this.line.flush();
	}
}