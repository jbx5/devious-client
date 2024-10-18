import java.util.ArrayList;
import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cw")
public class class73 {
	@ObfuscatedName("ap")
	final ArrayList field878;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 231152739
	)
	int field881;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1799702565
	)
	int field872;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("coord")
	Coord coord;
	@ObfuscatedName("ai")
	byte field874;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1704435527
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1917049479
	)
	int field876;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1054708361
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("pathTraversed")
	MoveSpeed pathTraversed;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	Buffer field879;
	@ObfuscatedName("au")
	@Export("actions")
	String[] actions;

	class73(int var1) {
		this.field878 = new ArrayList(1);
		this.field881 = -1;
		this.field872 = 0;
		this.coord = new Coord();
		this.orientation = 0;
		this.field876 = -1;
		this.targetIndex = -1;
		this.actions = new String[3];
		this.field881 = var1;

		for (int var2 = 0; var2 < 3; ++var2) {
			this.actions[var2] = "";
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1381973193"
	)
	void method2241() {
		this.field879 = null;
		this.field878.clear();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "85375317"
	)
	void method2256(int var1) {
		this.field872 = var1;
		this.orientation = 0;
		this.field876 = -1;
		this.targetIndex = -1;
		this.field874 = 0;
		this.pathTraversed = MoveSpeed.field3048;
		this.field879 = null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ldv;I)V",
		garbageValue = "730321331"
	)
	void method2243(Player var1) {
		this.field878.add(var1);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ldv;I)V",
		garbageValue = "55091044"
	)
	void method2244(Player var1) {
		this.field878.remove(var1);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILdn;I)Ldv;",
		garbageValue = "-1530629421"
	)
	Player method2245(int var1, WorldView var2) {
		Player var3 = new Player();
		var3.index = var1;
		if (this.field879 != null) {
			var3.read(this.field879);
		}

		var3.orientation = this.orientation;
		var3.targetIndex = this.targetIndex;
		var3.pathTraversed[0] = this.pathTraversed;
		var3.plane = this.coord.plane;
		var3.worldView = var2;
		var3.actions = this.actions;
		var3.resetPath(this.coord.x - var2.baseX, this.coord.y - var2.baseY);
		return var3;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "672888911"
	)
	boolean method2246() {
		return this.field872 == -1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2017012988"
	)
	void method2268() {
		this.field872 = this.coord.method6848();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "9"
	)
	void method2313(int var1, int var2) {
		this.coord.method6881(this.field872, var1, var2);
		this.field872 = -1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1570937872"
	)
	int method2249() {
		return this.coord.plane;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2107137054"
	)
	void method2250(int var1) {
		this.coord.plane = var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lkk;I)V",
		garbageValue = "618734738"
	)
	void method2251(MoveSpeed var1) {
		for (int var2 = 0; var2 < this.field878.size(); ++var2) {
			Player var3 = (Player)this.field878.get(var2);
			WorldView var4 = var3.worldView;
			int var5 = this.coord.x - var4.baseX;
			int var6 = this.coord.y - var4.baseY;
			MoveSpeed var7 = var1;
			boolean var8 = true;
			boolean var9 = true;
			if (var3 == GameEngine.entity && (var3.x < 1536 || var3.y < 1536 || var3.x >= 11776 || var3.y >= 11776)) {
				var7 = MoveSpeed.field3052;
			}

			var3.plane = this.coord.plane;
			if (var7 == MoveSpeed.field3052) {
				var3.resetPath(var5, var6);
			} else {
				var3.method2610(var4, var5, var6, var7);
			}
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvl;B)V",
		garbageValue = "26"
	)
	void method2259(Buffer var1) {
		this.field879 = var1;

		for (int var2 = 0; var2 < this.field878.size(); ++var2) {
			((Player)this.field878.get(var2)).read(this.field879);
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "60"
	)
	void method2294(int var1, int var2) {
		for (int var3 = 0; var3 < this.field878.size(); ++var3) {
			class402.performPlayerAnimation((Player)this.field878.get(var3), var1, var2);
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "8"
	)
	void method2254(int var1) {
		this.targetIndex = var1;

		for (int var2 = 0; var2 < this.field878.size(); ++var2) {
			((Actor)this.field878.get(var2)).targetIndex = var1;
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1682042509"
	)
	void method2289(String var1) {
		String var2 = "";

		for (int var3 = 0; var3 < this.field878.size(); ++var3) {
			Player var4 = (Player)this.field878.get(var3);
			var4.field1238 = false;
			var4.field1241 = 0;
			var4.field1242 = 0;
			var4.overheadTextCyclesRemaining = 150;
			var4.overheadText = var1;
			var2 = var4.username.getName();
		}

		if (var1.charAt(0) == '~') {
			var1 = var1.substring(1);
			class430.addGameMessage(2, var2, var1);
		} else if (this.field881 == Client.localPlayerIndex) {
			class430.addGameMessage(2, var2, var1);
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-397799327"
	)
	void method2323(int var1, int var2, int var3, int var4, int var5) {
		for (int var6 = 0; var6 < this.field878.size(); ++var6) {
			((Actor)this.field878.get(var6)).addHitSplat(var1, var2, var3, var4, Client.cycle, var5);
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-1750594443"
	)
	void method2257(int var1, int var2, int var3, int var4, int var5) {
		for (int var6 = 0; var6 < this.field878.size(); ++var6) {
			((Actor)this.field878.get(var6)).addHealthBar(var1, Client.cycle, var2, var3, var4, var5);
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "14028466"
	)
	void method2258(int var1) {
		for (int var2 = 0; var2 < this.field878.size(); ++var2) {
			((Actor)this.field878.get(var2)).removeHealthBar(var1);
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "31899826"
	)
	void method2307(int var1) {
		this.field876 = var1;

		for (int var2 = 0; var2 < this.field878.size(); ++var2) {
			Player var3 = (Player)this.field878.get(var2);
			var3.field1253 = this.field876;
			if (var3.pathLength == 0) {
				var3.orientation = this.field876;
				var3.method2724();
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILoo;ZLjava/lang/String;[BI)V",
		garbageValue = "1612901266"
	)
	void method2260(int var1, PlayerType var2, boolean var3, String var4, byte[] var5) {
		boolean var6 = false;
		String var7 = null;

		int var8;
		for (var8 = 0; var8 < this.field878.size(); ++var8) {
			Player var9 = (Player)this.field878.get(var8);
			if (var9.username != null && var9.appearance != null) {
				boolean var10 = false;
				if (var2.isUser && ItemContainer.friendSystem.isIgnored(var9.username)) {
					var10 = true;
				}

				if (!var10 && Client.field627 == 0 && !var9.isHidden) {
					var6 = true;
					var7 = var9.username.getName();
					var9.overheadText = var4.trim();
					var9.field1241 = var1 >> 8;
					var9.field1242 = var1 & 255;
					var9.overheadTextCyclesRemaining = 150;
					var9.field1243 = ClanMate.method9018(var5);
					var9.field1238 = var3;
					var9.field1239 = var9 != SpriteMask.localPlayer && var2.isUser && !Client.field730.isEmpty() && var4.toLowerCase().indexOf(Client.field730) == -1;
				}
			}
		}

		if (var6 && var7 != null) {
			if (var2.isPrivileged) {
				var8 = var3 ? 91 : 1;
			} else {
				var8 = var3 ? 90 : 2;
			}

			if (var2.modIcon != -1) {
				class430.addGameMessage(var8, Tiles.method2519(var2.modIcon) + var7, var4);
			} else {
				class430.addGameMessage(var8, var7, var4);
			}
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIZI)V",
		garbageValue = "693339295"
	)
	void method2262(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
		for (int var9 = 0; var9 < this.field878.size(); ++var9) {
			Player var10 = (Player)this.field878.get(var9);
			var10.field1268 = var1;
			var10.field1228 = var2;
			var10.field1286 = var3;
			var10.field1271 = var4;
			var10.spotAnimation = var5;
			var10.field1273 = var6;
			var10.field1223 = var7;
			if (var8) {
				WorldView var11 = var10.worldView;
				int var12 = this.coord.x - var11.baseX;
				int var13 = this.coord.y - var11.baseY;
				var10.field1268 += var12;
				var10.field1228 += var13;
				var10.field1286 += var12;
				var10.field1271 += var13;
				var10.pathLength = 0;
			} else {
				var10.field1268 += var10.pathX[0];
				var10.field1228 += var10.pathY[0];
				var10.field1286 += var10.pathX[0];
				var10.field1271 += var10.pathY[0];
				var10.pathLength = 1;
			}

			var10.field1291 = 0;
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;I)V",
		garbageValue = "1430867736"
	)
	void method2310(String[] var1) {
		this.actions = (String[])((String[])Arrays.copyOf(var1, var1.length));

		for (int var2 = 0; var2 < this.field878.size(); ++var2) {
			((Player)this.field878.get(var2)).actions = (String[])((String[])Arrays.copyOf(var1, var1.length));
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIBBBBI)V",
		garbageValue = "-751184719"
	)
	void method2315(int var1, int var2, byte var3, byte var4, byte var5, byte var6) {
		for (int var7 = 0; var7 < this.field878.size(); ++var7) {
			Player var8 = (Player)this.field878.get(var7);
			var8.field1277 = var1;
			var8.field1278 = var2;
			var8.field1276 = var3;
			var8.field1280 = var4;
			var8.field1281 = var5;
			var8.field1282 = var6;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-73"
	)
	void method2264(int var1, int var2, int var3, int var4) {
		for (int var5 = 0; var5 < this.field878.size(); ++var5) {
			((Actor)this.field878.get(var5)).updateSpotAnimation(var1, var2, var3, var4);
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-109"
	)
	static final int method2322() {
		return ViewportMouse.ViewportMouse_y;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ILda;ZB)I",
		garbageValue = "31"
	)
	static int method2261(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) {
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = class330.loadWorlds() ? 1 : 0;
			return 1;
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) {
				var9 = class544.worldListStart();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) {
				var9 = class180.getNextWorldListWorld();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) {
					var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
					var7 = null;

					for (var8 = 0; var8 < World.World_count; ++var8) {
						if (var3 == World.World_worlds[var8].id) {
							var7 = World.World_worlds[var8];
							break;
						}
					}

					if (var7 != null) {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) {
					class96.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
					boolean var10 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1] == 1;
					var8 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 2];
					boolean var6 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 3] == 1;
					class421.sortWorldList(var3, var10, var8, var6);
					return 1;
				} else if (var0 != 6511) {
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) {
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
						return 1;
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) {
							class96.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
							var5 = WorldMapID.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = ActorSpotAnim.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = ActorSpotAnim.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.LC_PARAM) {
							class96.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
							var5 = WorldMapID.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = UrlRequest.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = UrlRequest.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.OC_PARAM) {
							class96.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
							var5 = WorldMapID.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = Bounds.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Bounds.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) {
							class96.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
							var5 = WorldMapID.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = UserComparator6.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = UserComparator6.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ON_MOBILE) {
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) {
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Client.clientType;
							return 1;
						} else if (var0 == 6520) {
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) {
							return 1;
						} else if (var0 == 6522) {
							--class208.Interpreter_stringStackSize;
							--class96.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 6523) {
							--class208.Interpreter_stringStackSize;
							--class96.Interpreter_intStackSize;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) {
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) {
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) {
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == 6527) {
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Client.field508;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
					if (var3 >= 0 && var3 < World.World_count) {
						var7 = World.World_worlds[var3];
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				}
			}
		}
	}
}
