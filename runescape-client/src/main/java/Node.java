import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sh")
@Implements("Node")
public class Node {
	@ObfuscatedName("hp")
	@Export("key")
	public long key;
	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "Lsh;"
	)
	@Export("previous")
	public Node previous;
	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "Lsh;"
	)
	@Export("next")
	public Node next;

	@ObfuscatedName("fz")
	@Export("remove")
	public void remove() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}

	@ObfuscatedName("fx")
	@Export("hasNext")
	public boolean hasNext() {
		return this.next != null;
	}
}
