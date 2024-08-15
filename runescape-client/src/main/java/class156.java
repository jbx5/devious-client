import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
public class class156 extends class164 {
	@ObfuscatedName("ts")
	@ObfuscatedGetter(
		intValue = 1107518997
	)
	static int field1721;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1057912303
	)
	int field1722;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgl;"
	)
	final class165 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgl;)V"
	)
	class156(class165 var1) {
		this.this$0 = var1;
		this.field1722 = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvg;B)V",
		garbageValue = "-40"
	)
	void vmethod3611(Buffer var1) {
		this.field1722 = var1.readUnsignedShort();
		var1.readUnsignedByte();
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgx;I)V",
		garbageValue = "-357446960"
	)
	void vmethod3612(ClanChannel var1) {
		var1.removeMember(this.field1722);
	}
}
