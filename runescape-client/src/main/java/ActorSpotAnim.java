import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("vk")
@Implements("ActorSpotAnim")
public class ActorSpotAnim extends Node {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1566109155
	)
	@Export("spotAnimation")
	public int spotAnimation;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1100832115
	)
	@Export("spotAnimationFrame")
	public int spotAnimationFrame;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 262043567
	)
	@Export("spotAnimationFrameCycle")
	public int spotAnimationFrameCycle;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1350563419
	)
	public int field5282;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1065357447
	)
	@Export("spotAnimationHeight")
	public int spotAnimationHeight;

	public ActorSpotAnim(int var1, int var2, int var3, int var4) {
		this.spotAnimation = -1;
		this.spotAnimationFrame = 0;
		this.spotAnimationFrameCycle = 0;
		this.field5282 = 0;
		this.spotAnimationHeight = 0;
		this.spotAnimation = var1;
		this.spotAnimationHeight = var2;
		this.field5282 = var3;
		this.spotAnimationFrame = var4;
	}
}
