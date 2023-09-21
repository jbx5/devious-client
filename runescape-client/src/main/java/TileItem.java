import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -360024201
	)
	@Export("id")
	int id;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1723938877
	)
	@Export("quantity")
	int quantity;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -94687907
	)
	int field1356;

	TileItem() {
		this.field1356 = 31;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	void method2724(int var1) {
		this.field1356 = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Ljn;",
		garbageValue = "0"
	)
	@Export("getModel")
	protected final Model getModel() {
		return class214.ItemDefinition_get(this.id).getModel(this.quantity);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "60"
	)
	boolean method2726(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1356 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lfz;FFFFFFFFI)V",
		garbageValue = "262393745"
	)
	static void method2727(class132 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
		if (var0 != null) {
			var0.field1543 = var1;
			float var9 = var4 - var1;
			float var10 = var8 - var5;
			float var11 = var2 - var1;
			float var12 = 0.0F;
			float var13 = 0.0F;
			if ((double)var11 != 0.0D) {
				var12 = (var6 - var5) / var11;
			}

			var11 = var4 - var3;
			if (0.0D != (double)var11) {
				var13 = (var8 - var7) / var11;
			}

			float var14 = 1.0F / (var9 * var9);
			float var15 = var12 * var9;
			float var16 = var9 * var13;
			var0.field1545 = var14 * (var15 + var16 - var10 - var10) / var9;
			var0.field1546 = (var10 + var10 + var10 - var15 - var15 - var16) * var14;
			var0.field1538 = var12;
			var0.field1542 = var5;
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Liz;I)Z",
		garbageValue = "-966132551"
	)
	static boolean method2730(ObjectComposition var0) {
		if (var0.transforms != null) {
			int[] var1 = var0.transforms;

			for (int var2 = 0; var2 < var1.length; ++var2) {
				int var3 = var1[var2];
				ObjectComposition var4 = class91.getObjectDefinition(var3);
				if (var4.mapIconId != -1) {
					return true;
				}
			}
		} else if (var0.mapIconId != -1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "667275397"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0;
		if (GrandExchangeOfferTotalQuantityComparator.garbageCollector == null || !GrandExchangeOfferTotalQuantityComparator.garbageCollector.isValid()) {
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
					if (var2.isValid()) {
						GrandExchangeOfferTotalQuantityComparator.garbageCollector = var2;
						GameEngine.garbageCollectorLastCheckTimeMs = -1L;
						GameEngine.garbageCollectorLastCollectionTime = -1L;
					}
				}
			} catch (Throwable var11) {
			}
		}

		if (GrandExchangeOfferTotalQuantityComparator.garbageCollector != null) {
			long var9 = GrandExchangeOfferTotalQuantityComparator.method7049();
			long var3 = GrandExchangeOfferTotalQuantityComparator.garbageCollector.getCollectionTime();
			if (GameEngine.garbageCollectorLastCollectionTime != -1L) {
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime;
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs;
				if (0L != var7) {
					var0 = (int)(var5 * 100L / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3;
			GameEngine.garbageCollectorLastCheckTimeMs = var9;
		}

		return var0;
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "901755520"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) {
			NPC var2 = Client.npcs[Client.npcIndices[var1]];
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) {
				int var3 = var2.x >> 7;
				int var4 = var2.y >> 7;
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
					if (var2.field1189 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) {
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) {
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount;
					}

					long var5 = GrandExchangeOfferAgeComparator.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]);
					var2.playerCycle = Client.cycle;
					class10.scene.drawEntity(class87.Client_plane, var2.x, var2.y, class115.getTileHeight(var2.field1189 * 64 - 64 + var2.x, var2.field1189 * 64 - 64 + var2.y, class87.Client_plane), var2.field1189 * 64 - 64 + 60, var2, var2.rotation, var5, var2.isWalking);
				}
			}
		}

	}
}
