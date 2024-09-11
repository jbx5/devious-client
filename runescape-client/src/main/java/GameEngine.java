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

@ObfuscatedName("ba")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lba;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1718824667
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		longValue = -6217032821805485261L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("ax")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 2004573775
	)
	@Export("gameCyclesToDo")
	static int gameCyclesToDo;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -405381583
	)
	@Export("cycleDurationMillis")
	protected static int cycleDurationMillis;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 890481351
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1600351343
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("ah")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("ab")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -266627391
	)
	static int field187;
	@ObfuscatedName("bu")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	@Export("keyHandler")
	protected static KeyHandler keyHandler;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		longValue = 3153517625685270235L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		longValue = 3270838277370336879L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("tr")
	@ObfuscatedSignature(
		descriptor = "Lbb;"
	)
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;
	@ObfuscatedName("aq")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -2068951313
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1531445857
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 942027993
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 737340793
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1419115339
	)
	int field185;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 237520649
	)
	int field164;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1034899477
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1029994813
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("bh")
	protected boolean field172;
	@ObfuscatedName("bf")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("bm")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("bs")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("bj")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("bp")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		longValue = 1106739762442726681L
	)
	volatile long field179;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("bl")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("bz")
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
		field187 = 500;
		volatileFocus = true;
		keyHandler = new KeyHandler();
		garbageCollectorLastCollectionTime = -1L;
		garbageCollectorLastCheckTimeMs = -1L;
	}

	protected GameEngine() {
		this.hasErrored = false;
		this.canvasX = 0;
		this.canvasY = 0;
		this.field172 = false;
		this.fullRedraw = true;
		this.resizeCanvasNextFrame = false;
		this.isCanvasInvalid = false;
		this.field179 = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}

		this.eventQueue = var1;
		DevicePcmPlayerProvider var2 = new DevicePcmPlayerProvider();
		PcmPlayer.pcmPlayerProvider = var2;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2124381855"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) {
			this.method599();
		}

		this.maxCanvasWidth = var1;
		this.maxCanvasHeight = var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)V",
		garbageValue = "-1502275980"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) {
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
				FileSystem.method4499(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Liw;",
		garbageValue = "-1691698710"
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
		descriptor = "(B)V",
		garbageValue = "57"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1962515902"
	)
	protected void method506(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "-1331786366"
	)
	protected Clipboard method487() {
		return this.clipboard;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "186877384"
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

		keyHandler.method365(this.canvas);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "112298089"
	)
	protected final void method489() {
		keyHandler.method342();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lbx;II)V",
		garbageValue = "-1137807239"
	)
	protected void method490(class29 var1, int var2) {
		keyHandler.method361(var1, var2);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-883910334"
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
		garbageValue = "-212787553"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container();
		if (var1 != null) {
			Bounds var2 = this.getFrameContentBounds();
			this.contentWidth = Math.max(var2.highX, this.field185);
			this.contentHeight = Math.max(var2.highY, this.field164);
			if (this.contentWidth <= 0) {
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) {
				this.contentHeight = 1;
			}

			class154.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
			UrlRequester.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
			this.canvasX = (this.contentWidth - class154.canvasWidth) / 2;
			this.canvasY = 0;
			this.canvas.setSize(class154.canvasWidth, UrlRequester.canvasHeight);
			class310.rasterProvider = new RasterProvider(class154.canvasWidth, UrlRequester.canvasHeight, this.canvas, this.field172);
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1968536005"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "106131397"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX;
		int var2 = this.canvasY;
		int var3 = this.contentWidth - class154.canvasWidth - var1;
		int var4 = this.contentHeight - UrlRequester.canvasHeight - var2;
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1735053194"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		keyHandler.method341(this.canvas);
		java.awt.Canvas var1 = this.canvas;
		var1.removeMouseListener(MouseHandler.MouseHandler_instance);
		var1.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
		var1.removeFocusListener(MouseHandler.MouseHandler_instance);
		MouseHandler.MouseHandler_currentButtonVolatile = 0;
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.method303(this.canvas);
		}

		this.addCanvas();
		keyHandler.method365(this.canvas);
		java.awt.Canvas var2 = this.canvas;
		var2.addMouseListener(MouseHandler.MouseHandler_instance);
		var2.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var2.addFocusListener(MouseHandler.MouseHandler_instance);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method599();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1962799097"
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
			class154.canvasWidth = var1;
			UrlRequester.canvasHeight = var2;
			class453.RunException_revision = var3;
			WorldMapDecoration.field3214 = var4;
			RunException.RunException_applet = this;
			if (taskHandler == null) {
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1);
		} catch (Exception var6) {
			class171.RunException_sendStackTrace((String)null, var6);
			this.error("crash");
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-390318936"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container();
		if (this.canvas != null) {
			this.canvas.removeFocusListener(this);
			var1.remove(this.canvas);
		}

		class154.canvasWidth = Math.max(var1.getWidth(), this.field185);
		UrlRequester.canvasHeight = Math.max(var1.getHeight(), this.field164);
		Insets var2;
		if (this.frame != null) {
			var2 = this.frame.getInsets();
			class154.canvasWidth -= var2.left + var2.right;
			UrlRequester.canvasHeight -= var2.bottom + var2.top;
		}

		this.canvas = new Canvas(this);
		var1.setBackground(Color.BLACK);
		var1.setLayout((LayoutManager)null);
		var1.add(this.canvas);
		this.canvas.setSize(class154.canvasWidth, UrlRequester.canvasHeight);
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
		if (class310.rasterProvider != null && class154.canvasWidth == class310.rasterProvider.width && UrlRequester.canvasHeight == class310.rasterProvider.height) {
			((RasterProvider)class310.rasterProvider).setComponent(this.canvas);
			class310.rasterProvider.drawFull(0, 0);
		} else {
			class310.rasterProvider = new RasterProvider(class154.canvasWidth, UrlRequester.canvasHeight, this.canvas, this.field172);
		}

		this.isCanvasInvalid = false;
		this.field179 = WorldMapElement.method3843();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1481748972"
	)
	protected void method497(boolean var1) {
		if (this.field172 != var1) {
			this.field172 = var1;
			class310.rasterProvider.method10340(var1);
			class310.rasterProvider.apply();
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "623364940"
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1084529758"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = WorldMapElement.method3843();
		long var3 = clientTickTimes[class360.field3813];
		clientTickTimes[class360.field3813] = var1;
		class360.field3813 = class360.field3813 + 1 & 31;
		if (0L != var3 && var1 > var3) {
		}

		synchronized(this) {
			class177.hasFocus = volatileFocus;
		}

		this.doCycle();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-36"
	)
	protected final void method507() {
		this.fullRedraw = true;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1812461338"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container();
		long var2 = WorldMapElement.method3843();
		long var4 = graphicsTickTimes[Ignored.field4993];
		graphicsTickTimes[Ignored.field4993] = var2;
		Ignored.field4993 = Ignored.field4993 + 1 & 31;
		if (0L != var4 && var2 > var4) {
			int var6 = (int)(var2 - var4);
			fps = ((var6 >> 1) + 32000) / var6;
		}

		if (++field187 - 1 > 50) {
			field187 -= 50;
			this.fullRedraw = true;
			this.canvas.setSize(class154.canvasWidth, UrlRequester.canvasHeight);
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

		this.method501();
		this.draw(this.fullRedraw);
		if (this.fullRedraw) {
			this.clearBackground();
		}

		this.fullRedraw = false;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "17"
	)
	final void method501() {
		Bounds var1 = this.getFrameContentBounds();
		if (var1.highX != this.contentWidth || var1.highY != this.contentHeight || this.resizeCanvasNextFrame) {
			this.resizeCanvas();
			this.resizeCanvasNextFrame = false;
		}

	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-37"
	)
	final void method599() {
		this.resizeCanvasNextFrame = true;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1961173819"
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

			this.vmethod1297();
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-31153294"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "124564403"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-149306215"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1112351068"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZZI)V",
		garbageValue = "-689634830"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3, boolean var4) {
		try {
			Graphics var5 = this.canvas.getGraphics();
			if (Varcs.fontHelvetica13 == null) {
				Varcs.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
				class137.loginScreenFontMetrics = this.canvas.getFontMetrics(Varcs.fontHelvetica13);
			}

			if (var3 && !var4) {
				var5.setColor(Color.black);
				var5.fillRect(0, 0, class154.canvasWidth, UrlRequester.canvasHeight);
			}

			Color var6 = new Color(140, 17, 17);

			try {
				if (class169.field1832 == null) {
					class169.field1832 = this.canvas.createImage(304, 34);
				}

				Graphics var7 = class169.field1832.getGraphics();
				var7.setColor(var6);
				var7.drawRect(0, 0, 303, 33);
				var7.fillRect(2, 2, var1 * 3, 30);
				var7.setColor(Color.black);
				var7.drawRect(1, 1, 301, 31);
				var7.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
				var7.setFont(Varcs.fontHelvetica13);
				var7.setColor(Color.white);
				var7.drawString(var2, (304 - class137.loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
				var5.drawImage(class169.field1832, class154.canvasWidth / 2 - 152, UrlRequester.canvasHeight / 2 + (var4 ? 50 : -18), (ImageObserver)null);
			} catch (Exception var10) {
				int var8 = class154.canvasWidth / 2 - 152;
				int var9 = UrlRequester.canvasHeight / 2 - 18;
				var5.setColor(var6);
				var5.drawRect(var8, var9, 303, 33);
				var5.fillRect(var8 + 2, var9 + 2, var1 * 3, 30);
				var5.setColor(Color.black);
				var5.drawRect(var8 + 1, var9 + 1, 301, 31);
				var5.fillRect(var1 * 3 + var8 + 2, var9 + 2, 300 - var1 * 3, 30);
				var5.setFont(Varcs.fontHelvetica13);
				var5.setColor(Color.white);
				var5.drawString(var2, var8 + (304 - class137.loginScreenFontMetrics.stringWidth(var2)) / 2, var9 + 22);
			}
		} catch (Exception var11) {
			this.canvas.repaint();
		}

	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "6"
	)
	protected final void method557() {
		class169.field1832 = null;
		Varcs.fontHelvetica13 = null;
		class137.loginScreenFontMetrics = null;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-2037102880"
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

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/Container;",
		garbageValue = "1036457443"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this);
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)Lqy;",
		garbageValue = "-357750770"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container();
		int var2 = Math.max(var1.getWidth(), this.field185);
		int var3 = Math.max(var1.getHeight(), this.field164);
		if (this.frame != null) {
			Insets var4 = this.frame.getInsets();
			var2 -= var4.right + var4.left;
			var3 -= var4.top + var4.bottom;
		}

		return new Bounds(var2, var3);
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1505119794"
	)
	protected abstract void vmethod1297();

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) {
			this.fullRedraw = true;
			if (WorldMapElement.method3843() - this.field179 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= class154.canvasWidth && var2.height >= UrlRequester.canvasHeight) {
					this.isCanvasInvalid = true;
				}
			}

		}
	}

	public final void destroy() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = WorldMapElement.method3843();
			FileSystem.method4499(5000L);
			this.kill();
		}
	}

	public final void windowDeactivated(WindowEvent var1) {
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
						for (var3 = 6; var3 < var2.length() && HealthBarUpdate.isDigit(var2.charAt(var3)); ++var3) {
						}

						String var4 = var2.substring(6, var3);
						if (class213.isNumber(var4) && TaskHandler.method4455(var4) < 10) {
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

			class354.clock = (Clock)var8;

			while (stopTimeMs == 0L || WorldMapElement.method3843() < stopTimeMs) {
				gameCyclesToDo = class354.clock.wait(cycleDurationMillis, fiveOrOne);

				for (int var5 = 0; var5 < gameCyclesToDo; ++var5) {
					this.clientTick();
				}

				this.graphicsTick();
				this.post(this.canvas);
			}
		} catch (Exception var7) {
			class171.RunException_sendStackTrace((String)null, var7);
			this.error("crash");
		}

		this.kill();
	}

	public final void stop() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = WorldMapElement.method3843() + 4000L;
		}
	}

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true;
		this.fullRedraw = true;
	}

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false;
	}

	public final void windowActivated(WindowEvent var1) {
	}

	public final void windowClosing(WindowEvent var1) {
		this.destroy();
	}

	public final void windowOpened(WindowEvent var1) {
	}

	public abstract void init();

	public final void windowDeiconified(WindowEvent var1) {
	}

	public final void start() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = 0L;
		}
	}

	public final void update(Graphics var1) {
		this.paint(var1);
	}

	public final void windowIconified(WindowEvent var1) {
	}

	public final void windowClosed(WindowEvent var1) {
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Lfo;",
		garbageValue = "-1648382594"
	)
	public static class145 method658(int var0) {
		class145 var1 = (class145)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			var1 = AttackOption.method2968(class158.SequenceDefinition_animationsArchive, class187.SequenceDefinition_skeletonsArchive, var0, false);
			if (var1 != null) {
				SequenceDefinition.SequenceDefinition_cachedModel.put(var1, (long)var0);
			}

			return var1;
		}
	}
}
