import java.util.Locale;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("lb")
@Implements("Language")
public class Language implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Llb;")
	@Export("Language_EN")
	public static final Language Language_EN;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Llb;")
	@Export("Language_DE")
	static final Language Language_DE;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Llb;")
	@Export("Language_FR")
	public static final Language Language_FR;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Llb;")
	@Export("Language_PT")
	static final Language Language_PT;

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "Llb;")
	@Export("Language_NL")
	static final Language Language_NL;

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "Llb;")
	@Export("Language_ES")
	public static final Language Language_ES;

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "Llb;")
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "[Llb;")
	@Export("Language_valuesOrdered")
	public static final Language[] Language_valuesOrdered;

	@ObfuscatedName("eh")
	@ObfuscatedSignature(descriptor = "Llc;")
	static Archive field4098;

	@ObfuscatedName("mp")
	@ObfuscatedGetter(intValue = -1785071379)
	@Export("menuWidth")
	static int menuWidth;

	@ObfuscatedName("nm")
	@ObfuscatedSignature(descriptor = "Lkb;")
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;

	@ObfuscatedName("w")
	final String field4099;

	@ObfuscatedName("y")
	@Export("language")
	final String language;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = -2039584121)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field4106, 0, "GB");
		Language_DE = new Language("DE", "de", "German", ModeWhere.field4106, 1, "DE");
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field4106, 2, "FR");
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4106, 3, "BR");
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4105, 4, "NL");
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4105, 5, "ES");
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4106, 6, "MX");
		Language[] var0 = method6069();
		Language_valuesOrdered = new Language[var0.length];
		Language[] var1 = var0;
		for (int var2 = 0; var2 < var1.length; ++var2) {
			Language var3 = var1[var2];
			if (Language_valuesOrdered[var3.id] != null) {
				throw new IllegalStateException();
			}
			Language_valuesOrdered[var3.id] = var3;
		}
	}

	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llz;ILjava/lang/String;)V")
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field4099 = var1;
		this.language = var2;
		this.id = var5;
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-100")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "-2051641160")
	@Export("getLanguage")
	String getLanguage() {
		return this.language;
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(IB)Lbi;", garbageValue = "32")
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = ((Script) (Script.Script_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class267.archive12.takeFile(var0, 0);
			if (var2 == null) {
				return null;
			} else {
				var1 = class344.newScript(var2);
				Script.Script_cached.put(var1, ((long) (var0)));
				return var1;
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(B)[Llb;", garbageValue = "65")
	static Language[] method6069() {
		return new Language[]{ Language_NL, Language_ES, Language_ES_MX, Language_DE, Language_FR, Language_EN, Language_PT };
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(descriptor = "(Laz;B)V", garbageValue = "3")
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false;
		if (var0.sound != null) {
			var0.sound.position = 0;
		}
		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(descriptor = "(ILbi;ZI)I", garbageValue = "-364353679")
	static int method6068(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == ScriptOpcodes.ADD) {
			class446.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3 + var4;
			return 1;
		} else if (var0 == ScriptOpcodes.SUB) {
			class446.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3 - var4;
			return 1;
		} else if (var0 == ScriptOpcodes.MULTIPLY) {
			class446.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var4 * var3;
			return 1;
		} else if (var0 == ScriptOpcodes.DIV) {
			class446.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3 / var4;
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOM) {
			var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = ((int) (Math.random() * ((double) (var3))));
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOMINC) {
			var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = ((int) (Math.random() * ((double) (var3 + 1))));
			return 1;
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) {
				class446.Interpreter_intStackSize -= 5;
				var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 4];
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3 + (var7 - var5) * (var4 - var3) / (var6 - var5);
				return 1;
			} else if (var0 == ScriptOpcodes.ADDPERCENT) {
				class446.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3 + var4 * var3 / 100;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT) {
				class446.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3 | 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT) {
				class446.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3 & -1 - (1 << var4);
				return 1;
			} else if (var0 == ScriptOpcodes.TESTBIT) {
				class446.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = ((var3 & 1 << var4) != 0) ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.MOD) {
				class446.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3 % var4;
				return 1;
			} else if (var0 == ScriptOpcodes.POW) {
				class446.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
				if (var3 == 0) {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = ((int) (Math.pow(((double) (var3)), ((double) (var4)))));
				}
				return 1;
			} else if (var0 == ScriptOpcodes.INVPOW) {
				class446.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
				if (var3 == 0) {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
					return 1;
				} else {
					switch (var4) {
						case 0 :
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Integer.MAX_VALUE;
							break;
						case 1 :
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3;
							break;
						case 2 :
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = ((int) (Math.sqrt(((double) (var3)))));
							break;
						case 3 :
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = ((int) (Math.cbrt(((double) (var3)))));
							break;
						case 4 :
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = ((int) (Math.sqrt(Math.sqrt(((double) (var3))))));
							break;
						default :
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = ((int) (Math.pow(((double) (var3)), 1.0 / ((double) (var4)))));
					}
					return 1;
				}
			} else if (var0 == ScriptOpcodes.AND) {
				class446.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3 & var4;
				return 1;
			} else if (var0 == ScriptOpcodes.OR) {
				class446.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3 | var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SCALE) {
				class446.Interpreter_intStackSize -= 3;
				long var9 = ((long) (Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]));
				long var11 = ((long) (Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]));
				long var13 = ((long) (Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2]));
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = ((int) (var9 * var13 / var11));
				return 1;
			} else if (var0 == ScriptOpcodes.BITCOUNT) {
				var3 = class269.method5223(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3;
				return 1;
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) {
				class446.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3 ^ 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) {
				class446.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = class17.method232(var3, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) {
				class446.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = class137.method2931(var3, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) {
				class446.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2];
				var6 = 31 - var5;
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3 << var6 >>> var4 + var6;
				return 1;
			} else if (var0 == 4030) {
				class446.Interpreter_intStackSize -= 4;
				var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 3];
				var3 = class137.method2931(var3, var5, var6);
				var7 = VarpDefinition.method3374(var6 - var5 + 1);
				if (var4 > var7) {
					var4 = var7;
				}
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3 | var4 << var5;
				return 1;
			} else if (var0 == 4032) {
				Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize - 1] = ClanMate.method6650(Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4033) {
				Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize - 1] = class155.method3194(Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4034) {
				class446.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
				var5 = class136.method2923(var3, var4);
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var5;
				return 1;
			} else if (var0 == 4035) {
				Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize - 1]);
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "1931091160")
	static boolean method6070() {
		return (Client.drawPlayerNames & 2) != 0;
	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(descriptor = "(IIII)Lcq;", garbageValue = "-781279476")
	static final InterfaceParent method6063(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent();
		var3.group = var1;
		var3.type = var2;
		Client.interfaceParents.put(var3, ((long) (var0)));
		class17.Widget_resetModelFrames(var1);
		Widget var4 = class140.getWidget(var0);
		ChatChannel.invalidateWidget(var4);
		if (Client.meslayerContinueWidget != null) {
			ChatChannel.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}
		BufferedNetSocket.revalidateWidgetScroll(SoundCache.Widget_interfaceComponents[var0 >> 16], var4, false);
		WorldMapLabelSize.runWidgetOnLoadListener(var1);
		if (Client.rootInterface != -1) {
			class7.runIntfCloseListeners(Client.rootInterface, 1);
		}
		return var3;
	}
}