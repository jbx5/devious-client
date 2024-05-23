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

@ObfuscatedName("be")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lbe;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1393456911
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = 1448799417003195815L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("af")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1073455795
	)
	@Export("cycleDurationMillis")
	protected static int cycleDurationMillis;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1811646451
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1402420609
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("aq")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("ae")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1021134085
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -905930227
	)
	static int field207;
	@ObfuscatedName("bv")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	@Export("keyHandler")
	protected static KeyHandler keyHandler;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		longValue = -6861134775927392281L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		longValue = 4326120599686759935L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("aa")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 2090662151
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1671521701
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1128817635
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1087269597
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1017730077
	)
	int field199;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -2050213627
	)
	int field182;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 276791875
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1099229863
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("bo")
	protected boolean field203;
	@ObfuscatedName("bt")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("bn")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("bw")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("bg")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("bu")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		longValue = -3700765858830725843L
	)
	volatile long field200;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("bx")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("bd")
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
		field207 = 500;
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
		this.field200 = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}

		this.eventQueue = var1;
		class188.method3767(new DevicePcmPlayerProvider());
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1862509995"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) {
			this.method560();
		}

		this.maxCanvasWidth = var1;
		this.maxCanvasHeight = var2;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;B)V",
		garbageValue = "-73"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) {
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
				class484.method8889(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lgq;",
		garbageValue = "-965805440"
	)
	@Export("mouseWheel")
	protected MouseWheel mouseWheel() {
		if (this.mouseWheelHandler == null) {
			this.mouseWheelHandler = new MouseWheelHandler();
			this.mouseWheelHandler.addTo(this.canvas);
		}

		return this.mouseWheelHandler;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1517595793"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "14254"
	)
	protected void method481(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "25"
	)
	protected Clipboard method482() {
		return this.clipboard;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1337777904"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		class111.method2804();
		keyHandler.method343(this.canvas);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	protected final void method484() {
		keyHandler.method358();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lbi;II)V",
		garbageValue = "2051198909"
	)
	protected void method485(class29 var1, int var2) {
		keyHandler.method339(var1, var2);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1582901659"
	)
	@Export("setUpMouse")
	protected final void setUpMouse() {
		java.awt.Canvas var1 = this.canvas;
		var1.addMouseListener(MouseHandler.MouseHandler_instance);
		var1.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var1.addFocusListener(MouseHandler.MouseHandler_instance);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-170106580"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container();
		if (var1 != null) {
			Bounds var2 = this.getFrameContentBounds();
			this.contentWidth = Math.max(var2.highX, this.field199);
			this.contentHeight = Math.max(var2.highY, this.field182);
			if (this.contentWidth <= 0) {
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) {
				this.contentHeight = 1;
			}

			canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
			DbTable.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
			this.canvasX = (this.contentWidth - canvasWidth) / 2;
			this.canvasY = 0;
			this.canvas.setSize(canvasWidth, DbTable.canvasHeight);
			WorldMapSprite.rasterProvider = new RasterProvider(canvasWidth, DbTable.canvasHeight, this.canvas, this.field203);
			if (var1 == this.frame) {
				Insets var3 = this.frame.getInsets();
				this.canvas.setLocation(var3.left + this.canvasX, var3.top + this.canvasY);
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY);
			}

			this.fullRedraw = true;
			this.resizeGame();
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1709856685"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "394850457"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX;
		int var2 = this.canvasY;
		int var3 = this.contentWidth - canvasWidth - var1;
		int var4 = this.contentHeight - DbTable.canvasHeight - var2;
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2137132035"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		keyHandler.method348(this.canvas);
		RouteStrategy.method4501(this.canvas);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.method282(this.canvas);
		}

		this.addCanvas();
		keyHandler.method343(this.canvas);
		java.awt.Canvas var1 = this.canvas;
		var1.addMouseListener(MouseHandler.MouseHandler_instance);
		var1.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var1.addFocusListener(MouseHandler.MouseHandler_instance);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method560();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1549022180"
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
			DbTable.canvasHeight = var2;
			class534.RunException_revision = var3;
			RunException.field5495 = var4;
			RunException.RunException_applet = this;
			if (taskHandler == null) {
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1);
		} catch (Exception var6) {
			BufferedSink.RunException_sendStackTrace((String)null, var6);
			this.error("crash");
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1573344521"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container();
		if (this.canvas != null) {
			this.canvas.removeFocusListener(this);
			var1.remove(this.canvas);
		}

		canvasWidth = Math.max(var1.getWidth(), this.field199);
		DbTable.canvasHeight = Math.max(var1.getHeight(), this.field182);
		Insets var2;
		if (this.frame != null) {
			var2 = this.frame.getInsets();
			canvasWidth -= var2.right + var2.left;
			DbTable.canvasHeight -= var2.bottom + var2.top;
		}

		this.canvas = new Canvas(this);
		var1.setBackground(Color.BLACK);
		var1.setLayout((LayoutManager)null);
		var1.add(this.canvas);
		this.canvas.setSize(canvasWidth, DbTable.canvasHeight);
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
		if (WorldMapSprite.rasterProvider != null && canvasWidth == WorldMapSprite.rasterProvider.width && DbTable.canvasHeight == WorldMapSprite.rasterProvider.height) {
			((RasterProvider)WorldMapSprite.rasterProvider).setComponent(this.canvas);
			WorldMapSprite.rasterProvider.drawFull(0, 0);
		} else {
			WorldMapSprite.rasterProvider = new RasterProvider(canvasWidth, DbTable.canvasHeight, this.canvas, this.field203);
		}

		this.isCanvasInvalid = false;
		this.field200 = class129.method3033();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1527360305"
	)
	protected void method492(boolean var1) {
		if (this.field203 != var1) {
			this.field203 = var1;
			WorldMapSprite.rasterProvider.method10058(var1);
			WorldMapSprite.rasterProvider.apply();
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1767541996"
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-121"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = class129.method3033();
		long var3 = clientTickTimes[class11.field55];
		clientTickTimes[class11.field55] = var1;
		class11.field55 = class11.field55 + 1 & 31;
		if (var3 != 0L && var1 > var3) {
		}

		synchronized(this) {
			HttpAuthenticationHeader.hasFocus = volatileFocus;
		}

		this.doCycle();
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1953264378"
	)
	protected final void method495() {
		this.fullRedraw = true;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-301825502"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container();
		long var2 = class129.method3033();
		long var4 = graphicsTickTimes[GrandExchangeOffer.field4575];
		graphicsTickTimes[GrandExchangeOffer.field4575] = var2;
		GrandExchangeOffer.field4575 = GrandExchangeOffer.field4575 + 1 & 31;
		if (0L != var4 && var2 > var4) {
			int var6 = (int)(var2 - var4);
			fps = ((var6 >> 1) + 32000) / var6;
		}

		if (++field207 - 1 > 50) {
			field207 -= 50;
			this.fullRedraw = true;
			this.canvas.setSize(canvasWidth, DbTable.canvasHeight);
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

		this.method512();
		this.draw(this.fullRedraw);
		if (this.fullRedraw) {
			this.clearBackground();
		}

		this.fullRedraw = false;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "29"
	)
	final void method512() {
		Bounds var1 = this.getFrameContentBounds();
		if (this.contentWidth != var1.highX || var1.highY != this.contentHeight || this.resizeCanvasNextFrame) {
			this.resizeCanvas();
			this.resizeCanvasNextFrame = false;
		}

	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	final void method560() {
		this.resizeCanvasNextFrame = true;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1177884939"
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

			this.vmethod1228();
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-31560"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1374452311"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1556603630"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZZB)V",
		garbageValue = "82"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3, boolean var4) {
		try {
			Graphics var5 = this.canvas.getGraphics();
			if (DevicePcmPlayerProvider.fontHelvetica13 == null) {
				DevicePcmPlayerProvider.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
				WorldMapIcon_0.loginScreenFontMetrics = this.canvas.getFontMetrics(DevicePcmPlayerProvider.fontHelvetica13);
			}

			if (var3 && !var4) {
				var5.setColor(Color.black);
				var5.fillRect(0, 0, canvasWidth, DbTable.canvasHeight);
			}

			Color var6 = new Color(140, 17, 17);

			try {
				if (HttpRequest.field53 == null) {
					HttpRequest.field53 = this.canvas.createImage(304, 34);
				}

				Graphics var7 = HttpRequest.field53.getGraphics();
				var7.setColor(var6);
				var7.drawRect(0, 0, 303, 33);
				var7.fillRect(2, 2, var1 * 3, 30);
				var7.setColor(Color.black);
				var7.drawRect(1, 1, 301, 31);
				var7.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
				var7.setFont(DevicePcmPlayerProvider.fontHelvetica13);
				var7.setColor(Color.white);
				var7.drawString(var2, (304 - WorldMapIcon_0.loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
				var5.drawImage(HttpRequest.field53, canvasWidth / 2 - 152, DbTable.canvasHeight / 2 + (var4 ? 50 : -18), (ImageObserver)null);
			} catch (Exception var10) {
				int var8 = canvasWidth / 2 - 152;
				int var9 = DbTable.canvasHeight / 2 - 18;
				var5.setColor(var6);
				var5.drawRect(var8, var9, 303, 33);
				var5.fillRect(var8 + 2, var9 + 2, var1 * 3, 30);
				var5.setColor(Color.black);
				var5.drawRect(var8 + 1, var9 + 1, 301, 31);
				var5.fillRect(var1 * 3 + var8 + 2, var9 + 2, 300 - var1 * 3, 30);
				var5.setFont(DevicePcmPlayerProvider.fontHelvetica13);
				var5.setColor(Color.white);
				var5.drawString(var2, var8 + (304 - WorldMapIcon_0.loginScreenFontMetrics.stringWidth(var2)) / 2, var9 + 22);
			}
		} catch (Exception var11) {
			this.canvas.repaint();
		}

	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1181415609"
	)
	protected final void method624() {
		HttpRequest.field53 = null;
		DevicePcmPlayerProvider.fontHelvetica13 = null;
		WorldMapIcon_0.loginScreenFontMetrics = null;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1437527258"
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
		descriptor = "(B)Ljava/awt/Container;",
		garbageValue = "-84"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this);
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)Lqi;",
		garbageValue = "-360230326"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container();
		int var2 = Math.max(var1.getWidth(), this.field199);
		int var3 = Math.max(var1.getHeight(), this.field182);
		if (this.frame != null) {
			Insets var4 = this.frame.getInsets();
			var2 -= var4.right + var4.left;
			var3 -= var4.top + var4.bottom;
		}

		return new Bounds(var2, var3);
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "24981535"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "264023387"
	)
	protected abstract void vmethod1228();

	public final void destroy() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = class129.method3033();
			class484.method8889(5000L);
			this.kill();
		}
	}

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) {
			this.fullRedraw = true;
			if (class129.method3033() - this.field200 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= canvasWidth && var2.height >= DbTable.canvasHeight) {
					this.isCanvasInvalid = true;
				}
			}

		}
	}

	public abstract void init();

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
						for (var3 = 6; var3 < var2.length() && class6.isDigit(var2.charAt(var3)); ++var3) {
						}

						String var4 = var2.substring(6, var3);
						if (class206.isNumber(var4) && class177.method3601(var4) < 10) {
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

			class557.clock = (Clock)var8;

			while (stopTimeMs == 0L || class129.method3033() < stopTimeMs) {
				AbstractSocket.gameCyclesToDo = class557.clock.wait(cycleDurationMillis, fiveOrOne);

				for (int var5 = 0; var5 < AbstractSocket.gameCyclesToDo; ++var5) {
					this.clientTick();
				}

				this.graphicsTick();
				this.post(this.canvas);
			}
		} catch (Exception var7) {
			BufferedSink.RunException_sendStackTrace((String)null, var7);
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

	public final void windowActivated(WindowEvent var1) {
	}

	public final void windowDeactivated(WindowEvent var1) {
	}

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true;
		this.fullRedraw = true;
	}

	public final void windowIconified(WindowEvent var1) {
	}

	public final void windowOpened(WindowEvent var1) {
	}

	public final void windowClosing(WindowEvent var1) {
		this.destroy();
	}

	public final void windowClosed(WindowEvent var1) {
	}

	public final void windowDeiconified(WindowEvent var1) {
	}

	public final void stop() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = class129.method3033() + 4000L;
		}
	}
}
