import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gr")
public class class173 extends class166 {
	@ObfuscatedName("sk")
	@Export("ClanChat_inClanChat")
	static boolean ClanChat_inClanChat;
	@ObfuscatedName("ac")
	String field1858;
	@ObfuscatedName("ae")
	byte field1852;
	@ObfuscatedName("ag")
	byte field1854;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgj;"
	)
	final class167 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgj;)V"
	)
	class173(class167 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvf;B)V",
		garbageValue = "0"
	)
	void vmethod3761(Buffer var1) {
		this.field1858 = var1.readStringCp1252NullTerminatedOrNull();
		if (this.field1858 != null) {
			var1.readUnsignedByte();
			this.field1852 = var1.readByte();
			this.field1854 = var1.readByte();
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lgm;I)V",
		garbageValue = "-1593238865"
	)
	void vmethod3762(ClanChannel var1) {
		var1.name = this.field1858;
		if (this.field1858 != null) {
			var1.field1839 = this.field1852;
			var1.field1833 = this.field1854;
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1659758574"
	)
	public static int method3768(int var0) {
		return var0 != 0 && var0 != 1 ? -1 : 0;
	}
}
