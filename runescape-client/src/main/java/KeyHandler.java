import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("e")
@Implements("KeyHandler")
public final class KeyHandler implements KeyListener , FocusListener {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Le;")

	@Export("KeyHandler_instance")
	public static KeyHandler KeyHandler_instance;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(intValue = 
	138807253)

	static int field140;
	@ObfuscatedName("cu")
	@Export("KeyHandler_pressedKeys")
	public static boolean[] KeyHandler_pressedKeys;
	@ObfuscatedName("cl")
	public static boolean[] field121;
	@ObfuscatedName("cv")
	public static boolean[] field125;
	@ObfuscatedName("cg")
	public static int[] field129;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(intValue = 
	1330451443)

	public static int field138;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(intValue = 
	542360451)

	public static int field124;
	@ObfuscatedName("cq")
	static char[] field115;
	@ObfuscatedName("cf")
	static int[] field130;
	@ObfuscatedName("cm")
	public static int[] field139;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(intValue = 
	480717521)

	public static int field132;
	@ObfuscatedName("cj")
	public static int[] field133;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(intValue = 
	1701924001)

	public static int field134;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(intValue = 
	1014391871)

	public static int field135;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(intValue = 
	-1239653249)

	public static int field136;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(intValue = 
	-463917317)

	public static int field137;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(intValue = 
	-958068693)

	@Export("KeyHandler_idleCycles")
	public static volatile int KeyHandler_idleCycles;
	@ObfuscatedName("de")
	@Export("KeyHandler_keyCodes")
	static int[] KeyHandler_keyCodes;
	static 
	{
		KeyHandler_instance = new KeyHandler();
		KeyHandler_pressedKeys = new boolean[112];
		field121 = new boolean[112];
		field125 = new boolean[112];
		field129 = new int[128];
		field138 = 0;
		field124 = 0;
		field115 = new char[128];
		field130 = new int[128];
		field139 = new int[128];
		field132 = 0;
		field133 = new int[128];
		field134 = 0;
		field135 = 0;
		field136 = 0;
		field137 = 0;
		KeyHandler_idleCycles = 0;
		KeyHandler_keyCodes = new int[]{ -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
	}

	KeyHandler() {
	}

	public synchronized final void focusLost(FocusEvent var1) {
		if (KeyHandler_instance != null) {
			field124 = -1;
		}

	}

	public final void keyTyped(KeyEvent var1) {
		if (KeyHandler_instance != null) {
			char var2 = var1.getKeyChar();
			if ((var2 != 0) && (var2 != '￿')) {
				boolean var3;
				if (((var2 > 0) && (var2 < 128)) || ((var2 >= 160) && (var2 <= 255))) {
					var3 = true;
				} else {
					label57 : {
						if (var2 != 0) {
							char[] var4 = class345.cp1252AsciiExtension;

							for (int var5 = 0; var5 < var4.length; ++var5) {
								char var6 = var4[var5];
								if (var6 == var2) {
									var3 = true;
									break label57;
								}
							}
						}

						var3 = false;
					}
				}

				if (var3) {
					int var7 = (field136 + 1) & 127;
					if (var7 != field135) {
						field130[field136] = -1;
						field115[field136] = var2;
						field136 = var7;
					}
				}
			}
		}

		var1.consume();
	}

	public synchronized final void keyReleased(KeyEvent var1) {
		if (KeyHandler_instance != null) {
			int var2 = var1.getKeyCode();
			if ((var2 >= 0) && (var2 < KeyHandler.KeyHandler_keyCodes.length)) {
				var2 = KeyHandler_keyCodes[var2] & (-129);
			} else {
				var2 = -1;
			}

			if ((field124 >= 0) && (var2 >= 0)) {
				field129[field124] = ~var2;
				field124 = (field124 + 1) & 127;
				if (field124 == field138) {
					field124 = -1;
				}
			}
		}

		var1.consume();
	}

	public final void focusGained(FocusEvent var1) {
	}

	public synchronized final void keyPressed(KeyEvent var1) {
		if (KeyHandler_instance != null) {
			int var2 = var1.getKeyCode();
			if ((var2 >= 0) && (var2 < KeyHandler.KeyHandler_keyCodes.length)) {
				var2 = KeyHandler_keyCodes[var2];
				if ((var2 & 128) != 0) {
					var2 = -1;
				}
			} else {
				var2 = -1;
			}

			if ((field124 >= 0) && (var2 >= 0)) {
				field129[field124] = var2;
				field124 = (field124 + 1) & 127;
				if (field124 == field138) {
					field124 = -1;
				}
			}

			int var3;
			if (var2 >= 0) {
				var3 = (field136 + 1) & 127;
				if (var3 != field135) {
					field130[field136] = var2;
					field115[field136] = 0;
					field136 = var3;
				}
			}

			var3 = var1.getModifiers();
			if ((((var3 & 10) != 0) || (var2 == 85)) || (var2 == 10)) {
				var1.consume();
			}
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"-1076431446")

	static void method377(int var0) {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(I)Lnf;", garbageValue = 
	"1727286765")

	public static class386 method378() {
		synchronized(class386.field4342) {
			if (class386.field4336 == 0) {
				return new class386();
			} else {
				class386.field4342[--class386.field4336].method7033();
				return class386.field4342[class386.field4336];
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"-2117472619")

	public static boolean method376() {
		return class273.musicPlayerStatus != 0 ? true : WorldMapEvent.midiPcmStream.isReady();
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(descriptor = 
	"(Lcw;III)V", garbageValue = 
	"840635869")

	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if ((var0.sequence == var1) && (var1 != (-1))) {
			int var3 = ItemContainer.SequenceDefinition_get(var1).field2172;
			if (var3 == 1) {
				var0.sequenceFrame = 0;
				var0.sequenceFrameCycle = 0;
				var0.sequenceDelay = var2;
				var0.field1169 = 0;
			}

			if (var3 == 2) {
				var0.field1169 = 0;
			}
		} else if (((var1 == (-1)) || (var0.sequence == (-1))) || (ItemContainer.SequenceDefinition_get(var1).field2166 >= ItemContainer.SequenceDefinition_get(var0.sequence).field2166)) {
			var0.sequence = var1;
			var0.sequenceFrame = 0;
			var0.sequenceFrameCycle = 0;
			var0.sequenceDelay = var2;
			var0.field1169 = 0;
			var0.field1134 = var0.pathLength;
		}

	}
}