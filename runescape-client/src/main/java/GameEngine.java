import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Insets;
import net.runelite.mapping.ObfuscatedName;
import java.awt.event.ActionEvent;
import net.runelite.mapping.Implements;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.event.FocusEvent;
import java.awt.Container;
import java.net.URL;
import net.runelite.mapping.ObfuscatedSignature;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.applet.Applet;
import java.awt.LayoutManager;
import java.io.RandomAccessFile;
import java.awt.event.WindowEvent;
import net.runelite.mapping.ObfuscatedGetter;
import java.awt.Graphics;
import java.awt.datatransfer.Clipboard;
import java.awt.event.FocusListener;
import java.io.File;
import net.runelite.mapping.Export;
@ObfuscatedName("ap")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable , FocusListener , WindowListener {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lfr;")
	@Export("taskHandler")
	protected static TaskHandler taskHandler;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lap;")
	@Export("gameEngine")
	static GameEngine gameEngine;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 230880625)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;

	@ObfuscatedName("f")
	@ObfuscatedGetter(longValue = 4471126598307559601L)
	@Export("stopTimeMs")
	static long stopTimeMs;

	@ObfuscatedName("j")
	@Export("isKilled")
	static boolean isKilled;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 122633451)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 600236541)
	@Export("fiveOrOne")
	static int fiveOrOne;

	@ObfuscatedName("t")
	@ObfuscatedGetter(intValue = 632095801)
	@Export("fps")
	protected static int fps;

	@ObfuscatedName("u")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;

	@ObfuscatedName("h")
	@Export("clientTickTimes")
	static long[] clientTickTimes;

	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = -1680088159)
	static int field209;

	@ObfuscatedName("am")
	@ObfuscatedGetter(intValue = 962598391)
	static int field199;

	@ObfuscatedName("ai")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;

	@ObfuscatedName("aw")
	@ObfuscatedGetter(longValue = 2698055439581478877L)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;

	@ObfuscatedName("au")
	@ObfuscatedGetter(longValue = 2171634668724389491L)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;

	@ObfuscatedName("e")
	@Export("hasErrored")
	boolean hasErrored;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = 1031196877)
	@Export("contentWidth")
	protected int contentWidth;

	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = -1354234301)
	@Export("contentHeight")
	protected int contentHeight;

	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 266716801)
	@Export("canvasX")
	int canvasX;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = -159679161)
	@Export("canvasY")
	int canvasY;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 1936598847)
	int field210;

	@ObfuscatedName("ad")
	@ObfuscatedGetter(intValue = 1703466295)
	int field193;

	@ObfuscatedName("ak")
	@ObfuscatedGetter(intValue = -206719703)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;

	@ObfuscatedName("al")
	@ObfuscatedGetter(intValue = -1670280347)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;

	@ObfuscatedName("ap")
	@Export("frame")
	Frame frame;

	@ObfuscatedName("ac")
	@Export("canvas")
	java.awt.Canvas canvas;

	@ObfuscatedName("ae")
	@Export("fullRedraw")
	volatile boolean fullRedraw;

	@ObfuscatedName("an")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;

	@ObfuscatedName("af")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;

	@ObfuscatedName("ax")
	@ObfuscatedGetter(longValue = -9120615609352465965L)
	volatile long field185;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(descriptor = "Ln;")
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;

	@ObfuscatedName("aq")
	@Export("clipboard")
	Clipboard clipboard;

	@ObfuscatedName("ah")
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
		field199 = 500;
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
		this.field185 = 0L;
		EventQueue var1 = null;
		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}
		this.eventQueue = var1;
		class132.method2885(new DevicePcmPlayerProvider());
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(IIB)V", garbageValue = "0")
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) {
			this.method477();
		}
		this.maxCanvasWidth = var1;
		this.maxCanvasHeight = var2;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/Object;I)V", garbageValue = "-1780495724")
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) {
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
				DynamicObject.method1991(1L);
			}
			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "(I)Lfh;", garbageValue = "-1640531527")
	@Export("mouseWheel")
	protected class158 mouseWheel() {
		if (this.mouseWheelHandler == null) {
			this.mouseWheelHandler = new MouseWheelHandler();
			this.mouseWheelHandler.addTo(this.canvas);
		}
		return this.mouseWheelHandler;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-117")
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard();
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V", garbageValue = "0")
	protected void method385(String var1) {
		this.clipboard.setContents(new StringSelection(var1), ((ClipboardOwner) (null)));
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "7")
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		class432.method7572();
		ClientPreferences.method2344(this.canvas);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "40")
	protected final void method387() {
		java.awt.Canvas var1 = this.canvas;
		var1.addMouseListener(MouseHandler.MouseHandler_instance);
		var1.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var1.addFocusListener(MouseHandler.MouseHandler_instance);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1294986808")
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container();
		if (var1 != null) {
			Bounds var2 = this.getFrameContentBounds();
			this.contentWidth = Math.max(var2.highX, this.field210);
			this.contentHeight = Math.max(var2.highY, this.field193);
			if (this.contentWidth <= 0) {
				this.contentWidth = 1;
			}
			if (this.contentHeight <= 0) {
				this.contentHeight = 1;
			}
			Script.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
			class78.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
			this.canvasX = (this.contentWidth - Script.canvasWidth) / 2;
			this.canvasY = 0;
			this.canvas.setSize(Script.canvasWidth, class78.canvasHeight);
			Message.rasterProvider = new RasterProvider(Script.canvasWidth, class78.canvasHeight, this.canvas);
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1807518530")
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1100660124")
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX;
		int var2 = this.canvasY;
		int var3 = this.contentWidth - Script.canvasWidth - var1;
		int var4 = this.contentHeight - class78.canvasHeight - var2;
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

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "102")
	@Export("replaceCanvas")
	final void replaceCanvas() {
		ObjectComposition.method3709(this.canvas);
		java.awt.Canvas var1 = this.canvas;
		var1.removeMouseListener(MouseHandler.MouseHandler_instance);
		var1.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
		var1.removeFocusListener(MouseHandler.MouseHandler_instance);
		MouseHandler.MouseHandler_currentButtonVolatile = 0;
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.removeFrom(this.canvas);
		}
		this.addCanvas();
		ClientPreferences.method2344(this.canvas);
		java.awt.Canvas var2 = this.canvas;
		var2.addMouseListener(MouseHandler.MouseHandler_instance);
		var2.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var2.addFocusListener(MouseHandler.MouseHandler_instance);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.addTo(this.canvas);
		}
		this.method477();
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "(IIIII)V", garbageValue = "-1937564144")
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
			Script.canvasWidth = var1;
			class78.canvasHeight = var2;
			RunException.RunException_revision = var3;
			RunException.field4839 = var4;
			RunException.RunException_applet = this;
			if (taskHandler == null) {
				taskHandler = new TaskHandler();
			}
			taskHandler.newThreadTask(this, 1);
		} catch (Exception var6) {
			class249.RunException_sendStackTrace(((String) (null)), var6);
			this.error("crash");
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1260783779")
	@Export("addCanvas")
	synchronized final void addCanvas() {
		Container var1 = this.container();
		if (this.canvas != null) {
			this.canvas.removeFocusListener(this);
			var1.remove(this.canvas);
		}
		Script.canvasWidth = Math.max(var1.getWidth(), this.field210);
		class78.canvasHeight = Math.max(var1.getHeight(), this.field193);
		Insets var2;
		if (this.frame != null) {
			var2 = this.frame.getInsets();
			Script.canvasWidth -= var2.left + var2.right;
			class78.canvasHeight -= var2.bottom + var2.top;
		}
		this.canvas = new Canvas(this);
		var1.setBackground(Color.BLACK);
		var1.setLayout(((LayoutManager) (null)));
		var1.add(this.canvas);
		this.canvas.setSize(Script.canvasWidth, class78.canvasHeight);
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
		if (Message.rasterProvider != null && Script.canvasWidth == Message.rasterProvider.width && class78.canvasHeight == Message.rasterProvider.height) {
			((RasterProvider) (Message.rasterProvider)).setComponent(this.canvas);
			Message.rasterProvider.drawFull(0, 0);
		} else {
			Message.rasterProvider = new RasterProvider(Script.canvasWidth, class78.canvasHeight, this.canvas);
		}
		this.isCanvasInvalid = false;
		this.field185 = class115.method2692();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-309516342")
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1424742256")
	@Export("clientTick")
	void clientTick() {
		long var1 = class115.method2692();
		long var3 = clientTickTimes[field209];
		clientTickTimes[field209] = var1;
		field209 = field209 + 1 & 31;
		if (var3 != 0L && var1 > var3) {
		}
		synchronized(this) {
			ModelData0.hasFocus = volatileFocus;
		}
		this.doCycle();
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-97569955")
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container();
		long var2 = class115.method2692();
		long var4 = graphicsTickTimes[UserList.field4319];
		graphicsTickTimes[UserList.field4319] = var2;
		UserList.field4319 = UserList.field4319 + 1 & 31;
		if (var4 != 0L && var2 > var4) {
			int var6 = ((int) (var2 - var4));
			fps = ((var6 >> 1) + 32000) / var6;
		}
		if (++field199 - 1 > 50) {
			field199 -= 50;
			this.fullRedraw = true;
			this.canvas.setSize(Script.canvasWidth, class78.canvasHeight);
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
		this.method397();
		this.draw(this.fullRedraw);
		if (this.fullRedraw) {
			this.clearBackground();
		}
		this.fullRedraw = false;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1863381045")
	final void method397() {
		Bounds var1 = this.getFrameContentBounds();
		if (this.contentWidth != var1.highX || var1.highY != this.contentHeight || this.resizeCanvasNextFrame) {
			this.resizeCanvas();
			this.resizeCanvasNextFrame = false;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1552775883")
	final void method477() {
		this.resizeCanvasNextFrame = true;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1520335833")
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
			this.vmethod1099();
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1208160772")
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("ab")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1160439504")
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("aj")
	@ObfuscatedSignature(descriptor = "(ZI)V", garbageValue = "-2097579655")
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("am")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "853101705")
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("an")
	@ObfuscatedSignature(descriptor = "(ILjava/lang/String;ZB)V", garbageValue = "89")
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics();
			if (class192.fontHelvetica13 == null) {
				class192.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
				class11.loginScreenFontMetrics = this.canvas.getFontMetrics(class192.fontHelvetica13);
			}
			if (var3) {
				var4.setColor(Color.black);
				var4.fillRect(0, 0, Script.canvasWidth, class78.canvasHeight);
			}
			Color var5 = new Color(140, 17, 17);
			try {
				if (class162.field1781 == null) {
					class162.field1781 = this.canvas.createImage(304, 34);
				}
				Graphics var6 = class162.field1781.getGraphics();
				var6.setColor(var5);
				var6.drawRect(0, 0, 303, 33);
				var6.fillRect(2, 2, var1 * 3, 30);
				var6.setColor(Color.black);
				var6.drawRect(1, 1, 301, 31);
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
				var6.setFont(class192.fontHelvetica13);
				var6.setColor(Color.white);
				var6.drawString(var2, (304 - class11.loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
				var4.drawImage(class162.field1781, Script.canvasWidth / 2 - 152, class78.canvasHeight / 2 - 18, ((ImageObserver) (null)));
			} catch (Exception var9) {
				int var7 = Script.canvasWidth / 2 - 152;
				int var8 = class78.canvasHeight / 2 - 18;
				var4.setColor(var5);
				var4.drawRect(var7, var8, 303, 33);
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30);
				var4.setColor(Color.black);
				var4.drawRect(var7 + 1, var8 + 1, 301, 31);
				var4.fillRect(var1 * 3 + var7 + 2, var8 + 2, 300 - var1 * 3, 30);
				var4.setFont(class192.fontHelvetica13);
				var4.setColor(Color.white);
				var4.drawString(var2, var7 + (304 - class11.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22);
			}
		} catch (Exception var10) {
			this.canvas.repaint();
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-195360691")
	protected final void method410() {
		class162.field1781 = null;
		class192.fontHelvetica13 = null;
		class11.loginScreenFontMetrics = null;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "-1654563788")
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(descriptor = "(B)Ljava/awt/Container;", garbageValue = "35")
	@Export("container")
	Container container() {
		return ((Container) (this.frame != null ? this.frame : this));
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(descriptor = "(B)Lns;", garbageValue = "1")
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container();
		int var2 = Math.max(var1.getWidth(), this.field210);
		int var3 = Math.max(var1.getHeight(), this.field193);
		if (this.frame != null) {
			Insets var4 = this.frame.getInsets();
			var2 -= var4.left + var4.right;
			var3 -= var4.top + var4.bottom;
		}
		return new Bounds(var2, var3);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "1")
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "2")
	protected abstract void vmethod1099();

	public final void destroy() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = class115.method2692();
			DynamicObject.method1991(5000L);
			this.kill();
		}
	}

	public synchronized final void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) {
			this.fullRedraw = true;
			if (class115.method2692() - this.field185 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= Script.canvasWidth && var2.height >= class78.canvasHeight) {
					this.isCanvasInvalid = true;
				}
			}
		}
	}

	public void run() {
		try {
			if (class360.javaVendor != null) {
				String var1 = class360.javaVendor.toLowerCase();
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
					String var2 = TaskHandler.javaVersion;
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
						this.error("wrongjava");
						return;
					}
					if (var2.startsWith("1.6.0_")) {
						int var3;
						for (var3 = 6; var3 < var2.length() && class83.isDigit(var2.charAt(var3)); ++var3) {
						}
						String var4 = var2.substring(6, var3);
						if (class114.isNumber(var4) && FaceNormal.method4344(var4) < 10) {
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
			class10.clock = World.method1601();
			while (0L == stopTimeMs || class115.method2692() < stopTimeMs) {
				Messages.gameCyclesToDo = class10.clock.wait(cycleDurationMillis, fiveOrOne);
				for (int var5 = 0; var5 < Messages.gameCyclesToDo; ++var5) {
					this.clientTick();
				}
				this.graphicsTick();
				this.post(this.canvas);
			} 
		} catch (Exception var6) {
			class249.RunException_sendStackTrace(((String) (null)), var6);
			this.error("crash");
		}
		this.kill();
	}

	public final void start() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = 0L;
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

	public final void windowDeactivated(WindowEvent var1) {
	}

	public final void windowDeiconified(WindowEvent var1) {
	}

	public final void windowOpened(WindowEvent var1) {
	}

	public abstract void init();

	public final void stop() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = class115.method2692() + 4000L;
		}
	}

	public final void windowIconified(WindowEvent var1) {
	}

	public final void windowClosed(WindowEvent var1) {
	}

	public final void windowClosing(WindowEvent var1) {
		this.destroy();
	}

	public final void update(Graphics var1) {
		this.paint(var1);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljava/io/File;", garbageValue = "-2119363364")
	@Export("getFile")
	static File getFile(String var0) {
		if (!FileSystem.FileSystem_hasPermissions) {
			throw new RuntimeException("");
		} else {
			File var1 = ((File) (FileSystem.FileSystem_cacheFiles.get(var0)));
			if (var1 != null) {
				return var1;
			} else {
				File var2 = new File(FileSystem.FileSystem_cacheDir, var0);
				RandomAccessFile var3 = null;
				try {
					File var4 = new File(var2.getParent());
					if (!var4.exists()) {
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw");
						int var5 = var3.read();
						var3.seek(0L);
						var3.write(var5);
						var3.seek(0L);
						var3.close();
						FileSystem.FileSystem_cacheFiles.put(var0, var2);
						return var2;
					}
				} catch (Exception var8) {
					try {
						if (var3 != null) {
							var3.close();
							var3 = null;
						}
					} catch (Exception var7) {
					}
					throw new RuntimeException();
				}
			}
		}
	}
}