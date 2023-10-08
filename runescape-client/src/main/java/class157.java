import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
public class class157 extends class161 {
	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "[Lud;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;
	@ObfuscatedName("ac")
	String field1732;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -148375193
	)
	int field1727;
	@ObfuscatedName("ak")
	byte field1728;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	final class162 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgf;)V"
	)
	class157(class162 var1) {
		this.this$0 = var1;
		this.field1732 = null;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;B)V",
		garbageValue = "0"
	)
	void vmethod3405(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

		this.field1732 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1727 = var1.readUnsignedShort();
		this.field1728 = var1.readByte();
		var1.readLong();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgb;B)V",
		garbageValue = "0"
	)
	void vmethod3411(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember();
		var2.username = new Username(this.field1732);
		var2.world = this.field1727;
		var2.rank = this.field1728;
		var1.addMember(var2);
	}
}
