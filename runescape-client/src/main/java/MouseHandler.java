import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.LinkedList;
import net.runelite.mapping.ObfuscatedName;
import java.awt.event.MouseMotionListener;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.util.List;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import net.runelite.mapping.Export;
@ObfuscatedName("ac")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener , MouseMotionListener , FocusListener {
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lac;")
	@Export("MouseHandler_instance")
	public static MouseHandler MouseHandler_instance;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = -383852009)
	@Export("MouseHandler_idleCycles")
	public static volatile int MouseHandler_idleCycles;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 241459279)
	@Export("MouseHandler_currentButtonVolatile")
	public static volatile int MouseHandler_currentButtonVolatile;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = -1768893521)
	@Export("MouseHandler_xVolatile")
	public static volatile int MouseHandler_xVolatile;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -89007159)
	@Export("MouseHandler_yVolatile")
	public static volatile int MouseHandler_yVolatile;

	@ObfuscatedName("y")
	@ObfuscatedGetter(longValue = -4642298123597580975L)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;

	@ObfuscatedName("i")
	@ObfuscatedGetter(longValue = -2350153647188660461L)
	@Export("MouseHandler_lastMovedVolatile")
	public static volatile long MouseHandler_lastMovedVolatile;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 1455272801)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;

	@ObfuscatedName("t")
	@ObfuscatedGetter(intValue = 1882994615)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 673527067)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;

	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = -2102199951)
	@Export("MouseHandler_lastButtonVolatile")
	public static volatile int MouseHandler_lastButtonVolatile;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 1399413665)
	@Export("MouseHandler_lastPressedXVolatile")
	public static volatile int MouseHandler_lastPressedXVolatile;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 2125601879)
	@Export("MouseHandler_lastPressedYVolatile")
	public static volatile int MouseHandler_lastPressedYVolatile;

	@ObfuscatedName("h")
	@ObfuscatedGetter(longValue = -1006217129422716167L)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	public static volatile long MouseHandler_lastPressedTimeMillisVolatile;

	@ObfuscatedName("x")
	@ObfuscatedGetter(intValue = 1415111361)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;

	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = -1792808507)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = 1987452137)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;

	@ObfuscatedName("p")
	@ObfuscatedGetter(longValue = -814886068230391219L)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;

	@ObfuscatedName("ey")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("archive19")
	static Archive archive19;

	@ObfuscatedName("hu")
	@ObfuscatedSignature(descriptor = "Lmt;")
	@Export("fontPlain11")
	static Font fontPlain11;

	static {
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;I)I", garbageValue = "-987876058")
	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton();
		if (!var1.isAltDown() && var2 != 2) {
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2;
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

	public synchronized final void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_lastPressedXVolatile = var1.getX();
			MouseHandler_lastPressedYVolatile = var1.getY();
			MouseHandler_lastPressedTimeMillisVolatile = class115.method2692();
			MouseHandler_lastButtonVolatile = this.getButton(var1);
			if (MouseHandler_lastButtonVolatile != 0) {
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}
		if (var1.isPopupTrigger()) {
			var1.consume();
		}
	}

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) {
			var1.consume();
		}
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

	public synchronized final void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public final void focusGained(FocusEvent var1) {
	}

	public synchronized final void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_currentButtonVolatile = 0;
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

	public synchronized final void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(descriptor = "(ILbi;ZI)I", garbageValue = "1889680041")
	static int method547(int var0, Script var1, boolean var2) {
		int var3;
		Object var4;
		int var5;
		class436 var6;
		int var7;
		if (var0 != 7500 && var0 != 7508) {
			if (var0 != 7501) {
				int var19;
				int var20;
				if (var0 == 7502) {
					class446.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
					var19 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2];
					var20 = class285.method5516(var19);
					var7 = HealthBarUpdate.method2199(var19);
					int var21 = class141.method3048(var19);
					DbRowType var26 = FriendLoginUpdate.getDbRowType(var3);
					DbTableType var27 = UserComparator6.getDbTableType(var20);
					int[] var28 = var27.types[var7];
					int var12 = 0;
					int var13 = var28.length;
					if (var21 >= 0) {
						if (var21 >= var13) {
							throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var21 + ", Max: " + var13);
						}
						var12 = var21;
						var13 = var21 + 1;
					}
					Object[] var14 = var26.getColumnType(var7);
					if (var14 == null && var27.defaultValues != null) {
						var14 = var27.defaultValues[var7];
					}
					int var15;
					int var16;
					if (var14 == null) {
						for (var15 = var12; var15 < var13; ++var15) {
							var16 = var28[var15];
							class432 var22 = MusicPatchNode.method5472(var16);
							if (var22 == class432.field4657) {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							} else {
								Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = ArchiveLoader.method2075(var16);
							}
						}
						return 1;
					} else {
						var15 = var14.length / var28.length;
						if (var5 >= 0 && var5 < var15) {
							for (var16 = var12; var16 < var13; ++var16) {
								int var17 = var16 + var28.length * var5;
								class432 var18 = MusicPatchNode.method5472(var28[var16]);
								if (var18 == class432.field4657) {
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ((String) (var14[var17]));
								} else {
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = ((Integer) (var14[var17]));
								}
							}
							return 1;
						} else {
							throw new RuntimeException();
						}
					}
				} else if (var0 == 7503) {
					class446.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
					var19 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
					var5 = 0;
					var20 = class285.method5516(var19);
					var7 = HealthBarUpdate.method2199(var19);
					DbRowType var25 = FriendLoginUpdate.getDbRowType(var3);
					DbTableType var9 = UserComparator6.getDbTableType(var20);
					int[] var10 = var9.types[var7];
					Object[] var11 = var25.getColumnType(var7);
					if (var11 == null && var9.defaultValues != null) {
						var11 = var9.defaultValues[var7];
					}
					if (var11 != null) {
						var5 = var11.length / var10.length;
					}
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var5;
					return 1;
				} else if (var0 != 7504 && var0 != 7509) {
					if (var0 == 7505) {
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
						DbRowType var24 = FriendLoginUpdate.getDbRowType(var3);
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var24.tableId;
						return 1;
					} else if (var0 == 7506) {
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
						var19 = -1;
						if (UrlRequest.field1373 != null && var3 >= 0 && var3 < UrlRequest.field1373.size()) {
							var19 = ((Integer) (UrlRequest.field1373.get(var3)));
						}
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var19;
						return 1;
					} else if (var0 != 7507 && var0 != 7510) {
						return 2;
					} else {
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
						var4 = class137.method2937(var3);
						var5 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
						var6 = class123.method2813(var5);
						if (var6 == null) {
							throw new RuntimeException();
						} else if (class285.method5516(var5) != Client.field588) {
							throw new RuntimeException();
						} else if (UrlRequest.field1373 == null && UrlRequest.field1373.isEmpty()) {
							throw new RuntimeException();
						} else {
							var7 = class141.method3048(var5);
							List var8 = var6.method7619(var4, var7);
							UrlRequest.field1373 = new LinkedList(UrlRequest.field1373);
							if (var8 != null) {
								UrlRequest.field1373.retainAll(var8);
							} else {
								UrlRequest.field1373.clear();
							}
							SoundSystem.field312 = UrlRequest.field1373.iterator();
							if (var0 == 7507) {
								Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = UrlRequest.field1373.size();
							}
							return 1;
						}
					}
				} else {
					--class446.Interpreter_intStackSize;
					var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
					class436 var23 = WorldMapRectangle.method4988(var3);
					if (var23 == null) {
						throw new RuntimeException();
					} else {
						UrlRequest.field1373 = var23.method7619(0, 0);
						var5 = 0;
						if (UrlRequest.field1373 != null) {
							Client.field588 = var3;
							SoundSystem.field312 = UrlRequest.field1373.iterator();
							var5 = UrlRequest.field1373.size();
						}
						if (var0 == 7504) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var5;
						}
						return 1;
					}
				}
			} else {
				if (SoundSystem.field312 != null && SoundSystem.field312.hasNext()) {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = ((Integer) (SoundSystem.field312.next()));
				} else {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
				}
				return 1;
			}
		} else {
			var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
			var4 = class137.method2937(var3);
			var5 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
			var6 = class123.method2813(var5);
			if (var6 == null) {
				throw new RuntimeException();
			} else {
				var7 = class141.method3048(var5);
				UrlRequest.field1373 = var6.method7619(var4, var7);
				if (UrlRequest.field1373 != null) {
					Client.field588 = class285.method5516(var5);
					SoundSystem.field312 = UrlRequest.field1373.iterator();
					if (var0 == 7500) {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = UrlRequest.field1373.size();
					}
				} else {
					Client.field588 = -1;
					SoundSystem.field312 = null;
					if (var0 == 7500) {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
					}
				}
				return 1;
			}
		}
	}
}