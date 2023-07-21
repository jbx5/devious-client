import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
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
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lgv;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lbq;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1863245799
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		longValue = -3324604039741634181L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("as")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1313438219
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -377430971
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -439267215
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("ah")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("aa")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -346598077
	)
	static int field218;
	@ObfuscatedName("bk")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lal;"
	)
	@Export("keyHandler")
	static KeyHandler keyHandler;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		longValue = 4046338742853434797L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		longValue = 7369086245763451971L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("aj")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1468468173
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -231129273
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 276625879
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -236030865
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 829298111
	)
	int field214;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -997891979
	)
	int field215;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 484091823
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 356697101
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("bd")
	protected boolean field210;
	@ObfuscatedName("ba")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("bf")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("bs")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("bq")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("bo")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		longValue = 9169858083731276043L
	)
	volatile long field229;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("bi")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("bu")
	@Export("eventQueue")
	final EventQueue eventQueue;

	static {
		gameEngine = null;
		GameEngine_redundantStartThreadCount = 0;
		stopTimeMs = 0L;
		isKilled = false;
		cycleDurationMillis = 20;
		fiveOrOne = 1;
		fps = 0;
		graphicsTickTimes = new long[32];
		clientTickTimes = new long[32];
		field218 = 500;
		volatileFocus = true;
		keyHandler = new KeyHandler();
		garbageCollectorLastCollectionTime = -1L;
		garbageCollectorLastCheckTimeMs = -1L;
	}

	protected GameEngine() {
		this.hasErrored = false;
		this.canvasX = 0;
		this.canvasY = 0;
		this.field210 = false;
		this.fullRedraw = true;
		this.resizeCanvasNextFrame = false;
		this.isCanvasInvalid = false;
		this.field229 = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}

		this.eventQueue = var1;
		HorizontalAlignment.method3697(new DevicePcmPlayerProvider());
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1942642885"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) {
			this.method494();
		}

		this.maxCanvasWidth = var1;
		this.maxCanvasHeight = var2;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)V",
		garbageValue = "198791699"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) {
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
				class13.method180(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lgf;",
		garbageValue = "1549057161"
	)
	@Export("mouseWheel")
	protected class174 mouseWheel() {
		if (this.mouseWheelHandler == null) {
			this.mouseWheelHandler = new MouseWheelHandler();
			this.mouseWheelHandler.addTo(this.canvas);
		}

		return this.mouseWheelHandler;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "68"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1812985969"
	)
	protected void method620(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "1105846557"
	)
	protected Clipboard method478() {
		return this.clipboard;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1263435879"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		class306.method5812();
		keyHandler.method348(this.canvas);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "22228"
	)
	protected final void method480() {
		keyHandler.method350();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lba;II)V",
		garbageValue = "1385664005"
	)
	protected void method481(class29 var1, int var2) {
		keyHandler.method345(var1, var2);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "6"
	)
	protected final void method485() {
		WorldMapDecorationType.method6642(this.canvas);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "712495605"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container();
		if (var1 != null) {
			Bounds var2 = this.getFrameContentBounds();
			this.contentWidth = Math.max(var2.highX, this.field214);
			this.contentHeight = Math.max(var2.highY, this.field215);
			if (this.contentWidth <= 0) {
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) {
				this.contentHeight = 1;
			}

			GrandExchangeOfferTotalQuantityComparator.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
			WorldMapArchiveLoader.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
			this.canvasX = (this.contentWidth - GrandExchangeOfferTotalQuantityComparator.canvasWidth) / 2;
			this.canvasY = 0;
			this.canvas.setSize(GrandExchangeOfferTotalQuantityComparator.canvasWidth, WorldMapArchiveLoader.canvasHeight);
			class156.rasterProvider = new RasterProvider(GrandExchangeOfferTotalQuantityComparator.canvasWidth, WorldMapArchiveLoader.canvasHeight, this.canvas, this.field210);
			if (var1 == this.frame) {
				Insets var3 = this.frame.getInsets();
				this.canvas.setLocation(this.canvasX + var3.left, var3.top + this.canvasY);
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY);
			}

			this.fullRedraw = true;
			this.resizeGame();
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-19"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX;
		int var2 = this.canvasY;
		int var3 = this.contentWidth - GrandExchangeOfferTotalQuantityComparator.canvasWidth - var1;
		int var4 = this.contentHeight - WorldMapArchiveLoader.canvasHeight - var2;
		if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
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
					var10.fillRect(var6 + this.contentWidth - var3, var7, var3, this.contentHeight);
				}

				if (var4 > 0) {
					var10.fillRect(var6, var7 + this.contentHeight - var4, this.contentWidth, var4);
				}
			} catch (Exception var9) {
			}
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1818250139"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		keyHandler.method349(this.canvas);
		java.awt.Canvas var1 = this.canvas;
		var1.removeMouseListener(MouseHandler.MouseHandler_instance);
		var1.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
		var1.removeFocusListener(MouseHandler.MouseHandler_instance);
		MouseHandler.MouseHandler_currentButtonVolatile = 0;
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.method300(this.canvas);
		}

		this.addCanvas();
		keyHandler.method348(this.canvas);
		WorldMapDecorationType.method6642(this.canvas);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method494();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "52"
	)
	@Export("startThread")
	protected final void startThread(int var1, int var2, int var3, int var4) {
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
			GrandExchangeOfferTotalQuantityComparator.canvasWidth = var1;
			WorldMapArchiveLoader.canvasHeight = var2;
			RunException.RunException_revision = var3;
			RunException.field5235 = var4;
			RunException.RunException_applet = this;
			if (taskHandler == null) {
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1);
		} catch (Exception var6) {
			class317.RunException_sendStackTrace((String)null, var6);
			this.error("crash");
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-679598443"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container();
		if (this.canvas != null) {
			this.canvas.removeFocusListener(this);
			var1.remove(this.canvas);
		}

		GrandExchangeOfferTotalQuantityComparator.canvasWidth = Math.max(var1.getWidth(), this.field214);
		WorldMapArchiveLoader.canvasHeight = Math.max(var1.getHeight(), this.field215);
		Insets var2;
		if (this.frame != null) {
			var2 = this.frame.getInsets();
			GrandExchangeOfferTotalQuantityComparator.canvasWidth -= var2.left + var2.right;
			WorldMapArchiveLoader.canvasHeight -= var2.bottom + var2.top;
		}

		this.canvas = new Canvas(this);
		var1.setBackground(Color.BLACK);
		var1.setLayout((LayoutManager)null);
		var1.add(this.canvas);
		this.canvas.setSize(GrandExchangeOfferTotalQuantityComparator.canvasWidth, WorldMapArchiveLoader.canvasHeight);
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
		if (class156.rasterProvider != null && GrandExchangeOfferTotalQuantityComparator.canvasWidth == class156.rasterProvider.width && WorldMapArchiveLoader.canvasHeight == class156.rasterProvider.height) {
			((RasterProvider)class156.rasterProvider).setComponent(this.canvas);
			class156.rasterProvider.drawFull(0, 0);
		} else {
			class156.rasterProvider = new RasterProvider(GrandExchangeOfferTotalQuantityComparator.canvasWidth, WorldMapArchiveLoader.canvasHeight, this.canvas, this.field210);
		}

		this.isCanvasInvalid = false;
		this.field229 = class113.method2835();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-823616991"
	)
	protected void method489(boolean var1) {
		if (this.field210 != var1) {
			this.field210 = var1;
			class156.rasterProvider.method9514(var1);
			class156.rasterProvider.apply();
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "120"
	)
	@Export("checkHost")
	protected final boolean checkHost() {
		String var1 = this.getDocumentBase().getHost().toLowerCase();
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) {
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) {
				if (var1.endsWith("127.0.0.1")) {
					return true;
				} else {
					while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
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

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-968211231"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = class113.method2835();
		long var3 = clientTickTimes[class1.field6];
		clientTickTimes[class1.field6] = var1;
		class1.field6 = class1.field6 + 1 & 31;
		if (var3 != 0L && var1 > var3) {
		}

		synchronized(this) {
			class326.hasFocus = volatileFocus;
		}

		this.doCycle();
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "939490922"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container();
		long var2 = class113.method2835();
		long var4 = graphicsTickTimes[class300.field3348];
		graphicsTickTimes[class300.field3348] = var2;
		class300.field3348 = class300.field3348 + 1 & 31;
		if (var4 != 0L && var2 > var4) {
			int var6 = (int)(var2 - var4);
			fps = ((var6 >> 1) + 32000) / var6;
		}

		if (++field218 - 1 > 50) {
			field218 -= 50;
			this.fullRedraw = true;
			this.canvas.setSize(GrandExchangeOfferTotalQuantityComparator.canvasWidth, WorldMapArchiveLoader.canvasHeight);
			this.canvas.setVisible(true);
			if (var1 == this.frame) {
				Insets var7 = this.frame.getInsets();
				this.canvas.setLocation(var7.left + this.canvasX, var7.top + this.canvasY);
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY);
			}
		}

		if (this.isCanvasInvalid) {
			this.replaceCanvas();
		}

		this.method509();
		this.draw(this.fullRedraw);
		if (this.fullRedraw) {
			this.clearBackground();
		}

		this.fullRedraw = false;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1856767081"
	)
	final void method509() {
		Bounds var1 = this.getFrameContentBounds();
		if (var1.highX != this.contentWidth || this.contentHeight != var1.highY || this.resizeCanvasNextFrame) {
			this.resizeCanvas();
			this.resizeCanvasNextFrame = false;
		}

	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-227400118"
	)
	final void method494() {
		this.resizeCanvasNextFrame = true;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "9"
	)
	@Export("kill")
	final synchronized void kill() {
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

			this.vmethod1262();
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "72"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "443189499"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-23"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "73"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZB)V",
		garbageValue = "-29"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics();
			if (SoundSystem.fontHelvetica13 == null) {
				SoundSystem.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
				class14.loginScreenFontMetrics = this.canvas.getFontMetrics(SoundSystem.fontHelvetica13);
			}

			if (var3) {
				var4.setColor(Color.black);
				var4.fillRect(0, 0, GrandExchangeOfferTotalQuantityComparator.canvasWidth, WorldMapArchiveLoader.canvasHeight);
			}

			Color var5 = new Color(140, 17, 17);

			try {
				if (class467.field4803 == null) {
					class467.field4803 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = class467.field4803.getGraphics();
				var6.setColor(var5);
				var6.drawRect(0, 0, 303, 33);
				var6.fillRect(2, 2, var1 * 3, 30);
				var6.setColor(Color.black);
				var6.drawRect(1, 1, 301, 31);
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
				var6.setFont(SoundSystem.fontHelvetica13);
				var6.setColor(Color.white);
				var6.drawString(var2, (304 - class14.loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
				var4.drawImage(class467.field4803, GrandExchangeOfferTotalQuantityComparator.canvasWidth / 2 - 152, WorldMapArchiveLoader.canvasHeight / 2 - 18, (ImageObserver)null);
			} catch (Exception var9) {
				int var7 = GrandExchangeOfferTotalQuantityComparator.canvasWidth / 2 - 152;
				int var8 = WorldMapArchiveLoader.canvasHeight / 2 - 18;
				var4.setColor(var5);
				var4.drawRect(var7, var8, 303, 33);
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30);
				var4.setColor(Color.black);
				var4.drawRect(var7 + 1, var8 + 1, 301, 31);
				var4.fillRect(var7 + var1 * 3 + 2, var8 + 2, 300 - var1 * 3, 30);
				var4.setFont(SoundSystem.fontHelvetica13);
				var4.setColor(Color.white);
				var4.drawString(var2, var7 + (304 - class14.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22);
			}
		} catch (Exception var10) {
			this.canvas.repaint();
		}

	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-109"
	)
	protected final void method634() {
		class467.field4803 = null;
		SoundSystem.fontHelvetica13 = null;
		class14.loginScreenFontMetrics = null;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-845408623"
	)
	@Export("error")
	protected void error(String var1) {
		if (!this.hasErrored) {
			this.hasErrored = true;
			System.out.println("error_game_" + var1);

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
			} catch (Exception var3) {
			}

		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/Container;",
		garbageValue = "-1949821746"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this);
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)Lrk;",
		garbageValue = "483391550"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container();
		int var2 = Math.max(var1.getWidth(), this.field214);
		int var3 = Math.max(var1.getHeight(), this.field215);
		if (this.frame != null) {
			Insets var4 = this.frame.getInsets();
			var2 -= var4.left + var4.right;
			var3 -= var4.top + var4.bottom;
		}

		return new Bounds(var2, var3);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1832672848"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2050335898"
	)
	protected abstract void vmethod1262();

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) {
			this.fullRedraw = true;
			if (class113.method2835() - this.field229 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= GrandExchangeOfferTotalQuantityComparator.canvasWidth && var2.height >= WorldMapArchiveLoader.canvasHeight) {
					this.isCanvasInvalid = true;
				}
			}

		}
	}

	public final void destroy() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = class113.method2835();
			class13.method180(5000L);
			this.kill();
		}
	}

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true;
		this.fullRedraw = true;
	}

	public final void stop() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = class113.method2835() + 4000L;
		}
	}

	public final void update(Graphics var1) {
		this.paint(var1);
	}

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false;
	}

	public final void windowClosing(WindowEvent var1) {
		this.destroy();
	}

	public final void windowDeiconified(WindowEvent var1) {
	}

	public final void windowOpened(WindowEvent var1) {
	}

	public abstract void init();

	public final void start() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = 0L;
		}
	}

	public final void windowActivated(WindowEvent var1) {
	}

	public void run() {
		try {
			if (TaskHandler.javaVendor != null) {
				String var1 = TaskHandler.javaVendor.toLowerCase();
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
					String var2 = TaskHandler.javaVersion;
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
						this.error("wrongjava");
						return;
					}

					if (var2.startsWith("1.6.0_")) {
						int var3;
						for (var3 = 6; var3 < var2.length() && class164.isDigit(var2.charAt(var3)); ++var3) {
						}

						String var4 = var2.substring(6, var3);
						if (Skeleton.isNumber(var4) && class306.method5811(var4) < 10) {
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

			FloorUnderlayDefinition.clock = (Clock)var8;

			while (stopTimeMs == 0L || class113.method2835() < stopTimeMs) {
				class313.gameCyclesToDo = FloorUnderlayDefinition.clock.wait(cycleDurationMillis, fiveOrOne);

				for (int var5 = 0; var5 < class313.gameCyclesToDo; ++var5) {
					this.clientTick();
				}

				this.graphicsTick();
				this.post(this.canvas);
			}
		} catch (Exception var7) {
			class317.RunException_sendStackTrace((String)null, var7);
			this.error("crash");
		}

		this.kill();
	}

	public final void windowDeactivated(WindowEvent var1) {
	}

	public final void windowIconified(WindowEvent var1) {
	}

	public final void windowClosed(WindowEvent var1) {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lhh;",
		garbageValue = "380782889"
	)
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0);
			var1 = new InvDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Ldc;",
		garbageValue = "-91"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = UserComparator3.method2885(var1, var0);
		Script var4 = class30.method448(var3, var0);
		if (var4 != null) {
			return var4;
		} else {
			var3 = class135.method3050(var2, var0);
			var4 = class30.method448(var3, var0);
			if (var4 != null) {
				return var4;
			} else {
				int var5 = var0 + -512;
				var4 = class30.method448(var5, var0);
				return var4 != null ? var4 : null;
			}
		}
	}

	@ObfuscatedName("nh")
	@ObfuscatedSignature(
		descriptor = "(IIIILud;Lmi;I)V",
		garbageValue = "-1471720013"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) {
			int var6 = Client.camAngleY & 2047;
			int var7 = var3 * var3 + var2 * var2;
			if (var7 <= 6400) {
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6];
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6];
				int var10 = var9 * var2 + var3 * var8 >> 16;
				int var11 = var3 * var9 - var8 * var2 >> 16;
				if (var7 > 2500) {
					var4.method9583(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths);
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2);
				}

			}
		}
	}
}
