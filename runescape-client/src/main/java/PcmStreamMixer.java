import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bp")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("subStreams")
	NodeDeque subStreams;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	NodeDeque field259;
	@ObfuscatedName("af")
	int field260;
	@ObfuscatedName("aj")
	int field262;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque();
		this.field259 = new NodeDeque();
		this.field260 = 0;
		this.field262 = -1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lbl;)V"
	)
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lbl;)V"
	)
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove();
	}

	@ObfuscatedName("af")
	void method746() {
		if (this.field260 > 0) {
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field259.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field259.previous()) {
				var1.field402 -= this.field260;
			}

			this.field262 -= this.field260;
			this.field260 = 0;
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lse;Lcv;)V"
	)
	void method770(Node var1, PcmStreamMixerListener var2) {
		while (this.field259.sentinel != var1 && ((PcmStreamMixerListener)var1).field402 <= var2.field402) {
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1);
		this.field262 = ((PcmStreamMixerListener)this.field259.sentinel.previous).field402;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lcv;)V"
	)
	void method742(PcmStreamMixerListener var1) {
		var1.remove();
		var1.remove2();
		Node var2 = this.field259.sentinel.previous;
		if (var2 == this.field259.sentinel) {
			this.field262 = -1;
		} else {
			this.field262 = ((PcmStreamMixerListener)var2).field402;
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Lbl;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Lbl;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous();
	}

	@ObfuscatedName("ao")
	protected int vmethod6281() {
		return 0;
	}

	@ObfuscatedName("ae")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field262 < 0) {
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			if (var3 + this.field260 < this.field262) {
				this.field260 += var3;
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			int var4 = this.field262 - this.field260;
			this.updateSubStreams(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field260 += var4;
			this.method746();
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field259.last();
			synchronized(var5) {
				int var7 = var5.update();
				if (var7 < 0) {
					var5.field402 = 0;
					this.method742(var5);
				} else {
					var5.field402 = var7;
					this.method770(var5.previous, var5);
				}
			}
		} while(var3 != 0);

	}

	@ObfuscatedName("aa")
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
			if (this.field262 < 0) {
				this.skipSubStreams(var1);
				return;
			}

			if (this.field260 + var1 < this.field262) {
				this.field260 += var1;
				this.skipSubStreams(var1);
				return;
			}

			int var2 = this.field262 - this.field260;
			this.skipSubStreams(var2);
			var1 -= var2;
			this.field260 += var2;
			this.method746();
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field259.last();
			synchronized(var3) {
				int var5 = var3.update();
				if (var5 < 0) {
					var3.field402 = 0;
					this.method742(var3);
				} else {
					var3.field402 = var5;
					this.method770(var3.previous, var3);
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
