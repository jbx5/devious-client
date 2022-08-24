import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("on")
@Implements("Node")
public class Node {
	@ObfuscatedName("gr")
	@Export("key")
	public long key;

	@ObfuscatedName("gi")
	@ObfuscatedSignature(descriptor = "Lon;")
	@Export("previous")
	public Node previous;

	@ObfuscatedName("gs")
	@ObfuscatedSignature(descriptor = "Lon;")
	@Export("next")
	public Node next;

	@ObfuscatedName("fc")
	@Export("remove")
	public void remove() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}

	@ObfuscatedName("fp")
	@Export("hasNext")
	public boolean hasNext() {
		return this.next != null;
	}
}