import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ltx;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("al")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("aj")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32);
	}

	ItemContainer() {
		this.ids = new int[]{-1};
		this.quantities = new int[]{0};
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lor;Lor;ZLqb;B)V",
		garbageValue = "-97"
	)
	public static void method2314(AbstractArchive var0, AbstractArchive var1, boolean var2, Font var3) {
		ItemComposition.ItemDefinition_archive = var0;
		ItemComposition.ItemDefinition_modelArchive = var1;
		WorldMapCacheName.ItemDefinition_inMembersWorld = var2;
		class157.ItemDefinition_fileCount = ItemComposition.ItemDefinition_archive.getGroupFileCount(10);
		VarbitComposition.ItemDefinition_fontPlain11 = var3;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "56"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
	}

	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "-1780844085"
	)
	static final void method2304(int var0, int var1, int var2, boolean var3) {
		if (AsyncRestClient.widgetDefinition.loadInterface(var0)) {
			HitSplatDefinition.resizeInterface(AsyncRestClient.widgetDefinition.Widget_interfaceComponents[var0], -1, var1, var2, var3);
		}
	}

	@ObfuscatedName("ou")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "50913129"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		Iterator var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next();
			var1.clearIsFromIgnored();
		}

		if (class108.friendsChat != null) {
			class108.friendsChat.invalidateIgnoreds();
		}

	}
}
