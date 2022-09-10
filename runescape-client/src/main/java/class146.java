import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
public class class146 {
	@ObfuscatedName("hz")
	@ObfuscatedGetter(
		intValue = -1960461483
	)
	static int field1684;
	@ObfuscatedName("nq")
	@ObfuscatedSignature(
		descriptor = "Lbh;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = 4972834688742497923L
	)
	long field1681;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		longValue = 6940230468072027913L
	)
	long field1687;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	IterableNodeDeque field1682;

	@ObfuscatedSignature(
		descriptor = "(Lqq;)V"
	)
	public class146(Buffer var1) {
		this.field1687 = -1L; // L: 10
		this.field1682 = new IterableNodeDeque(); // L: 11
		this.method3229(var1); // L: 19
	} // L: 20

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqq;I)V",
		garbageValue = "1576904279"
	)
	void method3229(Buffer var1) {
		this.field1681 = var1.readLong(); // L: 23
		this.field1687 = var1.readLong(); // L: 24

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 25 26 36
			Object var3;
			if (var2 == 1) { // L: 28
				var3 = new class141(this);
			} else if (var2 == 4) {
				var3 = new class152(this); // L: 29
			} else if (var2 == 3) { // L: 30
				var3 = new class137(this);
			} else if (var2 == 2) { // L: 31
				var3 = new class135(this);
			} else {
				if (var2 != 5) { // L: 32
					throw new RuntimeException(""); // L: 33
				}

				var3 = new class142(this);
			}

			((class145)var3).vmethod3300(var1); // L: 34
			this.field1682.addFirst((Node)var3); // L: 35
		}

	} // L: 38

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ler;I)V",
		garbageValue = "1477279041"
	)
	public void method3230(ClanChannel var1) {
		if (var1.key == this.field1681 && var1.field1706 == this.field1687) { // L: 41
			for (class145 var2 = (class145)this.field1682.last(); var2 != null; var2 = (class145)this.field1682.previous()) { // L: 42
				var2.vmethod3302(var1); // L: 43
			}

			++var1.field1706; // L: 45
		} else {
			throw new RuntimeException("");
		}
	} // L: 46

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "1164189292"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) { // L: 4343
			byte var2 = 4; // L: 4344
			int var3 = var2 + 6; // L: 4345
			int var4 = var2 + 6; // L: 4346
			int var5 = class1.fontPlain12.lineWidth(var0, 250); // L: 4347
			int var6 = class1.fontPlain12.lineCount(var0, 250) * 13; // L: 4348
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var2 + var6, 0); // L: 4349
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var6 + var2 + var2, 16777215); // L: 4350
			class1.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0); // L: 4351
			class9.method89(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var2 + var6); // L: 4352
			if (var1) { // L: 4353
				class20.rasterProvider.drawFull(0, 0); // L: 4354
			} else {
				int var7 = var3; // L: 4357
				int var8 = var4; // L: 4358
				int var9 = var5; // L: 4359
				int var10 = var6; // L: 4360

				for (int var11 = 0; var11 < Client.rootWidgetCount; ++var11) { // L: 4362
					if (Client.rootWidgetXs[var11] + Client.rootWidgetWidths[var11] > var7 && Client.rootWidgetXs[var11] < var9 + var7 && Client.rootWidgetYs[var11] + Client.rootWidgetHeights[var11] > var8 && Client.rootWidgetYs[var11] < var10 + var8) { // L: 4363
						Client.field556[var11] = true;
					}
				}
			}

		}
	} // L: 4367

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-6602468"
	)
	static final void method3239() {
		for (GraphicsObject var0 = (GraphicsObject)Client.graphicsObjects.last(); var0 != null; var0 = (GraphicsObject)Client.graphicsObjects.previous()) { // L: 4705 4706 4713
			if (var0.plane == Tiles.Client_plane && !var0.isFinished) { // L: 4707
				if (Client.cycle >= var0.cycleStart) { // L: 4708
					var0.advance(Client.field743); // L: 4709
					if (var0.isFinished) {
						var0.remove(); // L: 4710
					} else {
						MusicPatchNode.scene.drawEntity(var0.plane, var0.x, var0.y, var0.z, 60, var0, 0, -1L, false); // L: 4711
					}
				}
			} else {
				var0.remove();
			}
		}

	} // L: 4715

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(IIIILqi;Lko;I)V",
		garbageValue = "1807581062"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) { // L: 11893
			int var6 = Client.camAngleY & 2047; // L: 11894
			int var7 = var3 * var3 + var2 * var2; // L: 11895
			if (var7 <= 6400) { // L: 11896
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 11897
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 11898
				int var10 = var3 * var8 + var9 * var2 >> 16; // L: 11899
				int var11 = var3 * var9 - var8 * var2 >> 16; // L: 11900
				if (var7 > 2500) {
					var4.method8361(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths); // L: 11901
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2); // L: 11902
				}

			}
		}
	} // L: 11903
}
