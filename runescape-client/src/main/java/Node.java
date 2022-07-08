import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("oh")
@Implements("Node")
public class Node {
	@ObfuscatedName("gu")
	@Export("key")
	public long key;

	@ObfuscatedName("gn")
	@ObfuscatedSignature(descriptor = "Loh;")
	@Export("previous")
	public Node previous;

	@ObfuscatedName("go")
	@ObfuscatedSignature(descriptor = "Loh;")
	@Export("next")
	public Node next;

	@ObfuscatedName("fw")
	@Export("remove")
	public void remove() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}

	@ObfuscatedName("fb")
	@Export("hasNext")
	public boolean hasNext() {
		return this.next != null;
	}
}