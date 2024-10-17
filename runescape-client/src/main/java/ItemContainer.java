import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("vt")
	@ObfuscatedSignature(
		descriptor = "Lcc;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("aw")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("ak")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32);
	}

	ItemContainer() {
		this.ids = new int[]{-1};
		this.quantities = new int[]{0};
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lpe;II)Z",
		garbageValue = "-1123070579"
	)
	public static boolean method2556(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1);
		if (var2 == null) {
			return false;
		} else {
			ClanChannel.SpriteBuffer_decode(var2);
			return true;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-809723661"
	)
	static final int method2555(int var0, int var1) {
		if (var0 == -1) {
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}
}
