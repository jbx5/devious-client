import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("vq")
@Implements("ActorSpotAnim")
public class ActorSpotAnim extends Node {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1622206421
	)
	@Export("spotAnimation")
	public int spotAnimation;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1020739807
	)
	@Export("spotAnimationFrame")
	public int spotAnimationFrame;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1063799487
	)
	@Export("spotAnimationFrameCycle")
	public int spotAnimationFrameCycle;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 599527147
	)
	public int field5322;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1171465183
	)
	@Export("spotAnimationHeight")
	public int spotAnimationHeight;

	public ActorSpotAnim(int var1, int var2, int var3, int var4) {
		this.spotAnimation = -1;
		this.spotAnimationFrame = 0;
		this.spotAnimationFrameCycle = 0;
		this.field5322 = 0;
		this.spotAnimationHeight = 0;
		this.spotAnimation = var1;
		this.spotAnimationHeight = var2;
		this.field5322 = var3;
		this.spotAnimationFrame = var4;
	}
}
