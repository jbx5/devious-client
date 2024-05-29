import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ba")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lba;"
	)
	@Export("after")
	PcmStream after;
	@ObfuscatedName("ay")
	int field355;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lcb;"
	)
	@Export("sound")
	AbstractSound sound;
	@ObfuscatedName("as")
	@Export("active")
	volatile boolean active;

	protected PcmStream() {
		this.active = true;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Lba;"
	)
	@Export("firstSubStream")
	protected abstract PcmStream firstSubStream();

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()Lba;"
	)
	@Export("nextSubStream")
	protected abstract PcmStream nextSubStream();

	@ObfuscatedName("ab")
	protected abstract int vmethod6454();

	@ObfuscatedName("ac")
	@Export("fill")
	protected abstract void fill(int[] var1, int var2, int var3);

	@ObfuscatedName("ah")
	@Export("skip")
	protected abstract void skip(int var1);

	@ObfuscatedName("bp")
	int vmethod1030() {
		return 255;
	}

	@ObfuscatedName("fa")
	@Export("update")
	final void update(int[] var1, int var2, int var3) {
		if (this.active) {
			this.fill(var1, var2, var3);
		} else {
			this.skip(var3);
		}

	}
}
