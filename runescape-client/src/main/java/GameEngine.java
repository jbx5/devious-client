import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FontMetrics; import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image; import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.net.URL;
import javax.accessibility.Accessible; import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ao")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable , FocusListener , WindowListener {
	@ObfuscatedName("qj")
	@ObfuscatedSignature(descriptor = 
	"Lqa;")

	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;
	@ObfuscatedName("uu")
	@ObfuscatedGetter(intValue = 
	399090461)

	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lff;")

	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Lao;")

	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	1669508535)

	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("f")
	@ObfuscatedGetter(longValue = 
	-5981543505247076235L)

	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("b")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	449978353)

	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 
	-1442597045)

	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	1121679723)

	@Export("fps")
	protected static int fps;
	@ObfuscatedName("k")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("m")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("at")
	@ObfuscatedGetter(intValue = 
	-1397179313)

	static int field206;
	@ObfuscatedName("ad")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(longValue = 
	-4858752129692683603L)

	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(longValue = 
	-1651553175101575951L)

	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(intValue = 
	-543979185)

	public static int field218;
	@ObfuscatedName("n")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("t")
	@ObfuscatedGetter(intValue = 
	1855082601)

	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 
	995503961)

	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = 
	-1680473879)

	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 
	-63361611)

	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	741948317)

	int field205;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(intValue = 
	1573332371)

	int field200;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(intValue = 
	1344171121)

	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(intValue = 
	-337625473)

	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("ao")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("aj")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("al")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("an")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("ay")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(longValue = 
	5910881770928839481L)

	volatile long field209;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(descriptor = 
	"Lj;")

	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("au")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("af")
	@Export("eventQueue")
	final EventQueue eventQueue;
	static 
	{
		gameEngine = null;
		GameEngine_redundantStartThreadCount = 0;
		stopTimeMs = 0L;
		isKilled = false;
		cycleDurationMillis = 20;
		fiveOrOne = 1;
		fps = 0;
		graphicsTickTimes = new long[32];
		clientTickTimes = new long[32];
		field206 = 500;
		volatileFocus = true;
		garbageCollectorLastCollectionTime = -1L;
		garbageCollectorLastCheckTimeMs = -1L;
	}

	protected GameEngine() {
		this.hasErrored = false;
		this.canvasX = 0;
		this.canvasY = 0;
		this.fullRedraw = true;
		this.resizeCanvasNextFrame = false;
		this.isCanvasInvalid = false;
		this.field209 = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}

		this.eventQueue = var1;
		DevicePcmPlayerProvider var2 = new DevicePcmPlayerProvider();
		class384.pcmPlayerProvider = var2;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(III)V", garbageValue = 
	"-1436013377")

	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if ((this.maxCanvasWidth != var1) || (var2 != this.maxCanvasHeight)) {
			this.method466();
		}

		this.maxCanvasWidth = var1;
		this.maxCanvasHeight = var2;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/Object;I)V", garbageValue = 
	"82345296")

	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) {
			for (int var2 = 0; (var2 < 50) && (this.eventQueue.peekEvent() != null); ++var2) {
				class93.method2384(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(I)Lfo;", garbageValue = 
	"-1578740301")

	@Export("mouseWheel")
	protected class158 mouseWheel() {
		if (this.mouseWheelHandler == null) {
			this.mouseWheelHandler = new MouseWheelHandler();
			this.mouseWheelHandler.addTo(this.canvas);
		}

		return this.mouseWheelHandler;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1872048935")

	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard();
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;B)V", garbageValue = 
	"109")

	protected void method452(String var1) {
		this.clipboard.setContents(new StringSelection(var1), ((ClipboardOwner) (null)));
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1077399719")

	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		StudioGame.method5776();
		java.awt.Canvas var1 = this.canvas;
		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(KeyHandler.KeyHandler_instance);
		var1.addFocusListener(KeyHandler.KeyHandler_instance);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"-41")

	protected final void method428() {
		java.awt.Canvas var1 = this.canvas;
		var1.addMouseListener(MouseHandler.MouseHandler_instance);
		var1.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var1.addFocusListener(MouseHandler.MouseHandler_instance);
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"825452096")

	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container();
		if (var1 != null) {
			Bounds var2 = this.getFrameContentBounds();
			this.contentWidth = Math.max(var2.highX, this.field205);
			this.contentHeight = Math.max(var2.highY, this.field200);
			if (this.contentWidth <= 0) {
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) {
				this.contentHeight = 1;
			}

			InvDefinition.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
			class321.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
			this.canvasX = (this.contentWidth - InvDefinition.canvasWidth) / 2;
			this.canvasY = 0;
			this.canvas.setSize(InvDefinition.canvasWidth, class321.canvasHeight);
			FontName.rasterProvider = new RasterProvider(InvDefinition.canvasWidth, class321.canvasHeight, this.canvas);
			if (var1 == this.frame) {
				Insets var3 = this.frame.getInsets();
				this.canvas.setLocation(this.canvasX + var3.left, this.canvasY + var3.top);
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY);
			}

			this.fullRedraw = true;
			this.resizeGame();
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1462606142")

	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-977788049")

	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX;
		int var2 = this.canvasY;
		int var3 = (this.contentWidth - InvDefinition.canvasWidth) - var1;
		int var4 = (this.contentHeight - class321.canvasHeight) - var2;
		if ((((var1 > 0) || (var3 > 0)) || (var2 > 0)) || (var4 > 0)) {
			try {
				Container var5 = this.container();
				int var6 = 0;
				int var7 = 0;
				if (var5 == this.frame) {
					Insets var8 = this.frame.getInsets();
					var6 = var8.left;
					var7 = var8.top;
				}

				Graphics var10 = var5.getGraphics();
				var10.setColor(Color.black);
				if (var1 > 0) {
					var10.fillRect(var6, var7, var1, this.contentHeight);
				}

				if (var2 > 0) {
					var10.fillRect(var6, var7, this.contentWidth, var2);
				}

				if (var3 > 0) {
					var10.fillRect((var6 + this.contentWidth) - var3, var7, var3, this.contentHeight);
				}

				if (var4 > 0) {
					var10.fillRect(var6, (var7 + this.contentHeight) - var4, this.contentWidth, var4);
				}
			} catch (Exception var9) {
			}
		}

	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"-125")

	@Export("replaceCanvas")
	final void replaceCanvas() {
		Renderable.method4928(this.canvas);
		java.awt.Canvas var1 = this.canvas;
		var1.removeMouseListener(MouseHandler.MouseHandler_instance);
		var1.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
		var1.removeFocusListener(MouseHandler.MouseHandler_instance);
		MouseHandler.MouseHandler_currentButtonVolatile = 0;
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.removeFrom(this.canvas);
		}

		this.addCanvas();
		java.awt.Canvas var2 = this.canvas;
		var2.setFocusTraversalKeysEnabled(false);
		var2.addKeyListener(KeyHandler.KeyHandler_instance);
		var2.addFocusListener(KeyHandler.KeyHandler_instance);
		java.awt.Canvas var3 = this.canvas;
		var3.addMouseListener(MouseHandler.MouseHandler_instance);
		var3.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var3.addFocusListener(MouseHandler.MouseHandler_instance);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method466();
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(IIIB)V", garbageValue = 
	"-34")

	@Export("startThread")
	protected final void startThread(int var1, int var2, int var3) {
		try {
			if (gameEngine != null) {
				++GameEngine_redundantStartThreadCount;
				if (GameEngine_redundantStartThreadCount >= 3) {
					this.error("alreadyloaded");
					return;
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				return;
			}

			gameEngine = this;
			InvDefinition.canvasWidth = var1;
			class321.canvasHeight = var2;
			RunException.RunException_revision = var3;
			RunException.RunException_applet = this;
			if (taskHandler == null) {
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1);
		} catch (Exception var5) {
			Widget.RunException_sendStackTrace(((String) (null)), var5);
			this.error("crash");
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"2136462097")

	@Export("addCanvas")
	synchronized final void addCanvas() {
		Container var1 = this.container();
		if (this.canvas != null) {
			this.canvas.removeFocusListener(this);
			var1.remove(this.canvas);
		}

		InvDefinition.canvasWidth = Math.max(var1.getWidth(), this.field205);
		class321.canvasHeight = Math.max(var1.getHeight(), this.field200);
		Insets var2;
		if (this.frame != null) {
			var2 = this.frame.getInsets();
			InvDefinition.canvasWidth -= var2.right + var2.left;
			class321.canvasHeight -= var2.top + var2.bottom;
		}

		this.canvas = new Canvas(this);
		var1.setBackground(Color.BLACK);
		var1.setLayout(((LayoutManager) (null)));
		var1.add(this.canvas);
		this.canvas.setSize(InvDefinition.canvasWidth, class321.canvasHeight);
		this.canvas.setVisible(true);
		this.canvas.setBackground(Color.BLACK);
		if (var1 == this.frame) {
			var2 = this.frame.getInsets();
			this.canvas.setLocation(this.canvasX + var2.left, this.canvasY + var2.top);
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY);
		}

		this.canvas.addFocusListener(this);
		this.canvas.requestFocus();
		this.fullRedraw = true;
		if (((FontName.rasterProvider != null) && (InvDefinition.canvasWidth == FontName.rasterProvider.width)) && (class321.canvasHeight == FontName.rasterProvider.height)) {
			((RasterProvider) (FontName.rasterProvider)).setComponent(this.canvas);
			FontName.rasterProvider.drawFull(0, 0);
		} else {
			FontName.rasterProvider = new RasterProvider(InvDefinition.canvasWidth, class321.canvasHeight, this.canvas);
		}

		this.isCanvasInvalid = false;
		this.field209 = class136.method2931();
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"1626365648")

	@Export("checkHost")
	protected final boolean checkHost() {
		String var1 = this.getDocumentBase().getHost().toLowerCase();
		if ((!var1.equals("jagex.com")) && (!var1.endsWith(".jagex.com"))) {
			if ((!var1.equals("runescape.com")) && (!var1.endsWith(".runescape.com"))) {
				if (var1.endsWith("127.0.0.1")) {
					return true;
				} else {
					while (((var1.length() > 0) && (var1.charAt(var1.length() - 1) >= '0')) && (var1.charAt(var1.length() - 1) <= '9')) {
						var1 = var1.substring(0, var1.length() - 1);
					} 

					if (var1.endsWith("192.168.1.")) {
						return true;
					} else {
						this.error("invalidhost");
						return false;
					}
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1855362741")

	@Export("clientTick")
	void clientTick() {
		long var1 = class136.method2931();
		long var3 = clientTickTimes[SoundCache.field311];
		clientTickTimes[SoundCache.field311] = var1;
		SoundCache.field311 = (SoundCache.field311 + 1) & 31;
		if ((var3 != 0L) && (var1 > var3)) {
		}

		synchronized(this) {
			Varcs.hasFocus = volatileFocus;
		}

		this.doCycle();
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"30")

	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container();
		long var2 = class136.method2931();
		long var4 = graphicsTickTimes[Fonts.field4517];
		graphicsTickTimes[Fonts.field4517] = var2;
		Fonts.field4517 = (Fonts.field4517 + 1) & 31;
		if ((0L != var4) && (var2 > var4)) {
			int var6 = ((int) (var2 - var4));
			fps = ((var6 >> 1) + 32000) / var6;
		}

		if (((++field206) - 1) > 50) {
			field206 -= 50;
			this.fullRedraw = true;
			this.canvas.setSize(InvDefinition.canvasWidth, class321.canvasHeight);
			this.canvas.setVisible(true);
			if (var1 == this.frame) {
				Insets var7 = this.frame.getInsets();
				this.canvas.setLocation(this.canvasX + var7.left, this.canvasY + var7.top);
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY);
			}
		}

		if (this.isCanvasInvalid) {
			this.replaceCanvas();
		}

		this.method438();
		this.draw(this.fullRedraw);
		if (this.fullRedraw) {
			this.clearBackground();
		}

		this.fullRedraw = false;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"-20")

	final void method438() {
		Bounds var1 = this.getFrameContentBounds();
		if (((var1.highX != this.contentWidth) || (this.contentHeight != var1.highY)) || this.resizeCanvasNextFrame) {
			this.resizeCanvas();
			this.resizeCanvasNextFrame = false;
		}

	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1741244290")

	final void method466() {
		this.resizeCanvasNextFrame = true;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1463619182")

	@Export("kill")
	synchronized final void kill() {
		if (!isKilled) {
			isKilled = true;

			try {
				this.canvas.removeFocusListener(this);
			} catch (Exception var5) {
			}

			try {
				this.kill0();
			} catch (Exception var4) {
			}

			if (this.frame != null) {
				try {
					System.exit(0);
				} catch (Throwable var3) {
				}
			}

			if (taskHandler != null) {
				try {
					taskHandler.close();
				} catch (Exception var2) {
				}
			}

			this.vmethod1140();
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1665364684")

	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"612160698")

	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(ZS)V", garbageValue = 
	"-8708")

	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1364313232")

	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("aq")
	@ObfuscatedSignature(descriptor = 
	"(ILjava/lang/String;ZB)V", garbageValue = 
	"40")

	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics();
			if (WorldMapArchiveLoader.fontHelvetica13 == null) {
				WorldMapArchiveLoader.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
				WorldMapSection1.loginScreenFontMetrics = this.canvas.getFontMetrics(WorldMapArchiveLoader.fontHelvetica13);
			}

			if (var3) {
				var4.setColor(Color.black);
				var4.fillRect(0, 0, InvDefinition.canvasWidth, class321.canvasHeight);
			}

			Color var5 = new Color(140, 17, 17);

			try {
				if (class1.field3 == null) {
					class1.field3 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = class1.field3.getGraphics();
				var6.setColor(var5);
				var6.drawRect(0, 0, 303, 33);
				var6.fillRect(2, 2, var1 * 3, 30);
				var6.setColor(Color.black);
				var6.drawRect(1, 1, 301, 31);
				var6.fillRect((var1 * 3) + 2, 2, 300 - (var1 * 3), 30);
				var6.setFont(WorldMapArchiveLoader.fontHelvetica13);
				var6.setColor(Color.white);
				var6.drawString(var2, (304 - WorldMapSection1.loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
				var4.drawImage(class1.field3, (InvDefinition.canvasWidth / 2) - 152, (class321.canvasHeight / 2) - 18, ((ImageObserver) (null)));
			} catch (Exception var9) {
				int var7 = (InvDefinition.canvasWidth / 2) - 152;
				int var8 = (class321.canvasHeight / 2) - 18;
				var4.setColor(var5);
				var4.drawRect(var7, var8, 303, 33);
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30);
				var4.setColor(Color.black);
				var4.drawRect(var7 + 1, var8 + 1, 301, 31);
				var4.fillRect(((var1 * 3) + var7) + 2, var8 + 2, 300 - (var1 * 3), 30);
				var4.setFont(WorldMapArchiveLoader.fontHelvetica13);
				var4.setColor(Color.white);
				var4.drawString(var2, var7 + ((304 - WorldMapSection1.loginScreenFontMetrics.stringWidth(var2)) / 2), var8 + 22);
			}
		} catch (Exception var10) {
			this.canvas.repaint();
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"900281563")

	protected final void method520() {
		class1.field3 = null;
		WorldMapArchiveLoader.fontHelvetica13 = null;
		WorldMapSection1.loginScreenFontMetrics = null;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;I)V", garbageValue = 
	"-1191491956")

	@Export("error")
	protected void error(String var1) {
		if (!this.hasErrored) {
			this.hasErrored = true;
			System.out.println("error_game_" + var1);

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), ("error_game_" + var1) + ".ws"), "_self");
			} catch (Exception var3) {
			}

		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(descriptor = 
	"(B)Ljava/awt/Container;", garbageValue = 
	"-23")

	@Export("container")
	Container container() {
		return ((Container) (this.frame != null ? this.frame : this));
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(descriptor = 
	"(S)Lnm;", garbageValue = 
	"5503")

	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container();
		int var2 = Math.max(var1.getWidth(), this.field205);
		int var3 = Math.max(var1.getHeight(), this.field200);
		if (this.frame != null) {
			Insets var4 = this.frame.getInsets();
			var2 -= var4.left + var4.right;
			var3 -= var4.top + var4.bottom;
		}

		return new Bounds(var2, var3);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"180596017")

	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"111435525")

	protected abstract void vmethod1140();

	public synchronized final void paint(Graphics var1) {
		if ((this == gameEngine) && (!isKilled)) {
			this.fullRedraw = true;
			if ((class136.method2931() - this.field209) > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if ((var2 == null) || ((var2.width >= InvDefinition.canvasWidth) && (var2.height >= class321.canvasHeight))) {
					this.isCanvasInvalid = true;
				}
			}

		}
	}

	public final void destroy() {
		if ((this == gameEngine) && (!isKilled)) {
			stopTimeMs = class136.method2931();
			class93.method2384(5000L);
			this.kill();
		}
	}

	public final void windowActivated(WindowEvent var1) {
	}

	public final void start() {
		if ((this == gameEngine) && (!isKilled)) {
			stopTimeMs = 0L;
		}
	}

	public final void stop() {
		if ((this == gameEngine) && (!isKilled)) {
			stopTimeMs = class136.method2931() + 4000L;
		}
	}

	public final void update(Graphics var1) {
		this.paint(var1);
	}

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false;
	}

	public final void windowClosed(WindowEvent var1) {
	}

	public final void windowClosing(WindowEvent var1) {
		this.destroy();
	}

	public final void windowDeiconified(WindowEvent var1) {
	}

	public final void windowIconified(WindowEvent var1) {
	}

	public final void windowOpened(WindowEvent var1) {
	}

	public abstract void init();

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true;
		this.fullRedraw = true;
	}

	public final void windowDeactivated(WindowEvent var1) {
	}

	public void run() {
		try {
			if (TaskHandler.javaVendor != null) {
				String var1 = TaskHandler.javaVendor.toLowerCase();
				if ((var1.indexOf("sun") != (-1)) || (var1.indexOf("apple") != (-1))) {
					String var2 = TaskHandler.javaVersion;
					if ((((((((((var2.equals("1.1") || var2.startsWith("1.1.")) || var2.equals("1.2")) || var2.startsWith("1.2.")) || var2.equals("1.3")) || var2.startsWith("1.3.")) || var2.equals("1.4")) || var2.startsWith("1.4.")) || var2.equals("1.5")) || var2.startsWith("1.5.")) || var2.equals("1.6.0")) {
						this.error("wrongjava");
						return;
					}

					if (var2.startsWith("1.6.0_")) {
						int var3;
						for (var3 = 6; (var3 < var2.length()) && WorldMapElement.isDigit(var2.charAt(var3)); ++var3) {
						}

						String var4 = var2.substring(6, var3);
						if (class300.isNumber(var4) && (class19.method288(var4) < 10)) {
							this.error("wrongjava");
							return;
						}
					}

					fiveOrOne = 5;
				}
			}

			this.setFocusCycleRoot(true);
			this.addCanvas();
			this.setUp();

			Object var8;
			try {
				var8 = new NanoClock();
			} catch (Throwable var6) {
				var8 = new MilliClock();
			}

			class431.clock = ((Clock) (var8));

			while ((stopTimeMs == 0L) || (class136.method2931() < stopTimeMs)) {
				TriBool.gameCyclesToDo = class431.clock.wait(cycleDurationMillis, fiveOrOne);

				for (int var5 = 0; var5 < TriBool.gameCyclesToDo; ++var5) {
					this.clientTick();
				}

				this.graphicsTick();
				this.post(this.canvas);
			} 
		} catch (Exception var7) {
			Widget.RunException_sendStackTrace(((String) (null)), var7);
			this.error("crash");
		}

		this.kill();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1147911593")

	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null;

		try {
			var0 = ModeWhere.getPreferencesFile("", Messages.field1305.name, true);
			Buffer var1 = class131.clientPreferences.toBuffer();
			var0.write(var1.array, 0, var1.offset);
		} catch (Exception var3) {
		}

		try {
			if (var0 != null) {
				var0.closeSync(true);
			}
		} catch (Exception var2) {
		}

	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;I)V", garbageValue = 
	"-1079114439")

	static final void method569(String var0) {
		PacketBufferNode var1 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2912, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(class425.stringCp1252NullTerminatedByteSize(var0));
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(descriptor = 
	"(ILks;ZI)V", garbageValue = 
	"1109556006")

	static void method570(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = class21.getWorldMap().getMapArea(var0);
		int var4 = GrandExchangeEvents.localPlayer.plane;
		int var5 = (GrandExchangeEvents.localPlayer.x >> 7) + GrandExchangeOfferOwnWorldComparator.baseX;
		int var6 = (GrandExchangeEvents.localPlayer.y >> 7) + VarcInt.baseY;
		Coord var7 = new Coord(var4, var5, var6);
		class21.getWorldMap().method7231(var3, var7, var1, var2);
	}
}