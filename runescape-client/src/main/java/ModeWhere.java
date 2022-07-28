import java.util.Set;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.rs.ScriptOpcodes;
import java.util.Arrays;
import java.util.HashSet;
import net.runelite.mapping.Export;
@ObfuscatedName("lk")
@Implements("ModeWhere")
public enum ModeWhere implements MouseWheel {

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Llk;")
	field4138("", 0, new class327[]{ class327.field4100 }),
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Llk;")
	field4129("", 1, new class327[]{ class327.field4102, class327.field4100 }),
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Llk;")
	field4128("", 2, new class327[]{ class327.field4102, class327.field4101, class327.field4100 }),
	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Llk;")
	field4131("", 3, new class327[]{ class327.field4102 }),
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Llk;")
	field4130("", 4),
	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Llk;")
	field4133("", 5, new class327[]{ class327.field4102, class327.field4100 }),
	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "Llk;")
	field4132("", 6, new class327[]{ class327.field4100 }),
	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "Llk;")
	field4139("", 8, new class327[]{ class327.field4102, class327.field4100 }),
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Llk;")
	field4134("", 9, new class327[]{ class327.field4102, class327.field4101 }),
	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "Llk;")
	field4135("", 10, new class327[]{ class327.field4102 }),
	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "Llk;")
	field4136("", 11, new class327[]{ class327.field4102 }),
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "Llk;")
	field4137("", 12, new class327[]{ class327.field4102, class327.field4100 }),
	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "Llk;")
	field4126("", 13, new class327[]{ class327.field4102 });
	@ObfuscatedName("k")
	@Export("ByteArrayPool_arrays")
	static byte[][][] ByteArrayPool_arrays;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 1726511913)
	@Export("id")
	final int id;

	@ObfuscatedName("p")
	final Set field4140 = new HashSet();

	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I[Llp;)V")
	ModeWhere(String var3, int var4, class327[] var5) {
		this.id = var4;
		class327[] var6 = var5;
		for (int var7 = 0; var7 < var6.length; ++var7) {
			class327 var8 = var6[var7];
			this.field4140.add(var8);
		}
	}

	ModeWhere(String var3, int var4) {
		this.id = var4;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1790946346")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "116")
	public static void method6093() {
		synchronized(KeyHandler.KeyHandler_instance) {
			++KeyHandler.KeyHandler_idleCycles;
			KeyHandler.field148 = KeyHandler.field150;
			KeyHandler.field131 = 0;
			KeyHandler.field142 = 0;
			Arrays.fill(KeyHandler.field137, false);
			Arrays.fill(KeyHandler.field138, false);
			if (KeyHandler.field141 < 0) {
				Arrays.fill(KeyHandler.KeyHandler_pressedKeys, false);
				KeyHandler.field141 = KeyHandler.field140;
			} else {
				while (KeyHandler.field141 != KeyHandler.field140) {
					int var1 = KeyHandler.field139[KeyHandler.field140];
					KeyHandler.field140 = KeyHandler.field140 + 1 & 127;
					if (var1 < 0) {
						var1 = ~var1;
						if (KeyHandler.KeyHandler_pressedKeys[var1]) {
							KeyHandler.KeyHandler_pressedKeys[var1] = false;
							KeyHandler.field138[var1] = true;
							KeyHandler.field135[KeyHandler.field142] = var1;
							++KeyHandler.field142;
						}
					} else {
						if (!KeyHandler.KeyHandler_pressedKeys[var1] && KeyHandler.field131 < KeyHandler.field146.length - 1) {
							KeyHandler.field137[var1] = true;
							KeyHandler.field146[++KeyHandler.field131 - 1] = var1;
						}
						KeyHandler.KeyHandler_pressedKeys[var1] = true;
					}
				} 
			}
			if (KeyHandler.field131 > 0) {
				KeyHandler.KeyHandler_idleCycles = 0;
			}
			KeyHandler.field150 = KeyHandler.field144;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(IZI)Ljava/lang/String;", garbageValue = "792876957")
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		if (var1 && var0 >= 0) {
			int var3 = var0;
			String var2;
			if (var1 && var0 >= 0) {
				int var4 = 2;
				for (int var5 = var0 / 10; var5 != 0; ++var4) {
					var5 /= 10;
				}
				char[] var6 = new char[var4];
				var6[0] = '+';
				for (int var7 = var4 - 1; var7 > 0; --var7) {
					int var8 = var3;
					var3 /= 10;
					int var9 = var8 - var3 * 10;
					if (var9 >= 10) {
						var6[var7] = ((char) (var9 + 87));
					} else {
						var6[var7] = ((char) (var9 + 48));
					}
				}
				var2 = new String(var6);
			} else {
				var2 = Integer.toString(var0, 10);
			}
			return var2;
		} else {
			return Integer.toString(var0);
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(ILbc;ZI)I", garbageValue = "1976675323")
	static int method6095(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) {
			var7 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
			FileSystem.addGameMessage(0, "", var7);
			return 1;
		} else if (var0 == ScriptOpcodes.ANIM) {
			TaskHandler.Interpreter_intStackSize -= 2;
			Strings.performPlayerAnimation(class28.localPlayer, Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize], Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]);
			return 1;
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field840) {
				Interpreter.field831 = true;
			}
			return 1;
		} else {
			int var15;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
				var15 = 0;
				if (class126.isNumber(var7)) {
					var15 = class121.method2824(var7);
				}
				PacketBufferNode var13 = class433.getPacketBufferNode(ClientPacket.RESUME_COUNTDIALOG, Client.packetWriter.isaacCipher);
				var13.packetBuffer.writeInt(var15);
				Client.packetWriter.addNode(var13);
				return 1;
			} else {
				PacketBufferNode var11;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
					var11 = class433.getPacketBufferNode(ClientPacket.RESUME_NAMEDIALOG, Client.packetWriter.isaacCipher);
					var11.packetBuffer.writeByte(var7.length() + 1);
					var11.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var11);
					return 1;
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
					var11 = class433.getPacketBufferNode(ClientPacket.RESUME_STRINGDIALOG, Client.packetWriter.isaacCipher);
					var11.packetBuffer.writeByte(var7.length() + 1);
					var11.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var11);
					return 1;
				} else {
					String var4;
					int var10;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var10 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
						var4 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
						Projectile.method2008(var10, var4);
						return 1;
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						TaskHandler.Interpreter_intStackSize -= 3;
						var10 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
						var15 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
						int var9 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2];
						Widget var14 = FloorUnderlayDefinition.getWidget(var9);
						class19.clickWidget(var14, var10, var15);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						TaskHandler.Interpreter_intStackSize -= 2;
						var10 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
						var15 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
						Widget var12 = (var2) ? VertexNormal.scriptDotWidget : class321.scriptActiveWidget;
						class19.clickWidget(var12, var10, var15);
						return 1;
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						ObjectSound.mouseCam = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (class260.clientPreferences.method2312()) ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						class260.clientPreferences.method2311(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
						boolean var8 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
						class238.openURL(var7, var8, false);
						return 1;
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var10 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
						var11 = class433.getPacketBufferNode(ClientPacket.RESUME_OBJDIALOG, Client.packetWriter.isaacCipher);
						var11.packetBuffer.writeShort(var10);
						Client.packetWriter.addNode(var11);
						return 1;
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var10 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
						GrandExchangeOfferAgeComparator.Interpreter_stringStackSize -= 2;
						var4 = Interpreter.Interpreter_stringStack[GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
						String var5 = Interpreter.Interpreter_stringStack[GrandExchangeOfferAgeComparator.Interpreter_stringStackSize + 1];
						if (var4.length() > 500) {
							return 1;
						} else if (var5.length() > 500) {
							return 1;
						} else {
							PacketBufferNode var6 = class433.getPacketBufferNode(ClientPacket.field2999, Client.packetWriter.isaacCipher);
							var6.packetBuffer.writeShort(1 + class92.stringCp1252NullTerminatedByteSize(var4) + class92.stringCp1252NullTerminatedByteSize(var5));
							var6.packetBuffer.writeByteAdd(var10);
							var6.packetBuffer.writeStringCp1252NullTerminated(var5);
							var6.packetBuffer.writeStringCp1252NullTerminated(var4);
							Client.packetWriter.addNode(var6);
							return 1;
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						Client.shiftClickDrop = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2;
						}
						return 1;
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3;
						}
						return 1;
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5;
						}
						return 1;
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9;
						}
						return 1;
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						GrandExchangeEvents.setTapToDrop(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (class16.getTapToDrop()) ? 1 : 0;
						return 1;
					} else if (var0 == 3129) {
						TaskHandler.Interpreter_intStackSize -= 2;
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
						return 1;
					} else if (var0 == 3130) {
						TaskHandler.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3131) {
						--TaskHandler.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class352.canvasWidth;
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class228.canvasHeight;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--TaskHandler.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						TaskHandler.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3136) {
						Client.field603 = 3;
						Client.field660 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3137) {
						Client.field603 = 2;
						Client.field660 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3138) {
						Client.field603 = 0;
						return 1;
					} else if (var0 == 3139) {
						Client.field603 = 1;
						return 1;
					} else if (var0 == 3140) {
						Client.field603 = 3;
						Client.field660 = (var2) ? VertexNormal.scriptDotWidget.id : class321.scriptActiveWidget.id;
						return 1;
					} else {
						boolean var3;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
							class260.clientPreferences.method2389(var3);
							return 1;
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (class260.clientPreferences.method2326()) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
							Client.Login_isUsernameRemembered = var3;
							if (!var3) {
								class260.clientPreferences.method2330("");
							}
							return 1;
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (Client.Login_isUsernameRemembered) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1;
						} else if (var0 == 3146) {
							var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
							class260.clientPreferences.method2347(!var3);
							return 1;
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (class260.clientPreferences.method2316()) ? 0 : 1;
							return 1;
						} else if (var0 == 3148) {
							return 1;
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Login.Login_loadingPercent;
							return 1;
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = ArchiveDiskAction.method5786();
							return 1;
						} else if (var0 == 3155) {
							--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3156) {
							return 1;
						} else if (var0 == 3157) {
							TaskHandler.Interpreter_intStackSize -= 2;
							return 1;
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3161) {
							--TaskHandler.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3162) {
							--TaskHandler.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3163) {
							--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize;
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3164) {
							--TaskHandler.Interpreter_intStackSize;
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3165) {
							--TaskHandler.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3166) {
							TaskHandler.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3167) {
							TaskHandler.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3168) {
							TaskHandler.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3169) {
							return 1;
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3172) {
							--TaskHandler.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3173) {
							--TaskHandler.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3174) {
							--TaskHandler.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3176) {
							return 1;
						} else if (var0 == 3177) {
							return 1;
						} else if (var0 == 3178) {
							--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3179) {
							return 1;
						} else if (var0 == 3180) {
							--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3181) {
							WallDecoration.method4516(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]);
							return 1;
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class155.method3238();
							return 1;
						} else if (var0 != 3183 && var0 != 3184) {
							if (var0 == 3187) {
								GrandExchangeOfferAgeComparator.Interpreter_stringStackSize -= 2;
								return 1;
							} else {
								return var0 == 3188 ? 1 : 2;
							}
						} else {
							--TaskHandler.Interpreter_intStackSize;
							return 1;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(descriptor = "(Lku;I)Z", garbageValue = "1852484167")
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden;
	}
}