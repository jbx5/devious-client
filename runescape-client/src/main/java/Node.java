import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("su")
@Implements("Node")
public class Node {
	@ObfuscatedName("hb")
	@Export("key")
	public long key;
	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "Lsu;"
	)
	@Export("previous")
	public Node previous;
	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "Lsu;"
	)
	@Export("next")
	public Node next;

	@ObfuscatedName("fp")
	@Export("remove")
	public void remove() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}

	@ObfuscatedName("gg")
	@Export("hasNext")
	public boolean hasNext() {
		return this.next != null;
	}
}
