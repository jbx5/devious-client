import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sl")
@Implements("ActorSpotAnim")
public class ActorSpotAnim extends Node {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 998545925
	)
	@Export("spotAnimation")
	public int spotAnimation;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -222063183
	)
	@Export("spotAnimationFrame")
	public int spotAnimationFrame;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1022819841
	)
	@Export("spotAnimationFrameCycle")
	public int spotAnimationFrameCycle;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1799228407
	)
	public int field4956;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -2060659115
	)
	@Export("spotAnimationHeight")
	public int spotAnimationHeight;

	public ActorSpotAnim(int var1, int var2, int var3, int var4) {
		this.spotAnimation = -1;
		this.spotAnimationFrame = 0;
		this.spotAnimationFrameCycle = 0;
		this.field4956 = 0;
		this.spotAnimationHeight = 0;
		this.spotAnimation = var1;
		this.spotAnimationHeight = var2;
		this.field4956 = var3;
		this.spotAnimationFrame = var4;
	}

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(Ldy;Ldw;IILko;I)V",
		garbageValue = "-1932501381"
	)
	static final void method8769(WorldView var0, Player var1, int var2, int var3, MoveSpeed var4) {
		int var5 = var1.pathX[0];
		int var6 = var1.pathY[0];
		int var7 = var1.transformedSize();
		if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7) {
			if (var2 >= var7 && var2 < 104 - var7 && var3 >= var7 && var3 < 104 - var7) {
				int var8 = Client.field796.method5491(var5, var6, var1.transformedSize(), BuddyRankComparator.method3097(var2, var3), var0.collisionMaps[var1.plane], true, Client.field801, Client.field802);
				if (var8 >= 1) {
					for (int var9 = 0; var9 < var8 - 1; ++var9) {
						var1.method2509(Client.field801[var9], Client.field802[var9], var4);
					}

				}
			}
		}
	}
}
