import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cy")
public class class60 {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 2061460893
	)
	static int field428;
	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("soundEffectsArchive")
	static Archive soundEffectsArchive;
	@ObfuscatedName("ac")
	byte[] field427;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -734778521
	)
	int field423;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 68516875
	)
	int field424;

	class60() {
		this.field427 = null;
		this.field423 = 0;
		this.field424 = 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1579367572"
	)
	int method1190(int var1) {
		int var2 = 0;

		int var3;
		int var4;
		for (var3 = 0; var1 >= 8 - this.field424; var1 -= var4) {
			var4 = 8 - this.field424;
			int var5 = (1 << var4) - 1;
			var2 += (this.field427[this.field423] >> this.field424 & var5) << var3;
			this.field424 = 0;
			++this.field423;
			var3 += var4;
		}

		if (var1 > 0) {
			var4 = (1 << var1) - 1;
			var2 += (this.field427[this.field423] >> this.field424 & var4) << var3;
			this.field424 += var1;
		}

		return var2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2141673982"
	)
	int method1191() {
		int var1 = this.field427[this.field423] >> this.field424 & 1;
		++this.field424;
		this.field423 += this.field424 >> 3;
		this.field424 &= 7;
		return var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([BIB)V",
		garbageValue = "-34"
	)
	void method1197(byte[] var1, int var2) {
		this.field427 = var1;
		this.field423 = var2;
		this.field424 = 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(DDII)[D",
		garbageValue = "532814007"
	)
	public static double[] method1198(double var0, double var2, int var4) {
		int var5 = var4 * 2 + 1;
		double[] var6 = new double[var5];
		int var7 = -var4;

		for (int var8 = 0; var7 <= var4; ++var8) {
			var6[var8] = class289.method6069((double)var7, var0, var2);
			++var7;
		}

		return var6;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-4"
	)
	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
		ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var4 == null) {
			var4 = new ItemContainer();
			ItemContainer.itemContainers.put(var4, (long)var0);
		}

		if (var4.ids.length <= var1) {
			int[] var5 = new int[var1 + 1];
			int[] var6 = new int[var1 + 1];

			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) {
				var5[var7] = var4.ids[var7];
				var6[var7] = var4.quantities[var7];
			}

			for (var7 = var4.ids.length; var7 < var1; ++var7) {
				var5[var7] = -1;
				var6[var7] = 0;
			}

			var4.ids = var5;
			var4.quantities = var6;
		}

		var4.ids[var1] = var2;
		var4.quantities[var1] = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1870578311"
	)
	public static void method1192() {
		Iterator var0 = class334.musicSongs.iterator();

		while (var0.hasNext()) {
			MusicSong var1 = (MusicSong)var0.next();
			if (var1 != null) {
				var1.midiPcmStream.clear();
				var1.midiPcmStream.method6510();
				var1.midiPcmStream.setPcmStreamVolume(0);
				var1.midiPcmStream.field3637 = 0;
				Strings.method7442(var1.musicTrackGroupId, var1.musicTrackFileId);
			}
		}

		class334.musicSongs.clear();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "-98"
	)
	static int method1196(int var0, Script var1, boolean var2) {
		Widget var3 = TaskHandler.widgetDefinition.method6841(Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) {
			Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var3.text;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) {
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.scrollWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) {
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.scrollHeight;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) {
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.modelZoom;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) {
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.modelAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) {
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.modelAngleZ;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) {
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.modelAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) {
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.transparencyTop;
			return 1;
		} else if (var0 == 2610) {
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.transparencyBot;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) {
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.color;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) {
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.color2;
			return 1;
		} else if (var0 == 2613) {
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) {
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
			return 1;
		} else {
			class354 var4;
			if (var0 == 2617) {
				var4 = var3.method7303();
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var4 != null ? var4.field3774 : 0;
			}

			if (var0 == 2618) {
				var4 = var3.method7303();
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var4 != null ? var4.field3771 : 0;
				return 1;
			} else {
				class360 var7;
				if (var0 == 2619) {
					var7 = var3.method7268();
					Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var7 != null ? var7.method7002().method8367() : "";
					return 1;
				} else if (var0 == 2620) {
					var4 = var3.method7303();
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var4 != null ? var4.field3772 : 0;
					return 1;
				} else if (var0 == 2621) {
					var7 = var3.method7268();
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var7 != null ? var7.method7123() : 0;
					return 1;
				} else if (var0 == 2622) {
					var7 = var3.method7268();
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var7 != null ? var7.method7013() : 0;
					return 1;
				} else if (var0 == 2623) {
					var7 = var3.method7268();
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var7 != null ? var7.method7211() : 0;
					return 1;
				} else if (var0 == 2624) {
					var7 = var3.method7268();
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var7 != null && var7.method7004() ? 1 : 0;
					return 1;
				} else if (var0 != 2625) {
					if (var0 == 2626) {
						var7 = var3.method7268();
						Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var7 != null ? var7.method7003().method8547() : "";
						return 1;
					} else if (var0 == 2627) {
						var7 = var3.method7268();
						int var5 = var7 != null ? var7.method7087() : 0;
						int var6 = var7 != null ? var7.method7007() : 0;
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = Math.min(var5, var6);
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = Math.max(var5, var6);
						return 1;
					} else if (var0 == 2628) {
						var7 = var3.method7268();
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var7 != null ? var7.method7007() : 0;
						return 1;
					} else if (var0 == 2629) {
						var7 = var3.method7268();
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var7 != null ? var7.method7093() : 0;
						return 1;
					} else if (var0 == 2630) {
						var7 = var3.method7268();
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var7 != null ? var7.method7015() : 0;
						return 1;
					} else if (var0 == 2631) {
						var7 = var3.method7268();
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var7 != null ? var7.method7017() : 0;
						return 1;
					} else if (var0 == 2632) {
						var7 = var3.method7268();
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var7 != null ? var7.method7052() : 0;
						return 1;
					} else {
						class27 var8;
						if (var0 == 2633) {
							var8 = var3.method7270();
							Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize - 1] = var8 != null ? var8.method381(Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else if (var0 == 2634) {
							var8 = var3.method7270();
							Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize - 1] = var8 != null ? var8.method392((char)Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = var3.method7268();
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var7 != null && var7.method7005() ? 1 : 0;
					return 1;
				}
			}
		}
	}
}
