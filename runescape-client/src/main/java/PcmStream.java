import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bi")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lbi;"
	)
	@Export("after")
	PcmStream after;
	@ObfuscatedName("an")
	int field366;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lcb;"
	)
	@Export("sound")
	AbstractSound sound;
	@ObfuscatedName("ai")
	@Export("active")
	volatile boolean active;

	protected PcmStream() {
		this.active = true;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Lbi;"
	)
	@Export("firstSubStream")
	protected abstract PcmStream firstSubStream();

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Lbi;"
	)
	@Export("nextSubStream")
	protected abstract PcmStream nextSubStream();

	@ObfuscatedName("ab")
	protected abstract int vmethod6188();

	@ObfuscatedName("am")
	@Export("fill")
	protected abstract void fill(int[] var1, int var2, int var3);

	@ObfuscatedName("ag")
	@Export("skip")
	protected abstract void skip(int var1);

	@ObfuscatedName("bs")
	int vmethod1038() {
		return 255;
	}

	@ObfuscatedName("gm")
	@Export("update")
	final void update(int[] var1, int var2, int var3) {
		if (this.active) {
			this.fill(var1, var2, var3);
		} else {
			this.skip(var3);
		}

	}
}
