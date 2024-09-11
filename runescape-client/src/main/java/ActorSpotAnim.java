import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("sc")
@Implements("ActorSpotAnim")
public class ActorSpotAnim extends Node {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1229069603
	)
	@Export("spotAnimation")
	public int spotAnimation;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 757511083
	)
	@Export("spotAnimationFrame")
	public int spotAnimationFrame;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -479461131
	)
	@Export("spotAnimationFrameCycle")
	public int spotAnimationFrameCycle;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 811756247
	)
	public int field5022;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1150161211
	)
	@Export("spotAnimationHeight")
	public int spotAnimationHeight;

	public ActorSpotAnim(int var1, int var2, int var3, int var4) {
		this.spotAnimation = -1;
		this.spotAnimationFrame = 0;
		this.spotAnimationFrameCycle = 0;
		this.field5022 = 0;
		this.spotAnimationHeight = 0;
		this.spotAnimation = var1;
		this.spotAnimationHeight = var2;
		this.field5022 = var3;
		this.spotAnimationFrame = var4;
	}
}
