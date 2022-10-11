import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Desktop.Action;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.net.URI;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ai")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("vi")
	@ObfuscatedGetter(
		intValue = -2082337085
	)
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1479655543
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = 6491286044617340625L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("k")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 337377249
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1083037343
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1606047865
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("u")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 724138495
	)
	static int field195;
	@ObfuscatedName("b")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -532767297
	)
	static int field191;
	@ObfuscatedName("ae")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = -6365068415604636327L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		longValue = 5952429903682265367L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("s")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -418700425
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1147419893
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -842229459
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1066310043
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1906234945
	)
	int field201;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 480243503
	)
	int field207;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 184482863
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1524604323
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("ai")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("an")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("aa")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("ap")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("ab")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = 2228772906835646059L
	)
	volatile long field211;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Li;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("ax")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("av")
	@Export("eventQueue")
	final EventQueue eventQueue;

	static {
		gameEngine = null; // L: 41
		GameEngine_redundantStartThreadCount = 0; // L: 43
		stopTimeMs = 0L;
		isKilled = false; // L: 45
		cycleDurationMillis = 20;
		fiveOrOne = 1;
		fps = 0; // L: 50
		graphicsTickTimes = new long[32]; // L: 53
		clientTickTimes = new long[32]; // L: 55
		field191 = 500; // L: 73
		volatileFocus = true; // L: 82
		garbageCollectorLastCollectionTime = -1L; // L: 85
		garbageCollectorLastCheckTimeMs = -1L; // L: 86
	}

	protected GameEngine() {
		this.hasErrored = false; // L: 46
		this.canvasX = 0; // L: 59
		this.canvasY = 0;
		this.fullRedraw = true; // L: 71
		this.resizeCanvasNextFrame = false; // L: 74
		this.isCanvasInvalid = false; // L: 75
		this.field211 = 0L; // L: 76
		EventQueue var1 = null; // L: 89

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue(); // L: 91
		} catch (Throwable var3) { // L: 93
		}

		this.eventQueue = var1; // L: 94
		Script.method2118(new DevicePcmPlayerProvider()); // L: 95
	} // L: 96

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "227923388"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) { // L: 99
			this.method539();
		}

		this.maxCanvasWidth = var1; // L: 100
		this.maxCanvasHeight = var2; // L: 101
	} // L: 102

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)V",
		garbageValue = "174038586"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) { // L: 105
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) { // L: 106
				class28.method412(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy")); // L: 107
			}

		}
	} // L: 108

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Lfv;",
		garbageValue = "90"
	)
	@Export("mouseWheel")
	protected class159 mouseWheel() {
		if (this.mouseWheelHandler == null) { // L: 111
			this.mouseWheelHandler = new MouseWheelHandler(); // L: 112
			this.mouseWheelHandler.addTo(this.canvas); // L: 113
		}

		return this.mouseWheelHandler; // L: 115
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-654588880"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard(); // L: 119
	} // L: 120

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1527648363"
	)
	protected void method446(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null); // L: 123
	} // L: 124

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1581349900"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		class21.method323(); // L: 127
		java.awt.Canvas var1 = this.canvas; // L: 128
		var1.setFocusTraversalKeysEnabled(false); // L: 130
		var1.addKeyListener(KeyHandler.KeyHandler_instance); // L: 131
		var1.addFocusListener(KeyHandler.KeyHandler_instance); // L: 132
	} // L: 134

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "31"
	)
	protected final void method448() {
		ArchiveLoader.method2210(this.canvas); // L: 137
	} // L: 138

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2069997581"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container(); // L: 141
		if (var1 != null) { // L: 142
			Bounds var2 = this.getFrameContentBounds(); // L: 143
			this.contentWidth = Math.max(var2.highX, this.field201); // L: 144
			this.contentHeight = Math.max(var2.highY, this.field207); // L: 145
			if (this.contentWidth <= 0) { // L: 146
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) { // L: 147
				this.contentHeight = 1;
			}

			class123.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth); // L: 148
			class166.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight); // L: 149
			this.canvasX = (this.contentWidth - class123.canvasWidth) / 2; // L: 150
			this.canvasY = 0; // L: 151
			this.canvas.setSize(class123.canvasWidth, class166.canvasHeight); // L: 152
			class20.rasterProvider = new RasterProvider(class123.canvasWidth, class166.canvasHeight, this.canvas); // L: 153
			if (var1 == this.frame) { // L: 154
				Insets var3 = this.frame.getInsets(); // L: 155
				this.canvas.setLocation(var3.left + this.canvasX, var3.top + this.canvasY); // L: 156
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 158
			}

			this.fullRedraw = true; // L: 159
			this.resizeGame(); // L: 160
		}
	} // L: 161

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "35"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "5702"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX; // L: 166
		int var2 = this.canvasY; // L: 167
		int var3 = this.contentWidth - class123.canvasWidth - var1; // L: 168
		int var4 = this.contentHeight - class166.canvasHeight - var2; // L: 169
		if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) { // L: 170
			try {
				Container var5 = this.container(); // L: 172
				int var6 = 0; // L: 173
				int var7 = 0; // L: 174
				if (var5 == this.frame) { // L: 175
					Insets var8 = this.frame.getInsets(); // L: 176
					var6 = var8.left; // L: 177
					var7 = var8.top; // L: 178
				}

				Graphics var10 = var5.getGraphics(); // L: 180
				var10.setColor(Color.black); // L: 181
				if (var1 > 0) {
					var10.fillRect(var6, var7, var1, this.contentHeight); // L: 182
				}

				if (var2 > 0) { // L: 183
					var10.fillRect(var6, var7, this.contentWidth, var2);
				}

				if (var3 > 0) { // L: 184
					var10.fillRect(var6 + this.contentWidth - var3, var7, var3, this.contentHeight);
				}

				if (var4 > 0) { // L: 185
					var10.fillRect(var6, var7 + this.contentHeight - var4, this.contentWidth, var4);
				}
			} catch (Exception var9) { // L: 187
			}
		}

	} // L: 189

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1859580401"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		Players.method2569(this.canvas); // L: 192
		java.awt.Canvas var1 = this.canvas; // L: 193
		var1.removeMouseListener(MouseHandler.MouseHandler_instance); // L: 195
		var1.removeMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 196
		var1.removeFocusListener(MouseHandler.MouseHandler_instance); // L: 197
		MouseHandler.MouseHandler_currentButtonVolatile = 0; // L: 198
		if (this.mouseWheelHandler != null) { // L: 200
			this.mouseWheelHandler.removeFrom(this.canvas);
		}

		this.addCanvas(); // L: 201
		java.awt.Canvas var2 = this.canvas; // L: 202
		var2.setFocusTraversalKeysEnabled(false); // L: 204
		var2.addKeyListener(KeyHandler.KeyHandler_instance); // L: 205
		var2.addFocusListener(KeyHandler.KeyHandler_instance); // L: 206
		ArchiveLoader.method2210(this.canvas); // L: 208
		if (this.mouseWheelHandler != null) { // L: 209
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method539(); // L: 210
	} // L: 211

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "51"
	)
	@Export("startThread")
	protected final void startThread(int var1, int var2, int var3, int var4) {
		try {
			if (gameEngine != null) { // L: 215
				++GameEngine_redundantStartThreadCount; // L: 216
				if (GameEngine_redundantStartThreadCount >= 3) { // L: 217
					this.error("alreadyloaded"); // L: 218
					return; // L: 219
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self"); // L: 221
				return; // L: 222
			}

			gameEngine = this; // L: 224
			class123.canvasWidth = var1; // L: 225
			class166.canvasHeight = var2; // L: 226
			RunException.RunException_revision = var3; // L: 227
			class287.field3337 = var4; // L: 228
			RunException.RunException_applet = this; // L: 229
			if (class11.taskHandler == null) { // L: 230
				class11.taskHandler = new TaskHandler();
			}

			class11.taskHandler.newThreadTask(this, 1); // L: 231
		} catch (Exception var6) { // L: 233
			Clock.RunException_sendStackTrace((String)null, var6); // L: 234
			this.error("crash"); // L: 235
		}

	} // L: 237

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "788375067"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container(); // L: 240
		if (this.canvas != null) { // L: 241
			this.canvas.removeFocusListener(this); // L: 242
			var1.remove(this.canvas); // L: 243
		}

		class123.canvasWidth = Math.max(var1.getWidth(), this.field201); // L: 245
		class166.canvasHeight = Math.max(var1.getHeight(), this.field207); // L: 246
		Insets var2;
		if (this.frame != null) { // L: 247
			var2 = this.frame.getInsets(); // L: 248
			class123.canvasWidth -= var2.left + var2.right; // L: 249
			class166.canvasHeight -= var2.bottom + var2.top; // L: 250
		}

		this.canvas = new Canvas(this); // L: 252
		var1.setBackground(Color.BLACK); // L: 253
		var1.setLayout((LayoutManager)null); // L: 254
		var1.add(this.canvas); // L: 255
		this.canvas.setSize(class123.canvasWidth, class166.canvasHeight); // L: 256
		this.canvas.setVisible(true); // L: 257
		this.canvas.setBackground(Color.BLACK); // L: 258
		if (var1 == this.frame) { // L: 259
			var2 = this.frame.getInsets(); // L: 260
			this.canvas.setLocation(this.canvasX + var2.left, this.canvasY + var2.top); // L: 261
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY); // L: 263
		}

		this.canvas.addFocusListener(this); // L: 264
		this.canvas.requestFocus(); // L: 265
		this.fullRedraw = true; // L: 266
		if (class20.rasterProvider != null && class123.canvasWidth == class20.rasterProvider.width && class166.canvasHeight == class20.rasterProvider.height) { // L: 267
			((RasterProvider)class20.rasterProvider).setComponent(this.canvas); // L: 268
			class20.rasterProvider.drawFull(0, 0); // L: 269
		} else {
			class20.rasterProvider = new RasterProvider(class123.canvasWidth, class166.canvasHeight, this.canvas); // L: 272
		}

		this.isCanvasInvalid = false; // L: 274
		this.field211 = Language.method6232(); // L: 275
	} // L: 276

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2090455861"
	)
	@Export("checkHost")
	protected final boolean checkHost() {
		String var1 = this.getDocumentBase().getHost().toLowerCase(); // L: 279
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) { // L: 280
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) { // L: 281
				if (var1.endsWith("127.0.0.1")) { // L: 282
					return true;
				} else {
					while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
						var1 = var1.substring(0, var1.length() - 1); // L: 283
					}

					if (var1.endsWith("192.168.1.")) { // L: 284
						return true;
					} else {
						this.error("invalidhost"); // L: 285
						return false; // L: 286
					}
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-504304681"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = Language.method6232(); // L: 330
		long var3 = clientTickTimes[VarcInt.field1875]; // L: 331
		clientTickTimes[VarcInt.field1875] = var1; // L: 332
		VarcInt.field1875 = VarcInt.field1875 + 1 & 31; // L: 333
		if (0L != var3 && var1 > var3) { // L: 334
		}

		synchronized(this) { // L: 335
			class92.hasFocus = volatileFocus; // L: 336
		} // L: 337

		this.doCycle(); // L: 338
	} // L: 339

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "826557790"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container(); // L: 342
		long var2 = Language.method6232(); // L: 343
		long var4 = graphicsTickTimes[field195]; // L: 344
		graphicsTickTimes[field195] = var2; // L: 345
		field195 = field195 + 1 & 31; // L: 346
		if (0L != var4 && var2 > var4) { // L: 347
			int var6 = (int)(var2 - var4); // L: 348
			fps = ((var6 >> 1) + 32000) / var6; // L: 349
		}

		if (++field191 - 1 > 50) { // L: 351
			field191 -= 50; // L: 352
			this.fullRedraw = true; // L: 353
			this.canvas.setSize(class123.canvasWidth, class166.canvasHeight); // L: 354
			this.canvas.setVisible(true); // L: 355
			if (var1 == this.frame) { // L: 356
				Insets var7 = this.frame.getInsets(); // L: 357
				this.canvas.setLocation(this.canvasX + var7.left, var7.top + this.canvasY); // L: 358
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 360
			}
		}

		if (this.isCanvasInvalid) { // L: 362
			this.replaceCanvas();
		}

		this.method532(); // L: 363
		this.draw(this.fullRedraw); // L: 364
		if (this.fullRedraw) { // L: 365
			this.clearBackground();
		}

		this.fullRedraw = false; // L: 366
	} // L: 367

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-232351499"
	)
	final void method532() {
		Bounds var1 = this.getFrameContentBounds(); // L: 370
		if (var1.highX != this.contentWidth || this.contentHeight != var1.highY || this.resizeCanvasNextFrame) { // L: 371
			this.resizeCanvas(); // L: 372
			this.resizeCanvasNextFrame = false; // L: 373
		}

	} // L: 375

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1904227464"
	)
	final void method539() {
		this.resizeCanvasNextFrame = true; // L: 378
	} // L: 379

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-774124791"
	)
	@Export("kill")
	final synchronized void kill() {
		if (!isKilled) { // L: 382
			isKilled = true; // L: 383

			try {
				this.canvas.removeFocusListener(this); // L: 385
			} catch (Exception var5) { // L: 387
			}

			try {
				this.kill0(); // L: 389
			} catch (Exception var4) { // L: 391
			}

			if (this.frame != null) { // L: 392
				try {
					System.exit(0); // L: 394
				} catch (Throwable var3) { // L: 396
				}
			}

			if (class11.taskHandler != null) { // L: 398
				try {
					class11.taskHandler.close(); // L: 400
				} catch (Exception var2) { // L: 402
				}
			}

			this.vmethod1229(); // L: 404
		}
	} // L: 405

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "501973473"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2025034455"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "8076"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1894132503"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZB)V",
		garbageValue = "1"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics(); // L: 491
			if (class67.fontHelvetica13 == null) { // L: 492
				class67.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13); // L: 493
				class125.loginScreenFontMetrics = this.canvas.getFontMetrics(class67.fontHelvetica13); // L: 494
			}

			if (var3) { // L: 496
				var4.setColor(Color.black); // L: 497
				var4.fillRect(0, 0, class123.canvasWidth, class166.canvasHeight); // L: 498
			}

			Color var5 = new Color(140, 17, 17); // L: 500

			try {
				if (class128.field1561 == null) { // L: 502
					class128.field1561 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = class128.field1561.getGraphics(); // L: 503
				var6.setColor(var5); // L: 504
				var6.drawRect(0, 0, 303, 33); // L: 505
				var6.fillRect(2, 2, var1 * 3, 30); // L: 506
				var6.setColor(Color.black); // L: 507
				var6.drawRect(1, 1, 301, 31); // L: 508
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30); // L: 509
				var6.setFont(class67.fontHelvetica13); // L: 510
				var6.setColor(Color.white); // L: 511
				var6.drawString(var2, (304 - class125.loginScreenFontMetrics.stringWidth(var2)) / 2, 22); // L: 512
				var4.drawImage(class128.field1561, class123.canvasWidth / 2 - 152, class166.canvasHeight / 2 - 18, (ImageObserver)null); // L: 513
			} catch (Exception var9) { // L: 515
				int var7 = class123.canvasWidth / 2 - 152; // L: 516
				int var8 = class166.canvasHeight / 2 - 18; // L: 517
				var4.setColor(var5); // L: 518
				var4.drawRect(var7, var8, 303, 33); // L: 519
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30); // L: 520
				var4.setColor(Color.black); // L: 521
				var4.drawRect(var7 + 1, var8 + 1, 301, 31); // L: 522
				var4.fillRect(var7 + var1 * 3 + 2, var8 + 2, 300 - var1 * 3, 30); // L: 523
				var4.setFont(class67.fontHelvetica13); // L: 524
				var4.setColor(Color.white); // L: 525
				var4.drawString(var2, var7 + (304 - class125.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22); // L: 526
			}
		} catch (Exception var10) { // L: 529
			this.canvas.repaint(); // L: 530
		}

	} // L: 532

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	protected final void method493() {
		class128.field1561 = null; // L: 535
		class67.fontHelvetica13 = null; // L: 536
		class125.loginScreenFontMetrics = null; // L: 537
	} // L: 538

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-28"
	)
	@Export("error")
	protected void error(String var1) {
		if (!this.hasErrored) { // L: 541
			this.hasErrored = true; // L: 542
			System.out.println("error_game_" + var1); // L: 543

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self"); // L: 545
			} catch (Exception var3) { // L: 547
			}

		}
	} // L: 548

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/Container;",
		garbageValue = "-1859578938"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this); // L: 551
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Lnk;",
		garbageValue = "-1303354904"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container(); // L: 556
		int var2 = Math.max(var1.getWidth(), this.field201); // L: 557
		int var3 = Math.max(var1.getHeight(), this.field207); // L: 558
		if (this.frame != null) { // L: 559
			Insets var4 = this.frame.getInsets(); // L: 560
			var2 -= var4.right + var4.left; // L: 561
			var3 -= var4.top + var4.bottom; // L: 562
		}

		return new Bounds(var2, var3); // L: 564
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "428793671"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null; // L: 568
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	protected abstract void vmethod1229();

	public final void destroy() {
		if (this == gameEngine && !isKilled) { // L: 428
			stopTimeMs = Language.method6232(); // L: 429
			class28.method412(5000L); // L: 430
			this.kill(); // L: 431
		}
	} // L: 432

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) { // L: 441
			this.fullRedraw = true; // L: 442
			if (Language.method6232() - this.field211 > 1000L) { // L: 443
				Rectangle var2 = var1.getClipBounds(); // L: 444
				if (var2 == null || var2.width >= class123.canvasWidth && var2.height >= class166.canvasHeight) {
					this.isCanvasInvalid = true; // L: 445
				}
			}

		}
	} // L: 447

	public void run() {
		try {
			if (TaskHandler.javaVendor != null) { // L: 291
				String var1 = TaskHandler.javaVendor.toLowerCase(); // L: 292
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) { // L: 293
					String var2 = TaskHandler.javaVersion; // L: 294
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) { // L: 295
						this.error("wrongjava"); // L: 296
						return; // L: 297
					}

					if (var2.startsWith("1.6.0_")) { // L: 299
						int var3;
						for (var3 = 6; var3 < var2.length() && WorldMapRectangle.isDigit(var2.charAt(var3)); ++var3) { // L: 300 301
						}

						String var4 = var2.substring(6, var3); // L: 302
						if (class151.isNumber(var4) && MidiPcmStream.method5532(var4) < 10) { // L: 303
							this.error("wrongjava"); // L: 304
							return; // L: 305
						}
					}

					fiveOrOne = 5; // L: 308
				}
			}

			this.setFocusCycleRoot(true); // L: 311
			this.addCanvas(); // L: 312
			this.setUp(); // L: 313
			class13.clock = class114.method2805(); // L: 314

			while (0L == stopTimeMs || Language.method6232() < stopTimeMs) { // L: 315
				WorldMapCacheName.gameCyclesToDo = class13.clock.wait(cycleDurationMillis, fiveOrOne); // L: 316

				for (int var5 = 0; var5 < WorldMapCacheName.gameCyclesToDo; ++var5) { // L: 317
					this.clientTick();
				}

				this.graphicsTick(); // L: 318
				this.post(this.canvas); // L: 319
			}
		} catch (Exception var6) { // L: 322
			Clock.RunException_sendStackTrace((String)null, var6); // L: 323
			this.error("crash"); // L: 324
		}

		this.kill(); // L: 326
	} // L: 327

	public final void start() {
		if (this == gameEngine && !isKilled) { // L: 416
			stopTimeMs = 0L; // L: 417
		}
	} // L: 418

	public final void stop() {
		if (this == gameEngine && !isKilled) { // L: 422
			stopTimeMs = Language.method6232() + 4000L; // L: 423
		}
	} // L: 424

	public final void update(Graphics var1) {
		this.paint(var1); // L: 436
	} // L: 437

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false; // L: 457
	} // L: 458

	public final void windowActivated(WindowEvent var1) {
	} // L: 461

	public final void windowClosed(WindowEvent var1) {
	} // L: 464

	public final void windowClosing(WindowEvent var1) {
		this.destroy(); // L: 468
	} // L: 469

	public final void windowDeactivated(WindowEvent var1) {
	} // L: 472

	public final void windowDeiconified(WindowEvent var1) {
	} // L: 475

	public abstract void init();

	public final void windowOpened(WindowEvent var1) {
	} // L: 481

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true; // L: 451
		this.fullRedraw = true; // L: 452
	} // L: 453

	public final void windowIconified(WindowEvent var1) {
	} // L: 478

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1298476706"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 21
		if (var2 == null) { // L: 22
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0; // L: 23 24
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZLjava/lang/String;ZB)V",
		garbageValue = "1"
	)
	static void method591(String var0, boolean var1, String var2, boolean var3) {
		if (var1) { // L: 31
			if (!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) { // L: 32
				try {
					Desktop.getDesktop().browse(new URI(var0)); // L: 34
					return; // L: 35
				} catch (Exception var5) { // L: 37
				}
			}

			if (class29.field172.startsWith("win") && !var3) { // L: 39 40
				class78.method2234(var0, 0, "openjs"); // L: 42
				return; // L: 44
			}

			if (class29.field172.startsWith("mac")) { // L: 47
				class78.method2234(var0, 1, var2); // L: 48
				return; // L: 49
			}

			class78.method2234(var0, 2, "openjs"); // L: 52
		} else {
			class78.method2234(var0, 3, "openjs"); // L: 57
		}

	} // L: 60
}
