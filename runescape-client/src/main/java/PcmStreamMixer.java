import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("br")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("subStreams")
	NodeDeque subStreams;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	NodeDeque field234;
	@ObfuscatedName("an")
	int field235;
	@ObfuscatedName("au")
	int field233;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque();
		this.field234 = new NodeDeque();
		this.field235 = 0;
		this.field233 = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lbb;)V"
	)
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lbb;)V"
	)
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove();
	}

	@ObfuscatedName("an")
	void method682() {
		if (this.field235 > 0) {
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field234.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field234.previous()) {
				var1.field379 -= this.field235;
			}

			this.field233 -= this.field235;
			this.field235 = 0;
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltp;Lct;)V"
	)
	void method683(Node var1, PcmStreamMixerListener var2) {
		while (this.field234.sentinel != var1 && ((PcmStreamMixerListener)var1).field379 <= var2.field379) {
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1);
		this.field233 = ((PcmStreamMixerListener)this.field234.sentinel.previous).field379;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lct;)V"
	)
	void method684(PcmStreamMixerListener var1) {
		var1.remove();
		var1.remove2();
		Node var2 = this.field234.sentinel.previous;
		if (var2 == this.field234.sentinel) {
			this.field233 = -1;
		} else {
			this.field233 = ((PcmStreamMixerListener)var2).field379;
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Lbb;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()Lbb;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous();
	}

	@ObfuscatedName("ac")
	protected int vmethod6461() {
		return 0;
	}

	@ObfuscatedName("ae")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field233 < 0) {
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			if (var3 + this.field235 < this.field233) {
				this.field235 += var3;
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			int var4 = this.field233 - this.field235;
			this.updateSubStreams(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field235 += var4;
			this.method682();
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field234.last();
			synchronized(var5) {
				int var7 = var5.update();
				if (var7 < 0) {
					var5.field379 = 0;
					this.method684(var5);
				} else {
					var5.field379 = var7;
					this.method683(var5.previous, var5);
				}
			}
		} while(var3 != 0);

	}

	@ObfuscatedName("ad")
	@Export("updateSubStreams")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) {
			var4.update(var1, var2, var3);
		}

	}

	@ObfuscatedName("aq")
	@Export("skip")
	public final synchronized void skip(int var1) {
		do {
			if (this.field233 < 0) {
				this.skipSubStreams(var1);
				return;
			}

			if (this.field235 + var1 < this.field233) {
				this.field235 += var1;
				this.skipSubStreams(var1);
				return;
			}

			int var2 = this.field233 - this.field235;
			this.skipSubStreams(var2);
			var1 -= var2;
			this.field235 += var2;
			this.method682();
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field234.last();
			synchronized(var3) {
				int var5 = var3.update();
				if (var5 < 0) {
					var3.field379 = 0;
					this.method684(var3);
				} else {
					var3.field379 = var5;
					this.method683(var3.previous, var3);
				}
			}
		} while(var1 != 0);

	}

	@ObfuscatedName("al")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) {
			var2.skip(var1);
		}

	}
}
