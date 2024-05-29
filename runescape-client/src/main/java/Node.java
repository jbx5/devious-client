import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tl")
@Implements("Node")
public class Node {
	@ObfuscatedName("he")
	@Export("key")
	public long key;
	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	@Export("previous")
	public Node previous;
	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	@Export("next")
	public Node next;

	@ObfuscatedName("jg")
	@Export("remove")
	public void remove() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}

	@ObfuscatedName("je")
	@Export("hasNext")
	public boolean hasNext() {
		return this.next != null;
	}
}
