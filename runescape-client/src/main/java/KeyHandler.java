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

@ObfuscatedName("at")
@Implements("KeyHandler")
public class KeyHandler implements KeyListener, FocusListener {
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = -687650621
	)
	static int field131;
	@ObfuscatedName("jv")
	@ObfuscatedGetter(
		intValue = 2027274217
	)
	static int field134;
	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	@Export("localPlayer")
	static Player localPlayer;
	@ObfuscatedName("ap")
	Collection field130;
	@ObfuscatedName("af")
	Collection field127;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lbt;"
	)
	class29[] field133;
	@ObfuscatedName("aq")
	@Export("KeyHandler_pressedKeys")
	boolean[] KeyHandler_pressedKeys;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 12807563
	)
	@Export("KeyHandler_idleCycles")
	volatile int KeyHandler_idleCycles;

	KeyHandler() {
		this.field133 = new class29[3];
		this.KeyHandler_pressedKeys = new boolean[112];
		this.KeyHandler_idleCycles = 0;
		this.field130 = new ArrayList(100);
		this.field127 = new ArrayList(100);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lbt;II)V",
		garbageValue = "-1927926336"
	)
	void method357(class29 var1, int var2) {
		this.field133[var2] = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "288397361"
	)
	int method358() {
		return this.KeyHandler_idleCycles;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;S)V",
		garbageValue = "28242"
	)
	void method359(Component var1) {
		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(this);
		var1.addFocusListener(this);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-1048369874"
	)
	synchronized void method360(Component var1) {
		var1.removeKeyListener(this);
		var1.removeFocusListener(this);
		synchronized(this) {
			this.field130.add(new class33(4, 0));
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-88170892"
	)
	void method379() {
		++this.KeyHandler_idleCycles;
		this.method362();
		Iterator var1 = this.field127.iterator();

		while (var1.hasNext()) {
			class33 var2 = (class33)var1.next();

			for (int var3 = 0; var3 < this.field133.length && !var2.method490(this.field133[var3]); ++var3) {
			}
		}

		this.field127.clear();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-100"
	)
	synchronized void method362() {
		Collection var1 = this.field127;
		this.field127 = this.field130;
		this.field130 = var1;
	}

	public final synchronized void keyPressed(KeyEvent var1) {
		int var2 = var1.getKeyCode();
		if (var2 >= 0 && var2 < TileItem.method2762()) {
			var2 = SequenceDefinition.method4122(var2);
			if (VarbitComposition.method3843(var2)) {
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
			this.field130.add(new class33(1, var2));
		}

		var1.consume();
	}

	public final synchronized void keyReleased(KeyEvent var1) {
		int var2 = var1.getKeyCode();
		if (var2 >= 0 && var2 < TileItem.method2762()) {
			var2 = SequenceDefinition.method4122(var2) & -129;
		} else {
			var2 = -1;
		}

		if (var2 >= 0) {
			this.KeyHandler_pressedKeys[var2] = false;
			this.field130.add(new class33(2, var2));
		}

		var1.consume();
	}

	public final synchronized void keyTyped(KeyEvent var1) {
		char var2 = var1.getKeyChar();
		if (var2 != 0 && var2 != '\uffff' && ApproximateRouteStrategy.method1233(var2)) {
			this.field130.add(new class33(3, var2));
		}

		var1.consume();
	}

	public final synchronized void focusGained(FocusEvent var1) {
		this.field130.add(new class33(4, 1));
	}

	public final synchronized void focusLost(FocusEvent var1) {
		for (int var2 = 0; var2 < 112; ++var2) {
			if (this.KeyHandler_pressedKeys[var2]) {
				this.KeyHandler_pressedKeys[var2] = false;
				this.field130.add(new class33(2, var2));
			}
		}

		this.field130.add(new class33(4, 0));
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1160786456"
	)
	static final void method366() {
		Canvas.method334("You can't add yourself to your own friend list");
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-138868805"
	)
	static int method386(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field846 - 7.0D) * 256.0D);
	}
}
