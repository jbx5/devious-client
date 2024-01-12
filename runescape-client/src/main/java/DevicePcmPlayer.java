import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
@Implements("DevicePcmPlayer")
public class DevicePcmPlayer extends PcmPlayer {
	@ObfuscatedName("am")
	@Export("format")
	AudioFormat format;
	@ObfuscatedName("ap")
	@Export("line")
	SourceDataLine line;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -441700415
	)
	@Export("capacity2")
	int capacity2;
	@ObfuscatedName("aj")
	@Export("byteSamples")
	byte[] byteSamples;

	DevicePcmPlayer() {
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "128"
	)
	@Export("init")
	public void init() {
		this.format = new AudioFormat((float)(class189.field1993 * 22050), 16, class462.PcmPlayer_stereo ? 2 : 1, true, false);
		this.byteSamples = new byte[256 << (class462.PcmPlayer_stereo ? 2 : 1)];
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-81"
	)
	@Export("open")
	public void open(int var1) throws LineUnavailableException {
		try {
			Info var2 = new Info(SourceDataLine.class, this.format, var1 << (class462.PcmPlayer_stereo ? 2 : 1));
			this.line = (SourceDataLine)AudioSystem.getLine(var2);
			this.line.open();
			this.line.start();
			this.capacity2 = var1;
		} catch (LineUnavailableException var3) {
			if (class295.method5903(var1) != 1) {
				this.open(ItemContainer.method2347(var1));
			} else {
				this.line = null;
				throw var3;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-95"
	)
	@Export("position")
	protected int position() {
		return this.capacity2 - (this.line.available() >> (class462.PcmPlayer_stereo ? 2 : 1));
	}

	@ObfuscatedName("aj")
	@Export("write")
	protected void write() {
		int var1 = 256;
		if (class462.PcmPlayer_stereo) {
			var1 <<= 1;
		}

		for (int var2 = 0; var2 < var1; ++var2) {
			int var3 = super.samples[var2];
			if ((var3 + 8388608 & -16777216) != 0) {
				var3 = 8388607 ^ var3 >> 31;
			}

			this.byteSamples[var2 * 2] = (byte)(var3 >> 8);
			this.byteSamples[var2 * 2 + 1] = (byte)(var3 >> 16);
		}

		this.line.write(this.byteSamples, 0, var1 << 1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1232699455"
	)
	@Export("close")
	protected void close() {
		if (this.line != null) {
			this.line.close();
			this.line = null;
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1520596872"
	)
	@Export("discard")
	protected void discard() {
		this.line.flush();
	}
}
