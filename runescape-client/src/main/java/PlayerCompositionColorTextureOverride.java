import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
@Implements("PlayerCompositionColorTextureOverride")
public class PlayerCompositionColorTextureOverride {
	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	static Archive field1832;
	@ObfuscatedName("al")
	@Export("playerCompositionRecolorTo")
	public short[] playerCompositionRecolorTo;
	@ObfuscatedName("ai")
	@Export("playerCompositionRetextureTo")
	public short[] playerCompositionRetextureTo;

	public PlayerCompositionColorTextureOverride(int var1) {
		ItemComposition var2 = ArchiveDiskActionHandler.ItemDefinition_get(var1);
		if (var2.method3983()) {
			this.playerCompositionRecolorTo = new short[var2.recolorTo.length];
			System.arraycopy(var2.recolorTo, 0, this.playerCompositionRecolorTo, 0, this.playerCompositionRecolorTo.length);
		}

		if (var2.method3984()) {
			this.playerCompositionRetextureTo = new short[var2.retextureTo.length];
			System.arraycopy(var2.retextureTo, 0, this.playerCompositionRetextureTo, 0, this.playerCompositionRetextureTo.length);
		}

	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIS)Z",
		garbageValue = "5801"
	)
	static boolean method3523(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var8;
		if (var5 == class371.field4333.field4331) {
			BoundaryObject var7 = Actor.scene.method5463(var0, var1, var2);
			if (var7 != null) {
				var8 = Message.Entity_unpackID(var7.tag);
				if (var3 == WorldMapDecorationType.field3931.id) {
					var7.renderable1 = new DynamicObject(var8, 2, var4 + 4, var0, var1, var2, var6, false, var7.renderable1);
					var7.renderable2 = new DynamicObject(var8, 2, var4 + 1 & 3, var0, var1, var2, var6, false, var7.renderable2);
				} else {
					var7.renderable1 = new DynamicObject(var8, var3, var4, var0, var1, var2, var6, false, var7.renderable1);
				}

				return true;
			}
		} else if (var5 == class371.field4332.field4331) {
			WallDecoration var9 = Actor.scene.method5443(var0, var1, var2);
			if (var9 != null) {
				var8 = Message.Entity_unpackID(var9.tag);
				if (var3 != WorldMapDecorationType.field3932.id && var3 != WorldMapDecorationType.field3915.id) {
					if (var3 == WorldMapDecorationType.field3927.id) {
						var9.renderable1 = new DynamicObject(var8, 4, var4 + 4, var0, var1, var2, var6, false, var9.renderable1);
					} else if (var3 == WorldMapDecorationType.field3930.id) {
						var9.renderable1 = new DynamicObject(var8, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var9.renderable1);
					} else if (var3 == WorldMapDecorationType.field3918.id) {
						var9.renderable1 = new DynamicObject(var8, 4, var4 + 4, var0, var1, var2, var6, false, var9.renderable1);
						var9.renderable2 = new DynamicObject(var8, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var9.renderable2);
					}
				} else {
					var9.renderable1 = new DynamicObject(var8, 4, var4, var0, var1, var2, var6, false, var9.renderable1);
				}

				return true;
			}
		} else if (var5 == class371.field4329.field4331) {
			GameObject var10 = Actor.scene.getGameObject(var0, var1, var2);
			if (var3 == WorldMapDecorationType.field3912.id) {
				var3 = WorldMapDecorationType.field3929.id;
			}

			if (var10 != null) {
				var10.renderable = new DynamicObject(Message.Entity_unpackID(var10.tag), var3, var4, var0, var1, var2, var6, false, var10.renderable);
				return true;
			}
		} else if (var5 == class371.field4330.field4331) {
			FloorDecoration var11 = Actor.scene.getFloorDecoration(var0, var1, var2);
			if (var11 != null) {
				var11.renderable = new DynamicObject(Message.Entity_unpackID(var11.tag), 22, var4, var0, var1, var2, var6, false, var11.renderable);
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "60"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		ClanChannelMember.scrollBarSprites[0].drawAt(var0, var1);
		ClanChannelMember.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field605);
		int var5 = var3 * (var3 - 32) / var4;
		if (var5 < 8) {
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field609);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field667);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field667);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field667);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field667);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field618);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field618);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var5 + var6 + var1 + 15, 16, Client.field618);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var5 + var6 + var1 + 14, 15, Client.field618);
	}
}
