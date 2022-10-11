import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ne")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("c")
	boolean field4339;
	@ObfuscatedName("p")
	boolean field4340;

	Friend() {
	} // L: 9

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lne;I)I",
		garbageValue = "596588464"
	)
	@Export("compareToFriend")
	int compareToFriend(Friend var1) {
		if (super.world == Client.worldId && Client.worldId != var1.world) { // L: 12
			return -1;
		} else if (Client.worldId == var1.world && super.world != Client.worldId) { // L: 13
			return 1;
		} else if (super.world != 0 && var1.world == 0) { // L: 14
			return -1;
		} else if (var1.world != 0 && super.world == 0) { // L: 15
			return 1;
		} else if (this.field4339 && !var1.field4339) { // L: 16
			return -1;
		} else if (!this.field4339 && var1.field4339) {
			return 1; // L: 17
		} else if (this.field4340 && !var1.field4340) { // L: 18
			return -1;
		} else if (!this.field4340 && var1.field4340) { // L: 19
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2; // L: 20 21 24
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lnc;I)I",
		garbageValue = "-1401768476"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareToFriend((Friend)var1); // L: 29
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1); // L: 33
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2137951637"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[Tiles.Client_plane][var0][var1]; // L: 7754
		if (var2 == null) { // L: 7755
			MusicPatchNode.scene.removeGroundItemPile(Tiles.Client_plane, var0, var1); // L: 7756
		} else {
			long var3 = -99999999L; // L: 7759
			TileItem var5 = null; // L: 7760

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 7761 7762 7770
				ItemComposition var7 = UserComparator3.ItemDefinition_get(var6.id); // L: 7763
				long var11 = (long)var7.price; // L: 7764
				if (var7.isStackable == 1) {
					var11 *= (long)(var6.quantity + 1); // L: 7765
				}

				if (var11 > var3) { // L: 7766
					var3 = var11; // L: 7767
					var5 = var6; // L: 7768
				}
			}

			if (var5 == null) { // L: 7772
				MusicPatchNode.scene.removeGroundItemPile(Tiles.Client_plane, var0, var1); // L: 7773
			} else {
				var2.addLast(var5); // L: 7776
				TileItem var13 = null; // L: 7777
				TileItem var8 = null; // L: 7778

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 7779 7780 7785
					if (var6.id != var5.id) { // L: 7781
						if (var13 == null) { // L: 7782
							var13 = var6;
						}

						if (var13.id != var6.id && var8 == null) { // L: 7783
							var8 = var6;
						}
					}
				}

				long var9 = class259.calculateTag(var0, var1, 3, false, 0); // L: 7787
				MusicPatchNode.scene.newGroundItemPile(Tiles.Client_plane, var0, var1, class120.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, Tiles.Client_plane), var5, var9, var13, var8); // L: 7788
			}
		}
	} // L: 7757 7774 7789
}
