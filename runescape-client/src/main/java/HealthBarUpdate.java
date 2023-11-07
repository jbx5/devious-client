import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1554126669
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 382633399
	)
	@Export("health")
	int health;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -799727255
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 2048455369
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "857709911"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Ldt;",
		garbageValue = "-1907419429"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class47.archive12.takeFile(var0, 0);
			if (var2 == null) {
				return null;
			} else {
				var1 = NpcOverrides.newScript(var2);
				Script.Script_cached.put(var1, (long)var0);
				return var1;
			}
		}
	}
}
