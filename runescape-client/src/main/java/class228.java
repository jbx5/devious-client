import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("iw")
public class class228 implements class29 {
	@ObfuscatedName("aq")
	char[] field2433;
	@ObfuscatedName("aw")
	int[] field2421;
	@ObfuscatedName("al")
	public int[] field2423;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1387400999
	)
	public int field2431;
	@ObfuscatedName("ar")
	int[] field2425;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1287041361
	)
	int field2424;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1769821383
	)
	int field2427;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -882848297
	)
	int field2426;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 132126029
	)
	int field2429;
	@ObfuscatedName("au")
	boolean[] field2430;
	@ObfuscatedName("ak")
	boolean[] field2422;
	@ObfuscatedName("ah")
	boolean[] field2432;
	@ObfuscatedName("aj")
	public char field2428;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -179142201
	)
	public int field2434;

	public class228() {
		this.field2433 = new char[128];
		this.field2421 = new int[128];
		this.field2423 = new int[128];
		this.field2431 = 0;
		this.field2425 = new int[128];
		this.field2424 = 0;
		this.field2427 = 0;
		this.field2426 = 0;
		this.field2429 = 0;
		this.field2430 = new boolean[112];
		this.field2422 = new boolean[112];
		this.field2432 = new boolean[112];
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2108130536"
	)
	public boolean vmethod4425(int var1) {
		this.method4428(var1);
		this.field2430[var1] = true;
		this.field2422[var1] = true;
		this.field2432[var1] = false;
		this.field2423[++this.field2431 - 1] = var1;
		return true;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2132067941"
	)
	public boolean vmethod4442(int var1) {
		this.field2430[var1] = false;
		this.field2422[var1] = false;
		this.field2432[var1] = true;
		this.field2425[++this.field2424 - 1] = var1;
		return true;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-71"
	)
	public boolean vmethod4427(char var1) {
		int var2 = this.field2426 + 1 & 127;
		if (var2 != this.field2427) {
			this.field2421[this.field2426] = -1;
			this.field2433[this.field2426] = var1;
			this.field2426 = var2;
		}

		return false;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "289932078"
	)
	public boolean vmethod4467(boolean var1) {
		return false;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1730569940"
	)
	void method4428(int var1) {
		int var2 = this.field2426 + 1 & 127;
		if (var2 != this.field2427) {
			this.field2421[this.field2426] = var1;
			this.field2433[this.field2426] = 0;
			this.field2426 = var2;
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-675299948"
	)
	public void method4430() {
		this.field2427 = this.field2429;
		this.field2429 = this.field2426;
		this.field2431 = 0;
		this.field2424 = 0;
		Arrays.fill(this.field2422, false);
		Arrays.fill(this.field2432, false);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-994185275"
	)
	public final boolean method4431() {
		if (this.field2427 == this.field2429) {
			return false;
		} else {
			this.field2434 = this.field2421[this.field2427];
			this.field2428 = this.field2433[this.field2427];
			this.field2427 = this.field2427 + 1 & 127;
			return true;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1518666013"
	)
	public boolean method4450(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2422[var1] : false;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "93"
	)
	public boolean method4466(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2430[var1] : false;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-223195809"
	)
	public boolean method4440(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2432[var1] : false;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-36"
	)
	public int[] method4434() {
		int[] var1 = new int[this.field2431];

		for (int var2 = 0; var2 < this.field2431; ++var2) {
			var1[var2] = this.field2423[var2];
		}

		return var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1306645428"
	)
	public int[] method4435() {
		int[] var1 = new int[this.field2424];

		for (int var2 = 0; var2 < this.field2424; ++var2) {
			var1[var2] = this.field2425[var2];
		}

		return var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "36"
	)
	static int method4468(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) {
			Interpreter.Interpreter_intStackSize -= 3;
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			int var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
			if (var4 == 0) {
				throw new RuntimeException();
			} else {
				Widget var6 = ArchiveLoader.widgetDefinition.method6431(var9);
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
					if (var4 == 12) {
						var12.method6854();
						var12.method6806().method6779(new class106(var12));
						var12.method6806().method6552(new class107(var12));
					}

					var6.children[var11] = var12;
					if (var2) {
						Interpreter.scriptDotWidget = var12;
					} else {
						class141.scriptActiveWidget = var12;
					}

					UserComparator5.invalidateWidget(var6);
					return 1;
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) {
				var3 = var2 ? Interpreter.scriptDotWidget : class141.scriptActiveWidget;
				Widget var10 = ArchiveLoader.widgetDefinition.method6431(var3.id);
				var10.children[var3.childIndex] = null;
				UserComparator5.invalidateWidget(var10);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) {
				var3 = ArchiveLoader.widgetDefinition.method6431(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
				var3.children = null;
				UserComparator5.invalidateWidget(var3);
				return 1;
			} else if (var0 != ScriptOpcodes.CC_FIND) {
				if (var0 == ScriptOpcodes.IF_FIND) {
					var3 = ArchiveLoader.widgetDefinition.method6431(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
					if (var3 != null) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
						if (var2) {
							Interpreter.scriptDotWidget = var3;
						} else {
							class141.scriptActiveWidget = var3;
						}
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else {
					return 2;
				}
			} else {
				Interpreter.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Widget var5 = ArchiveLoader.widgetDefinition.getWidgetChild(var9, var4);
				if (var5 != null && var4 != -1) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
					if (var2) {
						Interpreter.scriptDotWidget = var5;
					} else {
						class141.scriptActiveWidget = var5;
					}
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lig;III)Lbf;",
		garbageValue = "-1928191246"
	)
	public static final PcmPlayer method4433(TaskHandler var0, int var1, int var2) {
		if (var1 >= 0 && var1 < 2) {
			if (var2 < 256) {
				var2 = 256;
			}

			try {
				PcmPlayer var3 = class33.pcmPlayerProvider.player();
				var3.samples = new int[(PcmPlayer.PcmPlayer_stereo ? 2 : 1) * 256];
				var3.field288 = var2;
				var3.init();
				var3.capacity = (var2 & -1024) + 1024;
				if (var3.capacity > 16384) {
					var3.capacity = 16384;
				}

				var3.open(var3.capacity);
				if (class362.field3960 > 0 && class27.soundSystem == null) {
					class27.soundSystem = new SoundSystem();
					PcmPlayer.soundSystemExecutor = Executors.newScheduledThreadPool(1);
					PcmPlayer.soundSystemExecutor.scheduleAtFixedRate(class27.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
				}

				if (class27.soundSystem != null) {
					if (class27.soundSystem.players[var1] != null) {
						throw new IllegalArgumentException();
					}

					class27.soundSystem.players[var1] = var3;
				}

				return var3;
			} catch (Throwable var4) {
				return new PcmPlayer();
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "341313905"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (ArchiveLoader.widgetDefinition.loadInterface(var0)) {
			ModelData0.field3105 = null;
			class129.drawInterface(ArchiveLoader.widgetDefinition.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7);
			if (ModelData0.field3105 != null) {
				class129.drawInterface(ModelData0.field3105, -1412584499, var1, var2, var3, var4, class103.field1354, BoundaryObject.field3111, var7);
				ModelData0.field3105 = null;
			}

		} else {
			if (var7 != -1) {
				Client.validRootWidgets[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) {
					Client.validRootWidgets[var8] = true;
				}
			}

		}
	}
}
