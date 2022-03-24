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

@ObfuscatedName("ar")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener , MouseMotionListener , FocusListener {
	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"Lar;")

	@Export("MouseHandler_instance")
	public static MouseHandler MouseHandler_instance;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	107284469)

	@Export("MouseHandler_idleCycles")
	public static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	46919017)

	@Export("MouseHandler_currentButtonVolatile")
	public static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 
	-196949191)

	@Export("MouseHandler_xVolatile")
	public static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	44426053)

	@Export("MouseHandler_yVolatile")
	public static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("u")
	@ObfuscatedGetter(longValue = 
	51726182366578667L)

	@Export("MouseHandler_lastMovedVolatile")
	public static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 
	-1741182953)

	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 
	1113383001)

	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("x")
	@ObfuscatedGetter(intValue = 
	-601944997)

	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("c")
	@ObfuscatedGetter(longValue = 
	-3366277212682218721L)

	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 
	-173750849)

	@Export("MouseHandler_lastButtonVolatile")
	public static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = 
	1130317715)

	@Export("MouseHandler_lastPressedXVolatile")
	public static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 
	533285241)

	@Export("MouseHandler_lastPressedYVolatile")
	public static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("b")
	@ObfuscatedGetter(longValue = 
	-5019639506180718005L)

	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	public static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 
	-1259465113)

	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = 
	-416250337)

	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(intValue = 
	-769215047)

	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("q")
	@ObfuscatedGetter(longValue = 
	4641952122808710007L)

	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;
	@ObfuscatedName("ei")
	@ObfuscatedSignature(descriptor = 
	"Llu;")

	@Export("archive4")
	static Archive archive4;
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/awt/event/MouseEvent;B)I", garbageValue = 
	"1")

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

	public synchronized final void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_lastPressedXVolatile = var1.getX();
			MouseHandler_lastPressedYVolatile = var1.getY();
			MouseHandler_lastPressedTimeMillisVolatile = WorldMapSprite.getServerTime();
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

	public final void focusGained(FocusEvent var1) {
	}

	public synchronized final void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_currentButtonVolatile = 0;
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(ZZB)Lqx;", garbageValue = 
	"28")

	static IndexedSprite method622(boolean var0, boolean var1) {
		return var0 ? var1 ? class143.field1639 : Skeleton.options_buttons_2Sprite : var1 ? InvDefinition.field1814 : class160.options_buttons_0Sprite;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(Law;I)V", garbageValue = 
	"1699393273")

	static void method621(GameEngine var0) {
		while (class16.isKeyDown()) {
			if (class241.field2833 == 13) {
				Login.worldSelectOpen = false;
				Login.leftTitleSprite.drawAt(Login.xPadding, 0);
				class162.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
				HorizontalAlignment.logoSprite.drawAt((Login.xPadding + 382) - (HorizontalAlignment.logoSprite.subWidth / 2), 18);
				return;
			}

			if (class241.field2833 == 96) {
				if ((Login.worldSelectPage > 0) && (Interpreter.worldSelectLeftSprite != null)) {
					--Login.worldSelectPage;
				}
			} else if (((class241.field2833 == 97) && (Login.worldSelectPage < Login.worldSelectPagesCount)) && (class124.worldSelectRightSprite != null)) {
				++Login.worldSelectPage;
			}
		} 

		if ((MouseHandler_lastButton == 1) || ((!UserComparator5.mouseCam) && (MouseHandler_lastButton == 4))) {
			int var1 = Login.xPadding + 280;
			if ((((MouseHandler_lastPressedX >= var1) && (MouseHandler_lastPressedX <= (var1 + 14))) && (MouseHandler_lastPressedY >= 4)) && (MouseHandler_lastPressedY <= 18)) {
				Interpreter.changeWorldSelectSorting(0, 0);
				return;
			}

			if ((((MouseHandler_lastPressedX >= (var1 + 15)) && (MouseHandler_lastPressedX <= (var1 + 80))) && (MouseHandler_lastPressedY >= 4)) && (MouseHandler_lastPressedY <= 18)) {
				Interpreter.changeWorldSelectSorting(0, 1);
				return;
			}

			int var2 = Login.xPadding + 390;
			if ((((MouseHandler_lastPressedX >= var2) && (MouseHandler_lastPressedX <= (var2 + 14))) && (MouseHandler_lastPressedY >= 4)) && (MouseHandler_lastPressedY <= 18)) {
				Interpreter.changeWorldSelectSorting(1, 0);
				return;
			}

			if ((((MouseHandler_lastPressedX >= (var2 + 15)) && (MouseHandler_lastPressedX <= (var2 + 80))) && (MouseHandler_lastPressedY >= 4)) && (MouseHandler_lastPressedY <= 18)) {
				Interpreter.changeWorldSelectSorting(1, 1);
				return;
			}

			int var3 = Login.xPadding + 500;
			if ((((MouseHandler_lastPressedX >= var3) && (MouseHandler_lastPressedX <= (var3 + 14))) && (MouseHandler_lastPressedY >= 4)) && (MouseHandler_lastPressedY <= 18)) {
				Interpreter.changeWorldSelectSorting(2, 0);
				return;
			}

			if ((((MouseHandler_lastPressedX >= (var3 + 15)) && (MouseHandler_lastPressedX <= (var3 + 80))) && (MouseHandler_lastPressedY >= 4)) && (MouseHandler_lastPressedY <= 18)) {
				Interpreter.changeWorldSelectSorting(2, 1);
				return;
			}

			int var4 = Login.xPadding + 610;
			if ((((MouseHandler_lastPressedX >= var4) && (MouseHandler_lastPressedX <= (var4 + 14))) && (MouseHandler_lastPressedY >= 4)) && (MouseHandler_lastPressedY <= 18)) {
				Interpreter.changeWorldSelectSorting(3, 0);
				return;
			}

			if ((((MouseHandler_lastPressedX >= (var4 + 15)) && (MouseHandler_lastPressedX <= (var4 + 80))) && (MouseHandler_lastPressedY >= 4)) && (MouseHandler_lastPressedY <= 18)) {
				Interpreter.changeWorldSelectSorting(3, 1);
				return;
			}

			if ((((MouseHandler_lastPressedX >= (Login.xPadding + 708)) && (MouseHandler_lastPressedY >= 4)) && (MouseHandler_lastPressedX <= ((Login.xPadding + 708) + 50))) && (MouseHandler_lastPressedY <= 20)) {
				Login.worldSelectOpen = false;
				Login.leftTitleSprite.drawAt(Login.xPadding, 0);
				class162.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
				HorizontalAlignment.logoSprite.drawAt((Login.xPadding + 382) - (HorizontalAlignment.logoSprite.subWidth / 2), 18);
				return;
			}

			if (Login.hoveredWorldIndex != (-1)) {
				World var5 = World.World_worlds[Login.hoveredWorldIndex];
				ItemContainer.changeWorld(var5);
				Login.worldSelectOpen = false;
				Login.leftTitleSprite.drawAt(Login.xPadding, 0);
				class162.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
				HorizontalAlignment.logoSprite.drawAt((Login.xPadding + 382) - (HorizontalAlignment.logoSprite.subWidth / 2), 18);
				return;
			}

			if ((((((Login.worldSelectPage > 0) && (Interpreter.worldSelectLeftSprite != null)) && (MouseHandler_lastPressedX >= 0)) && (MouseHandler_lastPressedX <= Interpreter.worldSelectLeftSprite.subWidth)) && (MouseHandler_lastPressedY >= ((class309.canvasHeight / 2) - 50))) && (MouseHandler_lastPressedY <= ((class309.canvasHeight / 2) + 50))) {
				--Login.worldSelectPage;
			}

			if ((((((Login.worldSelectPage < Login.worldSelectPagesCount) && (class124.worldSelectRightSprite != null)) && (MouseHandler_lastPressedX >= ((class4.canvasWidth - class124.worldSelectRightSprite.subWidth) - 5))) && (MouseHandler_lastPressedX <= class4.canvasWidth)) && (MouseHandler_lastPressedY >= ((class309.canvasHeight / 2) - 50))) && (MouseHandler_lastPressedY <= ((class309.canvasHeight / 2) + 50))) {
				++Login.worldSelectPage;
			}
		}

	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"797091978")

	static final void method593() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
		KitDefinition.KitDefinition_cached.clear();
		ObjectComposition.ObjectDefinition_cached.clear();
		ObjectComposition.ObjectDefinition_cachedModelData.clear();
		ObjectComposition.ObjectDefinition_cachedEntities.clear();
		ObjectComposition.ObjectDefinition_cachedModels.clear();
		WorldMapDecoration.method4988();
		ItemComposition.ItemDefinition_cached.clear();
		ItemComposition.ItemDefinition_cachedModels.clear();
		ItemComposition.ItemDefinition_cachedSprites.clear();
		SequenceDefinition.SequenceDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cachedFrames.clear();
		SequenceDefinition.SequenceDefinition_cachedModel.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
		VarbitComposition.VarbitDefinition_cached.clear();
		FontName.method7509();
		ScriptEvent.HitSplatDefinition_cachedSprites.method7640();
		FontName.HitSplatDefinition_cached.method7640();
		class146.method3040();
		UserComparator1.method8029();
		class141.method2995();
		StructComposition.method3605();
		PacketWriter.method2485();
		PlayerComposition.PlayerAppearance_cachedModels.clear();
		Widget.Widget_cachedSprites.clear();
		Widget.Widget_cachedModels.clear();
		Widget.Widget_cachedFonts.clear();
		Widget.Widget_cachedSpriteMasks.clear();
		((TextureProvider) (Rasterizer3D.Rasterizer3D_textureLoader)).clear();
		Script.Script_cached.clear();
		TileItem.archive0.clearFiles();
		class321.archive1.clearFiles();
		class121.archive3.clearFiles();
		archive4.clearFiles();
		class302.archive5.clearFiles();
		ArchiveLoader.archive6.clearFiles();
		class145.archive7.clearFiles();
		WorldMapData_1.archive8.clearFiles();
		class132.archive9.clearFiles();
		World.archive10.clearFiles();
		class268.archive11.clearFiles();
		class135.archive12.clearFiles();
	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1201561793")

	@Export("playPcmPlayers")
	static final void playPcmPlayers() {
		if (class182.pcmPlayer1 != null) {
			class182.pcmPlayer1.run();
		}

		if (class290.pcmPlayer0 != null) {
			class290.pcmPlayer0.run();
		}

	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(descriptor = 
	"(III)V", garbageValue = 
	"1506401046")

	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (MusicPatchNode2.loadInterface(var0)) {
			ClanSettings.runComponentCloseListeners(EnumComposition.Widget_interfaceComponents[var0], var1);
		}
	}
}