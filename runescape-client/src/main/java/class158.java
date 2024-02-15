import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
public class class158 extends class161 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -533538717
	)
	int field1769;
	@ObfuscatedName("aw")
	byte field1764;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1906278015
	)
	int field1766;
	@ObfuscatedName("ai")
	String field1767;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lga;"
	)
	final class162 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lga;)V"
	)
	class158(class162 var1) {
		this.this$0 = var1;
		this.field1769 = -1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "1174207862"
	)
	void vmethod3504(Buffer var1) {
		var1.readUnsignedByte();
		this.field1769 = var1.readUnsignedShort();
		this.field1764 = var1.readByte();
		this.field1766 = var1.readUnsignedShort();
		var1.readLong();
		this.field1767 = var1.readStringCp1252NullTerminated();
		var1.readUnsignedByte();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgg;I)V",
		garbageValue = "378355771"
	)
	void vmethod3509(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1769);
		var2.rank = this.field1764;
		var2.world = this.field1766;
		var2.username = new Username(this.field1767);
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Lng;III)V",
		garbageValue = "512140024"
	)
	public static void method3402(Widget var0, int var1, int var2) {
		var0.field3774.bodyColors[var1] = var2;
		var0.field3774.method6477();
	}
}
