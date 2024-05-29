import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	@Export("subStreams")
	NodeDeque subStreams;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	NodeDeque field258;
	@ObfuscatedName("aj")
	int field257;
	@ObfuscatedName("az")
	int field259;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque();
		this.field258 = new NodeDeque();
		this.field257 = 0;
		this.field259 = -1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lba;)V"
	)
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lba;)V"
	)
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove();
	}

	@ObfuscatedName("aj")
	void method705() {
		if (this.field257 > 0) {
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field258.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field258.previous()) {
				var1.field407 -= this.field257;
			}

			this.field259 -= this.field257;
			this.field257 = 0;
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ltl;Lcp;)V"
	)
	void method738(Node var1, PcmStreamMixerListener var2) {
		while (this.field258.sentinel != var1 && ((PcmStreamMixerListener)var1).field407 <= var2.field407) {
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1);
		this.field259 = ((PcmStreamMixerListener)this.field258.sentinel.previous).field407;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lcp;)V"
	)
	void method718(PcmStreamMixerListener var1) {
		var1.remove();
		var1.remove2();
		Node var2 = this.field258.sentinel.previous;
		if (var2 == this.field258.sentinel) {
			this.field259 = -1;
		} else {
			this.field259 = ((PcmStreamMixerListener)var2).field407;
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Lba;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()Lba;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous();
	}

	@ObfuscatedName("ab")
	protected int vmethod6454() {
		return 0;
	}

	@ObfuscatedName("ac")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field259 < 0) {
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			if (var3 + this.field257 < this.field259) {
				this.field257 += var3;
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			int var4 = this.field259 - this.field257;
			this.updateSubStreams(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field257 += var4;
			this.method705();
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field258.last();
			synchronized(var5) {
				int var7 = var5.update();
				if (var7 < 0) {
					var5.field407 = 0;
					this.method718(var5);
				} else {
					var5.field407 = var7;
					this.method738(var5.previous, var5);
				}
			}
		} while(var3 != 0);

	}

	@ObfuscatedName("ao")
	@Export("updateSubStreams")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) {
			var4.update(var1, var2, var3);
		}

	}

	@ObfuscatedName("ah")
	@Export("skip")
	public final synchronized void skip(int var1) {
		do {
			if (this.field259 < 0) {
				this.skipSubStreams(var1);
				return;
			}

			if (this.field257 + var1 < this.field259) {
				this.field257 += var1;
				this.skipSubStreams(var1);
				return;
			}

			int var2 = this.field259 - this.field257;
			this.skipSubStreams(var2);
			var1 -= var2;
			this.field257 += var2;
			this.method705();
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field258.last();
			synchronized(var3) {
				int var5 = var3.update();
				if (var5 < 0) {
					var3.field407 = 0;
					this.method718(var3);
				} else {
					var3.field407 = var5;
					this.method738(var3.previous, var3);
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
