import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ub")
@Implements("ActorSpotAnim")
public class ActorSpotAnim extends Node {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -612381941
	)
	@Export("spotAnimation")
	public int spotAnimation;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -870530801
	)
	@Export("spotAnimationFrame")
	public int spotAnimationFrame;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -582766971
	)
	@Export("spotAnimationFrameCycle")
	public int spotAnimationFrameCycle;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 2049038359
	)
	public int field5221;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 48709451
	)
	@Export("spotAnimationHeight")
	public int spotAnimationHeight;

	public ActorSpotAnim(int var1, int var2, int var3, int var4) {
		this.spotAnimation = -1;
		this.spotAnimationFrame = 0;
		this.spotAnimationFrameCycle = 0;
		this.field5221 = 0;
		this.spotAnimationHeight = 0;
		this.spotAnimation = var1;
		this.spotAnimationHeight = var2;
		this.field5221 = var3;
		this.spotAnimationFrame = var4;
	}
}
