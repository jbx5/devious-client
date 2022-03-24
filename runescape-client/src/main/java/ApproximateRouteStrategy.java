import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bg")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("dt")
	@ObfuscatedSignature(descriptor = 
	"Lnj;")

	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("hl")
	@ObfuscatedGetter(intValue = 
	-1234921851)

	@Export("baseX")
	static int baseX;

	ApproximateRouteStrategy() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(IIILgf;I)Z", garbageValue = 
	"-2070013036")

	@Export("hasArrived")
	protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return (var2 == super.approxDestinationX) && (var3 == super.approxDestinationY);
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(descriptor = 
	"(IIIIB)V", garbageValue = 
	"-22")

	@Export("selectSpell")
	static void selectSpell(int var0, int var1, int var2, int var3) {
		Widget var4 = class143.getWidgetChild(var0, var1);
		if ((var4 != null) && (var4.onTargetEnter != null)) {
			ScriptEvent var5 = new ScriptEvent();
			var5.widget = var4;
			var5.args = var4.onTargetEnter;
			class1.runScriptEvent(var5);
		}

		Client.field688 = var3;
		Client.isSpellSelected = true;
		class92.selectedSpellWidget = var0;
		Client.selectedSpellChildIndex = var1;
		class154.selectedSpellFlags = var2;
		class290.invalidateWidget(var4);
	}
}