import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
public class class140 extends class144 {
	@ObfuscatedName("v")
	String field1613;
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 
	127019119)

	int field1615;
	@ObfuscatedName("i")
	byte field1612;

	@ObfuscatedSignature(descriptor = 
	"Ler;")

	final class145 this$0;

	@ObfuscatedSignature(descriptor = 
	"(Ler;)V")

	class140(class145 var1) {
		this.this$0 = var1;
		this.field1613 = null;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;B)V", garbageValue = 
	"23")

	void vmethod3152(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

		this.field1613 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1615 = var1.readUnsignedShort();
		this.field1612 = var1.readByte();
		var1.readLong();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Lea;I)V", garbageValue = 
	"1764669808")

	void vmethod3153(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember();
		var2.username = new Username(this.field1613);
		var2.world = this.field1615;
		var2.rank = this.field1612;
		var1.addMember(var2);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(I)[Ldi;", garbageValue = 
	"1379522153")

	static class116[] method3045() {
		return new class116[]{ class116.field1403, class116.field1399, class116.field1400, class116.field1406, class116.field1401 };
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"(CII)Ljava/lang/String;", garbageValue = 
	"1078157971")

	public static String method3040(char var0, int var1) {
		char[] var2 = new char[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			var2[var3] = var0;
		}

		return new String(var2);
	}
}