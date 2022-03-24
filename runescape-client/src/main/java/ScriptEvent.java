import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("a")
	@Export("ByteArrayPool_arrays")
	public static byte[][][] ByteArrayPool_arrays;
	@ObfuscatedName("pp")
	@ObfuscatedSignature(descriptor = 
	"Lps;")

	@Export("HitSplatDefinition_cachedSprites")
	static class426 HitSplatDefinition_cachedSprites;
	@ObfuscatedName("v")
	@Export("args")
	Object[] args;
	@ObfuscatedName("o")
	@Export("isMouseInputEvent")
	boolean isMouseInputEvent;
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"Lkn;")

	@Export("widget")
	Widget widget;
	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 
	590834085)

	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	-1385336571)

	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	274794473)

	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"Lkn;")

	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	639168691)

	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 
	272606769)

	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("r")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 
	1898862119)

	int field1053;
	@ObfuscatedName("x")
	@ObfuscatedGetter(intValue = 
	1051993591)

	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"([Ljava/lang/Object;I)V", garbageValue = 
	"108517262")

	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"-95")

	@Export("setType")
	public void setType(int var1) {
		this.type = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-2145174079")

	static void method2111() {
		Tiles.Tiles_underlays = null;
		Tiles.Tiles_overlays = null;
		Tiles.Tiles_shapes = null;
		RunException.field4754 = null;
		DirectByteArrayCopier.field3277 = null;
		GrandExchangeOfferNameComparator.field4010 = null;
		Widget.field3495 = null;
		class4.Tiles_hue = null;
		Login.Tiles_saturation = null;
		WorldMapSectionType.Tiles_lightness = null;
		class300.Tiles_hueMultiplier = null;
		Tiles.field986 = null;
	}
}