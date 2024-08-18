import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1198672751
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -2085578993
	)
	@Export("health")
	int health;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1298372681
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1615322527
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-33"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2099517514"
	)
	public static int method2581(int var0, int var1) {
		int var2;
		for (var2 = 0; var1 > 0; --var1) {
			var2 = var2 << 1 | var0 & 1;
			var0 >>>= 1;
		}

		return var2;
	}

	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1962568100"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (FloorUnderlayDefinition.widgetDefinition.loadInterface(var0)) {
			class105.runComponentCloseListeners(FloorUnderlayDefinition.widgetDefinition.Widget_interfaceComponents[var0], var1);
		}
	}
}
