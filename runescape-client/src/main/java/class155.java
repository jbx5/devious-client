import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
public class class155 extends class159 {
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("Widget_fontsArchive")
	public static AbstractArchive Widget_fontsArchive;
	@ObfuscatedName("au")
	String field1753;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 2093210631
	)
	int field1751;
	@ObfuscatedName("ao")
	byte field1752;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	final class160 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgg;)V"
	)
	class155(class160 var1) {
		this.this$0 = var1;
		this.field1753 = null;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltm;B)V",
		garbageValue = "1"
	)
	void vmethod3333(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

		this.field1753 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1751 = var1.readUnsignedShort();
		this.field1752 = var1.readByte();
		var1.readLong();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lgo;I)V",
		garbageValue = "831405774"
	)
	void vmethod3332(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember();
		var2.username = new Username(this.field1753);
		var2.world = this.field1751;
		var2.rank = this.field1752;
		var1.addMember(var2);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltm;IB)Ljava/lang/String;",
		garbageValue = "-80"
	)
	static String method3247(Buffer var0, int var1) {
		try {
			int var2 = var0.readUShortSmart();
			if (var2 > var1) {
				var2 = var1;
			}

			byte[] var3 = new byte[var2];
			var0.offset += class334.huffman.decompress(var0.array, var0.offset, var3, 0, var2);
			String var4 = class325.decodeStringCp1252(var3, 0, var2);
			return var4;
		} catch (Exception var6) {
			return "Cabbage";
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-692209680"
	)
	static int method3248(int var0) {
		return (int)Math.pow(2.0D, (double)(7.0F + (float)var0 / 256.0F));
	}
}
