import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ml")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("os")
	@ObfuscatedGetter(
		intValue = 224226397
	)
	@Export("menuWidth")
	static int menuWidth;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lbp;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		descriptor = "(Lmk;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque();
		this.mixer = new PcmStreamMixer();
		this.superStream = var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lmv;[IIIIB)V",
		garbageValue = "21"
	)
	void method6268(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field3481[var1.field3557] & 4) != 0 && var1.field3559 < 0) {
			int var6 = this.superStream.field3494[var1.field3557] / (class189.field1993 * 22050);

			while (true) {
				int var7 = (var6 + 1048575 - var1.field3554) / var6;
				if (var7 > var4) {
					var1.field3554 += var4 * var6;
					break;
				}

				var1.stream.fill(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.field3554 += var6 * var7 - 1048576;
				int var8 = class189.field1993 * 22050 / 100;
				int var9 = 262144 / var6;
				if (var9 < var8) {
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream;
				if (this.superStream.field3484[var1.field3557] == 0) {
					var1.stream = RawPcmStream.method919(var1.rawSound, var10.method934(), var10.method925(), var10.method926());
				} else {
					var1.stream = RawPcmStream.method919(var1.rawSound, var10.method934(), 0, var10.method926());
					this.superStream.method6084(var1, var1.table.field3522[var1.field3568] < 0);
					var1.stream.method930(var8, var10.method925());
				}

				if (var1.table.field3522[var1.field3568] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var10.method1022(var8);
				var10.fill(var2, var3, var5 - var3);
				if (var10.method936()) {
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lmv;II)V",
		garbageValue = "939447851"
	)
	void method6269(MusicPatchNode var1, int var2) {
		if ((this.superStream.field3481[var1.field3557] & 4) != 0 && var1.field3559 < 0) {
			int var3 = this.superStream.field3494[var1.field3557] / (class189.field1993 * 22050);
			int var4 = (var3 + 1048575 - var1.field3554) / var3;
			var1.field3554 = var3 * var2 + var1.field3554 & 1048575;
			if (var4 <= var2) {
				if (this.superStream.field3484[var1.field3557] == 0) {
					var1.stream = RawPcmStream.method919(var1.rawSound, var1.stream.method934(), var1.stream.method925(), var1.stream.method926());
				} else {
					var1.stream = RawPcmStream.method919(var1.rawSound, var1.stream.method934(), 0, var1.stream.method926());
					this.superStream.method6084(var1, var1.table.field3522[var1.field3568] < 0);
				}

				if (var1.table.field3522[var1.field3568] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field3554 / var3;
			}
		}

		var1.stream.skip(var2);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Lbl;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		MusicPatchNode var1 = (MusicPatchNode)this.queue.last();
		if (var1 == null) {
			return null;
		} else {
			return (PcmStream)(var1.stream != null ? var1.stream : this.nextSubStream());
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Lbl;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		MusicPatchNode var1;
		do {
			var1 = (MusicPatchNode)this.queue.previous();
			if (var1 == null) {
				return null;
			}
		} while(var1.stream == null);

		return var1.stream;
	}

	@ObfuscatedName("ao")
	protected int vmethod6281() {
		return 0;
	}

	@ObfuscatedName("ae")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3);

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method6105(var6)) {
				int var4 = var2;
				int var5 = var3;

				do {
					if (var5 <= var6.field3564) {
						this.method6268(var6, var1, var4, var5, var4 + var5);
						var6.field3564 -= var5;
						break;
					}

					this.method6268(var6, var1, var4, var6.field3564, var4 + var5);
					var4 += var6.field3564;
					var5 -= var6.field3564;
				} while(!this.superStream.method6106(var6, var1, var4, var5));
			}
		}

	}

	@ObfuscatedName("au")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1);

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method6105(var3)) {
				int var2 = var1;

				do {
					if (var2 <= var3.field3564) {
						this.method6269(var3, var2);
						var3.field3564 -= var2;
						break;
					}

					this.method6269(var3, var3.field3564);
					var2 -= var3.field3564;
				} while(!this.superStream.method6106(var3, (int[])null, 0, var2));
			}
		}

	}
}
