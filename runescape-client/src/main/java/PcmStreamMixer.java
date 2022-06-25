import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("am")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Llo;")
	@Export("subStreams")
	NodeDeque subStreams;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Llo;")
	NodeDeque field249;

	@ObfuscatedName("q")
	int field251;

	@ObfuscatedName("f")
	int field252;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque();
		this.field249 = new NodeDeque();
		this.field251 = 0;
		this.field252 = -1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Laz;)V")
	@Export("addSubStream")
	public synchronized final void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Laz;)V")
	@Export("removeSubStream")
	public synchronized final void removeSubStream(PcmStream var1) {
		var1.remove();
	}

	@ObfuscatedName("q")
	void method583() {
		if (this.field251 > 0) {
			for (PcmStreamMixerListener var1 = ((PcmStreamMixerListener) (this.field249.last())); var1 != null; var1 = ((PcmStreamMixerListener) (this.field249.previous()))) {
				var1.field395 -= this.field251;
			}
			this.field252 -= this.field251;
			this.field251 = 0;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Loh;Las;)V")
	void method584(Node var1, PcmStreamMixerListener var2) {
		while (this.field249.sentinel != var1 && ((PcmStreamMixerListener) (var1)).field395 <= var2.field395) {
			var1 = var1.previous;
		} 
		NodeDeque.NodeDeque_addBefore(var2, var1);
		this.field252 = ((PcmStreamMixerListener) (this.field249.sentinel.previous)).field395;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(Las;)V")
	void method580(PcmStreamMixerListener var1) {
		var1.remove();
		var1.remove2();
		Node var2 = this.field249.sentinel.previous;
		if (var2 == this.field249.sentinel) {
			this.field252 = -1;
		} else {
			this.field252 = ((PcmStreamMixerListener) (var2)).field395;
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "()Laz;")
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return ((PcmStream) (this.subStreams.last()));
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "()Laz;")
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return ((PcmStream) (this.subStreams.previous()));
	}

	@ObfuscatedName("w")
	protected int vmethod5437() {
		return 0;
	}

	@ObfuscatedName("y")
	@Export("fill")
	public synchronized final void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field252 < 0) {
				this.updateSubStreams(var1, var2, var3);
				return;
			}
			if (var3 + this.field251 < this.field252) {
				this.field251 += var3;
				this.updateSubStreams(var1, var2, var3);
				return;
			}
			int var4 = this.field252 - this.field251;
			this.updateSubStreams(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field251 += var4;
			this.method583();
			PcmStreamMixerListener var5 = ((PcmStreamMixerListener) (this.field249.last()));
			synchronized(var5) {
				int var7 = var5.update();
				if (var7 < 0) {
					var5.field395 = 0;
					this.method580(var5);
				} else {
					var5.field395 = var7;
					this.method584(var5.previous, var5);
				}
			}
		} while (var3 != 0 );
	}

	@ObfuscatedName("i")
	@Export("updateSubStreams")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = ((PcmStream) (this.subStreams.last())); var4 != null; var4 = ((PcmStream) (this.subStreams.previous()))) {
			var4.update(var1, var2, var3);
		}
	}

	@ObfuscatedName("s")
	@Export("skip")
	public synchronized final void skip(int var1) {
		do {
			if (this.field252 < 0) {
				this.skipSubStreams(var1);
				return;
			}
			if (this.field251 + var1 < this.field252) {
				this.field251 += var1;
				this.skipSubStreams(var1);
				return;
			}
			int var2 = this.field252 - this.field251;
			this.skipSubStreams(var2);
			var1 -= var2;
			this.field251 += var2;
			this.method583();
			PcmStreamMixerListener var3 = ((PcmStreamMixerListener) (this.field249.last()));
			synchronized(var3) {
				int var5 = var3.update();
				if (var5 < 0) {
					var3.field395 = 0;
					this.method580(var3);
				} else {
					var3.field395 = var5;
					this.method584(var3.previous, var3);
				}
			}
		} while (var1 != 0 );
	}

	@ObfuscatedName("t")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = ((PcmStream) (this.subStreams.last())); var2 != null; var2 = ((PcmStream) (this.subStreams.previous()))) {
			var2.skip(var1);
		}
	}
}