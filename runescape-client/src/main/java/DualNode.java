import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ta")
@Implements("DualNode")
public class DualNode extends Node {
	@ObfuscatedName("em")
	@Export("keyDual")
	public long keyDual;
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "Lta;"
	)
	@Export("previousDual")
	public DualNode previousDual;
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Lta;"
	)
	@Export("nextDual")
	public DualNode nextDual;

	@ObfuscatedName("jd")
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
