import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
public class class139 implements Enum {
	@ObfuscatedName("wr")
	@ObfuscatedGetter(
		intValue = 1482873203
	)
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class139 field1638;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class139 field1650;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class139 field1639;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class139 field1656;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class139 field1646;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class139 field1642;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class139 field1637;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class139 field1644;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class139 field1641;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class139 field1645;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class139 field1643;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class139 field1648;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class139 field1649;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class139 field1640;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class139 field1647;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class139 field1652;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class139 field1653;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1463947803
	)
	final int field1654;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1678001025
	)
	final int field1655;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1123662873
	)
	final int field1651;

	static {
		field1638 = new class139(0, 0, (String)null, -1, -1);
		field1650 = new class139(1, 1, (String)null, 0, 2);
		field1639 = new class139(2, 2, (String)null, 1, 2);
		field1656 = new class139(3, 3, (String)null, 2, 2);
		field1646 = new class139(4, 4, (String)null, 3, 1);
		field1642 = new class139(5, 5, (String)null, 4, 1);
		field1637 = new class139(6, 6, (String)null, 5, 1);
		field1644 = new class139(7, 7, (String)null, 6, 3);
		field1641 = new class139(8, 8, (String)null, 7, 3);
		field1645 = new class139(9, 9, (String)null, 8, 3);
		field1643 = new class139(10, 10, (String)null, 0, 7);
		field1648 = new class139(11, 11, (String)null, 1, 7);
		field1649 = new class139(12, 12, (String)null, 2, 7);
		field1640 = new class139(13, 13, (String)null, 3, 7);
		field1647 = new class139(14, 14, (String)null, 4, 7);
		field1652 = new class139(15, 15, (String)null, 5, 7);
		field1653 = new class139(16, 16, (String)null, 0, 5);
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)V",
		garbageValue = "-1"
	)
	class139(int var1, int var2, String var3, int var4, int var5) {
		this.field1654 = var1;
		this.field1655 = var2;
		this.field1651 = var4;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-350930589"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1655;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1352998537"
	)
	int method3365() {
		return this.field1651;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2035703124"
	)
	public static void method3373() {
		EnumComposition.EnumDefinition_cached.clear();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "10"
	)
	public static void method3374() {
		ItemComposition.ItemDefinition_cachedSprites.clear();
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "409674992"
	)
	static final void method3375() {
		int var0;
		int var1;
		int var2;
		if (!Client.field773) {
			var0 = Coord.method6797(DynamicObject.field1049);
			var1 = Coord.method6797(class1.field3);
			var2 = VarcInt.getTileHeight(ClientPreferences.topLevelWorldView, var0, var1, ClientPreferences.topLevelWorldView.plane) - class7.field21;
			Player.method2609(var0, var2, var1);
		} else if (Client.field776 != null) {
			class301.cameraX = Client.field776.vmethod9311();
			class33.cameraZ = Client.field776.vmethod9314();
			if (Client.field775) {
				ArchiveLoader.cameraY = Client.field776.vmethod9313();
			} else {
				ArchiveLoader.cameraY = VarcInt.getTileHeight(ClientPreferences.topLevelWorldView, class301.cameraX, class33.cameraZ, ClientPreferences.topLevelWorldView.plane) - Client.field776.vmethod9313();
			}

			Client.field776.method9322();
		}

		if (!Client.field774) {
			var0 = Coord.method6797(HorizontalAlignment.field1989);
			var1 = Coord.method6797(class28.field1287);
			var2 = VarcInt.getTileHeight(ClientPreferences.topLevelWorldView, var0, var1, ClientPreferences.topLevelWorldView.plane) - class380.field4133;
			int var3 = var0 - class301.cameraX;
			int var4 = var2 - ArchiveLoader.cameraY;
			int var5 = var1 - class33.cameraZ;
			int var6 = (int)Math.sqrt((double)(var5 * var5 + var3 * var3));
			int var7 = (int)(Math.atan2((double)var4, (double)var6) * 325.9490051269531D) & 2047;
			int var8 = (int)(Math.atan2((double)var3, (double)var5) * -325.9490051269531D) & 2047;
			KeyHandler.method374(var7, var8);
		} else {
			if (Client.field778 != null) {
				class463.cameraPitch = Client.field778.method9306();
				class463.cameraPitch = Math.min(Math.max(class463.cameraPitch, 128), 383);
				Client.field778.method9322();
			}

			if (Client.field777 != null) {
				class267.cameraYaw = Client.field777.method9306() & 2047;
				Client.field777.method9322();
			}
		}

	}
}
