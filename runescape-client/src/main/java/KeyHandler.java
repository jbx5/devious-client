import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.awt.event.KeyEvent;
import net.runelite.mapping.Implements;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyListener;
import net.runelite.mapping.Export;
@ObfuscatedName("o")
@Implements("KeyHandler")
public final class KeyHandler implements KeyListener , FocusListener {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lo;")
	@Export("KeyHandler_instance")
	public static KeyHandler KeyHandler_instance;

	@ObfuscatedName("cp")
	@Export("KeyHandler_pressedKeys")
	public static boolean[] KeyHandler_pressedKeys;

	@ObfuscatedName("cf")
	public static boolean[] field136;

	@ObfuscatedName("cv")
	public static boolean[] field141;

	@ObfuscatedName("cz")
	public static int[] field138;

	@ObfuscatedName("cu")
	@ObfuscatedGetter(intValue = -1987409485)
	public static int field139;

	@ObfuscatedName("ce")
	@ObfuscatedGetter(intValue = -21544437)
	public static int field140;

	@ObfuscatedName("cy")
	static char[] field149;

	@ObfuscatedName("ca")
	static int[] field148;

	@ObfuscatedName("ck")
	public static int[] field134;

	@ObfuscatedName("cb")
	@ObfuscatedGetter(intValue = 2113543409)
	public static int field144;

	@ObfuscatedName("cs")
	public static int[] field142;

	@ObfuscatedName("cd")
	@ObfuscatedGetter(intValue = 245483503)
	public static int field146;

	@ObfuscatedName("cl")
	@ObfuscatedGetter(intValue = 1050842761)
	public static int field147;

	@ObfuscatedName("ct")
	@ObfuscatedGetter(intValue = 1124751465)
	public static int field143;

	@ObfuscatedName("ch")
	@ObfuscatedGetter(intValue = -1769782215)
	public static int field127;

	@ObfuscatedName("dm")
	@ObfuscatedGetter(intValue = -504992793)
	@Export("KeyHandler_idleCycles")
	public static volatile int KeyHandler_idleCycles;

	@ObfuscatedName("dd")
	@Export("KeyHandler_keyCodes")
	static int[] KeyHandler_keyCodes;

	static {
		KeyHandler_instance = new KeyHandler();
		KeyHandler_pressedKeys = new boolean[112];
		field136 = new boolean[112];
		field141 = new boolean[112];
		field138 = new int[128];
		field139 = 0;
		field140 = 0;
		field149 = new char[128];
		field148 = new int[128];
		field134 = new int[128];
		field144 = 0;
		field142 = new int[128];
		field146 = 0;
		field147 = 0;
		field143 = 0;
		field127 = 0;
		KeyHandler_idleCycles = 0;
		KeyHandler_keyCodes = new int[]{ -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
	}

	KeyHandler() {
	}

	public synchronized final void keyPressed(KeyEvent var1) {
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
			if (field140 >= 0 && var2 >= 0) {
				field138[field140] = var2;
				field140 = field140 + 1 & 127;
				if (field139 == field140) {
					field140 = -1;
				}
			}
			int var3;
			if (var2 >= 0) {
				var3 = field143 + 1 & 127;
				if (var3 != field147) {
					field148[field143] = var2;
					field149[field143] = 0;
					field143 = var3;
				}
			}
			var3 = var1.getModifiers();
			if ((var3 & 10) != 0 || var2 == 85 || var2 == 10) {
				var1.consume();
			}
		}
	}

	public synchronized final void keyReleased(KeyEvent var1) {
		if (KeyHandler_instance != null) {
			int var2 = var1.getKeyCode();
			if (var2 >= 0 && var2 < KeyHandler.KeyHandler_keyCodes.length) {
				var2 = KeyHandler_keyCodes[var2] & -129;
			} else {
				var2 = -1;
			}
			if (field140 >= 0 && var2 >= 0) {
				field138[field140] = ~var2;
				field140 = field140 + 1 & 127;
				if (field140 == field139) {
					field140 = -1;
				}
			}
		}
		var1.consume();
	}

	public final void focusGained(FocusEvent var1) {
	}

	public synchronized final void focusLost(FocusEvent var1) {
		if (KeyHandler_instance != null) {
			field140 = -1;
		}
	}

