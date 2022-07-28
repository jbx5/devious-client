import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.rs.ScriptOpcodes;
@ObfuscatedName("dj")
public class class122 extends DualNode {
	@ObfuscatedName("rw")
	static boolean field1499;

	@ObfuscatedName("tn")
	@ObfuscatedGetter(intValue = 97851213)
	static int field1500;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 1372004053)
	int field1496;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "[[Ldp;")
	public class117[][] field1495 = null;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "[[Ldp;")
	class117[][] field1494 = null;

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Lgn;")
	public Skeleton field1498;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 779215479)
	int field1497 = 0;

	@ObfuscatedName("w")
	boolean field1492;

	@ObfuscatedSignature(descriptor = "(Llc;Llc;IZ)V")
	class122(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1496 = var3;
		byte[] var5 = var1.takeFile(this.field1496 >> 16 & '￿', this.field1496 & '￿');
		Buffer var6 = new Buffer(var5);
		int var7 = var6.readUnsignedByte();
		int var8 = var6.readUnsignedShort();
		byte[] var9;
		if (var4) {
			var9 = var2.getFile(0, var8);
		} else {
			var9 = var2.getFile(var8, 0);
		}
		this.field1498 = new Skeleton(var8, var9);
		this.method2843(var6, var7);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lqw;II)V", garbageValue = "1383908694")
	void method2843(Buffer var1, int var2) {
		var1.readUnsignedShort();
		var1.readUnsignedShort();
		this.field1497 = var1.readUnsignedByte();
		int var3 = var1.readUnsignedShort();
		this.field1494 = new class117[this.field1498.method4103().method4091()][];
		this.field1495 = new class117[this.field1498.method4101()][];
		for (int var4 = 0; var4 < var3; ++var4) {
			class118 var5 = SequenceDefinition.method3854(var1.readUnsignedByte());
			int var6 = var1.readShortSmart();
			class119 var7 = LoginScreenAnimation.method2305(var1.readUnsignedByte());
			class117 var8 = new class117();
			var8.method2773(var1, var2);
			int var9 = var5.method2800();
			class117[][] var10;
			if (var5 == class118.field1453) {
				var10 = this.field1494;
			} else {
				var10 = this.field1495;
			}
			if (var10[var6] == null) {
				var10[var6] = new class117[var9];
			}
			var10[var6][var7.method2818()] = var8;
			if (var5 == class118.field1456) {
				this.field1492 = true;
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1862335606")
	public int method2827() {
		return this.field1497;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "1374676526")
	public boolean method2828() {
		return this.field1492;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(ILdo;III)V", garbageValue = "171483096")
	public void method2829(int var1, class115 var2, int var3, int var4) {
		class388 var5 = MouseHandler.method574();
		this.method2842(var5, var3, var2, var1);
		this.method2825(var5, var3, var2, var1);
		this.method2838(var5, var3, var2, var1);
		var2.method2749(var5);
		var5.method7027();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Lnb;ILdo;II)V", garbageValue = "-960844295")
	void method2842(class388 var1, int var2, class115 var3, int var4) {
		float[] var5 = var3.method2734(this.field1497);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1494[var2] != null) {
			class117 var9 = this.field1494[var2][0];
			class117 var10 = this.field1494[var2][1];
			class117 var11 = this.field1494[var2][2];
			if (var9 != null) {
				var6 = var9.method2777(var4);
			}
			if (var10 != null) {
				var7 = var10.method2777(var4);
			}
			if (var11 != null) {
				var8 = var11.method2777(var4);
			}
		}
		class387 var16 = ReflectionCheck.method612();
		var16.method6973(1.0F, 0.0F, 0.0F, var6);
		class387 var14 = ReflectionCheck.method612();
		var14.method6973(0.0F, 1.0F, 0.0F, var7);
		class387 var15 = ReflectionCheck.method612();
		var15.method6973(0.0F, 0.0F, 1.0F, var8);
		class387 var12 = ReflectionCheck.method612();
		var12.method6970(var15);
		var12.method6970(var16);
		var12.method6970(var14);
		class388 var13 = MouseHandler.method574();
		var13.method7051(var12);
		var1.method7009(var13);
		var16.method6987();
		var14.method6987();
		var15.method6987();
		var12.method6987();
		var13.method7027();
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(Lnb;ILdo;IB)V", garbageValue = "14")
	void method2838(class388 var1, int var2, class115 var3, int var4) {
		float[] var5 = var3.method2739(this.field1497);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1494[var2] != null) {
			class117 var9 = this.field1494[var2][3];
			class117 var10 = this.field1494[var2][4];
			class117 var11 = this.field1494[var2][5];
			if (var9 != null) {
				var6 = var9.method2777(var4);
			}
			if (var10 != null) {
				var7 = var10.method2777(var4);
			}
			if (var11 != null) {
				var8 = var11.method2777(var4);
			}
		}
		var1.field4410[12] = var6;
		var1.field4410[13] = var7;
		var1.field4410[14] = var8;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(Lnb;ILdo;II)V", garbageValue = "-1985038620")
	void method2825(class388 var1, int var2, class115 var3, int var4) {
		float[] var5 = var3.method2736(this.field1497);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1494[var2] != null) {
			class117 var9 = this.field1494[var2][6];
			class117 var10 = this.field1494[var2][7];
			class117 var11 = this.field1494[var2][8];
			if (var9 != null) {
				var6 = var9.method2777(var4);
			}
			if (var10 != null) {
				var7 = var10.method2777(var4);
			}
			if (var11 != null) {
				var8 = var11.method2777(var4);
			}
		}
		class388 var12 = MouseHandler.method574();
		var12.method7007(var6, var7, var8);
		var1.method7009(var12);
		var12.method7027();
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(ILbc;ZI)I", garbageValue = "-1031128258")
	static int method2853(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) {
			TaskHandler.Interpreter_intStackSize -= 3;
			var9 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
			int var11 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2];
			if (var4 == 0) {
				throw new RuntimeException();
			} else {
				Widget var6 = FloorUnderlayDefinition.getWidget(var9);
				if (var6.children == null) {
					var6.children = new Widget[var11 + 1];
				}
				if (var6.children.length <= var11) {
					Widget[] var7 = new Widget[var11 + 1];
					for (int var8 = 0; var8 < var6.children.length; ++var8) {
						var7[var8] = var6.children[var8];
					}
					var6.children = var7;
				}
				if (var11 > 0 && var6.children[var11 - 1] == null) {
					throw new RuntimeException("" + (var11 - 1));
				} else {
					Widget var12 = new Widget();
					var12.type = var4;
					var12.parentId = var12.id = var6.id;
					var12.childIndex = var11;
					var12.isIf3 = true;
					var6.children[var11] = var12;
					if (var2) {
						VertexNormal.scriptDotWidget = var12;
					} else {
						class321.scriptActiveWidget = var12;
					}
					class220.invalidateWidget(var6);
					return 1;
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) {
				var3 = (var2) ? VertexNormal.scriptDotWidget : class321.scriptActiveWidget;
				Widget var10 = FloorUnderlayDefinition.getWidget(var3.id);
				var10.children[var3.childIndex] = null;
				class220.invalidateWidget(var10);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) {
				var3 = FloorUnderlayDefinition.getWidget(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]);
				var3.children = null;
				class220.invalidateWidget(var3);
				return 1;
			} else if (var0 == 103) {
				TaskHandler.Interpreter_intStackSize -= 3;
				return 1;
			} else if (var0 == 104) {
				--TaskHandler.Interpreter_intStackSize;
				return 1;
			} else if (var0 != ScriptOpcodes.CC_FIND) {
				if (var0 == ScriptOpcodes.IF_FIND) {
					var3 = FloorUnderlayDefinition.getWidget(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]);
					if (var3 != null) {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 1;
						if (var2) {
							VertexNormal.scriptDotWidget = var3;
						} else {
							class321.scriptActiveWidget = var3;
						}
					} else {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
					}
					return 1;
				} else if (var0 == 202) {
					Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1] = 0;
					return 1;
				} else if (var0 == 203) {
					Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize + 1] = 0;
					return 1;
				} else {
					return 2;
				}
			} else {
				TaskHandler.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
				Widget var5 = class293.getWidgetChild(var9, var4);
				if (var5 != null && var4 != -1) {
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 1;
					if (var2) {
						VertexNormal.scriptDotWidget = var5;
					} else {
						class321.scriptActiveWidget = var5;
					}
				} else {
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
				}
				return 1;
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(descriptor = "(ILbc;ZB)I", garbageValue = "1")
	static int method2852(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == ScriptOpcodes.ADD) {
			TaskHandler.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3 + var4;
			return 1;
		} else if (var0 == ScriptOpcodes.SUB) {
			TaskHandler.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3 - var4;
			return 1;
		} else if (var0 == ScriptOpcodes.MULTIPLY) {
			TaskHandler.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var4 * var3;
			return 1;
		} else if (var0 == ScriptOpcodes.DIV) {
			TaskHandler.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3 / var4;
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOM) {
			var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = ((int) (Math.random() * ((double) (var3))));
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOMINC) {
			var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = ((int) (Math.random() * ((double) (var3 + 1))));
			return 1;
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) {
				TaskHandler.Interpreter_intStackSize -= 5;
				var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 4];
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3 + (var4 - var3) * (var7 - var5) / (var6 - var5);
				return 1;
			} else if (var0 == ScriptOpcodes.ADDPERCENT) {
				TaskHandler.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3 + var3 * var4 / 100;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT) {
				TaskHandler.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3 | 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT) {
				TaskHandler.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3 & -1 - (1 << var4);
				return 1;
			} else if (var0 == ScriptOpcodes.TESTBIT) {
				TaskHandler.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = ((var3 & 1 << var4) != 0) ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.MOD) {
				TaskHandler.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3 % var4;
				return 1;
			} else if (var0 == ScriptOpcodes.POW) {
				TaskHandler.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
				if (var3 == 0) {
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = ((int) (Math.pow(((double) (var3)), ((double) (var4)))));
				}
				return 1;
			} else if (var0 == ScriptOpcodes.INVPOW) {
				TaskHandler.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
				if (var3 == 0) {
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
					return 1;
				} else {
					switch (var4) {
						case 0 :
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Integer.MAX_VALUE;
							break;
						case 1 :
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3;
							break;
						case 2 :
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = ((int) (Math.sqrt(((double) (var3)))));
							break;
						case 3 :
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = ((int) (Math.cbrt(((double) (var3)))));
							break;
						case 4 :
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = ((int) (Math.sqrt(Math.sqrt(((double) (var3))))));
							break;
						default :
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = ((int) (Math.pow(((double) (var3)), 1.0 / ((double) (var4)))));
					}
					return 1;
				}
			} else if (var0 == ScriptOpcodes.AND) {
				TaskHandler.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3 & var4;
				return 1;
			} else if (var0 == ScriptOpcodes.OR) {
				TaskHandler.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3 | var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SCALE) {
				TaskHandler.Interpreter_intStackSize -= 3;
				long var9 = ((long) (Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]));
				long var11 = ((long) (Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]));
				long var13 = ((long) (Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2]));
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = ((int) (var13 * var9 / var11));
				return 1;
			} else if (var0 == ScriptOpcodes.BITCOUNT) {
				var3 = class21.method302(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3;
				return 1;
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) {
				TaskHandler.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3 ^ 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) {
				TaskHandler.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class137.method2962(var3, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) {
				TaskHandler.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = ModelData0.method4493(var3, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) {
				TaskHandler.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2];
				var6 = 31 - var5;
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3 << var6 >>> var4 + var6;
				return 1;
			} else if (var0 == 4030) {
				TaskHandler.Interpreter_intStackSize -= 4;
				var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 3];
				var3 = ModelData0.method4493(var3, var5, var6);
				var7 = ScriptEvent.method2168(var6 - var5 + 1);
				if (var4 > var7) {
					var4 = var7;
				}
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3 | var4 << var5;
				return 1;
			} else if (var0 == 4032) {
				Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize - 1] = ChatChannel.method2060(Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4033) {
				Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize - 1] = WorldMapDecoration.method4969(Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4034) {
				TaskHandler.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
				var5 = ClanSettings.method3043(var3, var4);
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var5;
				return 1;
			} else if (var0 == 4035) {
				Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize - 1]);
				return 1;
			} else {
				return 2;
			}
		}
	}
}