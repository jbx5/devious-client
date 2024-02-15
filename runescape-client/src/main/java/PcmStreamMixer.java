import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("subStreams")
	NodeDeque subStreams;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	NodeDeque field258;
	@ObfuscatedName("al")
	int field260;
	@ObfuscatedName("ai")
	int field257;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque();
		this.field258 = new NodeDeque();
		this.field260 = 0;
		this.field257 = -1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lbj;)V"
	)
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lbj;)V"
	)
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove();
	}

	@ObfuscatedName("al")
	void method665() {
		if (this.field260 > 0) {
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field258.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field258.previous()) {
				var1.field397 -= this.field260;
			}

			this.field257 -= this.field260;
			this.field260 = 0;
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lse;Lcd;)V"
	)
	void method666(Node var1, PcmStreamMixerListener var2) {
		while (this.field258.sentinel != var1 && ((PcmStreamMixerListener)var1).field397 <= var2.field397) {
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1);
		this.field257 = ((PcmStreamMixerListener)this.field258.sentinel.previous).field397;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lcd;)V"
	)
	void method689(PcmStreamMixerListener var1) {
		var1.remove();
		var1.remove2();
		Node var2 = this.field258.sentinel.previous;
		if (var2 == this.field258.sentinel) {
			this.field257 = -1;
		} else {
			this.field257 = ((PcmStreamMixerListener)var2).field397;
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Lbj;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Lbj;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous();
	}

	@ObfuscatedName("az")
	protected int vmethod6346() {
		return 0;
	}

	@ObfuscatedName("ao")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field257 < 0) {
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			if (var3 + this.field260 < this.field257) {
				this.field260 += var3;
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			int var4 = this.field257 - this.field260;
			this.updateSubStreams(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field260 += var4;
			this.method665();
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field258.last();
			synchronized(var5) {
				int var7 = var5.update();
				if (var7 < 0) {
					var5.field397 = 0;
					this.method689(var5);
				} else {
					var5.field397 = var7;
					this.method666(var5.previous, var5);
				}
			}
		} while(var3 != 0);

	}

	@ObfuscatedName("au")
	@Export("updateSubStreams")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) {
			var4.update(var1, var2, var3);
		}

	}

	@ObfuscatedName("ak")
	@Export("skip")
	public final synchronized void skip(int var1) {
		do {
			if (this.field257 < 0) {
				this.skipSubStreams(var1);
				return;
			}

			if (this.field260 + var1 < this.field257) {
				this.field260 += var1;
				this.skipSubStreams(var1);
				return;
			}

			int var2 = this.field257 - this.field260;
			this.skipSubStreams(var2);
			var1 -= var2;
			this.field260 += var2;
			this.method665();
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field258.last();
			synchronized(var3) {
				int var5 = var3.update();
				if (var5 < 0) {
					var3.field397 = 0;
					this.method689(var3);
				} else {
					var3.field397 = var5;
					this.method666(var3.previous, var3);
				}
			}
		} while(var1 != 0);

	}

	@ObfuscatedName("ah")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) {
			var2.skip(var1);
		}

	}
}
