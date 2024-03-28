import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("vp")
@Implements("ActorSpotAnim")
public class ActorSpotAnim extends Node {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1918920057
	)
	@Export("spotAnimation")
	public int spotAnimation;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1229042113
	)
	@Export("spotAnimationFrame")
	public int spotAnimationFrame;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1159683041
	)
	@Export("spotAnimationFrameCycle")
	public int spotAnimationFrameCycle;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1896733747
	)
	public int field5381;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1423989453
	)
	@Export("spotAnimationHeight")
	public int spotAnimationHeight;

	public ActorSpotAnim(int var1, int var2, int var3, int var4) {
		this.spotAnimation = -1;
		this.spotAnimationFrame = 0;
		this.spotAnimationFrameCycle = 0;
		this.field5381 = 0;
		this.spotAnimationHeight = 0;
		this.spotAnimation = var1;
		this.spotAnimationHeight = var2;
		this.field5381 = var3;
		this.spotAnimationFrame = var4;
	}
}
