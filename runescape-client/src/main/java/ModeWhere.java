import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pr")
@Implements("ModeWhere")
public enum ModeWhere implements Enum {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	field4471("", 0, new class386[]{class386.field4441, class386.field4440}),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	field4459("", 1, new class386[]{class386.field4438, class386.field4441, class386.field4440}),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	field4460("", 2, new class386[]{class386.field4438, class386.field4439, class386.field4441}),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	field4461("", 3, new class386[]{class386.field4438}),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	field4468("", 4),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	field4463("", 5, new class386[]{class386.field4438, class386.field4441}),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	field4465("", 6, new class386[]{class386.field4441}),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	field4462("", 8, new class386[]{class386.field4438, class386.field4441}),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	field4466("", 9, new class386[]{class386.field4438, class386.field4439}),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	field4458("", 10, new class386[]{class386.field4438}),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	field4464("", 11, new class386[]{class386.field4438}),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	field4469("", 12, new class386[]{class386.field4438, class386.field4441}),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	field4470("", 13, new class386[]{class386.field4438});

	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1468460281
	)
	@Export("id")
	final int id;
	@ObfuscatedName("aw")
	final Set field4472;

	static {
		method7301();
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lof;)V"
	)
	ModeWhere(String var3, int var4, class386[] var5) {
		this.field4472 = new HashSet();
		this.id = var4;
		class386[] var6 = var5;

		for (int var7 = 0; var7 < var6.length; ++var7) {
			class386 var8 = var6[var7];
			this.field4472.add(var8);
		}

	}

	ModeWhere(String var3, int var4) {
		this.field4472 = new HashSet();
		this.id = var4;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-884190501"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)[Lpr;",
		garbageValue = "1372409485"
	)
	static ModeWhere[] method7301() {
		return new ModeWhere[]{field4463, field4465, field4459, field4466, field4460, field4470, field4468, field4469, field4471, field4458, field4462, field4464, field4461};
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([Lch;II[I[II)V",
		garbageValue = "-1103489853"
	)
	@Export("sortWorlds")
	static void sortWorlds(World[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) {
			int var5 = var1 - 1;
			int var6 = var2 + 1;
			int var7 = (var2 + var1) / 2;
			World var8 = var0[var7];
			var0[var7] = var0[var1];
			var0[var1] = var8;

			while (var5 < var6) {
				boolean var9 = true;

				int var10;
				int var11;
				int var12;
				do {
					--var6;

					for (var10 = 0; var10 < 4; ++var10) {
						if (var3[var10] == 2) {
							var11 = var0[var6].index;
							var12 = var8.index;
						} else if (var3[var10] == 1) {
							var11 = var0[var6].population;
							var12 = var8.population;
							if (var11 == -1 && var4[var10] == 1) {
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) {
								var12 = 2001;
							}
						} else if (var3[var10] == 3) {
							var11 = var0[var6].isMembersOnly() ? 1 : 0;
							var12 = var8.isMembersOnly() ? 1 : 0;
						} else {
							var11 = var0[var6].id;
							var12 = var8.id;
						}

						if (var12 != var11) {
							if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) {
								var9 = false;
							}
							break;
						}

						if (var10 == 3) {
							var9 = false;
						}
					}
				} while(var9);

				var9 = true;

				do {
					++var5;

					for (var10 = 0; var10 < 4; ++var10) {
						if (var3[var10] == 2) {
							var11 = var0[var5].index;
							var12 = var8.index;
						} else if (var3[var10] == 1) {
							var11 = var0[var5].population;
							var12 = var8.population;
							if (var11 == -1 && var4[var10] == 1) {
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) {
								var12 = 2001;
							}
						} else if (var3[var10] == 3) {
							var11 = var0[var5].isMembersOnly() ? 1 : 0;
							var12 = var8.isMembersOnly() ? 1 : 0;
						} else {
							var11 = var0[var5].id;
							var12 = var8.id;
						}

						if (var12 != var11) {
							if ((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) {
								var9 = false;
							}
							break;
						}

						if (var10 == 3) {
							var9 = false;
						}
					}
				} while(var9);

				if (var5 < var6) {
					World var13 = var0[var5];
					var0[var5] = var0[var6];
					var0[var6] = var13;
				}
			}

			sortWorlds(var0, var1, var6, var3, var4);
			sortWorlds(var0, var6 + 1, var2, var3, var4);
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1309784879"
	)
	public static boolean method7296(int var0) {
		return (var0 >> 22 & 1) != 0;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Ltq;I)Ljava/lang/Object;",
		garbageValue = "-1843828481"
	)
	static Object method7299(class518 var0) {
		if (var0 == null) {
			throw new IllegalStateException("popValueOfType() failure - null baseVarType");
		} else {
			switch(var0.field5104) {
			case 0:
				return Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize];
			case 2:
				return Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type");
			}
		}
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(Lhl;IIILdf;B)V",
		garbageValue = "0"
	)
	static void method7304(SequenceDefinition var0, int var1, int var2, int var3, Actor var4) {
		if (Client.soundEffectCount < 50) {
			if (var0.field2228 != null && var0.field2228.containsKey(var1)) {
				int var5 = (Integer)var0.field2228.get(var1) & 15;
				if ((var5 <= 0 || class93.clientPreferences.getAreaSoundEffectsVolume() != 0) && (var5 != 0 || class93.clientPreferences.getSoundEffectsVolume() != 0)) {
					class152.method3320((Integer)var0.field2228.get(var1), var2, var3, var4 == KeyHandler.localPlayer);
				}
			}
		}
	}
}
