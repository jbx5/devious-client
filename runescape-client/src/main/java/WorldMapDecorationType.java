import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("od")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4011(0, 0),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4025(1, 0),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4027(2, 0),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4032(3, 0),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4013(9, 2),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4014(4, 1),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4026(5, 1),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4016(6, 1),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4017(7, 1),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4018(8, 1),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4019(12, 2),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4020(13, 2),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4021(14, 2),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4022(15, 2),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4015(16, 2),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4024(17, 2),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4009(18, 2),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4012(19, 2),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4023(20, 2),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4028(21, 2),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4029(10, 2),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4030(11, 2),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4031(22, 3);

	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 857911705
	)
	@Export("id")
	public final int id;

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	WorldMapDecorationType(int var3, int var4) {
		this.id = var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2071992588"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1685984504"
	)
	public static int method7062(int var0) {
		return class432.method8071(ViewportMouse.ViewportMouse_entityTags[var0]);
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "1338980294"
	)
	static int method7053(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) {
			class130.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
			EnumComposition var10 = Bounds.getEnum(var3);
			if (var10.outputType != 's') {
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) {
				if (var9 == var10.keys[var6]) {
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var10.strVals[var6];
					var10 = null;
					break;
				}
			}

			if (var10 != null) {
				Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1;
		} else if (var0 != ScriptOpcodes.ENUM) {
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) {
				var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
				EnumComposition var4 = Bounds.getEnum(var3);
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4.size();
				return 1;
			} else {
				return 2;
			}
		} else {
			class130.Interpreter_intStackSize -= 4;
			var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2];
			var6 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 3];
			EnumComposition var7 = Bounds.getEnum(var5);
			if (var3 == var7.inputType && var9 == var7.outputType) {
				for (int var8 = 0; var8 < var7.outputCount; ++var8) {
					if (var6 == var7.keys[var8]) {
						if (var9 == 115) {
							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7.intVals[var8];
						}

						var7 = null;
						break;
					}
				}

				if (var7 != null) {
					if (var9 == 115) {
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7.defaultInt;
					}
				}

				return 1;
			} else {
				if (var9 == 115) {
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1963335579"
	)
	static final void method7065(int var0, int var1, int var2) {
		if (class47.cameraX < var0) {
			class47.cameraX = (var0 - class47.cameraX) * NpcOverrides.field1983 / 1000 + class47.cameraX + VarpDefinition.field1879;
			if (class47.cameraX > var0) {
				class47.cameraX = var0;
			}
		}

		if (class47.cameraX > var0) {
			class47.cameraX -= (class47.cameraX - var0) * NpcOverrides.field1983 / 1000 + VarpDefinition.field1879;
			if (class47.cameraX < var0) {
				class47.cameraX = var0;
			}
		}

		if (class328.cameraY < var1) {
			class328.cameraY = (var1 - class328.cameraY) * NpcOverrides.field1983 / 1000 + class328.cameraY + VarpDefinition.field1879;
			if (class328.cameraY > var1) {
				class328.cameraY = var1;
			}
		}

		if (class328.cameraY > var1) {
			class328.cameraY -= (class328.cameraY - var1) * NpcOverrides.field1983 / 1000 + VarpDefinition.field1879;
			if (class328.cameraY < var1) {
				class328.cameraY = var1;
			}
		}

		if (class60.cameraZ < var2) {
			class60.cameraZ = (var2 - class60.cameraZ) * NpcOverrides.field1983 / 1000 + class60.cameraZ + VarpDefinition.field1879;
			if (class60.cameraZ > var2) {
				class60.cameraZ = var2;
			}
		}

		if (class60.cameraZ > var2) {
			class60.cameraZ -= (class60.cameraZ - var2) * NpcOverrides.field1983 / 1000 + VarpDefinition.field1879;
			if (class60.cameraZ < var2) {
				class60.cameraZ = var2;
			}
		}

	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(Ldb;I)Z",
		garbageValue = "1562370845"
	)
	static boolean method7063(Player var0) {
		if (Client.drawPlayerNames == 0) {
			return false;
		} else {
			boolean var1;
			if (SoundCache.localPlayer == var0) {
				var1 = (Client.drawPlayerNames & 8) != 0;
				return var1;
			} else {
				var1 = Canvas.method320() || class325.method6119() && var0.isFriend();
				if (!var1) {
					boolean var2 = (Client.drawPlayerNames & 2) != 0;
					var1 = var2 && var0.isFriendsChatMember();
				}

				return var1;
			}
		}
	}
}
