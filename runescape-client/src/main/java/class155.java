import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
public class class155 extends class159 {
	@ObfuscatedName("jy")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;
	@ObfuscatedName("aw")
	String field1732;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 156675119
	)
	int field1731;
	@ObfuscatedName("ar")
	byte field1735;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgs;"
	)
	final class160 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgs;)V"
	)
	class155(class160 var1) {
		this.this$0 = var1;
		this.field1732 = null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)V",
		garbageValue = "-43"
	)
	void vmethod3411(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

		this.field1732 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1731 = var1.readUnsignedShort();
		this.field1735 = var1.readByte();
		var1.readLong();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgh;I)V",
		garbageValue = "-2132107044"
	)
	void vmethod3404(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember();
		var2.username = new Username(this.field1732);
		var2.world = this.field1731;
		var2.rank = this.field1735;
		var1.addMember(var2);
	}
}