	public final void keyTyped(KeyEvent var1) {
		if (KeyHandler_instance != null) {
			char var2 = var1.getKeyChar();
			if (var2 != 0 && var2 != '￿' && MusicPatchNode2.method5243(var2)) {
				int var3 = field143 + 1 & 127;
				if (var3 != field147) {
					field148[field143] = -1;
					field149[field143] = var2;
					field143 = var3;
				}
			}
		}
		var1.consume();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-82055101")
	static void method286() {
		if (Login.Login_username == null || Login.Login_username.length() <= 0) {
			if (class19.clientPreferences.method2264() != null) {
				Login.Login_username = class19.clientPreferences.method2264();
				Client.Login_isUsernameRemembered = true;
			} else {
				Client.Login_isUsernameRemembered = false;
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(III)I", garbageValue = "-1053414301")
	public static int method302(int var0, int var1) {
		int var2;
		for (var2 = 0; var1 > 0; --var1) {
			var2 = var2 << 1 | var0 & 1;
			var0 >>>= 1;
		}
		return var2;
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(descriptor = "(IIB)V", garbageValue = "50")
	static final void method300(int var0, int var1) {
		if (var0 < 128) {
			var0 = 128;
		}
		if (var0 > 383) {
			var0 = 383;
		}
		if (ViewportMouse.cameraPitch < var0) {
			ViewportMouse.cameraPitch = (var0 - ViewportMouse.cameraPitch) * MidiPcmStream.field3231 / 1000 + ViewportMouse.cameraPitch + GameBuild.field3588;
			if (ViewportMouse.cameraPitch > var0) {
				ViewportMouse.cameraPitch = var0;
			}
		}
		if (ViewportMouse.cameraPitch > var0) {
			ViewportMouse.cameraPitch -= (ViewportMouse.cameraPitch - var0) * MidiPcmStream.field3231 / 1000 + GameBuild.field3588;
			if (ViewportMouse.cameraPitch < var0) {
				ViewportMouse.cameraPitch = var0;
			}
		}
		int var2 = var1 - SoundCache.cameraYaw;
		if (var2 > 1024) {
			var2 -= 2048;
		}
		if (var2 < -1024) {
			var2 += 2048;
		}
		if (var2 > 0) {
			SoundCache.cameraYaw = var2 * MidiPcmStream.field3231 / 1000 + SoundCache.cameraYaw + GameBuild.field3588;
			SoundCache.cameraYaw &= 2047;
		}
		if (var2 < 0) {
			SoundCache.cameraYaw -= -var2 * MidiPcmStream.field3231 / 1000 + GameBuild.field3588;
			SoundCache.cameraYaw &= 2047;
		}
		int var3 = var1 - SoundCache.cameraYaw;
		if (var3 > 1024) {
			var3 -= 2048;
		}
		if (var3 < -1024) {
			var3 += 2048;
		}
		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) {
			SoundCache.cameraYaw = var1;
		}
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(descriptor = "(IIIIIIII)V", garbageValue = "-1730640649")
	static final void method301(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var8 = var6 - 334;
		if (var8 < 0) {
			var8 = 0;
		} else if (var8 > 100) {
			var8 = 100;
		}
		int var9 = (Client.zoomWidth - Client.zoomHeight) * var8 / 100 + Client.zoomHeight;
		int var7 = var5 * var9 / 256;
		var8 = 2048 - var3 & 2047;
		var9 = 2048 - var4 & 2047;
		int var10 = 0;
		int var11 = 0;
		int var12 = var7;
		int var13;
		int var14;
		int var15;
		if (var8 != 0) {
			var13 = Rasterizer3D.Rasterizer3D_sine[var8];
			var14 = Rasterizer3D.Rasterizer3D_cosine[var8];
			var15 = var11 * var14 - var13 * var7 >> 16;
			var12 = var14 * var7 + var11 * var13 >> 16;
			var11 = var15;
		}
		if (var9 != 0) {
			var13 = Rasterizer3D.Rasterizer3D_sine[var9];
			var14 = Rasterizer3D.Rasterizer3D_cosine[var9];
			var15 = var12 * var13 + var14 * var10 >> 16;
			var12 = var12 * var14 - var10 * var13 >> 16;
			var10 = var15;
		}
		if (Client.isCameraLocked) {
			Interpreter.field846 = var0 - var10;
			WorldMapManager.field2743 = var1 - var11;
			BoundaryObject.field2622 = var2 - var12;
			Decimator.field402 = var3;
			class390.field4423 = var4;
		} else {
			class18.cameraX = var0 - var10;
			class16.cameraY = var1 - var11;
			class228.cameraZ = var2 - var12;
			ViewportMouse.cameraPitch = var3;
			SoundCache.cameraYaw = var4;
		}
		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (InterfaceParent.oculusOrbFocalPointX >> 7 != class101.localPlayer.x >> 7 || class141.oculusOrbFocalPointY >> 7 != class101.localPlayer.y >> 7)) {
			var13 = class101.localPlayer.plane;
			var14 = (InterfaceParent.oculusOrbFocalPointX >> 7) + class28.baseX;
			var15 = (class141.oculusOrbFocalPointY >> 7) + WorldMapLabelSize.baseY;
			PacketBufferNode var16 = EnumComposition.getPacketBufferNode(ClientPacket.CLICKWORLDMAP_TELEPORT, Client.packetWriter.isaacCipher);
			var16.packetBuffer.writeByteNeg(var13);
			var16.packetBuffer.writeShortLE(var15);
			var16.packetBuffer.writeIntLE(Client.field635);
			var16.packetBuffer.writeShortLE(var14);
			Client.packetWriter.addNode(var16);
		}
	}
}