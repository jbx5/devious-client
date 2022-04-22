import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lld;")

	@Export("subStreams")
	NodeDeque subStreams;
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Lld;")

	NodeDeque field244;
	@ObfuscatedName("i")
	int field246;
	@ObfuscatedName("f")
	int field243;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque();
		this.field244 = new NodeDeque();
		this.field246 = 0;
		this.field243 = -1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Laf;)V")

	@Export("addSubStream")
	public synchronized final void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Laf;)V")

	@Export("removeSubStream")
	public synchronized final void removeSubStream(PcmStream var1) {
		var1.remove();
	}

	@ObfuscatedName("i")
	void method617() {
		if (this.field246 > 0) {
			for (PcmStreamMixerListener var1 = ((PcmStreamMixerListener) (this.field244.last())); var1 != null; var1 = ((PcmStreamMixerListener) (this.field244.previous()))) {
				var1.field390 -= this.field246;
			}

			this.field243 -= this.field246;
			this.field246 = 0;
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(Loq;Lap;)V")

	void method618(Node var1, PcmStreamMixerListener var2) {
		while ((this.field244.sentinel != var1) && (((PcmStreamMixerListener) (var1)).field390 <= var2.field390)) {
			var1 = var1.previous;
		} 

		NodeDeque.NodeDeque_addBefore(var2, var1);
		this.field243 = ((PcmStreamMixerListener) (this.field244.sentinel.previous)).field390;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(Lap;)V")

	void method619(PcmStreamMixerListener var1) {
		var1.remove();
		var1.remove2();
		Node var2 = this.field244.sentinel.previous;
		if (var2 == this.field244.sentinel) {
			this.field243 = -1;
		} else {
			this.field243 = ((PcmStreamMixerListener) (var2)).field390;
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"()Laf;")

	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return ((PcmStream) (this.subStreams.last()));
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"()Laf;")

	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return ((PcmStream) (this.subStreams.previous()));
	}

	@ObfuscatedName("l")
	protected int vmethod5441() {
		return 0;
	}

	@ObfuscatedName("q")
	@Export("fill")
	public synchronized final void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field243 < 0) {
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			if ((var3 + this.field246) < this.field243) {
				this.field246 += var3;
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			int var4 = this.field243 - this.field246;
			this.updateSubStreams(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field246 += var4;
			this.method617();
			PcmStreamMixerListener var5 = ((PcmStreamMixerListener) (this.field244.last()));
			synchronized(var5) {
				int var7 = var5.update();
				if (var7 < 0) {
					var5.field390 = 0;
					this.method619(var5);
				} else {
					var5.field390 = var7;
					this.method618(var5.previous, var5);
				}
			}
		} while (var3 != 0 );

	}

	@ObfuscatedName("o")
	@Export("updateSubStreams")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = ((PcmStream) (this.subStreams.last())); var4 != null; var4 = ((PcmStream) (this.subStreams.previous()))) {
			var4.update(var1, var2, var3);
		}

	}

	@ObfuscatedName("r")
	@Export("skip")
	public synchronized final void skip(int var1) {
		do {
			if (this.field243 < 0) {
				this.skipSubStreams(var1);
				return;
			}

			if ((this.field246 + var1) < this.field243) {
				this.field246 += var1;
				this.skipSubStreams(var1);
				return;
			}

			int var2 = this.field243 - this.field246;
			this.skipSubStreams(var2);
			var1 -= var2;
			this.field246 += var2;
			this.method617();
			PcmStreamMixerListener var3 = ((PcmStreamMixerListener) (this.field244.last()));
			synchronized(var3) {
				int var5 = var3.update();
				if (var5 < 0) {
					var3.field390 = 0;
					this.method619(var3);
				} else {
					var3.field390 = var5;
					this.method618(var3.previous, var3);
				}
			}
		} while (var1 != 0 );

	}

	@ObfuscatedName("p")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = ((PcmStream) (this.subStreams.last())); var2 != null; var2 = ((PcmStream) (this.subStreams.previous()))) {
			var2.skip(var1);
		}

	}
}