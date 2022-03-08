import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("nd")
@Implements("DualNode")
public class DualNode extends Node {
    @ObfuscatedName("cp")
    @Export("keyDual")
    public long keyDual;

    @ObfuscatedName("ce")
    @ObfuscatedSignature(descriptor = "Lnd;")
    @Export("previousDual")
    public DualNode previousDual;

    @ObfuscatedName("cv")
    @ObfuscatedSignature(descriptor = "Lnd;")
    @Export("nextDual")
    public DualNode nextDual;

    @ObfuscatedName("dt")
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