import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ni")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lbr;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		descriptor = "(Lmr;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque();
		this.mixer = new PcmStreamMixer();
		this.superStream = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lno;[IIIIB)V",
		garbageValue = "15"
	)
	void method6453(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field3585[var1.field3652] & 4) != 0 && var1.field3660 < 0) {
			int var6 = this.superStream.field3590[var1.field3652] / class511.field5136;

			while (true) {
				int var7 = (var6 + 1048575 - var1.field3666) / var6;
				if (var7 > var4) {
					var1.field3666 += var4 * var6;
					break;
				}

				var1.stream.fill(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.field3666 += var6 * var7 - 1048576;
				int var8 = class511.field5136 / 100;
				int var9 = 262144 / var6;
				if (var9 < var8) {
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream;
				if (this.superStream.field3588[var1.field3652] == 0) {
					var1.stream = RawPcmStream.method855(var1.rawSound, var10.method865(), var10.method856(), var10.method862());
				} else {
					var1.stream = RawPcmStream.method855(var1.rawSound, var10.method865(), 0, var10.method862());
					this.superStream.method6267(var1, var1.table.field3634[var1.field3657] < 0);
					var1.stream.method912(var8, var10.method856());
				}

				if (var1.table.field3634[var1.field3657] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var10.method999(var8);
				var10.fill(var2, var3, var5 - var3);
				if (var10.method872()) {
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lno;II)V",
		garbageValue = "2030918255"
	)
	void method6454(MusicPatchNode var1, int var2) {
		if ((this.superStream.field3585[var1.field3652] & 4) != 0 && var1.field3660 < 0) {
			int var3 = this.superStream.field3590[var1.field3652] / class511.field5136;
			int var4 = (var3 + 1048575 - var1.field3666) / var3;
			var1.field3666 = var3 * var2 + var1.field3666 & 1048575;
			if (var4 <= var2) {
				if (this.superStream.field3588[var1.field3652] == 0) {
					var1.stream = RawPcmStream.method855(var1.rawSound, var1.stream.method865(), var1.stream.method856(), var1.stream.method862());
				} else {
					var1.stream = RawPcmStream.method855(var1.rawSound, var1.stream.method865(), 0, var1.stream.method862());
					this.superStream.method6267(var1, var1.table.field3634[var1.field3657] < 0);
				}

				if (var1.table.field3634[var1.field3657] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field3666 / var3;
			}
		}

		var1.stream.skip(var2);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Lbb;"
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()Lbb;"
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

	@ObfuscatedName("ac")
	protected int vmethod6461() {
		return 0;
	}

	@ObfuscatedName("ae")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3);

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method6277(var6)) {
				int var4 = var2;
				int var5 = var3;

				do {
					if (var5 <= var6.field3651) {
						this.method6453(var6, var1, var4, var5, var4 + var5);
						var6.field3651 -= var5;
						break;
					}

					this.method6453(var6, var1, var4, var6.field3651, var4 + var5);
					var4 += var6.field3651;
					var5 -= var6.field3651;
				} while(!this.superStream.method6278(var6, var1, var4, var5));
			}
		}

	}

	@ObfuscatedName("aq")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1);

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method6277(var3)) {
				int var2 = var1;

				do {
					if (var2 <= var3.field3651) {
						this.method6454(var3, var2);
						var3.field3651 -= var2;
						break;
					}

					this.method6454(var3, var3.field3651);
					var2 -= var3.field3651;
				} while(!this.superStream.method6278(var3, (int[])null, 0, var2));
			}
		}

	}
}
