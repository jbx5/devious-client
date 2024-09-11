import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cb")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
	@ObfuscatedName("jg")
	static int[][] field914;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1331378431
	)
	@Export("id")
	int id;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 507163851
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -902188015
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -480323063
	)
	@Export("x")
	int x;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1984574171
	)
	@Export("y")
	int y;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -2074291457
	)
	@Export("z")
	int z;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1669105281
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 700359327
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("ar")
	@Export("isFinished")
	boolean isFinished;

	GraphicsObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.frame = 0;
		this.frameCycle = 0;
		this.isFinished = false;
		this.id = var1;
		this.plane = var2;
		this.x = var3;
		this.y = var4;
		this.z = var5;
		this.cycleStart = var7 + var6;
		int var8 = VarcInt.SpotAnimationDefinition_get(this.id).sequence;
		if (var8 != -1) {
			this.isFinished = false;
			this.sequenceDefinition = HealthBarUpdate.SequenceDefinition_get(var8);
		} else {
			this.isFinished = true;
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	@Export("advance")
	final void advance(int var1) {
		if (!this.isFinished) {
			this.frameCycle += var1;
			if (!this.sequenceDefinition.isCachedModelIdSet()) {
				while (this.frameCycle > this.sequenceDefinition.frameLengths[this.frame]) {
					this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
					++this.frame;
					if (this.frame >= this.sequenceDefinition.frameIds.length) {
						this.isFinished = true;
						break;
					}

					class93.method2538(this.sequenceDefinition, this.frame, this.x, this.y, false);
				}
			} else {
				this.frame += var1;
				if (this.frame >= this.sequenceDefinition.method4368()) {
					this.isFinished = true;
				} else {
					Canvas.method318(this.sequenceDefinition, this.frame, this.x, this.y, false);
				}
			}

		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Ljm;",
		garbageValue = "-75"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = VarcInt.SpotAnimationDefinition_get(this.id);
		Model var2;
		if (!this.isFinished) {
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1);
		}

		return var2 == null ? null : var2;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "677974125"
	)
	static int method2282(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) {
			class320.Interpreter_intStackSize -= 3;
			MenuAction.queueSoundEffect(Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 2]);
			return 1;
		} else {
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.SOUND_SONG) {
				class320.Interpreter_intStackSize -= 5;
				var3 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 4];
				ArrayList var15 = new ArrayList();
				var15.add(var3);
				ItemContainer.method2498(var15, var4, var5, var6, var7);
				return 1;
			} else if (var0 == ScriptOpcodes.SOUND_JINGLE) {
				class320.Interpreter_intStackSize -= 2;
				Projectile.method2363(Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1]);
				return 1;
			} else {
				class93 var10;
				class92 var11;
				String var14;
				if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) {
					boolean var16;
					if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) {
						if (var0 == 3211) {
							return 1;
						} else if (var0 == 3216) {
							var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
							var4 = 0;
							class93 var19 = (class93)ArchiveDiskAction.findEnumerated(class198.method4028(), var3);
							if (var19 != null) {
								var4 = var19 != class93.field1137 ? 1 : 0;
							}

							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var4;
							return 1;
						} else if (var0 == 3218) {
							var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
							var4 = 0;
							class92 var13 = (class92)ArchiveDiskAction.findEnumerated(class36.method705(), var3);
							if (var13 != null) {
								var4 = var13 != class92.field1128 ? 1 : 0;
							}

							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var4;
							return 1;
						} else if (var0 != 3217 && var0 != 3219) {
							if (var0 == 3220) {
								class320.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
								AbstractWorldMapIcon.method6257(var3, var4);
								return 1;
							} else if (var0 == 3221) {
								class320.Interpreter_intStackSize -= 6;
								var3 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
								var5 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 2];
								var6 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 3];
								var7 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 4];
								int var8 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 5];
								ArrayList var9 = new ArrayList();
								var9.add(var3);
								var9.add(var4);
								ItemContainer.method2498(var9, var5, var6, var7, var8);
								return 1;
							} else if (var0 == 3222) {
								class320.Interpreter_intStackSize -= 4;
								var3 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
								var5 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 2];
								var6 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 3];
								class164.method3669(var3, var4, var5, var6);
								return 1;
							} else {
								return 2;
							}
						} else {
							var10 = class93.field1137;
							var11 = class92.field1128;
							var16 = true;
							boolean var17 = true;
							if (var0 == 3217) {
								var7 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
								var10 = (class93)ArchiveDiskAction.findEnumerated(class198.method4028(), var7);
								if (var10 == null) {
									throw new RuntimeException(String.format("Unrecognized device option %d", var7));
								}
							}

							if (var0 == 3219) {
								var7 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
								var11 = (class92)ArchiveDiskAction.findEnumerated(class36.method705(), var7);
								if (var11 == null) {
									throw new RuntimeException(String.format("Unrecognized game option %d", var7));
								}
							}

							String var12;
							byte var18;
							if (var11 == class92.field1128) {
								switch(var10.field1138) {
								case 1:
								case 2:
								case 3:
									var18 = 0;
									var6 = 1;
									break;
								case 4:
									var18 = 0;
									var6 = Integer.MAX_VALUE;
									break;
								case 5:
									var18 = 0;
									var6 = 100;
									break;
								default:
									var12 = String.format("Unkown device option: %s.", var10.toString());
									throw new RuntimeException(var12);
								}
							} else {
								switch(var11.field1129) {
								case 1:
									var18 = 0;
									var6 = 1;
									break;
								case 2:
								case 3:
								case 4:
									var18 = 0;
									var6 = 100;
									break;
								default:
									var12 = String.format("Unkown game option: %s.", var11.toString());
									throw new RuntimeException(var12);
								}
							}

							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var18;
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var6;
							return 1;
						}
					} else {
						var10 = class93.field1137;
						var11 = class92.field1128;
						var16 = false;
						if (var0 == 3214) {
							var6 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
							var10 = (class93)ArchiveDiskAction.findEnumerated(class198.method4028(), var6);
							if (var10 == null) {
								throw new RuntimeException(String.format("Unrecognized device option %d", var6));
							}
						}

						if (var0 == 3215) {
							var6 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
							var11 = (class92)ArchiveDiskAction.findEnumerated(class36.method705(), var6);
							if (var11 == null) {
								throw new RuntimeException(String.format("Unrecognized game option %d", var6));
							}
						}

						if (var0 == 3210) {
							var6 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
							var10 = (class93)ArchiveDiskAction.findEnumerated(class198.method4028(), var6);
							if (var10 == null) {
								var11 = (class92)ArchiveDiskAction.findEnumerated(class36.method705(), var6);
								if (var11 == null) {
									throw new RuntimeException(String.format("Unrecognized client option %d", var6));
								}
							}
						} else if (var0 == 3182) {
							var10 = class93.field1135;
						} else if (var0 == 3204) {
							var11 = class92.field1126;
						} else if (var0 == 3206) {
							var11 = class92.field1127;
						} else if (var0 == 3208) {
							var11 = class92.field1124;
						}

						if (var11 == class92.field1128) {
							switch(var10.field1138) {
							case 1:
								var5 = class461.clientPreferences.isUsernameHidden() ? 1 : 0;
								break;
							case 2:
								var5 = class461.clientPreferences.isTitleMusicDisabled() ? 1 : 0;
								break;
							case 3:
								var5 = class461.clientPreferences.isDisplayingFps() ? 1 : 0;
								break;
							case 4:
								var5 = class461.clientPreferences.method2748();
								break;
							case 5:
								var5 = class149.method3467();
								break;
							default:
								var14 = String.format("Unkown device option: %s.", var10.toString());
								throw new RuntimeException(var14);
							}
						} else {
							switch(var11.field1129) {
							case 1:
								var5 = class461.clientPreferences.isRoofsHidden() ? 1 : 0;
								break;
							case 2:
								var6 = class461.clientPreferences.getMusicVolume();
								var5 = Math.round((float)(var6 * 100) / 255.0F);
								break;
							case 3:
								var6 = class461.clientPreferences.getSoundEffectsVolume();
								var5 = Math.round((float)(var6 * 100) / 127.0F);
								break;
							case 4:
								var6 = class461.clientPreferences.getAreaSoundEffectsVolume();
								var5 = Math.round((float)(var6 * 100) / 127.0F);
								break;
							default:
								var14 = String.format("Unkown game option: %s.", var11.toString());
								throw new RuntimeException(var14);
							}
						}

						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var5;
						return 1;
					}
				} else {
					var10 = class93.field1137;
					var11 = class92.field1128;
					var5 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
					if (var0 == 3212) {
						var6 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
						var10 = (class93)ArchiveDiskAction.findEnumerated(class198.method4028(), var6);
						if (var10 == null) {
							throw new RuntimeException(String.format("Unrecognized device option %d", var6));
						}
					}

					if (var0 == 3213) {
						var6 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
						var11 = (class92)ArchiveDiskAction.findEnumerated(class36.method705(), var6);
						if (var11 == null) {
							throw new RuntimeException(String.format("Unrecognized game option %d", var6));
						}
					}

					if (var0 == 3209) {
						var6 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
						var10 = (class93)ArchiveDiskAction.findEnumerated(class198.method4028(), var6);
						if (var10 == null) {
							var11 = (class92)ArchiveDiskAction.findEnumerated(class36.method705(), var6);
							if (var11 == null) {
								throw new RuntimeException(String.format("Unrecognized client option %d", var6));
							}
						}
					} else if (var0 == 3181) {
						var10 = class93.field1135;
					} else if (var0 == 3203) {
						var11 = class92.field1126;
					} else if (var0 == 3205) {
						var11 = class92.field1127;
					} else if (var0 == 3207) {
						var11 = class92.field1124;
					}

					if (var11 == class92.field1128) {
						switch(var10.field1138) {
						case 1:
							class461.clientPreferences.updateHideUsername(var5 == 1);
							break;
						case 2:
							class461.clientPreferences.updateTitleMusicDisabled(var5 == 1);
							break;
						case 3:
							class461.clientPreferences.updateDisplayFps(var5 == 1);
							break;
						case 4:
							if (var5 < 0) {
								var5 = 0;
							}

							class461.clientPreferences.method2747(var5);
							break;
						case 5:
							UserComparator5.method3204(var5);
							break;
						default:
							var14 = String.format("Unkown device option: %s.", var10.toString());
							throw new RuntimeException(var14);
						}
					} else {
						switch(var11.field1129) {
						case 1:
							class461.clientPreferences.updateRoofsHidden(var5 == 1);
							break;
						case 2:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 255) / 100.0F);
							class204.setMusicVolume(var6);
							break;
						case 3:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 127) / 100.0F);
							LoginState.method1279(var6);
							break;
						case 4:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 127) / 100.0F);
							GrandExchangeOfferOwnWorldComparator.method1267(var6);
							break;
						default:
							var14 = String.format("Unkown game option: %s.", var11.toString());
							throw new RuntimeException(var14);
						}
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1353836401"
	)
	static final void method2291() {
		Client.field728 = 0;
		int var0 = (AddRequestTask.localPlayer.x >> 7) + ClientPreferences.topLevelWorldView.baseX;
		int var1 = (AddRequestTask.localPlayer.y >> 7) + ClientPreferences.topLevelWorldView.baseY;
		if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
			Client.field728 = 1;
		}

		if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
			Client.field728 = 1;
		}

		if (Client.field728 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
			Client.field728 = 0;
		}

	}

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z",
		garbageValue = "799068640"
	)
	static boolean method2285(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		Scene var7 = class162.worldView.scene;
		int var9;
		if (var5 == class383.field4461.field4464) {
			BoundaryObject var8 = var7.getBoundaryObject(var0, var1, var2);
			if (var8 != null) {
				var9 = class213.Entity_unpackID(var8.tag);
				if (var3 == WorldMapDecorationType.field4061.id) {
					var8.renderable1 = new DynamicObject(class162.worldView, var9, 2, var4 + 4, var0, var1, var2, var6, false, var8.renderable1);
					var8.renderable2 = new DynamicObject(class162.worldView, var9, 2, var4 + 1 & 3, var0, var1, var2, var6, false, var8.renderable2);
				} else {
					var8.renderable1 = new DynamicObject(class162.worldView, var9, var3, var4, var0, var1, var2, var6, false, var8.renderable1);
				}

				return true;
			}
		} else if (var5 == class383.field4462.field4464) {
			WallDecoration var10 = var7.getWallDecoration(var0, var1, var2);
			if (var10 != null) {
				var9 = class213.Entity_unpackID(var10.tag);
				if (var3 != WorldMapDecorationType.field4044.id && var3 != WorldMapDecorationType.field4045.id) {
					if (var3 == WorldMapDecorationType.field4055.id) {
						var10.renderable1 = new DynamicObject(class162.worldView, var9, 4, var4 + 4, var0, var1, var2, var6, false, var10.renderable1);
					} else if (var3 == WorldMapDecorationType.field4047.id) {
						var10.renderable1 = new DynamicObject(class162.worldView, var9, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var10.renderable1);
					} else if (var3 == WorldMapDecorationType.field4053.id) {
						var10.renderable1 = new DynamicObject(class162.worldView, var9, 4, var4 + 4, var0, var1, var2, var6, false, var10.renderable1);
						var10.renderable2 = new DynamicObject(class162.worldView, var9, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var10.renderable2);
					}
				} else {
					var10.renderable1 = new DynamicObject(class162.worldView, var9, 4, var4, var0, var1, var2, var6, false, var10.renderable1);
				}

				return true;
			}
		} else if (var5 == class383.field4466.field4464) {
			GameObject var11 = var7.getGameObject(var0, var1, var2);
			if (var3 == WorldMapDecorationType.field4060.id) {
				var3 = WorldMapDecorationType.field4059.id;
			}

			if (var11 != null) {
				var11.renderable = new DynamicObject(class162.worldView, class213.Entity_unpackID(var11.tag), var3, var4, var0, var1, var2, var6, false, var11.renderable);
				return true;
			}
		} else if (var5 == class383.field4460.field4464) {
			FloorDecoration var12 = var7.getFloorDecoration(var0, var1, var2);
			if (var12 != null) {
				var12.renderable = new DynamicObject(class162.worldView, class213.Entity_unpackID(var12.tag), 22, var4, var0, var1, var2, var6, false, var12.renderable);
				return true;
			}
		}

		return false;
	}

	public GraphicsObject() {
	}
}
