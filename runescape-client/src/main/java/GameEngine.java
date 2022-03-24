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

@ObfuscatedName("aw")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable , FocusListener , WindowListener {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Law;")

	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	915941483)

	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("g")
	@ObfuscatedGetter(longValue = 
	-2593658155731261435L)

	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("l")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"Llq;")

	@Export("ItemDefinition_modelArchive")
	static AbstractArchive ItemDefinition_modelArchive;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	-1637749829)

	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 
	1340526085)

	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 
	-871728399)

	@Export("fps")
	protected static int fps;
	@ObfuscatedName("j")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("s")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("au")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(intValue = 
	1673260223)

	static int field192;
	@ObfuscatedName("am")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("az")
	@ObfuscatedGetter(longValue = 
	-3214398047383872977L)

	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(longValue = 
	2946912833293583083L)

	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("pu")
	@ObfuscatedSignature(descriptor = 
	"Los;")

	static class391 field205;
	@ObfuscatedName("n")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = 
	-1020947567)

	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("m")
	@ObfuscatedGetter(intValue = 
	1131645475)

	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 
	-976425917)

	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 
	1664726751)

	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	31638833)

	int field177;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(intValue = 
	-1090157949)

	int field187;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(intValue = 
	1992376427)

	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(intValue = 
	-284047095)

	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("aw")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("ar")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("ae")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("ad")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("aj")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("as")
	@ObfuscatedGetter(longValue = 
	-8844499073377564733L)

	volatile long field197;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(descriptor = 
	"Lz;")

	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("an")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("ah")
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
		field192 = 500;
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
		this.field197 = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}

		this.eventQueue = var1;
		class125.method2804(new DevicePcmPlayerProvider());
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(III)V", garbageValue = 
	"-426630363")

	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if ((this.maxCanvasWidth != var1) || (var2 != this.maxCanvasHeight)) {
			this.method469();
		}

		this.maxCanvasWidth = var1;
		this.maxCanvasHeight = var2;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/Object;I)V", garbageValue = 
	"478240082")

	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) {
			for (int var2 = 0; (var2 < 50) && (this.eventQueue.peekEvent() != null); ++var2) {
				GrandExchangeOfferTotalQuantityComparator.method6007(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(I)Lfz;", garbageValue = 
	"-1404787408")

	@Export("mouseWheel")
	protected class158 mouseWheel() {
		if (this.mouseWheelHandler == null) {
			this.mouseWheelHandler = new MouseWheelHandler();
			this.mouseWheelHandler.addTo(this.canvas);
		}

		return this.mouseWheelHandler;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"30")

	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;B)V", garbageValue = 
	"0")

	protected void method535(String var1) {
		this.clipboard.setContents(new StringSelection(var1), ((ClipboardOwner) (null)));
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"-45")

	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		if (ChatChannel.javaVendor.toLowerCase().indexOf("microsoft") != (-1)) {
			KeyHandler.KeyHandler_keyCodes[186] = 57;
			KeyHandler.KeyHandler_keyCodes[187] = 27;
			KeyHandler.KeyHandler_keyCodes[188] = 71;
			KeyHandler.KeyHandler_keyCodes[189] = 26;
			KeyHandler.KeyHandler_keyCodes[190] = 72;
			KeyHandler.KeyHandler_keyCodes[191] = 73;
			KeyHandler.KeyHandler_keyCodes[192] = 58;
			KeyHandler.KeyHandler_keyCodes[219] = 42;
			KeyHandler.KeyHandler_keyCodes[220] = 74;
			KeyHandler.KeyHandler_keyCodes[221] = 43;
			KeyHandler.KeyHandler_keyCodes[222] = 59;
			KeyHandler.KeyHandler_keyCodes[223] = 28;
		} else {
			KeyHandler.KeyHandler_keyCodes[44] = 71;
			KeyHandler.KeyHandler_keyCodes[45] = 26;
			KeyHandler.KeyHandler_keyCodes[46] = 72;
			KeyHandler.KeyHandler_keyCodes[47] = 73;
			KeyHandler.KeyHandler_keyCodes[59] = 57;
			KeyHandler.KeyHandler_keyCodes[61] = 27;
			KeyHandler.KeyHandler_keyCodes[91] = 42;
			KeyHandler.KeyHandler_keyCodes[92] = 74;
			KeyHandler.KeyHandler_keyCodes[93] = 43;
			KeyHandler.KeyHandler_keyCodes[192] = 28;
			KeyHandler.KeyHandler_keyCodes[222] = 58;
			KeyHandler.KeyHandler_keyCodes[520] = 59;
		}

		java.awt.Canvas var1 = this.canvas;
		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(KeyHandler.KeyHandler_instance);
		var1.addFocusListener(KeyHandler.KeyHandler_instance);
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1582400139")

	protected final void method534() {
		UserComparator7.method2584(this.canvas);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"(S)V", garbageValue = 
	"-20103")

	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container();
		if (var1 != null) {
			Bounds var2 = this.getFrameContentBounds();
			this.contentWidth = Math.max(var2.highX, this.field177);
			this.contentHeight = Math.max(var2.highY, this.field187);
			if (this.contentWidth <= 0) {
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) {
				this.contentHeight = 1;
			}

			class4.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
			class309.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
			this.canvasX = (this.contentWidth - class4.canvasWidth) / 2;
			this.canvasY = 0;
			this.canvas.setSize(class4.canvasWidth, class309.canvasHeight);
			SpotAnimationDefinition.rasterProvider = new RasterProvider(class4.canvasWidth, class309.canvasHeight, this.canvas);
			if (var1 == this.frame) {
				Insets var3 = this.frame.getInsets();
				this.canvas.setLocation(var3.left + this.canvasX, this.canvasY + var3.top);
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY);
			}

			this.fullRedraw = true;
			this.resizeGame();
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"1")

	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"111")

	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX;
		int var2 = this.canvasY;
		int var3 = (this.contentWidth - class4.canvasWidth) - var1;
		int var4 = (this.contentHeight - class309.canvasHeight) - var2;
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"5")

	@Export("replaceCanvas")
	final void replaceCanvas() {
		CollisionMap.method3852(this.canvas);
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
		UserComparator7.method2584(this.canvas);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method469();
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"(IIII)V", garbageValue = 
	"2101804155")

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
			class4.canvasWidth = var1;
			class309.canvasHeight = var2;
			RunException.RunException_revision = var3;
			RunException.RunException_applet = this;
			if (class434.taskHandler == null) {
				class434.taskHandler = new TaskHandler();
			}

			class434.taskHandler.newThreadTask(this, 1);
		} catch (Exception var5) {
			class301.RunException_sendStackTrace(((String) (null)), var5);
			this.error("crash");
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"-50")

	@Export("addCanvas")
	synchronized final void addCanvas() {
		Container var1 = this.container();
		if (this.canvas != null) {
			this.canvas.removeFocusListener(this);
			var1.remove(this.canvas);
		}

		class4.canvasWidth = Math.max(var1.getWidth(), this.field177);
		class309.canvasHeight = Math.max(var1.getHeight(), this.field187);
		Insets var2;
		if (this.frame != null) {
			var2 = this.frame.getInsets();
			class4.canvasWidth -= var2.right + var2.left;
			class309.canvasHeight -= var2.top + var2.bottom;
		}

		this.canvas = new Canvas(this);
		var1.setBackground(Color.BLACK);
		var1.setLayout(((LayoutManager) (null)));
		var1.add(this.canvas);
		this.canvas.setSize(class4.canvasWidth, class309.canvasHeight);
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
		if (((SpotAnimationDefinition.rasterProvider != null) && (class4.canvasWidth == SpotAnimationDefinition.rasterProvider.width)) && (class309.canvasHeight == SpotAnimationDefinition.rasterProvider.height)) {
			((RasterProvider) (SpotAnimationDefinition.rasterProvider)).setComponent(this.canvas);
			SpotAnimationDefinition.rasterProvider.drawFull(0, 0);
		} else {
			SpotAnimationDefinition.rasterProvider = new RasterProvider(class4.canvasWidth, class309.canvasHeight, this.canvas);
		}

		this.isCanvasInvalid = false;
		this.field197 = WorldMapSprite.getServerTime();
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(B)Z", garbageValue = 
	"27")

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

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"858052670")

	@Export("clientTick")
	void clientTick() {
		long var1 = WorldMapSprite.getServerTime();
		long var3 = clientTickTimes[class82.field1071];
		clientTickTimes[class82.field1071] = var1;
		class82.field1071 = (class82.field1071 + 1) & 31;
		if ((0L != var3) && (var1 > var3)) {
		}

		synchronized(this) {
			Varps.hasFocus = volatileFocus;
		}

		this.doCycle();
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1307738586")

	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container();
		long var2 = WorldMapSprite.getServerTime();
		long var4 = graphicsTickTimes[BufferedNetSocket.field4286];
		graphicsTickTimes[BufferedNetSocket.field4286] = var2;
		BufferedNetSocket.field4286 = (BufferedNetSocket.field4286 + 1) & 31;
		if ((var4 != 0L) && (var2 > var4)) {
			int var6 = ((int) (var2 - var4));
			fps = ((var6 >> 1) + 32000) / var6;
		}

		if (((++field192) - 1) > 50) {
			field192 -= 50;
			this.fullRedraw = true;
			this.canvas.setSize(class4.canvasWidth, class309.canvasHeight);
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

		this.method468();
		this.draw(this.fullRedraw);
		if (this.fullRedraw) {
			this.clearBackground();
		}

		this.fullRedraw = false;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-204191070")

	final void method468() {
		Bounds var1 = this.getFrameContentBounds();
		if (((this.contentWidth != var1.highX) || (var1.highY != this.contentHeight)) || this.resizeCanvasNextFrame) {
			this.resizeCanvas();
			this.resizeCanvasNextFrame = false;
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1470362606")

	final void method469() {
		this.resizeCanvasNextFrame = true;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1753011645")

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

			if (class434.taskHandler != null) {
				try {
					class434.taskHandler.close();
				} catch (Exception var2) {
				}
			}

			this.vmethod1135();
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"120")

	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"0")

	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(ZI)V", garbageValue = 
	"1683905481")

	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("ac")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"2114912088")

	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("ad")
	@ObfuscatedSignature(descriptor = 
	"(ILjava/lang/String;ZI)V", garbageValue = 
	"-1473189085")

	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics();
			if (fontHelvetica13 == null) {
				fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
				class241.loginScreenFontMetrics = this.canvas.getFontMetrics(fontHelvetica13);
			}

			if (var3) {
				var4.setColor(Color.black);
				var4.fillRect(0, 0, class4.canvasWidth, class309.canvasHeight);
			}

			Color var5 = new Color(140, 17, 17);

			try {
				if (class11.field56 == null) {
					class11.field56 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = class11.field56.getGraphics();
				var6.setColor(var5);
				var6.drawRect(0, 0, 303, 33);
				var6.fillRect(2, 2, var1 * 3, 30);
				var6.setColor(Color.black);
				var6.drawRect(1, 1, 301, 31);
				var6.fillRect((var1 * 3) + 2, 2, 300 - (var1 * 3), 30);
				var6.setFont(fontHelvetica13);
				var6.setColor(Color.white);
				var6.drawString(var2, (304 - class241.loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
				var4.drawImage(class11.field56, (class4.canvasWidth / 2) - 152, (class309.canvasHeight / 2) - 18, ((ImageObserver) (null)));
			} catch (Exception var9) {
				int var7 = (class4.canvasWidth / 2) - 152;
				int var8 = (class309.canvasHeight / 2) - 18;
				var4.setColor(var5);
				var4.drawRect(var7, var8, 303, 33);
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30);
				var4.setColor(Color.black);
				var4.drawRect(var7 + 1, var8 + 1, 301, 31);
				var4.fillRect((var7 + (var1 * 3)) + 2, var8 + 2, 300 - (var1 * 3), 30);
				var4.setFont(fontHelvetica13);
				var4.setColor(Color.white);
				var4.drawString(var2, var7 + ((304 - class241.loginScreenFontMetrics.stringWidth(var2)) / 2), var8 + 22);
			}
		} catch (Exception var10) {
			this.canvas.repaint();
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1566808200")

	protected final void method481() {
		class11.field56 = null;
		fontHelvetica13 = null;
		class241.loginScreenFontMetrics = null;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;I)V", garbageValue = 
	"-314865656")

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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(descriptor = 
	"(I)Ljava/awt/Container;", garbageValue = 
	"-394881039")

	@Export("container")
	Container container() {
		return ((Container) (this.frame != null ? this.frame : this));
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(descriptor = 
	"(I)Lnm;", garbageValue = 
	"1930493271")

	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container();
		int var2 = Math.max(var1.getWidth(), this.field177);
		int var3 = Math.max(var1.getHeight(), this.field187);
		if (this.frame != null) {
			Insets var4 = this.frame.getInsets();
			var2 -= var4.right + var4.left;
			var3 -= var4.top + var4.bottom;
		}

		return new Bounds(var2, var3);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"1758582880")

	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"14")

	protected abstract void vmethod1135();

	public synchronized final void paint(Graphics var1) {
		if ((this == gameEngine) && (!isKilled)) {
			this.fullRedraw = true;
			if ((WorldMapSprite.getServerTime() - this.field197) > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if ((var2 == null) || ((var2.width >= class4.canvasWidth) && (var2.height >= class309.canvasHeight))) {
					this.isCanvasInvalid = true;
				}
			}

		}
	}

	public final void destroy() {
		if ((this == gameEngine) && (!isKilled)) {
			stopTimeMs = WorldMapSprite.getServerTime();
			GrandExchangeOfferTotalQuantityComparator.method6007(5000L);
			this.kill();
		}
	}

	public void run() {
		try {
			if (ChatChannel.javaVendor != null) {
				String var1 = ChatChannel.javaVendor.toLowerCase();
				if ((var1.indexOf("sun") != (-1)) || (var1.indexOf("apple") != (-1))) {
					String var2 = TaskHandler.javaVersion;
					if ((((((((((var2.equals("1.1") || var2.startsWith("1.1.")) || var2.equals("1.2")) || var2.startsWith("1.2.")) || var2.equals("1.3")) || var2.startsWith("1.3.")) || var2.equals("1.4")) || var2.startsWith("1.4.")) || var2.equals("1.5")) || var2.startsWith("1.5.")) || var2.equals("1.6.0")) {
						this.error("wrongjava");
						return;
					}

					if (var2.startsWith("1.6.0_")) {
						int var3;
						for (var3 = 6; (var3 < var2.length()) && class117.isDigit(var2.charAt(var3)); ++var3) {
						}

						String var4 = var2.substring(6, var3);
						if (class20.isNumber(var4) && (class16.method217(var4) < 10)) {
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
			class4.clock = UserComparator5.method2592();

			while ((stopTimeMs == 0L) || (WorldMapSprite.getServerTime() < stopTimeMs)) {
				class134.gameCyclesToDo = class4.clock.wait(cycleDurationMillis, fiveOrOne);

				for (int var5 = 0; var5 < class134.gameCyclesToDo; ++var5) {
					this.clientTick();
				}

				this.graphicsTick();
				this.post(this.canvas);
			} 
		} catch (Exception var6) {
			class301.RunException_sendStackTrace(((String) (null)), var6);
			this.error("crash");
		}

		this.kill();
	}

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false;
	}

	public final void update(Graphics var1) {
		this.paint(var1);
	}

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true;
		this.fullRedraw = true;
	}

	public final void stop() {
		if ((this == gameEngine) && (!isKilled)) {
			stopTimeMs = WorldMapSprite.getServerTime() + 4000L;
		}
	}

	public final void windowActivated(WindowEvent var1) {
	}

	public final void windowClosed(WindowEvent var1) {
	}

	public final void windowDeactivated(WindowEvent var1) {
	}

	public final void windowDeiconified(WindowEvent var1) {
	}

	public abstract void init();

	public final void windowClosing(WindowEvent var1) {
		this.destroy();
	}

	public final void windowIconified(WindowEvent var1) {
	}

	public final void start() {
		if ((this == gameEngine) && (!isKilled)) {
			stopTimeMs = 0L;
		}
	}

	public final void windowOpened(WindowEvent var1) {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(II)Lgj;", garbageValue = 
	"1098154706")

	public static HitSplatDefinition method589(int var0) {
		HitSplatDefinition var1 = ((HitSplatDefinition) (HitSplatDefinition.HitSplatDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0);
			var1 = new HitSplatDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(CLlp;I)C", garbageValue = 
	"705203472")

	@Export("standardizeChar")
	static char standardizeChar(char var0, Language var1) {
		if ((var0 >= 192) && (var0 <= 255)) {
			if ((var0 >= 192) && (var0 <= 198)) {
				return 'A';
			}

			if (var0 == 199) {
				return 'C';
			}

			if ((var0 >= 200) && (var0 <= 203)) {
				return 'E';
			}

			if ((var0 >= 204) && (var0 <= 207)) {
				return 'I';
			}

			if ((var0 == 209) && (var1 != Language.Language_ES)) {
				return 'N';
			}

			if ((var0 >= 210) && (var0 <= 214)) {
				return 'O';
			}

			if ((var0 >= 217) && (var0 <= 220)) {
				return 'U';
			}

			if (var0 == 221) {
				return 'Y';
			}

			if (var0 == 223) {
				return 's';
			}

			if ((var0 >= 224) && (var0 <= 230)) {
				return 'a';
			}

			if (var0 == 231) {
				return 'c';
			}

			if ((var0 >= 232) && (var0 <= 235)) {
				return 'e';
			}

			if ((var0 >= 236) && (var0 <= 239)) {
				return 'i';
			}

			if ((var0 == 241) && (var1 != Language.Language_ES)) {
				return 'n';
			}

			if ((var0 >= 242) && (var0 <= 246)) {
				return 'o';
			}

			if ((var0 >= 249) && (var0 <= 252)) {
				return 'u';
			}

			if ((var0 == 253) || (var0 == 255)) {
				return 'y';
			}
		}

		if (var0 == 338) {
			return 'O';
		} else if (var0 == 339) {
			return 'o';
		} else if (var0 == 376) {
			return 'Y';
		} else {
			return var0;
		}
	}
}