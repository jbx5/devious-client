import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nq")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("au")
	@Export("SpriteBuffer_pixels")
	public static byte[][] SpriteBuffer_pixels;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lbb;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		descriptor = "(Lms;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque();
		this.mixer = new PcmStreamMixer();
		this.superStream = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lnb;[IIIII)V",
		garbageValue = "-405409005"
	)
	void method6725(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field3640[var1.field3711] & 4) != 0 && var1.field3704 < 0) {
			int var6 = this.superStream.field3645[var1.field3711] / PcmPlayer.field270;

			while (true) {
				int var7 = (var6 + 1048575 - var1.field3721) / var6;
				if (var7 > var4) {
					var1.field3721 += var6 * var4;
					break;
				}

				var1.stream.fill(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.field3721 += var7 * var6 - 1048576;
				int var8 = PcmPlayer.field270 / 100;
				int var9 = 262144 / var6;
				if (var9 < var8) {
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream;
				if (this.superStream.field3643[var1.field3711] == 0) {
					var1.stream = RawPcmStream.method1007(var1.rawSound, var10.method917(), var10.method908(), var10.method1044());
				} else {
					var1.stream = RawPcmStream.method1007(var1.rawSound, var10.method917(), 0, var10.method1044());
					this.superStream.method6525(var1, var1.table.field3681[var1.field3706] < 0);
					var1.stream.method993(var8, var10.method908());
				}

				if (var1.table.field3681[var1.field3706] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var10.method1045(var8);
				var10.fill(var2, var3, var5 - var3);
				if (var10.method919()) {
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lnb;IB)V",
		garbageValue = "42"
	)
	void method6741(MusicPatchNode var1, int var2) {
		if ((this.superStream.field3640[var1.field3711] & 4) != 0 && var1.field3704 < 0) {
			int var3 = this.superStream.field3645[var1.field3711] / PcmPlayer.field270;
			int var4 = (var3 + 1048575 - var1.field3721) / var3;
			var1.field3721 = var3 * var2 + var1.field3721 & 1048575;
			if (var4 <= var2) {
				if (this.superStream.field3643[var1.field3711] == 0) {
					var1.stream = RawPcmStream.method1007(var1.rawSound, var1.stream.method917(), var1.stream.method908(), var1.stream.method1044());
				} else {
					var1.stream = RawPcmStream.method1007(var1.rawSound, var1.stream.method917(), 0, var1.stream.method1044());
					this.superStream.method6525(var1, var1.table.field3681[var1.field3706] < 0);
				}

				if (var1.table.field3681[var1.field3706] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field3721 / var3;
			}
		}

		var1.stream.skip(var2);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Lbk;"
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()Lbk;"
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

	@ObfuscatedName("at")
	protected int vmethod6731() {
		return 0;
	}

	@ObfuscatedName("au")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3);

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method6541(var6)) {
				int var4 = var2;
				int var5 = var3;

				do {
					if (var5 <= var6.field3703) {
						this.method6725(var6, var1, var4, var5, var5 + var4);
						var6.field3703 -= var5;
						break;
					}

					this.method6725(var6, var1, var4, var6.field3703, var4 + var5);
					var4 += var6.field3703;
					var5 -= var6.field3703;
				} while(!this.superStream.method6542(var6, var1, var4, var5));
			}
		}

	}

	@ObfuscatedName("al")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1);

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method6541(var3)) {
				int var2 = var1;

				do {
					if (var2 <= var3.field3703) {
						this.method6741(var3, var2);
						var3.field3703 -= var2;
						break;
					}

					this.method6741(var3, var3.field3703);
					var2 -= var3.field3703;
				} while(!this.superStream.method6542(var3, (int[])null, 0, var2));
			}
		}

	}
}
