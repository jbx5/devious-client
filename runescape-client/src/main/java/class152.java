import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
public class class152 extends class145 {
	@ObfuscatedName("aq")
	boolean field1715;
	@ObfuscatedName("aw")
	byte field1717;
	@ObfuscatedName("al")
	byte field1716;
	@ObfuscatedName("ai")
	byte field1719;
	@ObfuscatedName("ar")
	byte field1718;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfg;)V"
	)
	class152(class148 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "584073694"
	)
	void vmethod3512(Buffer var1) {
		this.field1715 = var1.readUnsignedByte() == 1;
		this.field1717 = var1.readByte();
		this.field1716 = var1.readByte();
		this.field1719 = var1.readByte();
		this.field1718 = var1.readByte();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I)V",
		garbageValue = "406847376"
	)
	void vmethod3513(ClanSettings var1) {
		var1.allowGuests = this.field1715;
		var1.field1746 = this.field1717;
		var1.field1748 = this.field1716;
		var1.field1743 = this.field1719;
		var1.field1742 = this.field1718;
	}

	@ObfuscatedName("ah")
	static final void method3290(long var0) {
		ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var0;
	}
}
