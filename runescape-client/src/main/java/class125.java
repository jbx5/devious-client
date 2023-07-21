import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ev")
public class class125 {
	@ObfuscatedName("ab")
	@Export("ByteArrayPool_altSizeArrayCounts")
	public static int[] ByteArrayPool_altSizeArrayCounts;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 697776475
	)
	int field1483;
	@ObfuscatedName("ay")
	float field1488;
	@ObfuscatedName("ar")
	float field1484;
	@ObfuscatedName("am")
	float field1482;
	@ObfuscatedName("as")
	float field1486;
	@ObfuscatedName("aj")
	float field1487;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	class125 field1485;

	class125() {
		this.field1484 = Float.MAX_VALUE;
		this.field1482 = Float.MAX_VALUE;
		this.field1486 = Float.MAX_VALUE;
		this.field1487 = Float.MAX_VALUE;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;IB)V",
		garbageValue = "25"
	)
	void method2919(Buffer var1, int var2) {
		this.field1483 = var1.readShort();
		this.field1488 = var1.method9094();
		this.field1484 = var1.method9094();
		this.field1482 = var1.method9094();
		this.field1486 = var1.method9094();
		this.field1487 = var1.method9094();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Lhc;",
		garbageValue = "-1218756149"
	)
	@Export("ItemDefinition_get")
	public static ItemComposition ItemDefinition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = Frames.ItemDefinition_archive.takeFile(10, var0);
			var1 = new ItemComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.post();
			if (var1.noteTemplate != -1) {
				var1.genCert(ItemDefinition_get(var1.noteTemplate), ItemDefinition_get(var1.note));
			}

			if (var1.notedId != -1) {
				var1.genBought(ItemDefinition_get(var1.notedId), ItemDefinition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) {
				var1.genPlaceholder(ItemDefinition_get(var1.placeholderTemplate), ItemDefinition_get(var1.placeholder));
			}

			if (!class502.ItemDefinition_inMembersWorld && var1.isMembersOnly) {
				if (var1.noteTemplate == -1 && var1.notedId == -1 && var1.placeholderTemplate == -1) {
					var1.name = var1.name + " (Members)";
				}

				var1.isTradable = false;

				int var3;
				for (var3 = 0; var3 < var1.groundActions.length; ++var3) {
					var1.groundActions[var3] = null;
				}

				for (var3 = 0; var3 < var1.inventoryActions.length; ++var3) {
					if (var3 != 4) {
						var1.inventoryActions[var3] = null;
					}
				}

				var1.shiftClickIndex = -2;
				var1.team = 0;
				if (var1.params != null) {
					boolean var6 = false;

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) {
						ParamComposition var5 = MusicPatchNode.getParamDefinition((int)var4.key);
						if (var5.autoDisable) {
							var4.remove();
						} else {
							var6 = true;
						}
					}

					if (!var6) {
						var1.params = null;
					}
				}
			}

			ItemComposition.ItemDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
