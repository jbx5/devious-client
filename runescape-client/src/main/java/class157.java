import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
public class class157 extends class150 {
	@ObfuscatedName("ac")
	boolean field1744;
	@ObfuscatedName("ae")
	byte field1740;
	@ObfuscatedName("ag")
	byte field1741;
	@ObfuscatedName("am")
	byte field1747;
	@ObfuscatedName("ax")
	byte field1739;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;)V"
	)
	class157(class153 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvf;B)V",
		garbageValue = "127"
	)
	void vmethod3778(Buffer var1) {
		this.field1744 = var1.readUnsignedByte() == 1;
		this.field1740 = var1.readByte();
		this.field1741 = var1.readByte();
		this.field1747 = var1.readByte();
		this.field1739 = var1.readByte();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lgo;B)V",
		garbageValue = "32"
	)
	void vmethod3771(ClanSettings var1) {
		var1.allowGuests = this.field1744;
		var1.field1769 = this.field1740;
		var1.field1770 = this.field1741;
		var1.field1771 = this.field1747;
		var1.field1772 = this.field1739;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Lqd;",
		garbageValue = "-782050681"
	)
	public static class426 method3544() {
		synchronized(class426.field4727) {
			if (class426.field4725 == 0) {
				return new class426();
			} else {
				class426.field4727[--class426.field4725].method8100();
				return class426.field4727[class426.field4725];
			}
		}
	}
}
