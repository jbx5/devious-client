import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("ch")
public enum class83 implements MouseWheel {

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lch;")
	field1076(0, -1),
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Lch;")
	field1074(1, 2),
	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lch;")
	field1073(2, 3),
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lch;")
	field1077(3, 4),
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lch;")
	field1081(4, 5),
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lch;")
	field1078(5, 6);
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = -1715306901)
	final int field1075;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 419461411)
	final int field1080;

	class83(int var3, int var4) {
		this.field1075 = var3;
		this.field1080 = var4;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "104")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1080;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "106")
	static void method2085() {
		for (ObjectSound var0 = ((ObjectSound) (ObjectSound.objectSounds.last())); var0 != null; var0 = ((ObjectSound) (ObjectSound.objectSounds.previous()))) {
			if (var0.stream1 != null) {
				ModeWhere.pcmStreamMixer.removeSubStream(var0.stream1);
				var0.stream1 = null;
			}
			if (var0.stream2 != null) {
				ModeWhere.pcmStreamMixer.removeSubStream(var0.stream2);
				var0.stream2 = null;
			}
		}
		ObjectSound.objectSounds.clear();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1511834400")
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null;
		try {
			var0 = class433.getPreferencesFile("", class20.field111.name, true);
			Buffer var1 = ClanMate.clientPreferences.toBuffer();
			var0.write(var1.array, 0, var1.offset);
		} catch (Exception var3) {
		}
		try {
			if (var0 != null) {
				var0.closeSync(true);
			}
		} catch (Exception var2) {
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(IIIIIZI)Lqn;", garbageValue = "1267211598")
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) {
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) {
			var4 = 1;
		}
		long var6 = (((long) (var3)) << 42) + (((long) (var4)) << 40) + (((long) (var2)) << 38) + (((long) (var1)) << 16) + ((long) (var0));
		SpritePixels var8;
		if (!var5) {
			var8 = ((SpritePixels) (ItemComposition.ItemDefinition_cachedSprites.get(var6)));
			if (var8 != null) {
				return var8;
			}
		}
		ItemComposition var9 = AttackOption.ItemDefinition_get(var0);
		if (var1 > 1 && var9.countobj != null) {
			int var10 = -1;
			for (int var11 = 0; var11 < 10; ++var11) {
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) {
					var10 = var9.countobj[var11];
				}
			}
			if (var10 != -1) {
				var9 = AttackOption.ItemDefinition_get(var10);
			}
		}
		Model var21 = var9.getModel(1);
		if (var21 == null) {
			return null;
		} else {
			SpritePixels var22 = null;
			if (var9.noteTemplate != -1) {
				var22 = getItemSprite(var9.note, 10, 1, 0, 0, true);
				if (var22 == null) {
					return null;
				}
			} else if (var9.notedId != -1) {
				var22 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false);
				if (var22 == null) {
					return null;
				}
			} else if (var9.placeholderTemplate != -1) {
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
			Rasterizer3D.method4009(16, 16);
			Rasterizer3D.field2352 = false;
			if (var9.placeholderTemplate != -1) {
				var22.drawTransBgAt(0, 0);
			}
			int var16 = var9.zoom2d;
			if (var5) {
				var16 = ((int) (1.5 * ((double) (var16))));
			} else if (var2 == 2) {
				var16 = ((int) (1.04 * ((double) (var16))));
			}
			int var17 = var16 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16;
			int var18 = var16 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16;
			var21.calculateBoundsCylinder();
			var21.method4367(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var21.height / 2 + var17 + var9.offsetY2d, var18 + var9.offsetY2d);
			if (var9.notedId != -1) {
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
			if (var9.noteTemplate != -1) {
				var22.drawTransBgAt(0, 0);
			}
			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) {
				Font var19 = class137.ItemDefinition_fontPlain11;
				String var20;
				if (var1 < 100000) {
					var20 = "<col=ffff00>" + var1 + "</col>";
				} else if (var1 < 10000000) {
					var20 = "<col=ffffff>" + var1 / 1000 + "K" + "</col>";
				} else {
					var20 = "<col=00ff80>" + var1 / 1000000 + "M" + "</col>";
				}
				var19.draw(var20, 0, 9, 16776960, 1);
			}
			if (!var5) {
				ItemComposition.ItemDefinition_cachedSprites.put(var8, var6);
			}
			Rasterizer2D.Rasterizer2D_replace(var12, var13, var14);
			Rasterizer2D.Rasterizer2D_setClipArray(var15);
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
			Rasterizer3D.field2352 = true;
			return var8;
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(descriptor = "(ILbz;ZI)I", garbageValue = "1426925804")
	static int method2079(int var0, Script var1, boolean var2) {
		if (var0 == 7600) {
			--UserComparator8.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7601) {
			--UserComparator8.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7602) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 7603) {
			--User.Interpreter_intStackSize;
			Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else if (var0 == 7604) {
			--UserComparator8.Interpreter_stringStackSize;
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 7605) {
			--User.Interpreter_intStackSize;
			return 1;
		} else if (var0 == 7606) {
			User.Interpreter_intStackSize -= 2;
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 7607) {
			return 1;
		} else if (var0 == 7608) {
			--UserComparator8.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7609) {
			--UserComparator8.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7610) {
			--UserComparator8.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7611) {
			--User.Interpreter_intStackSize;
			return 1;
		} else if (var0 == 7612) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 7613) {
			--User.Interpreter_intStackSize;
			Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else if (var0 == 7614) {
			return 1;
		} else if (var0 == 7615) {
			--UserComparator8.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7616) {
			--UserComparator8.Interpreter_stringStackSize;
			User.Interpreter_intStackSize -= 2;
			return 1;
		} else if (var0 == 7617) {
			--UserComparator8.Interpreter_stringStackSize;
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ee")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-112")
	@Export("playPcmPlayers")
	static final void playPcmPlayers() {
		if (MouseRecorder.pcmPlayer1 != null) {
			MouseRecorder.pcmPlayer1.run();
		}
		if (class78.pcmPlayer0 != null) {
			class78.pcmPlayer0.run();
		}
	}

	@ObfuscatedName("er")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "99")
	static final void method2089() {
		if (DirectByteArrayCopier.ClanChat_inClanChat) {
			if (class19.friendsChat != null) {
				class19.friendsChat.sort();
			}
			FriendSystem.method1670();
			DirectByteArrayCopier.ClanChat_inClanChat = false;
		}
	}
}