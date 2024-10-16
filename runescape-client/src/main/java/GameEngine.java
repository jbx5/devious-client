import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
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

@ObfuscatedName("bz")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lbz;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1224509245
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = 6778075864510125419L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("ai")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 730077689
	)
	@Export("cycleDurationMillis")
	protected static int cycleDurationMillis;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1396658805
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -677165825
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	@Export("clock")
	static Clock clock;
	@ObfuscatedName("ao")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("ar")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("bp")
	static Image field180;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1644169783
	)
	static int field161;
	@ObfuscatedName("bo")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lah;"
	)
	@Export("keyHandler")
	protected static KeyHandler keyHandler;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		longValue = 570468221949809407L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		longValue = 596686757248778477L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("gb")
	@ObfuscatedGetter(
		intValue = 2001490639
	)
	@Export("worldPort")
	static int worldPort;
	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "Lcz;"
	)
	@Export("entity")
	static Entity entity;
	@ObfuscatedName("ay")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -28526951
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -2081679351
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 559571575
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 14626319
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 2023971881
	)
	int field172;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1594221307
	)
	int field189;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 693217755
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 35839199
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("bj")
	protected boolean field176;
	@ObfuscatedName("bk")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("bb")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("bq")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("bc")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("by")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		longValue = -1204627423140406151L
	)
	volatile long field173;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("bs")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("bm")
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
		field161 = 500;
		volatileFocus = true;
		keyHandler = new KeyHandler();
		garbageCollectorLastCollectionTime = -1L;
		garbageCollectorLastCheckTimeMs = -1L;
	}

	protected GameEngine() {
		this.hasErrored = false;
		this.canvasX = 0;
		this.canvasY = 0;
		this.field176 = false;
		this.fullRedraw = true;
		this.resizeCanvasNextFrame = false;
		this.isCanvasInvalid = false;
		this.field173 = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}

		this.eventQueue = var1;
		DevicePcmPlayerProvider var2 = new DevicePcmPlayerProvider();
		PcmPlayer.pcmPlayerProvider = var2;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1758246031"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) {
			this.method582();
		}

		this.maxCanvasWidth = var1;
		this.maxCanvasHeight = var2;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)V",
		garbageValue = "-782585259"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) {
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
				World.method2001(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Liv;",
		garbageValue = "314694004"
	)
	@Export("mouseWheel")
	protected MouseWheel mouseWheel() {
		if (this.mouseWheelHandler == null) {
			this.mouseWheelHandler = new MouseWheelHandler();
			this.mouseWheelHandler.addTo(this.canvas);
		}

		return this.mouseWheelHandler;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-69"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-738576877"
	)
	protected void method497(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "1"
	)
	protected Clipboard method498() {
		return this.clipboard;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1809759562"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
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

		keyHandler.method374(this.canvas);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1545065413"
	)
	protected final void method500() {
		keyHandler.method375();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lbx;II)V",
		garbageValue = "-547914991"
	)
	protected void method575(class29 var1, int var2) {
		keyHandler.method354(var1, var2);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1092527323"
	)
	@Export("setUpMouse")
	protected final void setUpMouse() {
		java.awt.Canvas var1 = this.canvas;
		var1.addMouseListener(MouseHandler.MouseHandler_instance);
		var1.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var1.addFocusListener(MouseHandler.MouseHandler_instance);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1988623681"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container();
		if (var1 != null) {
			Bounds var2 = this.getFrameContentBounds();
			this.contentWidth = Math.max(var2.highX, this.field172);
			this.contentHeight = Math.max(var2.highY, this.field189);
			if (this.contentWidth <= 0) {
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) {
				this.contentHeight = 1;
			}

			HttpRequestTask.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
			class268.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
			this.canvasX = (this.contentWidth - HttpRequestTask.canvasWidth) / 2;
			this.canvasY = 0;
			this.canvas.setSize(HttpRequestTask.canvasWidth, class268.canvasHeight);
			class213.rasterProvider = new RasterProvider(HttpRequestTask.canvasWidth, class268.canvasHeight, this.canvas, this.field176);
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-586512412"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2058827014"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX;
		int var2 = this.canvasY;
		int var3 = this.contentWidth - HttpRequestTask.canvasWidth - var1;
		int var4 = this.contentHeight - class268.canvasHeight - var2;
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-668985647"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		keyHandler.method357(this.canvas);
		class359.method7285(this.canvas);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.method307(this.canvas);
		}

		this.addCanvas();
		keyHandler.method374(this.canvas);
		java.awt.Canvas var1 = this.canvas;
		var1.addMouseListener(MouseHandler.MouseHandler_instance);
		var1.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var1.addFocusListener(MouseHandler.MouseHandler_instance);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method582();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1813298683"
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
			HttpRequestTask.canvasWidth = var1;
			class268.canvasHeight = var2;
			HttpJsonRequestBody.RunException_revision = var3;
			RunException.field5636 = var4;
			RunException.RunException_applet = this;
			if (taskHandler == null) {
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1);
		} catch (Exception var6) {
			HttpHeaders.RunException_sendStackTrace((String)null, var6);
			this.error("crash");
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-33383967"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container();
		if (this.canvas != null) {
			this.canvas.removeFocusListener(this);
			var1.remove(this.canvas);
		}

		HttpRequestTask.canvasWidth = Math.max(var1.getWidth(), this.field172);
		class268.canvasHeight = Math.max(var1.getHeight(), this.field189);
		Insets var2;
		if (this.frame != null) {
			var2 = this.frame.getInsets();
			HttpRequestTask.canvasWidth -= var2.left + var2.right;
			class268.canvasHeight -= var2.top + var2.bottom;
		}

		this.canvas = new Canvas(this);
		var1.setBackground(Color.BLACK);
		var1.setLayout((LayoutManager)null);
		var1.add(this.canvas);
		this.canvas.setSize(HttpRequestTask.canvasWidth, class268.canvasHeight);
		this.canvas.setVisible(true);
		this.canvas.setBackground(Color.BLACK);
		if (var1 == this.frame) {
			var2 = this.frame.getInsets();
			this.canvas.setLocation(var2.left + this.canvasX, this.canvasY + var2.top);
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY);
		}

		this.canvas.addFocusListener(this);
		this.canvas.requestFocus();
		this.fullRedraw = true;
		if (class213.rasterProvider != null && HttpRequestTask.canvasWidth == class213.rasterProvider.width && class268.canvasHeight == class213.rasterProvider.height) {
			((RasterProvider)class213.rasterProvider).setComponent(this.canvas);
			class213.rasterProvider.drawFull(0, 0);
		} else {
			class213.rasterProvider = new RasterProvider(HttpRequestTask.canvasWidth, class268.canvasHeight, this.canvas, this.field176);
		}

		this.isCanvasInvalid = false;
		this.field173 = class77.method2338();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1329645785"
	)
	protected void method620(boolean var1) {
		if (this.field176 != var1) {
			this.field176 = var1;
			class213.rasterProvider.method10535(var1);
			class213.rasterProvider.apply();
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1961055520"
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-945724812"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = class77.method2338();
		long var3 = clientTickTimes[class402.field4682];
		clientTickTimes[class402.field4682] = var1;
		class402.field4682 = class402.field4682 + 1 & 31;
		if (var3 != 0L && var1 > var3) {
		}

		synchronized(this) {
			WorldMapEvent.hasFocus = volatileFocus;
		}

		this.doCycle();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "77"
	)
	protected final void method511() {
		this.fullRedraw = true;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "94"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container();
		long var2 = class77.method2338();
		long var4 = graphicsTickTimes[Sound.field1747];
		graphicsTickTimes[Sound.field1747] = var2;
		Sound.field1747 = Sound.field1747 + 1 & 31;
		if (0L != var4 && var2 > var4) {
			int var6 = (int)(var2 - var4);
			fps = ((var6 >> 1) + 32000) / var6;
		}

		if (++field161 - 1 > 50) {
			field161 -= 50;
			this.fullRedraw = true;
			this.canvas.setSize(HttpRequestTask.canvasWidth, class268.canvasHeight);
			this.canvas.setVisible(true);
			if (var1 == this.frame) {
				Insets var7 = this.frame.getInsets();
				this.canvas.setLocation(var7.left + this.canvasX, this.canvasY + var7.top);
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY);
			}
		}

		if (this.isCanvasInvalid) {
			this.replaceCanvas();
		}

		this.method549();
		this.draw(this.fullRedraw);
		if (this.fullRedraw) {
			this.clearBackground();
		}

		this.fullRedraw = false;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-126"
	)
	final void method549() {
		Bounds var1 = this.getFrameContentBounds();
		if (var1.highX != this.contentWidth || this.contentHeight != var1.highY || this.resizeCanvasNextFrame) {
			this.resizeCanvas();
			this.resizeCanvasNextFrame = false;
		}

	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-312268750"
	)
	final void method582() {
		this.resizeCanvasNextFrame = true;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1592607784"
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

			this.vmethod1299();
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "109"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-680789048"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2088333438"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1821954389"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZZB)V",
		garbageValue = "0"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3, boolean var4) {
		try {
			Graphics var5 = this.canvas.getGraphics();
			if (PlayerUpdateManager.fontHelvetica13 == null) {
				PlayerUpdateManager.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
				class110.loginScreenFontMetrics = this.canvas.getFontMetrics(PlayerUpdateManager.fontHelvetica13);
			}

			if (var3 && !var4) {
				var5.setColor(Color.black);
				var5.fillRect(0, 0, HttpRequestTask.canvasWidth, class268.canvasHeight);
			}

			Color var6 = new Color(140, 17, 17);

			try {
				if (field180 == null) {
					field180 = this.canvas.createImage(304, 34);
				}

				Graphics var7 = field180.getGraphics();
				var7.setColor(var6);
				var7.drawRect(0, 0, 303, 33);
				var7.fillRect(2, 2, var1 * 3, 30);
				var7.setColor(Color.black);
				var7.drawRect(1, 1, 301, 31);
				var7.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
				var7.setFont(PlayerUpdateManager.fontHelvetica13);
				var7.setColor(Color.white);
				var7.drawString(var2, (304 - class110.loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
				var5.drawImage(field180, HttpRequestTask.canvasWidth / 2 - 152, (var4 ? 50 : -18) + class268.canvasHeight / 2, (ImageObserver)null);
			} catch (Exception var10) {
				int var8 = HttpRequestTask.canvasWidth / 2 - 152;
				int var9 = class268.canvasHeight / 2 - 18;
				var5.setColor(var6);
				var5.drawRect(var8, var9, 303, 33);
				var5.fillRect(var8 + 2, var9 + 2, var1 * 3, 30);
				var5.setColor(Color.black);
				var5.drawRect(var8 + 1, var9 + 1, 301, 31);
				var5.fillRect(var8 + var1 * 3 + 2, var9 + 2, 300 - var1 * 3, 30);
				var5.setFont(PlayerUpdateManager.fontHelvetica13);
				var5.setColor(Color.white);
				var5.drawString(var2, var8 + (304 - class110.loginScreenFontMetrics.stringWidth(var2)) / 2, var9 + 22);
			}
		} catch (Exception var11) {
			this.canvas.repaint();
		}

	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1888899372"
	)
	protected final void method526() {
		field180 = null;
		PlayerUpdateManager.fontHelvetica13 = null;
		class110.loginScreenFontMetrics = null;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "623255149"
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

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/awt/Container;",
		garbageValue = "-101"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)Lqg;",
		garbageValue = "-1791793778"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container();
		int var2 = Math.max(var1.getWidth(), this.field172);
		int var3 = Math.max(var1.getHeight(), this.field189);
		if (this.frame != null) {
			Insets var4 = this.frame.getInsets();
			var2 -= var4.right + var4.left;
			var3 -= var4.bottom + var4.top;
		}

		return new Bounds(var2, var3);
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1601143776"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "888034615"
	)
	protected abstract void vmethod1299();

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) {
			this.fullRedraw = true;
			if (class77.method2338() - this.field173 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= HttpRequestTask.canvasWidth && var2.height >= class268.canvasHeight) {
					this.isCanvasInvalid = true;
				}
			}

		}
	}

	public final void destroy() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = class77.method2338();
			World.method2001(5000L);
			this.kill();
		}
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
						for (var3 = 6; var3 < var2.length() && SpotAnimationDefinition.isDigit(var2.charAt(var3)); ++var3) {
						}

						String var4 = var2.substring(6, var3);
						if (class298.isNumber(var4) && class27.method437(var4) < 10) {
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
			clock = LoginState.method1290();

			while (stopTimeMs == 0L || class77.method2338() < stopTimeMs) {
				AABB.gameCyclesToDo = clock.wait(cycleDurationMillis, fiveOrOne);

				for (int var5 = 0; var5 < AABB.gameCyclesToDo; ++var5) {
					this.clientTick();
				}

				this.graphicsTick();
				this.post(this.canvas);
			}
		} catch (Exception var6) {
			HttpHeaders.RunException_sendStackTrace((String)null, var6);
			this.error("crash");
		}

		this.kill();
	}

	public final void start() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = 0L;
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

	public final void windowDeactivated(WindowEvent var1) {
	}

	public final void windowIconified(WindowEvent var1) {
	}

	public final void windowOpened(WindowEvent var1) {
	}

	public final void windowActivated(WindowEvent var1) {
	}

	public final void stop() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = class77.method2338() + 4000L;
		}
	}

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true;
		this.fullRedraw = true;
	}

	public final void windowDeiconified(WindowEvent var1) {
	}

	public abstract void init();

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIS)I",
		garbageValue = "-13113"
	)
	static final int method535(int var0, int var1, int var2) {
		int var3 = var0 / var2;
		int var4 = var0 & var2 - 1;
		int var5 = var1 / var2;
		int var6 = var1 & var2 - 1;
		int var7 = FriendLoginUpdate.method8997(var3, var5);
		int var8 = FriendLoginUpdate.method8997(var3 + 1, var5);
		int var9 = FriendLoginUpdate.method8997(var3, var5 + 1);
		int var10 = FriendLoginUpdate.method8997(var3 + 1, var5 + 1);
		int var11 = class216.method4477(var7, var8, var4, var2);
		int var12 = class216.method4477(var9, var10, var4, var2);
		return class216.method4477(var11, var12, var6, var2);
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(ILnn;ZI)V",
		garbageValue = "1751156760"
	)
	static void method642(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = class160.getWorldMap().getMapArea(var0);
		int var4 = SpriteMask.localPlayer.plane;
		int var5 = (SpriteMask.localPlayer.x >> 7) + class198.topLevelWorldView.baseX;
		int var6 = (SpriteMask.localPlayer.y >> 7) + class198.topLevelWorldView.baseY;
		Coord var7 = new Coord(var4, var5, var6);
		class160.getWorldMap().method9544(var3, var7, var1, var2);
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1946591960"
	)
	static final int method644(int var0) {
		return Math.min(Math.max(var0, 128), 383);
	}
}
