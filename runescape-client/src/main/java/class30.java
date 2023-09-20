import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("be")
public class class30 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("FloorOverlayDefinition_archive")
	static AbstractArchive FloorOverlayDefinition_archive;

	static {
		ImageIO.setUseCache(false);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)[Lnq;",
		garbageValue = "-42"
	)
	static class360[] method445() {
		return new class360[]{class360.field3904, class360.field3906};
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ltp;ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "42"
	)
	static String method448(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) {
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode)var0.get((long)var1);
			return var3 == null ? var2 : (String)var3.obj;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[Lsz;",
		garbageValue = "-651272604"
	)
	static class468[] method449() {
		return new class468[]{class468.field4805, class468.field4811, class468.field4806, class468.field4808};
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZI)I",
		garbageValue = "2111489575"
	)
	static int method447(int var0, Script var1, boolean var2) {
		Widget var3 = class33.widgetDefinition.method6240(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETX) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETY) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "106"
	)
	static void method446() {
		if (class434.worldMap != null) {
			class434.worldMap.method8664(class87.Client_plane, class20.baseX * 64 + (TextureProvider.localPlayer.x >> 7), class19.baseY * 64 + (TextureProvider.localPlayer.y >> 7), false);
			class434.worldMap.loadCache();
		}

	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1209602899"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[class87.Client_plane][var0][var1];
		if (var2 == null) {
			class10.scene.removeGroundItemPile(class87.Client_plane, var0, var1);
		} else {
			long var3 = -99999999L;
			TileItem var5 = null;

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
				ItemComposition var7 = class214.ItemDefinition_get(var6.id);
				long var11 = (long)var7.price;
				if (var7.isStackable == 1) {
					var11 *= var6.quantity < Integer.MAX_VALUE ? (long)(var6.quantity + 1) : (long)var6.quantity;
				}

				if (var11 > var3) {
					var3 = var11;
					var5 = var6;
				}
			}

			if (var5 == null) {
				class10.scene.removeGroundItemPile(class87.Client_plane, var0, var1);
			} else {
				var2.addLast(var5);
				TileItem var13 = null;
				TileItem var8 = null;

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
					if (var5.id != var6.id) {
						if (var13 == null) {
							var13 = var6;
						}

						if (var6.id != var13.id && var8 == null) {
							var8 = var6;
						}
					}
				}

				long var9 = GrandExchangeOfferAgeComparator.calculateTag(var0, var1, 3, false, 0);
				class10.scene.newGroundItemPile(class87.Client_plane, var0, var1, class115.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, class87.Client_plane), var5, var9, var13, var8);
			}
		}
	}
}
