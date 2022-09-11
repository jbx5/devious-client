import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jp")
public class class260 {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZI)I",
		garbageValue = "1725035078"
	)
	static int method5340(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) { // L: 3856
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = UserComparator9.loadWorlds() ? 1 : 0; // L: 3857
			return 1; // L: 3858
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) { // L: 3860
				var9 = class147.worldListStart(); // L: 3861
				if (var9 != null) { // L: 3862
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.id; // L: 3863
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.properties; // L: 3864
					Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var9.activity; // L: 3865
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.location; // L: 3866
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.population; // L: 3867
					Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var9.host; // L: 3868
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3871
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3872
					Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 3873
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3874
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3875
					Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 3876
				}

				return 1; // L: 3878
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) { // L: 3880
				var9 = NetCache.getNextWorldListWorld(); // L: 3881
				if (var9 != null) { // L: 3882
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.id; // L: 3883
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.properties; // L: 3884
					Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var9.activity; // L: 3885
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.location; // L: 3886
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.population; // L: 3887
					Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var9.host; // L: 3888
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3891
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3892
					Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 3893
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3894
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3895
					Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 3896
				}

				return 1; // L: 3898
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) { // L: 3900
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3901
					var7 = null; // L: 3902

					for (var8 = 0; var8 < World.World_count; ++var8) { // L: 3903
						if (var3 == World.World_worlds[var8].id) { // L: 3904
							var7 = World.World_worlds[var8]; // L: 3905
							break;
						}
					}

					if (var7 != null) { // L: 3909
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.id; // L: 3910
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.properties; // L: 3911
						Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var7.activity; // L: 3912
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.location; // L: 3913
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.population; // L: 3914
						Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var7.host; // L: 3915
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3918
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3919
						Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 3920
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3921
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3922
						Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 3923
					}

					return 1; // L: 3925
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) { // L: 3927
					Interpreter.Interpreter_intStackSize -= 4; // L: 3928
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3929
					boolean var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 3930
					var8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3931
					boolean var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3] == 1; // L: 3932
					class144.sortWorldList(var3, var10, var8, var6); // L: 3933
					return 1; // L: 3934
				} else if (var0 != 6511) { // L: 3936
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) { // L: 3957
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3958
						return 1; // L: 3959
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) { // L: 3961
							Interpreter.Interpreter_intStackSize -= 2; // L: 3962
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3963
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3964
							var5 = Projectile.getParamDefinition(var4); // L: 3965
							if (var5.isString()) { // L: 3966
								Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = class193.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 3967
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class193.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 3970
							}

							return 1; // L: 3972
						} else if (var0 == ScriptOpcodes.LC_PARAM) { // L: 3974
							Interpreter.Interpreter_intStackSize -= 2; // L: 3975
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3976
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3977
							var5 = Projectile.getParamDefinition(var4); // L: 3978
							if (var5.isString()) { // L: 3979
								Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = PlayerComposition.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 3980
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = PlayerComposition.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 3983
							}

							return 1; // L: 3985
						} else if (var0 == ScriptOpcodes.OC_PARAM) { // L: 3987
							Interpreter.Interpreter_intStackSize -= 2; // L: 3988
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3989
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3990
							var5 = Projectile.getParamDefinition(var4); // L: 3991
							if (var5.isString()) { // L: 3992
								Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = UserComparator3.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr); // L: 3993
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = UserComparator3.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt); // L: 3996
							}

							return 1; // L: 3998
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) { // L: 4000
							Interpreter.Interpreter_intStackSize -= 2; // L: 4001
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4002
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4003
							var5 = Projectile.getParamDefinition(var4); // L: 4004
							if (var5.isString()) { // L: 4005
								Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = class182.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4006
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class182.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4009
							}

							return 1; // L: 4011
						} else if (var0 == ScriptOpcodes.ON_MOBILE) { // L: 4013
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0; // L: 4014
							return 1; // L: 4015
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) { // L: 4017
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.clientType; // L: 4018
							return 1; // L: 4019
						} else if (var0 == 6520) { // L: 4021
							return 1; // L: 4022
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) { // L: 4024
							return 1; // L: 4025
						} else if (var0 == 6522) { // L: 4027
							--VarbitComposition.Interpreter_stringStackSize; // L: 4028
							--Interpreter.Interpreter_intStackSize; // L: 4029
							return 1; // L: 4030
						} else if (var0 == 6523) { // L: 4032
							--VarbitComposition.Interpreter_stringStackSize; // L: 4033
							--Interpreter.Interpreter_intStackSize; // L: 4034
							return 1; // L: 4035
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) { // L: 4037
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4038
							return 1; // L: 4039
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) { // L: 4041
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 4042
							return 1; // L: 4043
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) { // L: 4045
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 4046
							return 1; // L: 4047
						} else if (var0 == 6527) { // L: 4049
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field571; // L: 4050
							return 1; // L: 4051
						} else {
							return 2; // L: 4053
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3937
					if (var3 >= 0 && var3 < World.World_count) { // L: 3938
						var7 = World.World_worlds[var3]; // L: 3939
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.id; // L: 3940
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.properties; // L: 3941
						Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var7.activity; // L: 3942
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.location; // L: 3943
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.population; // L: 3944
						Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var7.host; // L: 3945
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3948
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3949
						Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 3950
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3951
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3952
						Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 3953
					}

					return 1; // L: 3955
				}
			}
		}
	}

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "46"
	)
	static final void method5339(int var0) {
		if (FloorOverlayDefinition.loadInterface(var0)) { // L: 11512
			Tile.drawModelComponents(Calendar.Widget_interfaceComponents[var0], -1); // L: 11513
		}
	} // L: 11514
}
