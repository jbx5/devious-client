import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1945940723
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1142179225
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -582057783
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1246959339
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1490913279
	)
	@Export("itemId")
	int itemId;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1628070977
	)
	int field927;
	@ObfuscatedName("at")
	@Export("action")
	String action;
	@ObfuscatedName("ab")
	@Export("target")
	String target;

	MenuAction() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([Lpc;II)Lpc;",
		garbageValue = "1371550504"
	)
	@Export("findEnumerated")
	public static Enum findEnumerated(Enum[] var0, int var1) {
		Enum[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Enum var4 = var2[var3];
			if (var1 == var4.rsOrdinal()) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-92"
	)
	static int method2118(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1;
		}
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(Ldt;IIIB)V",
		garbageValue = "2"
	)
	static final void method2115(class101 var0, int var1, int var2, int var3) {
		if (var1 >= 128 && var2 >= 128 && var1 <= 13056 && var2 <= 13056) {
			int var4 = SoundSystem.method856(var0, var1, var2, var0.field1348) - var3;
			var1 -= PlayerComposition.cameraX;
			var4 -= class171.cameraY;
			var2 -= UserComparator4.cameraZ;
			int var5 = Rasterizer3D.Rasterizer3D_sine[Actor.cameraPitch];
			int var6 = Rasterizer3D.Rasterizer3D_cosine[Actor.cameraPitch];
			int var7 = Rasterizer3D.Rasterizer3D_sine[class206.cameraYaw];
			int var8 = Rasterizer3D.Rasterizer3D_cosine[class206.cameraYaw];
			int var9 = var7 * var2 + var8 * var1 >> 16;
			var2 = var8 * var2 - var7 * var1 >> 16;
			var1 = var9;
			var9 = var6 * var4 - var5 * var2 >> 16;
			var2 = var5 * var4 + var6 * var2 >> 16;
			if (var2 >= 50) {
				Client.field643 = Client.viewportWidth / 2 + Client.viewportZoom * var1 / var2;
				Client.field528 = Client.viewportHeight / 2 + var9 * Client.viewportZoom / var2;
			} else {
				Client.field643 = -1;
				Client.field528 = -1;
			}

		} else {
			Client.field643 = -1;
			Client.field528 = -1;
		}
	}

	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1714210082"
	)
	static final void method2116(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0;
		int var7 = var3 - var1;
		int var8 = var6 >= 0 ? var6 : -var6;
		int var9 = var7 >= 0 ? var7 : -var7;
		int var10 = var8;
		if (var8 < var9) {
			var10 = var9;
		}

		if (var10 != 0) {
			int var11 = (var6 << 16) / var10;
			int var12 = (var7 << 16) / var10;
			if (var12 <= var11) {
				var11 = -var11;
			} else {
				var12 = -var12;
			}

			int var13 = var5 * var12 >> 17;
			int var14 = var5 * var12 + 1 >> 17;
			int var15 = var5 * var11 >> 17;
			int var16 = var5 * var11 + 1 >> 17;
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart;
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart;
			int var17 = var0 + var13;
			int var18 = var0 - var14;
			int var19 = var0 + var6 - var14;
			int var20 = var0 + var6 + var13;
			int var21 = var15 + var1;
			int var22 = var1 - var16;
			int var23 = var7 + var1 - var16;
			int var24 = var7 + var15 + var1;
			Rasterizer3D.method4678(var17, var18, var19);
			Rasterizer3D.rasterFlat(var21, var22, var23, var17, var18, var19, 0.0F, 0.0F, 0.0F, var4);
			Rasterizer3D.method4678(var17, var19, var20);
			Rasterizer3D.rasterFlat(var21, var23, var24, var17, var19, var20, 0.0F, 0.0F, 0.0F, var4);
		}
	}
}
