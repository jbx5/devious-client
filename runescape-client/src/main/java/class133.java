import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("ez")
public class class133 extends class128 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 447785145)
	int field1594;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 149851621)
	int field1592;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 1058395113)
	int field1593;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 509471079)
	int field1596;

	@ObfuscatedSignature(descriptor = "Lej;")
	final class131 this$0;

	@ObfuscatedSignature(descriptor = "(Lej;)V")
	class133(class131 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lqt;B)V", garbageValue = "5")
	void vmethod3150(Buffer var1) {
		this.field1594 = var1.readInt();
		this.field1596 = var1.readInt();
		this.field1592 = var1.readUnsignedByte();
		this.field1593 = var1.readUnsignedByte();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Len;I)V", garbageValue = "-1718344311")
	void vmethod3149(ClanSettings var1) {
		var1.method3004(this.field1594, this.field1596, this.field1592, this.field1593);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(Lbc;Lbc;IZI)I", garbageValue = "1196154271")
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) {
			int var4 = var0.population;
			int var5 = var1.population;
			if (!var3) {
				if (var4 == -1) {
					var4 = 2001;
				}
				if (var5 == -1) {
					var5 = 2001;
				}
			}
			return var4 - var5;
		} else if (var2 == 2) {
			return var0.location - var1.location;
		} else if (var2 == 3) {
			if (var0.activity.equals("-")) {
				if (var1.activity.equals("-")) {
					return 0;
				} else {
					return var3 ? -1 : 1;
				}
			} else if (var1.activity.equals("-")) {
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity);
			}
		} else if (var2 == 4) {
			return var0.method1594() ? var1.method1594() ? 0 : 1 : var1.method1594() ? -1 : 0;
		} else if (var2 == 5) {
			return var0.method1628() ? var1.method1628() ? 0 : 1 : var1.method1628() ? -1 : 0;
		} else if (var2 == 6) {
			return var0.isPvp() ? var1.isPvp() ? 0 : 1 : var1.isPvp() ? -1 : 0;
		} else if (var2 == 7) {
			return var0.isMembersOnly() ? var1.isMembersOnly() ? 0 : 1 : var1.isMembersOnly() ? -1 : 0;
		} else {
			return var0.id - var1.id;
		}
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "2144459119")
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[PacketWriter.Client_plane][var0][var1];
		if (var2 == null) {
			class356.scene.removeGroundItemPile(PacketWriter.Client_plane, var0, var1);
		} else {
			long var3 = -99999999L;
			TileItem var5 = null;
			TileItem var6;
			for (var6 = ((TileItem) (var2.last())); var6 != null; var6 = ((TileItem) (var2.previous()))) {
				ItemComposition var7 = EnumComposition.ItemDefinition_get(var6.id);
				long var11 = ((long) (var7.price));
				if (var7.isStackable == 1) {
					var11 *= ((long) (var6.quantity + 1));
				}
				if (var11 > var3) {
					var3 = var11;
					var5 = var6;
				}
			}
			if (var5 == null) {
				class356.scene.removeGroundItemPile(PacketWriter.Client_plane, var0, var1);
			} else {
				var2.addLast(var5);
				TileItem var13 = null;
				TileItem var8 = null;
				for (var6 = ((TileItem) (var2.last())); var6 != null; var6 = ((TileItem) (var2.previous()))) {
					if (var5.id != var6.id) {
						if (var13 == null) {
							var13 = var6;
						}
						if (var6.id != var13.id && var8 == null) {
							var8 = var6;
						}
					}
				}
				long var9 = TaskHandler.calculateTag(var0, var1, 3, false, 0);
				class356.scene.newGroundItemPile(PacketWriter.Client_plane, var0, var1, SceneTilePaint.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, PacketWriter.Client_plane), var5, var9, var13, var8);
			}
		}
	}
}