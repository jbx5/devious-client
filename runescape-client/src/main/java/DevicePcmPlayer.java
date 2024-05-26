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

@ObfuscatedName("ar")
@Implements("DevicePcmPlayer")
public class DevicePcmPlayer extends PcmPlayer {
	@ObfuscatedName("ak")
	@Export("format")
	AudioFormat format;
	@ObfuscatedName("al")
	@Export("line")
	SourceDataLine line;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1883142355
	)
	@Export("capacity2")
	int capacity2;
	@ObfuscatedName("az")
	@Export("byteSamples")
	byte[] byteSamples;

	DevicePcmPlayer() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("init")
	protected void init() {
		this.format = new AudioFormat((float)UserComparator5.field1508, 16, JagexCache.PcmPlayer_stereo ? 2 : 1, true, false);
		this.byteSamples = new byte[256 << (JagexCache.PcmPlayer_stereo ? 2 : 1)];
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-85"
	)
	@Export("open")
	protected void open(int var1) throws LineUnavailableException {
		try {
			Info var2 = new Info(SourceDataLine.class, this.format, var1 << (JagexCache.PcmPlayer_stereo ? 2 : 1));
			this.line = (SourceDataLine)AudioSystem.getLine(var2);
			this.line.open();
			this.line.start();
			this.capacity2 = var1;
		} catch (LineUnavailableException var3) {
			if (FriendSystem.method1953(var1) != 1) {
				this.open(Skeleton.method4848(var1));
			} else {
				this.line = null;
				throw var3;
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1902302382"
	)
	@Export("position")
	protected int position() {
		return this.capacity2 - (this.line.available() >> (JagexCache.PcmPlayer_stereo ? 2 : 1));
	}

	@ObfuscatedName("az")
	@Export("write")
	protected void write() {
		int var1 = 256;
		if (JagexCache.PcmPlayer_stereo) {
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1417939230"
	)
	@Export("close")
	protected void close() {
		if (this.line != null) {
			this.line.close();
			this.line = null;
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "107"
	)
	@Export("discard")
	protected void discard() {
		this.line.flush();
	}
}
