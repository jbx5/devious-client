import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ln")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	static final WorldMapID field3212;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	static final WorldMapID field3213;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -938647203
	)
	@Export("value")
	final int value;

	static {
		field3212 = new WorldMapID(0);
		field3213 = new WorldMapID(1);
	}

	WorldMapID(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1602380825"
	)
	public static int method5942(int var0) {
		return class327.field3565[var0];
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(FB)F",
		garbageValue = "41"
	)
	public static final float method5944(float var0) {
		float var1 = 75.0F;
		float var2 = 10000.0F;
		float var3 = 750000.0F / (10000.0F - var0 * 9925.0F);
		return (var3 - 75.0F) / 9925.0F;
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIZB)V",
		garbageValue = "-120"
	)
	@Export("addTileItemToGroundItems")
	static void addTileItemToGroundItems(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		TileItem var10 = new TileItem();
		var10.id = var3;
		var10.quantity = var4;
		var10.method2757(var5);
		var10.field1394 = Client.field543 + var6;
		var10.field1399 = var7 + Client.field543;
		var10.field1396 = var8;
		var10.field1395 = var9;
		if (ModeWhere.field4623.field1349[var0][var1][var2] == null) {
			ModeWhere.field4623.field1349[var0][var1][var2] = new NodeDeque();
		}

		ModeWhere.field4623.field1349[var0][var1][var2].addFirst(var10);
		class349.method6551(var0, var1, var2);
	}

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "809007645"
	)
	static final void method5941() {
		boolean var0 = false;

		while (!var0) {
			var0 = true;

			for (int var1 = 0; var1 < Client.menuOptionsCount - 1; ++var1) {
				if (Client.menuOpcodes[var1] < 1000 && Client.menuOpcodes[var1 + 1] > 1000) {
					String var2 = Client.menuTargets[var1];
					Client.menuTargets[var1] = Client.menuTargets[var1 + 1];
					Client.menuTargets[var1 + 1] = var2;
					String var3 = Client.menuActions[var1];
					Client.menuActions[var1] = Client.menuActions[var1 + 1];
					Client.menuActions[var1 + 1] = var3;
					int var4 = Client.menuOpcodes[var1];
					Client.menuOpcodes[var1] = Client.menuOpcodes[var1 + 1];
					Client.menuOpcodes[var1 + 1] = var4;
					var4 = Client.menuArguments1[var1];
					Client.menuArguments1[var1] = Client.menuArguments1[var1 + 1];
					Client.menuArguments1[var1 + 1] = var4;
					var4 = Client.menuArguments2[var1];
					Client.menuArguments2[var1] = Client.menuArguments2[var1 + 1];
					Client.menuArguments2[var1 + 1] = var4;
					var4 = Client.menuIdentifiers[var1];
					Client.menuIdentifiers[var1] = Client.menuIdentifiers[var1 + 1];
					Client.menuIdentifiers[var1 + 1] = var4;
					var4 = Client.menuItemIds[var1];
					Client.menuItemIds[var1] = Client.menuItemIds[var1 + 1];
					Client.menuItemIds[var1 + 1] = var4;
					var4 = Client.field677[var1];
					Client.field677[var1] = Client.field677[var1 + 1];
					Client.field677[var1 + 1] = var4;
					boolean var5 = Client.menuShiftClick[var1];
					Client.menuShiftClick[var1] = Client.menuShiftClick[var1 + 1];
					Client.menuShiftClick[var1 + 1] = var5;
					var0 = false;
				}
			}
		}

	}
}
