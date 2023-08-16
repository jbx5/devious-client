import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("un")
@Implements("ActorSpotAnim")
public class ActorSpotAnim extends Node {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1497946409
	)
	@Export("spotAnimation")
	public int spotAnimation;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1077656493
	)
	@Export("spotAnimationFrame")
	public int spotAnimationFrame;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1838606277
	)
	@Export("spotAnimationFrameCycle")
	public int spotAnimationFrameCycle;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1858367289
	)
	public int field5255;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -566589701
	)
	@Export("spotAnimationHeight")
	public int spotAnimationHeight;

	public ActorSpotAnim(int var1, int var2, int var3, int var4) {
		this.spotAnimation = -1;
		this.spotAnimationFrame = 0;
		this.spotAnimationFrameCycle = 0;
		this.field5255 = 0;
		this.spotAnimationHeight = 0;
		this.spotAnimation = var1;
		this.spotAnimationHeight = var2;
		this.field5255 = var3;
		this.spotAnimationFrame = var4;
	}
}
