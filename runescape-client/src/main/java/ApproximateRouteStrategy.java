import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("bt")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	ApproximateRouteStrategy() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(IIILgl;B)Z", garbageValue = "57")
	@Export("hasArrived")
	public boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY;
	}

	@ObfuscatedName("ek")
	@ObfuscatedSignature(descriptor = "(Lln;Ljava/lang/String;B)V", garbageValue = "0")
	static void method1070(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1);
		Client.archiveLoaders.add(var2);
		Client.field509 += var2.groupCount;
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(descriptor = "(Lcx;I)V", garbageValue = "574817710")
	static final void method1068(Actor var0) {
		int var1 = Math.max(1, var0.field1182 - Client.cycle);
		int var2 = var0.field1178 * 128 + var0.field1190 * 373555200;
		int var3 = var0.field1127 * 128 + var0.field1190 * 373555200;
		var0.x += (var2 - var0.x) / var1;
		var0.y += (var3 - var0.y) / var1;
		var0.field1200 = 0;
		var0.orientation = var0.field1136;
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1922987723")
	static final void method1065(int var0) {
		if (var0 >= 0) {
			int var1 = Client.menuArguments1[var0];
			int var2 = Client.menuArguments2[var0];
			int var3 = Client.menuOpcodes[var0];
			int var4 = Client.menuIdentifiers[var0];
			int var5 = Client.menuItemIds[var0];
			String var6 = Client.menuActions[var0];
			String var7 = Client.menuTargets[var0];
			class352.menuAction(var1, var2, var3, var4, var5, var6, var7, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
		}
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "-33")
	static void method1069(int var0) {
		if (var0 != Client.loginState) {
			Client.loginState = var0;
		}
	}

	@ObfuscatedName("lr")
	@ObfuscatedSignature(descriptor = "(ZB)V", garbageValue = "55")
	static void method1071(boolean var0) {
		Client.leftClickOpensMenu = var0;
	}
}