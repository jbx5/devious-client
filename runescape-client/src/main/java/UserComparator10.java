import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
@Implements("UserComparator10")
public class UserComparator10 extends AbstractUserComparator {
	@ObfuscatedName("ac")
	@Export("reversed")
	final boolean reversed;

	public UserComparator10(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsq;Lsq;B)I",
		garbageValue = "122"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) {
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "439009622"
	)
	public static void method3226() {
		VarcInt.VarcInt_cached.clear();
	}

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-48"
	)
	static final void method3227(int var0, int var1) {
		if (Client.menu.menuOptionsCount >= 2 || Client.isItemSelected != 0 || Client.isSpellSelected) {
			if (Client.showMouseOverText) {
				int var2 = class537.method9781();
				String var3;
				if (Client.isItemSelected == 1 && Client.menu.menuOptionsCount < 2) {
					var3 = "Use" + " " + Client.field674 + " " + "->";
				} else if (Client.isSpellSelected && Client.menu.menuOptionsCount < 2) {
					var3 = Client.selectedSpellActionName + " " + Client.selectedSpellName + " " + "->";
				} else {
					var3 = Client.menu.method10554(var2);
				}

				if (Client.menu.menuOptionsCount > 2) {
					var3 = var3 + HttpMethod.colorStartTag(16777215) + " " + '/' + " " + (Client.menu.menuOptionsCount - 2) + " more options";
				}

				class33.fontBold12.drawRandomAlphaAndSpacing(var3, var0 + 4, var1 + 15, 16777215, 0, Client.cycle / 1000);
			}
		}
	}

	@ObfuscatedName("oe")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldj;",
		garbageValue = "-1253318947"
	)
	@Export("openInterface")
	static final InterfaceParent openInterface(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent();
		var3.group = var1;
		var3.type = var2;
		Client.interfaceParents.put(var3, (long)var0);
		SpotAnimationDefinition.method4048(var1);
		Widget var4 = TaskHandler.widgetDefinition.method6841(var0);
		SecureRandomCallable.invalidateWidget(var4);
		if (Client.meslayerContinueWidget != null) {
			SecureRandomCallable.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		AsyncHttpResponse.revalidateWidgetScroll(TaskHandler.widgetDefinition.Widget_interfaceComponents[var0 >> 16], var4, false);
		WorldMapEvent.runWidgetOnLoadListener(var1);
		if (Client.rootInterface != -1) {
			class147.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3;
	}
}
