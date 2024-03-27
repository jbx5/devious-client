import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kv")
public class class277 {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1100536913
	)
	static int field3054;

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "54"
	)
	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.ids.length; ++var2) {
				var1.ids[var2] = -1;
				var1.quantities[var2] = 0;
			}

		}
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "654050748"
	)
	static final void method5591() {
		class1.method7(MusicPatchPcmStream.field3573, Interpreter.field879, ReflectionCheck.field244);
		class180.method3594(FriendsList.field4774, class344.field3667);
		if (WorldMapLabelSize.cameraX == MusicPatchPcmStream.field3573 && Interpreter.field879 == MouseHandler.cameraY && class193.cameraZ == ReflectionCheck.field244 && FriendsList.field4774 == UserComparator10.cameraPitch && class17.cameraYaw == class344.field3667) {
			Client.field626 = false;
			Client.isCameraLocked = false;
			Client.field603 = false;
			Client.field774 = false;
			Skeleton.field2633 = 0;
			class91.field1119 = 0;
			HttpMethod.field38 = 0;
			class440.field4745 = 0;
			CollisionMap.field2445 = 0;
			HttpResponse.field91 = 0;
			Renderable.field2716 = 0;
			class315.field3463 = 0;
			class150.field1714 = 0;
			Actor.field1276 = 0;
			Client.field776 = null;
			Client.field778 = null;
			Client.field777 = null;
		}

	}

	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "(IIIILvg;Lmu;I)V",
		garbageValue = "880361217"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) {
			int var6 = Client.camAngleY & 2047;
			int var7 = var3 * var3 + var2 * var2;
			if (var7 <= 6400) {
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6];
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6];
				int var10 = var9 * var2 + var3 * var8 >> 16;
				int var11 = var3 * var9 - var8 * var2 >> 16;
				if (var7 > 2500) {
					var4.method9820(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths);
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2);
				}

			}
		}
	}
}
