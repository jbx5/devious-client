import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("dy")
@Implements("UserComparator10")
public class UserComparator10 extends AbstractUserComparator {
	@ObfuscatedName("c")
	@Export("reversed")
	final boolean reversed;

	public UserComparator10(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lnm;Lnm;I)I", garbageValue = "1111240808")
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) {
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy(((Buddy) (var1)), ((Buddy) (var2)));
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(ILqt;I)Lfy;", garbageValue = "956626594")
	public static PlayerCompositionColorTextureOverride method2609(int var0, Buffer var1) {
		int var2 = var1.readUnsignedByte();
		boolean var3 = (var2 & 1) != 0;
		boolean var4 = (var2 & 2) != 0;
		PlayerCompositionColorTextureOverride var5 = new PlayerCompositionColorTextureOverride(var0);
		int var6;
		int[] var7;
		boolean var8;
		int var9;
		short var10;
		if (var3) {
			var6 = var1.readUnsignedByte();
			var7 = new int[]{ var6 & 15, var6 >> 4 & 15 };
			var8 = var5.playerCompositionRecolorTo != null && var7.length == var5.playerCompositionRecolorTo.length;
			for (var9 = 0; var9 < 2; ++var9) {
				if (var7[var9] != 15) {
					var10 = ((short) (var1.readUnsignedShort()));
					if (var8) {
						var5.playerCompositionRecolorTo[var7[var9]] = var10;
					}
				}
			}
		}
		if (var4) {
			var6 = var1.readUnsignedByte();
			var7 = new int[]{ var6 & 15, var6 >> 4 & 15 };
			var8 = var5.playerCompositionRetextureTo != null && var7.length == var5.playerCompositionRetextureTo.length;
			for (var9 = 0; var9 < 2; ++var9) {
				if (var7[var9] != 15) {
					var10 = ((short) (var1.readUnsignedShort()));
					if (var8) {
						var5.playerCompositionRetextureTo[var7[var9]] = var10;
					}
				}
			}
		}
		return var5;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "([BIIB)Z", garbageValue = "75")
	static final boolean method2611(byte[] var0, int var1, int var2) {
		boolean var3 = true;
		Buffer var4 = new Buffer(var0);
		int var5 = -1;
		label68 : while (true) {
			int var6 = var4.readIncrSmallSmart();
			if (var6 == 0) {
				return var3;
			}
			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				int var9;
				while (!var8) {
					var9 = var4.readUShortSmart();
					if (var9 == 0) {
						continue label68;
					}
					var7 += var9 - 1;
					int var10 = var7 & 63;
					int var11 = var7 >> 6 & 63;
					int var12 = var4.readUnsignedByte() >> 2;
					int var13 = var11 + var1;
					int var14 = var10 + var2;
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) {
						ObjectComposition var15 = class162.getObjectDefinition(var5);
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) {
							if (!var15.needsModelFiles()) {
								++Client.field547;
								var3 = false;
							}
							var8 = true;
						}
					}
				} 
				var9 = var4.readUShortSmart();
				if (var9 == 0) {
					break;
				}
				var4.readUnsignedByte();
			} 
		} 
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(ILbi;ZB)I", garbageValue = "80")
	static int method2605(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.cycle;
			return 1;
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) {
				class446.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = class152.method3147(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_GETNUM) {
				class446.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Archive.ItemContainer_getCount(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_TOTAL) {
				class446.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Bounds.method6922(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_SIZE) {
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Calendar.getInvDefinition(var3).size;
				return 1;
			} else if (var0 == ScriptOpcodes.STAT) {
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.currentLevels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_BASE) {
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.levels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_XP) {
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.experience[var3];
				return 1;
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) {
					var3 = PacketWriter.Client_plane;
					var4 = (class101.localPlayer.x >> 7) + class28.baseX;
					var5 = (class101.localPlayer.y >> 7) + WorldMapLabelSize.baseY;
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDX) {
					var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3 >> 14 & 16383;
					return 1;
				} else if (var0 == ScriptOpcodes.COORDZ) {
					var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3 >> 28;
					return 1;
				} else if (var0 == ScriptOpcodes.COORDY) {
					var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3 & 16383;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (Client.isMembersWorld) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) {
					class446.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = class152.method3147(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) {
					class446.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Archive.ItemContainer_getCount(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) {
					class446.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Bounds.method6922(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) {
					if (Client.staffModLevel >= 2) {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
					}
					return 1;
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.rebootTimer;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_WORLD) {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.worldId;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.runEnergy;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.weight;
					return 1;
				} else if (var0 == ScriptOpcodes.PLAYERMOD) {
					if (Client.playerMod) {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
					}
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.worldProperties;
					return 1;
				} else if (var0 == ScriptOpcodes.MOVECOORD) {
					class446.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2];
					int var6 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 3];
					var3 += var4 << 14;
					var3 += var5 << 28;
					var3 += var6;
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3;
					return 1;
				} else if (var0 == 3326) {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.field605;
					return 1;
				} else if (var0 == 3327) {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.field647;
					return 1;
				} else {
					return 2;
				}
			}
		}
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(descriptor = "(IIIILqe;Lkp;I)V", garbageValue = "-860665579")
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2;
		if (var6 > 4225 && var6 < 90000) {
			int var7 = Client.camAngleY & 2047;
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7];
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7];
			int var10 = var9 * var2 + var3 * var8 >> 16;
			int var11 = var3 * var9 - var8 * var2 >> 16;
			double var12 = Math.atan2(((double) (var10)), ((double) (var11)));
			int var14 = var5.width / 2 - 25;
			int var15 = ((int) (Math.sin(var12) * ((double) (var14))));
			int var16 = ((int) (Math.cos(var12) * ((double) (var14))));
			byte var17 = 20;
			class344.redHintArrowSprite.method8179(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
		} else {
			ParamComposition.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5);
		}
	}

	@ObfuscatedName("lq")
	@ObfuscatedSignature(descriptor = "(Lkb;B)Lkb;", garbageValue = "111")
	static Widget method2610(Widget var0) {
		int var1 = class134.method2906(class124.getWidgetFlags(var0));
		if (var1 == 0) {
			return null;
		} else {
			for (int var2 = 0; var2 < var1; ++var2) {
				var0 = class140.getWidget(var0.parentId);
				if (var0 == null) {
					return null;
				}
			}
			return var0;
		}
	}
}