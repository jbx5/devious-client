import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import java.awt.Graphics;
import net.runelite.mapping.Implements;
import java.awt.Component;
import net.runelite.mapping.Export;
@ObfuscatedName("g")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("iy")
	@ObfuscatedSignature(descriptor = "[Lqn;")
	@Export("crossSprites")
	static SpritePixels[] crossSprites;

	@ObfuscatedName("s")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1;
	}

	public final void update(Graphics var1) {
		this.component.update(var1);
	}

	public final void paint(Graphics var1) {
		this.component.paint(var1);
	}

	@ObfuscatedName("fz")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1633382556")
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1;
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(descriptor = "([Lkn;IIIZI)V", garbageValue = "-1860767797")
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) {
			Widget var6 = var0[var5];
			if (var6 != null && var6.parentId == var1) {
				Message.alignWidgetSize(var6, var2, var3, var4);
				UserComparator7.alignWidgetPosition(var6, var2, var3);
				if (var6.scrollX > var6.scrollWidth - var6.width) {
					var6.scrollX = var6.scrollWidth - var6.width;
				}
				if (var6.scrollX < 0) {
					var6.scrollX = 0;
				}
				if (var6.scrollY > var6.scrollHeight - var6.height) {
					var6.scrollY = var6.scrollHeight - var6.height;
				}
				if (var6.scrollY < 0) {
					var6.scrollY = 0;
				}
				if (var6.type == 0) {
					class181.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}
	}
}