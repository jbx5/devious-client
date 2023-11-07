import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fi")
class class138 implements Callable {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	final class139 this$0;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Luj;"
	)
	final Buffer val$p;
	// $FF: synthetic field
	final int val$version;

	@ObfuscatedSignature(
		descriptor = "(Lfo;Luj;I)V"
	)
	class138(class139 var1, Buffer var2, int var3) {
		this.this$0 = var1;
		this.val$p = var2;
		this.val$version = var3;
	}

	public Object call() {
		this.this$0.method3163(this.val$p, this.val$version);
		return null;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public static void method3158() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "721798432"
	)
	static int method3161(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) {
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = class241.loadWorlds() ? 1 : 0;
			return 1;
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) {
				var9 = Language.worldListStart();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) {
				var9 = WorldMapData_0.getNextWorldListWorld();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) {
					var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
					var7 = null;

					for (var8 = 0; var8 < World.World_count; ++var8) {
						if (var3 == class361.World_worlds[var8].id) {
							var7 = class361.World_worlds[var8];
							break;
						}
					}

					if (var7 != null) {
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) {
					DbTableType.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
					boolean var10 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1] == 1;
					var8 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 2];
					boolean var6 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 3] == 1;
					PacketWriter.sortWorldList(var3, var10, var8, var6);
					return 1;
				} else if (var0 != 6511) {
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) {
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
						return 1;
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) {
							DbTableType.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
							var5 = Frames.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = VerticalAlignment.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = VerticalAlignment.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.LC_PARAM) {
							DbTableType.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
							var5 = Frames.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = WorldMapSection2.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = WorldMapSection2.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.OC_PARAM) {
							DbTableType.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
							var5 = Frames.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = class214.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = class214.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) {
							DbTableType.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
							var5 = Frames.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = UserList.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = UserList.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ON_MOBILE) {
							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) {
							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Client.clientType;
							return 1;
						} else if (var0 == 6520) {
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) {
							return 1;
						} else if (var0 == 6522) {
							--class127.Interpreter_stringStackSize;
							--DbTableType.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 6523) {
							--class127.Interpreter_stringStackSize;
							--DbTableType.Interpreter_intStackSize;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) {
							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) {
							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) {
							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == 6527) {
							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Client.field490;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
					if (var3 >= 0 && var3 < World.World_count) {
						var7 = class361.World_worlds[var3];
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1926894842"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) {
			PacketBufferNode var1 = class113.getPacketBufferNode(ClientPacket.field3188, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(ClanChannel.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
