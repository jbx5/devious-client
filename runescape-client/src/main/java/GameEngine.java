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

@ObfuscatedName("bx")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lbx;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -972204559
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = 1357323329922532841L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("an")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1294784155
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1211199807
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 840423061
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lhf;"
	)
	@Export("clock")
	static Clock clock;
	@ObfuscatedName("ai")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("ar")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1005419219
	)
	static int field190;
	@ObfuscatedName("by")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	@Export("keyHandler")
	protected static KeyHandler keyHandler;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		longValue = -7061351807293358897L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		longValue = -5085579001810185779L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	@Export("archive8")
	static Archive archive8;
	@ObfuscatedName("ao")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1429899503
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 711370431
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 2036724517
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -551680619
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 2045601991
	)
	int field188;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1061414363
	)
	int field189;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1125823449
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 2064104547
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("bp")
	protected boolean field172;
	@ObfuscatedName("bf")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("be")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("bn")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("bx")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("bl")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		longValue = 6890218759618530073L
	)
	volatile long field193;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Laq;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("br")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("bb")
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
		this.field172 = false;
		this.fullRedraw = true;
		this.resizeCanvasNextFrame = false;
		this.isCanvasInvalid = false;
		this.field193 = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}

		this.eventQueue = var1;
		DevicePcmPlayerProvider var2 = new DevicePcmPlayerProvider();
		class129.pcmPlayerProvider = var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-731804788"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) {
			this.method480();
		}

		this.maxCanvasWidth = var1;
		this.maxCanvasHeight = var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)V",
		garbageValue = "-1406490005"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) {
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
				class499.method8677(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Lge;",
		garbageValue = "-218287002"
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
		garbageValue = "-1787352976"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1920040630"
	)
	protected void method463(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "16711680"
	)
	public Clipboard method464() {
		return this.clipboard;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
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

		keyHandler.method323(this.canvas);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-28300"
	)
	protected final void method530() {
		keyHandler.method353();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lbf;II)V",
		garbageValue = "1181261452"
	)
	protected void method466(class29 var1, int var2) {
		keyHandler.method321(var1, var2);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "26674"
	)
	@Export("setUpMouse")
	protected final void setUpMouse() {
		class106.method2699(this.canvas);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1307608486"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container();
		if (var1 != null) {
			Bounds var2 = this.getFrameContentBounds();
			this.contentWidth = Math.max(var2.highX, this.field188);
			this.contentHeight = Math.max(var2.highY, this.field189);
			if (this.contentWidth <= 0) {
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) {
				this.contentHeight = 1;
			}

			class148.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
			class342.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
			this.canvasX = (this.contentWidth - class148.canvasWidth) / 2;
			this.canvasY = 0;
			this.canvas.setSize(class148.canvasWidth, class342.canvasHeight);
			UserComparator9.rasterProvider = new RasterProvider(class148.canvasWidth, class342.canvasHeight, this.canvas, this.field172);
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "93"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1464269537"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX;
		int var2 = this.canvasY;
		int var3 = this.contentWidth - class148.canvasWidth - var1;
		int var4 = this.contentHeight - class342.canvasHeight - var2;
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-110"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		keyHandler.method331(this.canvas);
		PlayerCompositionColorTextureOverride.method3692(this.canvas);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.method285(this.canvas);
		}

		this.addCanvas();
		keyHandler.method323(this.canvas);
		class106.method2699(this.canvas);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method480();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-69087960"
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
			class148.canvasWidth = var1;
			class342.canvasHeight = var2;
			RunException.RunException_revision = var3;
			class73.field911 = var4;
			RunException.RunException_applet = this;
			if (class350.taskHandler == null) {
				class350.taskHandler = new TaskHandler();
			}

			class350.taskHandler.newThreadTask(this, 1);
		} catch (Exception var6) {
			class180.RunException_sendStackTrace((String)null, var6);
			this.error("crash");
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2022692785"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container();
		if (this.canvas != null) {
			this.canvas.removeFocusListener(this);
			var1.remove(this.canvas);
		}

		class148.canvasWidth = Math.max(var1.getWidth(), this.field188);
		class342.canvasHeight = Math.max(var1.getHeight(), this.field189);
		Insets var2;
		if (this.frame != null) {
			var2 = this.frame.getInsets();
			class148.canvasWidth -= var2.right + var2.left;
			class342.canvasHeight -= var2.top + var2.bottom;
		}

		this.canvas = new Canvas(this);
		var1.setBackground(Color.BLACK);
		var1.setLayout((LayoutManager)null);
		var1.add(this.canvas);
		this.canvas.setSize(class148.canvasWidth, class342.canvasHeight);
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
		if (UserComparator9.rasterProvider != null && class148.canvasWidth == UserComparator9.rasterProvider.width && class342.canvasHeight == UserComparator9.rasterProvider.height) {
			((RasterProvider)UserComparator9.rasterProvider).setComponent(this.canvas);
			UserComparator9.rasterProvider.drawFull(0, 0);
		} else {
			UserComparator9.rasterProvider = new RasterProvider(class148.canvasWidth, class342.canvasHeight, this.canvas, this.field172);
		}

		this.isCanvasInvalid = false;
		this.field193 = VerticalAlignment.method3924();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "354151711"
	)
	protected void method510(boolean var1) {
		if (this.field172 != var1) {
			this.field172 = var1;
			UserComparator9.rasterProvider.method9669(var1);
			UserComparator9.rasterProvider.apply();
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1165492221"
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "139624089"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = VerticalAlignment.method3924();
		long var3 = clientTickTimes[class179.field1899];
		clientTickTimes[class179.field1899] = var1;
		class179.field1899 = class179.field1899 + 1 & 31;
		if (var3 != 0L && var1 > var3) {
		}

		synchronized(this) {
			WorldMapRenderer.hasFocus = volatileFocus;
		}

		this.doCycle();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-627623291"
	)
	protected final void method591() {
		this.fullRedraw = true;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-386305903"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container();
		long var2 = VerticalAlignment.method3924();
		long var4 = graphicsTickTimes[class357.field3922];
		graphicsTickTimes[class357.field3922] = var2;
		class357.field3922 = class357.field3922 + 1 & 31;
		if (0L != var4 && var2 > var4) {
			int var6 = (int)(var2 - var4);
			fps = ((var6 >> 1) + 32000) / var6;
		}

		if (++field190 - 1 > 50) {
			field190 -= 50;
			this.fullRedraw = true;
			this.canvas.setSize(class148.canvasWidth, class342.canvasHeight);
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

		this.method491();
		this.draw(this.fullRedraw);
		if (this.fullRedraw) {
			this.clearBackground();
		}

		this.fullRedraw = false;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "479"
	)
	final void method491() {
		Bounds var1 = this.getFrameContentBounds();
		if (var1.highX != this.contentWidth || var1.highY != this.contentHeight || this.resizeCanvasNextFrame) {
			this.resizeCanvas();
			this.resizeCanvasNextFrame = false;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "925528283"
	)
	final void method480() {
		this.resizeCanvasNextFrame = true;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
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

			if (class350.taskHandler != null) {
				try {
					class350.taskHandler.close();
				} catch (Exception var2) {
				}
			}

			this.vmethod1203();
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2131760919"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1556625952"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "17"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-283961032"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZZB)V",
		garbageValue = "9"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3, boolean var4) {
		try {
			Graphics var5 = this.canvas.getGraphics();
			if (PcmPlayer.fontHelvetica13 == null) {
				PcmPlayer.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
				class60.loginScreenFontMetrics = this.canvas.getFontMetrics(PcmPlayer.fontHelvetica13);
			}

			if (var3 && !var4) {
				var5.setColor(Color.black);
				var5.fillRect(0, 0, class148.canvasWidth, class342.canvasHeight);
			}

			Color var6 = new Color(140, 17, 17);

			try {
				if (class30.field147 == null) {
					class30.field147 = this.canvas.createImage(304, 34);
				}

				Graphics var7 = class30.field147.getGraphics();
				var7.setColor(var6);
				var7.drawRect(0, 0, 303, 33);
				var7.fillRect(2, 2, var1 * 3, 30);
				var7.setColor(Color.black);
				var7.drawRect(1, 1, 301, 31);
				var7.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
				var7.setFont(PcmPlayer.fontHelvetica13);
				var7.setColor(Color.white);
				var7.drawString(var2, (304 - class60.loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
				var5.drawImage(class30.field147, class148.canvasWidth / 2 - 152, class342.canvasHeight / 2 + (var4 ? 50 : -18), (ImageObserver)null);
			} catch (Exception var10) {
				int var8 = class148.canvasWidth / 2 - 152;
				int var9 = class342.canvasHeight / 2 - 18;
				var5.setColor(var6);
				var5.drawRect(var8, var9, 303, 33);
				var5.fillRect(var8 + 2, var9 + 2, var1 * 3, 30);
				var5.setColor(Color.black);
				var5.drawRect(var8 + 1, var9 + 1, 301, 31);
				var5.fillRect(var8 + var1 * 3 + 2, var9 + 2, 300 - var1 * 3, 30);
				var5.setFont(PcmPlayer.fontHelvetica13);
				var5.setColor(Color.white);
				var5.drawString(var2, var8 + (304 - class60.loginScreenFontMetrics.stringWidth(var2)) / 2, var9 + 22);
			}
		} catch (Exception var11) {
			this.canvas.repaint();
		}

	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-23"
	)
	protected final void method489() {
		class30.field147 = null;
		PcmPlayer.fontHelvetica13 = null;
		class60.loginScreenFontMetrics = null;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "512083621"
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

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/awt/Container;",
		garbageValue = "52"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this);
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)Lrz;",
		garbageValue = "-1502639005"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container();
		int var2 = Math.max(var1.getWidth(), this.field188);
		int var3 = Math.max(var1.getHeight(), this.field189);
		if (this.frame != null) {
			Insets var4 = this.frame.getInsets();
			var2 -= var4.right + var4.left;
			var3 -= var4.bottom + var4.top;
		}

		return new Bounds(var2, var3);
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2099249271"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "740257686"
	)
	protected abstract void vmethod1203();

	public final void destroy() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = VerticalAlignment.method3924();
			class499.method8677(5000L);
			this.kill();
		}
	}

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) {
			this.fullRedraw = true;
			if (VerticalAlignment.method3924() - this.field193 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= class148.canvasWidth && var2.height >= class342.canvasHeight) {
					this.isCanvasInvalid = true;
				}
			}

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
						for (var3 = 6; var3 < var2.length() && class384.isDigit(var2.charAt(var3)); ++var3) {
						}

						String var4 = var2.substring(6, var3);
						if (CollisionMap.isNumber(var4) && KitDefinition.method3778(var4) < 10) {
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
			clock = class138.method3101();

			while (stopTimeMs == 0L || VerticalAlignment.method3924() < stopTimeMs) {
				VertexNormal.gameCyclesToDo = clock.wait(cycleDurationMillis, fiveOrOne);

				for (int var5 = 0; var5 < VertexNormal.gameCyclesToDo; ++var5) {
					this.clientTick();
				}

				this.graphicsTick();
				this.post(this.canvas);
			}
		} catch (Exception var6) {
			class180.RunException_sendStackTrace((String)null, var6);
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

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true;
		this.fullRedraw = true;
	}

	public final void windowDeactivated(WindowEvent var1) {
	}

	public final void windowActivated(WindowEvent var1) {
	}

	public final void windowClosed(WindowEvent var1) {
	}

	public final void windowClosing(WindowEvent var1) {
		this.destroy();
	}

	public final void windowDeiconified(WindowEvent var1) {
	}

	public final void windowOpened(WindowEvent var1) {
	}

	public abstract void init();

	public final void windowIconified(WindowEvent var1) {
	}

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false;
	}

	public final void stop() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = VerticalAlignment.method3924() + 4000L;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1826825844"
	)
	public static int method621(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var0;
		} else if (var2 == 1) {
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 : 7 - var1;
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "-132402851"
	)
	static int method620(int var0, Script var1, boolean var2) {
		if (var0 == 7463) {
			boolean var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize] == 1;
			AbstractWorldMapData.method5680(var3);
			return 1;
		} else {
			return 2;
		}
	}
}
