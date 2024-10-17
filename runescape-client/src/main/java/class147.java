import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
public class class147 extends class150 {
	@ObfuscatedName("hc")
	static String field1688;
	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "[Lvc;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1730636379
	)
	int field1687;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1397888641
	)
	int field1689;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 564937003
	)
	int field1686;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1263814509
	)
	int field1685;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;)V"
	)
	class147(class153 var1) {
		this.this$0 = var1;
		this.field1687 = -1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvl;I)V",
		garbageValue = "-1813719027"
	)
	void vmethod3822(Buffer var1) {
		this.field1687 = var1.readUnsignedShort();
		this.field1689 = var1.readInt();
		this.field1686 = var1.readUnsignedByte();
		this.field1685 = var1.readUnsignedByte();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgy;I)V",
		garbageValue = "-2079483058"
	)
	void vmethod3821(ClanSettings var1) {
		var1.method3667(this.field1687, this.field1689, this.field1686, this.field1685);
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-41"
	)
	static final void method3554() {
		GrandExchangeOfferNameComparator.KitDefinition_archive = null;
		GrandExchangeOfferTotalQuantityComparator.KitDefinition_modelsArchive = null;
		KitDefinition.KitDefinition_fileCount = 0;
	}

	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "(Lng;B)Z",
		garbageValue = "-121"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) {
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) {
				int var2 = class153.method3600(var0, var1);
				int var3 = var0.cs1ComparisonValues[var1];
				if (var0.cs1Comparisons[var1] == 2) {
					if (var2 >= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) {
					if (var2 <= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) {
					if (var2 == var3) {
						return false;
					}
				} else if (var3 != var2) {
					return false;
				}
			}

			return true;
		}
	}
}
