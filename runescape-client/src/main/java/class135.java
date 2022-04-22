


import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
public class class135 extends class128 {
	@ObfuscatedName("cs")
	@ObfuscatedSignature(descriptor = 
	"Lqq;")

	static IndexedSprite field1569;
	@ObfuscatedName("v")
	boolean field1566;
	@ObfuscatedName("c")
	byte field1565;
	@ObfuscatedName("i")
	byte field1567;
	@ObfuscatedName("f")
	byte field1564;
	@ObfuscatedName("b")
	byte field1568;

	@ObfuscatedSignature(descriptor = 
	"Les;")

	final class131 this$0;

	@ObfuscatedSignature(descriptor = 
	"(Les;)V")

	class135(class131 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;I)V", garbageValue = 
	"-413979452")

	void vmethod3168(Buffer var1) {
		this.field1566 = var1.readUnsignedByte() == 1;
		this.field1565 = var1.readByte();
		this.field1567 = var1.readByte();
		this.field1564 = var1.readByte();
		this.field1568 = var1.readByte();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Lex;S)V", garbageValue = 
	"-10316")

	void vmethod3162(ClanSettings var1) {
		var1.allowGuests = this.field1566;
		var1.field1591 = this.field1565;
		var1.field1592 = this.field1567;
		var1.field1593 = this.field1564;
		var1.field1606 = this.field1568;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(IIIIIIII)Z", garbageValue = 
	"1081787239")

	static final boolean method2919(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = ViewportMouse.ViewportMouse_y + var6;
		if (((var7 < var0) && (var7 < var1)) && (var7 < var2)) {
			return false;
		} else {
			var7 = ViewportMouse.ViewportMouse_y - var6;
			if (((var7 > var0) && (var7 > var1)) && (var7 > var2)) {
				return false;
			} else {
				var7 = ViewportMouse.ViewportMouse_x + var6;
				if (((var7 < var3) && (var7 < var4)) && (var7 < var5)) {
					return false;
				} else {
					var7 = ViewportMouse.ViewportMouse_x - var6;
					return ((var7 <= var3) || (var7 <= var4)) || (var7 <= var5);
				}
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"(IIIIIZI)Lqi;", garbageValue = 
	"-152475428")

	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == (-1)) {
			var4 = 0;
		} else if ((var4 == 2) && (var1 != 1)) {
			var4 = 1;
		}

		long var6 = ((((((long) (var1)) << 16) + ((long) (var0))) + (((long) (var2)) << 38)) + (((long) (var4)) << 40)) + (((long) (var3)) << 42);
		SpritePixels var8;
		if (!var5) {
			var8 = ((SpritePixels) (ItemComposition.ItemDefinition_cachedSprites.get(var6)));
			if (var8 != null) {
				return var8;
			}
		}

		ItemComposition var9 = class19.ItemDefinition_get(var0);
		if ((var1 > 1) && (var9.countobj != null)) {
			int var10 = -1;

			for (int var11 = 0; var11 < 10; ++var11) {
				if ((var1 >= var9.countco[var11]) && (var9.countco[var11] != 0)) {
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != (-1)) {
				var9 = class19.ItemDefinition_get(var10);
			}
		}

		Model var21 = var9.getModel(1);
		if (var21 == null) {
			return null;
		} else {
			SpritePixels var22 = null;
			if (var9.noteTemplate != (-1)) {
				var22 = getItemSprite(var9.note, 10, 1, 0, 0, true);
				if (var22 == null) {
					return null;
				}
			} else if (var9.notedId != (-1)) {
				var22 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false);
				if (var22 == null) {
					return null;
				}
			} else if (var9.placeholderTemplate != (-1)) {
				var22 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false);
				if (var22 == null) {
					return null;
				}
			}

			int[] var12 = Rasterizer2D.Rasterizer2D_pixels;
			int var13 = Rasterizer2D.Rasterizer2D_width;
			int var14 = Rasterizer2D.Rasterizer2D_height;
			int[] var15 = new int[4];
			Rasterizer2D.Rasterizer2D_getClipArray(var15);
			var8 = new SpritePixels(36, 32);
			Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32);
			Rasterizer2D.Rasterizer2D_clear();
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
			Rasterizer3D.method4631(16, 16);
			Rasterizer3D.field2553 = false;
			if (var9.placeholderTemplate != (-1)) {
				var22.drawTransBgAt(0, 0);
			}

			int var16 = var9.zoom2d;
			if (var5) {
				var16 = ((int) (((double) (var16)) * 1.5));
			} else if (var2 == 2) {
				var16 = ((int) (1.04 * ((double) (var16))));
			}

			int var17 = (var16 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d]) >> 16;
			int var18 = (var16 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d]) >> 16;
			var21.calculateBoundsCylinder();
			var21.method5003(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, ((var21.height / 2) + var17) + var9.offsetY2d, var18 + var9.offsetY2d);
			if (var9.notedId != (-1)) {
				var22.drawTransBgAt(0, 0);
			}

			if (var2 >= 1) {
				var8.outline(1);
			}

			if (var2 >= 2) {
				var8.outline(16777215);
			}

			if (var3 != 0) {
				var8.shadow(var3);
			}

			Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32);
			if (var9.noteTemplate != (-1)) {
				var22.drawTransBgAt(0, 0);
			}

			if ((var4 == 1) || ((var4 == 2) && (var9.isStackable == 1))) {
				Font var19 = ParamComposition.ItemDefinition_fontPlain11;
				String var20;
				if (var1 < 100000) {
					var20 = ("<col=ffff00>" + var1) + "</col>";
				} else if (var1 < 10000000) {
					var20 = (("<col=ffffff>" + (var1 / 1000)) + "K") + "</col>";
				} else {
					var20 = (("<col=00ff80>" + (var1 / 1000000)) + "M") + "</col>";
				}

				var19.draw(var20, 0, 9, 16776960, 1);
			}

			if (!var5) {
				ItemComposition.ItemDefinition_cachedSprites.put(var8, var6);
			}

			Rasterizer2D.Rasterizer2D_replace(var12, var13, var14);
			Rasterizer2D.Rasterizer2D_setClipArray(var15);
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
			Rasterizer3D.field2553 = true;
			return var8;
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(ILbd;ZI)I", garbageValue = 
	"1999407180")

	static int method2922(int var0, Script var1, boolean var2) {
		Widget var3 = (var2) ? WorldMapID.scriptDotWidget : Interpreter.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) {
			if (var3.itemId != (-1)) {
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETID) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.childIndex;
			return 1;
		} else if (var0 == 1707) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (var3.method5690()) ? 1 : 0;
			return 1;
		} else if (var0 == 1708) {
			return UserComparator9.method2617(var3);
		} else {
			return var0 == 1708 ? class305.method5782(var3) : 2;
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = 
	"(ILbd;ZB)I", garbageValue = 
	"-35")

	static int method2921(int var0, Script var1, boolean var2) {
		Widget var3 = class127.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.scrollY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) {
			Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var3.text;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.scrollWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.scrollHeight;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.modelZoom;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.modelAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.modelAngleZ;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.modelAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.transparencyTop;
			return 1;
		} else if (var0 == 2610) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.transparencyBot;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.color;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.color2;
			return 1;
		} else if (var0 == 2613) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.fillMode.rsOrdinal();
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (var3.modelTransparency) ? 1 : 0;
			return 1;
		} else if ((var0 != 2615) && (var0 != 2616)) {
			return 2;
		} else {
			++Interpreter.Interpreter_intStackSize;
			return 1;
		}
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"241580709")

	static final void method2920() {
		int var0;
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		if (Client.oculusOrbState == 0) {
			var0 = GrandExchangeEvents.localPlayer.x;
			var1 = GrandExchangeEvents.localPlayer.y;
			if (((((class10.oculusOrbFocalPointX - var0) < (-500)) || ((class10.oculusOrbFocalPointX - var0) > 500)) || ((ClientPacket.oculusOrbFocalPointY - var1) < (-500))) || ((ClientPacket.oculusOrbFocalPointY - var1) > 500)) {
				class10.oculusOrbFocalPointX = var0;
				ClientPacket.oculusOrbFocalPointY = var1;
			}

			if (var0 != class10.oculusOrbFocalPointX) {
				class10.oculusOrbFocalPointX += (var0 - class10.oculusOrbFocalPointX) / 16;
			}

			if (var1 != ClientPacket.oculusOrbFocalPointY) {
				ClientPacket.oculusOrbFocalPointY += (var1 - ClientPacket.oculusOrbFocalPointY) / 16;
			}

			var2 = class10.oculusOrbFocalPointX >> 7;
			var3 = ClientPacket.oculusOrbFocalPointY >> 7;
			var4 = WorldMapLabel.getTileHeight(class10.oculusOrbFocalPointX, ClientPacket.oculusOrbFocalPointY, class18.Client_plane);
			var5 = 0;
			int var6;
			if ((((var2 > 3) && (var3 > 3)) && (var2 < 100)) && (var3 < 100)) {
				for (var6 = var2 - 4; var6 <= (var2 + 4); ++var6) {
					for (int var7 = var3 - 4; var7 <= (var3 + 4); ++var7) {
						int var8 = class18.Client_plane;
						if ((var8 < 3) && ((Tiles.Tiles_renderFlags[1][var6][var7] & 2) == 2)) {
							++var8;
						}

						int var9 = var4 - Tiles.Tiles_heights[var8][var6][var7];
						if (var9 > var5) {
							var5 = var9;
						}
					}
				}
			}

			var6 = var5 * 192;
			if (var6 > 98048) {
				var6 = 98048;
			}

			if (var6 < 32768) {
				var6 = 32768;
			}

			if (var6 > Client.field718) {
				Client.field718 += (var6 - Client.field718) / 24;
			} else if (var6 < Client.field718) {
				Client.field718 += (var6 - Client.field718) / 80;
			}

			Decimator.field397 = WorldMapLabel.getTileHeight(GrandExchangeEvents.localPlayer.x, GrandExchangeEvents.localPlayer.y, class18.Client_plane) - Client.camFollowHeight;
		} else if (Client.oculusOrbState == 1) {
			UrlRequest.method2560();
			short var10 = -1;
			if (KeyHandler.KeyHandler_pressedKeys[33]) {
				var10 = 0;
			} else if (KeyHandler.KeyHandler_pressedKeys[49]) {
				var10 = 1024;
			}

			if (KeyHandler.KeyHandler_pressedKeys[48]) {
				if (var10 == 0) {
					var10 = 1792;
				} else if (var10 == 1024) {
					var10 = 1280;
				} else {
					var10 = 1536;
				}
			} else if (KeyHandler.KeyHandler_pressedKeys[50]) {
				if (var10 == 0) {
					var10 = 256;
				} else if (var10 == 1024) {
					var10 = 768;
				} else {
					var10 = 512;
				}
			}

			byte var11 = 0;
			if (KeyHandler.KeyHandler_pressedKeys[35]) {
				var11 = -1;
			} else if (KeyHandler.KeyHandler_pressedKeys[51]) {
				var11 = 1;
			}

			var2 = 0;
			if ((var10 >= 0) || (var11 != 0)) {
				var2 = (KeyHandler.KeyHandler_pressedKeys[81]) ? (Client.oculusOrbSlowedSpeed * 868767683) * (-1383870229) : (Client.oculusOrbNormalSpeed * (-210849807)) * (-1329831663);
				var2 *= 16;
				Client.field590 = var10;
				Client.field489 = var11;
			}

			if (Client.field581 < var2) {
				Client.field581 += var2 / 8;
				if (Client.field581 > var2) {
					Client.field581 = var2;
				}
			} else if (Client.field581 > var2) {
				Client.field581 = (Client.field581 * 9) / 10;
			}

			if (Client.field581 > 0) {
				var3 = Client.field581 / 16;
				if (Client.field590 >= 0) {
					var0 = (Client.field590 - class21.cameraYaw) & 2047;
					var4 = Rasterizer3D.Rasterizer3D_sine[var0];
					var5 = Rasterizer3D.Rasterizer3D_cosine[var0];
					class10.oculusOrbFocalPointX += (var4 * var3) / 65536;
					ClientPacket.oculusOrbFocalPointY += (var3 * var5) / 65536;
				}

				if (Client.field489 != 0) {
					Decimator.field397 += var3 * Client.field489;
					if (Decimator.field397 > 0) {
						Decimator.field397 = 0;
					}
				}
			} else {
				Client.field590 = -1;
				Client.field489 = -1;
			}

			if (KeyHandler.KeyHandler_pressedKeys[13]) {
				class134.method2908();
			}
		}

		if ((MouseHandler.MouseHandler_currentButton == 4) && GameBuild.mouseCam) {
			var0 = MouseHandler.MouseHandler_y - Client.mouseCamClickedY;
			Client.camAngleDX = var0 * 2;
			Client.mouseCamClickedY = ((var0 != (-1)) && (var0 != 1)) ? (Client.mouseCamClickedY + MouseHandler.MouseHandler_y) / 2 : (MouseHandler.MouseHandler_y * 1209120729) * (-785295255);
			var1 = Client.mouseCamClickedX - MouseHandler.MouseHandler_x;
			Client.camAngleDY = var1 * 2;
			Client.mouseCamClickedX = ((var1 != (-1)) && (var1 != 1)) ? (MouseHandler.MouseHandler_x + Client.mouseCamClickedX) / 2 : (MouseHandler.MouseHandler_x * 945035617) * (-611956063);
		} else {
			if (KeyHandler.KeyHandler_pressedKeys[96]) {
				Client.camAngleDY += ((-24) - Client.camAngleDY) / 2;
			} else if (KeyHandler.KeyHandler_pressedKeys[97]) {
				Client.camAngleDY += (24 - Client.camAngleDY) / 2;
			} else {
				Client.camAngleDY /= 2;
			}

			if (KeyHandler.KeyHandler_pressedKeys[98]) {
				Client.camAngleDX += (12 - Client.camAngleDX) / 2;
			} else if (KeyHandler.KeyHandler_pressedKeys[99]) {
				Client.camAngleDX += ((-12) - Client.camAngleDX) / 2;
			} else {
				Client.camAngleDX /= 2;
			}

			Client.mouseCamClickedY = MouseHandler.MouseHandler_y;
			Client.mouseCamClickedX = MouseHandler.MouseHandler_x;
		}

		Client.camAngleY = ((Client.camAngleDY / 2) + Client.camAngleY) & 2047;
		Client.camAngleX += Client.camAngleDX / 2;
		if (Client.camAngleX < 128) {
			Client.camAngleX = 128;
		}

		if (Client.camAngleX > 383) {
			Client.camAngleX = 383;
		}

	}
}