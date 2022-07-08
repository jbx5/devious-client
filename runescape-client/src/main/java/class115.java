import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.io.IOException;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("dc")
public class class115 {
	@ObfuscatedName("b")
	@Export("operatingSystemName")
	static String operatingSystemName;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -119583879)
	public final int field1448;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Ldc;")
	public class115 field1440;

	@ObfuscatedName("q")
	float[][] field1435;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "[Lny;")
	final class387[] field1433;

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "[Lny;")
	class387[] field1437;

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "[Lny;")
	class387[] field1438;

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "Lny;")
	class387 field1449;

	@ObfuscatedName("w")
	boolean field1441;

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "Lny;")
	class387 field1434;

	@ObfuscatedName("i")
	boolean field1442;

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lny;")
	class387 field1443;

	@ObfuscatedName("t")
	float[][] field1444;

	@ObfuscatedName("z")
	float[][] field1439;

	@ObfuscatedName("r")
	float[][] field1446;

	@ObfuscatedSignature(descriptor = "(ILqt;Z)V")
	public class115(int var1, Buffer var2, boolean var3) {
		this.field1449 = new class387();
		this.field1441 = true;
		this.field1434 = new class387();
		this.field1442 = true;
		this.field1443 = new class387();
		this.field1448 = var2.readShort();
		this.field1433 = new class387[var1];
		this.field1437 = new class387[this.field1433.length];
		this.field1438 = new class387[this.field1433.length];
		this.field1435 = new float[this.field1433.length][3];
		for (int var4 = 0; var4 < this.field1433.length; ++var4) {
			this.field1433[var4] = new class387(var2, var3);
			this.field1435[var4][0] = var2.method7740();
			this.field1435[var4][1] = var2.method7740();
			this.field1435[var4][2] = var2.method7740();
		}
		this.method2652();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "654014719")
	void method2652() {
		this.field1444 = new float[this.field1433.length][3];
		this.field1439 = new float[this.field1433.length][3];
		this.field1446 = new float[this.field1433.length][3];
		class387 var1 = MenuAction.method1884();
		for (int var2 = 0; var2 < this.field1433.length; ++var2) {
			class387 var3 = this.method2653(var2);
			var1.method6973(var3);
			var1.method6970();
			this.field1444[var2] = var1.method6959();
			this.field1439[var2][0] = var3.field4394[12];
			this.field1439[var2][1] = var3.field4394[13];
			this.field1439[var2][2] = var3.field4394[14];
			this.field1446[var2] = var3.method6992();
		}
		var1.method6968();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(II)Lny;", garbageValue = "1273342901")
	class387 method2653(int var1) {
		return this.field1433[var1];
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(II)Lny;", garbageValue = "437863053")
	class387 method2658(int var1) {
		if (this.field1437[var1] == null) {
			this.field1437[var1] = new class387(this.method2653(var1));
			if (this.field1440 != null) {
				this.field1437[var1].method6962(this.field1440.method2658(var1));
			} else {
				this.field1437[var1].method6962(class387.field4397);
			}
		}
		return this.field1437[var1];
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(IS)Lny;", garbageValue = "-31759")
	class387 method2655(int var1) {
		if (this.field1438[var1] == null) {
			this.field1438[var1] = new class387(this.method2658(var1));
			this.field1438[var1].method6970();
		}
		return this.field1438[var1];
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(Lny;I)V", garbageValue = "1315349364")
	void method2656(class387 var1) {
		this.field1449.method6973(var1);
		this.field1441 = true;
		this.field1442 = true;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(I)Lny;", garbageValue = "-1989832149")
	class387 method2657() {
		return this.field1449;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(I)Lny;", garbageValue = "240378906")
	class387 method2681() {
		if (this.field1441) {
			this.field1434.method6973(this.method2657());
			if (this.field1440 != null) {
				this.field1434.method6962(this.field1440.method2681());
			}
			this.field1441 = false;
		}
		return this.field1434;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(II)Lny;", garbageValue = "65631141")
	public class387 method2651(int var1) {
		if (this.field1442) {
			this.field1443.method6973(this.method2655(var1));
			this.field1443.method6962(this.method2681());
			this.field1442 = false;
		}
		return this.field1443;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(IS)[F", garbageValue = "180")
	float[] method2660(int var1) {
		return this.field1444[var1];
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(II)[F", garbageValue = "379318512")
	float[] method2661(int var1) {
		return this.field1439[var1];
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(II)[F", garbageValue = "1659744707")
	float[] method2679(int var1) {
		return this.field1446[var1];
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(B)J", garbageValue = "-27")
	public static synchronized final long method2692() {
		long var0 = System.currentTimeMillis();
		if (var0 < class268.field3170) {
			class393.field4425 += class268.field3170 - var0;
		}
		class268.field3170 = var0;
		return class393.field4425 + var0;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(ZB)V", garbageValue = "-71")
	public static void method2693(boolean var0) {
		if (NetCache.NetCache_socket != null) {
			try {
				Buffer var1 = new Buffer(4);
				var1.writeByte(var0 ? 2 : 3);
				var1.writeMedium(0);
				NetCache.NetCache_socket.write(var1.array, 0, 4);
			} catch (IOException var4) {
				try {
					NetCache.NetCache_socket.close();
				} catch (Exception var3) {
				}
				++NetCache.NetCache_ioExceptions;
				NetCache.NetCache_socket = null;
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Llh;Llh;I)Z", garbageValue = "609480846")
	public static boolean method2691(AbstractArchive var0, AbstractArchive var1) {
		class121.WorldMapElement_archive = var1;
		if (!var0.isFullyLoaded()) {
			return false;
		} else {
			WorldMapElement.WorldMapElement_count = var0.getGroupFileCount(35);
			WorldMapElement.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count];
			for (int var2 = 0; var2 < WorldMapElement.WorldMapElement_count; ++var2) {
				byte[] var3 = var0.takeFile(35, var2);
				WorldMapElement.WorldMapElement_cached[var2] = new WorldMapElement(var2);
				if (var3 != null) {
					WorldMapElement.WorldMapElement_cached[var2].decode(new Buffer(var3));
					WorldMapElement.WorldMapElement_cached[var2].method3377();
				}
			}
			return true;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(ILbi;ZI)I", garbageValue = "-298256181")
	static int method2682(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) {
			var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
			class290.addGameMessage(0, "", var7);
			return 1;
		} else if (var0 == ScriptOpcodes.ANIM) {
			class446.Interpreter_intStackSize -= 2;
			class65.performPlayerAnimation(class101.localPlayer, Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]);
			return 1;
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field842) {
				Interpreter.field829 = true;
			}
			return 1;
		} else {
			int var15;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
				var15 = 0;
				if (class114.isNumber(var7)) {
					var15 = FaceNormal.method4344(var7);
				}
				PacketBufferNode var13 = EnumComposition.getPacketBufferNode(ClientPacket.RESUME_COUNTDIALOG, Client.packetWriter.isaacCipher);
				var13.packetBuffer.writeInt(var15);
				Client.packetWriter.addNode(var13);
				return 1;
			} else {
				PacketBufferNode var11;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					var11 = EnumComposition.getPacketBufferNode(ClientPacket.RESUME_NAMEDIALOG, Client.packetWriter.isaacCipher);
					var11.packetBuffer.writeByte(var7.length() + 1);
					var11.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var11);
					return 1;
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					var11 = EnumComposition.getPacketBufferNode(ClientPacket.RESUME_STRINGDIALOG, Client.packetWriter.isaacCipher);
					var11.packetBuffer.writeByte(var7.length() + 1);
					var11.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var11);
					return 1;
				} else {
					String var4;
					int var10;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var10 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
						var4 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
						Coord.method5549(var10, var4);
						return 1;
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						class446.Interpreter_intStackSize -= 3;
						var10 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
						var15 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
						int var9 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2];
						Widget var14 = class140.getWidget(var9);
						class161.clickWidget(var14, var10, var15);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						class446.Interpreter_intStackSize -= 2;
						var10 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
						var15 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
						Widget var12 = (var2) ? class124.scriptDotWidget : GrandExchangeOfferOwnWorldComparator.scriptActiveWidget;
						class161.clickWidget(var12, var10, var15);
						return 1;
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						class122.mouseCam = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (class19.clientPreferences.method2245()) ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						class19.clientPreferences.method2339(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
						boolean var8 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
						class258.openURL(var7, var8, false);
						return 1;
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var10 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
						var11 = EnumComposition.getPacketBufferNode(ClientPacket.RESUME_OBJDIALOG, Client.packetWriter.isaacCipher);
						var11.packetBuffer.writeShort(var10);
						Client.packetWriter.addNode(var11);
						return 1;
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var10 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStackSize -= 2;
						var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
						String var5 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
						if (var4.length() > 500) {
							return 1;
						} else if (var5.length() > 500) {
							return 1;
						} else {
							PacketBufferNode var6 = EnumComposition.getPacketBufferNode(ClientPacket.field2951, Client.packetWriter.isaacCipher);
							var6.packetBuffer.writeShort(1 + ScriptEvent.stringCp1252NullTerminatedByteSize(var4) + ScriptEvent.stringCp1252NullTerminatedByteSize(var5));
							var6.packetBuffer.writeStringCp1252NullTerminated(var5);
							var6.packetBuffer.writeByteAdd(var10);
							var6.packetBuffer.writeStringCp1252NullTerminated(var4);
							Client.packetWriter.addNode(var6);
							return 1;
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						Client.shiftClickDrop = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2;
						}
						return 1;
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3;
						}
						return 1;
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5;
						}
						return 1;
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9;
						}
						return 1;
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						class9.setTapToDrop(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (HorizontalAlignment.getTapToDrop()) ? 1 : 0;
						return 1;
					} else if (var0 == 3129) {
						class446.Interpreter_intStackSize -= 2;
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
						return 1;
					} else if (var0 == 3130) {
						class446.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3131) {
						--class446.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Script.canvasWidth;
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = class78.canvasHeight;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--class446.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						class446.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3136) {
						Client.field656 = 3;
						Client.field657 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3137) {
						Client.field656 = 2;
						Client.field657 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3138) {
						Client.field656 = 0;
						return 1;
					} else if (var0 == 3139) {
						Client.field656 = 1;
						return 1;
					} else if (var0 == 3140) {
						Client.field656 = 3;
						Client.field657 = (var2) ? class124.scriptDotWidget.id * -1598663557 * -1038587213 : GrandExchangeOfferOwnWorldComparator.scriptActiveWidget.id * -1598663557 * -1038587213;
						return 1;
					} else {
						boolean var3;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
							class19.clientPreferences.method2246(var3);
							return 1;
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (class19.clientPreferences.method2247()) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
							Client.Login_isUsernameRemembered = var3;
							if (!var3) {
								class19.clientPreferences.method2260("");
							}
							return 1;
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (Client.Login_isUsernameRemembered) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1;
						} else if (var0 == 3146) {
							var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
							class19.clientPreferences.method2248(!var3);
							return 1;
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (class19.clientPreferences.method2317()) ? 0 : 1;
							return 1;
						} else if (var0 == 3148) {
							return 1;
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Login.Login_loadingPercent;
							return 1;
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = class117.method2719();
							return 1;
						} else if (var0 == 3155) {
							--Interpreter.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3156) {
							return 1;
						} else if (var0 == 3157) {
							class446.Interpreter_intStackSize -= 2;
							return 1;
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3161) {
							--class446.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3162) {
							--class446.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3163) {
							--Interpreter.Interpreter_stringStackSize;
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3164) {
							--class446.Interpreter_intStackSize;
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3165) {
							--class446.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3166) {
							class446.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3167) {
							class446.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3168) {
							class446.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3169) {
							return 1;
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3172) {
							--class446.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3173) {
							--class446.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3174) {
							--class446.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3176) {
							return 1;
						} else if (var0 == 3177) {
							return 1;
						} else if (var0 == 3178) {
							--Interpreter.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3179) {
							return 1;
						} else if (var0 == 3180) {
							--Interpreter.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3181) {
							WorldMapEvent.method5120(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]);
							return 1;
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = class193.method3919();
							return 1;
						} else if (var0 != 3183 && var0 != 3184) {
							if (var0 == 3187) {
								Interpreter.Interpreter_stringStackSize -= 2;
								return 1;
							} else {
								return var0 == 3188 ? 1 : 2;
							}
						} else {
							--class446.Interpreter_intStackSize;
							return 1;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "990148531")
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			class19.clientPreferences.method2339(!class19.clientPreferences.method2245());
			if (class19.clientPreferences.method2245()) {
				class290.addGameMessage(99, "", "Roofs are now all hidden");
			} else {
				class290.addGameMessage(99, "", "Roofs will only be removed selectively");
			}
		}
		if (var0.equalsIgnoreCase("displayfps")) {
			class19.clientPreferences.method2251();
		}
		if (var0.equalsIgnoreCase("renderself")) {
			Client.renderSelf = !Client.renderSelf;
		}
		if (var0.equalsIgnoreCase("mouseovertext")) {
			Client.showMouseOverText = !Client.showMouseOverText;
		}
		if (Client.staffModLevel >= 2) {
			if (var0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (var0.equalsIgnoreCase("showcoord")) {
				class121.worldMap.showCoord = !class121.worldMap.showCoord;
			}
			if (var0.equalsIgnoreCase("fpson")) {
				class19.clientPreferences.method2250(true);
			}
			if (var0.equalsIgnoreCase("fpsoff")) {
				class19.clientPreferences.method2250(false);
			}
			if (var0.equalsIgnoreCase("gc")) {
				System.gc();
			}
			if (var0.equalsIgnoreCase("clientdrop")) {
				class131.method2877();
			}
		}
		PacketBufferNode var1 = EnumComposition.getPacketBufferNode(ClientPacket.DOCHEAT, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(var0.length() + 1);
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}
}