import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
public class class132 implements MouseWheel {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	static final class132 field1575;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	static final class132 field1571;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	static final class132 field1572;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	static final class132 field1573;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	static final class132 field1582;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	static final class132 field1584;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	static final class132 field1570;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	static final class132 field1577;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	static final class132 field1578;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	static final class132 field1579;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	static final class132 field1580;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	static final class132 field1586;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	static final class132 field1576;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	static final class132 field1583;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	static final class132 field1581;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	static final class132 field1585;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	static final class132 field1592;
	@ObfuscatedName("uk")
	@ObfuscatedGetter(
		intValue = 948115584
	)
	static int field1574;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 2024587693
	)
	final int field1587;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 45567215
	)
	final int field1588;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 195970037
	)
	final int field1589;

	static {
		field1575 = new class132(0, 0, (String)null, -1, -1);
		field1571 = new class132(1, 1, (String)null, 0, 2);
		field1572 = new class132(2, 2, (String)null, 1, 2);
		field1573 = new class132(3, 3, (String)null, 2, 2);
		field1582 = new class132(4, 4, (String)null, 3, 1);
		field1584 = new class132(5, 5, (String)null, 4, 1);
		field1570 = new class132(6, 6, (String)null, 5, 1);
		field1577 = new class132(7, 7, (String)null, 6, 3);
		field1578 = new class132(8, 8, (String)null, 7, 3);
		field1579 = new class132(9, 9, (String)null, 8, 3);
		field1580 = new class132(10, 10, (String)null, 0, 7);
		field1586 = new class132(11, 11, (String)null, 1, 7);
		field1576 = new class132(12, 12, (String)null, 2, 7);
		field1583 = new class132(13, 13, (String)null, 3, 7);
		field1581 = new class132(14, 14, (String)null, 4, 7);
		field1585 = new class132(15, 15, (String)null, 5, 7);
		field1592 = new class132(16, 16, (String)null, 0, 5);
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)V",
		garbageValue = "-1"
	)
	class132(int var1, int var2, String var3, int var4, int var5) {
		this.field1587 = var1;
		this.field1588 = var2;
		this.field1589 = var4;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1644350448"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1588;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-130893378"
	)
	int method3027() {
		return this.field1589;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lhe;",
		garbageValue = "2013282869"
	)
	public static VarcInt method3036(int var0) {
		VarcInt var1 = (VarcInt)VarcInt.VarcInt_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarcInt.VarcInt_archive.takeFile(19, var0);
			var1 = new VarcInt();
			if (var2 != null) {
				var1.method3627(new Buffer(var2));
			}

			VarcInt.VarcInt_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhx;",
		garbageValue = "1"
	)
	@Export("KitDefinition_get")
	public static KitDefinition KitDefinition_get(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = World.KitDefinition_archive.takeFile(3, var0);
			var1 = new KitDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-225277985"
	)
	static final void method3039() {
		for (int var0 = 0; var0 < Client.npcCount; ++var0) {
			int var1 = Client.npcIndices[var0];
			NPC var2 = Client.npcs[var1];
			if (var2 != null) {
				class47.updateActorSequence(var2, var2.definition.size);
			}
		}

	}
}
