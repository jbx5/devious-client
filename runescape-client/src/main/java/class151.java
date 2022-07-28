import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("eh")
public class class151 extends class144 {
	@ObfuscatedName("pu")
	@ObfuscatedSignature(descriptor = "Lce;")
	@Export("varcs")
	static Varcs varcs;

	@ObfuscatedName("o")
	String field1694;

	@ObfuscatedName("q")
	byte field1692;

	@ObfuscatedName("f")
	byte field1693;

	@ObfuscatedSignature(descriptor = "Let;")
	final class145 this$0;

	@ObfuscatedSignature(descriptor = "(Let;)V")
	class151(class145 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lqw;I)V", garbageValue = "-1897546377")
	void vmethod3146(Buffer var1) {
		this.field1694 = var1.readStringCp1252NullTerminatedOrNull();
		if (this.field1694 != null) {
			var1.readUnsignedByte();
			this.field1692 = var1.readByte();
			this.field1693 = var1.readByte();
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Ley;I)V", garbageValue = "-406744366")
	void vmethod3145(ClanChannel var1) {
		var1.name = this.field1694;
		if (this.field1694 != null) {
			var1.field1676 = this.field1692;
			var1.field1672 = this.field1693;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Llu;II)V", garbageValue = "1903177073")
	static void method3144(Archive var0, int var1) {
		if (var0.field3994) {
			if (var1 <= NetCache.field4048) {
				throw new RuntimeException("");
			}
			if (var1 < NetCache.field4046) {
				NetCache.field4046 = var1;
			}
		} else {
			if (var1 >= NetCache.field4046) {
				throw new RuntimeException("");
			}
			if (var1 > NetCache.field4048) {
				NetCache.field4048 = var1;
			}
		}
		if (Skills.field3568 != null) {
			class9.method81(var0, var1);
		} else {
			class181.requestNetFile(((Archive) (null)), 255, 255, 0, ((byte) (0)), true);
			NetCache.NetCache_archives[var1] = var0;
		}
	}
}