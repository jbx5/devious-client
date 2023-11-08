import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("subStreams")
	NodeDeque subStreams;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	NodeDeque field243;
	@ObfuscatedName("ar")
	int field242;
	@ObfuscatedName("ao")
	int field244;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque();
		this.field243 = new NodeDeque();
		this.field242 = 0;
		this.field244 = -1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lbk;)V"
	)
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lbk;)V"
	)
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove();
	}

	@ObfuscatedName("ar")
	void method715() {
		if (this.field242 > 0) {
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field243.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field243.previous()) {
				var1.field385 -= this.field242;
			}

			this.field244 -= this.field242;
			this.field242 = 0;
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lsh;Lcx;)V"
	)
	void method716(Node var1, PcmStreamMixerListener var2) {
		while (this.field243.sentinel != var1 && ((PcmStreamMixerListener)var1).field385 <= var2.field385) {
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1);
		this.field244 = ((PcmStreamMixerListener)this.field243.sentinel.previous).field385;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lcx;)V"
	)
	void method717(PcmStreamMixerListener var1) {
		var1.remove();
		var1.remove2();
		Node var2 = this.field243.sentinel.previous;
		if (var2 == this.field243.sentinel) {
			this.field244 = -1;
		} else {
			this.field244 = ((PcmStreamMixerListener)var2).field385;
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Lbk;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Lbk;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous();
	}

	@ObfuscatedName("ac")
	protected int vmethod6210() {
		return 0;
	}

	@ObfuscatedName("al")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field244 < 0) {
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			if (var3 + this.field242 < this.field244) {
				this.field242 += var3;
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			int var4 = this.field244 - this.field242;
			this.updateSubStreams(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field242 += var4;
			this.method715();
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field243.last();
			synchronized(var5) {
				int var7 = var5.update();
				if (var7 < 0) {
					var5.field385 = 0;
					this.method717(var5);
				} else {
					var5.field385 = var7;
					this.method716(var5.previous, var5);
				}
			}
		} while(var3 != 0);

	}

	@ObfuscatedName("az")
	@Export("updateSubStreams")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) {
			var4.update(var1, var2, var3);
		}

	}

	@ObfuscatedName("ap")
	@Export("skip")
	public final synchronized void skip(int var1) {
		do {
			if (this.field244 < 0) {
				this.skipSubStreams(var1);
				return;
			}

			if (this.field242 + var1 < this.field244) {
				this.field242 += var1;
				this.skipSubStreams(var1);
				return;
			}

			int var2 = this.field244 - this.field242;
			this.skipSubStreams(var2);
			var1 -= var2;
			this.field242 += var2;
			this.method715();
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field243.last();
			synchronized(var3) {
				int var5 = var3.update();
				if (var5 < 0) {
					var3.field385 = 0;
					this.method717(var3);
				} else {
					var3.field385 = var5;
					this.method716(var3.previous, var3);
				}
			}
		} while(var1 != 0);

	}

	@ObfuscatedName("av")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) {
			var2.skip(var1);
		}

	}
}
