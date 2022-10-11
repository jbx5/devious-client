import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ee")
public class class130 extends class129 {
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 233915013
	)
	@Export("clientType")
	public static int clientType;
	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	@Export("textureProvider")
	static TextureProvider textureProvider;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 505008951
	)
	int field1569;
	@ObfuscatedName("p")
	boolean field1564;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	final class132 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leo;)V"
	)
	class130(class132 var1) {
		this.this$0 = var1;
		this.field1569 = -1; // L: 178
	} // L: 181

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqq;B)V",
		garbageValue = "-41"
	)
	void vmethod3320(Buffer var1) {
		this.field1569 = var1.readUnsignedShort(); // L: 184
		this.field1564 = var1.readUnsignedByte() == 1; // L: 185
	} // L: 186

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Led;I)V",
		garbageValue = "-538131930"
	)
	void vmethod3313(ClanSettings var1) {
		var1.method3170(this.field1569, this.field1564); // L: 189
	} // L: 190

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lqf;I)V",
		garbageValue = "1679416585"
	)
	@Export("performReflectionCheck")
	public static void performReflectionCheck(PacketBuffer var0) {
		ReflectionCheck var1 = (ReflectionCheck)class33.reflectionChecks.last(); // L: 31
		if (var1 != null) { // L: 32
			int var2 = var0.offset; // L: 33
			var0.writeInt(var1.id); // L: 34

			for (int var3 = 0; var3 < var1.size; ++var3) { // L: 35
				if (var1.creationErrors[var3] != 0) { // L: 36
					var0.writeByte(var1.creationErrors[var3]); // L: 37
				} else {
					try {
						int var4 = var1.operations[var3]; // L: 41
						Field var5;
						int var6;
						if (var4 == 0) { // L: 42
							var5 = var1.fields[var3]; // L: 43
							var6 = Reflection.getInt(var5, (Object)null); // L: 44
							var0.writeByte(0); // L: 45
							var0.writeInt(var6); // L: 46
						} else if (var4 == 1) { // L: 48
							var5 = var1.fields[var3]; // L: 49
							Reflection.setInt(var5, (Object)null, var1.intReplaceValues[var3]); // L: 50
							var0.writeByte(0); // L: 51
						} else if (var4 == 2) { // L: 53
							var5 = var1.fields[var3]; // L: 54
							var6 = var5.getModifiers(); // L: 55
							var0.writeByte(0); // L: 56
							var0.writeInt(var6); // L: 57
						}

						Method var25;
						if (var4 != 3) { // L: 59
							if (var4 == 4) { // L: 79
								var25 = var1.methods[var3]; // L: 80
								var6 = var25.getModifiers(); // L: 81
								var0.writeByte(0); // L: 82
								var0.writeInt(var6); // L: 83
							}
						} else {
							var25 = var1.methods[var3]; // L: 60
							byte[][] var10 = var1.arguments[var3]; // L: 61
							Object[] var7 = new Object[var10.length]; // L: 62

							for (int var8 = 0; var8 < var10.length; ++var8) { // L: 63
								ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var10[var8])); // L: 64
								var7[var8] = var9.readObject(); // L: 65
							}

							Object var11 = Reflection.invoke(var25, (Object)null, var7); // L: 67
							if (var11 == null) { // L: 68
								var0.writeByte(0);
							} else if (var11 instanceof Number) { // L: 69
								var0.writeByte(1); // L: 70
								var0.writeLong(((Number)var11).longValue()); // L: 71
							} else if (var11 instanceof String) { // L: 73
								var0.writeByte(2); // L: 74
								var0.writeStringCp1252NullTerminated((String)var11); // L: 75
							} else {
								var0.writeByte(4); // L: 77
							}
						}
					} catch (ClassNotFoundException var13) { // L: 86
						var0.writeByte(-10); // L: 87
					} catch (InvalidClassException var14) { // L: 89
						var0.writeByte(-11); // L: 90
					} catch (StreamCorruptedException var15) { // L: 92
						var0.writeByte(-12); // L: 93
					} catch (OptionalDataException var16) { // L: 95
						var0.writeByte(-13); // L: 96
					} catch (IllegalAccessException var17) { // L: 98
						var0.writeByte(-14); // L: 99
					} catch (IllegalArgumentException var18) { // L: 101
						var0.writeByte(-15); // L: 102
					} catch (InvocationTargetException var19) { // L: 104
						var0.writeByte(-16); // L: 105
					} catch (SecurityException var20) { // L: 107
						var0.writeByte(-17); // L: 108
					} catch (IOException var21) { // L: 110
						var0.writeByte(-18); // L: 111
					} catch (NullPointerException var22) { // L: 113
						var0.writeByte(-19); // L: 114
					} catch (Exception var23) { // L: 116
						var0.writeByte(-20); // L: 117
					} catch (Throwable var24) { // L: 119
						var0.writeByte(-21); // L: 120
					}
				}
			}

			var0.writeCrc(var2); // L: 123
			var1.remove(); // L: 124
		}
	} // L: 125

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZB)I",
		garbageValue = "-118"
	)
	static int method3022(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) { // L: 4057
			var3 = Tiles.Client_plane; // L: 4058
			int var15 = class128.baseX * 64 + (class67.localPlayer.x >> 7); // L: 4059
			int var8 = WorldMapData_1.baseY * 64 + (class67.localPlayer.y >> 7); // L: 4060
			UserComparator10.getWorldMap().method7508(var3, var15, var8, true); // L: 4061
			return 1; // L: 4062
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) { // L: 4064
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4065
				String var16 = ""; // L: 4066
				var9 = UserComparator10.getWorldMap().getMapArea(var3); // L: 4067
				if (var9 != null) { // L: 4068
					var16 = var9.getExternalName(); // L: 4069
				}

				Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var16; // L: 4071
				return 1; // L: 4072
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) { // L: 4074
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4075
				UserComparator10.getWorldMap().setCurrentMapAreaId(var3); // L: 4076
				return 1; // L: 4077
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) { // L: 4079
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = UserComparator10.getWorldMap().getZoomLevel(); // L: 4080
				return 1; // L: 4081
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) { // L: 4083
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4084
				UserComparator10.getWorldMap().setZoomPercentage(var3); // L: 4085
				return 1; // L: 4086
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) { // L: 4088
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = UserComparator10.getWorldMap().isCacheLoaded() ? 1 : 0; // L: 4089
				return 1; // L: 4090
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) { // L: 4092
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4093
					UserComparator10.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y); // L: 4094
					return 1; // L: 4095
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) { // L: 4097
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4098
					UserComparator10.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y); // L: 4099
					return 1; // L: 4100
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) { // L: 4102
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4103
					UserComparator10.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y); // L: 4104
					return 1; // L: 4105
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) { // L: 4107
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4108
					UserComparator10.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y); // L: 4109
					return 1; // L: 4110
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) { // L: 4112
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = UserComparator10.getWorldMap().getDisplayX(); // L: 4113
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = UserComparator10.getWorldMap().getDisplayY(); // L: 4114
					return 1; // L: 4115
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) { // L: 4117
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4118
						var11 = UserComparator10.getWorldMap().getMapArea(var3); // L: 4119
						if (var11 == null) { // L: 4120
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4121
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getOrigin().packed(); // L: 4124
						}

						return 1; // L: 4126
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) { // L: 4128
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4129
						var11 = UserComparator10.getWorldMap().getMapArea(var3); // L: 4130
						if (var11 == null) { // L: 4131
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4132
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4133
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64; // L: 4136
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64; // L: 4137
						}

						return 1; // L: 4139
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) { // L: 4141
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4142
						var11 = UserComparator10.getWorldMap().getMapArea(var3); // L: 4143
						if (var11 == null) { // L: 4144
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4145
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4146
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4147
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4148
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64; // L: 4151
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64; // L: 4152
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1; // L: 4153
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1; // L: 4154
						}

						return 1; // L: 4156
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) { // L: 4158
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4159
						var11 = UserComparator10.getWorldMap().getMapArea(var3); // L: 4160
						if (var11 == null) { // L: 4161
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4162
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getZoom(); // L: 4165
						}

						return 1; // L: 4167
					} else if (var0 == 6615) { // L: 4169
						var14 = UserComparator10.getWorldMap().getDisplayCoord(); // L: 4170
						if (var14 == null) { // L: 4171
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4172
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4173
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14.x; // L: 4176
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14.y; // L: 4177
						}

						return 1; // L: 4179
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) { // L: 4181
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = UserComparator10.getWorldMap().currentMapAreaId(); // L: 4182
						return 1; // L: 4183
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) { // L: 4185
						var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4186
						var11 = UserComparator10.getWorldMap().getCurrentMapArea(); // L: 4187
						if (var11 == null) { // L: 4188
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4189
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4190
							return 1; // L: 4191
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y); // L: 4193
							if (var12 == null) { // L: 4194
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4195
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4196
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12[0]; // L: 4199
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12[1]; // L: 4200
							}

							return 1; // L: 4202
						}
					} else {
						Coord var5;
						if (var0 == 6618) { // L: 4204
							var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4205
							var11 = UserComparator10.getWorldMap().getCurrentMapArea(); // L: 4206
							if (var11 == null) { // L: 4207
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4208
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4209
								return 1; // L: 4210
							} else {
								var5 = var11.coord(var14.x, var14.y); // L: 4212
								if (var5 == null) { // L: 4213
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4214
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.packed(); // L: 4217
								}

								return 1; // L: 4219
							}
						} else {
							Coord var10;
							if (var0 == 6619) { // L: 4221
								Interpreter.Interpreter_intStackSize -= 2; // L: 4222
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4223
								var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4224
								class202.method4236(var3, var10, false); // L: 4225
								return 1; // L: 4226
							} else if (var0 == 6620) { // L: 4228
								Interpreter.Interpreter_intStackSize -= 2; // L: 4229
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4230
								var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4231
								class202.method4236(var3, var10, true); // L: 4232
								return 1; // L: 4233
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) { // L: 4235
								Interpreter.Interpreter_intStackSize -= 2; // L: 4236
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4237
								var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4238
								var9 = UserComparator10.getWorldMap().getMapArea(var3); // L: 4239
								if (var9 == null) { // L: 4240
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4241
									return 1; // L: 4242
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0; // L: 4244
									return 1; // L: 4245
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) { // L: 4247
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = UserComparator10.getWorldMap().getDisplayWith(); // L: 4248
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = UserComparator10.getWorldMap().getDisplayHeight(); // L: 4249
								return 1; // L: 4250
							} else if (var0 == 6623) { // L: 4252
								var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4253
								var11 = UserComparator10.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y); // L: 4254
								if (var11 == null) { // L: 4255
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4256
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getId(); // L: 4259
								}

								return 1; // L: 4261
							} else if (var0 == 6624) { // L: 4263
								UserComparator10.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4264
								return 1; // L: 4265
							} else if (var0 == 6625) { // L: 4267
								UserComparator10.getWorldMap().resetMaxFlashCount(); // L: 4268
								return 1; // L: 4269
							} else if (var0 == 6626) { // L: 4271
								UserComparator10.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4272
								return 1; // L: 4273
							} else if (var0 == 6627) { // L: 4275
								UserComparator10.getWorldMap().resetCyclesPerFlash(); // L: 4276
								return 1; // L: 4277
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) { // L: 4279
									var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 4280
									UserComparator10.getWorldMap().setPerpetualFlash(var13); // L: 4281
									return 1; // L: 4282
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) { // L: 4284
									var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4285
									UserComparator10.getWorldMap().flashElement(var3); // L: 4286
									return 1; // L: 4287
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) { // L: 4289
									var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4290
									UserComparator10.getWorldMap().flashCategory(var3); // L: 4291
									return 1; // L: 4292
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) { // L: 4294
									UserComparator10.getWorldMap().stopCurrentFlashes(); // L: 4295
									return 1; // L: 4296
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) { // L: 4298
									var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 4299
									UserComparator10.getWorldMap().setElementsDisabled(var13); // L: 4300
									return 1; // L: 4301
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) { // L: 4303
										Interpreter.Interpreter_intStackSize -= 2; // L: 4304
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4305
										var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 4306
										UserComparator10.getWorldMap().disableElement(var3, var7); // L: 4307
										return 1; // L: 4308
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) { // L: 4310
										Interpreter.Interpreter_intStackSize -= 2; // L: 4311
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4312
										var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 4313
										UserComparator10.getWorldMap().setCategoryDisabled(var3, var7); // L: 4314
										return 1; // L: 4315
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) { // L: 4317
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = UserComparator10.getWorldMap().getElementsDisabled() ? 1 : 0; // L: 4318
										return 1; // L: 4319
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) { // L: 4321
										var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4322
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = UserComparator10.getWorldMap().isElementDisabled(var3) ? 1 : 0; // L: 4323
										return 1; // L: 4324
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) { // L: 4326
										var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4327
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = UserComparator10.getWorldMap().isCategoryDisabled(var3) ? 1 : 0; // L: 4328
										return 1; // L: 4329
									} else if (var0 == 6638) { // L: 4331
										Interpreter.Interpreter_intStackSize -= 2; // L: 4332
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4333
										var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4334
										var5 = UserComparator10.getWorldMap().method7443(var3, var10); // L: 4335
										if (var5 == null) { // L: 4336
											Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4337
										} else {
											Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.packed(); // L: 4340
										}

										return 1; // L: 4342
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) { // L: 4344
											var6 = UserComparator10.getWorldMap().iconStart(); // L: 4345
											if (var6 == null) { // L: 4346
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4347
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4348
											} else {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.getElement(); // L: 4351
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 4352
											}

											return 1; // L: 4354
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) { // L: 4356
											var6 = UserComparator10.getWorldMap().iconNext(); // L: 4357
											if (var6 == null) { // L: 4358
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4359
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4360
											} else {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.getElement(); // L: 4363
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 4364
											}

											return 1; // L: 4366
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) { // L: 4368
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4369
												var4 = class139.WorldMapElement_get(var3); // L: 4370
												if (var4.name == null) { // L: 4371
													Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 4372
												} else {
													Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var4.name; // L: 4375
												}

												return 1; // L: 4377
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) { // L: 4379
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4380
												var4 = class139.WorldMapElement_get(var3); // L: 4381
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.textSize; // L: 4382
												return 1; // L: 4383
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) { // L: 4385
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4386
												var4 = class139.WorldMapElement_get(var3); // L: 4387
												if (var4 == null) { // L: 4388
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4389
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.category; // L: 4392
												}

												return 1; // L: 4394
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) { // L: 4396
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4397
												var4 = class139.WorldMapElement_get(var3); // L: 4398
												if (var4 == null) { // L: 4399
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4400
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.sprite1; // L: 4403
												}

												return 1; // L: 4405
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) { // L: 4407
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class434.worldMapEvent.mapElement; // L: 4408
												return 1; // L: 4409
											} else if (var0 == 6698) { // L: 4411
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class434.worldMapEvent.coord1.packed(); // L: 4412
												return 1; // L: 4413
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) { // L: 4415
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class434.worldMapEvent.coord2.packed(); // L: 4416
												return 1; // L: 4417
											} else {
												return 2; // L: 4419
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
