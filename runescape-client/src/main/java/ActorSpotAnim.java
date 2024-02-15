import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("vh")
@Implements("ActorSpotAnim")
public class ActorSpotAnim extends Node {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 220726741
	)
	@Export("spotAnimation")
	public int spotAnimation;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 2061168829
	)
	@Export("spotAnimationFrame")
	public int spotAnimationFrame;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1264623769
	)
	@Export("spotAnimationFrameCycle")
	public int spotAnimationFrameCycle;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1679217923
	)
	public int field5351;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 607949201
	)
	@Export("spotAnimationHeight")
	public int spotAnimationHeight;

	public ActorSpotAnim(int var1, int var2, int var3, int var4) {
		this.spotAnimation = -1;
		this.spotAnimationFrame = 0;
		this.spotAnimationFrameCycle = 0;
		this.field5351 = 0;
		this.spotAnimationHeight = 0;
		this.spotAnimation = var1;
		this.spotAnimationHeight = var2;
		this.field5351 = var3;
		this.spotAnimationFrame = var4;
	}
}
