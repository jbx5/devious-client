import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sm")
@Implements("DualNode")
public class DualNode extends Node {
	@ObfuscatedName("ex")
	@Export("keyDual")
	public long keyDual;
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "Lsm;"
	)
	@Export("previousDual")
	public DualNode previousDual;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Lsm;"
	)
	@Export("nextDual")
	public DualNode nextDual;

	@ObfuscatedName("es")
	@Export("removeDual")
	public void removeDual() {
		if (this.nextDual != null) {
			this.nextDual.previousDual = this.previousDual;
			this.previousDual.nextDual = this.nextDual;
			this.previousDual = null;
			this.nextDual = null;
		}
	}
}
