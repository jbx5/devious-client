import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("ti")
	@ObfuscatedSignature(
		descriptor = "Lbj;"
	)
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1580888811
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -788832115
	)
	@Export("health")
	int health;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1410048185
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1022084677
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-228574189"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}
}
