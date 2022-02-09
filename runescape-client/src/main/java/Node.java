import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("oe")
@Implements("Node")
public class Node {
    @ObfuscatedName("fh")
    @Export("key")
    public long key;

    @ObfuscatedName("fj")
    @ObfuscatedSignature(descriptor = "Loe;")
    @Export("previous")
    public Node previous;

    @ObfuscatedName("fo")
    @ObfuscatedSignature(descriptor = "Loe;")
    @Export("next")
    public Node next;

    @ObfuscatedName("ek")
    @Export("remove")
    public void remove() {
        if (this.next != null) {
            this.next.previous = this.previous;
            this.previous.next = this.next;
            this.previous = null;
            this.next = null;
        }
    }

    @ObfuscatedName("fc")
    @Export("hasNext")
    public boolean hasNext() {
        return this.next != null;
    }
}