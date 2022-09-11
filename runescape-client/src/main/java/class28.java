import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ao")
public class class28 {
	@ObfuscatedName("bm")
	@Export("otp")
	static String otp;
	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "[Lqi;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;

	static {
		ImageIO.setUseCache(false); // L: 12
	} // L: 13

	@ObfuscatedName("c")
	public static final void method412(long var0) {
		if (var0 > 0L) { // L: 9
			if (var0 % 10L == 0L) { // L: 10
				long var2 = var0 - 1L; // L: 11

				try {
					Thread.sleep(var2); // L: 14
				} catch (InterruptedException var8) { // L: 16
				}

				try {
					Thread.sleep(1L); // L: 20
				} catch (InterruptedException var7) { // L: 22
				}
			} else {
				try {
					Thread.sleep(var0); // L: 27
				} catch (InterruptedException var6) { // L: 29
				}
			}

		}
	} // L: 31

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llv;Llv;I)V",
		garbageValue = "-1793099655"
	)
	public static void method415(AbstractArchive var0, AbstractArchive var1) {
		SpotAnimationDefinition.SpotAnimationDefinition_archive = var0; // L: 32
		class11.SpotAnimationDefinition_modelArchive = var1; // L: 33
	} // L: 34

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ldi;FI)F",
		garbageValue = "-43457180"
	)
	static float method410(class118 var0, float var1) {
		if (var0 == null) { // L: 129
			return 0.0F; // L: 130
		} else {
			float var2 = var1 - var0.field1458; // L: 132
			return var0.field1460[3] + (var2 * (var2 * var0.field1460[0] + var0.field1460[1]) + var0.field1460[2]) * var2; // L: 133
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "7"
	)
	@Export("isKeyDown")
	public static final boolean isKeyDown() {
		synchronized(KeyHandler.KeyHandler_instance) { // L: 161
			if (KeyHandler.field146 == KeyHandler.field144) { // L: 162
				return false;
			} else {
				class142.field1665 = KeyHandler.field137[KeyHandler.field144]; // L: 163
				class229.field2794 = KeyHandler.field124[KeyHandler.field144]; // L: 164
				KeyHandler.field144 = KeyHandler.field144 + 1 & 127; // L: 165
				return true; // L: 166
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1861424289"
	)
	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
		ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 39
		if (var4 == null) { // L: 40
			var4 = new ItemContainer(); // L: 41
			ItemContainer.itemContainers.put(var4, (long)var0); // L: 42
		}

		if (var4.ids.length <= var1) { // L: 44
			int[] var5 = new int[var1 + 1]; // L: 45
			int[] var6 = new int[var1 + 1]; // L: 46

			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) { // L: 47
				var5[var7] = var4.ids[var7]; // L: 48
				var6[var7] = var4.quantities[var7]; // L: 49
			}

			for (var7 = var4.ids.length; var7 < var1; ++var7) { // L: 51
				var5[var7] = -1; // L: 52
				var6[var7] = 0; // L: 53
			}

			var4.ids = var5; // L: 55
			var4.quantities = var6; // L: 56
		}

		var4.ids[var1] = var2; // L: 58
		var4.quantities[var1] = var3; // L: 59
	} // L: 60

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZB)Lqi;",
		garbageValue = "16"
	)
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) { // L: 365
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) { // L: 366
			var4 = 1;
		}

		long var6 = ((long)var2 << 38) + (long)var0 + ((long)var1 << 16) + ((long)var4 << 40) + ((long)var3 << 42); // L: 367
		SpritePixels var8;
		if (!var5) { // L: 369
			var8 = (SpritePixels)ItemComposition.ItemDefinition_cachedSprites.get(var6); // L: 370
			if (var8 != null) { // L: 371
				return var8;
			}
		}

		ItemComposition var9 = UserComparator3.ItemDefinition_get(var0); // L: 373
		if (var1 > 1 && var9.countobj != null) { // L: 374
			int var10 = -1; // L: 375

			for (int var11 = 0; var11 < 10; ++var11) { // L: 376
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) { // L: 377
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) { // L: 379
				var9 = UserComparator3.ItemDefinition_get(var10);
			}
		}

		Model var19 = var9.getModel(1); // L: 381
		if (var19 == null) { // L: 382
			return null;
		} else {
			SpritePixels var20 = null; // L: 383
			if (var9.noteTemplate != -1) { // L: 384
				var20 = getItemSprite(var9.note, 10, 1, 0, 0, true); // L: 385
				if (var20 == null) { // L: 386
					return null;
				}
			} else if (var9.notedId != -1) { // L: 388
				var20 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false); // L: 389
				if (var20 == null) { // L: 390
					return null;
				}
			} else if (var9.placeholderTemplate != -1) { // L: 392
				var20 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false); // L: 393
				if (var20 == null) { // L: 394
					return null;
				}
			}

			int[] var12 = Rasterizer2D.Rasterizer2D_pixels; // L: 396
			int var13 = Rasterizer2D.Rasterizer2D_width; // L: 397
			int var14 = Rasterizer2D.Rasterizer2D_height; // L: 398
			int[] var15 = new int[4]; // L: 399
			Rasterizer2D.Rasterizer2D_getClipArray(var15); // L: 400
			var8 = new SpritePixels(36, 32); // L: 401
			Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32); // L: 402
			Rasterizer2D.Rasterizer2D_clear(); // L: 403
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 404
			Rasterizer3D.method4198(16, 16); // L: 405
			Rasterizer3D.field2377 = false; // L: 406
			if (var9.placeholderTemplate != -1) { // L: 407
				var20.drawTransBgAt(0, 0);
			}

			int var16 = var9.zoom2d; // L: 408
			if (var5) { // L: 409
				var16 = (int)((double)var16 * 1.5D);
			} else if (var2 == 2) { // L: 410
				var16 = (int)((double)var16 * 1.04D);
			}

			int var17 = var16 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16; // L: 411
			int var18 = var16 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16; // L: 412
			var19.calculateBoundsCylinder(); // L: 413
			var19.method4530(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var19.height / 2 + var17 + var9.offsetY2d, var18 + var9.offsetY2d); // L: 414
			if (var9.notedId != -1) { // L: 415
				var20.drawTransBgAt(0, 0);
			}

			if (var2 >= 1) { // L: 416
				var8.outline(1);
			}

			if (var2 >= 2) { // L: 417
				var8.outline(16777215);
			}

			if (var3 != 0) { // L: 418
				var8.shadow(var3);
			}

			Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32); // L: 419
			if (var9.noteTemplate != -1) { // L: 420
				var20.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) { // L: 421
				class296.ItemDefinition_fontPlain11.draw(ModeWhere.method6242(var1), 0, 9, 16776960, 1); // L: 422
			}

			if (!var5) { // L: 424
				ItemComposition.ItemDefinition_cachedSprites.put(var8, var6);
			}

			Rasterizer2D.Rasterizer2D_replace(var12, var13, var14); // L: 425
			Rasterizer2D.Rasterizer2D_setClipArray(var15); // L: 426
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 427
			Rasterizer3D.field2377 = true; // L: 428
			return var8; // L: 429
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZI)I",
		garbageValue = "891464249"
	)
	static int method414(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) { // L: 3784
			Interpreter.Interpreter_intStackSize -= 2; // L: 3785
			Client.field760 = (short)TileItem.method2566(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]); // L: 3786
			if (Client.field760 <= 0) { // L: 3787
				Client.field760 = 256;
			}

			Client.field762 = (short)TileItem.method2566(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 3788
			if (Client.field762 <= 0) { // L: 3789
				Client.field762 = 256;
			}

			return 1; // L: 3790
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) { // L: 3792
			Interpreter.Interpreter_intStackSize -= 2; // L: 3793
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3794
			if (Client.zoomHeight <= 0) { // L: 3795
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3796
			if (Client.zoomWidth <= 0) { // L: 3797
				Client.zoomWidth = 320;
			}

			return 1; // L: 3798
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) { // L: 3800
			Interpreter.Interpreter_intStackSize -= 4; // L: 3801
			Client.field764 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3802
			if (Client.field764 <= 0) { // L: 3803
				Client.field764 = 1;
			}

			Client.field756 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3804
			if (Client.field756 <= 0) { // L: 3805
				Client.field756 = 32767;
			} else if (Client.field756 < Client.field764) { // L: 3806
				Client.field756 = Client.field764;
			}

			Client.field537 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3807
			if (Client.field537 <= 0) { // L: 3808
				Client.field537 = 1;
			}

			Client.field638 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 3809
			if (Client.field638 <= 0) { // L: 3810
				Client.field638 = 32767;
			} else if (Client.field638 < Client.field537) { // L: 3811
				Client.field638 = Client.field537;
			}

			return 1; // L: 3812
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) { // L: 3814
			if (Client.viewportWidget != null) { // L: 3815
				class346.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false); // L: 3816
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportWidth; // L: 3817
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportHeight; // L: 3818
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3821
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3822
			}

			return 1; // L: 3824
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) { // L: 3826
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomHeight; // L: 3827
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomWidth; // L: 3828
			return 1; // L: 3829
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) { // L: 3831
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class126.method2981(Client.field760); // L: 3832
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class126.method2981(Client.field762); // L: 3833
			return 1; // L: 3834
		} else if (var0 == 6220) { // L: 3836
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3837
			return 1; // L: 3838
		} else if (var0 == 6221) { // L: 3840
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3841
			return 1; // L: 3842
		} else if (var0 == 6222) { // L: 3844
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class123.canvasWidth; // L: 3845
			return 1; // L: 3846
		} else if (var0 == 6223) { // L: 3848
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class166.canvasHeight; // L: 3849
			return 1; // L: 3850
		} else {
			return 2; // L: 3852
		}
	}
}
