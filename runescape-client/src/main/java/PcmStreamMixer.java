import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("as")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Llm;")
	@Export("subStreams")
	NodeDeque subStreams = new NodeDeque();

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Llm;")
	NodeDeque field252 = new NodeDeque();

	@ObfuscatedName("v")
	int field253 = 0;

	@ObfuscatedName("c")
	int field255 = -1;

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lah;)V")
	@Export("addSubStream")
	public synchronized final void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Lah;)V")
	@Export("removeSubStream")
	public synchronized final void removeSubStream(PcmStream var1) {
		var1.remove();
	}

	@ObfuscatedName("w")
	void method584() {
		if (this.field253 > 0) {
			for (PcmStreamMixerListener var1 = ((PcmStreamMixerListener) (this.field252.last())); var1 != null; var1 = ((PcmStreamMixerListener) (this.field252.previous()))) {
				var1.field397 -= this.field253;
			}
			this.field255 -= this.field253;
			this.field253 = 0;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Lon;Lac;)V")
	void method588(Node var1, PcmStreamMixerListener var2) {
		while (this.field252.sentinel != var1 && ((PcmStreamMixerListener) (var1)).field397 <= var2.field397) {
			var1 = var1.previous;
		} 
		NodeDeque.NodeDeque_addBefore(var2, var1);
		this.field255 = ((PcmStreamMixerListener) (this.field252.sentinel.previous)).field397;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lac;)V")
	void method597(PcmStreamMixerListener var1) {
		var1.remove();
		var1.remove2();
		Node var2 = this.field252.sentinel.previous;
		if (var2 == this.field252.sentinel) {
			this.field255 = -1;
		} else {
			this.field255 = ((PcmStreamMixerListener) (var2)).field397;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "()Lah;")
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return ((PcmStream) (this.subStreams.last()));
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "()Lah;")
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return ((PcmStream) (this.subStreams.previous()));
	}

	@ObfuscatedName("k")
	protected int vmethod5396() {
		return 0;
	}

	@ObfuscatedName("o")
	@Export("fill")
	public synchronized final void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field255 < 0) {
				this.updateSubStreams(var1, var2, var3);
				return;
			}
			if (var3 + this.field253 < this.field255) {
				this.field253 += var3;
				this.updateSubStreams(var1, var2, var3);
				return;
			}
			int var4 = this.field255 - this.field253;
			this.updateSubStreams(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field253 += var4;
			this.method584();
			PcmStreamMixerListener var5 = ((PcmStreamMixerListener) (this.field252.last()));
			synchronized(var5) {
				int var7 = var5.update();
				if (var7 < 0) {
					var5.field397 = 0;
					this.method597(var5);
				} else {
					var5.field397 = var7;
					this.method588(var5.previous, var5);
				}
			}
		} while (var3 != 0 );
	}

	@ObfuscatedName("n")
	@Export("updateSubStreams")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = ((PcmStream) (this.subStreams.last())); var4 != null; var4 = ((PcmStream) (this.subStreams.previous()))) {
			var4.update(var1, var2, var3);
		}
	}

	@ObfuscatedName("d")
	@Export("skip")
	public synchronized final void skip(int var1) {
		do {
			if (this.field255 < 0) {
				this.skipSubStreams(var1);
				return;
			}
			if (this.field253 + var1 < this.field255) {
				this.field253 += var1;
				this.skipSubStreams(var1);
				return;
			}
			int var2 = this.field255 - this.field253;
			this.skipSubStreams(var2);
			var1 -= var2;
			this.field253 += var2;
			this.method584();
			PcmStreamMixerListener var3 = ((PcmStreamMixerListener) (this.field252.last()));
			synchronized(var3) {
				int var5 = var3.update();
				if (var5 < 0) {
					var3.field397 = 0;
					this.method597(var3);
				} else {
					var3.field397 = var5;
					this.method588(var3.previous, var3);
				}
			}
		} while (var1 != 0 );
	}

	@ObfuscatedName("a")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = ((PcmStream) (this.subStreams.last())); var2 != null; var2 = ((PcmStream) (this.subStreams.previous()))) {
			var2.skip(var1);
		}
	}
}