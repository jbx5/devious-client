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
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bm")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lgd;"
   )
   @Export("taskHandler")
   protected static TaskHandler taskHandler;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lbm;"
   )
   @Export("gameEngine")
   static GameEngine gameEngine = null;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 1470919505
   )
   @Export("GameEngine_redundantStartThreadCount")
   static int GameEngine_redundantStartThreadCount = 0;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      longValue = 951500247553634275L
   )
   @Export("stopTimeMs")
   static long stopTimeMs = 0L;
   @ObfuscatedName("au")
   @Export("isKilled")
   static boolean isKilled = false;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 2118369515
   )
   @Export("cycleDurationMillis")
   static int cycleDurationMillis = 20;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1500331287
   )
   @Export("fiveOrOne")
   static int fiveOrOne = 1;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 1913114939
   )
   @Export("fps")
   protected static int fps = 0;
   @ObfuscatedName("ax")
   @Export("graphicsTickTimes")
   static long[] graphicsTickTimes = new long[32];
   @ObfuscatedName("ag")
   @Export("clientTickTimes")
   static long[] clientTickTimes = new long[32];
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -1687260435
   )
   @Export("canvasWidth")
   public static int canvasWidth;
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = 148605821
   )
   static int field219 = 500;
   @ObfuscatedName("bu")
   @Export("volatileFocus")
   static volatile boolean volatileFocus = true;
   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "Lap;"
   )
   @Export("keyHandler")
   protected static KeyHandler keyHandler = new KeyHandler();
   @ObfuscatedName("bv")
   @ObfuscatedGetter(
      longValue = -3199239881614683375L
   )
   @Export("garbageCollectorLastCollectionTime")
   static long garbageCollectorLastCollectionTime = -1L;
   @ObfuscatedName("bl")
   @ObfuscatedGetter(
      longValue = 9118577410129870745L
   )
   @Export("garbageCollectorLastCheckTimeMs")
   static long garbageCollectorLastCheckTimeMs = -1L;
   @ObfuscatedName("mh")
   @ObfuscatedGetter(
      intValue = -1727408401
   )
   @Export("Client_plane")
   static int Client_plane;
   @ObfuscatedName("ab")
   @Export("hasErrored")
   boolean hasErrored = false;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -927540391
   )
   @Export("contentWidth")
   protected int contentWidth;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -1747234661
   )
   @Export("contentHeight")
   protected int contentHeight;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -744210797
   )
   @Export("canvasX")
   int canvasX = 0;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 895830209
   )
   @Export("canvasY")
   int canvasY = 0;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = 69014751
   )
   int field211;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 1673949127
   )
   int field212;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 2087275977
   )
   @Export("maxCanvasWidth")
   int maxCanvasWidth;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 83534669
   )
   @Export("maxCanvasHeight")
   int maxCanvasHeight;
   @ObfuscatedName("by")
   protected boolean field215 = false;
   @ObfuscatedName("be")
   @Export("frame")
   Frame frame;
   @ObfuscatedName("bk")
   @Export("canvas")
   java.awt.Canvas canvas;
   @ObfuscatedName("bx")
   @Export("fullRedraw")
   volatile boolean fullRedraw = true;
   @ObfuscatedName("bm")
   @Export("resizeCanvasNextFrame")
   boolean resizeCanvasNextFrame = false;
   @ObfuscatedName("bd")
   @Export("isCanvasInvalid")
   volatile boolean isCanvasInvalid = false;
   @ObfuscatedName("bt")
   @ObfuscatedGetter(
      longValue = -6171487387477770437L
   )
   volatile long field204 = 0L;
   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "Lak;"
   )
   @Export("mouseWheelHandler")
   MouseWheelHandler mouseWheelHandler;
   @ObfuscatedName("br")
   @Export("clipboard")
   Clipboard clipboard;
   @ObfuscatedName("bg")
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
      PcmPlayer.pcmPlayerProvider = var2;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "2"
   )
   @Export("setMaxCanvasSize")
   protected final void setMaxCanvasSize(int var1, int var2) {
      if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) {
         this.method600();
      }

      this.maxCanvasWidth = var1;
      this.maxCanvasHeight = var2;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;I)V",
      garbageValue = "1513004820"
   )
   @Export("post")
   final void post(Object var1) {
      if (this.eventQueue != null) {
         for(int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
            PlayerComposition.method6084(1L);
         }

         if (var1 != null) {
            this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
         }

      }
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(I)Lgf;",
      garbageValue = "1822835590"
   )
   @Export("mouseWheel")
   protected class170 mouseWheel() {
      if (this.mouseWheelHandler == null) {
         this.mouseWheelHandler = new MouseWheelHandler();
         this.mouseWheelHandler.addTo(this.canvas);
      }

      return this.mouseWheelHandler;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1981115082"
   )
   @Export("setUpClipboard")
   protected void setUpClipboard() {
      this.clipboard = this.getToolkit().getSystemClipboard();
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)V",
      garbageValue = "-94"
   )
   protected void method555(String var1) {
      this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null);
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/awt/datatransfer/Clipboard;",
      garbageValue = "-481768005"
   )
   protected Clipboard method520() {
      return this.clipboard;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "39"
   )
   @Export("setUpKeyboard")
   protected final void setUpKeyboard() {
      class158.method3413();
      keyHandler.method355(this.canvas);
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "95"
   )
   protected final void method540() {
      keyHandler.method357();
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(Lbe;IB)V",
      garbageValue = "-45"
   )
   protected void method523(class29 var1, int var2) {
      keyHandler.method353(var1, var2);
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "62"
   )
   protected final void method649() {
      class394.method7672(this.canvas);
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1698796359"
   )
   @Export("resizeCanvas")
   final void resizeCanvas() {
      Container var1 = this.container();
      if (var1 != null) {
         Bounds var2 = this.getFrameContentBounds();
         this.contentWidth = Math.max(var2.highX, this.field211);
         this.contentHeight = Math.max(var2.highY, this.field212);
         if (this.contentWidth <= 0) {
            this.contentWidth = 1;
         }

         if (this.contentHeight <= 0) {
            this.contentHeight = 1;
         }

         canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
         class262.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
         this.canvasX = (this.contentWidth - canvasWidth) / 2;
         this.canvasY = 0;
         this.canvas.setSize(canvasWidth, class262.canvasHeight);
         RouteStrategy.rasterProvider = new RasterProvider(canvasWidth, class262.canvasHeight, this.canvas, this.field215);
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

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "79"
   )
   @Export("resizeGame")
   protected abstract void resizeGame();

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "23"
   )
   @Export("clearBackground")
   void clearBackground() {
      int var1 = this.canvasX;
      int var2 = this.canvasY;
      int var3 = this.contentWidth - canvasWidth - var1;
      int var4 = this.contentHeight - class262.canvasHeight - var2;
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
      descriptor = "(I)V",
      garbageValue = "1142186209"
   )
   @Export("replaceCanvas")
   final void replaceCanvas() {
      keyHandler.method370(this.canvas);
      java.awt.Canvas var1 = this.canvas;
      var1.removeMouseListener(MouseHandler.MouseHandler_instance);
      var1.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
      var1.removeFocusListener(MouseHandler.MouseHandler_instance);
      MouseHandler.MouseHandler_currentButtonVolatile = 0;
      if (this.mouseWheelHandler != null) {
         this.mouseWheelHandler.method308(this.canvas);
      }

      this.addCanvas();
      keyHandler.method355(this.canvas);
      class394.method7672(this.canvas);
      if (this.mouseWheelHandler != null) {
         this.mouseWheelHandler.addTo(this.canvas);
      }

      this.method600();
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(IIIIB)V",
      garbageValue = "-75"
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
         class262.canvasHeight = var2;
         RunException.RunException_revision = var3;
         class441.field4731 = var4;
         class100.RunException_applet = this;
         if (taskHandler == null) {
            taskHandler = new TaskHandler();
         }

         taskHandler.newThreadTask(this, 1);
      } catch (Exception var6) {
         class387.RunException_sendStackTrace((String)null, var6);
         this.error("crash");
      }

   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1549595366"
   )
   @Export("addCanvas")
   final synchronized void addCanvas() {
      Container var1 = this.container();
      if (this.canvas != null) {
         this.canvas.removeFocusListener(this);
         var1.remove(this.canvas);
      }

      canvasWidth = Math.max(var1.getWidth(), this.field211);
      class262.canvasHeight = Math.max(var1.getHeight(), this.field212);
      Insets var2;
      if (this.frame != null) {
         var2 = this.frame.getInsets();
         canvasWidth -= var2.right + var2.left;
         class262.canvasHeight -= var2.bottom + var2.top;
      }

      this.canvas = new Canvas(this);
      var1.setBackground(Color.BLACK);
      var1.setLayout((LayoutManager)null);
      var1.add(this.canvas);
      this.canvas.setSize(canvasWidth, class262.canvasHeight);
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
      if (RouteStrategy.rasterProvider != null && canvasWidth == RouteStrategy.rasterProvider.width && class262.canvasHeight == RouteStrategy.rasterProvider.height) {
         ((RasterProvider)RouteStrategy.rasterProvider).setComponent(this.canvas);
         RouteStrategy.rasterProvider.drawFull(0, 0);
      } else {
         RouteStrategy.rasterProvider = new RasterProvider(canvasWidth, class262.canvasHeight, this.canvas, this.field215);
      }

      this.isCanvasInvalid = false;
      this.field204 = class96.method2634();
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "14"
   )
   protected void method531(boolean var1) {
      if (this.field215 != var1) {
         this.field215 = var1;
         RouteStrategy.rasterProvider.method9458(var1);
         RouteStrategy.rasterProvider.apply();
      }

   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "524669560"
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

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1294253430"
   )
   @Export("clientTick")
   void clientTick() {
      long var1 = class96.method2634();
      long var3 = clientTickTimes[class335.field3834];
      clientTickTimes[class335.field3834] = var1;
      class335.field3834 = class335.field3834 + 1 & 31;
      if (var3 != 0L && var1 > var3) {
      }

      synchronized(this) {
         AbstractByteArrayCopier.hasFocus = volatileFocus;
      }

      this.doCycle();
   }

   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "29"
   )
   @Export("graphicsTick")
   void graphicsTick() {
      Container var1 = this.container();
      long var2 = class96.method2634();
      long var4 = graphicsTickTimes[Rasterizer3D.field2520];
      graphicsTickTimes[Rasterizer3D.field2520] = var2;
      Rasterizer3D.field2520 = Rasterizer3D.field2520 + 1 & 31;
      if (0L != var4 && var2 > var4) {
         int var6 = (int)(var2 - var4);
         fps = ((var6 >> 1) + 32000) / var6;
      }

      if (++field219 - 1 > 50) {
         field219 -= 50;
         this.fullRedraw = true;
         this.canvas.setSize(canvasWidth, class262.canvasHeight);
         this.canvas.setVisible(true);
         if (var1 == this.frame) {
            Insets var7 = this.frame.getInsets();
            this.canvas.setLocation(this.canvasX + var7.left, var7.top + this.canvasY);
         } else {
            this.canvas.setLocation(this.canvasX, this.canvasY);
         }
      }

      if (this.isCanvasInvalid) {
         this.replaceCanvas();
      }

      this.method535();
      this.draw(this.fullRedraw);
      if (this.fullRedraw) {
         this.clearBackground();
      }

      this.fullRedraw = false;
   }

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1941798605"
   )
   final void method535() {
      Bounds var1 = this.getFrameContentBounds();
      if (var1.highX != this.contentWidth || this.contentHeight != var1.highY || this.resizeCanvasNextFrame) {
         this.resizeCanvas();
         this.resizeCanvasNextFrame = false;
      }

   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2091423650"
   )
   final void method600() {
      this.resizeCanvasNextFrame = true;
   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "812160949"
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

         this.vmethod1452();
      }
   }

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "42"
   )
   @Export("setUp")
   protected abstract void setUp();

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2106306379"
   )
   @Export("doCycle")
   protected abstract void doCycle();

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "(ZS)V",
      garbageValue = "7737"
   )
   @Export("draw")
   protected abstract void draw(boolean var1);

   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-72974483"
   )
   @Export("kill0")
   protected abstract void kill0();

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;ZI)V",
      garbageValue = "-2001673745"
   )
   @Export("drawInitial")
   protected final void drawInitial(int var1, String var2, boolean var3) {
      try {
         Graphics var4 = this.canvas.getGraphics();
         if (class244.fontHelvetica13 == null) {
            class244.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
            class27.loginScreenFontMetrics = this.canvas.getFontMetrics(class244.fontHelvetica13);
         }

         if (var3) {
            var4.setColor(Color.black);
            var4.fillRect(0, 0, canvasWidth, class262.canvasHeight);
         }

         Color var5 = new Color(140, 17, 17);

         try {
            if (PacketWriter.field1394 == null) {
               PacketWriter.field1394 = this.canvas.createImage(304, 34);
            }

            Graphics var6 = PacketWriter.field1394.getGraphics();
            var6.setColor(var5);
            var6.drawRect(0, 0, 303, 33);
            var6.fillRect(2, 2, var1 * 3, 30);
            var6.setColor(Color.black);
            var6.drawRect(1, 1, 301, 31);
            var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
            var6.setFont(class244.fontHelvetica13);
            var6.setColor(Color.white);
            var6.drawString(var2, (304 - class27.loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
            var4.drawImage(PacketWriter.field1394, canvasWidth / 2 - 152, class262.canvasHeight / 2 - 18, (ImageObserver)null);
         } catch (Exception var9) {
            int var7 = canvasWidth / 2 - 152;
            int var8 = class262.canvasHeight / 2 - 18;
            var4.setColor(var5);
            var4.drawRect(var7, var8, 303, 33);
            var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30);
            var4.setColor(Color.black);
            var4.drawRect(var7 + 1, var8 + 1, 301, 31);
            var4.fillRect(var1 * 3 + var7 + 2, var8 + 2, 300 - var1 * 3, 30);
            var4.setFont(class244.fontHelvetica13);
            var4.setColor(Color.white);
            var4.drawString(var2, var7 + (304 - class27.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22);
         }
      } catch (Exception var10) {
         this.canvas.repaint();
      }

   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-274523606"
   )
   protected final void method644() {
      PacketWriter.field1394 = null;
      class244.fontHelvetica13 = null;
      class27.loginScreenFontMetrics = null;
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-1294118678"
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

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/awt/Container;",
      garbageValue = "6"
   )
   @Export("container")
   Container container() {
      return (Container)(this.frame != null ? this.frame : this);
   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "(I)Lqu;",
      garbageValue = "-1516355947"
   )
   @Export("getFrameContentBounds")
   Bounds getFrameContentBounds() {
      Container var1 = this.container();
      int var2 = Math.max(var1.getWidth(), this.field211);
      int var3 = Math.max(var1.getHeight(), this.field212);
      if (this.frame != null) {
         Insets var4 = this.frame.getInsets();
         var2 -= var4.right + var4.left;
         var3 -= var4.top + var4.bottom;
      }

      return new Bounds(var2, var3);
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "972866614"
   )
   @Export("hasFrame")
   protected final boolean hasFrame() {
      return this.frame != null;
   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1086551379"
   )
   protected abstract void vmethod1452();

   public final void destroy() {
      if (this == gameEngine && !isKilled) {
         stopTimeMs = class96.method2634();
         PlayerComposition.method6084(5000L);
         this.kill();
      }
   }

   public final synchronized void paint(Graphics var1) {
      if (this == gameEngine && !isKilled) {
         this.fullRedraw = true;
         if (class96.method2634() - this.field204 > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if (var2 == null || var2.width >= canvasWidth && var2.height >= class262.canvasHeight) {
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
                  for(var3 = 6; var3 < var2.length() && class149.isDigit(var2.charAt(var3)); ++var3) {
                  }

                  String var4 = var2.substring(6, var3);
                  if (WorldMapSectionType.isNumber(var4) && PacketBufferNode.method5709(var4) < 10) {
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
         class399.clock = class148.method3284();

         while(stopTimeMs == 0L || class96.method2634() < stopTimeMs) {
            DirectByteArrayCopier.gameCyclesToDo = class399.clock.wait(cycleDurationMillis, fiveOrOne);

            for(int var5 = 0; var5 < DirectByteArrayCopier.gameCyclesToDo; ++var5) {
               this.clientTick();
            }

            this.graphicsTick();
            this.post(this.canvas);
         }
      } catch (Exception var6) {
         class387.RunException_sendStackTrace((String)null, var6);
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
         stopTimeMs = class96.method2634() + 4000L;
      }
   }

   public final void update(Graphics var1) {
      this.paint(var1);
   }

   public final void focusGained(FocusEvent var1) {
      volatileFocus = true;
      this.fullRedraw = true;
   }

   public final void windowClosing(WindowEvent var1) {
      this.destroy();
   }

   public final void windowDeactivated(WindowEvent var1) {
   }

   public final void windowIconified(WindowEvent var1) {
   }

   public final void windowOpened(WindowEvent var1) {
   }

   public abstract void init();

   public final void windowClosed(WindowEvent var1) {
   }

   public final void windowDeiconified(WindowEvent var1) {
   }

   public final void focusLost(FocusEvent var1) {
      volatileFocus = false;
   }

   public final void windowActivated(WindowEvent var1) {
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IIILhq;IB)V",
      garbageValue = "-47"
   )
   static void method684(int var0, int var1, int var2, ObjectComposition var3, int var4) {
      ObjectSound var5 = new ObjectSound();
      var5.plane = var0;
      var5.x = var1 * 16384;
      var5.y = var2 * 128;
      int var6 = var3.sizeX;
      int var7 = var3.sizeY;
      if (var4 == 1 || var4 == 3) {
         var6 = var3.sizeY;
         var7 = var3.sizeX;
      }

      var5.maxX = (var6 + var1) * 128;
      var5.maxY = (var7 + var2) * 128;
      var5.soundEffectId = var3.ambientSoundId;
      var5.field815 = var3.int7 * 128;
      var5.field824 = var3.int5;
      var5.field825 = var3.int6;
      var5.soundEffectIds = var3.soundEffectIds;
      if (var3.transforms != null) {
         var5.obj = var3;
         var5.set();
      }

      ObjectSound.objectSounds.addFirst(var5);
      if (var5.soundEffectIds != null) {
         var5.field822 = var5.field824 + (int)(Math.random() * (double)(var5.field825 - var5.field824));
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1687674321"
   )
   static void method585() {
      Iterator var0 = Messages.Messages_hashTable.iterator();

      while(var0.hasNext()) {
         Message var1 = (Message)var0.next();
         var1.clearIsFromFriend();
      }

   }
}
