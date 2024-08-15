import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "[Lvc;"
	)
	@Export("mapDotSprites")
	static SpritePixels[] mapDotSprites;
	@ObfuscatedName("vo")
	@ObfuscatedSignature(
		descriptor = "Ldb;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1712066043
	)
	@Export("id")
	int id;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 2041724187
	)
	@Export("quantity")
	int quantity;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 665099435
	)
	@Export("visibleTime")
	int visibleTime;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1428332859
	)
	@Export("despawnTime")
	int despawnTime;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1917896671
	)
	@Export("ownership")
	int ownership;
	@ObfuscatedName("ao")
	@Export("isPrivate")
	boolean isPrivate;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1547851363
	)
	@Export("flag")
	int flag;

	TileItem() {
		this.flag = 31;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2031190108"
	)
	@Export("setFlag")
	void setFlag(int var1) {
		this.flag = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1579309033"
	)
	boolean method2843(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.flag & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lhr;",
		garbageValue = "-1547633874"
	)
	@Export("getModel")
	protected final Model getModel() {
		return Player.ItemDefinition_get(this.id).getModel(this.quantity);
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ILdp;ZI)I",
		garbageValue = "-1356856669"
	)
	static int method2849(int var0, Script var1, boolean var2) {
		if (var0 == 6809) {
			int var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			ObjectComposition var4 = class222.getObjectDefinition(var3);
			Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : "";
			return 1;
		} else {
			return 2;
		}
	}
}
