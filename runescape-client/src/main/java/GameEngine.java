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
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lbx;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -568785621
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		longValue = 7171447873172086911L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("ax")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1018562829
	)
	@Export("gameCyclesToDo")
	static int gameCyclesToDo;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -911250321
	)
	@Export("cycleDurationMillis")
	protected static int cycleDurationMillis;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 2023011723
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 383666931
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("aj")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("aw")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1888844531
	)
	static int field181;
	@ObfuscatedName("br")
	protected static String field186;
	@ObfuscatedName("be")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	@Export("keyHandler")
	static KeyHandler keyHandler;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		longValue = 4986523696891444611L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		longValue = -6791808225161060915L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("ao")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -128203505
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -45163847
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 740926247
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1572678059
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1329968835
	)
	int field173;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1781898305
	)
	int field174;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -808257741
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -291016523
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("bz")
	protected boolean field177;
	@ObfuscatedName("bo")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("bm")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("bd")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("bv")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("bu")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		longValue = 2501525961795927035L
	)
	volatile long field184;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("bt")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("bi")
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
		field181 = 500;
		volatileFocus = true;
		keyHandler = new KeyHandler();
		garbageCollectorLastCollectionTime = -1L;
		garbageCollectorLastCheckTimeMs = -1L;
	}

	protected GameEngine() {
		this.hasErrored = false;
		this.canvasX = 0;
		this.canvasY = 0;
		this.field177 = false;
		this.fullRedraw = true;
		this.resizeCanvasNextFrame = false;
		this.isCanvasInvalid = false;
		this.field184 = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}

		this.eventQueue = var1;
		WorldMapCacheName.method6020(new DevicePcmPlayerProvider());
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-95055524"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) {
			this.method573();
		}

		this.maxCanvasWidth = var1;
		this.maxCanvasHeight = var2;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)V",
		garbageValue = "101551492"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) {
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
				ClanChannel.method3595(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lip;",
		garbageValue = "-1265509570"
	)
	@Export("mouseWheel")
	protected MouseWheel mouseWheel() {
		if (this.mouseWheelHandler == null) {
			this.mouseWheelHandler = new MouseWheelHandler();
			this.mouseWheelHandler.addTo(this.canvas);
		}

		return this.mouseWheelHandler;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1834311451"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "1"
	)
	protected void method457(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "335146971"
	)
	public Clipboard method481() {
		return this.clipboard;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1596010817"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		class210.method4556();
		keyHandler.method323(this.canvas);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "988565646"
	)
	protected final void method460() {
		keyHandler.method354();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lbc;II)V",
		garbageValue = "-45842339"
	)
	protected void method504(class29 var1, int var2) {
		keyHandler.method327(var1, var2);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "109813886"
	)
	@Export("setUpMouse")
	protected final void setUpMouse() {
		java.awt.Canvas var1 = this.canvas;
		var1.addMouseListener(MouseHandler.MouseHandler_instance);
		var1.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var1.addFocusListener(MouseHandler.MouseHandler_instance);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1917688553"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container();
		if (var1 != null) {
			Bounds var2 = this.getFrameContentBounds();
			this.contentWidth = Math.max(var2.highX, this.field173);
			this.contentHeight = Math.max(var2.highY, this.field174);
			if (this.contentWidth <= 0) {
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) {
				this.contentHeight = 1;
			}

			NPC.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
			ApproximateRouteStrategy.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
			this.canvasX = (this.contentWidth - NPC.canvasWidth) / 2;
			this.canvasY = 0;
			this.canvas.setSize(NPC.canvasWidth, ApproximateRouteStrategy.canvasHeight);
			class299.rasterProvider = new RasterProvider(NPC.canvasWidth, ApproximateRouteStrategy.canvasHeight, this.canvas, this.field177);
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-24166"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-43327475"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX;
		int var2 = this.canvasY;
		int var3 = this.contentWidth - NPC.canvasWidth - var1;
		int var4 = this.contentHeight - ApproximateRouteStrategy.canvasHeight - var2;
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "40"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		keyHandler.method324(this.canvas);
		HttpRequestTask.method269(this.canvas);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.method280(this.canvas);
		}

		this.addCanvas();
		keyHandler.method323(this.canvas);
		java.awt.Canvas var1 = this.canvas;
		var1.addMouseListener(MouseHandler.MouseHandler_instance);
		var1.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var1.addFocusListener(MouseHandler.MouseHandler_instance);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method573();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1913191617"
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
			NPC.canvasWidth = var1;
			ApproximateRouteStrategy.canvasHeight = var2;
			RunException.RunException_revision = var3;
			InterfaceParent.field1059 = var4;
			class238.RunException_applet = this;
			if (taskHandler == null) {
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1);
		} catch (Exception var6) {
			Script.RunException_sendStackTrace((String)null, var6);
			this.error("crash");
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1971335128"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container();
		if (this.canvas != null) {
			this.canvas.removeFocusListener(this);
			var1.remove(this.canvas);
		}

		NPC.canvasWidth = Math.max(var1.getWidth(), this.field173);
		ApproximateRouteStrategy.canvasHeight = Math.max(var1.getHeight(), this.field174);
		Insets var2;
		if (this.frame != null) {
			var2 = this.frame.getInsets();
			NPC.canvasWidth -= var2.right + var2.left;
			ApproximateRouteStrategy.canvasHeight -= var2.bottom + var2.top;
		}

		this.canvas = new Canvas(this);
		var1.setBackground(Color.BLACK);
		var1.setLayout((LayoutManager)null);
		var1.add(this.canvas);
		this.canvas.setSize(NPC.canvasWidth, ApproximateRouteStrategy.canvasHeight);
		this.canvas.setVisible(true);
		this.canvas.setBackground(Color.BLACK);
		if (var1 == this.frame) {
			var2 = this.frame.getInsets();
			this.canvas.setLocation(this.canvasX + var2.left, var2.top + this.canvasY);
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY);
		}

		this.canvas.addFocusListener(this);
		this.canvas.requestFocus();
		this.fullRedraw = true;
		if (class299.rasterProvider != null && NPC.canvasWidth == class299.rasterProvider.width && ApproximateRouteStrategy.canvasHeight == class299.rasterProvider.height) {
			((RasterProvider)class299.rasterProvider).setComponent(this.canvas);
			class299.rasterProvider.drawFull(0, 0);
		} else {
			class299.rasterProvider = new RasterProvider(NPC.canvasWidth, ApproximateRouteStrategy.canvasHeight, this.canvas, this.field177);
		}

		this.isCanvasInvalid = false;
		this.field184 = RouteStrategy.method5439();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "35"
	)
	protected void method588(boolean var1) {
		if (this.field177 != var1) {
			this.field177 = var1;
			class299.rasterProvider.method10024(var1);
			class299.rasterProvider.apply();
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1199719724"
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-99"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = RouteStrategy.method5439();
		long var3 = clientTickTimes[class6.field12];
		clientTickTimes[class6.field12] = var1;
		class6.field12 = class6.field12 + 1 & 31;
		if (0L != var3 && var1 > var3) {
		}

		synchronized(this) {
			class327.hasFocus = volatileFocus;
		}

		this.doCycle();
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1852262131"
	)
	protected final void method472() {
		this.fullRedraw = true;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2090334464"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container();
		long var2 = RouteStrategy.method5439();
		long var4 = graphicsTickTimes[class167.field1795];
		graphicsTickTimes[class167.field1795] = var2;
		class167.field1795 = class167.field1795 + 1 & 31;
		if (0L != var4 && var2 > var4) {
			int var6 = (int)(var2 - var4);
			fps = ((var6 >> 1) + 32000) / var6;
		}

		if (++field181 - 1 > 50) {
			field181 -= 50;
			this.fullRedraw = true;
			this.canvas.setSize(NPC.canvasWidth, ApproximateRouteStrategy.canvasHeight);
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

		this.method474();
		this.draw(this.fullRedraw);
		if (this.fullRedraw) {
			this.clearBackground();
		}

		this.fullRedraw = false;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1219525032"
	)
	final void method474() {
		Bounds var1 = this.getFrameContentBounds();
		if (var1.highX != this.contentWidth || var1.highY != this.contentHeight || this.resizeCanvasNextFrame) {
			this.resizeCanvas();
			this.resizeCanvasNextFrame = false;
		}

	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1467003443"
	)
	final void method573() {
		this.resizeCanvasNextFrame = true;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1781917330"
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

			this.vmethod1215();
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1948520576"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "680168848"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1345054426"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "48"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZZB)V",
		garbageValue = "14"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3, boolean var4) {
		try {
			Graphics var5 = this.canvas.getGraphics();
			if (GrandExchangeOfferOwnWorldComparator.fontHelvetica13 == null) {
				GrandExchangeOfferOwnWorldComparator.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
				ViewportMouse.loginScreenFontMetrics = this.canvas.getFontMetrics(GrandExchangeOfferOwnWorldComparator.fontHelvetica13);
			}

			if (var3 && !var4) {
				var5.setColor(Color.black);
				var5.fillRect(0, 0, NPC.canvasWidth, ApproximateRouteStrategy.canvasHeight);
			}

			Color var6 = new Color(140, 17, 17);

			try {
				if (BufferedFile.field5280 == null) {
					BufferedFile.field5280 = this.canvas.createImage(304, 34);
				}

				Graphics var7 = BufferedFile.field5280.getGraphics();
				var7.setColor(var6);
				var7.drawRect(0, 0, 303, 33);
				var7.fillRect(2, 2, var1 * 3, 30);
				var7.setColor(Color.black);
				var7.drawRect(1, 1, 301, 31);
				var7.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
				var7.setFont(GrandExchangeOfferOwnWorldComparator.fontHelvetica13);
				var7.setColor(Color.white);
				var7.drawString(var2, (304 - ViewportMouse.loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
				var5.drawImage(BufferedFile.field5280, NPC.canvasWidth / 2 - 152, ApproximateRouteStrategy.canvasHeight / 2 + (var4 ? 50 : -18), (ImageObserver)null);
			} catch (Exception var10) {
				int var8 = NPC.canvasWidth / 2 - 152;
				int var9 = ApproximateRouteStrategy.canvasHeight / 2 - 18;
				var5.setColor(var6);
				var5.drawRect(var8, var9, 303, 33);
				var5.fillRect(var8 + 2, var9 + 2, var1 * 3, 30);
				var5.setColor(Color.black);
				var5.drawRect(var8 + 1, var9 + 1, 301, 31);
				var5.fillRect(var8 + var1 * 3 + 2, var9 + 2, 300 - var1 * 3, 30);
				var5.setFont(GrandExchangeOfferOwnWorldComparator.fontHelvetica13);
				var5.setColor(Color.white);
				var5.drawString(var2, var8 + (304 - ViewportMouse.loginScreenFontMetrics.stringWidth(var2)) / 2, var9 + 22);
			}
		} catch (Exception var11) {
			this.canvas.repaint();
		}

	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "514352357"
	)
	protected final void method487() {
		BufferedFile.field5280 = null;
		GrandExchangeOfferOwnWorldComparator.fontHelvetica13 = null;
		ViewportMouse.loginScreenFontMetrics = null;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-32"
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

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/Container;",
		garbageValue = "-736365761"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this);
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)Lqw;",
		garbageValue = "-497199351"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container();
		int var2 = Math.max(var1.getWidth(), this.field173);
		int var3 = Math.max(var1.getHeight(), this.field174);
		if (this.frame != null) {
			Insets var4 = this.frame.getInsets();
			var2 -= var4.right + var4.left;
			var3 -= var4.bottom + var4.top;
		}

		return new Bounds(var2, var3);
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1887745026"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "24"
	)
	protected abstract void vmethod1215();

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) {
			this.fullRedraw = true;
			if (RouteStrategy.method5439() - this.field184 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= NPC.canvasWidth && var2.height >= ApproximateRouteStrategy.canvasHeight) {
					this.isCanvasInvalid = true;
				}
			}

		}
	}

	public final void destroy() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = RouteStrategy.method5439();
			ClanChannel.method3595(5000L);
			this.kill();
		}
	}

	public final void windowActivated(WindowEvent var1) {
	}

	public void run() {
		try {
			if (class137.javaVendor != null) {
				String var1 = class137.javaVendor.toLowerCase();
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
					String var2 = TaskHandler.javaVersion;
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
						this.error("wrongjava");
						return;
					}

					if (var2.startsWith("1.6.0_")) {
						int var3;
						for (var3 = 6; var3 < var2.length() && Sound.isDigit(var2.charAt(var3)); ++var3) {
						}

						String var4 = var2.substring(6, var3);
						if (class136.isNumber(var4) && ApproximateRouteStrategy.method1193(var4) < 10) {
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
			class447.clock = Canvas.method299();

			while (0L == stopTimeMs || RouteStrategy.method5439() < stopTimeMs) {
				gameCyclesToDo = class447.clock.wait(cycleDurationMillis, fiveOrOne);

				for (int var5 = 0; var5 < gameCyclesToDo; ++var5) {
					this.clientTick();
				}

				this.graphicsTick();
				this.post(this.canvas);
			}
		} catch (Exception var6) {
			Script.RunException_sendStackTrace((String)null, var6);
			this.error("crash");
		}

		this.kill();
	}

	public final void start() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = 0L;
		}
	}

	public final void stop() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = RouteStrategy.method5439() + 4000L;
		}
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

	public final void windowClosed(WindowEvent var1) {
	}

	public final void windowClosing(WindowEvent var1) {
		this.destroy();
	}

	public final void windowDeactivated(WindowEvent var1) {
	}

	public final void windowOpened(WindowEvent var1) {
	}

	public abstract void init();

	public final void windowDeiconified(WindowEvent var1) {
	}

	public final void windowIconified(WindowEvent var1) {
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lhp;",
		garbageValue = "-983780557"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			AbstractArchive var3 = SequenceDefinition.SequenceDefinition_animationsArchive;
			AbstractArchive var4 = class164.SequenceDefinition_skeletonsArchive;
			boolean var5 = true;
			int[] var6 = var3.getGroupFileIds(var0);

			for (int var7 = 0; var7 < var6.length; ++var7) {
				byte[] var8 = var3.getFile(var0, var6[var7]);
				if (var8 == null) {
					var5 = false;
				} else {
					int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
					byte[] var10 = var4.getFile(var9, 0);
					if (var10 == null) {
						var5 = false;
					}
				}
			}

			Frames var2;
			if (!var5) {
				var2 = null;
			} else {
				try {
					var2 = new Frames(var3, var4, var0, false);
				} catch (Exception var12) {
					var2 = null;
				}
			}

			if (var2 != null) {
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var2, (long)var0);
			}

			return var2;
		}
	}
}
