import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sj")
@Implements("Node")
public class Node {
	@ObfuscatedName("hq")
	@Export("key")
	public long key;
	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	@Export("previous")
	public Node previous;
	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	@Export("next")
	public Node next;

	@ObfuscatedName("gg")
	@Export("remove")
	public void remove() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}

	@ObfuscatedName("gw")
	@Export("hasNext")
	public boolean hasNext() {
		return this.next != null;
	}
}
