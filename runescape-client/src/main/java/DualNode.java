import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tv")
@Implements("DualNode")
public class DualNode extends Node {
	@ObfuscatedName("eh")
	@Export("keyDual")
	public long keyDual;
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	@Export("previousDual")
	public DualNode previousDual;
	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	@Export("nextDual")
	public DualNode nextDual;

	@ObfuscatedName("km")
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
