import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gf")
public class class156 extends class147 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("KitDefinition_modelsArchive")
	public static AbstractArchive KitDefinition_modelsArchive;
	@ObfuscatedName("ny")
	@ObfuscatedGetter(
		intValue = 154647647
	)
	@Export("menuX")
	static int menuX;
	@ObfuscatedName("ak")
	String field1751;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	final class150 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfu;)V"
	)
	class156(class150 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)V",
		garbageValue = "1738227110"
	)
	void vmethod3486(Buffer var1) {
		this.field1751 = var1.readStringCp1252NullTerminated();
		var1.readInt();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgc;B)V",
		garbageValue = "100"
	)
	void vmethod3490(ClanSettings var1) {
		var1.name = this.field1751;
	}
}
