import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
public class class155 extends class150 {
	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "Lsn;"
	)
	static GraphicsDefaults field1731;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1809556313
	)
	int field1730;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1468646441
	)
	int field1729;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1932954967
	)
	int field1727;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 696946985
	)
	int field1728;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;)V"
	)
	class155(class153 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvf;B)V",
		garbageValue = "127"
	)
	void vmethod3778(Buffer var1) {
		this.field1730 = var1.readInt();
		this.field1728 = var1.readInt();
		this.field1729 = var1.readUnsignedByte();
		this.field1727 = var1.readUnsignedByte();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lgo;B)V",
		garbageValue = "32"
	)
	void vmethod3771(ClanSettings var1) {
		var1.method3591(this.field1730, this.field1728, this.field1729, this.field1727);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lpo;Lpo;ZS)V",
		garbageValue = "24475"
	)
	public static void method3525(AbstractArchive var0, AbstractArchive var1, boolean var2) {
		ObjectComposition.ObjectDefinition_archive = var0;
		RestClientThreadFactory.ObjectDefinition_modelsArchive = var1;
		ObjectComposition.ObjectDefinition_isLowDetail = var2;
	}
}
