import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
@Implements("KeyHandler")
public class KeyHandler implements KeyListener, FocusListener {
	@ObfuscatedName("dx")
	static boolean field109;
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static Archive field110;
	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static Archive field112;
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = 910204495
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("ae")
	Collection field113;
	@ObfuscatedName("ag")
	Collection field104;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[Lbx;"
	)
	class29[] field107;
	@ObfuscatedName("ax")
	@Export("KeyHandler_pressedKeys")
	boolean[] KeyHandler_pressedKeys;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -2021664831
	)
	@Export("KeyHandler_idleCycles")
	volatile int KeyHandler_idleCycles;

	KeyHandler() {
		this.field107 = new class29[3];
		this.KeyHandler_pressedKeys = new boolean[112];
		this.KeyHandler_idleCycles = 0;
		this.field113 = new ArrayList(100);
		this.field104 = new ArrayList(100);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lbx;IB)V",
		garbageValue = "3"
	)
	void method361(class29 var1, int var2) {
		this.field107[var2] = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1451554368"
	)
	public int method369() {
		return this.KeyHandler_idleCycles;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "-54"
	)
	void method365(Component var1) {
		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(this);
		var1.addFocusListener(this);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "34"
	)
	synchronized void method341(Component var1) {
		var1.removeKeyListener(this);
		var1.removeFocusListener(this);
		synchronized(this) {
			this.field113.add(new class33(4, 0));
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "128"
	)
	void method342() {
		++this.KeyHandler_idleCycles;
		this.method344();
		Iterator var1 = this.field104.iterator();

		while (var1.hasNext()) {
			class33 var2 = (class33)var1.next();

			for (int var3 = 0; var3 < this.field107.length && !var2.method474(this.field107[var3]); ++var3) {
			}
		}

		this.field104.clear();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1343573175"
	)
	synchronized void method344() {
		Collection var1 = this.field104;
		this.field104 = this.field113;
		this.field113 = var1;
	}

	public final synchronized void focusLost(FocusEvent var1) {
		for (int var2 = 0; var2 < 112; ++var2) {
			if (this.KeyHandler_pressedKeys[var2]) {
				this.KeyHandler_pressedKeys[var2] = false;
				this.field113.add(new class33(2, var2));
			}
		}

		this.field113.add(new class33(4, 0));
	}

	public final synchronized void keyPressed(KeyEvent var1) {
		int var2 = var1.getKeyCode();
		if (var2 >= 0 && var2 < AbstractWorldMapData.method6187()) {
			int var3 = class28.KeyHandler_keyCodes[var2];
			var2 = var3;
			if (class59.method1181(var3)) {
				var2 = -1;
			}
		} else {
			var2 = -1;
		}

		if (var2 >= 0) {
			if (!this.KeyHandler_pressedKeys[var2]) {
				this.KeyHandler_idleCycles = 0;
			}

			this.KeyHandler_pressedKeys[var2] = true;
			this.field113.add(new class33(1, var2));
		}

		var1.consume();
	}

	public final synchronized void keyReleased(KeyEvent var1) {
		int var2 = var1.getKeyCode();
		if (var2 >= 0 && var2 < AbstractWorldMapData.method6187()) {
			var2 = UserComparator6.method3239(var2) & -129;
		} else {
			var2 = -1;
		}

		if (var2 >= 0) {
			this.KeyHandler_pressedKeys[var2] = false;
			this.field113.add(new class33(2, var2));
		}

		var1.consume();
	}

	public final synchronized void keyTyped(KeyEvent var1) {
		char var2 = var1.getKeyChar();
		if (var2 != 0 && var2 != '\uffff' && KitDefinition.method3889(var2)) {
			this.field113.add(new class33(3, var2));
		}

		var1.consume();
	}

	public final synchronized void focusGained(FocusEvent var1) {
		this.field113.add(new class33(4, 1));
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1036155435"
	)
	static final void method340() {
		if (Client.field756 != ClientPreferences.topLevelWorldView.plane) {
			Client.field756 = ClientPreferences.topLevelWorldView.plane;
			WorldMapSection0.method6138(ClientPreferences.topLevelWorldView.plane);
		}

	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "657978114"
	)
	static final void method374(int var0, int var1) {
		if (var0 < 128) {
			var0 = 128;
		} else if (var0 > 383) {
			var0 = 383;
		}

		if (class463.cameraPitch < var0) {
			class463.cameraPitch = (var0 - class463.cameraPitch) * class224.field2411 / 1000 + class463.cameraPitch + HttpMethod.field29;
			if (class463.cameraPitch > var0) {
				class463.cameraPitch = var0;
			}
		} else if (class463.cameraPitch > var0) {
			class463.cameraPitch -= (class463.cameraPitch - var0) * class224.field2411 / 1000 + HttpMethod.field29;
			if (class463.cameraPitch < var0) {
				class463.cameraPitch = var0;
			}
		}

		var1 &= 2047;
		int var2 = var1 - class267.cameraYaw;
		if (var2 > 1024) {
			var2 -= 2048;
		} else if (var2 < -1024) {
			var2 += 2048;
		}

		if (var2 > 0) {
			class267.cameraYaw = class267.cameraYaw + HttpMethod.field29 + var2 * class224.field2411 / 1000;
			class267.cameraYaw &= 2047;
		} else if (var2 < 0) {
			class267.cameraYaw -= HttpMethod.field29 + -var2 * class224.field2411 / 1000;
			class267.cameraYaw &= 2047;
		}

		int var3 = var1 - class267.cameraYaw;
		if (var3 > 1024) {
			var3 -= 2048;
		} else if (var3 < -1024) {
			var3 += 2048;
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) {
			class267.cameraYaw = var1;
		}

	}

	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "2045319622"
	)
	static final void method373(int var0, int var1, int var2, boolean var3) {
		if (TaskHandler.widgetDefinition.loadInterface(var0)) {
			class383.resizeInterface(TaskHandler.widgetDefinition.Widget_interfaceComponents[var0], -1, var1, var2, var3);
		}
	}
}
