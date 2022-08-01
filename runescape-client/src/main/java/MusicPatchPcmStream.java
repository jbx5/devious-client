import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("jo")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("ux")
	@ObfuscatedSignature(descriptor = "Lbq;")
	@Export("friendSystem")
	public static FriendSystem friendSystem;

	@ObfuscatedName("e")
	@Export("operatingSystemName")
	public static String operatingSystemName;

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Ljv;")
	@Export("superStream")
	MidiPcmStream superStream;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Llt;")
	@Export("queue")
	NodeDeque queue = new NodeDeque();

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lai;")
	@Export("mixer")
	PcmStreamMixer mixer = new PcmStreamMixer();

	@ObfuscatedSignature(descriptor = "(Ljv;)V")
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.superStream = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Ljf;[IIIII)V", garbageValue = "1654088686")
	void method5451(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field3219[var1.field3274] & 4) != 0 && var1.field3275 < 0) {
			int var6 = this.superStream.field3222[var1.field3274] / class301.field3595;
			while (true) {
				int var7 = (var6 + 1048575 - var1.field3281) / var6;
				if (var7 > var4) {
					var1.field3281 += var6 * var4;
					break;
				}
				var1.stream.fill(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.field3281 += var7 * var6 - 1048576;
				int var8 = class301.field3595 / 100;
				int var9 = 262144 / var6;
				if (var9 < var8) {
					var8 = var9;
				}
				RawPcmStream var10 = var1.stream;
				if (this.superStream.field3212[var1.field3274] == 0) {
					var1.stream = RawPcmStream.method795(var1.rawSound, var10.method844(), var10.method810(), var10.method840());
				} else {
					var1.stream = RawPcmStream.method795(var1.rawSound, var10.method844(), 0, var10.method840());
					this.superStream.method5280(var1, var1.patch.field3245[var1.field3279] < 0);
					var1.stream.method806(var8, var10.method810());
				}
				if (var1.patch.field3245[var1.field3279] < 0) {
					var1.stream.setNumLoops(-1);
				}
				var10.method823(var8);
				var10.fill(var2, var3, var5 - var3);
				if (var10.method908()) {
					this.mixer.addSubStream(var10);
				}
			} 
		}
		var1.stream.fill(var2, var3, var4);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Ljf;II)V", garbageValue = "-2137885796")
	void method5448(MusicPatchNode var1, int var2) {
		if ((this.superStream.field3219[var1.field3274] & 4) != 0 && var1.field3275 < 0) {
			int var3 = this.superStream.field3222[var1.field3274] / class301.field3595;
			int var4 = (var3 + 1048575 - var1.field3281) / var3;
			var1.field3281 = var3 * var2 + var1.field3281 & 1048575;
			if (var4 <= var2) {
				if (this.superStream.field3212[var1.field3274] == 0) {
					var1.stream = RawPcmStream.method795(var1.rawSound, var1.stream.method844(), var1.stream.method810(), var1.stream.method840());
				} else {
					var1.stream = RawPcmStream.method795(var1.rawSound, var1.stream.method844(), 0, var1.stream.method840());
					this.superStream.method5280(var1, var1.patch.field3245[var1.field3279] < 0);
				}
				if (var1.patch.field3245[var1.field3279] < 0) {
					var1.stream.setNumLoops(-1);
				}
				var2 = var1.field3281 / var3;
			}
		}
		var1.stream.skip(var2);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "()Lae;")
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		MusicPatchNode var1 = ((MusicPatchNode) (this.queue.last()));
		if (var1 == null) {
			return null;
		} else {
			return ((PcmStream) (var1.stream != null ? var1.stream : this.nextSubStream()));
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "()Lae;")
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

	@ObfuscatedName("j")
	protected int vmethod5453() {
		return 0;
	}

	@ObfuscatedName("h")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3);
		for (MusicPatchNode var6 = ((MusicPatchNode) (this.queue.last())); var6 != null; var6 = ((MusicPatchNode) (this.queue.previous()))) {
			if (!this.superStream.method5379(var6)) {
				int var4 = var2;
				int var5 = var3;
				do {
					if (var5 <= var6.field3280) {
						this.method5451(var6, var1, var4, var5, var4 + var5);
						var6.field3280 -= var5;
						break;
					}
					this.method5451(var6, var1, var4, var6.field3280, var4 + var5);
					var4 += var6.field3280;
					var5 -= var6.field3280;
				} while (!this.superStream.method5303(var6, var1, var4, var5) );
			}
		}
	}

	@ObfuscatedName("d")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1);
		for (MusicPatchNode var3 = ((MusicPatchNode) (this.queue.last())); var3 != null; var3 = ((MusicPatchNode) (this.queue.previous()))) {
			if (!this.superStream.method5379(var3)) {
				int var2 = var1;
				do {
					if (var2 <= var3.field3280) {
						this.method5448(var3, var2);
						var3.field3280 -= var2;
						break;
					}
					this.method5448(var3, var3.field3280);
					var2 -= var3.field3280;
				} while (!this.superStream.method5303(var3, ((int[]) (null)), 0, var2) );
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;B)[B", garbageValue = "40")
	public static byte[] method5470(CharSequence var0) {
		int var1 = var0.length();
		byte[] var2 = new byte[var1];
		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if (var4 > 127) {
				var2[var3] = 63;
			} else {
				var2[var3] = ((byte) (var4));
			}
		}
		return var2;
	}
}