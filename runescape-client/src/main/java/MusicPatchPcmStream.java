import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ml")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("hc")
	@ObfuscatedGetter(
		longValue = -5228586345600098271L
	)
	static long field3659;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lbk;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		descriptor = "(Lmw;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque();
		this.mixer = new PcmStreamMixer();
		this.superStream = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lne;[IIIIB)V",
		garbageValue = "70"
	)
	void method6452(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field3601[var1.field3666] & 4) != 0 && var1.field3676 < 0) {
			int var6 = this.superStream.field3587[var1.field3666] / UserComparator5.field1508;

			while (true) {
				int var7 = (var6 + 1048575 - var1.field3682) / var6;
				if (var7 > var4) {
					var1.field3682 += var4 * var6;
					break;
				}

				var1.stream.fill(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.field3682 += var7 * var6 - 1048576;
				int var8 = UserComparator5.field1508 / 100;
				int var9 = 262144 / var6;
				if (var9 < var8) {
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream;
				if (this.superStream.field3604[var1.field3666] == 0) {
					var1.stream = RawPcmStream.method895(var1.rawSound, var10.method910(), var10.method971(), var10.method892());
				} else {
					var1.stream = RawPcmStream.method895(var1.rawSound, var10.method910(), 0, var10.method892());
					this.superStream.method6299(var1, var1.table.field3647[var1.field3668] < 0);
					var1.stream.method906(var8, var10.method971());
				}

				if (var1.table.field3647[var1.field3668] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var10.method908(var8);
				var10.fill(var2, var3, var5 - var3);
				if (var10.method912()) {
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lne;II)V",
		garbageValue = "413223816"
	)
	void method6455(MusicPatchNode var1, int var2) {
		if ((this.superStream.field3601[var1.field3666] & 4) != 0 && var1.field3676 < 0) {
			int var3 = this.superStream.field3587[var1.field3666] / UserComparator5.field1508;
			int var4 = (var3 + 1048575 - var1.field3682) / var3;
			var1.field3682 = var3 * var2 + var1.field3682 & 1048575;
			if (var4 <= var2) {
				if (this.superStream.field3604[var1.field3666] == 0) {
					var1.stream = RawPcmStream.method895(var1.rawSound, var1.stream.method910(), var1.stream.method971(), var1.stream.method892());
				} else {
					var1.stream = RawPcmStream.method895(var1.rawSound, var1.stream.method910(), 0, var1.stream.method892());
					this.superStream.method6299(var1, var1.table.field3647[var1.field3668] < 0);
				}

				if (var1.table.field3647[var1.field3668] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field3682 / var3;
			}
		}

		var1.stream.skip(var2);
	}

	@ObfuscatedName("aa")
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

	@ObfuscatedName("at")
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

	@ObfuscatedName("ab")
	protected int vmethod6454() {
		return 0;
	}

	@ObfuscatedName("ac")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3);

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method6290(var6)) {
				int var4 = var2;
				int var5 = var3;

				do {
					if (var5 <= var6.field3662) {
						this.method6452(var6, var1, var4, var5, var5 + var4);
						var6.field3662 -= var5;
						break;
					}

					this.method6452(var6, var1, var4, var6.field3662, var5 + var4);
					var4 += var6.field3662;
					var5 -= var6.field3662;
				} while(!this.superStream.method6331(var6, var1, var4, var5));
			}
		}

	}

	@ObfuscatedName("ah")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1);

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method6290(var3)) {
				int var2 = var1;

				do {
					if (var2 <= var3.field3662) {
						this.method6455(var3, var2);
						var3.field3662 -= var2;
						break;
					}

					this.method6455(var3, var3.field3662);
					var2 -= var3.field3662;
				} while(!this.superStream.method6331(var3, (int[])null, 0, var2));
			}
		}

	}
}
