import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
public class class224 extends class230 {
	@ObfuscatedName("ub")
	@ObfuscatedGetter(
		intValue = -1098610841
	)
	static int field2411;
	@ObfuscatedName("ac")
	String field2413;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	final class227 this$0;

	@ObfuscatedSignature(
		descriptor = "(Liy;Ljava/lang/String;Ljava/lang/String;)V"
	)
	class224(class227 var1, String var2, String var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field2413 = var3;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-24"
	)
	public int vmethod4613() {
		return 1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "27837050"
	)
	public String vmethod4614() {
		return this.field2413;
	}

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIZI)V",
		garbageValue = "-1601450121"
	)
	@Export("addTileItemToGroundItems")
	static void addTileItemToGroundItems(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		TileItem var10 = new TileItem();
		var10.id = var3;
		var10.quantity = var4;
		var10.setFlag(var5);
		var10.visibleTime = Client.serverCycle + var6;
		var10.despawnTime = var7 + Client.serverCycle;
		var10.ownership = var8;
		var10.isPrivate = var9;
		if (class162.worldView.groundItems[var0][var1][var2] == null) {
			class162.worldView.groundItems[var0][var1][var2] = new NodeDeque();
		}

		class162.worldView.groundItems[var0][var1][var2].addFirst(var10);
		class537.updateItemPile(var0, var1, var2);
	}
}
