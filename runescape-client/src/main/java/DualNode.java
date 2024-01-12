import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sc")
@Implements("DualNode")
public class DualNode extends Node {
	@ObfuscatedName("ev")
	@Export("keyDual")
	public long keyDual;
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "Lsc;"
	)
	@Export("previousDual")
	public DualNode previousDual;
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "Lsc;"
	)
	@Export("nextDual")
	public DualNode nextDual;

	@ObfuscatedName("ez")
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
