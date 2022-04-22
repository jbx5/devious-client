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
	@ObfuscatedName("sz")
	@ObfuscatedSignature(descriptor = 
	"Lay;")

	@Export("pcmPlayer0")
	static PcmPlayer pcmPlayer0;
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Le;")

	@Export("KeyHandler_instance")
	public static KeyHandler KeyHandler_instance;
	@ObfuscatedName("cp")
	@Export("KeyHandler_pressedKeys")
	public static boolean[] KeyHandler_pressedKeys;
	@ObfuscatedName("co")
	public static boolean[] field140;
	@ObfuscatedName("ca")
	public static boolean[] field131;
	@ObfuscatedName("cr")
	public static int[] field145;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(intValue = 
	818092329)

	public static int field133;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(intValue = 
	-119285303)

	public static int field128;
	@ObfuscatedName("cu")
	static char[] field135;
	@ObfuscatedName("cg")
	static int[] field136;
	@ObfuscatedName("cj")
	public static int[] field143;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(intValue = 
	-1041441839)

	public static int field118;
	@ObfuscatedName("cl")
	public static int[] field139;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(intValue = 
	-1817748749)

	public static int field132;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(intValue = 
	-2054154743)

	public static int field141;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(intValue = 
	295038649)

	public static int field142;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(intValue = 
	-1399162193)

	public static int field138;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(intValue = 
	-1784108457)

	@Export("KeyHandler_idleCycles")
	public static volatile int KeyHandler_idleCycles;
	@ObfuscatedName("dj")
	@Export("KeyHandler_keyCodes")
	static int[] KeyHandler_keyCodes;
	@ObfuscatedName("es")
	@ObfuscatedGetter(longValue = 
	4474634211423163711L)

	static long field149;
	@ObfuscatedName("el")
	@ObfuscatedSignature(descriptor = 
	"Llx;")

	@Export("archive0")
	static Archive archive0;
	static 
	{
		KeyHandler_instance = new KeyHandler();
		KeyHandler_pressedKeys = new boolean[112];
		field140 = new boolean[112];
		field131 = new boolean[112];
		field145 = new int[128];
		field133 = 0;
		field128 = 0;
		field135 = new char[128];
		field136 = new int[128];
		field143 = new int[128];
		field118 = 0;
		field139 = new int[128];
		field132 = 0;
		field141 = 0;
		field142 = 0;
		field138 = 0;
		KeyHandler_idleCycles = 0;
		KeyHandler_keyCodes = new int[]{ -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
	}

	KeyHandler() {
	}

	public final void keyTyped(KeyEvent var1) {
		if (KeyHandler_instance != null) {
			char var2 = var1.getKeyChar();
			if (((var2 != 0) && (var2 != '￿')) && class134.method2905(var2)) {
				int var3 = (field142 + 1) & 127;
				if (var3 != field141) {
					field136[field142] = -1;
					field135[field142] = var2;
					field142 = var3;
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

			if ((field128 >= 0) && (var2 >= 0)) {
				field145[field128] = ~var2;
				field128 = (field128 + 1) & 127;
				if (field133 == field128) {
					field128 = -1;
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

			if ((field128 >= 0) && (var2 >= 0)) {
				field145[field128] = var2;
				field128 = (field128 + 1) & 127;
				if (field128 == field133) {
					field128 = -1;
				}
			}

			int var3;
			if (var2 >= 0) {
				var3 = (field142 + 1) & 127;
				if (var3 != field141) {
					field136[field142] = var2;
					field135[field142] = 0;
					field142 = var3;
				}
			}

			var3 = var1.getModifiers();
			if ((((var3 & 10) != 0) || (var2 == 85)) || (var2 == 10)) {
				var1.consume();
			}
		}

	}

	public synchronized final void focusLost(FocusEvent var1) {
		if (KeyHandler_instance != null) {
			field128 = -1;
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(IB)Lft;", garbageValue = 
	"1")

	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = ((NPCComposition) (NPCComposition.NpcDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0);
			var1 = new NPCComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			NPCComposition.NpcDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(IB)Lkl;", garbageValue = 
	"-105")

	public static GameBuild method332(int var0) {
		GameBuild[] var1 = class155.method3185();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			GameBuild var3 = var1[var2];
			if (var0 == var3.buildId) {
				return var3;
			}
		}

		return null;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(IIII)V", garbageValue = 
	"-471060529")

	static final void method337(int var0, int var1, int var2) {
		int var3;
		for (var3 = 0; var3 < 8; ++var3) {
			for (int var4 = 0; var4 < 8; ++var4) {
				Tiles.Tiles_heights[var0][var3 + var1][var4 + var2] = 0;
			}
		}

		if (var1 > 0) {
			for (var3 = 1; var3 < 8; ++var3) {
				Tiles.Tiles_heights[var0][var1][var3 + var2] = Tiles.Tiles_heights[var0][var1 - 1][var3 + var2];
			}
		}

		if (var2 > 0) {
			for (var3 = 1; var3 < 8; ++var3) {
				Tiles.Tiles_heights[var0][var3 + var1][var2] = Tiles.Tiles_heights[var0][var3 + var1][var2 - 1];
			}
		}

		if ((var1 > 0) && (Tiles.Tiles_heights[var0][var1 - 1][var2] != 0)) {
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2];
		} else if ((var2 > 0) && (Tiles.Tiles_heights[var0][var1][var2 - 1] != 0)) {
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1][var2 - 1];
		} else if (((var1 > 0) && (var2 > 0)) && (Tiles.Tiles_heights[var0][var1 - 1][var2 - 1] != 0)) {
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2 - 1];
		}

	}

	@ObfuscatedName("l")
	static final void method350(long var0) {
		ViewportMouse.ViewportMouse_entityTags[(++ViewportMouse.ViewportMouse_entityCount) - 1] = var0;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;I)V", garbageValue = 
	"1206801353")

	static final void method348(String var0) {
		class149.method3138(("Please remove " + var0) + " from your friend list first");
	}

	@ObfuscatedName("ft")
	@ObfuscatedSignature(descriptor = 
	"(Lgw;IIIB)V", garbageValue = 
	"85")

	static void method336(SequenceDefinition var0, int var1, int var2, int var3) {
		if ((Client.soundEffectCount < 50) && (class131.clientPreferences.method2270() != 0)) {
			if ((var0.field2144 != null) && var0.field2144.containsKey(var1)) {
				int var4 = ((Integer) (var0.field2144.get(var1)));
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
}