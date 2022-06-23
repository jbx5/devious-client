import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.util.Iterator;
import net.runelite.mapping.Export;
@ObfuscatedName("du")
public class class126 extends class128 {
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "Llh;")
	@Export("Widget_modelsArchive")
	public static AbstractArchive Widget_modelsArchive;

	@ObfuscatedName("cx")
	@ObfuscatedSignature(descriptor = "[Lqu;")
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;

	@ObfuscatedName("ig")
	@ObfuscatedSignature(descriptor = "[Lqu;")
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;

	@ObfuscatedName("c")
	@ObfuscatedGetter(longValue = -8228182624755456153L)
	long field1562;

	@ObfuscatedName("v")
	String field1559;

	@ObfuscatedSignature(descriptor = "Lej;")
	final class131 this$0;

	@ObfuscatedSignature(descriptor = "(Lej;)V")
	class126(class131 var1) {
		this.this$0 = var1;
		this.field1562 = -1L;
		this.field1559 = null;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lqt;B)V", garbageValue = "5")
	void vmethod3150(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1562 = var1.readLong();
		}
		this.field1559 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Len;I)V", garbageValue = "-1718344311")
	void vmethod3149(ClanSettings var1) {
		var1.method2956(this.field1562, this.field1559, 0);
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "78")
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		Iterator var0 = Messages.Messages_hashTable.iterator();
		while (var0.hasNext()) {
			Message var1 = ((Message) (var0.next()));
			var1.clearIsFromIgnored();
		} 
		if (Huffman.friendsChat != null) {
			Huffman.friendsChat.invalidateIgnoreds();
		}
	}
}