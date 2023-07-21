import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
public class class149 extends class159 {
	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	static Archive field1676;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -475235329
	)
	int field1678;
	@ObfuscatedName("ay")
	byte field1682;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 360989063
	)
	int field1680;
	@ObfuscatedName("am")
	String field1679;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgs;"
	)
	final class160 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgs;)V"
	)
	class149(class160 var1) {
		this.this$0 = var1;
		this.field1678 = -1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)V",
		garbageValue = "-43"
	)
	void vmethod3411(Buffer var1) {
		this.field1678 = var1.readUnsignedShort();
		this.field1682 = var1.readByte();
		this.field1680 = var1.readUnsignedShort();
		var1.readLong();
		this.field1679 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgh;I)V",
		garbageValue = "-2132107044"
	)
	void vmethod3404(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1678);
		var2.rank = this.field1682;
		var2.world = this.field1680;
		var2.username = new Username(this.field1679);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-1871953753"
	)
	public static void method3186(AbstractArchive var0) {
		FloorOverlayDefinition.FloorOverlayDefinition_archive = var0;
	}
}
