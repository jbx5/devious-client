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

@ObfuscatedName("bm")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lbm;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1030879875
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = 4154635624523065629L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("ar")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 404041363
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1053088427
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1604735757
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("aj")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("ax")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1040296459
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -69598155
	)
	static int field204;
	@ObfuscatedName("bf")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	@Export("keyHandler")
	static KeyHandler keyHandler;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		longValue = 4900805455295024601L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		longValue = 5008773661019073185L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("bj")
	static String field217;
	@ObfuscatedName("iu")
	@ObfuscatedGetter(
		intValue = 460864585
	)
	@Export("baseY")
	static int baseY;
	@ObfuscatedName("as")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1694090239
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 509706793
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -581201843
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 69063545
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2093556135
	)
	int field196;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1429046051
	)
	int field197;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1405902403
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1654560907
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("bu")
	protected boolean field200;
	@ObfuscatedName("bi")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("bq")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("ba")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("bm")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("bw")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		longValue = -8074499702448681273L
	)
	volatile long field207;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lae;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("br")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("bp")
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
		field204 = 500;
		volatileFocus = true;
		keyHandler = new KeyHandler();
		garbageCollectorLastCollectionTime = -1L;
		garbageCollectorLastCheckTimeMs = -1L;
	}

	protected GameEngine() {
		this.hasErrored = false;
		this.canvasX = 0;
		this.canvasY = 0;
		this.field200 = false;
		this.fullRedraw = true;
		this.resizeCanvasNextFrame = false;
		this.isCanvasInvalid = false;
		this.field207 = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}

		this.eventQueue = var1;
		DevicePcmPlayerProvider var2 = new DevicePcmPlayerProvider();
		class33.pcmPlayerProvider = var2;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-40"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) {
			this.method477();
		}

		this.maxCanvasWidth = var1;
		this.maxCanvasHeight = var2;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)V",
		garbageValue = "-2145759514"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) {
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
				LoginPacket.method3209(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lij;",
		garbageValue = "1661871348"
	)
	@Export("mouseWheel")
	protected MouseWheel mouseWheel() {
		if (this.mouseWheelHandler == null) {
			this.mouseWheelHandler = new MouseWheelHandler();
			this.mouseWheelHandler.addTo(this.canvas);
		}

		return this.mouseWheelHandler;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2103494171"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-353573425"
	)
	protected void method463(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "1014258040"
	)
	public Clipboard method460() {
		return this.clipboard;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "7"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		if (GrandExchangeOfferUnitPriceComparator.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
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

		keyHandler.method324(this.canvas);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1854256150"
	)
	protected final void method532() {
		keyHandler.method326();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lbi;II)V",
		garbageValue = "-921277827"
	)
	protected void method546(class29 var1, int var2) {
		keyHandler.method337(var1, var2);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "838367065"
	)
	@Export("setUpMouse")
	protected final void setUpMouse() {
		java.awt.Canvas var1 = this.canvas;
		var1.addMouseListener(MouseHandler.MouseHandler_instance);
		var1.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var1.addFocusListener(MouseHandler.MouseHandler_instance);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "992035908"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container();
		if (var1 != null) {
			Bounds var2 = this.getFrameContentBounds();
			this.contentWidth = Math.max(var2.highX, this.field196);
			this.contentHeight = Math.max(var2.highY, this.field197);
			if (this.contentWidth <= 0) {
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) {
				this.contentHeight = 1;
			}

			canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
			WorldMapArea.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
			this.canvasX = (this.contentWidth - canvasWidth) / 2;
			this.canvasY = 0;
			this.canvas.setSize(canvasWidth, WorldMapArea.canvasHeight);
			UserComparator8.rasterProvider = new RasterProvider(canvasWidth, WorldMapArea.canvasHeight, this.canvas, this.field200);
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1061077058"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX;
		int var2 = this.canvasY;
		int var3 = this.contentWidth - canvasWidth - var1;
		int var4 = this.contentHeight - WorldMapArea.canvasHeight - var2;
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
		garbageValue = "401957892"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		keyHandler.method325(this.canvas);
		java.awt.Canvas var1 = this.canvas;
		var1.removeMouseListener(MouseHandler.MouseHandler_instance);
		var1.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
		var1.removeFocusListener(MouseHandler.MouseHandler_instance);
		MouseHandler.MouseHandler_currentButtonVolatile = 0;
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.method274(this.canvas);
		}

		this.addCanvas();
		keyHandler.method324(this.canvas);
		java.awt.Canvas var2 = this.canvas;
		var2.addMouseListener(MouseHandler.MouseHandler_instance);
		var2.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var2.addFocusListener(MouseHandler.MouseHandler_instance);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method477();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "45"
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
			canvasWidth = var1;
			WorldMapArea.canvasHeight = var2;
			RunException.RunException_revision = var3;
			RunException.field5366 = var4;
			RunException.RunException_applet = this;
			if (taskHandler == null) {
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1);
		} catch (Exception var6) {
			class315.RunException_sendStackTrace((String)null, var6);
			this.error("crash");
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1505171167"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container();
		if (this.canvas != null) {
			this.canvas.removeFocusListener(this);
			var1.remove(this.canvas);
		}

		canvasWidth = Math.max(var1.getWidth(), this.field196);
		WorldMapArea.canvasHeight = Math.max(var1.getHeight(), this.field197);
		Insets var2;
		if (this.frame != null) {
			var2 = this.frame.getInsets();
			canvasWidth -= var2.left + var2.right;
			WorldMapArea.canvasHeight -= var2.bottom + var2.top;
		}

		this.canvas = new Canvas(this);
		var1.setBackground(Color.BLACK);
		var1.setLayout((LayoutManager)null);
		var1.add(this.canvas);
		this.canvas.setSize(canvasWidth, WorldMapArea.canvasHeight);
		this.canvas.setVisible(true);
		this.canvas.setBackground(Color.BLACK);
		if (var1 == this.frame) {
			var2 = this.frame.getInsets();
			this.canvas.setLocation(var2.left + this.canvasX, var2.top + this.canvasY);
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY);
		}

		this.canvas.addFocusListener(this);
		this.canvas.requestFocus();
		this.fullRedraw = true;
		if (UserComparator8.rasterProvider != null && canvasWidth == UserComparator8.rasterProvider.width && WorldMapArea.canvasHeight == UserComparator8.rasterProvider.height) {
			((RasterProvider)UserComparator8.rasterProvider).setComponent(this.canvas);
			UserComparator8.rasterProvider.drawFull(0, 0);
		} else {
			UserComparator8.rasterProvider = new RasterProvider(canvasWidth, WorldMapArea.canvasHeight, this.canvas, this.field200);
		}

		this.isCanvasInvalid = false;
		this.field207 = SecureRandomCallable.method2320();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "46"
	)
	protected void method471(boolean var1) {
		if (this.field200 != var1) {
			this.field200 = var1;
			UserComparator8.rasterProvider.method9862(var1);
			UserComparator8.rasterProvider.apply();
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "58840363"
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2143175618"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = SecureRandomCallable.method2320();
		long var3 = clientTickTimes[class307.field3167];
		clientTickTimes[class307.field3167] = var1;
		class307.field3167 = class307.field3167 + 1 & 31;
		if (0L != var3 && var1 > var3) {
		}

		synchronized(this) {
			FadeOutTask.hasFocus = volatileFocus;
		}

		this.doCycle();
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "482887882"
	)
	protected final void method490() {
		this.fullRedraw = true;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "775683249"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container();
		long var2 = SecureRandomCallable.method2320();
		long var4 = graphicsTickTimes[class164.field1796];
		graphicsTickTimes[class164.field1796] = var2;
		class164.field1796 = class164.field1796 + 1 & 31;
		if (var4 != 0L && var2 > var4) {
			int var6 = (int)(var2 - var4);
			fps = ((var6 >> 1) + 32000) / var6;
		}

		if (++field204 - 1 > 50) {
			field204 -= 50;
			this.fullRedraw = true;
			this.canvas.setSize(canvasWidth, WorldMapArea.canvasHeight);
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

		this.method476();
		this.draw(this.fullRedraw);
		if (this.fullRedraw) {
			this.clearBackground();
		}

		this.fullRedraw = false;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "272772014"
	)
	final void method476() {
		Bounds var1 = this.getFrameContentBounds();
		if (var1.highX != this.contentWidth || this.contentHeight != var1.highY || this.resizeCanvasNextFrame) {
			this.resizeCanvas();
			this.resizeCanvasNextFrame = false;
		}

	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2066415217"
	)
	final void method477() {
		this.resizeCanvasNextFrame = true;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-112"
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

			this.vmethod1380();
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-946246730"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "156558232"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1901702854"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1161058155"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZZI)V",
		garbageValue = "1742357288"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3, boolean var4) {
		try {
			Graphics var5 = this.canvas.getGraphics();
			if (class391.fontHelvetica13 == null) {
				class391.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
				Huffman.loginScreenFontMetrics = this.canvas.getFontMetrics(class391.fontHelvetica13);
			}

			if (var3 && !var4) {
				var5.setColor(Color.black);
				var5.fillRect(0, 0, canvasWidth, WorldMapArea.canvasHeight);
			}

			Color var6 = new Color(140, 17, 17);

			try {
				if (SecureRandomSSLSocket.field51 == null) {
					SecureRandomSSLSocket.field51 = this.canvas.createImage(304, 34);
				}

				Graphics var7 = SecureRandomSSLSocket.field51.getGraphics();
				var7.setColor(var6);
				var7.drawRect(0, 0, 303, 33);
				var7.fillRect(2, 2, var1 * 3, 30);
				var7.setColor(Color.black);
				var7.drawRect(1, 1, 301, 31);
				var7.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
				var7.setFont(class391.fontHelvetica13);
				var7.setColor(Color.white);
				var7.drawString(var2, (304 - Huffman.loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
				var5.drawImage(SecureRandomSSLSocket.field51, canvasWidth / 2 - 152, WorldMapArea.canvasHeight / 2 + (var4 ? 50 : -18), (ImageObserver)null);
			} catch (Exception var10) {
				int var8 = canvasWidth / 2 - 152;
				int var9 = WorldMapArea.canvasHeight / 2 - 18;
				var5.setColor(var6);
				var5.drawRect(var8, var9, 303, 33);
				var5.fillRect(var8 + 2, var9 + 2, var1 * 3, 30);
				var5.setColor(Color.black);
				var5.drawRect(var8 + 1, var9 + 1, 301, 31);
				var5.fillRect(var1 * 3 + var8 + 2, var9 + 2, 300 - var1 * 3, 30);
				var5.setFont(class391.fontHelvetica13);
				var5.setColor(Color.white);
				var5.drawString(var2, var8 + (304 - Huffman.loginScreenFontMetrics.stringWidth(var2)) / 2, var9 + 22);
			}
		} catch (Exception var11) {
			this.canvas.repaint();
		}

	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	protected final void method571() {
		SecureRandomSSLSocket.field51 = null;
		class391.fontHelvetica13 = null;
		Huffman.loginScreenFontMetrics = null;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1259256402"
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

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/awt/Container;",
		garbageValue = "-30458"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this);
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)Lrc;",
		garbageValue = "1701533255"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container();
		int var2 = Math.max(var1.getWidth(), this.field196);
		int var3 = Math.max(var1.getHeight(), this.field197);
		if (this.frame != null) {
			Insets var4 = this.frame.getInsets();
			var2 -= var4.left + var4.right;
			var3 -= var4.bottom + var4.top;
		}

		return new Bounds(var2, var3);
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1688799383"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-93"
	)
	protected abstract void vmethod1380();

	public final void destroy() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = SecureRandomCallable.method2320();
			LoginPacket.method3209(5000L);
			this.kill();
		}
	}

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) {
			this.fullRedraw = true;
			if (SecureRandomCallable.method2320() - this.field207 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= canvasWidth && var2.height >= WorldMapArea.canvasHeight) {
					this.isCanvasInvalid = true;
				}
			}

		}
	}

	public final void windowDeactivated(WindowEvent var1) {
	}

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true;
		this.fullRedraw = true;
	}

	public final void windowActivated(WindowEvent var1) {
	}

	public final void start() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = 0L;
		}
	}

	public final void windowClosed(WindowEvent var1) {
	}

	public final void windowClosing(WindowEvent var1) {
		this.destroy();
	}

	public final void windowIconified(WindowEvent var1) {
	}

	public final void windowOpened(WindowEvent var1) {
	}

	public abstract void init();

	public final void windowDeiconified(WindowEvent var1) {
	}

	public void run() {
		try {
			if (GrandExchangeOfferUnitPriceComparator.javaVendor != null) {
				String var1 = GrandExchangeOfferUnitPriceComparator.javaVendor.toLowerCase();
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
					String var2 = TaskHandler.javaVersion;
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
						this.error("wrongjava");
						return;
					}

					if (var2.startsWith("1.6.0_")) {
						int var3;
						for (var3 = 6; var3 < var2.length() && class237.isDigit(var2.charAt(var3)); ++var3) {
						}

						String var4 = var2.substring(6, var3);
						if (BoundaryObject.isNumber(var4) && class129.method3066(var4) < 10) {
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
			SecureRandomSSLSocket.clock = JagexCache.method4223();

			while (stopTimeMs == 0L || SecureRandomCallable.method2320() < stopTimeMs) {
				class496.gameCyclesToDo = SecureRandomSSLSocket.clock.wait(cycleDurationMillis, fiveOrOne);

				for (int var5 = 0; var5 < class496.gameCyclesToDo; ++var5) {
					this.clientTick();
				}

				this.graphicsTick();
				this.post(this.canvas);
			}
		} catch (Exception var6) {
			class315.RunException_sendStackTrace((String)null, var6);
			this.error("crash");
		}

		this.kill();
	}

	public final void stop() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = SecureRandomCallable.method2320() + 4000L;
		}
	}

	public final void update(Graphics var1) {
		this.paint(var1);
	}

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "89"
	)
	static void method605() {
		Tiles.Tiles_minPlane = 99;
		GrandExchangeOfferAgeComparator.Tiles_underlays = new short[4][104][104];
		TriBool.Tiles_overlays = new short[4][104][104];
		class173.Tiles_shapes = new byte[4][104][104];
		class350.field3876 = new byte[4][104][104];
		Tiles.field1050 = new int[4][105][105];
		class151.Tiles_underlays2 = new byte[4][105][105];
		Tiles.field1049 = new int[105][105];
		Huffman.Tiles_hue = new int[104];
		MilliClock.Tiles_saturation = new int[104];
		ApproximateRouteStrategy.Tiles_lightness = new int[104];
		class182.Tiles_hueMultiplier = new int[104];
		class324.field3538 = new int[104];
	}
}
