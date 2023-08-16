import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
public class class141 extends class143 {
	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	@Export("archive10")
	static Archive archive10;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		longValue = -6503402518445918241L
	)
	long field1663;
	@ObfuscatedName("ae")
	String field1662;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	class141(class146 var1) {
		this.this$0 = var1;
		this.field1663 = -1L;
		this.field1662 = null;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)V",
		garbageValue = "209179459"
	)
	void vmethod3337(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1663 = var1.readLong();
		}

		this.field1662 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lfi;B)V",
		garbageValue = "73"
	)
	void vmethod3339(ClanSettings var1) {
		var1.method3223(this.field1663, this.field1662, 0);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "49"
	)
	static final int method3100(int var0, int var1, int var2) {
		int var3 = var0 / var2;
		int var4 = var0 & var2 - 1;
		int var5 = var1 / var2;
		int var6 = var1 & var2 - 1;
		int var7 = class312.method5969(var3, var5);
		int var8 = class312.method5969(var3 + 1, var5);
		int var9 = class312.method5969(var3, var5 + 1);
		int var10 = class312.method5969(var3 + 1, var5 + 1);
		int var11 = class19.method294(var7, var8, var4, var2);
		int var12 = class19.method294(var9, var10, var4, var2);
		return class19.method294(var11, var12, var6, var2);
	}
}
