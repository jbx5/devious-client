import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("oo")
@Implements("DualNode")
public class DualNode extends Node {
	@ObfuscatedName("dv")
	@Export("keyDual")
	public long keyDual;

	@ObfuscatedName("dy")
	@ObfuscatedSignature(descriptor = "Loo;")
	@Export("previousDual")
	public DualNode previousDual;

	@ObfuscatedName("ds")
	@ObfuscatedSignature(descriptor = "Loo;")
	@Export("nextDual")
	public DualNode nextDual;

	@ObfuscatedName("dc")
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