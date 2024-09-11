import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("archive8")
	static Archive archive8;
	@ObfuscatedName("qu")
	@ObfuscatedSignature(
		descriptor = "Luf;"
	)
	static class532 field477;

	ApproximateRouteStrategy() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIILkd;I)Z",
		garbageValue = "-1508153235"
	)
	@Export("hasArrived")
	protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)Lct;",
		garbageValue = "1"
	)
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0);
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "231879379"
	)
	static final int method1255() {
		if (class461.clientPreferences.isRoofsHidden()) {
			return ClientPreferences.topLevelWorldView.plane;
		} else {
			int var0 = VarcInt.getTileHeight(ClientPreferences.topLevelWorldView, class301.cameraX, class33.cameraZ, ClientPreferences.topLevelWorldView.plane);
			return var0 - ArchiveLoader.cameraY < 800 && (ClientPreferences.topLevelWorldView.tileSettings[ClientPreferences.topLevelWorldView.plane][class301.cameraX >> 7][class33.cameraZ >> 7] & 4) != 0 ? ClientPreferences.topLevelWorldView.plane : 3;
		}
	}
}
