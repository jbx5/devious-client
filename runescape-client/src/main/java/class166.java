import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
public class class166 extends class159 {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("ItemDefinition_modelArchive")
	public static AbstractArchive ItemDefinition_modelArchive;
	@ObfuscatedName("jb")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("am")
	String field1784;
	@ObfuscatedName("ap")
	byte field1788;
	@ObfuscatedName("af")
	byte field1783;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	final class160 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgr;)V"
	)
	class166(class160 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-1814222712"
	)
	void vmethod3518(Buffer var1) {
		this.field1784 = var1.readStringCp1252NullTerminatedOrNull();
		if (this.field1784 != null) {
			var1.readUnsignedByte();
			this.field1788 = var1.readByte();
			this.field1783 = var1.readByte();
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I)V",
		garbageValue = "1662663599"
	)
	void vmethod3519(ClanChannel var1) {
		var1.name = this.field1784;
		if (this.field1784 != null) {
			var1.field1758 = this.field1788;
			var1.field1767 = this.field1783;
		}

	}
}
