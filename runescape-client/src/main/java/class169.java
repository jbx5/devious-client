import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
public class class169 extends class147 {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		longValue = -670140212667468051L
	)
	long field1836;
	@ObfuscatedName("al")
	String field1837;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	final class150 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfu;)V"
	)
	class169(class150 var1) {
		this.this$0 = var1;
		this.field1836 = -1L;
		this.field1837 = null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)V",
		garbageValue = "1738227110"
	)
	void vmethod3486(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1836 = var1.readLong();
		}

		this.field1837 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgc;B)V",
		garbageValue = "100"
	)
	void vmethod3490(ClanSettings var1) {
		var1.method3328(this.field1836, this.field1837);
	}
}
