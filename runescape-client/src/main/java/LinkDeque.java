import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pw")
@Implements("LinkDeque")
public class LinkDeque {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ltn;"
	)
	@Export("sentinel")
	Link sentinel;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ltn;"
	)
	@Export("current")
	Link current;

	public LinkDeque() {
		this.sentinel = new Link();
		this.sentinel.previous = this.sentinel;
		this.sentinel.next = this.sentinel;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ltn;)V"
	)
	@Export("addFirst")
	public void addFirst(Link var1) {
		if (var1.next != null) {
			var1.remove();
		}

		var1.next = this.sentinel.next;
		var1.previous = this.sentinel;
		var1.next.previous = var1;
		var1.previous.next = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Ltn;"
	)
	@Export("last")
	public Link last() {
		Link var1 = this.sentinel.previous;
		if (var1 == this.sentinel) {
			this.current = null;
			return null;
		} else {
			this.current = var1.previous;
			return var1;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Ltn;"
	)
	@Export("previous")
	public Link previous() {
		Link var1 = this.current;
		if (var1 == this.sentinel) {
			this.current = null;
			return null;
		} else {
			this.current = var1.previous;
			return var1;
		}
	}
}
