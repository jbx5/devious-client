import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
public class class224 extends class230 {
	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;
	@ObfuscatedName("ap")
	String field2410;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	final class227 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lik;Ljava/lang/String;Ljava/lang/String;)V"
	)
	class224(class227 var1, String var2, String var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field2410 = var3;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "780036752"
	)
	public int vmethod4660() {
		return 1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "10"
	)
	public String vmethod4649() {
		return this.field2410;
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(Ldn;IIII)V",
		garbageValue = "80789922"
	)
	@Export("updateItemPile2")
	static final void updateItemPile2(WorldView var0, int var1, int var2, int var3) {
		NodeDeque var4 = var0.groundItems[var1][var2][var3];
		if (var4 == null) {
			var0.scene.removeGroundItemPile(var1, var2, var3);
		} else {
			long var5 = -99999999L;
			TileItem var7 = null;

			TileItem var8;
			for (var8 = (TileItem)var4.last(); var8 != null; var8 = (TileItem)var4.previous()) {
				ItemComposition var9 = Bounds.ItemDefinition_get(var8.id);
				long var13 = (long)var9.price;
				if (var9.isStackable == 1) {
					var13 *= var8.quantity < Integer.MAX_VALUE ? (long)(var8.quantity + 1) : (long)var8.quantity;
				}

				if (var13 > var5) {
					var5 = var13;
					var7 = var8;
				}
			}

			if (var7 == null) {
				var0.scene.removeGroundItemPile(var1, var2, var3);
			} else {
				var4.addLast(var7);
				TileItem var15 = null;
				TileItem var10 = null;

				for (var8 = (TileItem)var4.last(); var8 != null; var8 = (TileItem)var4.previous()) {
					if (var8.id != var7.id) {
						if (var15 == null) {
							var15 = var8;
						}

						if (var15.id != var8.id && var10 == null) {
							var10 = var8;
						}
					}
				}

				long var11 = class140.calculateTag(var2, var3, 3, false, 0, var0.id);
				var0.scene.newGroundItemPile(var1, var2, var3, ScriptFrame.getTileHeight(var0, Coord.method6854(var2), Coord.method6854(var3), var1), var7, var11, var15, var10);
			}
		}
	}
}
