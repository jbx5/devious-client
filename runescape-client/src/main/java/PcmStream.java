import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lbk;"
	)
	@Export("after")
	PcmStream after;
	@ObfuscatedName("al")
	int field331;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lct;"
	)
	@Export("sound")
	AbstractSound sound;
	@ObfuscatedName("ao")
	@Export("active")
	volatile boolean active;

	protected PcmStream() {
		this.active = true;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Lbk;"
	)
	@Export("firstSubStream")
	protected abstract PcmStream firstSubStream();

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()Lbk;"
	)
	@Export("nextSubStream")
	protected abstract PcmStream nextSubStream();

	@ObfuscatedName("av")
	protected abstract int vmethod6390();

	@ObfuscatedName("ab")
	@Export("fill")
	protected abstract void fill(int[] var1, int var2, int var3);

	@ObfuscatedName("ae")
	@Export("skip")
	protected abstract void skip(int var1);

	@ObfuscatedName("bv")
	int vmethod1052() {
		return 255;
	}

	@ObfuscatedName("fs")
	@Export("update")
	final void update(int[] var1, int var2, int var3) {
		if (this.active) {
			this.fill(var1, var2, var3);
		} else {
			this.skip(var3);
		}

	}
}
