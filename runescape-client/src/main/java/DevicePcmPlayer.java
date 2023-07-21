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

@ObfuscatedName("ai")
@Implements("DevicePcmPlayer")
public class DevicePcmPlayer extends PcmPlayer {
	@ObfuscatedName("aw")
	@Export("format")
	AudioFormat format;
	@ObfuscatedName("ay")
	@Export("line")
	SourceDataLine line;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1144063717
	)
	@Export("capacity2")
	int capacity2;
	@ObfuscatedName("am")
	@Export("byteSamples")
	byte[] byteSamples;

	DevicePcmPlayer() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-27916"
	)
	@Export("init")
	public void init() {
		this.format = new AudioFormat((float)PcmPlayer.field314, 16, class373.PcmPlayer_stereo ? 2 : 1, true, false);
		this.byteSamples = new byte[256 << (class373.PcmPlayer_stereo ? 2 : 1)];
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1387208790"
	)
	@Export("open")
	public void open(int var1) throws LineUnavailableException {
		try {
			Info var2 = new Info(SourceDataLine.class, this.format, var1 << (class373.PcmPlayer_stereo ? 2 : 1));
			this.line = (SourceDataLine)AudioSystem.getLine(var2);
			this.line.open();
			this.line.start();
			this.capacity2 = var1;
		} catch (LineUnavailableException var3) {
			if (MouseRecorder.method2292(var1) != 1) {
				this.open(UrlRequest.method2837(var1));
			} else {
				this.line = null;
				throw var3;
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-110"
	)
	@Export("position")
	protected int position() {
		return this.capacity2 - (this.line.available() >> (class373.PcmPlayer_stereo ? 2 : 1));
	}

	@ObfuscatedName("am")
	@Export("write")
	protected void write() {
		int var1 = 256;
		if (class373.PcmPlayer_stereo) {
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1310720179"
	)
	@Export("close")
	protected void close() {
		if (this.line != null) {
			this.line.close();
			this.line = null;
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1294273793"
	)
	@Export("discard")
	protected void discard() {
		this.line.flush();
	}
}
