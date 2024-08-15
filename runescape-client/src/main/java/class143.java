import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
public enum class143 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	field1650(0, 0),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	field1640(1, 1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	field1645(2, 2),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	field1642(3, 3),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	field1643(4, 4),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	field1644(5, 5),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	field1641(6, 6),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	field1646(7, 7),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	field1647(8, 8);

	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 553229727
	)
	final int field1648;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -2078708519
	)
	final int field1649;

	class143(int var3, int var4) {
		this.field1648 = var3;
		this.field1649 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "111"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1649;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvg;Lud;I)Lud;",
		garbageValue = "-110832499"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte();
		int var3;
		if (var1 == null) {
			var3 = WorldMapEvent.method6096(var2);
			var1 = new IterableNodeHashTable(var3);
		}

		for (var3 = 0; var3 < var2; ++var3) {
			boolean var4 = var0.readUnsignedByte() == 1;
			int var5 = var0.readMedium();
			Object var6;
			if (var4) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
			} else {
				var6 = new IntegerNode(var0.readInt());
			}

			var1.put((Node)var6, (long)var5);
		}

		return var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-724463032"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var2 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0);
		VarbitComposition var1;
		if (var2 != null) {
			var1 = var2;
		} else {
			byte[] var3 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0);
			var2 = new VarbitComposition();
			if (var3 != null) {
				var2.decode(new Buffer(var3));
			}

			VarbitComposition.VarbitDefinition_cached.put(var2, (long)var0);
			var1 = var2;
		}

		int var7 = var1.baseVar;
		int var4 = var1.startBit;
		int var5 = var1.endBit;
		int var6 = Varps.Varps_masks[var5 - var4];
		return Varps.Varps_main[var7] >> var4 & var6;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "601480939"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "1902673161"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			var2 = (var2 << 5) - var2 + GrandExchangeOfferNameComparator.charToByteCp1252(var0.charAt(var3));
		}

		return var2;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ILdp;ZI)I",
		garbageValue = "687112930"
	)
	static int method3300(int var0, Script var1, boolean var2) {
		return 2;
	}
}
