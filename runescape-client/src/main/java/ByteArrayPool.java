import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("pb")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1270229297
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 261560463
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 928925253
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1819715831
	)
	static int field4547;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -128382617
	)
	static int field4542;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1836471235
	)
	static int field4549;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1802976855
	)
	static int field4543;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1478646587
	)
	static int field4551;
	@ObfuscatedName("al")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("an")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("ar")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("ab")
	static byte[][] field4555;
	@ObfuscatedName("ah")
	static ArrayList field4550;

	static {
		ByteArrayPool_smallCount = 0;
		ByteArrayPool_mediumCount = 0;
		ByteArrayPool_largeCount = 0;
		field4547 = 0;
		field4542 = 1000;
		field4549 = 250;
		field4543 = 100;
		field4551 = 50;
		ByteArrayPool_small = new byte[1000][];
		ByteArrayPool_medium = new byte[250][];
		ByteArrayPool_large = new byte[100][];
		field4555 = new byte[50][];
		field4550 = new ArrayList();
		class101.method2641();
		new HashMap();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IZI)[B",
		garbageValue = "1767173651"
	)
	@Export("ByteArrayPool_getArrayBool")
	public static synchronized byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		byte[] var4;
		if ((var0 == 100 || var0 < 100 && var1) && ByteArrayPool_smallCount > 0) {
			var4 = ByteArrayPool_small[--ByteArrayPool_smallCount];
			ByteArrayPool_small[ByteArrayPool_smallCount] = null;
			return var4;
		} else if ((var0 == 5000 || var0 < 5000 && var1) && ByteArrayPool_mediumCount > 0) {
			var4 = ByteArrayPool_medium[--ByteArrayPool_mediumCount];
			ByteArrayPool_medium[ByteArrayPool_mediumCount] = null;
			return var4;
		} else if ((var0 == 10000 || var0 < 10000 && var1) && ByteArrayPool_largeCount > 0) {
			var4 = ByteArrayPool_large[--ByteArrayPool_largeCount];
			ByteArrayPool_large[ByteArrayPool_largeCount] = null;
			return var4;
		} else if ((var0 == 30000 || var0 < 30000 && var1) && field4547 > 0) {
			var4 = field4555[--field4547];
			field4555[field4547] = null;
			return var4;
		} else {
			int var2;
			if (class410.ByteArrayPool_arrays != null) {
				for (var2 = 0; var2 < class416.ByteArrayPool_alternativeSizes.length; ++var2) {
					if ((class416.ByteArrayPool_alternativeSizes[var2] == var0 || var0 < class416.ByteArrayPool_alternativeSizes[var2] && var1) && StructComposition.ByteArrayPool_altSizeArrayCounts[var2] > 0) {
						byte[] var3 = class410.ByteArrayPool_arrays[var2][--StructComposition.ByteArrayPool_altSizeArrayCounts[var2]];
						class410.ByteArrayPool_arrays[var2][StructComposition.ByteArrayPool_altSizeArrayCounts[var2]] = null;
						return var3;
					}
				}
			}

			if (var1 && class416.ByteArrayPool_alternativeSizes != null) {
				for (var2 = 0; var2 < class416.ByteArrayPool_alternativeSizes.length; ++var2) {
					if (var0 <= class416.ByteArrayPool_alternativeSizes[var2] && StructComposition.ByteArrayPool_altSizeArrayCounts[var2] < class410.ByteArrayPool_arrays[var2].length) {
						return new byte[class416.ByteArrayPool_alternativeSizes[var2]];
					}
				}
			}

			return new byte[var0];
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-8"
	)
	static void method7671() {
		Iterator var0 = class305.musicSongs.iterator();

		while (true) {
			MusicSong var1;
			do {
				if (!var0.hasNext()) {
					class305.musicSongs.clear();
					return;
				}

				var1 = (MusicSong)var0.next();
			} while(var1 == null);

			var1.midiPcmStream.clear();
			var1.midiPcmStream.method5877();
			var1.midiPcmStream.setPcmStreamVolume(0);
			var1.midiPcmStream.field3443 = 0;
			int var2 = var1.musicTrackGroupId;
			int var3 = var1.musicTrackFileId;
			Iterator var4 = class305.field3407.iterator();

			while (var4.hasNext()) {
				class311 var5 = (class311)var4.next();
				var5.vmethod5967(var2, var3);
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "-2055623953"
	)
	static int method7681(int var0, Script var1, boolean var2) {
		Widget var3 = class92.getWidget(Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) {
			Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var3.text;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) {
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.scrollWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) {
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.scrollHeight;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) {
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.modelZoom;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) {
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.modelAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) {
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.modelAngleZ;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) {
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.modelAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) {
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.transparencyTop;
			return 1;
		} else if (var0 == 2610) {
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.transparencyBot;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) {
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.color;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) {
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.color2;
			return 1;
		} else if (var0 == 2613) {
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) {
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
			return 1;
		} else {
			class324 var4;
			if (var0 == 2617) {
				var4 = var3.method6416();
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4 != null ? var4.field3547 : 0;
			}

			if (var0 == 2618) {
				var4 = var3.method6416();
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4 != null ? var4.field3548 : 0;
				return 1;
			} else {
				class329 var7;
				if (var0 == 2619) {
					var7 = var3.method6532();
					Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6155().method7282() : "";
					return 1;
				} else if (var0 == 2620) {
					var4 = var3.method6416();
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4 != null ? var4.field3549 : 0;
					return 1;
				} else if (var0 == 2621) {
					var7 = var3.method6532();
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7 != null ? var7.method6326() : 0;
					return 1;
				} else if (var0 == 2622) {
					var7 = var3.method6532();
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7 != null ? var7.method6298() : 0;
					return 1;
				} else if (var0 == 2623) {
					var7 = var3.method6532();
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7 != null ? var7.method6362() : 0;
					return 1;
				} else if (var0 == 2624) {
					var7 = var3.method6532();
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7 != null && var7.method6157() ? 1 : 0;
					return 1;
				} else if (var0 != 2625) {
					if (var0 == 2626) {
						var7 = var3.method6532();
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6120().method7542() : "";
						return 1;
					} else if (var0 == 2627) {
						var7 = var3.method6532();
						int var5 = var7 != null ? var7.method6161() : 0;
						int var6 = var7 != null ? var7.method6160() : 0;
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Math.min(var5, var6);
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Math.max(var5, var6);
						return 1;
					} else if (var0 == 2628) {
						var7 = var3.method6532();
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7 != null ? var7.method6160() : 0;
						return 1;
					} else if (var0 == 2629) {
						var7 = var3.method6532();
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7 != null ? var7.method6123() : 0;
						return 1;
					} else if (var0 == 2630) {
						var7 = var3.method6532();
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7 != null ? var7.method6168() : 0;
						return 1;
					} else if (var0 == 2631) {
						var7 = var3.method6532();
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7 != null ? var7.method6261() : 0;
						return 1;
					} else if (var0 == 2632) {
						var7 = var3.method6532();
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7 != null ? var7.method6114() : 0;
						return 1;
					} else {
						class27 var8;
						if (var0 == 2633) {
							var8 = var3.method6401();
							Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize - 1] = var8 != null ? var8.method389(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else if (var0 == 2634) {
							var8 = var3.method6401();
							Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize - 1] = var8 != null ? var8.method395((char)Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = var3.method6532();
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7 != null && var7.method6158() ? 1 : 0;
					return 1;
				}
			}
		}
	}
}
