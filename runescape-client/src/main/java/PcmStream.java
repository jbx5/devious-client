import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ba")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lba;"
	)
	@Export("after")
	PcmStream after;
	@ObfuscatedName("au")
	int field344;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lcd;"
	)
	@Export("sound")
	AbstractSound sound;
	@ObfuscatedName("ap")
	@Export("active")
	volatile boolean active;

	protected PcmStream() {
		this.active = true;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Lba;"
	)
	@Export("firstSubStream")
	protected abstract PcmStream firstSubStream();

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()Lba;"
	)
	@Export("nextSubStream")
	protected abstract PcmStream nextSubStream();

	@ObfuscatedName("aw")
	protected abstract int vmethod6214();

	@ObfuscatedName("ad")
	@Export("fill")
	protected abstract void fill(int[] var1, int var2, int var3);

	@ObfuscatedName("as")
	@Export("skip")
	protected abstract void skip(int var1);

	@ObfuscatedName("bk")
	int vmethod1015() {
		return 255;
	}

	@ObfuscatedName("fz")
	@Export("update")
	final void update(int[] var1, int var2, int var3) {
		if (this.active) {
			this.fill(var1, var2, var3);
		} else {
			this.skip(var3);
		}

	}
}
