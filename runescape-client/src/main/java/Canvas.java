import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.awt.Graphics;
import net.runelite.mapping.Implements;
import java.awt.Component;
import net.runelite.mapping.Export;
@ObfuscatedName("m")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("tr")
	@ObfuscatedGetter(intValue = -391673491)
	static int field164;

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "Lql;")
	@Export("logoSprite")
	static IndexedSprite logoSprite;

	@ObfuscatedName("o")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1;
	}

	public final void paint(Graphics var1) {
		this.component.paint(var1);
	}

	public final void update(Graphics var1) {
		this.component.update(var1);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Ldp;FI)F", garbageValue = "-1881283693")
	static float method354(class117 var0, float var1) {
		if (var0 == null) {
			return 0.0F;
		} else {
			float var2 = var1 - var0.field1439;
			return var2 * (var0.field1441[2] + (var2 * var0.field1441[0] + var0.field1441[1]) * var2) + var0.field1441[3];
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "109")
	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = ((ItemContainer) (ItemContainer.itemContainers.get(((long) (var0)))));
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.ids.length; ++var2) {
				var1.ids[var2] = -1;
				var1.quantities[var2] = 0;
			}
		}
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(descriptor = "(Lcd;ZI)V", garbageValue = "-1835891561")
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group;
		int var3 = ((int) (var0.key));
		var0.remove();
		if (var1) {
			WallDecoration.method4514(var2);
		}
		DirectByteArrayCopier.method5522(var2);
		Widget var4 = FloorUnderlayDefinition.getWidget(var3);
		if (var4 != null) {
			class220.invalidateWidget(var4);
		}
		if (Client.rootInterface != -1) {
			class220.runIntfCloseListeners(Client.rootInterface, 1);
		}
	}

	@ObfuscatedName("lz")
	@ObfuscatedSignature(descriptor = "(IIIILqj;Lkr;B)V", garbageValue = "34")
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) {
			int var6 = Client.camAngleY & 2047;
			int var7 = var3 * var3 + var2 * var2;
			if (var7 <= 6400) {
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6];
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6];
				int var10 = var3 * var8 + var9 * var2 >> 16;
				int var11 = var3 * var9 - var8 * var2 >> 16;
				if (var7 > 2500) {
					var4.method8196(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths);
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2);
				}
			}
		}
	}
}