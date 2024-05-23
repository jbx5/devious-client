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

@ObfuscatedName("ag")
@Implements("KeyHandler")
public class KeyHandler implements KeyListener, FocusListener {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2057094345
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;
	@ObfuscatedName("al")
	Collection field130;
	@ObfuscatedName("aj")
	Collection field129;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[Lbi;"
	)
	class29[] field128;
	@ObfuscatedName("af")
	@Export("KeyHandler_pressedKeys")
	boolean[] KeyHandler_pressedKeys;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -39112623
	)
	@Export("KeyHandler_idleCycles")
	volatile int KeyHandler_idleCycles;

	KeyHandler() {
		this.field128 = new class29[3];
		this.KeyHandler_pressedKeys = new boolean[112];
		this.KeyHandler_idleCycles = 0;
		this.field130 = new ArrayList(100);
		this.field129 = new ArrayList(100);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lbi;II)V",
		garbageValue = "1411705116"
	)
	void method339(class29 var1, int var2) {
		this.field128[var2] = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "84"
	)
	public int method338() {
		return this.KeyHandler_idleCycles;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "0"
	)
	void method343(Component var1) {
		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(this);
		var1.addFocusListener(this);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "-104"
	)
	synchronized void method348(Component var1) {
		var1.removeKeyListener(this);
		var1.removeFocusListener(this);
		synchronized(this) {
			this.field130.add(new class33(4, 0));
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "842468444"
	)
	void method358() {
		++this.KeyHandler_idleCycles;
		this.method341();
		Iterator var1 = this.field129.iterator();

		while (var1.hasNext()) {
			class33 var2 = (class33)var1.next();

			for (int var3 = 0; var3 < this.field128.length && !var2.method475(this.field128[var3]); ++var3) {
			}
		}

		this.field129.clear();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1754155910"
	)
	synchronized void method341() {
		Collection var1 = this.field129;
		this.field129 = this.field130;
		this.field130 = var1;
	}

	public final synchronized void keyPressed(KeyEvent var1) {
		int var2;
		label23: {
			var2 = var1.getKeyCode();
			if (var2 >= 0) {
				int var4 = class28.KeyHandler_keyCodes.length;
				if (var2 < var4) {
					var2 = class495.method8968(var2);
					if (class360.method7088(var2)) {
						var2 = -1;
					}
					break label23;
				}
			}

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
		int var2;
		label17: {
			var2 = var1.getKeyCode();
			if (var2 >= 0) {
				int var4 = class28.KeyHandler_keyCodes.length;
				if (var2 < var4) {
					var2 = class495.method8968(var2) & -129;
					break label17;
				}
			}

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
		if (var2 != 0 && var2 != '\uffff' && GrandExchangeOfferOwnWorldComparator.method1213(var2)) {
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)Lix;",
		garbageValue = "126"
	)
	@Export("ItemDefinition_get")
	public static ItemComposition ItemDefinition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ItemComposition.ItemDefinition_archive.takeFile(10, var0);
			var1 = new ItemComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.post();
			if (var1.noteTemplate != -1) {
				var1.genCert(ItemDefinition_get(var1.noteTemplate), ItemDefinition_get(var1.note));
			}

			if (var1.notedId != -1) {
				var1.genBought(ItemDefinition_get(var1.notedId), ItemDefinition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) {
				var1.genPlaceholder(ItemDefinition_get(var1.placeholderTemplate), ItemDefinition_get(var1.placeholder));
			}

			if (!WorldMapCacheName.ItemDefinition_inMembersWorld && var1.isMembersOnly) {
				if (var1.noteTemplate == -1 && var1.notedId == -1 && var1.placeholderTemplate == -1) {
					var1.name = var1.name + " (Members)";
				}

				var1.examine = "Login to a members' server to use this object.";
				var1.isTradable = false;

				int var3;
				for (var3 = 0; var3 < var1.groundActions.length; ++var3) {
					var1.groundActions[var3] = null;
				}

				for (var3 = 0; var3 < var1.inventoryActions.length; ++var3) {
					if (var3 != 4) {
						var1.inventoryActions[var3] = null;
					}
				}

				var1.shiftClickIndex = -2;
				var1.team = 0;
				if (var1.params != null) {
					boolean var6 = false;

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) {
						ParamComposition var5 = WorldMapData_1.getParamDefinition((int)var4.key);
						if (var5.autoDisable) {
							var4.remove();
						} else {
							var6 = true;
						}
					}

					if (!var6) {
						var1.params = null;
					}
				}
			}

			ItemComposition.ItemDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "39204566"
	)
	static final int method371(int var0, int var1, int var2) {
		int var3 = var0 / var2;
		int var4 = var0 & var2 - 1;
		int var5 = var1 / var2;
		int var6 = var1 & var2 - 1;
		int var7 = FloorDecoration.method4666(var3, var5);
		int var8 = FloorDecoration.method4666(var3 + 1, var5);
		int var9 = FloorDecoration.method4666(var3, var5 + 1);
		int var10 = FloorDecoration.method4666(var3 + 1, var5 + 1);
		int var12 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1;
		int var11 = ((65536 - var12) * var7 >> 16) + (var12 * var8 >> 16);
		int var14 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1;
		int var13 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
		int var16 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var6 * 1024 / var2] >> 1;
		int var15 = ((65536 - var16) * var11 >> 16) + (var13 * var16 >> 16);
		return var15;
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "48"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.playingJingle) {
			Skills.method7123(0, 0);
		} else if (var0 != -1) {
			boolean var1;
			if (class329.field3579.isEmpty()) {
				var1 = false;
			} else {
				MusicSong var2 = (MusicSong)class329.field3579.get(0);
				var1 = var2 != null && var0 == var2.musicTrackGroupId;
			}

			if (!var1 && class459.clientPreferences.getMusicVolume() != 0) {
				ArrayList var3 = new ArrayList();
				var3.add(new MusicSong(GameObject.archive6, var0, 0, class459.clientPreferences.getMusicVolume(), false));
				if (Client.playingJingle) {
					class329.field3579.clear();
					class329.field3579.addAll(var3);
					class146.method3226(0, 100, 100, 0);
				} else {
					ScriptFrame.method1169(var3, 0, 100, 100, 0, false);
				}
			}
		}

	}

	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIII)V",
		garbageValue = "-2027801843"
	)
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		class194.method3796(var0, var1, var2, var3, var4, var5, -1, false, -1);
	}
}
