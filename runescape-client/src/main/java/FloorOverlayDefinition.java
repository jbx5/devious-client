import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.util.Iterator;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("gp")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Llh;")
	@Export("FloorOverlayDefinition_archive")
	static AbstractArchive FloorOverlayDefinition_archive;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lii;")
	@Export("FloorOverlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorOverlayDefinition_cached;

	@ObfuscatedName("dh")
	@ObfuscatedSignature(descriptor = "Lfm;")
	@Export("js5SocketTask")
	static Task js5SocketTask;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -745094769)
	@Export("primaryRgb")
	public int primaryRgb;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -1107449607)
	@Export("texture")
	public int texture;

	@ObfuscatedName("j")
	@Export("hideUnderlay")
	public boolean hideUnderlay;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = -857633047)
	@Export("secondaryRgb")
	public int secondaryRgb;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = -1839344211)
	@Export("hue")
	public int hue;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 1018665071)
	@Export("saturation")
	public int saturation;

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = -1467483581)
	@Export("lightness")
	public int lightness;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 581238699)
	@Export("secondaryHue")
	public int secondaryHue;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 502614653)
	@Export("secondarySaturation")
	public int secondarySaturation;

	@ObfuscatedName("t")
	@ObfuscatedGetter(intValue = -1702098767)
	@Export("secondaryLightness")
	public int secondaryLightness;

	static {
		FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	FloorOverlayDefinition() {
		this.primaryRgb = 0;
		this.texture = -1;
		this.hideUnderlay = true;
		this.secondaryRgb = -1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "75")
	@Export("postDecode")
	void postDecode() {
		if (this.secondaryRgb != -1) {
			this.setHsl(this.secondaryRgb);
			this.secondaryHue = this.hue;
			this.secondarySaturation = this.saturation;
			this.secondaryLightness = this.lightness;
		}
		this.setHsl(this.primaryRgb);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Lqt;II)V", garbageValue = "-662297766")
	@Export("decode")
	void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}
			this.decodeNext(var1, var3, var2);
		} 
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(Lqt;IIB)V", garbageValue = "-73")
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) {
			this.primaryRgb = var1.readMedium();
		} else if (var2 == 2) {
			this.texture = var1.readUnsignedByte();
		} else if (var2 == 5) {
			this.hideUnderlay = false;
		} else if (var2 == 7) {
			this.secondaryRgb = var1.readMedium();
		} else if (var2 == 8) {
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1979978882")
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = ((double) (var1 >> 16 & 255)) / 256.0;
		double var4 = ((double) (var1 >> 8 & 255)) / 256.0;
		double var6 = ((double) (var1 & 255)) / 256.0;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}
		if (var6 < var8) {
			var8 = var6;
		}
		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}
		if (var6 > var10) {
			var10 = var6;
		}
		double var12 = 0.0;
		double var14 = 0.0;
		double var16 = (var10 + var8) / 2.0;
		if (var8 != var10) {
			if (var16 < 0.5) {
				var14 = (var10 - var8) / (var10 + var8);
			}
			if (var16 >= 0.5) {
				var14 = (var10 - var8) / (2.0 - var10 - var8);
			}
			if (var2 == var10) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) {
				var12 = (var6 - var2) / (var10 - var8) + 2.0;
			} else if (var6 == var10) {
				var12 = 4.0 + (var2 - var4) / (var10 - var8);
			}
		}
		var12 /= 6.0;
		this.hue = ((int) (var12 * 256.0));
		this.saturation = ((int) (256.0 * var14));
		this.lightness = ((int) (256.0 * var16));
		if (this.saturation < 0) {
			this.saturation = 0;
		} else if (this.saturation > 255) {
			this.saturation = 255;
		}
		if (this.lightness < 0) {
			this.lightness = 0;
		} else if (this.lightness > 255) {
			this.lightness = 255;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(IIIB)I", garbageValue = "0")
	public static int method3818(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var1;
		} else if (var2 == 1) {
			return 7 - var0;
		} else {
			return var2 == 2 ? 7 - var1 : var0;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(IIIIIII)I", garbageValue = "-21815441")
	public static int method3810(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) {
			int var6 = var3;
			var3 = var4;
			var4 = var6;
		}
		var2 &= 3;
		if (var2 == 0) {
			return var0;
		} else if (var2 == 1) {
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1);
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(IIB)V", garbageValue = "61")
	static void method3808(int var0, int var1) {
		long var2 = ((long) ((var0 << 16) + var1));
		NetFileRequest var4 = ((NetFileRequest) (NetCache.NetCache_pendingWrites.get(var2)));
		if (var4 != null) {
			NetCache.NetCache_pendingWritesQueue.addLast(var4);
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Lqt;J)V")
	static void method3822(Buffer var0, long var1) {
		var1 /= 10L;
		if (var1 < 0L) {
			var1 = 0L;
		} else if (var1 > 65535L) {
			var1 = 65535L;
		}
		var0.writeShort(((int) (var1)));
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "-4424218")
	static String method3815() {
		StringBuilder var0 = new StringBuilder();
		Message var2;
		for (Iterator var1 = Messages.Messages_hashTable.iterator(); var1.hasNext(); var0.append(var2.text).append('\n')) {
			var2 = ((Message) (var1.next()));
			if (var2.sender != null && !var2.sender.isEmpty()) {
				var0.append(var2.sender).append(':');
			}
		}
		return var0.toString();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "(CI)Z", garbageValue = "1839518083")
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(ILbi;ZB)I", garbageValue = "13")
	static int method3817(int var0, Script var1, boolean var2) {
		Widget var3 = (var2) ? class124.scriptDotWidget : GrandExchangeOfferOwnWorldComparator.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = WorldMapID.Widget_unpackTargetMask(class124.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.CC_GETOP) {
			if (var0 == ScriptOpcodes.CC_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.dataText;
				}
				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
			}
			return 1;
		}
	}
}