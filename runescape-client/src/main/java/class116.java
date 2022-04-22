import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
public enum class116 implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Ldi;")

	field1403(0, 0),
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Ldi;")

	field1399(1, 1),
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"Ldi;")

	field1400(2, 2),
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"Ldi;")

	field1406(3, 3),
	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"Ldi;")

	field1401(4, 4);

	@ObfuscatedName("r")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	322402379)

	final int field1398;
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 
	-314756427)

	final int field1404;

	class116(int var3, int var4) {
		this.field1398 = var3;
		this.field1404 = var4;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"16")

	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1404;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1031484167")

	public static void method2705() {
		if (MouseHandler.MouseHandler_instance != null) {
			synchronized(MouseHandler.MouseHandler_instance) {
				MouseHandler.MouseHandler_instance = null;
			}
		}

	}

	@ObfuscatedName("fz")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-2133644638")

	@Export("playPcmPlayers")
	static final void playPcmPlayers() {
		if (ViewportMouse.pcmPlayer1 != null) {
			ViewportMouse.pcmPlayer1.run();
		}

		if (KeyHandler.pcmPlayer0 != null) {
			KeyHandler.pcmPlayer0.run();
		}

	}}