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

@ObfuscatedName("an")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
   @ObfuscatedName("vo")
   @ObfuscatedSignature(
      descriptor = "Lms;"
   )
   public static class343 field241;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lan;"
   )
   @Export("gameEngine")
   static GameEngine gameEngine = null;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1203794955
   )
   @Export("GameEngine_redundantStartThreadCount")
   static int GameEngine_redundantStartThreadCount = 0;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      longValue = 4122648005638566587L
   )
   @Export("stopTimeMs")
   static long stopTimeMs = 0L;
   @ObfuscatedName("q")
   @Export("isKilled")
   static boolean isKilled = false;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 1837674965
   )
   @Export("cycleDurationMillis")
   static int cycleDurationMillis = 20;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -530252609
   )
   @Export("fiveOrOne")
   static int fiveOrOne = 1;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1522705797
   )
   @Export("fps")
   protected static int fps = 0;
   @ObfuscatedName("o")
   @Export("graphicsTickTimes")
   static long[] graphicsTickTimes = new long[32];
   @ObfuscatedName("k")
   @Export("clientTickTimes")
   static long[] clientTickTimes = new long[32];
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 2031488307
   )
   static int field230 = 500;
   @ObfuscatedName("ah")
   @Export("volatileFocus")
   static volatile boolean volatileFocus = true;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Las;"
   )
   @Export("keyHandler")
   static KeyHandler keyHandler = new KeyHandler();
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      longValue = -4832067984480184411L
   )
   @Export("garbageCollectorLastCollectionTime")
   static long garbageCollectorLastCollectionTime = -1L;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      longValue = -1788910031421667657L
   )
   @Export("garbageCollectorLastCheckTimeMs")
   static long garbageCollectorLastCheckTimeMs = -1L;
   @ObfuscatedName("f")
   @Export("hasErrored")
   boolean hasErrored = false;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1978140097
   )
   @Export("contentWidth")
   protected int contentWidth;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 49859079
   )
   @Export("contentHeight")
   protected int contentHeight;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -185229721
   )
   @Export("canvasX")
   int canvasX = 0;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1564967965
   )
   @Export("canvasY")
   int canvasY = 0;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -428984103
   )
   int field223;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -917161143
   )
   int field209;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 484486501
   )
   @Export("maxCanvasWidth")
   int maxCanvasWidth;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 401178799
   )
   @Export("maxCanvasHeight")
   int maxCanvasHeight;
   @ObfuscatedName("au")
   @Export("frame")
   Frame frame;
   @ObfuscatedName("ar")
   @Export("canvas")
   java.awt.Canvas canvas;
   @ObfuscatedName("at")
   @Export("fullRedraw")
   volatile boolean fullRedraw = true;
   @ObfuscatedName("ab")
   @Export("resizeCanvasNextFrame")
   boolean resizeCanvasNextFrame = false;
   @ObfuscatedName("al")
   @Export("isCanvasInvalid")
   volatile boolean isCanvasInvalid = false;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      longValue = -2560848732574539297L
   )
   volatile long field233 = 0L;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Ld;"
   )
   @Export("mouseWheelHandler")
   MouseWheelHandler mouseWheelHandler;
   @ObfuscatedName("ai")
   @Export("clipboard")
   Clipboard clipboard;
   @ObfuscatedName("ax")
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
      class20.pcmPlayerProvider = var2;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "1034759117"
   )
   @Export("setMaxCanvasSize")
   protected final void setMaxCanvasSize(int var1, int var2) {
      if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) {
         this.method514();
      }

      this.maxCanvasWidth = var1;
      this.maxCanvasHeight = var2;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;I)V",
      garbageValue = "812093850"
   )
   @Export("post")
   final void post(Object var1) {
      if (this.eventQueue != null) {
         for(int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
            class12.method157(1L);
         }

         if (var1 != null) {
            this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
         }

      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(I)Lff;",
      garbageValue = "815709128"
   )
   @Export("mouseWheel")
   protected class166 mouseWheel() {
      if (this.mouseWheelHandler == null) {
         this.mouseWheelHandler = new MouseWheelHandler();
         this.mouseWheelHandler.addTo(this.canvas);
      }

      return this.mouseWheelHandler;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-65"
   )
   @Export("setUpClipboard")
   protected void setUpClipboard() {
      this.clipboard = this.getToolkit().getSystemClipboard();
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;S)V",
      garbageValue = "26091"
   )
   protected void method497(String var1) {
      this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/awt/datatransfer/Clipboard;",
      garbageValue = "10"
   )
   public Clipboard method498() {
      return this.clipboard;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "316580569"
   )
   @Export("setUpKeyboard")
   protected final void setUpKeyboard() {
      if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
         class29.KeyHandler_keyCodes[186] = 57;
         class29.KeyHandler_keyCodes[187] = 27;
         class29.KeyHandler_keyCodes[188] = 71;
         class29.KeyHandler_keyCodes[189] = 26;
         class29.KeyHandler_keyCodes[190] = 72;
         class29.KeyHandler_keyCodes[191] = 73;
         class29.KeyHandler_keyCodes[192] = 58;
         class29.KeyHandler_keyCodes[219] = 42;
         class29.KeyHandler_keyCodes[220] = 74;
         class29.KeyHandler_keyCodes[221] = 43;
         class29.KeyHandler_keyCodes[222] = 59;
         class29.KeyHandler_keyCodes[223] = 28;
      } else {
         class29.KeyHandler_keyCodes[44] = 71;
         class29.KeyHandler_keyCodes[45] = 26;
         class29.KeyHandler_keyCodes[46] = 72;
         class29.KeyHandler_keyCodes[47] = 73;
         class29.KeyHandler_keyCodes[59] = 57;
         class29.KeyHandler_keyCodes[61] = 27;
         class29.KeyHandler_keyCodes[91] = 42;
         class29.KeyHandler_keyCodes[92] = 74;
         class29.KeyHandler_keyCodes[93] = 43;
         class29.KeyHandler_keyCodes[192] = 28;
         class29.KeyHandler_keyCodes[222] = 58;
         class29.KeyHandler_keyCodes[520] = 59;
      }

      keyHandler.method355(this.canvas);
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "504544713"
   )
   protected final void method500() {
      keyHandler.method361();
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(Lav;IB)V",
      garbageValue = "0"
   )
   protected void method501(class30 var1, int var2) {
      keyHandler.method353(var1, var2);
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "848418077"
   )
   protected final void method539() {
      java.awt.Canvas var1 = this.canvas;
      var1.addMouseListener(MouseHandler.MouseHandler_instance);
      var1.addMouseMotionListener(MouseHandler.MouseHandler_instance);
      var1.addFocusListener(MouseHandler.MouseHandler_instance);
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1257419471"
   )
   @Export("resizeCanvas")
   final void resizeCanvas() {
      Container var1 = this.container();
      if (var1 != null) {
         Bounds var2 = this.getFrameContentBounds();
         this.contentWidth = Math.max(var2.highX, this.field223);
         this.contentHeight = Math.max(var2.highY, this.field209);
         if (this.contentWidth <= 0) {
            this.contentWidth = 1;
         }

         if (this.contentHeight <= 0) {
            this.contentHeight = 1;
         }

         CollisionMap.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
         Language.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
         this.canvasX = (this.contentWidth - CollisionMap.canvasWidth) / 2;
         this.canvasY = 0;
         this.canvas.setSize(CollisionMap.canvasWidth, Language.canvasHeight);
         RouteStrategy.rasterProvider = new RasterProvider(CollisionMap.canvasWidth, Language.canvasHeight, this.canvas);
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

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-101"
   )
   @Export("resizeGame")
   protected abstract void resizeGame();

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1765015837"
   )
   @Export("clearBackground")
   void clearBackground() {
      int var1 = this.canvasX;
      int var2 = this.canvasY;
      int var3 = this.contentWidth - CollisionMap.canvasWidth - var1;
      int var4 = this.contentHeight - Language.canvasHeight - var2;
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

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1144522069"
   )
   @Export("replaceCanvas")
   final void replaceCanvas() {
      keyHandler.method352(this.canvas);
      AttackOption.method2603(this.canvas);
      if (this.mouseWheelHandler != null) {
         this.mouseWheelHandler.method310(this.canvas);
      }

      this.addCanvas();
      keyHandler.method355(this.canvas);
      java.awt.Canvas var1 = this.canvas;
      var1.addMouseListener(MouseHandler.MouseHandler_instance);
      var1.addMouseMotionListener(MouseHandler.MouseHandler_instance);
      var1.addFocusListener(MouseHandler.MouseHandler_instance);
      if (this.mouseWheelHandler != null) {
         this.mouseWheelHandler.addTo(this.canvas);
      }

      this.method514();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(IIIIB)V",
      garbageValue = "-39"
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
         CollisionMap.canvasWidth = var1;
         Language.canvasHeight = var2;
         RunException.RunException_revision = var3;
         RunException.field5065 = var4;
         class422.RunException_applet = this;
         if (class242.taskHandler == null) {
            class242.taskHandler = new TaskHandler();
         }

         class242.taskHandler.newThreadTask(this, 1);
      } catch (Exception var6) {
         class132.RunException_sendStackTrace((String)null, var6);
         this.error("crash");
      }

   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "62"
   )
   @Export("addCanvas")
   final synchronized void addCanvas() {
      Container var1 = this.container();
      if (this.canvas != null) {
         this.canvas.removeFocusListener(this);
         var1.remove(this.canvas);
      }

      CollisionMap.canvasWidth = Math.max(var1.getWidth(), this.field223);
      Language.canvasHeight = Math.max(var1.getHeight(), this.field209);
      Insets var2;
      if (this.frame != null) {
         var2 = this.frame.getInsets();
         CollisionMap.canvasWidth -= var2.right + var2.left;
         Language.canvasHeight -= var2.bottom + var2.top;
      }

      this.canvas = new Canvas(this);
      var1.setBackground(Color.BLACK);
      var1.setLayout((LayoutManager)null);
      var1.add(this.canvas);
      this.canvas.setSize(CollisionMap.canvasWidth, Language.canvasHeight);
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
      if (RouteStrategy.rasterProvider != null && CollisionMap.canvasWidth == RouteStrategy.rasterProvider.width && Language.canvasHeight == RouteStrategy.rasterProvider.height) {
         ((RasterProvider)RouteStrategy.rasterProvider).setComponent(this.canvas);
         RouteStrategy.rasterProvider.drawFull(0, 0);
      } else {
         RouteStrategy.rasterProvider = new RasterProvider(CollisionMap.canvasWidth, Language.canvasHeight, this.canvas);
      }

      this.isCanvasInvalid = false;
      this.field233 = Message.method1197();
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "88"
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

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-42"
   )
   @Export("clientTick")
   void clientTick() {
      long var1 = Message.method1197();
      long var3 = clientTickTimes[class1.field2];
      clientTickTimes[class1.field2] = var1;
      class1.field2 = class1.field2 + 1 & 31;
      if (0L != var3 && var1 > var3) {
      }

      synchronized(this) {
         PacketBuffer.hasFocus = volatileFocus;
      }

      this.doCycle();
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "683817333"
   )
   @Export("graphicsTick")
   void graphicsTick() {
      Container var1 = this.container();
      long var2 = Message.method1197();
      long var4 = graphicsTickTimes[AbstractRasterProvider.field4993];
      graphicsTickTimes[AbstractRasterProvider.field4993] = var2;
      AbstractRasterProvider.field4993 = AbstractRasterProvider.field4993 + 1 & 31;
      if (0L != var4 && var2 > var4) {
         int var6 = (int)(var2 - var4);
         fps = ((var6 >> 1) + 32000) / var6;
      }

      if (++field230 - 1 > 50) {
         field230 -= 50;
         this.fullRedraw = true;
         this.canvas.setSize(CollisionMap.canvasWidth, Language.canvasHeight);
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

      this.method513();
      this.draw(this.fullRedraw);
      if (this.fullRedraw) {
         this.clearBackground();
      }

      this.fullRedraw = false;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1669783800"
   )
   final void method513() {
      Bounds var1 = this.getFrameContentBounds();
      if (this.contentWidth != var1.highX || this.contentHeight != var1.highY || this.resizeCanvasNextFrame) {
         this.resizeCanvas();
         this.resizeCanvasNextFrame = false;
      }

   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "22596"
   )
   final void method514() {
      this.resizeCanvasNextFrame = true;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1133942382"
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

         if (class242.taskHandler != null) {
            try {
               class242.taskHandler.close();
            } catch (Exception var2) {
            }
         }

         this.vmethod1227();
      }
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "0"
   )
   @Export("setUp")
   protected abstract void setUp();

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-22"
   )
   @Export("doCycle")
   protected abstract void doCycle();

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "920051106"
   )
   @Export("draw")
   protected abstract void draw(boolean var1);

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1295386641"
   )
   @Export("kill0")
   protected abstract void kill0();

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;ZI)V",
      garbageValue = "1038398992"
   )
   @Export("drawInitial")
   protected final void drawInitial(int var1, String var2, boolean var3) {
      try {
         Graphics var4 = this.canvas.getGraphics();
         if (class20.fontHelvetica13 == null) {
            class20.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
            Messages.loginScreenFontMetrics = this.canvas.getFontMetrics(class20.fontHelvetica13);
         }

         if (var3) {
            var4.setColor(Color.black);
            var4.fillRect(0, 0, CollisionMap.canvasWidth, Language.canvasHeight);
         }

         Color var5 = new Color(140, 17, 17);

         try {
            if (class69.field892 == null) {
               class69.field892 = this.canvas.createImage(304, 34);
            }

            Graphics var6 = class69.field892.getGraphics();
            var6.setColor(var5);
            var6.drawRect(0, 0, 303, 33);
            var6.fillRect(2, 2, var1 * 3, 30);
            var6.setColor(Color.black);
            var6.drawRect(1, 1, 301, 31);
            var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
            var6.setFont(class20.fontHelvetica13);
            var6.setColor(Color.white);
            var6.drawString(var2, (304 - Messages.loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
            var4.drawImage(class69.field892, CollisionMap.canvasWidth / 2 - 152, Language.canvasHeight / 2 - 18, (ImageObserver)null);
         } catch (Exception var9) {
            int var7 = CollisionMap.canvasWidth / 2 - 152;
            int var8 = Language.canvasHeight / 2 - 18;
            var4.setColor(var5);
            var4.drawRect(var7, var8, 303, 33);
            var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30);
            var4.setColor(Color.black);
            var4.drawRect(var7 + 1, var8 + 1, 301, 31);
            var4.fillRect(var7 + var1 * 3 + 2, var8 + 2, 300 - var1 * 3, 30);
            var4.setFont(class20.fontHelvetica13);
            var4.setColor(Color.white);
            var4.drawString(var2, var7 + (304 - Messages.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22);
         }
      } catch (Exception var10) {
         this.canvas.repaint();
      }

   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1741242852"
   )
   protected final void method527() {
      class69.field892 = null;
      class20.fontHelvetica13 = null;
      Messages.loginScreenFontMetrics = null;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "754431924"
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

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/awt/Container;",
      garbageValue = "-1750796052"
   )
   @Export("container")
   Container container() {
      return (Container)(this.frame != null ? this.frame : this);
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(I)Lok;",
      garbageValue = "1915646281"
   )
   @Export("getFrameContentBounds")
   Bounds getFrameContentBounds() {
      Container var1 = this.container();
      int var2 = Math.max(var1.getWidth(), this.field223);
      int var3 = Math.max(var1.getHeight(), this.field209);
      if (this.frame != null) {
         Insets var4 = this.frame.getInsets();
         var2 -= var4.right + var4.left;
         var3 -= var4.bottom + var4.top;
      }

      return new Bounds(var2, var3);
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1602409348"
   )
   @Export("hasFrame")
   protected final boolean hasFrame() {
      return this.frame != null;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1344730333"
   )
   protected abstract void vmethod1227();

   public final void destroy() {
      if (this == gameEngine && !isKilled) {
         stopTimeMs = Message.method1197();
         class12.method157(5000L);
         this.kill();
      }
   }

   public final synchronized void paint(Graphics var1) {
      if (this == gameEngine && !isKilled) {
         this.fullRedraw = true;
         if (Message.method1197() - this.field233 > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if (var2 == null || var2.width >= CollisionMap.canvasWidth && var2.height >= Language.canvasHeight) {
               this.isCanvasInvalid = true;
            }
         }

      }
   }

   public final void stop() {
      if (this == gameEngine && !isKilled) {
         stopTimeMs = Message.method1197() + 4000L;
      }
   }

   public final void focusGained(FocusEvent var1) {
      volatileFocus = true;
      this.fullRedraw = true;
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
                  for(var3 = 6; var3 < var2.length() && WorldMapLabelSize.isDigit(var2.charAt(var3)); ++var3) {
                  }

                  String var4 = var2.substring(6, var3);
                  if (class346.isNumber(var4) && class412.method7858(var4) < 10) {
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

         UrlRequest.clock = (Clock)var8;

         while(0L == stopTimeMs || Message.method1197() < stopTimeMs) {
            class173.gameCyclesToDo = UrlRequest.clock.wait(cycleDurationMillis, fiveOrOne);

            for(int var5 = 0; var5 < class173.gameCyclesToDo; ++var5) {
               this.clientTick();
            }

            this.graphicsTick();
            this.post(this.canvas);
         }
      } catch (Exception var7) {
         class132.RunException_sendStackTrace((String)null, var7);
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

   public final void windowDeactivated(WindowEvent var1) {
   }

   public final void windowClosed(WindowEvent var1) {
   }

   public final void focusLost(FocusEvent var1) {
      volatileFocus = false;
   }

   public final void windowClosing(WindowEvent var1) {
      this.destroy();
   }

   public final void windowActivated(WindowEvent var1) {
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(IIIZIB)J",
      garbageValue = "22"
   )
   @Export("calculateTag")
   public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4) {
      long var5 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17;
      if (var3) {
         var5 |= 65536L;
      }

      return var5;
   }

   @ObfuscatedName("hj")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1631778915"
   )
   static void method665() {
      PacketBufferNode var0 = class136.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher);
      var0.packetBuffer.writeByte(Message.getWindowedMode());
      var0.packetBuffer.writeShort(CollisionMap.canvasWidth);
      var0.packetBuffer.writeShort(Language.canvasHeight);
      Client.packetWriter.addNode(var0);
   }

   @ObfuscatedName("ig")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-53"
   )
   static final void method667() {
      FontName.method8202(false);
      Client.field601 = 0;
      boolean var0 = true;

      int var1;
      for(var1 = 0; var1 < class133.regionLandArchives.length; ++var1) {
         if (Client.regionMapArchiveIds[var1] != -1 && class133.regionLandArchives[var1] == null) {
            class133.regionLandArchives[var1] = class4.archive9.takeFile(Client.regionMapArchiveIds[var1], 0);
            if (class133.regionLandArchives[var1] == null) {
               var0 = false;
               ++Client.field601;
            }
         }

         if (class379.regionLandArchiveIds[var1] != -1 && class241.regionMapArchives[var1] == null) {
            class241.regionMapArchives[var1] = class4.archive9.takeFileEncrypted(class379.regionLandArchiveIds[var1], 0, class104.xteaKeys[var1]);
            if (class241.regionMapArchives[var1] == null) {
               var0 = false;
               ++Client.field601;
            }
         }
      }

      if (!var0) {
         Client.field658 = 1;
      } else {
         Client.field786 = 0;
         var0 = true;

         int var3;
         int var4;
         for(var1 = 0; var1 < class133.regionLandArchives.length; ++var1) {
            byte[] var17 = class241.regionMapArchives[var1];
            if (var17 != null) {
               var3 = (class205.regions[var1] >> 8) * 64 - class154.baseX * 64;
               var4 = (class205.regions[var1] & 255) * 64 - class365.baseY * 64;
               if (Client.isInInstance) {
                  var3 = 10;
                  var4 = 10;
               }

               var0 &= Tiles.method2214(var17, var3, var4);
            }
         }

         if (!var0) {
            Client.field658 = 2;
         } else {
            if (Client.field658 != 0) {
               SoundSystem.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
            }

            Client.playPcmPlayers();
            ReflectionCheck.scene.clear();

            for(var1 = 0; var1 < 4; ++var1) {
               Client.collisionMaps[var1].clear();
            }

            int var2;
            for(var1 = 0; var1 < 4; ++var1) {
               for(var2 = 0; var2 < 104; ++var2) {
                  for(var3 = 0; var3 < 104; ++var3) {
                     Tiles.Tiles_renderFlags[var1][var2][var3] = 0;
                  }
               }
            }

            Client.playPcmPlayers();
            GrandExchangeEvent.method6616();
            var1 = class133.regionLandArchives.length;
            UrlRequester.method2769();
            FontName.method8202(true);
            int var5;
            if (!Client.isInInstance) {
               byte[] var16;
               for(var2 = 0; var2 < var1; ++var2) {
                  var3 = (class205.regions[var2] >> 8) * 64 - class154.baseX * 64;
                  var4 = (class205.regions[var2] & 255) * 64 - class365.baseY * 64;
                  var16 = class133.regionLandArchives[var2];
                  if (var16 != null) {
                     Client.playPcmPlayers();
                     class14.method168(var16, var3, var4, class17.field101 * 8 - 48, MusicPatchNode2.field3341 * 8 - 48, Client.collisionMaps);
                  }
               }

               for(var2 = 0; var2 < var1; ++var2) {
                  var3 = (class205.regions[var2] >> 8) * 64 - class154.baseX * 64;
                  var4 = (class205.regions[var2] & 255) * 64 - class365.baseY * 64;
                  var16 = class133.regionLandArchives[var2];
                  if (var16 == null && MusicPatchNode2.field3341 < 800) {
                     Client.playPcmPlayers();
                     class71.method2032(var3, var4, 64, 64);
                  }
               }

               FontName.method8202(true);

               for(var2 = 0; var2 < var1; ++var2) {
                  byte[] var15 = class241.regionMapArchives[var2];
                  if (var15 != null) {
                     var4 = (class205.regions[var2] >> 8) * 64 - class154.baseX * 64;
                     var5 = (class205.regions[var2] & 255) * 64 - class365.baseY * 64;
                     Client.playPcmPlayers();
                     class139.method3087(var15, var4, var5, ReflectionCheck.scene, Client.collisionMaps);
                  }
               }
            }

            int var6;
            int var7;
            int var8;
            if (Client.isInInstance) {
               int var9;
               int var10;
               int var11;
               for(var2 = 0; var2 < 4; ++var2) {
                  Client.playPcmPlayers();

                  for(var3 = 0; var3 < 13; ++var3) {
                     for(var4 = 0; var4 < 13; ++var4) {
                        boolean var18 = false;
                        var6 = Client.instanceChunkTemplates[var2][var3][var4];
                        if (var6 != -1) {
                           var7 = var6 >> 24 & 3;
                           var8 = var6 >> 1 & 3;
                           var9 = var6 >> 14 & 1023;
                           var10 = var6 >> 3 & 2047;
                           var11 = (var9 / 8 << 8) + var10 / 8;

                           for(int var12 = 0; var12 < class205.regions.length; ++var12) {
                              if (class205.regions[var12] == var11 && class133.regionLandArchives[var12] != null) {
                                 int var13 = (var9 - var3) * 8;
                                 int var14 = (var10 - var4) * 8;
                                 KeyHandler.method364(class133.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14, Client.collisionMaps);
                                 var18 = true;
                                 break;
                              }
                           }
                        }

                        if (!var18) {
                           ScriptFrame.method1170(var2, var3 * 8, var4 * 8);
                        }
                     }
                  }
               }

               for(var2 = 0; var2 < 13; ++var2) {
                  for(var3 = 0; var3 < 13; ++var3) {
                     var4 = Client.instanceChunkTemplates[0][var2][var3];
                     if (var4 == -1) {
                        class71.method2032(var2 * 8, var3 * 8, 8, 8);
                     }
                  }
               }

               FontName.method8202(true);

               for(var2 = 0; var2 < 4; ++var2) {
                  Client.playPcmPlayers();

                  for(var3 = 0; var3 < 13; ++var3) {
                     for(var4 = 0; var4 < 13; ++var4) {
                        var5 = Client.instanceChunkTemplates[var2][var3][var4];
                        if (var5 != -1) {
                           var6 = var5 >> 24 & 3;
                           var7 = var5 >> 1 & 3;
                           var8 = var5 >> 14 & 1023;
                           var9 = var5 >> 3 & 2047;
                           var10 = (var8 / 8 << 8) + var9 / 8;

                           for(var11 = 0; var11 < class205.regions.length; ++var11) {
                              if (class205.regions[var11] == var10 && class241.regionMapArchives[var11] != null) {
                                 Tiles.method2154(class241.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, ReflectionCheck.scene, Client.collisionMaps);
                                 break;
                              }
                           }
                        }
                     }
                  }
               }
            }

            FontName.method8202(true);
            Client.playPcmPlayers();
            WorldMapIcon_1.method4878(ReflectionCheck.scene, Client.collisionMaps);
            FontName.method8202(true);
            var2 = Tiles.Tiles_minPlane;
            if (var2 > class383.Client_plane) {
               var2 = class383.Client_plane;
            }

            if (var2 < class383.Client_plane - 1) {
               var2 = class383.Client_plane - 1;
            }

            if (Client.isLowDetail) {
               ReflectionCheck.scene.init(Tiles.Tiles_minPlane);
            } else {
               ReflectionCheck.scene.init(0);
            }

            for(var3 = 0; var3 < 104; ++var3) {
               for(var4 = 0; var4 < 104; ++var4) {
                  class358.updateItemPile(var3, var4);
               }
            }

            Client.playPcmPlayers();
            class204.method4182();
            ObjectComposition.ObjectDefinition_cachedModelData.clear();
            PacketBufferNode var19;
            if (BuddyRankComparator.client.hasFrame()) {
               var19 = class136.getPacketBufferNode(ClientPacket.DETECT_MODIFIED_CLIENT, Client.packetWriter.isaacCipher);
               var19.packetBuffer.writeInt(1057001181);
               Client.packetWriter.addNode(var19);
            }

            if (!Client.isInInstance) {
               var3 = (class17.field101 - 6) / 8;
               var4 = (class17.field101 + 6) / 8;
               var5 = (MusicPatchNode2.field3341 - 6) / 8;
               var6 = (MusicPatchNode2.field3341 + 6) / 8;

               for(var7 = var3 - 1; var7 <= var4 + 1; ++var7) {
                  for(var8 = var5 - 1; var8 <= var6 + 1; ++var8) {
                     if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) {
                        class4.archive9.loadRegionFromName("m" + var7 + "_" + var8);
                        class4.archive9.loadRegionFromName("l" + var7 + "_" + var8);
                     }
                  }
               }
            }

            class140.updateGameState(30);
            Client.playPcmPlayers();
            class384.method7371();
            var19 = class136.getPacketBufferNode(ClientPacket.field3107, Client.packetWriter.isaacCipher);
            Client.packetWriter.addNode(var19);
            class29.method430();
         }
      }
   }

   @ObfuscatedName("mz")
   @ObfuscatedSignature(
      descriptor = "(IIIILrx;Lkv;I)V",
      garbageValue = "-1646892146"
   )
   @Export("worldToMinimap")
   static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
      int var6 = var3 * var3 + var2 * var2;
      if (var6 > 4225 && var6 < 90000) {
         int var7 = Client.camAngleY & 2047;
         int var8 = Rasterizer3D.Rasterizer3D_sine[var7];
         int var9 = Rasterizer3D.Rasterizer3D_cosine[var7];
         int var10 = var9 * var2 + var3 * var8 >> 16;
         int var11 = var3 * var9 - var8 * var2 >> 16;
         double var12 = Math.atan2((double)var10, (double)var11);
         int var14 = var5.width / 2 - 25;
         int var15 = (int)(Math.sin(var12) * (double)var14);
         int var16 = (int)(Math.cos(var12) * (double)var14);
         byte var17 = 20;
         class139.redHintArrowSprite.method9049(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
      } else {
         class282.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5);
      }

   }

   @ObfuscatedName("ml")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "766208383"
   )
   static final void method563() {
      Client.field717 = Client.cycleCntr;
      BufferedSink.field4572 = true;
   }
}
