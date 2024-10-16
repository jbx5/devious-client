import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("lk")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("dk")
	static boolean field3216;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1703718912
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 410841408
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -675862191
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1304526755
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 925173719
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 186154205
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1259217325
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 159462891
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("ao")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("af")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("ar")
	byte[][][] field3210;
	@ObfuscatedName("ab")
	byte[][][] field3211;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[[[[Llr;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("ag")
	boolean field3213;
	@ObfuscatedName("ad")
	boolean field3214;

	AbstractWorldMapData() {
		this.groupId = -1;
		this.fileId = -1;
		new LinkedList();
		this.field3213 = false;
		this.field3214 = false;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lvl;I)V",
		garbageValue = "506593636"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "218171055"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field3213 && this.field3214;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lpe;I)V",
		garbageValue = "-1643633119"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) {
			byte[] var2 = var1.takeFile(this.groupId, this.fileId);
			if (var2 != null) {
				this.readGeography(new Buffer(var2));
				this.field3213 = true;
				this.field3214 = true;
			}

		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null;
		this.floorOverlayIds = null;
		this.field3210 = null;
		this.field3211 = null;
		this.decorations = null;
		this.field3213 = false;
		this.field3214 = false;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IILvl;S)V",
		garbageValue = "132"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte();
		if (var4 != 0) {
			if ((var4 & 1) != 0) {
				this.method6279(var1, var2, var3, var4);
			} else {
				this.method6264(var1, var2, var3, var4);
			}

		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IILvl;II)V",
		garbageValue = "-1452229835"
	)
	void method6279(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IILvl;II)V",
		garbageValue = "593874839"
	)
	void method6264(int var1, int var2, Buffer var3, int var4) {
		int var5 = ((var4 & 24) >> 3) + 1;
		boolean var6 = (var4 & 2) != 0;
		boolean var7 = (var4 & 4) != 0;
		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
		int var8;
		int var9;
		int var11;
		if (var6) {
			var8 = var3.readUnsignedByte();

			for (var9 = 0; var9 < var8; ++var9) {
				int var14 = var3.readUnsignedShort();
				if (var14 != 0) {
					this.floorOverlayIds[var9][var1][var2] = (short)var14;
					var11 = var3.readUnsignedByte();
					this.field3210[var9][var1][var2] = (byte)(var11 >> 2);
					this.field3211[var9][var1][var2] = (byte)(var11 & 3);
				}
			}
		}

		if (var7) {
			for (var8 = 0; var8 < var5; ++var8) {
				var9 = var3.readUnsignedByte();
				if (var9 != 0) {
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9];

					for (var11 = 0; var11 < var9; ++var11) {
						int var12 = var3.method10108();
						int var13 = var3.readUnsignedByte();
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3);
					}
				}
			}
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-100"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-48"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lnu;B)V",
		garbageValue = "14"
	)
	public static void method6283(Huffman var0) {
		class364.huffman = var0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-120"
	)
	public static void method6284(int var0, int var1) {
		VarbitComposition var3 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0);
		VarbitComposition var2;
		if (var3 != null) {
			var2 = var3;
		} else {
			byte[] var4 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0);
			var3 = new VarbitComposition();
			if (var4 != null) {
				var3.decode(new Buffer(var4));
			}

			VarbitComposition.VarbitDefinition_cached.put(var3, (long)var0);
			var2 = var3;
		}

		int var8 = var2.baseVar;
		int var5 = var2.startBit;
		int var6 = var2.endBit;
		int var7 = Varps.Varps_masks[var6 - var5];
		if (var1 < 0 || var1 > var7) {
			var1 = 0;
		}

		var7 <<= var5;
		Varps.Varps_main[var8] = Varps.Varps_main[var8] & ~var7 | var1 << var5 & var7;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILda;ZI)I",
		garbageValue = "1951568548"
	)
	static int method6282(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? UserComparator2.scriptDotWidget : HttpRequestTask.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else {
			class359 var7;
			if (var0 == ScriptOpcodes.CC_GETTEXT) {
				if (var3.type == 12) {
					var7 = var3.method7304();
					if (var7 != null) {
						Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var7.method7057().method8415();
						return 1;
					}
				}

				Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var3.text;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) {
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.scrollWidth;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) {
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.scrollHeight;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) {
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.modelZoom;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) {
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.modelAngleX;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) {
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.modelAngleZ;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) {
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.modelAngleY;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETTRANS) {
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.transparencyTop;
				return 1;
			} else if (var0 == 1610) {
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.transparencyBot;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) {
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.color;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) {
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.color2;
				return 1;
			} else if (var0 == 1613) {
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) {
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
				return 1;
			} else {
				class353 var4;
				if (var0 == 1617) {
					var4 = var3.method7325();
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var4 != null ? var4.field3794 : 0;
				}

				if (var0 == 1618) {
					var4 = var3.method7325();
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var4 != null ? var4.field3793 : 0;
					return 1;
				} else if (var0 == 1619) {
					var7 = var3.method7304();
					Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var7 != null ? var7.method7111().method8415() : "";
					return 1;
				} else if (var0 == 1620) {
					var4 = var3.method7325();
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var4 != null ? var4.field3795 : 0;
					return 1;
				} else if (var0 == 1621) {
					var7 = var3.method7304();
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var7 != null ? var7.method7069() : 0;
					return 1;
				} else if (var0 == 1622) {
					var7 = var3.method7304();
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var7 != null ? var7.method7167() : 0;
					return 1;
				} else if (var0 == 1623) {
					var7 = var3.method7304();
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var7 != null ? var7.method7070() : 0;
					return 1;
				} else if (var0 == 1624) {
					var7 = var3.method7304();
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var7 != null && var7.method7060() ? 1 : 0;
					return 1;
				} else if (var0 != 1625) {
					if (var0 == 1626) {
						var7 = var3.method7304();
						Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var7 != null ? var7.method7054().method8665() : "";
						return 1;
					} else if (var0 == 1627) {
						var7 = var3.method7304();
						int var5 = var7 != null ? var7.method7064() : 0;
						int var6 = var7 != null ? var7.method7063() : 0;
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Math.min(var5, var6);
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Math.max(var5, var6);
						return 1;
					} else if (var0 == 1628) {
						var7 = var3.method7304();
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var7 != null ? var7.method7063() : 0;
						return 1;
					} else if (var0 == 1629) {
						var7 = var3.method7304();
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var7 != null ? var7.method7072() : 0;
						return 1;
					} else if (var0 == 1630) {
						var7 = var3.method7304();
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var7 != null ? var7.method7071() : 0;
						return 1;
					} else if (var0 == 1631) {
						var7 = var3.method7304();
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var7 != null ? var7.method7077() : 0;
						return 1;
					} else if (var0 == 1632) {
						var7 = var3.method7304();
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var7 != null ? var7.method7170() : 0;
						return 1;
					} else {
						class27 var8;
						if (var0 == 1633) {
							var8 = var3.method7326();
							Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize - 1] = var8 != null ? var8.method395(Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else if (var0 == 1634) {
							var8 = var3.method7326();
							Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize - 1] = var8 != null ? var8.method433((char)Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = var3.method7304();
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var7 != null && var7.method7061() ? 1 : 0;
					return 1;
				}
			}
		}
	}

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "(Lng;IIIIIII)V",
		garbageValue = "825121780"
	)
	static final void method6263(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field588) {
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0;
		}

		Client.field588 = false;
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !class150.mouseCam && MouseHandler.MouseHandler_currentButton == 4) {
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
				var0.scrollY -= 4;
				class110.invalidateWidget(var0);
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
				var0.scrollY += 4;
				class110.invalidateWidget(var0);
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
				var7 = var3 * (var3 - 32) / var4;
				if (var7 < 8) {
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2;
				int var9 = var3 - 32 - var7;
				var0.scrollY = var8 * (var4 - var3) / var9;
				class110.invalidateWidget(var0);
				Client.field588 = true;
			}
		}

		if (Client.mouseWheelRotation != 0) {
			var7 = var0.width;
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
				var0.scrollY += Client.mouseWheelRotation * 45;
				class110.invalidateWidget(var0);
			}
		}

	}
}
