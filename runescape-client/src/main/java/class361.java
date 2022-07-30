import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import java.util.Comparator;
@ObfuscatedName("ms")
class class361 implements Comparator {
	@ObfuscatedSignature(descriptor = "Lmq;")
	final class362 this$0;

	@ObfuscatedSignature(descriptor = "(Lmq;)V")
	class361(class362 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lmz;Lmz;B)I", garbageValue = "30")
	int method6581(class363 var1, class363 var2) {
		if (var1.field4292 > var2.field4292) {
			return 1;
		} else {
			return var1.field4292 < var2.field4292 ? -1 : 0;
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method6581(((class363) (var1)), ((class363) (var2)));
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(ILbc;ZI)I", garbageValue = "971647238")
	static int method6591(int var0, Script var1, boolean var2) {
		int var3 = -1;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
			var4 = FloorUnderlayDefinition.getWidget(var3);
		} else {
			var4 = (var2) ? VertexNormal.scriptDotWidget : class321.scriptActiveWidget;
		}
		if (var0 == ScriptOpcodes.CC_SETPOSITION) {
			TaskHandler.Interpreter_intStackSize -= 4;
			var4.rawX = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
			var4.rawY = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
			var4.xAlignment = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2];
			var4.yAlignment = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 3];
			class220.invalidateWidget(var4);
			class329.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				class439.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var3 >> 16], var4, false);
			}
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) {
			TaskHandler.Interpreter_intStackSize -= 4;
			var4.rawWidth = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
			var4.rawHeight = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
			var4.widthAlignment = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2];
			var4.heightAlignment = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 3];
			class220.invalidateWidget(var4);
			class329.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				class439.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var3 >> 16], var4, false);
			}
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) {
			boolean var5 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
			if (var5 != var4.isHidden) {
				var4.isHidden = var5;
				class220.invalidateWidget(var4);
			}
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) {
			var4.noClickThrough = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) {
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "(ILbc;ZB)I", garbageValue = "-34")
	static int method6588(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) {
			TaskHandler.Interpreter_intStackSize -= 3;
			class174.queueSoundEffect(Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize], Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2]);
			return 1;
		} else if (var0 == ScriptOpcodes.SOUND_SONG) {
			class1.playSong(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]);
			return 1;
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) {
			TaskHandler.Interpreter_intStackSize -= 2;
			MouseRecorder.method2170(Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize], Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]);
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
					var3 = class83.field1076;
					var4 = class82.field1072;
					boolean var8 = false;
					if (var0 == 3214) {
						var6 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
						var3 = ((class83) (class271.findEnumerated(class144.method3086(), var6)));
						if (var3 == null) {
							throw new RuntimeException(String.format("Unrecognized device option %d", var6));
						}
					}
					if (var0 == 3215) {
						var6 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
						var4 = ((class82) (class271.findEnumerated(BoundaryObject.method4494(), var6)));
						if (var4 == null) {
							throw new RuntimeException(String.format("Unrecognized game option %d", var6));
						}
					}
					if (var0 == 3210) {
						var6 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
						var3 = ((class83) (class271.findEnumerated(class144.method3086(), var6)));
						if (var3 == null) {
							var4 = ((class82) (class271.findEnumerated(BoundaryObject.method4494(), var6)));
							if (var4 == null) {
								throw new RuntimeException(String.format("Unrecognized client option %d", var6));
							}
						}
					} else if (var0 == 3182) {
						var3 = class83.field1078;
					} else if (var0 == 3204) {
						var4 = class82.field1069;
					} else if (var0 == 3206) {
						var4 = class82.field1065;
					} else if (var0 == 3208) {
						var4 = class82.field1064;
					}
					if (var4 == class82.field1072) {
						switch (var3.field1074) {
							case 1 :
								var5 = (class260.clientPreferences.method2326()) ? 1 : 0;
								break;
							case 2 :
								var5 = (class260.clientPreferences.method2316()) ? 1 : 0;
								break;
							case 3 :
								var5 = (class260.clientPreferences.method2339()) ? 1 : 0;
								break;
							case 4 :
								var5 = class260.clientPreferences.method2321();
								break;
							case 5 :
								var5 = class155.method3238();
								break;
							default :
								var7 = String.format("Unkown device option: %s.", var3.toString());
								throw new RuntimeException(var7);
						}
					} else {
						switch (var4.field1067) {
							case 1 :
								var5 = (class260.clientPreferences.method2312()) ? 1 : 0;
								break;
							case 2 :
								var6 = class260.clientPreferences.method2335();
								var5 = Math.round(((float) (var6 * 100)) / 255.0F);
								break;
							case 3 :
								var6 = class260.clientPreferences.method2348();
								var5 = Math.round(((float) (var6 * 100)) / 127.0F);
								break;
							case 4 :
								var6 = class260.clientPreferences.method2329();
								var5 = Math.round(((float) (var6 * 100)) / 127.0F);
								break;
							default :
								var7 = String.format("Unkown game option: %s.", var4.toString());
								throw new RuntimeException(var7);
						}
					}
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var5;
					return 1;
				}
			} else {
				var3 = class83.field1076;
				var4 = class82.field1072;
				var5 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
				if (var0 == 3212) {
					var6 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
					var3 = ((class83) (class271.findEnumerated(class144.method3086(), var6)));
					if (var3 == null) {
						throw new RuntimeException(String.format("Unrecognized device option %d", var6));
					}
				}
				if (var0 == 3213) {
					var6 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
					var4 = ((class82) (class271.findEnumerated(BoundaryObject.method4494(), var6)));
					if (var4 == null) {
						throw new RuntimeException(String.format("Unrecognized game option %d", var6));
					}
				}
				if (var0 == 3209) {
					var6 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
					var3 = ((class83) (class271.findEnumerated(class144.method3086(), var6)));
					if (var3 == null) {
						var4 = ((class82) (class271.findEnumerated(BoundaryObject.method4494(), var6)));
						if (var4 == null) {
							throw new RuntimeException(String.format("Unrecognized client option %d", var6));
						}
					}
				} else if (var0 == 3181) {
					var3 = class83.field1078;
				} else if (var0 == 3203) {
					var4 = class82.field1069;
				} else if (var0 == 3205) {
					var4 = class82.field1065;
				} else if (var0 == 3207) {
					var4 = class82.field1064;
				}
				if (var4 == class82.field1072) {
					switch (var3.field1074) {
						case 1 :
							class260.clientPreferences.method2389(var5 == 1);
							break;
						case 2 :
							class260.clientPreferences.method2347(var5 == 1);
							break;
						case 3 :
							class260.clientPreferences.method2338(var5 == 1);
							break;
						case 4 :
							if (var5 < 0) {
								var5 = 0;
							}
							class260.clientPreferences.method2320(var5);
							break;
						case 5 :
							WallDecoration.method4516(var5);
							break;
						default :
							var7 = String.format("Unkown device option: %s.", var3.toString());
							throw new RuntimeException(var7);
					}
				} else {
					switch (var4.field1067) {
						case 1 :
							class260.clientPreferences.method2311(var5 == 1);
							break;
						case 2 :
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round(((float) (var5 * 255)) / 100.0F);
							class228.method4875(var6);
							break;
						case 3 :
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round(((float) (var5 * 127)) / 100.0F);
							Player.method2248(var6);
							break;
						case 4 :
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round(((float) (var5 * 127)) / 100.0F);
							class136.method2949(var6);
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
}