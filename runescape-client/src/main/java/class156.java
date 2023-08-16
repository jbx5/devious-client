import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
public class class156 extends class159 {
	@ObfuscatedName("wl")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1961987563
	)
	int field1758;
	@ObfuscatedName("ae")
	byte field1757;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1314479155
	)
	int field1756;
	@ObfuscatedName("at")
	String field1759;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	final class160 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgg;)V"
	)
	class156(class160 var1) {
		this.this$0 = var1;
		this.field1758 = -1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltm;B)V",
		garbageValue = "1"
	)
	void vmethod3333(Buffer var1) {
		var1.readUnsignedByte();
		this.field1758 = var1.readUnsignedShort();
		this.field1757 = var1.readByte();
		this.field1756 = var1.readUnsignedShort();
		var1.readLong();
		this.field1759 = var1.readStringCp1252NullTerminated();
		var1.readUnsignedByte();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lgo;I)V",
		garbageValue = "831405774"
	)
	void vmethod3332(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1758);
		var2.rank = this.field1757;
		var2.world = this.field1756;
		var2.username = new Username(this.field1759);
	}
}
