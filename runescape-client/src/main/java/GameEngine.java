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

@ObfuscatedName("aj")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lfg;"
   )
   @Export("taskHandler")
   protected static TaskHandler taskHandler;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Laj;"
   )
   @Export("gameEngine")
   static GameEngine gameEngine = null;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1222145989
   )
   @Export("GameEngine_redundantStartThreadCount")
   static int GameEngine_redundantStartThreadCount = 0;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      longValue = -7158508282885774545L
   )
   @Export("stopTimeMs")
   static long stopTimeMs = 0L;
   @ObfuscatedName("j")
   @Export("isKilled")
   static boolean isKilled = false;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1345986471
   )
   @Export("cycleDurationMillis")
   static int cycleDurationMillis = 20;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1941087105
   )
   @Export("fiveOrOne")
   static int fiveOrOne = 1;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1457718443
   )
   @Export("fps")
   protected static int fps = 0;
   @ObfuscatedName("m")
   @Export("graphicsTickTimes")
   static long[] graphicsTickTimes = new long[32];
   @ObfuscatedName("h")
   @Export("clientTickTimes")
   static long[] clientTickTimes = new long[32];
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 949672115
   )
   @Export("canvasWidth")
   public static int canvasWidth;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 642074987
   )
   static int field227 = 500;
   @ObfuscatedName("ae")
   @Export("volatileFocus")
   static volatile boolean volatileFocus = true;
   @ObfuscatedName("ah")
   @Export("hasFocus")
   protected static boolean hasFocus;
   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "Ly;"
   )
   @Export("keyHandler")
   protected static KeyHandler keyHandler = new KeyHandler();
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      longValue = 8447261131994096925L
   )
   @Export("garbageCollectorLastCollectionTime")
   static long garbageCollectorLastCollectionTime = -1L;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      longValue = -5456854692154052241L
   )
   @Export("garbageCollectorLastCheckTimeMs")
   static long garbageCollectorLastCheckTimeMs = -1L;
   @ObfuscatedName("fx")
   @ObfuscatedSignature(
      descriptor = "Llm;"
   )
   @Export("archive19")
   static Archive archive19;
   @ObfuscatedName("i")
   @Export("hasErrored")
   boolean hasErrored = false;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 234490277
   )
   @Export("contentWidth")
   protected int contentWidth;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 984448259
   )
   @Export("contentHeight")
   protected int contentHeight;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 498385779
   )
   @Export("canvasX")
   int canvasX = 0;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 367830535
   )
   @Export("canvasY")
   int canvasY = 0;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 508658727
   )
   int field224;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -1376734783
   )
   int field221;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -2102256141
   )
   @Export("maxCanvasWidth")
   int maxCanvasWidth;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 592244155
   )
   @Export("maxCanvasHeight")
   int maxCanvasHeight;
   @ObfuscatedName("ar")
   @Export("frame")
   Frame frame;
   @ObfuscatedName("al")
   @Export("canvas")
   java.awt.Canvas canvas;
   @ObfuscatedName("at")
   @Export("fullRedraw")
   volatile boolean fullRedraw = true;
   @ObfuscatedName("az")
   @Export("resizeCanvasNextFrame")
   boolean resizeCanvasNextFrame = false;
   @ObfuscatedName("ap")
   @Export("isCanvasInvalid")
   volatile boolean isCanvasInvalid = false;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      longValue = -4388351395459595055L
   )
   volatile long field228 = 0L;
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lq;"
   )
   @Export("mouseWheelHandler")
   MouseWheelHandler mouseWheelHandler;
   @ObfuscatedName("ak")
   @Export("clipboard")
   Clipboard clipboard;
   @ObfuscatedName("au")
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
      class157.pcmPlayerProvider = var2;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "2005147940"
   )
   @Export("setMaxCanvasSize")
   protected final void setMaxCanvasSize(int var1, int var2) {
      if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) {
         this.method517();
      }

      this.maxCanvasWidth = var1;
      this.maxCanvasHeight = var2;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;I)V",
      garbageValue = "453250447"
   )
   @Export("post")
   final void post(Object var1) {
      if (this.eventQueue != null) {
         for(int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
            Clock.method3567(1L);
         }

         if (var1 != null) {
            this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
         }

      }
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)Lfr;",
      garbageValue = "-2125493194"
   )
   @Export("mouseWheel")
   protected class170 mouseWheel() {
      if (this.mouseWheelHandler == null) {
         this.mouseWheelHandler = new MouseWheelHandler();
         this.mouseWheelHandler.addTo(this.canvas);
      }

      return this.mouseWheelHandler;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "663192476"
   )
   @Export("setUpClipboard")
   protected void setUpClipboard() {
      this.clipboard = this.getToolkit().getSystemClipboard();
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "2069299723"
   )
   protected void method501(String var1) {
      this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null);
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/awt/datatransfer/Clipboard;",
      garbageValue = "2004102528"
   )
   protected Clipboard method502() {
      return this.clipboard;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1034091676"
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

      keyHandler.method354(this.canvas);
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-90"
   )
   protected final void method521() {
      keyHandler.method356();
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(Lag;II)V",
      garbageValue = "1002490687"
   )
   protected void method505(class29 var1, int var2) {
      keyHandler.method352(var1, var2);
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-206278117"
   )
   protected final void method506() {
      java.awt.Canvas var1 = this.canvas;
      var1.addMouseListener(MouseHandler.MouseHandler_instance);
      var1.addMouseMotionListener(MouseHandler.MouseHandler_instance);
      var1.addFocusListener(MouseHandler.MouseHandler_instance);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1826842990"
   )
   @Export("resizeCanvas")
   final void resizeCanvas() {
      Container var1 = this.container();
      if (var1 != null) {
         Bounds var2 = this.getFrameContentBounds();
         this.contentWidth = Math.max(var2.highX, this.field224);
         this.contentHeight = Math.max(var2.highY, this.field221);
         if (this.contentWidth <= 0) {
            this.contentWidth = 1;
         }

         if (this.contentHeight <= 0) {
            this.contentHeight = 1;
         }

         canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
         class127.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
         this.canvasX = (this.contentWidth - canvasWidth) / 2;
         this.canvasY = 0;
         this.canvas.setSize(canvasWidth, class127.canvasHeight);
         KeyHandler.rasterProvider = new RasterProvider(canvasWidth, class127.canvasHeight, this.canvas);
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

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1977939270"
   )
   @Export("resizeGame")
   protected abstract void resizeGame();

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-117"
   )
   @Export("clearBackground")
   void clearBackground() {
      int var1 = this.canvasX;
      int var2 = this.canvasY;
      int var3 = this.contentWidth - canvasWidth - var1;
      int var4 = this.contentHeight - class127.canvasHeight - var2;
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

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1983896831"
   )
   @Export("replaceCanvas")
   final void replaceCanvas() {
      keyHandler.method372(this.canvas);
      NewStuff.method3717(this.canvas);
      if (this.mouseWheelHandler != null) {
         this.mouseWheelHandler.method308(this.canvas);
      }

      this.addCanvas();
      keyHandler.method354(this.canvas);
      java.awt.Canvas var1 = this.canvas;
      var1.addMouseListener(MouseHandler.MouseHandler_instance);
      var1.addMouseMotionListener(MouseHandler.MouseHandler_instance);
      var1.addFocusListener(MouseHandler.MouseHandler_instance);
      if (this.mouseWheelHandler != null) {
         this.mouseWheelHandler.addTo(this.canvas);
      }

      this.method517();
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "-230132207"
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
         class127.canvasHeight = var2;
         RunException.RunException_revision = var3;
         RunException.field5089 = var4;
         RunException.RunException_applet = this;
         if (taskHandler == null) {
            taskHandler = new TaskHandler();
         }

         taskHandler.newThreadTask(this, 1);
      } catch (Exception var6) {
         class121.RunException_sendStackTrace((String)null, var6);
         this.error("crash");
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-65380037"
   )
   @Export("addCanvas")
   final synchronized void addCanvas() {
      Container var1 = this.container();
      if (this.canvas != null) {
         this.canvas.removeFocusListener(this);
         var1.remove(this.canvas);
      }

      canvasWidth = Math.max(var1.getWidth(), this.field224);
      class127.canvasHeight = Math.max(var1.getHeight(), this.field221);
      Insets var2;
      if (this.frame != null) {
         var2 = this.frame.getInsets();
         canvasWidth -= var2.right + var2.left;
         class127.canvasHeight -= var2.bottom + var2.top;
      }

      this.canvas = new Canvas(this);
      var1.setBackground(Color.BLACK);
      var1.setLayout((LayoutManager)null);
      var1.add(this.canvas);
      this.canvas.setSize(canvasWidth, class127.canvasHeight);
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
      if (KeyHandler.rasterProvider != null && canvasWidth == KeyHandler.rasterProvider.width && class127.canvasHeight == KeyHandler.rasterProvider.height) {
         ((RasterProvider)KeyHandler.rasterProvider).setComponent(this.canvas);
         KeyHandler.rasterProvider.drawFull(0, 0);
      } else {
         KeyHandler.rasterProvider = new RasterProvider(canvasWidth, class127.canvasHeight, this.canvas);
      }

      this.isCanvasInvalid = false;
      this.field228 = class153.method3317();
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1655777460"
   )
   @Export("checkHost")
   protected final boolean checkHost() {
      String var1 = this.getDocumentBase().getHost().toLowerCase();
      if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) {
         if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) {
            if (var1.endsWith("127.0.0.1")) {
               return true;
            } else {
               while(var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
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
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "753394225"
   )
   @Export("clientTick")
   void clientTick() {
      long var1 = class153.method3317();
      long var3 = clientTickTimes[ReflectionCheck.field279];
      clientTickTimes[ReflectionCheck.field279] = var1;
      ReflectionCheck.field279 = ReflectionCheck.field279 + 1 & 31;
      if (0L != var3 && var1 > var3) {
      }

      synchronized(this) {
         hasFocus = volatileFocus;
      }

      this.doCycle();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1164403462"
   )
   @Export("graphicsTick")
   void graphicsTick() {
      Container var1 = this.container();
      long var2 = class153.method3317();
      long var4 = graphicsTickTimes[class20.field117];
      graphicsTickTimes[class20.field117] = var2;
      class20.field117 = class20.field117 + 1 & 31;
      if (0L != var4 && var2 > var4) {
         int var6 = (int)(var2 - var4);
         fps = ((var6 >> 1) + 32000) / var6;
      }

      if (++field227 - 1 > 50) {
         field227 -= 50;
         this.fullRedraw = true;
         this.canvas.setSize(canvasWidth, class127.canvasHeight);
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

      this.method516();
      this.draw(this.fullRedraw);
      if (this.fullRedraw) {
         this.clearBackground();
      }

      this.fullRedraw = false;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1962102591"
   )
   final void method516() {
      Bounds var1 = this.getFrameContentBounds();
      if (var1.highX != this.contentWidth || var1.highY != this.contentHeight || this.resizeCanvasNextFrame) {
         this.resizeCanvas();
         this.resizeCanvasNextFrame = false;
      }

   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1743407922"
   )
   final void method517() {
      this.resizeCanvasNextFrame = true;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2049964253"
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

         this.vmethod1338();
      }
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1082760075"
   )
   @Export("setUp")
   protected abstract void setUp();

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1127205702"
   )
   @Export("doCycle")
   protected abstract void doCycle();

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "1484603297"
   )
   @Export("draw")
   protected abstract void draw(boolean var1);

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1860938943"
   )
   @Export("kill0")
   protected abstract void kill0();

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;ZI)V",
      garbageValue = "-375774379"
   )
   @Export("drawInitial")
   protected final void drawInitial(int var1, String var2, boolean var3) {
      try {
         Graphics var4 = this.canvas.getGraphics();
         if (class1.fontHelvetica13 == null) {
            class1.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
            class153.loginScreenFontMetrics = this.canvas.getFontMetrics(class1.fontHelvetica13);
         }

         if (var3) {
            var4.setColor(Color.black);
            var4.fillRect(0, 0, canvasWidth, class127.canvasHeight);
         }

         Color var5 = new Color(140, 17, 17);

         try {
            if (class364.field4369 == null) {
               class364.field4369 = this.canvas.createImage(304, 34);
            }

            Graphics var6 = class364.field4369.getGraphics();
            var6.setColor(var5);
            var6.drawRect(0, 0, 303, 33);
            var6.fillRect(2, 2, var1 * 3, 30);
            var6.setColor(Color.black);
            var6.drawRect(1, 1, 301, 31);
            var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
            var6.setFont(class1.fontHelvetica13);
            var6.setColor(Color.white);
            var6.drawString(var2, (304 - class153.loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
            var4.drawImage(class364.field4369, canvasWidth / 2 - 152, class127.canvasHeight / 2 - 18, (ImageObserver)null);
         } catch (Exception var9) {
            int var7 = canvasWidth / 2 - 152;
            int var8 = class127.canvasHeight / 2 - 18;
            var4.setColor(var5);
            var4.drawRect(var7, var8, 303, 33);
            var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30);
            var4.setColor(Color.black);
            var4.drawRect(var7 + 1, var8 + 1, 301, 31);
            var4.fillRect(var7 + var1 * 3 + 2, var8 + 2, 300 - var1 * 3, 30);
            var4.setFont(class1.fontHelvetica13);
            var4.setColor(Color.white);
            var4.drawString(var2, var7 + (304 - class153.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22);
         }
      } catch (Exception var10) {
         this.canvas.repaint();
      }

   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "-20714"
   )
   protected final void method632() {
      class364.field4369 = null;
      class1.fontHelvetica13 = null;
      class153.loginScreenFontMetrics = null;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-608170522"
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

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/awt/Container;",
      garbageValue = "101"
   )
   @Export("container")
   Container container() {
      return (Container)(this.frame != null ? this.frame : this);
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(I)Loj;",
      garbageValue = "-1593123346"
   )
   @Export("getFrameContentBounds")
   Bounds getFrameContentBounds() {
      Container var1 = this.container();
      int var2 = Math.max(var1.getWidth(), this.field224);
      int var3 = Math.max(var1.getHeight(), this.field221);
      if (this.frame != null) {
         Insets var4 = this.frame.getInsets();
         var2 -= var4.right + var4.left;
         var3 -= var4.top + var4.bottom;
      }

      return new Bounds(var2, var3);
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-192910334"
   )
   @Export("hasFrame")
   protected final boolean hasFrame() {
      return this.frame != null;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1991813544"
   )
   protected abstract void vmethod1338();

   public final void destroy() {
      if (this == gameEngine && !isKilled) {
         stopTimeMs = class153.method3317();
         Clock.method3567(5000L);
         this.kill();
      }
   }

   public final synchronized void paint(Graphics var1) {
      if (this == gameEngine && !isKilled) {
         this.fullRedraw = true;
         if (class153.method3317() - this.field228 > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if (var2 == null || var2.width >= canvasWidth && var2.height >= class127.canvasHeight) {
               this.isCanvasInvalid = true;
            }
         }

      }
   }

   public final void windowActivated(WindowEvent var1) {
   }

   public final void start() {
      if (this == gameEngine && !isKilled) {
         stopTimeMs = 0L;
      }
   }

   public final void stop() {
      if (this == gameEngine && !isKilled) {
         stopTimeMs = class153.method3317() + 4000L;
      }
   }

   public final void windowClosing(WindowEvent var1) {
      this.destroy();
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

   public final void windowDeiconified(WindowEvent var1) {
   }

   public final void windowIconified(WindowEvent var1) {
   }

   public final void windowOpened(WindowEvent var1) {
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
                  for(var3 = 6; var3 < var2.length() && CollisionMap.isDigit(var2.charAt(var3)); ++var3) {
                  }

                  String var4 = var2.substring(6, var3);
                  if (class142.isNumber(var4) && WorldMapScaleHandler.method5468(var4) < 10) {
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
         class177.clock = class161.method3385();

         while(0L == stopTimeMs || class153.method3317() < stopTimeMs) {
            InterfaceParent.gameCyclesToDo = class177.clock.wait(cycleDurationMillis, fiveOrOne);

            for(int var5 = 0; var5 < InterfaceParent.gameCyclesToDo; ++var5) {
               this.clientTick();
            }

            this.graphicsTick();
            this.post(this.canvas);
         }
      } catch (Exception var6) {
         class121.RunException_sendStackTrace((String)null, var6);
         this.error("crash");
      }

      this.kill();
   }

   public final void windowDeactivated(WindowEvent var1) {
   }

   public final void update(Graphics var1) {
      this.paint(var1);
   }
}
