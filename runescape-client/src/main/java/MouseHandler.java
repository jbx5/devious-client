import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aj")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener , MouseMotionListener , FocusListener {
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"Laj;")

	@Export("MouseHandler_instance")
	static MouseHandler MouseHandler_instance;
	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 
	-1215511241)

	@Export("MouseHandler_idleCycles")
	static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	-1775726367)

	@Export("MouseHandler_currentButtonVolatile")
	static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 
	85689575)

	@Export("MouseHandler_xVolatile")
	static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	-1306099979)

	@Export("MouseHandler_yVolatile")
	static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("q")
	@ObfuscatedGetter(longValue = 
	-4643079622769248037L)

	@Export("MouseHandler_lastMovedVolatile")
	static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	1731887577)

	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 
	945035617)

	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = 
	-785295255)

	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("w")
	@ObfuscatedGetter(longValue = 
	4725999527355171863L)

	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 
	1519434749)

	@Export("MouseHandler_lastButtonVolatile")
	static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 
	-981711317)

	@Export("MouseHandler_lastPressedXVolatile")
	static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("m")
	@ObfuscatedGetter(intValue = 
	1147584293)

	@Export("MouseHandler_lastPressedYVolatile")
	static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("u")
	@ObfuscatedGetter(longValue = 
	1021935901074327701L)

	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("t")
	@ObfuscatedGetter(intValue = 
	-192789509)

	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 
	647045439)

	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("x")
	@ObfuscatedGetter(intValue = 
	-1945736255)

	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("a")
	@ObfuscatedGetter(longValue = 
	-2565305597523014613L)

	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;
	static 
	{
		MouseHandler_instance = new MouseHandler();
		MouseHandler_idleCycles = 0;
		MouseHandler_currentButtonVolatile = 0;
		MouseHandler_xVolatile = -1;
		MouseHandler_yVolatile = -1;
		MouseHandler_lastMovedVolatile = -1L;
		MouseHandler_currentButton = 0;
		MouseHandler_x = 0;
		MouseHandler_y = 0;
		MouseHandler_millis = 0L;
		MouseHandler_lastButtonVolatile = 0;
		MouseHandler_lastPressedXVolatile = 0;
		MouseHandler_lastPressedYVolatile = 0;
		MouseHandler_lastPressedTimeMillisVolatile = 0L;
		MouseHandler_lastButton = 0;
		MouseHandler_lastPressedX = 0;
		MouseHandler_lastPressedY = 0;
		MouseHandler_lastPressedTimeMillis = 0L;
	}

	MouseHandler() {
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/awt/event/MouseEvent;B)I", garbageValue = 
	"-6")

	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton();
		if ((!var1.isAltDown()) && (var2 != 2)) {
			return (!var1.isMetaDown()) && (var2 != 3) ? 1 : 2;
		} else {
			return 4;
		}
	}

	public synchronized final void mouseMoved(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_xVolatile = var1.getX();
			MouseHandler_yVolatile = var1.getY();
			MouseHandler_lastMovedVolatile = var1.getWhen();
		}

	}

	public synchronized final void mouseExited(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_xVolatile = -1;
			MouseHandler_yVolatile = -1;
			MouseHandler_lastMovedVolatile = var1.getWhen();
		}

	}

	public synchronized final void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public synchronized final void mouseReleased(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_currentButtonVolatile = 0;
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public synchronized final void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public synchronized final void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_currentButtonVolatile = 0;
		}

	}

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final void focusGained(FocusEvent var1) {
	}

	public synchronized final void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_lastPressedXVolatile = var1.getX();
			MouseHandler_lastPressedYVolatile = var1.getY();
			MouseHandler_lastPressedTimeMillisVolatile = class136.method2931();
			MouseHandler_lastButtonVolatile = this.getButton(var1);
			if (MouseHandler_lastButtonVolatile != 0) {
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(ILbd;ZI)I", garbageValue = 
	"-1283526589")

	static int method613(int var0, Script var1, boolean var2) {
		if (var0 < 1000) {
			return class168.method3353(var0, var1, var2);
		} else if (var0 < 1100) {
			return class7.method54(var0, var1, var2);
		} else if (var0 < 1200) {
			return UserComparator9.method2621(var0, var1, var2);
		} else if (var0 < 1300) {
			return class134.method2906(var0, var1, var2);
		} else if (var0 < 1400) {
			return UserComparator3.method2607(var0, var1, var2);
		} else if (var0 < 1500) {
			return Language.method6079(var0, var1, var2);
		} else if (var0 < 1600) {
			return class296.method5749(var0, var1, var2);
		} else if (var0 < 1700) {
			return SoundSystem.method761(var0, var1, var2);
		} else if (var0 < 1800) {
			return class135.method2922(var0, var1, var2);
		} else if (var0 < 1900) {
			return NPC.method2361(var0, var1, var2);
		} else if (var0 < 2000) {
			return HealthBarUpdate.method2186(var0, var1, var2);
		} else if (var0 < 2100) {
			return class7.method54(var0, var1, var2);
		} else if (var0 < 2200) {
			return UserComparator9.method2621(var0, var1, var2);
		} else if (var0 < 2300) {
			return class134.method2906(var0, var1, var2);
		} else if (var0 < 2400) {
			return UserComparator3.method2607(var0, var1, var2);
		} else if (var0 < 2500) {
			return Language.method6079(var0, var1, var2);
		} else if (var0 < 2600) {
			return ApproximateRouteStrategy.method1124(var0, var1, var2);
		} else if (var0 < 2700) {
			return class135.method2921(var0, var1, var2);
		} else if (var0 < 2800) {
			return class271.method5220(var0, var1, var2);
		} else if (var0 < 2900) {
			return class127.method2840(var0, var1, var2);
		} else if (var0 < 3000) {
			return HealthBarUpdate.method2186(var0, var1, var2);
		} else if (var0 < 3200) {
			return Projectile.method1976(var0, var1, var2);
		} else if (var0 < 3300) {
			return PlayerType.method5803(var0, var1, var2);
		} else if (var0 < 3400) {
			return ViewportMouse.method5089(var0, var1, var2);
		} else if (var0 < 3500) {
			return SecureRandomFuture.method1985(var0, var1, var2);
		} else if (var0 < 3600) {
			return class356.method6582(var0, var1, var2);
		} else if (var0 < 3700) {
			return AbstractByteArrayCopier.method5506(var0, var1, var2);
		} else if (var0 < 3800) {
			return GameObject.method5111(var0, var1, var2);
		} else if (var0 < 3900) {
			return WorldMapSectionType.method4310(var0, var1, var2);
		} else if (var0 < 4000) {
			return Player.method2112(var0, var1, var2);
		} else if (var0 < 4100) {
			return Strings.method5790(var0, var1, var2);
		} else if (var0 < 4200) {
			return WorldMapLabel.method4354(var0, var1, var2);
		} else if (var0 < 4300) {
			return NetCache.method5965(var0, var1, var2);
		} else if (var0 < 5100) {
			return class151.method3159(var0, var1, var2);
		} else if (var0 < 5400) {
			return class160.method3279(var0, var1, var2);
		} else if (var0 < 5600) {
			return Language.method6091(var0, var1, var2);
		} else if (var0 < 5700) {
			return BufferedSink.method6911(var0, var1, var2);
		} else if (var0 < 6300) {
			return SecureRandomFuture.method1984(var0, var1, var2);
		} else if (var0 < 6600) {
			return ScriptFrame.method1085(var0, var1, var2);
		} else if (var0 < 6700) {
			return class11.method100(var0, var1, var2);
		} else if (var0 < 6800) {
			return class271.method5221(var0, var1, var2);
		} else if (var0 < 6900) {
			return HealthBar.method2343(var0, var1, var2);
		} else if (var0 < 7000) {
			return class10.method87(var0, var1, var2);
		} else if (var0 < 7100) {
			return MouseRecorder.method2094(var0, var1, var2);
		} else if (var0 < 7200) {
			return Skeleton.method4729(var0, var1, var2);
		} else if (var0 < 7300) {
			return class19.method286(var0, var1, var2);
		} else {
			return var0 < 7500 ? ApproximateRouteStrategy.method1123(var0, var1, var2) : 2;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;I)Ljava/lang/String;", garbageValue = 
	"-76237077")

	public static String method584(String var0) {
		int var1 = var0.length();
		char[] var2 = new char[var1];
		byte var3 = 2;

		for (int var4 = 0; var4 < var1; ++var4) {
			char var5 = var0.charAt(var4);
			if (var3 == 0) {
				var5 = Character.toLowerCase(var5);
			} else if ((var3 == 2) || Character.isUpperCase(var5)) {
				var5 = class129.method2863(var5);
			}

			if (Character.isLetter(var5)) {
				var3 = 0;
			} else if (((var5 != '.') && (var5 != '?')) && (var5 != '!')) {
				if (Character.isSpaceChar(var5)) {
					if (var3 != 2) {
						var3 = 1;
					}
				} else {
					var3 = 1;
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5;
		}

		return new String(var2);
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(descriptor = 
	"(Lpz;B)V", garbageValue = 
	"2")

	static final void method593(PacketBuffer var0) {
		for (int var1 = 0; var1 < Client.field547; ++var1) {
			int var2 = Client.field548[var1];
			NPC var3 = Client.npcs[var2];
			int var4 = var0.readUnsignedByte();
			int var5;
			if (class431.field4602 && ((var4 & 64) != 0)) {
				var5 = var0.readUnsignedByte();
				var4 += var5 << 8;
			}

			int var6;
			int var7;
			int var8;
			if ((var4 & 1) != 0) {
				var5 = var0.readUnsignedShort();
				var6 = var0.readUnsignedShortAddLE();
				if (class431.field4602) {
					var3.field1144 = var0.readUnsignedByteAdd() == 1;
				}

				var7 = var3.x - (((var5 - GrandExchangeOfferOwnWorldComparator.baseX) - GrandExchangeOfferOwnWorldComparator.baseX) * 64);
				var8 = var3.y - (((var6 - VarcInt.baseY) - VarcInt.baseY) * 64);
				if ((var7 != 0) || (var8 != 0)) {
					var3.field1121 = ((int) (Math.atan2(((double) (var7)), ((double) (var8))) * 325.949)) & 2047;
				}
			}

			if ((var4 & 1024) != 0) {
				var3.field1182 = var0.readInt();
			}

			if ((var4 & 16) != 0) {
				var3.spotAnimation = var0.readUnsignedShort();
				var5 = var0.readInt();
				var3.spotAnimationHeight = var5 >> 16;
				var3.field1134 = (var5 & 65535) + Client.cycle;
				var3.spotAnimationFrame = 0;
				var3.spotAnimationFrameCycle = 0;
				if (var3.field1134 > Client.cycle) {
					var3.spotAnimationFrame = -1;
				}

				if (var3.spotAnimation == 65535) {
					var3.spotAnimation = -1;
				}
			}

			if ((var4 & 128) != 0) {
				var5 = var0.readUnsignedByte();
				int var9;
				int var10;
				int var11;
				if (var5 > 0) {
					for (var6 = 0; var6 < var5; ++var6) {
						var8 = -1;
						var9 = -1;
						var10 = -1;
						var7 = var0.readUShortSmart();
						if (var7 == 32767) {
							var7 = var0.readUShortSmart();
							var9 = var0.readUShortSmart();
							var8 = var0.readUShortSmart();
							var10 = var0.readUShortSmart();
						} else if (var7 != 32766) {
							var9 = var0.readUShortSmart();
						} else {
							var7 = -1;
						}

						var11 = var0.readUShortSmart();
						var3.addHitSplat(var7, var9, var8, var10, Client.cycle, var11);
					}
				}

				var6 = var0.readUnsignedByteNeg();
				if (var6 > 0) {
					for (var7 = 0; var7 < var6; ++var7) {
						var8 = var0.readUShortSmart();
						var9 = var0.readUShortSmart();
						if (var9 != 32767) {
							var10 = var0.readUShortSmart();
							var11 = var0.readUnsignedByte();
							int var12 = (var9 > 0) ? var0.readUnsignedByteAdd() : var11;
							var3.addHealthBar(var8, Client.cycle, var9, var10, var11, var12);
						} else {
							var3.removeHealthBar(var8);
						}
					}
				}
			}

			if ((class431.field4602 && ((var4 & 256) != 0)) || ((!class431.field4602) && ((var4 & 64) != 0))) {
				var3.field1129 = var0.readByteSub();
				var3.field1160 = var0.readByteAdd();
				var3.field1132 = var0.readByte();
				var3.field1161 = var0.readByte();
				var3.field1143 = var0.readUnsignedShortAddLE() + Client.cycle;
				var3.field1163 = var0.readUnsignedShort() + Client.cycle;
				var3.field1135 = var0.readUnsignedShortAddLE();
				var3.pathLength = 1;
				var3.field1170 = 0;
				var3.field1129 += var3.pathX[0];
				var3.field1160 += var3.pathY[0];
				var3.field1132 += var3.pathX[0];
				var3.field1161 += var3.pathY[0];
			}

			if ((var4 & 512) != 0) {
				var3.field1167 = Client.cycle + var0.readUnsignedShortLE();
				var3.field1168 = Client.cycle + var0.readUnsignedShortAdd();
				var3.field1169 = var0.readByte();
				var3.field1114 = var0.readByteAdd();
				var3.field1171 = var0.readByteAdd();
				var3.field1122 = ((byte) (var0.readUnsignedByteSub()));
			}

			if ((var4 & 2) != 0) {
				var3.overheadText = var0.readStringCp1252NullTerminated();
				var3.overheadTextCyclesRemaining = 100;
			}

			if ((var4 & 4) != 0) {
				var3.targetIndex = var0.readUnsignedShortAdd();
				if (var3.targetIndex == 65535) {
					var3.targetIndex = -1;
				}
			}

			if ((var4 & 32) != 0) {
				var3.definition = KeyHandler.getNpcDefinition(var0.readUnsignedShortAddLE());
				var3.field1150 = var3.definition.size;
				var3.field1175 = var3.definition.rotation;
				var3.walkSequence = var3.definition.walkSequence;
				var3.walkBackSequence = var3.definition.walkBackSequence;
				var3.walkLeftSequence = var3.definition.walkLeftSequence;
				var3.walkRightSequence = var3.definition.walkRightSequence;
				var3.idleSequence = var3.definition.idleSequence;
				var3.turnLeftSequence = var3.definition.turnLeftSequence;
				var3.turnRightSequence = var3.definition.turnRightSequence;
			}

			if ((var4 & 8) != 0) {
				var5 = var0.readUnsignedShortLE();
				if (var5 == 65535) {
					var5 = -1;
				}

				var6 = var0.readUnsignedByteAdd();
				if ((var5 == var3.sequence) && (var5 != (-1))) {
					var7 = class163.SequenceDefinition_get(var5).field2161;
					if (var7 == 1) {
						var3.sequenceFrame = 0;
						var3.sequenceFrameCycle = 0;
						var3.sequenceDelay = var6;
						var3.field1152 = 0;
					}

					if (var7 == 2) {
						var3.field1152 = 0;
					}
				} else if (((var5 == (-1)) || (var3.sequence == (-1))) || (class163.SequenceDefinition_get(var5).field2155 >= class163.SequenceDefinition_get(var3.sequence).field2155)) {
					var3.sequence = var5;
					var3.sequenceFrame = 0;
					var3.sequenceFrameCycle = 0;
					var3.sequenceDelay = var6;
					var3.field1152 = 0;
					var3.field1170 = var3.pathLength;
				}
			}
		}

	}
}