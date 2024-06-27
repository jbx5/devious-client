import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("sl")
@Implements("ActorSpotAnim")
public class ActorSpotAnim extends Node {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1338996301
	)
	@Export("spotAnimation")
	public int spotAnimation;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 587967313
	)
	@Export("spotAnimationFrame")
	public int spotAnimationFrame;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1227115687
	)
	@Export("spotAnimationFrameCycle")
	public int spotAnimationFrameCycle;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1381954875
	)
	public int field4981;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -598179925
	)
	@Export("spotAnimationHeight")
	public int spotAnimationHeight;

	public ActorSpotAnim(int var1, int var2, int var3, int var4) {
		this.spotAnimation = -1;
		this.spotAnimationFrame = 0;
		this.spotAnimationFrameCycle = 0;
		this.field4981 = 0;
		this.spotAnimationHeight = 0;
		this.spotAnimation = var1;
		this.spotAnimationHeight = var2;
		this.field4981 = var3;
		this.spotAnimationFrame = var4;
	}
}
