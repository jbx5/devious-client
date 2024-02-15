import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("se")
@Implements("Node")
public class Node {
	@ObfuscatedName("hd")
	@Export("key")
	public long key;
	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "Lse;"
	)
	@Export("previous")
	public Node previous;
	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "Lse;"
	)
	@Export("next")
	public Node next;

	@ObfuscatedName("gv")
	@Export("remove")
	public void remove() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}

	@ObfuscatedName("gu")
	@Export("hasNext")
	public boolean hasNext() {
		return this.next != null;
	}
}
