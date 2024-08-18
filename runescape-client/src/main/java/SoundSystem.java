import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ba")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("archive2")
	static Archive archive2;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lbi;"
	)
	@Export("players")
	volatile PcmPlayer[] players;

	SoundSystem() {
		this.players = new PcmPlayer[2];
	}

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) {
				PcmPlayer var2 = this.players[var1];
				if (var2 != null) {
					var2.run();
				}
			}
		} catch (Exception var4) {
			Script.RunException_sendStackTrace((String)null, var4);
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "480249071"
	)
	public static void method821() {
		FileSystem.FileSystem_cacheFiles.clear();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)Ldp;",
		garbageValue = "1389668640"
	)
	@Export("getScript")
	static Script getScript(int var0, int var1) {
		Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16));
		if (var2 != null) {
			return var2;
		} else {
			String var3 = String.valueOf(var0);
			int var4 = RestClientThreadFactory.archive12.getGroupId(var3);
			if (var4 == -1) {
				return null;
			} else {
				byte[] var5 = RestClientThreadFactory.archive12.takeFileFlat(var4);
				if (var5 != null) {
					if (var5.length <= 1) {
						return null;
					}

					var2 = Script.newScript(var5);
					if (var2 != null) {
						Script.Script_cached.put(var2, (long)(var0 << 16));
						return var2;
					}
				}

				return null;
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILdp;ZS)I",
		garbageValue = "-25365"
	)
	static int method819(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) {
			var3 = FloorUnderlayDefinition.widgetDefinition.method6544(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) {
			var3 = FloorUnderlayDefinition.widgetDefinition.method6544(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.IF_HASSUB) {
			int var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var5);
			if (var4 != null) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTOP) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.rootInterface;
			return 1;
		} else if (var0 == 2707) {
			var3 = FloorUnderlayDefinition.widgetDefinition.method6544(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method6960() ? 1 : 0;
			return 1;
		} else if (var0 == 2708) {
			var3 = FloorUnderlayDefinition.widgetDefinition.method6544(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
			return AbstractSocket.method8789(var3);
		} else if (var0 == 2709) {
			var3 = FloorUnderlayDefinition.widgetDefinition.method6544(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
			return StructComposition.method5054(var3);
		} else {
			return 2;
		}
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(Lmy;B)V",
		garbageValue = "-116"
	)
	static final void method820(class322 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		byte var13;
		byte var14;
		int var15;
		int var16;
		if (class322.field3368 == var0) {
			byte var2 = var1.readByteAdd();
			var3 = var1.readUnsignedByteSub();
			var4 = (var3 >> 4 & 7) + class167.field1798;
			var5 = (var3 & 7) + class499.field5058;
			var6 = var1.readUnsignedShortLE();
			var7 = var1.readUnsignedByteSub();
			var8 = var7 >> 2;
			var9 = var7 & 3;
			var10 = Client.field581[var8];
			var11 = var1.readUnsignedShort();
			byte var12 = var1.readByte();
			var13 = var1.readByteNeg();
			var14 = var1.readByte();
			var15 = var1.readUnsignedShort();
			var16 = var1.readUnsignedShortAdd();
			Player var17;
			if (var15 == Client.localPlayerIndex) {
				var17 = class253.localPlayer;
			} else {
				var17 = class328.worldView.players[var15];
			}

			if (var17 != null) {
				int var18 = Client.field582 == -1 ? class328.worldView.plane : Client.field582;
				UserList.method8691(var18, var4, var5, var8, var9, var10, var6, var16, var11, var13, var12, var14, var2, var17);
			}
		}

		int var23;
		if (class322.field3363 == var0) {
			var23 = var1.readUnsignedByteSub();
			var3 = var1.readUnsignedShort();
			var4 = var1.readUnsignedByteNeg();
			var5 = (var4 >> 4 & 7) + class167.field1798;
			var6 = (var4 & 7) + class499.field5058;
			var7 = class328.worldView.plane;
			if (var5 >= 0 && var6 >= 0 && var5 < class328.worldView.sizeX && var6 < class328.worldView.sizeY) {
				NodeDeque var19 = class328.worldView.groundItems[var7][var5][var6];
				if (var19 != null) {
					for (TileItem var29 = (TileItem)var19.last(); var29 != null; var29 = (TileItem)var19.previous()) {
						if ((var3 & 32767) == var29.id) {
							var29.setFlag(var23);
							break;
						}
					}
				}

				if (var5 >= 0 && var6 >= 0 && var5 < class328.worldView.sizeX && var6 < class328.worldView.sizeY) {
					var9 = Client.field582 == -1 ? class328.worldView.plane : Client.field582;
					class145.method3322(var9, var5, var6, var3, var23);
				}

				return;
			}
		}

		if (class322.field3370 == var0) {
			var23 = var1.readUnsignedByte();
			var3 = (var23 >> 4 & 7) + class167.field1798;
			var4 = (var23 & 7) + class499.field5058;
			var5 = var1.readUnsignedByteSub();
			var6 = var5 >> 2;
			var7 = var5 & 3;
			var8 = Client.field581[var6];
			if (var3 >= 0 && var4 >= 0 && var3 < class328.worldView.sizeX && var4 < class328.worldView.sizeY) {
				var9 = Client.field582 == -1 ? class328.worldView.plane : Client.field582;
				TaskHandler.method4572(class328.worldView, var9, var3, var4, var8, -1, var6, var7, 31, 0, -1);
			}

		} else {
			int var25;
			if (class322.field3362 == var0) {
				var23 = var1.readUnsignedShortAddLE();
				boolean var24 = var1.readUnsignedByteNeg() == 1;
				var4 = var1.readUnsignedIntLE();
				var5 = var1.readUnsignedByteSub();
				var6 = var1.readUnsignedShortLE();
				var7 = var1.readUnsignedShortAdd();
				var8 = var1.readUnsignedByteSub();
				var9 = (var8 >> 4 & 7) + class167.field1798;
				var10 = (var8 & 7) + class499.field5058;
				var11 = var1.readUnsignedByteSub();
				if (var9 >= 0 && var10 >= 0 && var9 < class328.worldView.sizeX && var10 < class328.worldView.sizeY) {
					var25 = Client.field582 == -1 ? class328.worldView.plane : Client.field582;
					class319.addTileItemToGroundItems(var25, var9, var10, var23, var4, var5, var6, var7, var11, var24);
				}

			} else if (class322.field3367 == var0) {
				var23 = var1.readUnsignedByteNeg();
				var3 = var23 >> 2;
				var4 = var23 & 3;
				var5 = Client.field581[var3];
				var6 = var1.readUnsignedByte();
				var7 = (var6 >> 4 & 7) + class167.field1798;
				var8 = (var6 & 7) + class499.field5058;
				var9 = var1.readUnsignedByteNeg();
				var10 = var1.readUnsignedShortLE();
				if (var7 >= 0 && var8 >= 0 && var7 < class328.worldView.sizeX && var8 < class328.worldView.sizeY) {
					var11 = Client.field582 == -1 ? class328.worldView.plane : Client.field582;
					TaskHandler.method4572(class328.worldView, var11, var7, var8, var5, var10, var3, var4, var9, 0, -1);
				}

			} else if (class322.field3371 == var0) {
				var23 = var1.readUnsignedByteAdd();
				var3 = var23 >> 2;
				var4 = var23 & 3;
				var5 = Client.field581[var3];
				var6 = var1.readUnsignedByte();
				var7 = (var6 >> 4 & 7) + class167.field1798;
				var8 = (var6 & 7) + class499.field5058;
				var9 = var1.readUnsignedShortLE();
				if (0 <= var7 && var7 < 103 && 0 <= var8 && var8 < 103) {
					var10 = Client.field582 == -1 ? class328.worldView.plane : Client.field582;
					PendingSpawn var21 = class139.method3254(class328.worldView, var10, var7, var8, var5);
					if (var21 != null) {
						ObjectComposition var22 = class222.getObjectDefinition(var21.field1171);
						if (var22.field2743) {
							var21.field1174 = var9;
							return;
						}
					}

					boolean var26 = PlayerType.method7185(var10, var7, var8, var3, var4, var5, var9);
					if (var26) {
						return;
					}

					if (var21 != null) {
						var21.field1174 = var9;
					}
				}

			} else if (class322.field3364 == var0) {
				var23 = var1.readUnsignedIntIME();
				var3 = var1.readUnsignedShortAdd();
				var4 = var1.readUnsignedIntLE();
				var5 = var1.readUnsignedByteNeg();
				var6 = (var5 >> 4 & 7) + class167.field1798;
				var7 = (var5 & 7) + class499.field5058;
				if (var6 >= 0 && var7 >= 0 && var6 < class328.worldView.sizeX && var7 < class328.worldView.sizeY) {
					var8 = Client.field582 == -1 ? class328.worldView.plane : Client.field582;
					WorldMapAreaData.method6038(var8, var6, var7, var3, var23, var4);
				}

			} else if (class322.field3366 == var0) {
				var23 = var1.readUnsignedByteSub();
				var3 = var1.readUnsignedByte();
				var4 = var1.readUnsignedByte();
				var5 = (var4 >> 4 & 7) + class167.field1798;
				var6 = (var4 & 7) + class499.field5058;
				var7 = var1.readUnsignedShortAdd();
				var8 = var1.readUnsignedByte() & 31;
				var9 = var1.readUnsignedByteNeg();
				if (var5 >= 0 && var6 >= 0 && var5 < class328.worldView.sizeX && var6 < class328.worldView.sizeY) {
					var10 = var8 + 1;
					if (class253.localPlayer.pathX[0] >= var5 - var10 && class253.localPlayer.pathX[0] <= var5 + var10 && class253.localPlayer.pathY[0] >= var6 - var10 && class253.localPlayer.pathY[0] <= var6 + var10 && TileItem.clientPreferences.getAreaSoundEffectsVolume() != 0 && var3 > 0 && Client.soundEffectCount < 50) {
						Client.soundEffectIds[Client.soundEffectCount] = var7;
						Client.soundEffects[Client.soundEffectCount] = null;
						Client.soundLocations[Client.soundEffectCount] = var8 + (var6 << 8) + (var5 << 16);
						Client.queuedSoundEffectLoops[Client.soundEffectCount] = var3;
						Client.queuedSoundEffectDelays[Client.soundEffectCount] = var23;
						Client.field756[Client.soundEffectCount] = var9;
						++Client.soundEffectCount;
					}
				}

			} else if (class322.field3365 == var0) {
				var23 = var1.readUnsignedShort();
				var3 = var1.readUnsignedIntIME();
				var4 = var1.readUnsignedByteAdd();
				var5 = (var4 >> 4 & 7) + class167.field1798;
				var6 = (var4 & 7) + class499.field5058;
				var7 = class328.worldView.plane;
				if (0 <= var5 && var5 < 104 && 0 <= var6 && var6 < 104) {
					var8 = Client.field582 == -1 ? var7 : Client.field582;
					Language.method7502(var8, var5, var6, var23, var3);
				}

			} else if (class322.field3361 == var0) {
				var23 = var1.readUnsignedByteSub();
				var3 = (var23 >> 4 & 7) + class167.field1798;
				var4 = (var23 & 7) + class499.field5058;
				var5 = var1.readUnsignedByteNeg();
				var6 = var1.readUnsignedShort();
				var7 = var1.readUnsignedShort();
				if (var3 >= 0 && var4 >= 0 && var3 < class328.worldView.sizeX && var4 < class328.worldView.sizeY) {
					var3 = class378.method7167(var3);
					var4 = class378.method7167(var4);
					var8 = Client.field582 == -1 ? class328.worldView.plane : Client.field582;
					GraphicsObject var20 = new GraphicsObject(var6, var8, var3, var4, class162.getTileHeight(class328.worldView, var3, var4, var8) - var5, var7, Client.cycle);
					class328.worldView.graphicsObjects.addFirst(var20);
				}

			} else if (class322.field3369 == var0) {
				var23 = var1.readUnsignedByte();
				var3 = var1.readUnsignedShortLE();
				var4 = var1.method9840();
				var5 = var1.readUnsignedByteNeg();
				var6 = (var5 >> 4 & 7) + class167.field1798;
				var7 = (var5 & 7) + class499.field5058;
				var8 = var1.readUnsignedByteAdd() * 4;
				var9 = var1.readUnsignedByteSub() * 4;
				var10 = var1.readUnsignedShort();
				var11 = var1.readUnsignedShortAddLE();
				var25 = var1.method9657();
				var13 = var1.readByte();
				var14 = var1.readByteAdd();
				var15 = var1.readUnsignedShortAddLE();
				int var27 = var13 + var6;
				int var28 = var14 + var7;
				if (var6 >= 0 && var7 >= 0 && var6 < class328.worldView.sizeX && var7 < class328.worldView.sizeY && var27 >= 0 && var28 >= 0 && var27 < class328.worldView.sizeX && var28 < class328.worldView.sizeY && var15 != 65535) {
					var16 = Client.field582 == -1 ? class328.worldView.plane : Client.field582;
					class155.method3404(var16, var6, var7, var27, var28, var4, var15, var9, var8, var11, var3, var23, var10, var25);
				}

			}
		}
	}

	@ObfuscatedName("pn")
	@ObfuscatedSignature(
		descriptor = "(Lce;B)V",
		garbageValue = "-14"
	)
	@Export("updateLoginState")
	static void updateLoginState(LoginState var0) {
		if (class33.loginState != var0) {
			class33.loginState = var0;
		}
	}
}
