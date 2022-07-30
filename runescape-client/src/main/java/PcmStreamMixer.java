import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ai")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Llt;")
	@Export("subStreams")
	NodeDeque subStreams = new NodeDeque();

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Llt;")
	NodeDeque field263 = new NodeDeque();

	@ObfuscatedName("f")
	int field262 = 0;

	@ObfuscatedName("u")
	int field264 = -1;

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lae;)V")
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lae;)V")
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove();
	}

	@ObfuscatedName("f")
	void method630() {
		if (this.field262 > 0) {
			for (PcmStreamMixerListener var1 = ((PcmStreamMixerListener) (this.field263.last())); var1 != null; var1 = ((PcmStreamMixerListener) (this.field263.previous()))) {
				var1.field401 -= this.field262;
			}
			this.field264 -= this.field262;
			this.field262 = 0;
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(Lor;Laz;)V")
	void method618(Node var1, PcmStreamMixerListener var2) {
		while (this.field263.sentinel != var1 && ((PcmStreamMixerListener) (var1)).field401 <= var2.field401) {
			var1 = var1.previous;
		} 
		NodeDeque.NodeDeque_addBefore(var2, var1);
		this.field264 = ((PcmStreamMixerListener) (this.field263.sentinel.previous)).field401;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Laz;)V")
	void method614(PcmStreamMixerListener var1) {
		var1.remove();
		var1.remove2();
		Node var2 = this.field263.sentinel.previous;
		if (var2 == this.field263.sentinel) {
			this.field264 = -1;
		} else {
			this.field264 = ((PcmStreamMixerListener) (var2)).field401;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "()Lae;")
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return ((PcmStream) (this.subStreams.last()));
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "()Lae;")
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return ((PcmStream) (this.subStreams.previous()));
	}

	@ObfuscatedName("j")
	protected int vmethod5453() {
		return 0;
	}

	@ObfuscatedName("h")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field264 < 0) {
				this.updateSubStreams(var1, var2, var3);
				return;
			}
			if (var3 + this.field262 < this.field264) {
				this.field262 += var3;
				this.updateSubStreams(var1, var2, var3);
				return;
			}
			int var4 = this.field264 - this.field262;
			this.updateSubStreams(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field262 += var4;
			this.method630();
			PcmStreamMixerListener var5 = ((PcmStreamMixerListener) (this.field263.last()));
			synchronized(var5) {
				int var7 = var5.update();
				if (var7 < 0) {
					var5.field401 = 0;
					this.method614(var5);
				} else {
					var5.field401 = var7;
					this.method618(var5.previous, var5);
				}
			}
		} while (var3 != 0 );
	}

	@ObfuscatedName("a")
	@Export("updateSubStreams")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = ((PcmStream) (this.subStreams.last())); var4 != null; var4 = ((PcmStream) (this.subStreams.previous()))) {
			var4.update(var1, var2, var3);
		}
	}

	@ObfuscatedName("d")
	@Export("skip")
	public final synchronized void skip(int var1) {
		do {
			if (this.field264 < 0) {
				this.skipSubStreams(var1);
				return;
			}
			if (this.field262 + var1 < this.field264) {
				this.field262 += var1;
				this.skipSubStreams(var1);
				return;
			}
			int var2 = this.field264 - this.field262;
			this.skipSubStreams(var2);
			var1 -= var2;
			this.field262 += var2;
			this.method630();
			PcmStreamMixerListener var3 = ((PcmStreamMixerListener) (this.field263.last()));
			synchronized(var3) {
				int var5 = var3.update();
				if (var5 < 0) {
					var3.field401 = 0;
					this.method614(var3);
				} else {
					var3.field401 = var5;
					this.method618(var3.previous, var3);
				}
			}
		} while (var1 != 0 );
	}

	@ObfuscatedName("n")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = ((PcmStream) (this.subStreams.last())); var2 != null; var2 = ((PcmStream) (this.subStreams.previous()))) {
			var2.skip(var1);
		}
	}
}