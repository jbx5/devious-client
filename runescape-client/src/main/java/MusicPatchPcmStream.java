import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ms")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("iu")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("uo")
	@ObfuscatedGetter(
		intValue = -1133385421
	)
	static int field3573;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lbj;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		descriptor = "(Lmx;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque();
		this.mixer = new PcmStreamMixer();
		this.superStream = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lme;[IIIIB)V",
		garbageValue = "14"
	)
	void method6200(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field3516[var1.field3590] & 4) != 0 && var1.field3582 < 0) {
			int var6 = this.superStream.field3521[var1.field3590] / (class472.field4892 * 722468864);

			while (true) {
				int var7 = (var6 + 1048575 - var1.field3597) / var6;
				if (var7 > var4) {
					var1.field3597 += var6 * var4;
					break;
				}

				var1.stream.fill(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.field3597 += var6 * var7 - 1048576;
				int var8 = class472.field4892 * 722468864 / 100;
				int var9 = 262144 / var6;
				if (var9 < var8) {
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream;
				if (this.superStream.field3507[var1.field3590] == 0) {
					var1.stream = RawPcmStream.method856(var1.rawSound, var10.method871(), var10.method934(), var10.method863());
				} else {
					var1.stream = RawPcmStream.method856(var1.rawSound, var10.method871(), 0, var10.method863());
					this.superStream.method6013(var1, var1.table.field3557[var1.field3581] < 0);
					var1.stream.method867(var8, var10.method934());
				}

				if (var1.table.field3557[var1.field3581] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var10.method862(var8);
				var10.fill(var2, var3, var5 - var3);
				if (var10.method873()) {
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lme;II)V",
		garbageValue = "1333643015"
	)
	void method6201(MusicPatchNode var1, int var2) {
		if ((this.superStream.field3516[var1.field3590] & 4) != 0 && var1.field3582 < 0) {
			int var3 = this.superStream.field3521[var1.field3590] / (class472.field4892 * 722468864);
			int var4 = (var3 + 1048575 - var1.field3597) / var3;
			var1.field3597 = var3 * var2 + var1.field3597 & 1048575;
			if (var4 <= var2) {
				if (this.superStream.field3507[var1.field3590] == 0) {
					var1.stream = RawPcmStream.method856(var1.rawSound, var1.stream.method871(), var1.stream.method934(), var1.stream.method863());
				} else {
					var1.stream = RawPcmStream.method856(var1.rawSound, var1.stream.method871(), 0, var1.stream.method863());
					this.superStream.method6013(var1, var1.table.field3557[var1.field3581] < 0);
				}

				if (var1.table.field3557[var1.field3581] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field3597 / var3;
			}
		}

		var1.stream.skip(var2);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Lba;"
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()Lba;"
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

	@ObfuscatedName("aw")
	protected int vmethod6214() {
		return 0;
	}

	@ObfuscatedName("ad")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3);

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method6003(var6)) {
				int var4 = var2;
				int var5 = var3;

				do {
					if (var5 <= var6.field3577) {
						this.method6200(var6, var1, var4, var5, var4 + var5);
						var6.field3577 -= var5;
						break;
					}

					this.method6200(var6, var1, var4, var6.field3577, var5 + var4);
					var4 += var6.field3577;
					var5 -= var6.field3577;
				} while(!this.superStream.method6037(var6, var1, var4, var5));
			}
		}

	}

	@ObfuscatedName("as")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1);

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method6003(var3)) {
				int var2 = var1;

				do {
					if (var2 <= var3.field3577) {
						this.method6201(var3, var2);
						var3.field3577 -= var2;
						break;
					}

					this.method6201(var3, var3.field3577);
					var2 -= var3.field3577;
				} while(!this.superStream.method6037(var3, (int[])null, 0, var2));
			}
		}

	}
}
