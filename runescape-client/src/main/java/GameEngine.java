import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Insets;
import net.runelite.mapping.ObfuscatedName;
import java.awt.event.ActionEvent;
import net.runelite.mapping.Implements;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.ClipboardOwner;
import net.runelite.rs.ScriptOpcodes;
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
import java.awt.event.WindowEvent;
import net.runelite.mapping.ObfuscatedGetter;
import java.awt.Graphics;
import java.awt.datatransfer.Clipboard;
import java.awt.event.FocusListener;
import net.runelite.mapping.Export;
@ObfuscatedName("as")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable , FocusListener , WindowListener {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lff;")
	@Export("taskHandler")
	protected static TaskHandler taskHandler;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Las;")
	@Export("gameEngine")
	static GameEngine gameEngine = null;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -1153360045)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount = 0;

	@ObfuscatedName("u")
	@ObfuscatedGetter(longValue = -5482705015650467445L)
	@Export("stopTimeMs")
	static long stopTimeMs = 0L;

	@ObfuscatedName("c")
	@Export("isKilled")
	static boolean isKilled = false;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 723449305)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis = 20;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = 583049383)
	@Export("fiveOrOne")
	static int fiveOrOne = 1;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 1116579509)
	@Export("fps")
	protected static int fps = 0;

	@ObfuscatedName("p")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes = new long[32];

	@ObfuscatedName("l")
	@Export("clientTickTimes")
	static long[] clientTickTimes = new long[32];

	@ObfuscatedName("ai")
	@ObfuscatedGetter(intValue = 747145243)
	static int field214 = 500;

	@ObfuscatedName("av")
	@Export("volatileFocus")
	static volatile boolean volatileFocus = true;

	@ObfuscatedName("ak")
	@ObfuscatedGetter(longValue = 6212805581300353937L)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime = -1L;

	@ObfuscatedName("ao")
	@ObfuscatedGetter(longValue = -7997747325592305161L)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs = -1L;

	@ObfuscatedName("z")
	@Export("hasErrored")
	boolean hasErrored = false;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 710092349)
	@Export("contentWidth")
	protected int contentWidth;

	@ObfuscatedName("t")
	@ObfuscatedGetter(intValue = 1047673487)
	@Export("contentHeight")
	protected int contentHeight;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 609431559)
	@Export("canvasX")
	int canvasX = 0;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = -828582919)
	@Export("canvasY")
	int canvasY = 0;

	@ObfuscatedName("m")
	@ObfuscatedGetter(intValue = 798782721)
	int field206;

	@ObfuscatedName("ag")
	@ObfuscatedGetter(intValue = 1299455573)
	int field215;

	@ObfuscatedName("ar")
	@ObfuscatedGetter(intValue = -1224110449)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;

	@ObfuscatedName("aj")
	@ObfuscatedGetter(intValue = 1738807033)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;

	@ObfuscatedName("as")
	@Export("frame")
	Frame frame;

	@ObfuscatedName("ab")
	@Export("canvas")
	java.awt.Canvas canvas;

	@ObfuscatedName("al")
	@Export("fullRedraw")
	volatile boolean fullRedraw = true;

	@ObfuscatedName("ac")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame = false;

	@ObfuscatedName("ap")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid = false;

	@ObfuscatedName("aw")
	@ObfuscatedGetter(longValue = 5677079363139152629L)
	volatile long field200 = 0L;

	@ObfuscatedName("ax")
	@ObfuscatedSignature(descriptor = "Ls;")
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;

	@ObfuscatedName("an")
	@Export("clipboard")
	Clipboard clipboard;

	@ObfuscatedName("aa")
	@Export("eventQueue")
	final EventQueue eventQueue;

	protected GameEngine() {
		EventQueue var1 = null;
		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}
		this.eventQueue = var1;
		DevicePcmPlayerProvider var2 = new DevicePcmPlayerProvider();
		class82.pcmPlayerProvider = var2;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "1713791676")
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) {
			this.method431();
		}
		this.maxCanvasWidth = var1;
		this.maxCanvasHeight = var2;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/Object;B)V", garbageValue = "-33")
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) {
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
				WorldMapDecoration.method4967(1L);
			}
			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(I)Lft;", garbageValue = "1471418063")
	@Export("mouseWheel")
	protected class158 mouseWheel() {
		if (this.mouseWheelHandler == null) {
			this.mouseWheelHandler = new MouseWheelHandler();
			this.mouseWheelHandler.addTo(this.canvas);
		}
		return this.mouseWheelHandler;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "680079177")
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard();
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "-1646341133")
	protected void method418(String var1) {
		this.clipboard.setContents(new StringSelection(var1), ((ClipboardOwner) (null)));
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1856804732")
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
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
		WorldMapLabelSize.method4535(this.canvas);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-119")
	protected final void method420() {
		class1.method10(this.canvas);
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "2087598572")
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container();
		if (var1 != null) {
			Bounds var2 = this.getFrameContentBounds();
			this.contentWidth = Math.max(var2.highX, this.field206);
			this.contentHeight = Math.max(var2.highY, this.field215);
			if (this.contentWidth <= 0) {
				this.contentWidth = 1;
			}
			if (this.contentHeight <= 0) {
				this.contentHeight = 1;
			}
			class352.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
			class228.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
			this.canvasX = (this.contentWidth - class352.canvasWidth) / 2;
			this.canvasY = 0;
			this.canvas.setSize(class352.canvasWidth, class228.canvasHeight);
			class268.rasterProvider = new RasterProvider(class352.canvasWidth, class228.canvasHeight, this.canvas);
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "15")
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-333237309")
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX;
		int var2 = this.canvasY;
		int var3 = this.contentWidth - class352.canvasWidth - var1;
		int var4 = this.contentHeight - class228.canvasHeight - var2;
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "(S)V", garbageValue = "-22578")
	@Export("replaceCanvas")
	final void replaceCanvas() {
		java.awt.Canvas var1 = this.canvas;
		var1.removeKeyListener(KeyHandler.KeyHandler_instance);
		var1.removeFocusListener(KeyHandler.KeyHandler_instance);
		KeyHandler.field141 = -1;
		class83.method2189(this.canvas);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.removeFrom(this.canvas);
		}
		this.addCanvas();
		WorldMapLabelSize.method4535(this.canvas);
		class1.method10(this.canvas);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.addTo(this.canvas);
		}
		this.method431();
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(IIIII)V", garbageValue = "389868320")
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
			class352.canvasWidth = var1;
			class228.canvasHeight = var2;
			RunException.RunException_revision = var3;
			class138.field1608 = var4;
			RunException.RunException_applet = this;
			if (taskHandler == null) {
				taskHandler = new TaskHandler();
			}
			taskHandler.newThreadTask(this, 1);
		} catch (Exception var6) {
			class359.RunException_sendStackTrace(((String) (null)), var6);
			this.error("crash");
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-171102111")
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container();
		if (this.canvas != null) {
			this.canvas.removeFocusListener(this);
			var1.remove(this.canvas);
		}
		class352.canvasWidth = Math.max(var1.getWidth(), this.field206);
		class228.canvasHeight = Math.max(var1.getHeight(), this.field215);
		Insets var2;
		if (this.frame != null) {
			var2 = this.frame.getInsets();
			class352.canvasWidth -= var2.left + var2.right;
			class228.canvasHeight -= var2.top + var2.bottom;
		}
		this.canvas = new Canvas(this);
		var1.setBackground(Color.BLACK);
		var1.setLayout(((LayoutManager) (null)));
		var1.add(this.canvas);
		this.canvas.setSize(class352.canvasWidth, class228.canvasHeight);
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
		if (class268.rasterProvider != null && class352.canvasWidth == class268.rasterProvider.width && class228.canvasHeight == class268.rasterProvider.height) {
			((RasterProvider) (class268.rasterProvider)).setComponent(this.canvas);
			class268.rasterProvider.drawFull(0, 0);
		} else {
			class268.rasterProvider = new RasterProvider(class352.canvasWidth, class228.canvasHeight, this.canvas);
		}
		this.isCanvasInvalid = false;
		this.field200 = class131.method2916();
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "59")
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-195564351")
	@Export("clientTick")
	void clientTick() {
		long var1 = class131.method2916();
		long var3 = clientTickTimes[VarpDefinition.field1813];
		clientTickTimes[VarpDefinition.field1813] = var1;
		VarpDefinition.field1813 = VarpDefinition.field1813 + 1 & 31;
		if (0L != var3 && var1 > var3) {
		}
		synchronized(this) {
			class125.hasFocus = volatileFocus;
		}
		this.doCycle();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1974617817")
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container();
		long var2 = class131.method2916();
		long var4 = graphicsTickTimes[FriendSystem.field807];
		graphicsTickTimes[FriendSystem.field807] = var2;
		FriendSystem.field807 = FriendSystem.field807 + 1 & 31;
		if (0L != var4 && var2 > var4) {
			int var6 = ((int) (var2 - var4));
			fps = ((var6 >> 1) + 32000) / var6;
		}
		if (++field214 - 1 > 50) {
			field214 -= 50;
			this.fullRedraw = true;
			this.canvas.setSize(class352.canvasWidth, class228.canvasHeight);
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
		this.method430();
		this.draw(this.fullRedraw);
		if (this.fullRedraw) {
			this.clearBackground();
		}
		this.fullRedraw = false;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-20")
	final void method430() {
		Bounds var1 = this.getFrameContentBounds();
		if (this.contentWidth != var1.highX || var1.highY != this.contentHeight || this.resizeCanvasNextFrame) {
			this.resizeCanvas();
			this.resizeCanvasNextFrame = false;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "55")
	final void method431() {
		this.resizeCanvasNextFrame = true;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-433468147")
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
			this.vmethod1109();
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-8")
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("ag")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-787882687")
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("ar")
	@ObfuscatedSignature(descriptor = "(ZB)V", garbageValue = "-66")
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("aj")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "453908152")
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("ai")
	@ObfuscatedSignature(descriptor = "(ILjava/lang/String;ZI)V", garbageValue = "-982809922")
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics();
			if (class306.fontHelvetica13 == null) {
				class306.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
				WorldMapSprite.loginScreenFontMetrics = this.canvas.getFontMetrics(class306.fontHelvetica13);
			}
			if (var3) {
				var4.setColor(Color.black);
				var4.fillRect(0, 0, class352.canvasWidth, class228.canvasHeight);
			}
			Color var5 = new Color(140, 17, 17);
			try {
				if (class82.field1066 == null) {
					class82.field1066 = this.canvas.createImage(304, 34);
				}
				Graphics var6 = class82.field1066.getGraphics();
				var6.setColor(var5);
				var6.drawRect(0, 0, 303, 33);
				var6.fillRect(2, 2, var1 * 3, 30);
				var6.setColor(Color.black);
				var6.drawRect(1, 1, 301, 31);
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
				var6.setFont(class306.fontHelvetica13);
				var6.setColor(Color.white);
				var6.drawString(var2, (304 - WorldMapSprite.loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
				var4.drawImage(class82.field1066, class352.canvasWidth / 2 - 152, class228.canvasHeight / 2 - 18, ((ImageObserver) (null)));
			} catch (Exception var9) {
				int var7 = class352.canvasWidth / 2 - 152;
				int var8 = class228.canvasHeight / 2 - 18;
				var4.setColor(var5);
				var4.drawRect(var7, var8, 303, 33);
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30);
				var4.setColor(Color.black);
				var4.drawRect(var7 + 1, var8 + 1, 301, 31);
				var4.fillRect(var1 * 3 + var7 + 2, var8 + 2, 300 - var1 * 3, 30);
				var4.setFont(class306.fontHelvetica13);
				var4.setColor(Color.white);
				var4.drawString(var2, var7 + (304 - WorldMapSprite.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22);
			}
		} catch (Exception var10) {
			this.canvas.repaint();
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "62")
	protected final void method442() {
		class82.field1066 = null;
		class306.fontHelvetica13 = null;
		WorldMapSprite.loginScreenFontMetrics = null;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V", garbageValue = "0")
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(descriptor = "(B)Ljava/awt/Container;", garbageValue = "8")
	@Export("container")
	Container container() {
		return ((Container) (this.frame != null ? this.frame : this));
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(descriptor = "(I)Lnz;", garbageValue = "-1107216591")
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container();
		int var2 = Math.max(var1.getWidth(), this.field206);
		int var3 = Math.max(var1.getHeight(), this.field215);
		if (this.frame != null) {
			Insets var4 = this.frame.getInsets();
			var2 -= var4.right + var4.left;
			var3 -= var4.bottom + var4.top;
		}
		return new Bounds(var2, var3);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "-79")
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-395659383")
	protected abstract void vmethod1109();

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) {
			this.fullRedraw = true;
			if (class131.method2916() - this.field200 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= class352.canvasWidth && var2.height >= class228.canvasHeight) {
					this.isCanvasInvalid = true;
				}
			}
		}
	}

	public final void destroy() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = class131.method2916();
			WorldMapDecoration.method4967(5000L);
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
						for (var3 = 6; var3 < var2.length() && GameObject.isDigit(var2.charAt(var3)); ++var3) {
						}
						String var4 = var2.substring(6, var3);
						if (class126.isNumber(var4) && class121.method2824(var4) < 10) {
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
			class238.clock = class67.method1934();
			while (stopTimeMs == 0L || class131.method2916() < stopTimeMs) {
				class142.gameCyclesToDo = class238.clock.wait(cycleDurationMillis, fiveOrOne);
				for (int var5 = 0; var5 < class142.gameCyclesToDo; ++var5) {
					this.clientTick();
				}
				this.graphicsTick();
				this.post(this.canvas);
			} 
		} catch (Exception var6) {
			class359.RunException_sendStackTrace(((String) (null)), var6);
			this.error("crash");
		}
		this.kill();
	}

	public final void update(Graphics var1) {
		this.paint(var1);
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

	public abstract void init();

	public final void windowClosing(WindowEvent var1) {
		this.destroy();
	}

	public final void windowDeactivated(WindowEvent var1) {
	}

	public final void windowDeiconified(WindowEvent var1) {
	}

	public final void windowOpened(WindowEvent var1) {
	}

	public final void windowClosed(WindowEvent var1) {
	}

	public final void start() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = 0L;
		}
	}

	public final void stop() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = class131.method2916() + 4000L;
		}
	}

	public final void windowIconified(WindowEvent var1) {
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(IIB)I", garbageValue = "8")
	static final int method563(int var0, int var1) {
		int var2 = var1 * 57 + var0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 255;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(ILbc;ZI)I", garbageValue = "2112339889")
	static int method562(int var0, Script var1, boolean var2) {
		Widget var3 = FloorUnderlayDefinition.getWidget(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETX) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETY) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (var3.isHidden) ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}
}