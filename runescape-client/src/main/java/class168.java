import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
public class class168 extends class161 {
	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "[Lvd;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;
	@ObfuscatedName("aq")
	String field1825;
	@ObfuscatedName("aw")
	byte field1821;
	@ObfuscatedName("al")
	byte field1820;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lga;"
	)
	final class162 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lga;)V"
	)
	class168(class162 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "1174207862"
	)
	void vmethod3504(Buffer var1) {
		this.field1825 = var1.readStringCp1252NullTerminatedOrNull();
		if (this.field1825 != null) {
			var1.readUnsignedByte();
			this.field1821 = var1.readByte();
			this.field1820 = var1.readByte();
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgg;I)V",
		garbageValue = "378355771"
	)
	void vmethod3509(ClanChannel var1) {
		var1.name = this.field1825;
		if (this.field1825 != null) {
			var1.field1806 = this.field1821;
			var1.field1801 = this.field1820;
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "835485151"
	)
	public static void method3505() {
		DbTableType.DBTableType_cache.clear();
	}
}
