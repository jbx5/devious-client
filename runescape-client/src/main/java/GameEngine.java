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

@ObfuscatedName("by")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lby;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 868435177
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = 8014952675022983113L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("aq")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -227700533
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1831343277
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1711846051
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("ad")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("aw")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1863231711
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -727331531
	)
	static int field190;
	@ObfuscatedName("bb")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lat;"
	)
	@Export("keyHandler")
	static KeyHandler keyHandler;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		longValue = 4504951493222223121L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		longValue = -5460383931457017069L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("kk")
	@ObfuscatedGetter(
		intValue = -616165453
	)
	@Export("cameraX")
	static int cameraX;
	@ObfuscatedName("ar")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 699729347
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -322011829
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 170702179
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1902725289
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1213055819
	)
	int field199;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1675354011
	)
	int field215;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -866601303
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1572017175
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("bj")
	protected boolean field203;
	@ObfuscatedName("bt")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("br")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("ba")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("by")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("bc")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		longValue = 3687291756214282661L
	)
	volatile long field183;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lah;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("bm")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("bq")
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
		field190 = 500;
		volatileFocus = true;
		keyHandler = new KeyHandler();
		garbageCollectorLastCollectionTime = -1L;
		garbageCollectorLastCheckTimeMs = -1L;
	}

	protected GameEngine() {
		this.hasErrored = false;
		this.canvasX = 0;
		this.canvasY = 0;
		this.field203 = false;
		this.fullRedraw = true;
		this.resizeCanvasNextFrame = false;
		this.isCanvasInvalid = false;
		this.field183 = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}

		this.eventQueue = var1;
		DevicePcmPlayerProvider var2 = new DevicePcmPlayerProvider();
		BoundaryObject.pcmPlayerProvider = var2;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2125158233"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) {
			this.method538();
		}

		this.maxCanvasWidth = var1;
		this.maxCanvasHeight = var2;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)V",
		garbageValue = "1125000698"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) {
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
				BuddyRankComparator.method2992(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lip;",
		garbageValue = "1331429226"
	)
	@Export("mouseWheel")
	protected MouseWheel mouseWheel() {
		if (this.mouseWheelHandler == null) {
			this.mouseWheelHandler = new MouseWheelHandler();
			this.mouseWheelHandler.addTo(this.canvas);
		}

		return this.mouseWheelHandler;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1231902883"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "1"
	)
	protected void method619(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "1811234521"
	)
	public Clipboard method502() {
		return this.clipboard;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-62"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		if (class233.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
			class28.KeyHandler_keyCodes[186] = 57;
			class28.KeyHandler_keyCodes[187] = 27;
			class28.KeyHandler_keyCodes[188] = 71;
			class28.KeyHandler_keyCodes[189] = 26;
			class28.KeyHandler_keyCodes[190] = 72;
			class28.KeyHandler_keyCodes[191] = 73;
			class28.KeyHandler_keyCodes[192] = 58;
			class28.KeyHandler_keyCodes[219] = 42;
			class28.KeyHandler_keyCodes[220] = 74;
			class28.KeyHandler_keyCodes[221] = 43;
			class28.KeyHandler_keyCodes[222] = 59;
			class28.KeyHandler_keyCodes[223] = 28;
		} else {
			class28.KeyHandler_keyCodes[44] = 71;
			class28.KeyHandler_keyCodes[45] = 26;
			class28.KeyHandler_keyCodes[46] = 72;
			class28.KeyHandler_keyCodes[47] = 73;
			class28.KeyHandler_keyCodes[59] = 57;
			class28.KeyHandler_keyCodes[61] = 27;
			class28.KeyHandler_keyCodes[91] = 42;
			class28.KeyHandler_keyCodes[92] = 74;
			class28.KeyHandler_keyCodes[93] = 43;
			class28.KeyHandler_keyCodes[192] = 28;
			class28.KeyHandler_keyCodes[222] = 58;
			class28.KeyHandler_keyCodes[520] = 59;
		}

		keyHandler.method359(this.canvas);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "74"
	)
	protected final void method504() {
		keyHandler.method379();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lbt;IB)V",
		garbageValue = "114"
	)
	protected void method632(class29 var1, int var2) {
		keyHandler.method357(var1, var2);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1686212242"
	)
	@Export("setUpMouse")
	protected final void setUpMouse() {
		java.awt.Canvas var1 = this.canvas;
		var1.addMouseListener(MouseHandler.MouseHandler_instance);
		var1.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var1.addFocusListener(MouseHandler.MouseHandler_instance);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "777989296"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container();
		if (var1 != null) {
			Bounds var2 = this.getFrameContentBounds();
			this.contentWidth = Math.max(var2.highX, this.field199);
			this.contentHeight = Math.max(var2.highY, this.field215);
			if (this.contentWidth <= 0) {
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) {
				this.contentHeight = 1;
			}

			class524.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
			canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
			this.canvasX = (this.contentWidth - class524.canvasWidth) / 2;
			this.canvasY = 0;
			this.canvas.setSize(class524.canvasWidth, canvasHeight);
			WorldMapData_1.rasterProvider = new RasterProvider(class524.canvasWidth, canvasHeight, this.canvas, this.field203);
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "35"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-6"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX;
		int var2 = this.canvasY;
		int var3 = this.contentWidth - class524.canvasWidth - var1;
		int var4 = this.contentHeight - canvasHeight - var2;
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2012224013"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		keyHandler.method360(this.canvas);
		StructComposition.method3879(this.canvas);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.method315(this.canvas);
		}

		this.addCanvas();
		keyHandler.method359(this.canvas);
		java.awt.Canvas var1 = this.canvas;
		var1.addMouseListener(MouseHandler.MouseHandler_instance);
		var1.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var1.addFocusListener(MouseHandler.MouseHandler_instance);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method538();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-504492174"
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
			class524.canvasWidth = var1;
			canvasHeight = var2;
			RunException.RunException_revision = var3;
			class494.field4948 = var4;
			RunException.RunException_applet = this;
			if (taskHandler == null) {
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1);
		} catch (Exception var6) {
			class368.RunException_sendStackTrace((String)null, var6);
			this.error("crash");
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container();
		if (this.canvas != null) {
			this.canvas.removeFocusListener(this);
			var1.remove(this.canvas);
		}

		class524.canvasWidth = Math.max(var1.getWidth(), this.field199);
		canvasHeight = Math.max(var1.getHeight(), this.field215);
		Insets var2;
		if (this.frame != null) {
			var2 = this.frame.getInsets();
			class524.canvasWidth -= var2.right + var2.left;
			canvasHeight -= var2.bottom + var2.top;
		}

		this.canvas = new Canvas(this);
		var1.setBackground(Color.BLACK);
		var1.setLayout((LayoutManager)null);
		var1.add(this.canvas);
		this.canvas.setSize(class524.canvasWidth, canvasHeight);
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
		if (WorldMapData_1.rasterProvider != null && class524.canvasWidth == WorldMapData_1.rasterProvider.width && canvasHeight == WorldMapData_1.rasterProvider.height) {
			((RasterProvider)WorldMapData_1.rasterProvider).setComponent(this.canvas);
			WorldMapData_1.rasterProvider.drawFull(0, 0);
		} else {
			WorldMapData_1.rasterProvider = new RasterProvider(class524.canvasWidth, canvasHeight, this.canvas, this.field203);
		}

		this.isCanvasInvalid = false;
		this.field183 = UserComparator9.method2973();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "8"
	)
	protected void method513(boolean var1) {
		if (this.field203 != var1) {
			this.field203 = var1;
			WorldMapData_1.rasterProvider.method9790(var1);
			WorldMapData_1.rasterProvider.apply();
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "54"
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2011943361"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = UserComparator9.method2973();
		long var3 = clientTickTimes[GrandExchangeOfferAgeComparator.field4410];
		clientTickTimes[GrandExchangeOfferAgeComparator.field4410] = var1;
		GrandExchangeOfferAgeComparator.field4410 = GrandExchangeOfferAgeComparator.field4410 + 1 & 31;
		if (0L != var3 && var1 > var3) {
		}

		synchronized(this) {
			class31.hasFocus = volatileFocus;
		}

		this.doCycle();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "36786763"
	)
	protected final void method516() {
		this.fullRedraw = true;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-101"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container();
		long var2 = UserComparator9.method2973();
		long var4 = graphicsTickTimes[HttpQueryParams.field4854];
		graphicsTickTimes[HttpQueryParams.field4854] = var2;
		HttpQueryParams.field4854 = HttpQueryParams.field4854 + 1 & 31;
		if (0L != var4 && var2 > var4) {
			int var6 = (int)(var2 - var4);
			fps = ((var6 >> 1) + 32000) / var6;
		}

		if (++field190 - 1 > 50) {
			field190 -= 50;
			this.fullRedraw = true;
			this.canvas.setSize(class524.canvasWidth, canvasHeight);
			this.canvas.setVisible(true);
			if (var1 == this.frame) {
				Insets var7 = this.frame.getInsets();
				this.canvas.setLocation(this.canvasX + var7.left, var7.top + this.canvasY);
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY);
			}
		}

		if (this.isCanvasInvalid) {
			this.replaceCanvas();
		}

		this.method518();
		this.draw(this.fullRedraw);
		if (this.fullRedraw) {
			this.clearBackground();
		}

		this.fullRedraw = false;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1669237932"
	)
	final void method518() {
		Bounds var1 = this.getFrameContentBounds();
		if (var1.highX != this.contentWidth || this.contentHeight != var1.highY || this.resizeCanvasNextFrame) {
			this.resizeCanvas();
			this.resizeCanvasNextFrame = false;
		}

	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2097036407"
	)
	final void method538() {
		this.resizeCanvasNextFrame = true;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "796261390"
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

			this.vmethod1251();
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1581898600"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "107"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "65536"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1847953596"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZI)V",
		garbageValue = "-2105215181"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics();
			if (class139.fontHelvetica13 == null) {
				class139.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
				GameBuild.loginScreenFontMetrics = this.canvas.getFontMetrics(class139.fontHelvetica13);
			}

			if (var3) {
				var4.setColor(Color.black);
				var4.fillRect(0, 0, class524.canvasWidth, canvasHeight);
			}

			Color var5 = new Color(140, 17, 17);

			try {
				if (SwapSongTask.field4579 == null) {
					SwapSongTask.field4579 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = SwapSongTask.field4579.getGraphics();
				var6.setColor(var5);
				var6.drawRect(0, 0, 303, 33);
				var6.fillRect(2, 2, var1 * 3, 30);
				var6.setColor(Color.black);
				var6.drawRect(1, 1, 301, 31);
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
				var6.setFont(class139.fontHelvetica13);
				var6.setColor(Color.white);
				var6.drawString(var2, (304 - GameBuild.loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
				var4.drawImage(SwapSongTask.field4579, class524.canvasWidth / 2 - 152, canvasHeight / 2 - 18, (ImageObserver)null);
			} catch (Exception var9) {
				int var7 = class524.canvasWidth / 2 - 152;
				int var8 = canvasHeight / 2 - 18;
				var4.setColor(var5);
				var4.drawRect(var7, var8, 303, 33);
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30);
				var4.setColor(Color.black);
				var4.drawRect(var7 + 1, var8 + 1, 301, 31);
				var4.fillRect(var1 * 3 + var7 + 2, var8 + 2, 300 - var1 * 3, 30);
				var4.setFont(class139.fontHelvetica13);
				var4.setColor(Color.white);
				var4.drawString(var2, var7 + (304 - GameBuild.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22);
			}
		} catch (Exception var10) {
			this.canvas.repaint();
		}

	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "823954529"
	)
	protected final void method557() {
		SwapSongTask.field4579 = null;
		class139.fontHelvetica13 = null;
		GameBuild.loginScreenFontMetrics = null;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "77"
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

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/Container;",
		garbageValue = "-1776421511"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this);
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(B)Lry;",
		garbageValue = "-51"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container();
		int var2 = Math.max(var1.getWidth(), this.field199);
		int var3 = Math.max(var1.getHeight(), this.field215);
		if (this.frame != null) {
			Insets var4 = this.frame.getInsets();
			var2 -= var4.left + var4.right;
			var3 -= var4.bottom + var4.top;
		}

		return new Bounds(var2, var3);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1739982853"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "164188662"
	)
	protected abstract void vmethod1251();

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) {
			this.fullRedraw = true;
			if (UserComparator9.method2973() - this.field183 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= class524.canvasWidth && var2.height >= canvasHeight) {
					this.isCanvasInvalid = true;
				}
			}

		}
	}

	public final void destroy() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = UserComparator9.method2973();
			BuddyRankComparator.method2992(5000L);
			this.kill();
		}
	}

	public void run() {
		try {
			if (class233.javaVendor != null) {
				String var1 = class233.javaVendor.toLowerCase();
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
					String var2 = TaskHandler.javaVersion;
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
						this.error("wrongjava");
						return;
					}

					if (var2.startsWith("1.6.0_")) {
						int var3;
						for (var3 = 6; var3 < var2.length() && ScriptFrame.isDigit(var2.charAt(var3)); ++var3) {
						}

						String var4 = var2.substring(6, var3);
						if (Login.isNumber(var4) && HealthBar.method2644(var4) < 10) {
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

			class344.clock = (Clock)var8;

			while (0L == stopTimeMs || UserComparator9.method2973() < stopTimeMs) {
				class195.gameCyclesToDo = class344.clock.wait(cycleDurationMillis, fiveOrOne);

				for (int var5 = 0; var5 < class195.gameCyclesToDo; ++var5) {
					this.clientTick();
				}

				this.graphicsTick();
				this.post(this.canvas);
			}
		} catch (Exception var7) {
			class368.RunException_sendStackTrace((String)null, var7);
			this.error("crash");
		}

		this.kill();
	}

	public abstract void init();

	public final void start() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = 0L;
		}
	}

	public final void stop() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = UserComparator9.method2973() + 4000L;
		}
	}

	public final void update(Graphics var1) {
		this.paint(var1);
	}

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false;
	}

	public final void windowActivated(WindowEvent var1) {
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

	public final void windowDeactivated(WindowEvent var1) {
	}

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true;
		this.fullRedraw = true;
	}

	public final void windowClosed(WindowEvent var1) {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lch;",
		garbageValue = "-36980380"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? World.World_worlds[++World.World_listCount - 1] : null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2061090063"
	)
	static final int method678(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-30"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount;
		TileItem.method2764();
		if (Client.renderSelf) {
			class141.addPlayerToScene(KeyHandler.localPlayer, false);
		}

		Varps.method6320();
		ParamComposition.addNpcsToScene(true);
		int var4 = Players.Players_count;
		int[] var5 = Players.Players_indices;

		int var6;
		for (var6 = 0; var6 < var4; ++var6) {
			if (var5[var6] != Client.combatTargetPlayerIndex && var5[var6] != Client.localPlayerIndex) {
				class141.addPlayerToScene(Client.players[var5[var6]], true);
			}
		}

		ParamComposition.addNpcsToScene(false);
		GrandExchangeOfferNameComparator.method7181();

		for (GraphicsObject var20 = (GraphicsObject)Client.graphicsObjects.last(); var20 != null; var20 = (GraphicsObject)Client.graphicsObjects.previous()) {
			if (var20.plane == SecureUrlRequester.Client_plane && !var20.isFinished) {
				if (Client.cycle >= var20.cycleStart) {
					var20.advance(Client.graphicsCycle);
					if (var20.isFinished) {
						var20.remove();
					} else {
						GrandExchangeOfferOwnWorldComparator.scene.drawEntity(var20.plane, var20.x, var20.y, var20.z, 60, var20, 0, -1L, false);
					}
				}
			} else {
				var20.remove();
			}
		}

		VarbitComposition.setViewportShape(var0, var1, var2, var3, true);
		var0 = Client.viewportOffsetX;
		var1 = Client.viewportOffsetY;
		var2 = Client.viewportWidth;
		var3 = Client.viewportHeight;
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
		Rasterizer3D.resetRasterClipping();
		Rasterizer2D.method9750();
		var4 = Client.camAngleX;
		if (Client.field600 / 256 > var4) {
			var4 = Client.field600 / 256;
		}

		if (Client.field767[4] && Client.field769[4] + 128 > var4) {
			var4 = Client.field769[4] + 128;
		}

		int var21 = Client.camAngleY & 2047;
		var6 = class367.oculusOrbFocalPointX;
		int var7 = WorldMapArea.field2516;
		int var8 = WorldMapCacheName.oculusOrbFocalPointY;
		int var9 = var4 * 3 + 600;
		int var10 = class157.method3437(var9, var3);
		int var11 = 2048 - var4 & 2047;
		int var12 = 2048 - var21 & 2047;
		int var13 = 0;
		int var14 = 0;
		int var15 = var10;
		int var16;
		int var17;
		int var18;
		if (var11 != 0) {
			var16 = Rasterizer3D.Rasterizer3D_sine[var11];
			var17 = Rasterizer3D.Rasterizer3D_cosine[var11];
			var18 = var17 * var14 - var10 * var16 >> 16;
			var15 = var16 * var14 + var10 * var17 >> 16;
			var14 = var18;
		}

		if (var12 != 0) {
			var16 = Rasterizer3D.Rasterizer3D_sine[var12];
			var17 = Rasterizer3D.Rasterizer3D_cosine[var12];
			var18 = var13 * var17 + var15 * var16 >> 16;
			var15 = var17 * var15 - var13 * var16 >> 16;
			var13 = var18;
		}

		if (Client.isCameraLocked) {
			class518.field5105 = var6 - var13;
			Huffman.field3870 = var7 - var14;
			class53.field367 = var8 - var15;
			SecureRandomCallable.field1027 = var4;
			WorldMapLabelSize.field2487 = var21;
		} else {
			cameraX = var6 - var13;
			class28.cameraY = var7 - var14;
			GrandExchangeOfferTotalQuantityComparator.cameraZ = var8 - var15;
			UserComparator3.cameraPitch = var4;
			HealthBarUpdate.cameraYaw = var21;
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (class367.oculusOrbFocalPointX >> 7 != KeyHandler.localPlayer.x >> 7 || WorldMapCacheName.oculusOrbFocalPointY >> 7 != KeyHandler.localPlayer.y >> 7)) {
			var16 = KeyHandler.localPlayer.plane;
			var17 = HealthBarDefinition.baseX * 64 + (class367.oculusOrbFocalPointX >> 7);
			var18 = WorldMapScaleHandler.baseY * 64 + (WorldMapCacheName.oculusOrbFocalPointY >> 7);
			class4.method17(var17, var18, var16, true);
		}

		if (!Client.isCameraLocked) {
			var11 = class281.method5633();
		} else {
			var11 = class233.method4588();
		}

		var12 = cameraX;
		var13 = class28.cameraY;
		var14 = GrandExchangeOfferTotalQuantityComparator.cameraZ;
		var15 = UserComparator3.cameraPitch;
		var16 = HealthBarUpdate.cameraYaw;

		for (var17 = 0; var17 < 5; ++var17) {
			if (Client.field767[var17]) {
				var18 = (int)(Math.random() * (double)(Client.field722[var17] * 2 + 1) - (double)Client.field722[var17] + Math.sin((double)Client.field775[var17] * ((double)Client.field788[var17] / 100.0D)) * (double)Client.field769[var17]);
				if (var17 == 0) {
					cameraX += var18;
				}

				if (var17 == 1) {
					class28.cameraY += var18;
				}

				if (var17 == 2) {
					GrandExchangeOfferTotalQuantityComparator.cameraZ += var18;
				}

				if (var17 == 3) {
					HealthBarUpdate.cameraYaw = var18 + HealthBarUpdate.cameraYaw & 2047;
				}

				if (var17 == 4) {
					UserComparator3.cameraPitch += var18;
					if (UserComparator3.cameraPitch < 128) {
						UserComparator3.cameraPitch = 128;
					}

					if (UserComparator3.cameraPitch > 383) {
						UserComparator3.cameraPitch = 383;
					}
				}
			}
		}

		var17 = MouseHandler.MouseHandler_x;
		var18 = MouseHandler.MouseHandler_y;
		if (MouseHandler.MouseHandler_lastButton != 0) {
			var17 = MouseHandler.MouseHandler_lastPressedX;
			var18 = MouseHandler.MouseHandler_lastPressedY;
		}

		if (var17 >= var0 && var17 < var0 + var2 && var18 >= var1 && var18 < var3 + var1) {
			Login.method2209(var17 - var0, var18 - var1);
		} else {
			ViewportMouse.ViewportMouse_isInViewport = false;
			ViewportMouse.ViewportMouse_entityCount = 0;
		}

		WorldMapRectangle.method5020();
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
		WorldMapRectangle.method5020();
		int var19 = Rasterizer3D.get3dZoom();
		Rasterizer3D.method5247(VertexNormal.client.field203);
		Rasterizer3D.clips.field3092 = Client.viewportZoom;
		GrandExchangeOfferOwnWorldComparator.scene.draw(cameraX, class28.cameraY, GrandExchangeOfferTotalQuantityComparator.cameraZ, UserComparator3.cameraPitch, HealthBarUpdate.cameraYaw, var11);
		Rasterizer3D.method5247(false);
		if (Client.z) {
			Rasterizer2D.method9731();
		}

		Rasterizer3D.clips.field3092 = var19;
		WorldMapRectangle.method5020();
		GrandExchangeOfferOwnWorldComparator.scene.clearTempGameObjects();
		class102.method2732(var0, var1, var2, var3);
		ScriptEvent.method2366(var0, var1);
		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).animate(Client.graphicsCycle);
		class165.method3516(var0, var1, var2, var3);
		cameraX = var12;
		class28.cameraY = var13;
		GrandExchangeOfferTotalQuantityComparator.cameraZ = var14;
		UserComparator3.cameraPitch = var15;
		HealthBarUpdate.cameraYaw = var16;
		if (Client.isLoading && UrlRequester.field1418.method7146(true, false) == 0) {
			Client.isLoading = false;
		}

		if (Client.isLoading) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
			StructComposition.drawLoadingMessage("Loading - please wait.", false);
		}

	}
}
