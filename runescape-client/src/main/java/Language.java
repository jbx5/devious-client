import java.util.Locale;





import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.Implements; import net.runelite.mapping.ObfuscatedGetter; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
@Implements("Language")
public class Language implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Llo;")

	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Llo;")

	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"Llo;")

	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"Llo;")

	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"Llo;")

	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"Llo;")

	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"Llo;")

	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"[Llo;")

	@Export("Language_valuesOrdered")
	static final Language[] Language_valuesOrdered;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(descriptor = 
	"Lnc;")

	@Export("spriteIds")
	static GraphicsDefaults spriteIds;
	@ObfuscatedName("l")
	final String field4047;
	@ObfuscatedName("q")
	@Export("language")
	final String language;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	-1865036015)

	@Export("id")
	final int id;
	static 
	{
		Language_EN = new Language("EN", "en", "English", ModeWhere.field4069, 0, "GB");
		Language_DE = new Language("DE", "de", "German", ModeWhere.field4069, 1, "DE");
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field4069, 2, "FR");
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4069, 3, "BR");
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4065, 4, "NL");
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4065, 5, "ES");
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4069, 6, "MX");
		Language[] var0 = new Language[]{ Language_ES_MX, Language_FR, Language_ES, Language_NL, Language_EN, Language_PT, Language_DE };
		Language_valuesOrdered = new Language[var0.length];
		Language[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Language var4 = var2[var3];
			if (Language_valuesOrdered[var4.id] != null) {
				throw new IllegalStateException();
			}

			Language_valuesOrdered[var4.id] = var4;
		}

	}

	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llv;ILjava/lang/String;)V")

	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field4047 = var1;
		this.language = var2;
		this.id = var5;
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"16")

	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(I)Ljava/lang/String;", garbageValue = 
	"-1969590033")

	@Export("getLanguage")
	String getLanguage() {
		return this.language;
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Llx;IIIBZI)V", garbageValue = 
	"-1446748586")

	@Export("requestNetFile")
	static void requestNetFile(Archive var0, int var1, int var2, int var3, byte var4, boolean var5) {
		long var6 = ((long) ((var1 << 16) + var2));
		NetFileRequest var8 = ((NetFileRequest) (NetCache.NetCache_pendingPriorityWrites.get(var6)));
		if (var8 == null) {
			var8 = ((NetFileRequest) (NetCache.NetCache_pendingPriorityResponses.get(var6)));
			if (var8 == null) {
				var8 = ((NetFileRequest) (NetCache.NetCache_pendingWrites.get(var6)));
				if (var8 != null) {
					if (var5) {
						var8.removeDual();
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6);
						--NetCache.NetCache_pendingWritesCount;
						++NetCache.NetCache_pendingPriorityWritesCount;
					}

				} else {
					if (!var5) {
						var8 = ((NetFileRequest) (NetCache.NetCache_pendingResponses.get(var6)));
						if (var8 != null) {
							return;
						}
					}

					var8 = new NetFileRequest();
					var8.archive = var0;
					var8.crc = var3;
					var8.padding = var4;
					if (var5) {
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6);
						++NetCache.NetCache_pendingPriorityWritesCount;
					} else {
						NetCache.NetCache_pendingWritesQueue.addFirst(var8);
						NetCache.NetCache_pendingWrites.put(var8, var6);
						++NetCache.NetCache_pendingWritesCount;
					}

				}
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(IB)Llo;", garbageValue = 
	"-24")

	public static Language method6077(int var0) {
		return (var0 >= 0) && (var0 < Language.Language_valuesOrdered.length) ? Language_valuesOrdered[var0] : null;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"(ILbd;ZI)I", garbageValue = 
	"532413421")

	static int method6079(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = class127.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
		} else {
			var3 = (var2) ? WorldMapID.scriptDotWidget : Interpreter.scriptActiveWidget;
		}

		String var4 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize];
		int[] var5 = null;
		if ((var4.length() > 0) && (var4.charAt(var4.length() - 1) == 'Y')) {
			int var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			if (var6 > 0) {
				for (var5 = new int[var6]; (var6--) > 0; var5[var6] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]) {
				}
			}

			var4 = var4.substring(0, var4.length() - 1);
		}

		Object[] var8 = new Object[var4.length() + 1];

		int var7;
		for (var7 = var8.length - 1; var7 >= 1; --var7) {
			if (var4.charAt(var7 - 1) == 's') {
				var8[var7] = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize];
			} else {
				var8[var7] = new Integer(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
			}
		}

		var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
		if (var7 != (-1)) {
			var8[0] = new Integer(var7);
		} else {
			var8 = null;
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) {
			var3.onClick = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) {
			var3.onHold = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) {
			var3.onRelease = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) {
			var3.onMouseOver = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) {
			var3.onMouseLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) {
			var3.onDrag = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) {
			var3.onTargetLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) {
			var3.onVarTransmit = var8;
			var3.varTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) {
			var3.onTimer = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) {
			var3.onOp = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) {
			var3.onDragComplete = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) {
			var3.onClickRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) {
			var3.onMouseRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) {
			var3.onInvTransmit = var8;
			var3.invTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) {
			var3.onStatTransmit = var8;
			var3.statTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) {
			var3.onTargetEnter = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) {
			var3.onScroll = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) {
			var3.onChatTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) {
			var3.onKey = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) {
			var3.onFriendTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) {
			var3.onClanTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) {
			var3.onMiscTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) {
			var3.onDialogAbort = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) {
			var3.onSubChange = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) {
			var3.onStockTransmit = var8;
		} else if (var0 == 1426) {
			var3.field3432 = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) {
			var3.onResize = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) {
			var3.field3454 = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) {
			var3.field3455 = var8;
		} else if (var0 == 1430) {
			var3.field3416 = var8;
		} else if (var0 == 1431) {
			var3.field3451 = var8;
		} else {
			if (var0 != 1434) {
				return 2;
			}

			var3.field3462 = var8;
		}

		var3.hasListener = true;
		return 1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(descriptor = 
	"(ILbd;ZI)I", garbageValue = 
	"-866525828")

	static int method6091(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) {
			Interpreter.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			if (!Client.isCameraLocked) {
				Client.camAngleX = var3;
				Client.camAngleY = var4;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.camAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.camAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			if (var3 < 0) {
				var3 = 0;
			}

			Client.camFollowHeight = var3;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.camFollowHeight;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(descriptor = 
	"(Lgw;IIII)V", garbageValue = 
	"-478908474")

	static void method6087(SequenceDefinition var0, int var1, int var2, int var3) {
		if ((Client.soundEffectCount < 50) && (class131.clientPreferences.method2270() != 0)) {
			if ((var0.soundEffects != null) && (var1 < var0.soundEffects.length)) {
				int var4 = var0.soundEffects[var1];
				if (var4 != 0) {
					int var7 = var4 >> 8;
					int var8 = (var4 >> 4) & 7;
					int var9 = var4 & 15;
					Client.soundEffectIds[Client.soundEffectCount] = var7;
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var8;
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0;
					Client.soundEffects[Client.soundEffectCount] = null;
					int var10 = (var2 - 64) / 128;
					int var11 = (var3 - 64) / 128;
					Client.soundLocations[Client.soundEffectCount] = (var9 + (var11 << 8)) + (var10 << 16);
					++Client.soundEffectCount;
				}

			}
		}
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(descriptor = 
	"(IIIIIIII)V", garbageValue = 
	"-695139684")

	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class155.loadInterface(var0)) {
			VarpDefinition.updateInterface(Widget.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6);
		}
	}
}