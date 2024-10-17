import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("subStreams")
	NodeDeque subStreams;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	NodeDeque field233;
	@ObfuscatedName("ak")
	int field234;
	@ObfuscatedName("aj")
	int field235;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque();
		this.field233 = new NodeDeque();
		this.field234 = 0;
		this.field235 = -1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lbg;)V"
	)
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lbg;)V"
	)
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove();
	}

	@ObfuscatedName("ak")
	void method718() {
		if (this.field234 > 0) {
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field233.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field233.previous()) {
				var1.field376 -= this.field234;
			}

			this.field235 -= this.field234;
			this.field234 = 0;
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ltw;Lcn;)V"
	)
	void method704(Node var1, PcmStreamMixerListener var2) {
		while (this.field233.sentinel != var1 && ((PcmStreamMixerListener)var1).field376 <= var2.field376) {
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1);
		this.field235 = ((PcmStreamMixerListener)this.field233.sentinel.previous).field376;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lcn;)V"
	)
	void method717(PcmStreamMixerListener var1) {
		var1.remove();
		var1.remove2();
		Node var2 = this.field233.sentinel.previous;
		if (var2 == this.field233.sentinel) {
			this.field235 = -1;
		} else {
			this.field235 = ((PcmStreamMixerListener)var2).field376;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Lbg;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Lbg;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous();
	}

	@ObfuscatedName("ae")
	protected int vmethod6791() {
		return 0;
	}

	@ObfuscatedName("am")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field235 < 0) {
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			if (var3 + this.field234 < this.field235) {
				this.field234 += var3;
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			int var4 = this.field235 - this.field234;
			this.updateSubStreams(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field234 += var4;
			this.method718();
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field233.last();
			synchronized(var5) {
				int var7 = var5.update();
				if (var7 < 0) {
					var5.field376 = 0;
					this.method717(var5);
				} else {
					var5.field376 = var7;
					this.method704(var5.previous, var5);
				}
			}
		} while(var3 != 0);

	}

	@ObfuscatedName("at")
	@Export("updateSubStreams")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) {
			var4.update(var1, var2, var3);
		}

	}

	@ObfuscatedName("au")
	@Export("skip")
	public final synchronized void skip(int var1) {
		do {
			if (this.field235 < 0) {
				this.skipSubStreams(var1);
				return;
			}

			if (this.field234 + var1 < this.field235) {
				this.field234 += var1;
				this.skipSubStreams(var1);
				return;
			}

			int var2 = this.field235 - this.field234;
			this.skipSubStreams(var2);
			var1 -= var2;
			this.field234 += var2;
			this.method718();
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field233.last();
			synchronized(var3) {
				int var5 = var3.update();
				if (var5 < 0) {
					var3.field376 = 0;
					this.method717(var3);
				} else {
					var3.field376 = var5;
					this.method704(var3.previous, var3);
				}
			}
		} while(var1 != 0);

	}

	@ObfuscatedName("an")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) {
			var2.skip(var1);
		}

	}
}
