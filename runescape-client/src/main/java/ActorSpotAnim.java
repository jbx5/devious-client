import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("vl")
@Implements("ActorSpotAnim")
public class ActorSpotAnim extends Node {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1947242189
	)
	@Export("spotAnimation")
	public int spotAnimation;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1727064211
	)
	@Export("spotAnimationFrame")
	public int spotAnimationFrame;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1606792399
	)
	@Export("spotAnimationFrameCycle")
	public int spotAnimationFrameCycle;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1953475497
	)
	public int field5285;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 777363253
	)
	@Export("spotAnimationHeight")
	public int spotAnimationHeight;

	public ActorSpotAnim(int var1, int var2, int var3, int var4) {
		this.spotAnimation = -1;
		this.spotAnimationFrame = 0;
		this.spotAnimationFrameCycle = 0;
		this.field5285 = 0;
		this.spotAnimationHeight = 0;
		this.spotAnimation = var1;
		this.spotAnimationHeight = var2;
		this.field5285 = var3;
		this.spotAnimationFrame = var4;
	}
}
