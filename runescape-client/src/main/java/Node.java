import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tw")
@Implements("Node")
public class Node {
	@ObfuscatedName("ht")
	@Export("key")
	public long key;
	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "Ltw;"
	)
	@Export("previous")
	public Node previous;
	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "Ltw;"
	)
	@Export("next")
	public Node next;

	@ObfuscatedName("kf")
	@Export("remove")
	public void remove() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}

	@ObfuscatedName("km")
	@Export("hasNext")
	public boolean hasNext() {
		return this.next != null;
	}
}
