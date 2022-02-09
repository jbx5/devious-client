import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FontMetrics;
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
import java.lang.management.GarbageCollectorMXBean;
import java.net.URL;
import javax.accessibility.Accessible;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("al")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable , FocusListener , WindowListener {
    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Lex;")
    @Export("taskHandler")
    protected static TaskHandler taskHandler;

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Lal;")
    @Export("gameEngine")
    static GameEngine gameEngine;

    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 1515430643)
    @Export("GameEngine_redundantStartThreadCount")
    static int GameEngine_redundantStartThreadCount;

    @ObfuscatedName("e")
    @ObfuscatedGetter(longValue = 2883359987560251415L)
    @Export("stopTimeMs")
    static long stopTimeMs;

    @ObfuscatedName("r")
    @Export("isKilled")
    static boolean isKilled;

    @ObfuscatedName("v")
    @ObfuscatedGetter(intValue = 1948312411)
    @Export("cycleDurationMillis")
    static int cycleDurationMillis;

    @ObfuscatedName("a")
    @ObfuscatedGetter(intValue = -431506545)
    @Export("fiveOrOne")
    static int fiveOrOne;

    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = 1466996331)
    @Export("fps")
    protected static int fps;

    @ObfuscatedName("h")
    @ObfuscatedSignature(descriptor = "Lfk;")
    @Export("clock")
    static Clock clock;

    @ObfuscatedName("p")
    @Export("graphicsTickTimes")
    static long[] graphicsTickTimes;

    @ObfuscatedName("m")
    @Export("clientTickTimes")
    static long[] clientTickTimes;

    @ObfuscatedName("ay")
    @ObfuscatedGetter(intValue = -1537720839)
    static int field207;

    @ObfuscatedName("ae")
    @Export("volatileFocus")
    static volatile boolean volatileFocus;

    @ObfuscatedName("aw")
    @Export("garbageCollector")
    static GarbageCollectorMXBean garbageCollector;

    @ObfuscatedName("aj")
    @ObfuscatedGetter(longValue = -6798992322235179601L)
    @Export("garbageCollectorLastCollectionTime")
    static long garbageCollectorLastCollectionTime;

    @ObfuscatedName("ax")
    @ObfuscatedGetter(longValue = -3548974340453788987L)
    @Export("garbageCollectorLastCheckTimeMs")
    static long garbageCollectorLastCheckTimeMs;

    @ObfuscatedName("o")
    @Export("hasErrored")
    boolean hasErrored;

    @ObfuscatedName("j")
    @ObfuscatedGetter(intValue = 188130207)
    @Export("contentWidth")
    protected int contentWidth;

    @ObfuscatedName("f")
    @ObfuscatedGetter(intValue = 451056663)
    @Export("contentHeight")
    protected int contentHeight;

    @ObfuscatedName("g")
    @ObfuscatedGetter(intValue = -2069778095)
    @Export("canvasX")
    int canvasX;

    @ObfuscatedName("t")
    @ObfuscatedGetter(intValue = -1586010829)
    @Export("canvasY")
    int canvasY;

    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = -304380493)
    int field200;

    @ObfuscatedName("ap")
    @ObfuscatedGetter(intValue = 675819607)
    int field201;

    @ObfuscatedName("af")
    @ObfuscatedGetter(intValue = -1873513073)
    @Export("maxCanvasWidth")
    int maxCanvasWidth;

    @ObfuscatedName("ak")
    @ObfuscatedGetter(intValue = -1557812349)
    @Export("maxCanvasHeight")
    int maxCanvasHeight;

    @ObfuscatedName("al")
    @Export("frame")
    Frame frame;

    @ObfuscatedName("aa")
    @Export("canvas")
    java.awt.Canvas canvas;

    @ObfuscatedName("ao")
    @Export("fullRedraw")
    volatile boolean fullRedraw;

    @ObfuscatedName("ac")
    @Export("resizeCanvasNextFrame")
    boolean resizeCanvasNextFrame;

    @ObfuscatedName("ab")
    @Export("isCanvasInvalid")
    volatile boolean isCanvasInvalid;

    @ObfuscatedName("as")
    @ObfuscatedGetter(longValue = -8254453946735745309L)
    volatile long field210;

    @ObfuscatedName("ad")
    @ObfuscatedSignature(descriptor = "Lt;")
    @Export("mouseWheelHandler")
    MouseWheelHandler mouseWheelHandler;

    @ObfuscatedName("au")
    @Export("clipboard")
    Clipboard clipboard;

    @ObfuscatedName("at")
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
        this.field210 = 0L;
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.eventQueue = var1;
        DevicePcmPlayerProvider var2 = new DevicePcmPlayerProvider();
        class339.pcmPlayerProvider = var2;
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(IIB)V", garbageValue = "48")
    @Export("setMaxCanvasSize")
    protected final void setMaxCanvasSize(int var1, int var2) {
        if ((this.maxCanvasWidth != var1) || (var2 != this.maxCanvasHeight)) {
            this.method493();
        }
        this.maxCanvasWidth = var1;
        this.maxCanvasHeight = var2;
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;S)V", garbageValue = "24103")
    @Export("post")
    final void post(Object var1) {
        if (this.eventQueue != null) {
            for (int var2 = 0; (var2 < 50) && (this.eventQueue.peekEvent() != null); ++var2) {
                Language.method5813(1L);
            }
            if (var1 != null) {
                this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
            }
        }
    }

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "(I)Lei;", garbageValue = "-1948471075")
    @Export("mouseWheel")
    protected class154 mouseWheel() {
        if (this.mouseWheelHandler == null) {
            this.mouseWheelHandler = new MouseWheelHandler();
            this.mouseWheelHandler.addTo(this.canvas);
        }
        return this.mouseWheelHandler;
    }

    @ObfuscatedName("w")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-111030268")
    @Export("setUpClipboard")
    protected void setUpClipboard() {
        this.clipboard = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("v")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V", garbageValue = "-38")
    protected void method448(String var1) {
        this.clipboard.setContents(new StringSelection(var1), ((ClipboardOwner) (null)));
    }

    @ObfuscatedName("a")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1740711259")
    @Export("setUpKeyboard")
    protected final void setUpKeyboard() {
        UserComparator9.method2495();
        TileItem.method2299(this.canvas);
    }

    @ObfuscatedName("y")
    @ObfuscatedSignature(descriptor = "(S)V", garbageValue = "248")
    protected final void method438() {
        class142.method2945(this.canvas);
    }

    @ObfuscatedName("u")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-558035967")
    @Export("resizeCanvas")
    final void resizeCanvas() {
        Container var1 = this.container();
        if (var1 != null) {
            Bounds var2 = this.getFrameContentBounds();
            this.contentWidth = Math.max(var2.highX, this.field200);
            this.contentHeight = Math.max(var2.highY, this.field201);
            if (this.contentWidth <= 0) {
                this.contentWidth = 1;
            }
            if (this.contentHeight <= 0) {
                this.contentHeight = 1;
            }
            DirectByteArrayCopier.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
            NPC.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
            this.canvasX = (this.contentWidth - DirectByteArrayCopier.canvasWidth) / 2;
            this.canvasY = 0;
            this.canvas.setSize(DirectByteArrayCopier.canvasWidth, NPC.canvasHeight);
            PcmPlayer.rasterProvider = new RasterProvider(DirectByteArrayCopier.canvasWidth, NPC.canvasHeight, this.canvas);
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

    @ObfuscatedName("h")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1486103800")
    @Export("resizeGame")
    protected abstract void resizeGame();

    @ObfuscatedName("q")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "2098118072")
    @Export("clearBackground")
    void clearBackground() {
        int var1 = this.canvasX;
        int var2 = this.canvasY;
        int var3 = (this.contentWidth - DirectByteArrayCopier.canvasWidth) - var1;
        int var4 = (this.contentHeight - NPC.canvasHeight) - var2;
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

    @ObfuscatedName("x")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "57")
    @Export("replaceCanvas")
    final void replaceCanvas() {
        java.awt.Canvas var1 = this.canvas;
        var1.removeKeyListener(KeyHandler.KeyHandler_instance);
        var1.removeFocusListener(KeyHandler.KeyHandler_instance);
        KeyHandler.field148 = -1;
        java.awt.Canvas var2 = this.canvas;
        var2.removeMouseListener(MouseHandler.MouseHandler_instance);
        var2.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
        var2.removeFocusListener(MouseHandler.MouseHandler_instance);
        MouseHandler.MouseHandler_currentButtonVolatile = 0;
        if (this.mouseWheelHandler != null) {
            this.mouseWheelHandler.removeFrom(this.canvas);
        }
        this.addCanvas();
        TileItem.method2299(this.canvas);
        class142.method2945(this.canvas);
        if (this.mouseWheelHandler != null) {
            this.mouseWheelHandler.addTo(this.canvas);
        }
        this.method493();
    }

    @ObfuscatedName("p")
    @ObfuscatedSignature(descriptor = "(IIII)V", garbageValue = "-1173040223")
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
            DirectByteArrayCopier.canvasWidth = var1;
            NPC.canvasHeight = var2;
            class1.RunException_revision = var3;
            RunException.RunException_applet = this;
            if (taskHandler == null) {
                taskHandler = new TaskHandler();
            }
            taskHandler.newThreadTask(this, 1);
        } catch (Exception var5) {
            FloorDecoration.RunException_sendStackTrace(((String) (null)), var5);
            this.error("crash");
        }
    }

    @ObfuscatedName("n")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "90")
    @Export("addCanvas")
    synchronized final void addCanvas() {
        Container var1 = this.container();
        if (this.canvas != null) {
            this.canvas.removeFocusListener(this);
            var1.remove(this.canvas);
        }
        DirectByteArrayCopier.canvasWidth = Math.max(var1.getWidth(), this.field200);
        NPC.canvasHeight = Math.max(var1.getHeight(), this.field201);
        Insets var2;
        if (this.frame != null) {
            var2 = this.frame.getInsets();
            DirectByteArrayCopier.canvasWidth -= var2.left + var2.right;
            NPC.canvasHeight -= var2.top + var2.bottom;
        }
        this.canvas = new Canvas(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout(((LayoutManager) (null)));
        var1.add(this.canvas);
        this.canvas.setSize(DirectByteArrayCopier.canvasWidth, NPC.canvasHeight);
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
        if (((PcmPlayer.rasterProvider != null) && (DirectByteArrayCopier.canvasWidth == PcmPlayer.rasterProvider.width)) && (NPC.canvasHeight == PcmPlayer.rasterProvider.height)) {
            ((RasterProvider) (PcmPlayer.rasterProvider)).setComponent(this.canvas);
            PcmPlayer.rasterProvider.drawFull(0, 0);
        } else {
            PcmPlayer.rasterProvider = new RasterProvider(DirectByteArrayCopier.canvasWidth, NPC.canvasHeight, this.canvas);
        }
        this.isCanvasInvalid = false;
        this.field210 = DirectByteArrayCopier.getServerTime();
    }

    @ObfuscatedName("m")
    @ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-128254341")
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

    @ObfuscatedName("d")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "907049786")
    @Export("clientTick")
    void clientTick() {
        long var1 = DirectByteArrayCopier.getServerTime();
        long var3 = clientTickTimes[SpriteMask.field3215];
        clientTickTimes[SpriteMask.field3215] = var1;
        SpriteMask.field3215 = (SpriteMask.field3215 + 1) & 31;
        if ((0L != var3) && (var1 > var3)) {
        }
        synchronized(this) {
            class297.hasFocus = volatileFocus;
        }
        this.doCycle();
    }

    @ObfuscatedName("j")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-547730889")
    @Export("graphicsTick")
    void graphicsTick() {
        Container var1 = this.container();
        long var2 = DirectByteArrayCopier.getServerTime();
        long var4 = graphicsTickTimes[class12.field74];
        graphicsTickTimes[class12.field74] = var2;
        class12.field74 = (class12.field74 + 1) & 31;
        if ((0L != var4) && (var2 > var4)) {
            int var6 = ((int) (var2 - var4));
            fps = ((var6 >> 1) + 32000) / var6;
        }
        if (((++field207) - 1) > 50) {
            field207 -= 50;
            this.fullRedraw = true;
            this.canvas.setSize(DirectByteArrayCopier.canvasWidth, NPC.canvasHeight);
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
        this.method481();
        this.draw(this.fullRedraw);
        if (this.fullRedraw) {
            this.clearBackground();
        }
        this.fullRedraw = false;
    }

    @ObfuscatedName("f")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-113498730")
    final void method481() {
        Bounds var1 = this.getFrameContentBounds();
        if (((var1.highX != this.contentWidth) || (var1.highY != this.contentHeight)) || this.resizeCanvasNextFrame) {
            this.resizeCanvas();
            this.resizeCanvasNextFrame = false;
        }
    }

    @ObfuscatedName("g")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-95")
    final void method493() {
        this.resizeCanvasNextFrame = true;
    }

    @ObfuscatedName("t")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "0")
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
            this.vmethod1124();
        }
    }

    @ObfuscatedName("b")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1919454515")
    @Export("setUp")
    protected abstract void setUp();

    @ObfuscatedName("z")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "512730998")
    @Export("doCycle")
    protected abstract void doCycle();

    @ObfuscatedName("ap")
    @ObfuscatedSignature(descriptor = "(ZI)V", garbageValue = "1874168283")
    @Export("draw")
    protected abstract void draw(boolean var1);

    @ObfuscatedName("af")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-104")
    @Export("kill0")
    protected abstract void kill0();

    @ObfuscatedName("ak")
    @ObfuscatedSignature(descriptor = "(ILjava/lang/String;ZS)V", garbageValue = "12184")
    @Export("drawInitial")
    protected final void drawInitial(int var1, String var2, boolean var3) {
        try {
            Graphics var4 = this.canvas.getGraphics();
            if (Frames.fontHelvetica13 == null) {
                Frames.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
                class263.loginScreenFontMetrics = this.canvas.getFontMetrics(Frames.fontHelvetica13);
            }
            if (var3) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, DirectByteArrayCopier.canvasWidth, NPC.canvasHeight);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Clock.field1740 == null) {
                    Clock.field1740 = this.canvas.createImage(304, 34);
                }
                Graphics var6 = Clock.field1740.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, var1 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect((var1 * 3) + 2, 2, 300 - (var1 * 3), 30);
                var6.setFont(Frames.fontHelvetica13);
                var6.setColor(Color.white);
                var6.drawString(var2, (304 - class263.loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
                var4.drawImage(Clock.field1740, (DirectByteArrayCopier.canvasWidth / 2) - 152, (NPC.canvasHeight / 2) - 18, ((ImageObserver) (null)));
            } catch (Exception var9) {
                int var7 = (DirectByteArrayCopier.canvasWidth / 2) - 152;
                int var8 = (NPC.canvasHeight / 2) - 18;
                var4.setColor(var5);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect((var7 + (var1 * 3)) + 2, var8 + 2, 300 - (var1 * 3), 30);
                var4.setFont(Frames.fontHelvetica13);
                var4.setColor(Color.white);
                var4.drawString(var2, var7 + ((304 - class263.loginScreenFontMetrics.stringWidth(var2)) / 2), var8 + 22);
            }
        } catch (Exception var10) {
            this.canvas.repaint();
        }
    }

    @ObfuscatedName("av")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1327696255")
    protected final void method449() {
        Clock.field1740 = null;
        Frames.fontHelvetica13 = null;
        class263.loginScreenFontMetrics = null;
    }

    @ObfuscatedName("ar")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V", garbageValue = "2")
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

    @ObfuscatedName("al")
    @ObfuscatedSignature(descriptor = "(I)Ljava/awt/Container;", garbageValue = "-2055722899")
    @Export("container")
    Container container() {
        return ((Container) (this.frame != null ? this.frame : this));
    }

    @ObfuscatedName("aa")
    @ObfuscatedSignature(descriptor = "(I)Lna;", garbageValue = "-498401581")
    @Export("getFrameContentBounds")
    Bounds getFrameContentBounds() {
        Container var1 = this.container();
        int var2 = Math.max(var1.getWidth(), this.field200);
        int var3 = Math.max(var1.getHeight(), this.field201);
        if (this.frame != null) {
            Insets var4 = this.frame.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Bounds(var2, var3);
    }

    @ObfuscatedName("ao")
    @ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-2040982283")
    @Export("hasFrame")
    protected final boolean hasFrame() {
        return this.frame != null;
    }

    @ObfuscatedName("ay")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1773309183")
    protected abstract void vmethod1124();

    public final void destroy() {
        if ((this == gameEngine) && (!isKilled)) {
            stopTimeMs = DirectByteArrayCopier.getServerTime();
            Language.method5813(5000L);
            this.kill();
        }
    }

    public synchronized final void paint(Graphics var1) {
        if ((this == gameEngine) && (!isKilled)) {
            this.fullRedraw = true;
            if ((DirectByteArrayCopier.getServerTime() - this.field210) > 1000L) {
                Rectangle var2 = var1.getClipBounds();
                if ((var2 == null) || ((var2.width >= DirectByteArrayCopier.canvasWidth) && (var2.height >= NPC.canvasHeight))) {
                    this.isCanvasInvalid = true;
                }
            }
        }
    }

    public void run() {
        try {
            if (TaskHandler.javaVendor != null) {
                String var1 = TaskHandler.javaVendor.toLowerCase();
                if ((var1.indexOf("sun") != (-1)) || (var1.indexOf("apple") != (-1))) {
                    String var2 = class134.javaVersion;
                    if ((((((((((var2.equals("1.1") || var2.startsWith("1.1.")) || var2.equals("1.2")) || var2.startsWith("1.2.")) || var2.equals("1.3")) || var2.startsWith("1.3.")) || var2.equals("1.4")) || var2.startsWith("1.4.")) || var2.equals("1.5")) || var2.startsWith("1.5.")) || var2.equals("1.6.0")) {
                        this.error("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; (var3 < var2.length()) && class118.isDigit(var2.charAt(var3)); ++var3) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class117.isNumber(var4) && (UserComparator7.method2464(var4) < 10)) {
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
            clock = ((Clock) (var8));
            while ((stopTimeMs == 0L) || (DirectByteArrayCopier.getServerTime() < stopTimeMs)) {
                class147.gameCyclesToDo = clock.wait(cycleDurationMillis, fiveOrOne);
                for (int var5 = 0; var5 < class147.gameCyclesToDo; ++var5) {
                    this.clientTick();
                }
                this.graphicsTick();
                this.post(this.canvas);
            } 
        } catch (Exception var7) {
            FloorDecoration.RunException_sendStackTrace(((String) (null)), var7);
            this.error("crash");
        }
        this.kill();
    }

    public final void start() {
        if ((this == gameEngine) && (!isKilled)) {
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

    public final void focusLost(FocusEvent var1) {
        volatileFocus = false;
    }

    public final void windowActivated(WindowEvent var1) {
    }

    public final void windowClosed(WindowEvent var1) {
    }

    public final void windowDeactivated(WindowEvent var1) {
    }

    public final void windowDeiconified(WindowEvent var1) {
    }

    public final void windowIconified(WindowEvent var1) {
    }

    public final void windowOpened(WindowEvent var1) {
    }

    public abstract void init();

    public final void stop() {
        if ((this == gameEngine) && (!isKilled)) {
            stopTimeMs = DirectByteArrayCopier.getServerTime() + 4000L;
        }
    }

    public final void windowClosing(WindowEvent var1) {
        this.destroy();
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-38753022")
    @Export("savePreferences")
    static void savePreferences() {
        AccessFile var0 = null;
        try {
            var0 = VarbitComposition.getPreferencesFile("", HorizontalAlignment.field1846.name, true);
            Buffer var1 = class424.clientPreferences.toBuffer();
            var0.write(var1.array, 0, var1.offset);
        } catch (Exception var3) {
        }
        try {
            if (var0 != null) {
                var0.closeSync(true);
            }
        } catch (Exception var2) {
        }
    }

    @ObfuscatedName("iy")
    @ObfuscatedSignature(descriptor = "(IIIILjava/lang/String;I)V", garbageValue = "-1621596598")
    @Export("widgetDefaultMenuAction")
    static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
        Widget var5 = ModeWhere.getWidgetChild(var1, var2);
        if (var5 != null) {
            if (var5.onOp != null) {
                ScriptEvent var6 = new ScriptEvent();
                var6.widget = var5;
                var6.opIndex = var0;
                var6.targetName = var4;
                var6.args = var5.onOp;
                class92.runScriptEvent(var6);
            }
            boolean var8 = true;
            if (var5.contentType > 0) {
                var8 = LoginScreenAnimation.method2218(var5);
            }
            if (var8) {
                if (ClientPacket.method4979(Language.getWidgetFlags(var5), var0 - 1)) {
                    PacketBufferNode var7;
                    if (var0 == 1) {
                        var7 = class135.getPacketBufferNode(ClientPacket.IF_BUTTON1, Client.packetWriter.isaacCipher);
                        var7.packetBuffer.writeInt(var1);
                        var7.packetBuffer.writeShort(var2);
                        var7.packetBuffer.writeShort(var3);
                        Client.packetWriter.addNode(var7);
                    }
                    if (var0 == 2) {
                        var7 = class135.getPacketBufferNode(ClientPacket.IF_BUTTON2, Client.packetWriter.isaacCipher);
                        var7.packetBuffer.writeInt(var1);
                        var7.packetBuffer.writeShort(var2);
                        var7.packetBuffer.writeShort(var3);
                        Client.packetWriter.addNode(var7);
                    }
                    if (var0 == 3) {
                        var7 = class135.getPacketBufferNode(ClientPacket.IF_BUTTON3, Client.packetWriter.isaacCipher);
                        var7.packetBuffer.writeInt(var1);
                        var7.packetBuffer.writeShort(var2);
                        var7.packetBuffer.writeShort(var3);
                        Client.packetWriter.addNode(var7);
                    }
                    if (var0 == 4) {
                        var7 = class135.getPacketBufferNode(ClientPacket.IF_BUTTON4, Client.packetWriter.isaacCipher);
                        var7.packetBuffer.writeInt(var1);
                        var7.packetBuffer.writeShort(var2);
                        var7.packetBuffer.writeShort(var3);
                        Client.packetWriter.addNode(var7);
                    }
                    if (var0 == 5) {
                        var7 = class135.getPacketBufferNode(ClientPacket.IF_BUTTON5, Client.packetWriter.isaacCipher);
                        var7.packetBuffer.writeInt(var1);
                        var7.packetBuffer.writeShort(var2);
                        var7.packetBuffer.writeShort(var3);
                        Client.packetWriter.addNode(var7);
                    }
                    if (var0 == 6) {
                        var7 = class135.getPacketBufferNode(ClientPacket.IF_BUTTON6, Client.packetWriter.isaacCipher);
                        var7.packetBuffer.writeInt(var1);
                        var7.packetBuffer.writeShort(var2);
                        var7.packetBuffer.writeShort(var3);
                        Client.packetWriter.addNode(var7);
                    }
                    if (var0 == 7) {
                        var7 = class135.getPacketBufferNode(ClientPacket.IF_BUTTON7, Client.packetWriter.isaacCipher);
                        var7.packetBuffer.writeInt(var1);
                        var7.packetBuffer.writeShort(var2);
                        var7.packetBuffer.writeShort(var3);
                        Client.packetWriter.addNode(var7);
                    }
                    if (var0 == 8) {
                        var7 = class135.getPacketBufferNode(ClientPacket.IF_BUTTON8, Client.packetWriter.isaacCipher);
                        var7.packetBuffer.writeInt(var1);
                        var7.packetBuffer.writeShort(var2);
                        var7.packetBuffer.writeShort(var3);
                        Client.packetWriter.addNode(var7);
                    }
                    if (var0 == 9) {
                        var7 = class135.getPacketBufferNode(ClientPacket.IF_BUTTON9, Client.packetWriter.isaacCipher);
                        var7.packetBuffer.writeInt(var1);
                        var7.packetBuffer.writeShort(var2);
                        var7.packetBuffer.writeShort(var3);
                        Client.packetWriter.addNode(var7);
                    }
                    if (var0 == 10) {
                        var7 = class135.getPacketBufferNode(ClientPacket.IF_BUTTON10, Client.packetWriter.isaacCipher);
                        var7.packetBuffer.writeInt(var1);
                        var7.packetBuffer.writeShort(var2);
                        var7.packetBuffer.writeShort(var3);
                        Client.packetWriter.addNode(var7);
                    }
                }
            }
        }
    }
}