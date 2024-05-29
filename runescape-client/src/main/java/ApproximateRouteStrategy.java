import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("gf")
	@ObfuscatedGetter(
		intValue = -1001500755
	)
	@Export("worldPort")
	static int worldPort;
	@ObfuscatedName("qu")
	@ObfuscatedSignature(
		descriptor = "Luj;"
	)
	static class528 field491;

	ApproximateRouteStrategy() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIILir;I)Z",
		garbageValue = "75199510"
	)
	@Export("hasArrived")
	protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1638179273"
	)
	static int method1197(int var0, int var1, int var2) {
		return var0 << 28 | var1 << 14 | var2;
	}

	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2076468216"
	)
	static void method1201(int var0) {
		WorldMapLabelSize.tempMenuAction = new MenuAction();
		WorldMapLabelSize.tempMenuAction.param0 = Client.menuArguments1[var0];
		WorldMapLabelSize.tempMenuAction.param1 = Client.menuArguments2[var0];
		WorldMapLabelSize.tempMenuAction.opcode = Client.menuOpcodes[var0];
		WorldMapLabelSize.tempMenuAction.identifier = Client.menuIdentifiers[var0];
		WorldMapLabelSize.tempMenuAction.itemId = Client.menuItemIds[var0];
		WorldMapLabelSize.tempMenuAction.action = Client.menuActions[var0];
		WorldMapLabelSize.tempMenuAction.target = Client.menuTargets[var0];
		WorldMapLabelSize.tempMenuAction.worldViewId = Client.menuWorldViewIds[var0];
	}
}
