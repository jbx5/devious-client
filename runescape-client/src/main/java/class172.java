import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
public class class172 extends class150 {
	@ObfuscatedName("df")
	static boolean field1855;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = -8725290732308163335L
	)
	long field1854;
	@ObfuscatedName("aw")
	String field1853;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;)V"
	)
	class172(class153 var1) {
		this.this$0 = var1;
		this.field1854 = -1L;
		this.field1853 = null;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvl;I)V",
		garbageValue = "-1813719027"
	)
	void vmethod3822(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1854 = var1.readLong();
		}

		this.field1853 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgy;I)V",
		garbageValue = "-2079483058"
	)
	void vmethod3821(ClanSettings var1) {
		var1.method3726(this.field1854, this.field1853);
	}
}
