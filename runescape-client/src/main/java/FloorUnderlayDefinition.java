import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("fh")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("FloorUnderlayDefinition_archive")
	static AbstractArchive FloorUnderlayDefinition_archive;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lia;")
	@Export("FloorUnderlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64);

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 1450812361)
	@Export("rgb")
	int rgb = 0;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = -240859239)
	@Export("hue")
	public int hue;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 198021599)
	@Export("saturation")
	public int saturation;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -1782298893)
	@Export("lightness")
	public int lightness;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 919937913)
	@Export("hueMultiplier")
	public int hueMultiplier;

	FloorUnderlayDefinition() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "266902952")
	@Export("postDecode")
	void postDecode() {
		this.setHsl(this.rgb);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(Lqw;IB)V", garbageValue = "116")
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lqw;III)V", garbageValue = "1715536911")
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) {
			this.rgb = var1.readMedium();
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-340320363")
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
				var14 = (var10 - var8) / (var8 + var10);
			}
			if (var16 >= 0.5) {
				var14 = (var10 - var8) / (2.0 - var10 - var8);
			}
			if (var10 == var2) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) {
				var12 = (var6 - var2) / (var10 - var8) + 2.0;
			} else if (var6 == var10) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0;
			}
		}
		var12 /= 6.0;
		this.saturation = ((int) (var14 * 256.0));
		this.lightness = ((int) (var16 * 256.0));
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
		if (var16 > 0.5) {
			this.hueMultiplier = ((int) (512.0 * (1.0 - var16) * var14));
		} else {
			this.hueMultiplier = ((int) (var16 * var14 * 512.0));
		}
		if (this.hueMultiplier < 1) {
			this.hueMultiplier = 1;
		}
		this.hue = ((int) (var12 * ((double) (this.hueMultiplier))));
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(IB)Lku;", garbageValue = "2")
	@Export("getWidget")
	public static Widget getWidget(int var0) {
		int var1 = var0 >> 16;
		int var2 = var0 & '￿';
		if (Widget.Widget_interfaceComponents[var1] == null || Widget.Widget_interfaceComponents[var1][var2] == null) {
			boolean var3 = ReflectionCheck.loadInterface(var1);
			if (!var3) {
				return null;
			}
		}
		return Widget.Widget_interfaceComponents[var1][var2];
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "342030351")
	static final void method3543(int var0) {
		if (var0 >= 0) {
			int var1 = Client.menuArguments1[var0];
			int var2 = Client.menuArguments2[var0];
			int var3 = Client.menuOpcodes[var0];
			int var4 = Client.menuIdentifiers[var0];
			int var5 = Client.menuItemIds[var0];
			String var6 = Client.menuActions[var0];
			String var7 = Client.menuTargets[var0];
			class9.menuAction(var1, var2, var3, var4, var5, var6, var7, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
		}
	}
}