import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lji;")

	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Lld;")

	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"Lal;")

	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(descriptor = 
	"(Lji;)V")

	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque();
		this.mixer = new PcmStreamMixer();
		this.superStream = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Ljn;[IIIII)V", garbageValue = 
	"664452285")

	void method5443(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if (((this.superStream.field3193[var1.field3248] & 4) != 0) && (var1.field3249 < 0)) {
			int var6 = this.superStream.field3195[var1.field3248] / PcmPlayer.field268;

			while (true) {
				int var7 = ((var6 + 1048575) - var1.field3238) / var6;
				if (var7 > var4) {
					var1.field3238 += var4 * var6;
					break;
				}

				var1.stream.fill(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.field3238 += (var6 * var7) - 1048576;
				int var8 = PcmPlayer.field268 / 100;
				int var9 = 262144 / var6;
				if (var9 < var8) {
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream;
				if (this.superStream.field3189[var1.field3248] == 0) {
					var1.stream = RawPcmStream.method791(var1.rawSound, var10.method866(), var10.method797(), var10.method798());
				} else {
					var1.stream = RawPcmStream.method791(var1.rawSound, var10.method866(), 0, var10.method798());
					this.superStream.method5342(var1, var1.patch.field3227[var1.field3251] < 0);
					var1.stream.method802(var8, var10.method797());
				}

				if (var1.patch.field3227[var1.field3251] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var10.method882(var8);
				var10.fill(var2, var3, var5 - var3);
				if (var10.method808()) {
					this.mixer.addSubStream(var10);
				}
			} 
		}

		var1.stream.fill(var2, var3, var4);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Ljn;II)V", garbageValue = 
	"-1438401552")

	void method5442(MusicPatchNode var1, int var2) {
		if (((this.superStream.field3193[var1.field3248] & 4) != 0) && (var1.field3249 < 0)) {
			int var3 = this.superStream.field3195[var1.field3248] / PcmPlayer.field268;
			int var4 = ((var3 + 1048575) - var1.field3238) / var3;
			var1.field3238 = ((var3 * var2) + var1.field3238) & 1048575;
			if (var4 <= var2) {
				if (this.superStream.field3189[var1.field3248] == 0) {
					var1.stream = RawPcmStream.method791(var1.rawSound, var1.stream.method866(), var1.stream.method797(), var1.stream.method798());
				} else {
					var1.stream = RawPcmStream.method791(var1.rawSound, var1.stream.method866(), 0, var1.stream.method798());
					this.superStream.method5342(var1, var1.patch.field3227[var1.field3251] < 0);
				}

				if (var1.patch.field3227[var1.field3251] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field3238 / var3;
			}
		}

		var1.stream.skip(var2);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"()Laf;")

	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		MusicPatchNode var1 = ((MusicPatchNode) (this.queue.last()));
		if (var1 == null) {
			return null;
		} else {
			return ((PcmStream) (var1.stream != null ? var1.stream : this.nextSubStream()));
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"()Laf;")

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

	@ObfuscatedName("l")
	protected int vmethod5441() {
		return 0;
	}

	@ObfuscatedName("q")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3);

		for (MusicPatchNode var6 = ((MusicPatchNode) (this.queue.last())); var6 != null; var6 = ((MusicPatchNode) (this.queue.previous()))) {
			if (!this.superStream.method5273(var6)) {
				int var4 = var2;
				int var5 = var3;

				do {
					if (var5 <= var6.field3255) {
						this.method5443(var6, var1, var4, var5, var4 + var5);
						var6.field3255 -= var5;
						break;
					}

					this.method5443(var6, var1, var4, var6.field3255, var5 + var4);
					var4 += var6.field3255;
					var5 -= var6.field3255;
				} while (!this.superStream.method5311(var6, var1, var4, var5) );
			}
		}

	}

	@ObfuscatedName("r")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1);

		for (MusicPatchNode var3 = ((MusicPatchNode) (this.queue.last())); var3 != null; var3 = ((MusicPatchNode) (this.queue.previous()))) {
			if (!this.superStream.method5273(var3)) {
				int var2 = var1;

				do {
					if (var2 <= var3.field3255) {
						this.method5442(var3, var2);
						var3.field3255 -= var2;
						break;
					}

					this.method5442(var3, var3.field3255);
					var2 -= var3.field3255;
				} while (!this.superStream.method5311(var3, ((int[]) (null)), 0, var2) );
			}
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"([Lls;II)Lls;", garbageValue = 
	"-1189056832")

	@Export("findEnumerated")
	public static MouseWheel findEnumerated(MouseWheel[] var0, int var1) {
		MouseWheel[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			MouseWheel var4 = var2[var3];
			if (var1 == var4.rsOrdinal()) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(descriptor = 
	"(B)J", garbageValue = 
	"-100")

	static long method5456() {
		return Client.field623;
	}
}