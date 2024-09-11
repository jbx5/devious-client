import java.util.concurrent.locks.ReentrantLock;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bt")
public class class47 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	VorbisSample field317;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lbg;"
	)
	RawSound field318;
	@ObfuscatedName("ag")
	ReentrantLock field316;

	@ObfuscatedSignature(
		descriptor = "(Lcf;Lbg;)V"
	)
	class47(VorbisSample var1, RawSound var2) {
		this.field317 = var1;
		this.field318 = var2;
		this.field316 = new ReentrantLock();
	}

	@ObfuscatedName("ac")
	public static final int method896(double var0, double var2, double var4) {
		double var6 = var4;
		double var8 = var4;
		double var10 = var4;
		if (var2 != 0.0D) {
			double var12;
			if (var4 < 0.5D) {
				var12 = var4 * (var2 + 1.0D);
			} else {
				var12 = var4 + var2 - var4 * var2;
			}

			double var14 = var4 * 2.0D - var12;
			double var16 = 0.3333333333333333D + var0;
			if (var16 > 1.0D) {
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D;
			if (var20 < 0.0D) {
				++var20;
			}

			if (var16 * 6.0D < 1.0D) {
				var6 = var16 * (var12 - var14) * 6.0D + var14;
			} else if (var16 * 2.0D < 1.0D) {
				var6 = var12;
			} else if (var16 * 3.0D < 2.0D) {
				var6 = var14 + (0.6666666666666666D - var16) * (var12 - var14) * 6.0D;
			} else {
				var6 = var14;
			}

			if (var0 * 6.0D < 1.0D) {
				var8 = var0 * 6.0D * (var12 - var14) + var14;
			} else if (var0 * 2.0D < 1.0D) {
				var8 = var12;
			} else if (var0 * 3.0D < 2.0D) {
				var8 = var14 + (0.6666666666666666D - var0) * (var12 - var14) * 6.0D;
			} else {
				var8 = var14;
			}

			if (var20 * 6.0D < 1.0D) {
				var10 = var14 + var20 * 6.0D * (var12 - var14);
			} else if (2.0D * var20 < 1.0D) {
				var10 = var12;
			} else if (var20 * 3.0D < 2.0D) {
				var10 = (var12 - var14) * (0.6666666666666666D - var20) * 6.0D + var14;
			} else {
				var10 = var14;
			}
		}

		int var22 = (int)(var6 * 256.0D);
		int var13 = (int)(256.0D * var8);
		int var23 = (int)(var10 * 256.0D);
		int var15 = var23 + (var13 << 8) + (var22 << 16);
		return var15;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)[Lkx;",
		garbageValue = "331616578"
	)
	static class271[] method895() {
		return new class271[]{class271.field3005, class271.field3010, class271.field3007, class271.field3011, class271.field3009, class271.field3008, class271.field3006};
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1128579249"
	)
	public static void method894() {
		class197.field2022.clear();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Lcr;",
		garbageValue = "-1090907831"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? SoundSystem.World_worlds[++World.World_listCount - 1] : null;
	}
}
