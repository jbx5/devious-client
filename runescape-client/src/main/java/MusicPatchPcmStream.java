import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mh")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("cq")
	static String field3478;
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "[Luk;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lbl;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		descriptor = "(Llf;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque();
		this.mixer = new PcmStreamMixer();
		this.superStream = var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lmg;[IIIII)V",
		garbageValue = "-1470888543"
	)
	void method5976(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field3413[var1.field3497] & 4) != 0 && var1.field3501 < 0) {
			int var6 = this.superStream.field3440[var1.field3497] / PcmPlayer.field293;

			while (true) {
				int var7 = (var6 + 1048575 - var1.field3507) / var6;
				if (var7 > var4) {
					var1.field3507 += var6 * var4;
					break;
				}

				var1.stream.fill(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.field3507 += var7 * var6 - 1048576;
				int var8 = PcmPlayer.field293 / 100;
				int var9 = 262144 / var6;
				if (var9 < var8) {
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream;
				if (this.superStream.field3415[var1.field3497] == 0) {
					var1.stream = RawPcmStream.method904(var1.rawSound, var10.method919(), var10.method910(), var10.method911());
				} else {
					var1.stream = RawPcmStream.method904(var1.rawSound, var10.method919(), 0, var10.method911());
					this.superStream.method5807(var1, var1.table.field3468[var1.field3492] < 0);
					var1.stream.method952(var8, var10.method910());
				}

				if (var1.table.field3468[var1.field3492] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var10.method917(var8);
				var10.fill(var2, var3, var5 - var3);
				if (var10.method921()) {
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lmg;II)V",
		garbageValue = "-2042371851"
	)
	void method5979(MusicPatchNode var1, int var2) {
		if ((this.superStream.field3413[var1.field3497] & 4) != 0 && var1.field3501 < 0) {
			int var3 = this.superStream.field3440[var1.field3497] / PcmPlayer.field293;
			int var4 = (var3 + 1048575 - var1.field3507) / var3;
			var1.field3507 = var3 * var2 + var1.field3507 & 1048575;
			if (var4 <= var2) {
				if (this.superStream.field3415[var1.field3497] == 0) {
					var1.stream = RawPcmStream.method904(var1.rawSound, var1.stream.method919(), var1.stream.method910(), var1.stream.method911());
				} else {
					var1.stream = RawPcmStream.method904(var1.rawSound, var1.stream.method919(), 0, var1.stream.method911());
					this.superStream.method5807(var1, var1.table.field3468[var1.field3492] < 0);
				}

				if (var1.table.field3468[var1.field3492] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field3507 / var3;
			}
		}

		var1.stream.skip(var2);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()Lbw;"
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()Lbw;"
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

	@ObfuscatedName("ap")
	protected int vmethod5973() {
		return 0;
	}

	@ObfuscatedName("aa")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3);

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method5888(var6)) {
				int var4 = var2;
				int var5 = var3;

				do {
					if (var5 <= var6.field3506) {
						this.method5976(var6, var1, var4, var5, var5 + var4);
						var6.field3506 -= var5;
						break;
					}

					this.method5976(var6, var1, var4, var6.field3506, var4 + var5);
					var4 += var6.field3506;
					var5 -= var6.field3506;
				} while(!this.superStream.method5816(var6, var1, var4, var5));
			}
		}

	}

	@ObfuscatedName("ad")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1);

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method5888(var3)) {
				int var2 = var1;

				do {
					if (var2 <= var3.field3506) {
						this.method5979(var3, var2);
						var3.field3506 -= var2;
						break;
					}

					this.method5979(var3, var3.field3506);
					var2 -= var3.field3506;
				} while(!this.superStream.method5816(var3, (int[])null, 0, var2));
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "8192"
	)
	public static int method5994() {
		return ++MouseHandler.MouseHandler_idleCycles - 1;
	}
}
