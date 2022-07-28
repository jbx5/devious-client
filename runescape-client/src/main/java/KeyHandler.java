import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.awt.event.KeyEvent;
import net.runelite.mapping.Implements;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyListener;
import net.runelite.mapping.Export;
@ObfuscatedName("i")
@Implements("KeyHandler")
public final class KeyHandler implements KeyListener , FocusListener {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Li;")
	@Export("KeyHandler_instance")
	static KeyHandler KeyHandler_instance = new KeyHandler();

	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 296755381)
	@Export("cacheGamebuild")
	public static int cacheGamebuild;

	@ObfuscatedName("ca")
	@Export("KeyHandler_pressedKeys")
	public static boolean[] KeyHandler_pressedKeys = new boolean[112];

	@ObfuscatedName("cq")
	static boolean[] field137 = new boolean[112];

	@ObfuscatedName("cy")
	static boolean[] field138 = new boolean[112];

	@ObfuscatedName("cr")
	static int[] field139 = new int[128];

	@ObfuscatedName("ct")
	@ObfuscatedGetter(intValue = -778276169)
	static int field140 = 0;

	@ObfuscatedName("cl")
	@ObfuscatedGetter(intValue = 1985602505)
	static int field141 = 0;

	@ObfuscatedName("cn")
	static char[] field136 = new char[128];

	@ObfuscatedName("cu")
	static int[] field128 = new int[128];

	@ObfuscatedName("ce")
	public static int[] field146 = new int[128];

	@ObfuscatedName("cv")
	@ObfuscatedGetter(intValue = 2097402935)
	public static int field131 = 0;

	@ObfuscatedName("cx")
	static int[] field135 = new int[128];

	@ObfuscatedName("cc")
	@ObfuscatedGetter(intValue = 1733509137)
	static int field142 = 0;

	@ObfuscatedName("cm")
	@ObfuscatedGetter(intValue = 174422755)
	static int field148 = 0;

	@ObfuscatedName("cb")
	@ObfuscatedGetter(intValue = 492211331)
	static int field144 = 0;

	@ObfuscatedName("cf")
	@ObfuscatedGetter(intValue = 251949657)
	static int field150 = 0;

	@ObfuscatedName("dz")
	@ObfuscatedGetter(intValue = -1218651113)
	@Export("KeyHandler_idleCycles")
	public static volatile int KeyHandler_idleCycles = 0;

	@ObfuscatedName("dc")
	@Export("KeyHandler_keyCodes")
	static int[] KeyHandler_keyCodes = new int[]{ -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	KeyHandler() {
	}

	public final synchronized void keyPressed(KeyEvent var1) {
		if (KeyHandler_instance != null) {
			int var2 = var1.getKeyCode();
			if (var2 >= 0 && var2 < KeyHandler.KeyHandler_keyCodes.length) {
				var2 = KeyHandler_keyCodes[var2];
				if ((var2 & 128) != 0) {
					var2 = -1;
				}
			} else {
				var2 = -1;
			}
			if (field141 >= 0 && var2 >= 0) {
				field139[field141] = var2;
				field141 = field141 + 1 & 127;
				if (field140 == field141) {
					field141 = -1;
				}
			}
			int var3;
			if (var2 >= 0) {
				var3 = field144 + 1 & 127;
				if (var3 != field148) {
					field128[field144] = var2;
					field136[field144] = 0;
					field144 = var3;
				}
			}
			var3 = var1.getModifiers();
			if ((var3 & 10) != 0 || var2 == 85 || var2 == 10) {
				var1.consume();
			}
		}
	}

	public final synchronized void keyReleased(KeyEvent var1) {
		if (KeyHandler_instance != null) {
			int var2 = var1.getKeyCode();
			if (var2 >= 0 && var2 < KeyHandler.KeyHandler_keyCodes.length) {
				var2 = KeyHandler_keyCodes[var2] & -129;
			} else {
				var2 = -1;
			}
			if (field141 >= 0 && var2 >= 0) {
				field139[field141] = ~var2;
				field141 = field141 + 1 & 127;
				if (field141 == field140) {
					field141 = -1;
				}
			}
		}
		var1.consume();
	}

	public final void keyTyped(KeyEvent var1) {
		if (KeyHandler_instance != null) {
			char var2 = var1.getKeyChar();
			if (var2 != 0 && var2 != '￿' && class120.method2821(var2)) {
				int var3 = field144 + 1 & 127;
				if (var3 != field148) {
					field128[field144] = -1;
					field136[field144] = var2;
					field144 = var3;
				}
			}
		}
		var1.consume();
	}

	public final void focusGained(FocusEvent var1) {
	}

	public final synchronized void focusLost(FocusEvent var1) {
		if (KeyHandler_instance != null) {
			field141 = -1;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1269206482")
	public static void method314(int var0) {
		if (class273.musicPlayerStatus != 0) {
			class273.musicTrackVolume = var0;
		} else {
			class273.midiPcmStream.setPcmStreamVolume(var0);
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(CB)Z", garbageValue = "0")
	@Export("isCharPrintable")
	public static boolean isCharPrintable(char var0) {
		if (var0 >= ' ' && var0 <= '~') {
			return true;
		} else if (var0 >= 160 && var0 <= 255) {
			return true;
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376;
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "92")
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) {
			if (ReflectionCheck.loadInterface(var0)) {
				Widget[] var1 = Widget.Widget_interfaceComponents[var0];
				for (int var2 = 0; var2 < var1.length; ++var2) {
					Widget var3 = var1[var2];
					if (var3.onLoad != null) {
						ScriptEvent var4 = new ScriptEvent();
						var4.widget = var3;
						var4.args = var3.onLoad;
						class228.runScript(var4, 5000000, 0);
					}
				}
			}
		}
	}

	@ObfuscatedName("gs")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "1743014266")
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			class260.clientPreferences.method2311(!class260.clientPreferences.method2312());
			if (class260.clientPreferences.method2312()) {
				FileSystem.addGameMessage(99, "", "Roofs are now all hidden");
			} else {
				FileSystem.addGameMessage(99, "", "Roofs will only be removed selectively");
			}
		}
		if (var0.equalsIgnoreCase("displayfps")) {
			class260.clientPreferences.method2369();
		}
		if (var0.equalsIgnoreCase("renderself")) {
			Client.renderSelf = !Client.renderSelf;
		}
		if (var0.equalsIgnoreCase("mouseovertext")) {
			Client.showMouseOverText = !Client.showMouseOverText;
		}
		if (Client.staffModLevel >= 2) {
			if (var0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (var0.equalsIgnoreCase("showcoord")) {
				class344.worldMap.showCoord = !class344.worldMap.showCoord;
			}
			if (var0.equalsIgnoreCase("fpson")) {
				class260.clientPreferences.method2338(true);
			}
			if (var0.equalsIgnoreCase("fpsoff")) {
				class260.clientPreferences.method2338(false);
			}
			if (var0.equalsIgnoreCase("gc")) {
				System.gc();
			}
			if (var0.equalsIgnoreCase("clientdrop")) {
				UserComparator4.method2654();
			}
		}
		PacketBufferNode var1 = class433.getPacketBufferNode(ClientPacket.DOCHEAT, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(var0.length() + 1);
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}
}