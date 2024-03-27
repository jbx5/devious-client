import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sm")
public abstract class class477 implements class296 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	class522 field4903;

	class477(int var1) {
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;II)V",
		garbageValue = "-470314678"
	)
	abstract void vmethod8516(Buffer var1, int var2);

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lur;B)V",
		garbageValue = "103"
	)
	public void method8515(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			class473 var3 = (class473)KitDefinition.findEnumerated(Friend.method8100(), var2);
			if (var3 != null) {
				switch(var3.field4897) {
				case 0:
					KitDefinition.findEnumerated(class147.method3171(), var1.readUnsignedByte());
					break;
				case 1:
					int var4 = var1.readUnsignedByte();
					this.field4903 = class211.method3931(var4);
					if (this.field4903 != null) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var4);
				case 2:
					var1.readStringCp1252NullCircumfixed();
					break;
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
				}
			} else {
				this.vmethod8516(var1, var2);
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "255316021"
	)
	boolean method8525() {
		return this.field4903 != null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;",
		garbageValue = "-1106969167"
	)
	Object method8517() {
		if (this.field4903 == class522.field5158) {
			return 0;
		} else if (this.field4903 == class522.field5160) {
			return -1L;
		} else {
			return this.field4903 == class522.field5155 ? "" : null;
		}
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-655053707"
	)
	@Export("updateItemPile")
	static void updateItemPile(int var0, int var1, int var2) {
		NodeDeque var3 = Client.groundItems[var0][var1][var2];
		if (var3 == null) {
			LoginType.scene.removeGroundItemPile(var0, var1, var2);
		} else {
			long var4 = -99999999L;
			TileItem var6 = null;

			TileItem var7;
			for (var7 = (TileItem)var3.last(); var7 != null; var7 = (TileItem)var3.previous()) {
				ItemComposition var8 = HttpRequest.ItemDefinition_get(var7.id);
				long var12 = (long)var8.price;
				if (var8.isStackable == 1) {
					var12 *= var7.quantity < Integer.MAX_VALUE ? (long)(var7.quantity + 1) : (long)var7.quantity;
				}

				if (var12 > var4) {
					var4 = var12;
					var6 = var7;
				}
			}

			if (var6 == null) {
				LoginType.scene.removeGroundItemPile(var0, var1, var2);
			} else {
				var3.addLast(var6);
				TileItem var14 = null;
				TileItem var9 = null;

				for (var7 = (TileItem)var3.last(); var7 != null; var7 = (TileItem)var3.previous()) {
					if (var6.id != var7.id) {
						if (var14 == null) {
							var14 = var7;
						}

						if (var14.id != var7.id && var9 == null) {
							var9 = var7;
						}
					}
				}

				long var10 = class154.calculateTag(var1, var2, 3, false, 0);
				LoginType.scene.newGroundItemPile(var0, var1, var2, Canvas.getTileHeight(var1 * 128 + 64, var2 * 128 + 64, var0), var6, var10, var14, var9);
			}
		}
	}
}
