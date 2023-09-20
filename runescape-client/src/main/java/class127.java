import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
public class class127 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1679119383
	)
	int field1492;
	@ObfuscatedName("al")
	float field1490;
	@ObfuscatedName("ak")
	float field1491;
	@ObfuscatedName("ax")
	float field1495;
	@ObfuscatedName("ao")
	float field1489;
	@ObfuscatedName("ah")
	float field1494;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	class127 field1493;

	class127() {
		this.field1491 = Float.MAX_VALUE;
		this.field1495 = Float.MAX_VALUE;
		this.field1489 = Float.MAX_VALUE;
		this.field1494 = Float.MAX_VALUE;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;II)V",
		garbageValue = "1810575829"
	)
	void method2943(Buffer var1, int var2) {
		this.field1492 = var1.readShort();
		this.field1490 = var1.method9211();
		this.field1491 = var1.method9211();
		this.field1495 = var1.method9211();
		this.field1489 = var1.method9211();
		this.field1494 = var1.method9211();
	}

	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "(Lnm;IIIB)V",
		garbageValue = "-59"
	)
	static final void method2946(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.method6594(class33.widgetDefinition, false);
		if (var4 != null) {
			if (Client.minimapState < 3) {
				class404.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

		}
	}
}
