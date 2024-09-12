import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
public class class154 extends class150 {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1991951399
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1079564727
	)
	int field1724;
	@ObfuscatedName("ae")
	byte field1721;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;)V"
	)
	class154(class153 var1) {
		this.this$0 = var1;
		this.field1724 = -1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvf;B)V",
		garbageValue = "127"
	)
	void vmethod3778(Buffer var1) {
		this.field1724 = var1.readUnsignedShort();
		this.field1721 = var1.readByte();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lgo;B)V",
		garbageValue = "32"
	)
	void vmethod3771(ClanSettings var1) {
		var1.method3586(this.field1724, this.field1721);
	}
}
