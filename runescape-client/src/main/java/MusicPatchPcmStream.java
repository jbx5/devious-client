import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("jk")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "Lqe;")
	@Export("logoSprite")
	static IndexedSprite logoSprite;

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lje;")
	@Export("superStream")
	MidiPcmStream superStream;

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Llm;")
	@Export("queue")
	NodeDeque queue = new NodeDeque();

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Las;")
	@Export("mixer")
	PcmStreamMixer mixer = new PcmStreamMixer();

	@ObfuscatedSignature(descriptor = "(Lje;)V")
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.superStream = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Ljl;[IIIIB)V", garbageValue = "39")
	void method5381(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field3223[var1.field3280] & 4) != 0 && var1.field3266 < 0) {
			int var6 = this.superStream.field3214[var1.field3280] / (class344.field4152 * -449918071);
			while (true) {
				int var7 = (var6 + 1048575 - var1.field3283) / var6;
				if (var7 > var4) {
					var1.field3283 += var6 * var4;
					break;
				}
				var1.stream.fill(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.field3283 += var7 * var6 - 1048576;
				int var8 = class344.field4152 * -449918071 / 100;
				int var9 = 262144 / var6;
				if (var9 < var8) {
					var8 = var9;
				}
				RawPcmStream var10 = var1.stream;
				if (this.superStream.field3221[var1.field3280] == 0) {
					var1.stream = RawPcmStream.method769(var1.rawSound, var10.method784(), var10.method775(), var10.method776());
				} else {
					var1.stream = RawPcmStream.method769(var1.rawSound, var10.method784(), 0, var10.method776());
					this.superStream.method5202(var1, var1.patch.field3249[var1.field3286] < 0);
					var1.stream.method780(var8, var10.method775());
				}
				if (var1.patch.field3249[var1.field3286] < 0) {
					var1.stream.setNumLoops(-1);
				}
				var10.method782(var8);
				var10.fill(var2, var3, var5 - var3);
				if (var10.method820()) {
					this.mixer.addSubStream(var10);
				}
			} 
		}
		var1.stream.fill(var2, var3, var4);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Ljl;IB)V", garbageValue = "0")
	void method5382(MusicPatchNode var1, int var2) {
		if ((this.superStream.field3223[var1.field3280] & 4) != 0 && var1.field3266 < 0) {
			int var3 = this.superStream.field3214[var1.field3280] / (class344.field4152 * -449918071);
			int var4 = (var3 + 1048575 - var1.field3283) / var3;
			var1.field3283 = var3 * var2 + var1.field3283 & 1048575;
			if (var4 <= var2) {
				if (this.superStream.field3221[var1.field3280] == 0) {
					var1.stream = RawPcmStream.method769(var1.rawSound, var1.stream.method784(), var1.stream.method775(), var1.stream.method776());
				} else {
					var1.stream = RawPcmStream.method769(var1.rawSound, var1.stream.method784(), 0, var1.stream.method776());
					this.superStream.method5202(var1, var1.patch.field3249[var1.field3286] < 0);
				}
				if (var1.patch.field3249[var1.field3286] < 0) {
					var1.stream.setNumLoops(-1);
				}
				var2 = var1.field3283 / var3;
			}
		}
		var1.stream.skip(var2);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "()Lah;")
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		MusicPatchNode var1 = ((MusicPatchNode) (this.queue.last()));
		if (var1 == null) {
			return null;
		} else {
			return ((PcmStream) (var1.stream != null ? var1.stream : this.nextSubStream()));
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "()Lah;")
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		MusicPatchNode var1;
		do {
			var1 = ((MusicPatchNode) (this.queue.previous()));
			if (var1 == null) {
				return null;
			}
		} while (var1.stream == null );
		return var1.stream;
	}

	@ObfuscatedName("k")
	protected int vmethod5396() {
		return 0;
	}

	@ObfuscatedName("o")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3);
		for (MusicPatchNode var6 = ((MusicPatchNode) (this.queue.last())); var6 != null; var6 = ((MusicPatchNode) (this.queue.previous()))) {
			if (!this.superStream.method5224(var6)) {
				int var4 = var2;
				int var5 = var3;
				do {
					if (var5 <= var6.field3282) {
						this.method5381(var6, var1, var4, var5, var5 + var4);
						var6.field3282 -= var5;
						break;
					}
					this.method5381(var6, var1, var4, var6.field3282, var5 + var4);
					var4 += var6.field3282;
					var5 -= var6.field3282;
				} while (!this.superStream.method5225(var6, var1, var4, var5) );
			}
		}
	}

	@ObfuscatedName("d")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1);
		for (MusicPatchNode var3 = ((MusicPatchNode) (this.queue.last())); var3 != null; var3 = ((MusicPatchNode) (this.queue.previous()))) {
			if (!this.superStream.method5224(var3)) {
				int var2 = var1;
				do {
					if (var2 <= var3.field3282) {
						this.method5382(var3, var2);
						var3.field3282 -= var2;
						break;
					}
					this.method5382(var3, var3.field3282);
					var2 -= var3.field3282;
				} while (!this.superStream.method5225(var3, ((int[]) (null)), 0, var2) );
			}
		}
	}
}