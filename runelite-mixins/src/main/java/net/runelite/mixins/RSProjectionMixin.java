package net.runelite.mixins;

import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSProjection;

@Mixin(RSProjection.class)
public abstract class RSProjectionMixin implements RSProjection
{
	@Shadow("client")
	private static RSClient client;

	/*@Copy("drawSceneTilePaint")
	@Replace("drawSceneTilePaint")
	void copy$drawSceneTilePaint(Scene var1, SceneTilePaint var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16)
	{
		try
		{
			kp var18 = js.aa;
			int var19 = var18.aa;
			int var20 = var18.aq;
			int var21 = var18.ap;
			int var22 = var20 + var5 * var19 / var13;
			int var23 = var21 + var9 * var19 / var13;
			int var24 = var20 + var6 * var19 / var14;
			int var25 = var21 + var10 * var19 / var14;
			int var26 = var20 + var7 * var19 / var15;
			int var27 = var21 + var11 * var19 / var15;
			int var28 = var20 + var8 * var19 / var16;
			int var29 = var21 + var12 * var19 / var16;
			float var30 = ja.bg(var13);
			float var31 = ja.bg(var14);
			float var32 = ja.bg(var15);
			float var33 = ja.bg(var16);
			var18.aj = 0;
			rl6 var34 = var1.mz[var1.zk.gp * 1305902891][var3 + var1.tu][var4 + var1.tu];
			int var35;
			int var36;
			if ((var25 - var29) * (var26 - var28) - (var27 - var29) * (var24 - var28) > 0) {
				if (var1.bn && jy.nu(var1.cu, var1.as, var27, var29, var25, var26, var28, var24)) {
					var1.nf(var3, var4);
					if (var1.cu >= ht.bb.getViewportXOffset() && var1.cu < ht.bb.getViewportXOffset() + ht.bb.getViewportWidth() && var1.as >= ht.bb.getViewportYOffset() && var1.as < ht.bb.getViewportYOffset() + ht.bb.getViewportHeight() && var34 != null && var2 == var34.if()) {
						var1.vq(var3, var4, var34.jd());
					}
				}

				if (!ht.bb.isGpu()) {
					var18.ak = false;
					var35 = var18.ae;
					if (var26 < 0 || var28 < 0 || var24 < 0 || var26 > var35 || var28 > var35 || var24 > var35) {
						var18.ak = true;
					}

					if (var2.af * -1479354403 == -1) {
						if (var2.aj * -1859225255 != 12345678) {
							ja.xh(var27, var29, var25, var26, var28, var24, var32, var33, var31, var2.aj * -1859225255, var2.az * 157049983, var2.al * -631865327);
						}
					} else if (!jy.al) {
						if (var2.aa) {
							ja.ev(var27, var29, var25, var26, var28, var24, var32, var33, var31, var2.aj * -1859225255, var2.az * 157049983, var2.al * -631865327, var5, var6, var8, var9, var10, var12, var13, var14, var16, var2.af * -1479354403);
						} else {
							ja.ev(var27, var29, var25, var26, var28, var24, var32, var33, var31, var2.aj * -1859225255, var2.az * 157049983, var2.al * -631865327, var7, var8, var6, var11, var12, var10, var15, var16, var14, var2.af * -1479354403);
						}
					} else {
						var36 = var18.at.rw(var2.af * -1479354403);
						ja.xh(var27, var29, var25, var26, var28, var24, var32, var33, var31, jy.fq(var36, var2.aj * -1859225255), jy.fq(var36, var2.az * 157049983), jy.fq(var36, var2.al * -631865327));
					}
				}
			}

			if ((var29 - var25) * (var22 - var24) - (var23 - var25) * (var28 - var24) > 0) {
				if (var1.bn && jy.nu(var1.cu, var1.as, var23, var25, var29, var22, var24, var28)) {
					var1.nf(var3, var4);
					if (var1.cu >= ht.bb.getViewportXOffset() && var1.cu < ht.bb.getViewportXOffset() + ht.bb.getViewportWidth() && var1.as >= ht.bb.getViewportYOffset() && var1.as < ht.bb.getViewportYOffset() + ht.bb.getViewportHeight() && var34 != null && var2 == var34.if()) {
						var1.vq(var3, var4, var34.jd());
					}
				}

				if (!ht.bb.isGpu()) {
					var18.ak = false;
					var35 = var18.ae;
					if (var22 < 0 || var24 < 0 || var28 < 0 || var22 > var35 || var24 > var35 || var28 > var35) {
						var18.ak = true;
					}

					if (var2.af * -1479354403 == -1) {
						if (var2.ak * 2059256981 != 12345678) {
							ja.xh(var23, var25, var29, var22, var24, var28, var30, var31, var33, var2.ak * 2059256981, var2.al * -631865327, var2.az * 157049983);
						}
					} else if (!jy.al) {
						ja.ev(var23, var25, var29, var22, var24, var28, var30, var31, var33, var2.ak * 2059256981, var2.al * -631865327, var2.az * 157049983, var5, var6, var8, var9, var10, var12, var13, var14, var16, var2.af * -1479354403);
					} else {
						var36 = var18.at.rw(var2.af * -1479354403);
						ja.xh(var23, var25, var29, var22, var24, var28, var30, var31, var33, jy.fq(var36, var2.ak * 2059256981), jy.fq(var36, var2.al * -631865327), jy.fq(var36, var2.az * 157049983));
					}
				}
			}
		}
		catch (Exception var37)
		{
			client.getLogger().warn("error during underlay rendering", var37);
		}
	}*/

	/*@Copy("drawSceneTileModel")
	@Replace("drawSceneTileModel")
	void copy$drawSceneTileModel(Scene scene, SceneTileModel sceneTileModel, int x, int z)
	{
		if (client.getDrawCallbacks() != null)
		{
			client.getDrawCallbacks().drawSceneTileModel(scene, sceneTileModel, x, z);
		}
		copy$drawSceneTileModel(scene, sceneTileModel, x, z);
	}*/
}
