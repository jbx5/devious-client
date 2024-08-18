import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pw")
@Implements("DualNodeDeque")
public final class DualNodeDeque {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lta;"
	)
	@Export("sentinel")
	DualNode sentinel;

	public DualNodeDeque() {
		this.sentinel = new DualNode();
		this.sentinel.previousDual = this.sentinel;
		this.sentinel.nextDual = this.sentinel;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lta;)V"
	)
	public void method7509(DualNode var1) {
		if (var1.nextDual != null) {
			var1.removeDual();
		}

		var1.nextDual = this.sentinel.nextDual;
		var1.previousDual = this.sentinel;
		var1.nextDual.previousDual = var1;
		var1.previousDual.nextDual = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lta;)V"
	)
	public void method7510(DualNode var1) {
		if (var1.nextDual != null) {
			var1.removeDual();
		}

		var1.nextDual = this.sentinel;
		var1.previousDual = this.sentinel.previousDual;
		var1.nextDual.previousDual = var1;
		var1.previousDual.nextDual = var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Lta;"
	)
	@Export("removeLast")
	public DualNode removeLast() {
		DualNode var1 = this.sentinel.previousDual;
		return var1 == this.sentinel ? null : var1;
	}
}
