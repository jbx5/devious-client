import java.util.concurrent.locks.ReentrantLock;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bh")
public class class47 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lco;"
	)
	VorbisSample field328;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lbr;"
	)
	RawSound field329;
	@ObfuscatedName("al")
	ReentrantLock field330;

	@ObfuscatedSignature(
		descriptor = "(Lco;Lbr;)V"
	)
	class47(VorbisSample var1, RawSound var2) {
		this.field328 = var1;
		this.field329 = var2;
		this.field330 = new ReentrantLock();
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(Ldz;I)V",
		garbageValue = "-1988199799"
	)
	static final void method841(Actor var0) {
		int var1 = Math.max(1, var0.spotAnimation - Client.cycle);
		int var2 = var0.field1257 * 128 + var0.field1212 * 64;
		int var3 = var0.field1259 * 128 + var0.field1212 * 64;
		var0.x += (var2 - var0.x) / var1;
		var0.y += (var3 - var0.y) / var1;
		var0.field1279 = 0;
		var0.orientation = var0.field1223;
	}

	@ObfuscatedName("nv")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldm;",
		garbageValue = "473319212"
	)
	@Export("openInterface")
	static final InterfaceParent openInterface(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent();
		var3.group = var1;
		var3.type = var2;
		Client.interfaceParents.put(var3, (long)var0);
		TaskHandler.method4199(var1);
		Widget var4 = ArchiveLoader.widgetDefinition.method6431(var0);
		UserComparator5.invalidateWidget(var4);
		if (Client.meslayerContinueWidget != null) {
			UserComparator5.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		class167.revalidateWidgetScroll(ArchiveLoader.widgetDefinition.Widget_interfaceComponents[var0 >> 16], var4, false);
		User.runWidgetOnLoadListener(var1);
		if (Client.rootInterface != -1) {
			Canvas.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3;
	}
}
