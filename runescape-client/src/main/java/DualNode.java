import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sb")
@Implements("DualNode")
public class DualNode extends Node {
	@ObfuscatedName("ei")
	@Export("keyDual")
	public long keyDual;
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	@Export("previousDual")
	public DualNode previousDual;
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	@Export("nextDual")
	public DualNode nextDual;

	@ObfuscatedName("fs")
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
