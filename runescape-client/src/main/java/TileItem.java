import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -2113245633
	)
	@Export("id")
	int id;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1911170797
	)
	@Export("quantity")
	int quantity;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 419336507
	)
	@Export("visibleTime")
	int visibileTime;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 359021447
	)
	@Export("despawnTime")
	int despawnTime;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1547995727
	)
	@Export("ownership")
	int ownership;
	@ObfuscatedName("aa")
	@Export("isPrivate")
	boolean isPrivate;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 238010175
	)
	@Export("flag")
	int flag;

	TileItem() {
		this.flag = 31;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "251603547"
	)
	@Export("setFlag")
	void setFlag(int var1) {
		this.flag = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "57"
	)
	boolean method2759(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.flag & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lkb;",
		garbageValue = "-852782106"
	)
	@Export("getModel")
	protected final Model getModel() {
		return KeyHandler.ItemDefinition_get(this.id).getModel(this.quantity);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/CharSequence;III)Ljava/lang/String;",
		garbageValue = "1549229344"
	)
	public static String method2763(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			CharSequence var10 = var0[var1];
			return var10 == null ? "null" : var10.toString();
		} else {
			int var3 = var2 + var1;
			int var4 = 0;

			for (int var5 = var1; var5 < var3; ++var5) {
				CharSequence var9 = var0[var5];
				if (var9 == null) {
					var4 += 4;
				} else {
					var4 += var9.length();
				}
			}

			StringBuilder var8 = new StringBuilder(var4);

			for (int var6 = var1; var6 < var3; ++var6) {
				CharSequence var7 = var0[var6];
				if (var7 == null) {
					var8.append("null");
				} else {
					var8.append(var7);
				}
			}

			return var8.toString();
		}
	}
}
