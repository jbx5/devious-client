import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import net.runelite.mapping.ObfuscatedName;
import java.awt.event.MouseMotionListener;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import net.runelite.mapping.Export;
@ObfuscatedName("ak")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener , MouseMotionListener , FocusListener {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lak;")
	@Export("MouseHandler_instance")
	public static MouseHandler MouseHandler_instance = new MouseHandler();

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 1827760199)
	@Export("MouseHandler_idleCycles")
	public static volatile int MouseHandler_idleCycles = 0;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -1623418769)
	@Export("MouseHandler_currentButtonVolatile")
	public static volatile int MouseHandler_currentButtonVolatile = 0;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 1555382099)
	@Export("MouseHandler_xVolatile")
	public static volatile int MouseHandler_xVolatile = -1;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = -1255212161)
	@Export("MouseHandler_x")
	public static int MouseHandler_x = 0;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = -1215710293)
	@Export("MouseHandler_yVolatile")
	public static volatile int MouseHandler_yVolatile = -1;

	@ObfuscatedName("n")
	@ObfuscatedGetter(longValue = -2272608476376561203L)
	@Export("MouseHandler_lastMovedVolatile")
	public static volatile long MouseHandler_lastMovedVolatile = -1L;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = -1275162901)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton = 0;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = 805158709)
	@Export("MouseHandler_y")
	public static int MouseHandler_y = 0;

	@ObfuscatedName("m")
	@ObfuscatedGetter(longValue = -824620349310307761L)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis = 0L;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 85924573)
	@Export("MouseHandler_lastButtonVolatile")
	public static volatile int MouseHandler_lastButtonVolatile = 0;

	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 1879141787)
	@Export("MouseHandler_lastPressedXVolatile")
	public static volatile int MouseHandler_lastPressedXVolatile = 0;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 100819619)
	@Export("MouseHandler_lastPressedYVolatile")
	public static volatile int MouseHandler_lastPressedYVolatile = 0;

	@ObfuscatedName("r")
	@ObfuscatedGetter(longValue = -7343813439361923581L)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	public static volatile long MouseHandler_lastPressedTimeMillisVolatile = 0L;

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = 1259435317)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton = 0;

	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = 1804877833)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX = 0;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 1565070067)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY = 0;

	@ObfuscatedName("b")
	@ObfuscatedGetter(longValue = -5419030349490224105L)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis = 0L;

	@ObfuscatedName("em")
	@ObfuscatedSignature(descriptor = "Lln;")
	@Export("archive17")
	static Archive archive17;

	@ObfuscatedName("fw")
	@ObfuscatedGetter(intValue = -12790683)
	static int field231;

	MouseHandler() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;S)I", garbageValue = "764")
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

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) {
			var1.consume();
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

	public final void focusGained(FocusEvent var1) {
	}

	public synchronized final void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_currentButtonVolatile = 0;
		}
	}

	public synchronized final void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public synchronized final void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_lastPressedXVolatile = var1.getX();
			MouseHandler_lastPressedYVolatile = var1.getY();
			MouseHandler_lastPressedTimeMillisVolatile = class181.method3483();
			MouseHandler_lastButtonVolatile = this.getButton(var1);
			if (MouseHandler_lastButtonVolatile != 0) {
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(descriptor = "(ILbz;ZI)I", garbageValue = "1220245992")
	static int method569(int var0, Script var1, boolean var2) {
		if (var0 == 6800) {
			Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else if (var0 != 6801 && var0 != 6802) {
			if (var0 == 6809) {
				int var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
				ObjectComposition var4 = FileSystem.getObjectDefinition(var3);
				Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = (var4 != null) ? var4.name : "";
				return 1;
			} else if (var0 == 6850) {
				Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
				return 1;
			} else if (var0 != 6851 && var0 != 6852) {
				if (var0 == 6853) {
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
					return 1;
				} else {
					return 2;
				}
			} else {
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
				return 1;
			}
		} else {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
			return 1;
		}
	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-419333573")
	static final void method558() {
		int var0 = Players.Players_count;
		int[] var1 = Players.Players_indices;
		for (int var2 = 0; var2 < var0; ++var2) {
			Player var3 = Client.players[var1[var2]];
			if (var3 != null) {
				WorldMapSection2.updateActorSequence(var3, 1);
			}
		}
	}
}