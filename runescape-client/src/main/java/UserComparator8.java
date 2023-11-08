import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
	@ObfuscatedName("at")
	@Export("reversed")
	final boolean reversed;

	public UserComparator8(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lrh;Lrh;B)I",
		garbageValue = "118"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world) {
			if (var2.world != Client.worldId) {
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world == Client.worldId) {
			return this.reversed ? 1 : -1;
		}

		return this.compareUser(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(S)[Lfw;",
		garbageValue = "226"
	)
	static class140[] method2955() {
		return new class140[]{class140.field1617, class140.field1608, class140.field1618, class140.field1610, class140.field1611, class140.field1613, class140.field1607, class140.field1614, class140.field1615};
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lol;Lol;I)V",
		garbageValue = "-1842959884"
	)
	public static void method2948(AbstractArchive var0, AbstractArchive var1) {
		SpotAnimationDefinition.SpotAnimationDefinition_archive = var0;
		SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var1;
	}

	@ObfuscatedName("nq")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldc;",
		garbageValue = "853776255"
	)
	@Export("openInterface")
	static final InterfaceParent openInterface(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent();
		var3.group = var1;
		var3.type = var2;
		Client.interfaceParents.put(var3, (long)var0);
		class130.method3095(var1);
		Widget var4 = HealthBarDefinition.widgetDefinition.method6285(var0);
		class159.invalidateWidget(var4);
		if (Client.meslayerContinueWidget != null) {
			class159.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		class132.revalidateWidgetScroll(HealthBarDefinition.widgetDefinition.Widget_interfaceComponents[var0 >> 16], var4, false);
		class106.runWidgetOnLoadListener(var1);
		if (Client.rootInterface != -1) {
			class514.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3;
	}
}
