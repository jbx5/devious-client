import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gc")
public class class162 extends class147 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = 90337108135687261L
	)
	long field1800;
	@ObfuscatedName("ad")
	String field1799;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1253382525
	)
	int field1801;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	final class150 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	class162(class150 var1) {
		this.this$0 = var1;
		this.field1800 = -1L;
		this.field1799 = null;
		this.field1801 = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;B)V",
		garbageValue = "118"
	)
	void vmethod3528(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1800 = var1.readLong();
		}

		this.field1799 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1801 = var1.readUnsignedShort();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lgk;B)V",
		garbageValue = "3"
	)
	void vmethod3530(ClanSettings var1) {
		var1.method3378(this.field1800, this.field1799, this.field1801);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "96"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var1 = ItemContainer.method2361(var0);
		int var2 = var1.baseVar;
		int var3 = var1.startBit;
		int var4 = var1.endBit;
		int var5 = Varps.Varps_masks[var4 - var3];
		return Varps.Varps_main[var2] >> var3 & var5;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-586745974"
	)
	public static int method3436(int var0) {
		return var0 >>> 12;
	}
}
