import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lbb;"
	)
	@Export("after")
	PcmStream after;
	@ObfuscatedName("aa")
	int field329;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lcp;"
	)
	@Export("sound")
	AbstractSound sound;
	@ObfuscatedName("ag")
	@Export("active")
	volatile boolean active;

	protected PcmStream() {
		this.active = true;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Lbb;"
	)
	@Export("firstSubStream")
	protected abstract PcmStream firstSubStream();

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()Lbb;"
	)
	@Export("nextSubStream")
	protected abstract PcmStream nextSubStream();

	@ObfuscatedName("ac")
	protected abstract int vmethod6461();

	@ObfuscatedName("ae")
	@Export("fill")
	protected abstract void fill(int[] var1, int var2, int var3);

	@ObfuscatedName("aq")
	@Export("skip")
	protected abstract void skip(int var1);

	@ObfuscatedName("bv")
	int vmethod1015() {
		return 255;
	}

	@ObfuscatedName("fy")
	@Export("update")
	final void update(int[] var1, int var2, int var3) {
		if (this.active) {
			this.fill(var1, var2, var3);
		} else {
			this.skip(var3);
		}

	}
}
