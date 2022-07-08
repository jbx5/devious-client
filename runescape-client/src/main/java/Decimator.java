import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("be")
@Implements("Decimator")
public class Decimator {
	@ObfuscatedName("te")
	@ObfuscatedGetter(intValue = -2007745669)
	static int field402;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -477105871)
	@Export("inputRate")
	int inputRate;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = -718168197)
	@Export("outputRate")
	int outputRate;

	@ObfuscatedName("e")
	@Export("table")
	int[][] table;

	public Decimator(int var1, int var2) {
		if (var2 != var1) {
			int var4 = var1;
			int var5 = var2;
			if (var2 > var1) {
				var4 = var2;
				var5 = var1;
			}
			while (var5 != 0) {
				int var6 = var4 % var5;
				var4 = var5;
				var5 = var6;
			} 
			var1 /= var4;
			var2 /= var4;
			this.inputRate = var1;
			this.outputRate = var2;
			this.table = new int[var1][14];
			for (int var7 = 0; var7 < var1; ++var7) {
				int[] var8 = this.table[var7];
				double var9 = ((double) (var7)) / ((double) (var1)) + 6.0;
				int var11 = ((int) (Math.floor(1.0 + (var9 - 7.0))));
				if (var11 < 0) {
					var11 = 0;
				}
				int var12 = ((int) (Math.ceil(var9 + 7.0)));
				if (var12 > 14) {
					var12 = 14;
				}
				for (double var13 = ((double) (var2)) / ((double) (var1)); var11 < var12; ++var11) {
					double var15 = (((double) (var11)) - var9) * 3.141592653589793;
					double var17 = var13;
					if (var15 < -1.0E-4 || var15 > 1.0E-4) {
						var17 = var13 * (Math.sin(var15) / var15);
					}
					var17 *= 0.54 + 0.46 * Math.cos(0.2243994752564138 * (((double) (var11)) - var9));
					var8[var11] = ((int) (Math.floor(0.5 + 65536.0 * var17)));
				}
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "([BI)[B", garbageValue = "-792171906")
	@Export("resample")
	byte[] resample(byte[] var1) {
		if (this.table != null) {
			int var2 = ((int) (((long) (this.outputRate)) * ((long) (var1.length)) / ((long) (this.inputRate)))) + 14;
			int[] var3 = new int[var2];
			int var4 = 0;
			int var5 = 0;
			int var6;
			for (var6 = 0; var6 < var1.length; ++var6) {
				byte var7 = var1[var6];
				int[] var8 = this.table[var5];
				int var9;
				for (var9 = 0; var9 < 14; ++var9) {
					var3[var9 + var4] += var8[var9] * var7;
				}
				var5 += this.outputRate;
				var9 = var5 / this.inputRate;
				var4 += var9;
				var5 -= var9 * this.inputRate;
			}
			var1 = new byte[var2];
			for (var6 = 0; var6 < var2; ++var6) {
				int var10 = var3[var6] + 32768 >> 16;
				if (var10 < -128) {
					var1[var6] = -128;
				} else if (var10 > 127) {
					var1[var6] = 127;
				} else {
					var1[var6] = ((byte) (var10));
				}
			}
		}
		return var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "2059785269")
	@Export("scaleRate")
	int scaleRate(int var1) {
		if (this.table != null) {
			var1 = ((int) (((long) (this.outputRate)) * ((long) (var1)) / ((long) (this.inputRate))));
		}
		return var1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(IB)I", garbageValue = "1")
	@Export("scalePosition")
	int scalePosition(int var1) {
		if (this.table != null) {
			var1 = ((int) (((long) (var1)) * ((long) (this.outputRate)) / ((long) (this.inputRate)))) + 6;
		}
		return var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-387941357")
	static void method1018() {
		for (ObjectSound var0 = ((ObjectSound) (ObjectSound.objectSounds.last())); var0 != null; var0 = ((ObjectSound) (ObjectSound.objectSounds.previous()))) {
			if (var0.stream1 != null) {
				class21.pcmStreamMixer.removeSubStream(var0.stream1);
				var0.stream1 = null;
			}
			if (var0.stream2 != null) {
				class21.pcmStreamMixer.removeSubStream(var0.stream2);
				var0.stream2 = null;
			}
		}
		ObjectSound.objectSounds.clear();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1283916070")
	public static void method1005(int var0) {
		if (class272.musicPlayerStatus != 0) {
			class272.musicTrackVolume = var0;
		} else {
			class272.midiPcmStream.setPcmStreamVolume(var0);
		}
	}

	@ObfuscatedName("w")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return ((int) (var0 >>> 17 & 4294967295L));
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "(ILbi;ZI)I", garbageValue = "407625357")
	static int method1019(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) {
			class446.Interpreter_intStackSize -= 3;
			SoundSystem.queueSoundEffect(Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2]);
			return 1;
		} else if (var0 == ScriptOpcodes.SOUND_SONG) {
			class16.playSong(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]);
			return 1;
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) {
			class446.Interpreter_intStackSize -= 2;
			PcmPlayer.method719(Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]);
			return 1;
		} else {
			class83 var3;
			class82 var4;
			int var5;
			int var6;
			String var7;
			if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) {
				if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) {
					return var0 == 3211 ? 1 : 2;
				} else {
					var3 = class83.field1074;
					var4 = class82.field1069;
					boolean var8 = false;
					if (var0 == 3214) {
						var6 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
						var3 = ((class83) (Actor.findEnumerated(MilliClock.method3310(), var6)));
						if (var3 == null) {
							throw new RuntimeException(String.format("Unrecognized device option %d", var6));
						}
					}
					if (var0 == 3215) {
						var6 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
						var4 = ((class82) (Actor.findEnumerated(WorldMapData_1.method4867(), var6)));
						if (var4 == null) {
							throw new RuntimeException(String.format("Unrecognized game option %d", var6));
						}
					}
					if (var0 == 3210) {
						var6 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
						var3 = ((class83) (Actor.findEnumerated(MilliClock.method3310(), var6)));
						if (var3 == null) {
							var4 = ((class82) (Actor.findEnumerated(WorldMapData_1.method4867(), var6)));
							if (var4 == null) {
								throw new RuntimeException(String.format("Unrecognized client option %d", var6));
							}
						}
					} else if (var0 == 3182) {
						var3 = class83.field1079;
					} else if (var0 == 3204) {
						var4 = class82.field1067;
					} else if (var0 == 3206) {
						var4 = class82.field1068;
					} else if (var0 == 3208) {
						var4 = class82.field1073;
					}
					if (var4 == class82.field1069) {
						switch (var3.field1080) {
							case 1 :
								var5 = (class19.clientPreferences.method2247()) ? 1 : 0;
								break;
							case 2 :
								var5 = (class19.clientPreferences.method2317()) ? 1 : 0;
								break;
							case 3 :
								var5 = (class19.clientPreferences.method2252()) ? 1 : 0;
								break;
							case 4 :
								var5 = class19.clientPreferences.method2243();
								break;
							case 5 :
								var5 = class193.method3919();
								break;
							default :
								var7 = String.format("Unkown device option: %s.", var3.toString());
								throw new RuntimeException(var7);
						}
					} else {
						switch (var4.field1065) {
							case 1 :
								var5 = (class19.clientPreferences.method2245()) ? 1 : 0;
								break;
							case 2 :
								var6 = class19.clientPreferences.method2258();
								var5 = Math.round(((float) (var6 * 100)) / 255.0F);
								break;
							case 3 :
								var6 = class19.clientPreferences.method2241();
								var5 = Math.round(((float) (var6 * 100)) / 127.0F);
								break;
							case 4 :
								var6 = class19.clientPreferences.method2262();
								var5 = Math.round(((float) (var6 * 100)) / 127.0F);
								break;
							default :
								var7 = String.format("Unkown game option: %s.", var4.toString());
								throw new RuntimeException(var7);
						}
					}
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var5;
					return 1;
				}
			} else {
				var3 = class83.field1074;
				var4 = class82.field1069;
				var5 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
				if (var0 == 3212) {
					var6 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
					var3 = ((class83) (Actor.findEnumerated(MilliClock.method3310(), var6)));
					if (var3 == null) {
						throw new RuntimeException(String.format("Unrecognized device option %d", var6));
					}
				}
				if (var0 == 3213) {
					var6 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
					var4 = ((class82) (Actor.findEnumerated(WorldMapData_1.method4867(), var6)));
					if (var4 == null) {
						throw new RuntimeException(String.format("Unrecognized game option %d", var6));
					}
				}
				if (var0 == 3209) {
					var6 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
					var3 = ((class83) (Actor.findEnumerated(MilliClock.method3310(), var6)));
					if (var3 == null) {
						var4 = ((class82) (Actor.findEnumerated(WorldMapData_1.method4867(), var6)));
						if (var4 == null) {
							throw new RuntimeException(String.format("Unrecognized client option %d", var6));
						}
					}
				} else if (var0 == 3181) {
					var3 = class83.field1079;
				} else if (var0 == 3203) {
					var4 = class82.field1067;
				} else if (var0 == 3205) {
					var4 = class82.field1068;
				} else if (var0 == 3207) {
					var4 = class82.field1073;
				}
				if (var4 == class82.field1069) {
					switch (var3.field1080) {
						case 1 :
							class19.clientPreferences.method2246(var5 == 1);
							break;
						case 2 :
							class19.clientPreferences.method2248(var5 == 1);
							break;
						case 3 :
							class19.clientPreferences.method2250(var5 == 1);
							break;
						case 4 :
							if (var5 < 0) {
								var5 = 0;
							}
							class19.clientPreferences.method2330(var5);
							break;
						case 5 :
							WorldMapEvent.method5120(var5);
							break;
						default :
							var7 = String.format("Unkown device option: %s.", var3.toString());
							throw new RuntimeException(var7);
					}
				} else {
					switch (var4.field1065) {
						case 1 :
							class19.clientPreferences.method2339(var5 == 1);
							break;
						case 2 :
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round(((float) (var5 * 255)) / 100.0F);
							PacketBufferNode.method5196(var6);
							break;
						case 3 :
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round(((float) (var5 * 127)) / 100.0F);
							WorldMapData_0.method4563(var6);
							break;
						case 4 :
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round(((float) (var5 * 127)) / 100.0F);
							WorldMapEvent.method5121(var6);
							break;
						default :
							var7 = String.format("Unkown game option: %s.", var4.toString());
							throw new RuntimeException(var7);
					}
				}
				return 1;
			}
		}
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(descriptor = "(IIIIIS)V", garbageValue = "1000")
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = class356.scene.getBoundaryObjectTag(var0, var1, var2);
		int var7;
		int var8;
		int var9;
		int var10;
		int var12;
		int var13;
		if (0L != var5) {
			var7 = class356.scene.getObjectFlags(var0, var1, var2, var5);
			var8 = var7 >> 6 & 3;
			var9 = var7 & 31;
			var10 = var3;
			if (Canvas.method322(var5)) {
				var10 = var4;
			}
			int[] var11 = FloorUnderlayDefinition.sceneMinimapSprite.pixels;
			var12 = var1 * 4 + (103 - var2) * 2048 + 24624;
			var13 = Entity_unpackID(var5);
			ObjectComposition var14 = class162.getObjectDefinition(var13);
			if (var14.mapSceneId != -1) {
				IndexedSprite var15 = class13.mapSceneSprites[var14.mapSceneId];
				if (var15 != null) {
					int var16 = (var14.sizeX * 4 - var15.subWidth) / 2;
					int var17 = (var14.sizeY * 4 - var15.subHeight) / 2;
					var15.drawAt(var1 * 4 + var16 + 48, (104 - var2 - var14.sizeY) * 4 + var17 + 48);
				}
			} else {
				if (var9 == 0 || var9 == 2) {
					if (var8 == 0) {
						var11[var12] = var10;
						var11[var12 + 512] = var10;
						var11[var12 + 1024] = var10;
						var11[var12 + 1536] = var10;
					} else if (var8 == 1) {
						var11[var12] = var10;
						var11[var12 + 1] = var10;
						var11[var12 + 2] = var10;
						var11[var12 + 3] = var10;
					} else if (var8 == 2) {
						var11[var12 + 3] = var10;
						var11[var12 + 512 + 3] = var10;
						var11[var12 + 1024 + 3] = var10;
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 3) {
						var11[var12 + 1536] = var10;
						var11[var12 + 1536 + 1] = var10;
						var11[var12 + 1536 + 2] = var10;
						var11[var12 + 1536 + 3] = var10;
					}
				}
				if (var9 == 3) {
					if (var8 == 0) {
						var11[var12] = var10;
					} else if (var8 == 1) {
						var11[var12 + 3] = var10;
					} else if (var8 == 2) {
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 3) {
						var11[var12 + 1536] = var10;
					}
				}
				if (var9 == 2) {
					if (var8 == 3) {
						var11[var12] = var10;
						var11[var12 + 512] = var10;
						var11[var12 + 1024] = var10;
						var11[var12 + 1536] = var10;
					} else if (var8 == 0) {
						var11[var12] = var10;
						var11[var12 + 1] = var10;
						var11[var12 + 2] = var10;
						var11[var12 + 3] = var10;
					} else if (var8 == 1) {
						var11[var12 + 3] = var10;
						var11[var12 + 512 + 3] = var10;
						var11[var12 + 1024 + 3] = var10;
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 2) {
						var11[var12 + 1536] = var10;
						var11[var12 + 1536 + 1] = var10;
						var11[var12 + 1536 + 2] = var10;
						var11[var12 + 1536 + 3] = var10;
					}
				}
			}
		}
		var5 = class356.scene.getGameObjectTag(var0, var1, var2);
		if (0L != var5) {
			var7 = class356.scene.getObjectFlags(var0, var1, var2, var5);
			var8 = var7 >> 6 & 3;
			var9 = var7 & 31;
			var10 = Entity_unpackID(var5);
			ObjectComposition var24 = class162.getObjectDefinition(var10);
			int var19;
			if (var24.mapSceneId != -1) {
				IndexedSprite var20 = class13.mapSceneSprites[var24.mapSceneId];
				if (var20 != null) {
					var13 = (var24.sizeX * 4 - var20.subWidth) / 2;
					var19 = (var24.sizeY * 4 - var20.subHeight) / 2;
					var20.drawAt(var1 * 4 + var13 + 48, var19 + (104 - var2 - var24.sizeY) * 4 + 48);
				}
			} else if (var9 == 9) {
				var12 = 15658734;
				if (Canvas.method322(var5)) {
					var12 = 15597568;
				}
				int[] var18 = FloorUnderlayDefinition.sceneMinimapSprite.pixels;
				var19 = var1 * 4 + (103 - var2) * 2048 + 24624;
				if (var8 != 0 && var8 != 2) {
					var18[var19] = var12;
					var18[var19 + 1 + 512] = var12;
					var18[var19 + 1024 + 2] = var12;
					var18[var19 + 1536 + 3] = var12;
				} else {
					var18[var19 + 1536] = var12;
					var18[var19 + 1 + 1024] = var12;
					var18[var19 + 512 + 2] = var12;
					var18[var19 + 3] = var12;
				}
			}
		}
		var5 = class356.scene.getFloorDecorationTag(var0, var1, var2);
		if (var5 != 0L) {
			var7 = Entity_unpackID(var5);
			ObjectComposition var21 = class162.getObjectDefinition(var7);
			if (var21.mapSceneId != -1) {
				IndexedSprite var22 = class13.mapSceneSprites[var21.mapSceneId];
				if (var22 != null) {
					var10 = (var21.sizeX * 4 - var22.subWidth) / 2;
					int var23 = (var21.sizeY * 4 - var22.subHeight) / 2;
					var22.drawAt(var10 + var1 * 4 + 48, var23 + (104 - var2 - var21.sizeY) * 4 + 48);
				}
			}
		}
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(descriptor = "(Lkb;IIZI)V", garbageValue = "2074727207")
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width;
		int var5 = var0.height;
		if (var0.widthAlignment == 0) {
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) {
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) {
			var0.width = var0.rawWidth * var1 >> 14;
		}
		if (var0.heightAlignment == 0) {
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) {
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) {
			var0.height = var2 * var0.rawHeight >> 14;
		}
		if (var0.widthAlignment == 4) {
			var0.width = var0.height * var0.field3385 / var0.field3386;
		}
		if (var0.heightAlignment == 4) {
			var0.height = var0.field3386 * var0.width / var0.field3385;
		}
		if (var0.contentType == 1337) {
			Client.viewportWidget = var0;
		}
		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) {
			ScriptEvent var6 = new ScriptEvent();
			var6.widget = var0;
			var6.args = var0.onResize;
			Client.scriptEvents.addFirst(var6);
		}
	}
}