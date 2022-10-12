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

@ObfuscatedName("ae")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lfp;"
   )
   @Export("taskHandler")
   protected static TaskHandler taskHandler;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lae;"
   )
   @Export("gameEngine")
   static GameEngine gameEngine = null;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 744029553
   )
   @Export("GameEngine_redundantStartThreadCount")
   static int GameEngine_redundantStartThreadCount = 0;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      longValue = -9139813589801259825L
   )
   @Export("stopTimeMs")
   static long stopTimeMs = 0L;
   @ObfuscatedName("j")
   @Export("isKilled")
   static boolean isKilled = false;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 2126665387
   )
   @Export("cycleDurationMillis")
   static int cycleDurationMillis = 20;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -2051336563
   )
   @Export("fiveOrOne")
   static int fiveOrOne = 1;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -156918551
   )
   @Export("fps")
   protected static int fps = 0;
   @ObfuscatedName("o")
   @Export("graphicsTickTimes")
   static long[] graphicsTickTimes = new long[32];
   @ObfuscatedName("z")
   @Export("clientTickTimes")
   static long[] clientTickTimes = new long[32];
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 2111337141
   )
   @Export("canvasWidth")
   public static int canvasWidth;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 1820807991
   )
   static int field212 = 500;
   @ObfuscatedName("ai")
   @Export("volatileFocus")
   static volatile boolean volatileFocus = true;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Laj;"
   )
   @Export("keyHandler")
   protected static KeyHandler keyHandler = new KeyHandler();
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      longValue = -5318768701372018855L
   )
   @Export("garbageCollectorLastCollectionTime")
   static long garbageCollectorLastCollectionTime = -1L;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      longValue = 1695186618396153021L
   )
   @Export("garbageCollectorLastCheckTimeMs")
   static long garbageCollectorLastCheckTimeMs = -1L;
   @ObfuscatedName("d")
   @Export("hasErrored")
   boolean hasErrored = false;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 186826985
   )
   @Export("contentWidth")
   protected int contentWidth;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -781288403
   )
   @Export("contentHeight")
   protected int contentHeight;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 846076955
   )
   @Export("canvasX")
   int canvasX = 0;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 526763313
   )
   @Export("canvasY")
   int canvasY = 0;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1244283503
   )
   int field224;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 833066567
   )
   int field213;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1533724941
   )
   @Export("maxCanvasWidth")
   int maxCanvasWidth;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 506510689
   )
   @Export("maxCanvasHeight")
   int maxCanvasHeight;
   @ObfuscatedName("af")
   @Export("frame")
   Frame frame;
   @ObfuscatedName("ad")
   @Export("canvas")
   java.awt.Canvas canvas;
   @ObfuscatedName("av")
   @Export("fullRedraw")
   volatile boolean fullRedraw = true;
   @ObfuscatedName("ap")
   @Export("resizeCanvasNextFrame")
   boolean resizeCanvasNextFrame = false;
   @ObfuscatedName("as")
   @Export("isCanvasInvalid")
   volatile boolean isCanvasInvalid = false;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      longValue = 3712109730462177527L
   )
   volatile long field201 = 0L;
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "Le;"
   )
   @Export("mouseWheelHandler")
   MouseWheelHandler mouseWheelHandler;
   @ObfuscatedName("az")
   @Export("clipboard")
   Clipboard clipboard;
   @ObfuscatedName("ab")
   @Export("eventQueue")
   final EventQueue eventQueue;

   protected GameEngine() {
      EventQueue var1 = null;

      try {
         var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
      } catch (Throwable var3) {
      }

      this.eventQueue = var1;
      class199.method3999(new DevicePcmPlayerProvider());
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "437544293"
   )
   @Export("setMaxCanvasSize")
   protected final void setMaxCanvasSize(int var1, int var2) {
      if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) {
         this.method654();
      }

      this.maxCanvasWidth = var1;
      this.maxCanvasHeight = var2;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;B)V",
      garbageValue = "-82"
   )
   @Export("post")
   final void post(Object var1) {
      if (this.eventQueue != null) {
         for(int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
            class197.method3946(1L);
         }

         if (var1 != null) {
            this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
         }

      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(I)Lfk;",
      garbageValue = "180606123"
   )
   @Export("mouseWheel")
   protected class165 mouseWheel() {
      if (this.mouseWheelHandler == null) {
         this.mouseWheelHandler = new MouseWheelHandler();
         this.mouseWheelHandler.addTo(this.canvas);
      }

      return this.mouseWheelHandler;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1645067164"
   )
   @Export("setUpClipboard")
   protected void setUpClipboard() {
      this.clipboard = this.getToolkit().getSystemClipboard();
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-399294602"
   )
   protected void method527(String var1) {
      this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null);
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/awt/datatransfer/Clipboard;",
      garbageValue = "-268620836"
   )
   protected Clipboard method510() {
      return this.clipboard;
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "108"
   )
   @Export("setUpKeyboard")
   protected final void setUpKeyboard() {
      if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
         class4444.KeyHandler_keyCodes[186] = 57;
         class4444.KeyHandler_keyCodes[187] = 27;
         class4444.KeyHandler_keyCodes[188] = 71;
         class4444.KeyHandler_keyCodes[189] = 26;
         class4444.KeyHandler_keyCodes[190] = 72;
         class4444.KeyHandler_keyCodes[191] = 73;
         class4444.KeyHandler_keyCodes[192] = 58;
         class4444.KeyHandler_keyCodes[219] = 42;
         class4444.KeyHandler_keyCodes[220] = 74;
         class4444.KeyHandler_keyCodes[221] = 43;
         class4444.KeyHandler_keyCodes[222] = 59;
         class4444.KeyHandler_keyCodes[223] = 28;
      } else {
         class4444.KeyHandler_keyCodes[44] = 71;
         class4444.KeyHandler_keyCodes[45] = 26;
         class4444.KeyHandler_keyCodes[46] = 72;
         class4444.KeyHandler_keyCodes[47] = 73;
         class4444.KeyHandler_keyCodes[59] = 57;
         class4444.KeyHandler_keyCodes[61] = 27;
         class4444.KeyHandler_keyCodes[91] = 42;
         class4444.KeyHandler_keyCodes[92] = 74;
         class4444.KeyHandler_keyCodes[93] = 43;
         class4444.KeyHandler_keyCodes[192] = 28;
         class4444.KeyHandler_keyCodes[222] = 58;
         class4444.KeyHandler_keyCodes[520] = 59;
      }

      keyHandler.method354(this.canvas);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "869354353"
   )
   protected final void method603() {
      keyHandler.method356();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(Lac;IB)V",
      garbageValue = "12"
   )
   protected void method513(class30 var1, int var2) {
      keyHandler.method384(var1, var2);
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1207459728"
   )
   protected final void method514() {
      java.awt.Canvas var1 = this.canvas;
      var1.addMouseListener(MouseHandler.MouseHandler_instance);
      var1.addMouseMotionListener(MouseHandler.MouseHandler_instance);
      var1.addFocusListener(MouseHandler.MouseHandler_instance);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "536118795"
   )
   @Export("resizeCanvas")
   final void resizeCanvas() {
      Container var1 = this.container();
      if (var1 != null) {
         Bounds var2 = this.getFrameContentBounds();
         this.contentWidth = Math.max(var2.highX, this.field224);
         this.contentHeight = Math.max(var2.highY, this.field213);
         if (this.contentWidth <= 0) {
            this.contentWidth = 1;
         }

         if (this.contentHeight <= 0) {
            this.contentHeight = 1;
         }

         canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
         class10.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
         this.canvasX = (this.contentWidth - canvasWidth) / 2;
         this.canvasY = 0;
         this.canvas.setSize(canvasWidth, class10.canvasHeight);
         class1.rasterProvider = new RasterProvider(canvasWidth, class10.canvasHeight, this.canvas);
         if (var1 == this.frame) {
            Insets var3 = this.frame.getInsets();
            this.canvas.setLocation(this.canvasX + var3.left, this.canvasY + var3.top);
         } else {
            this.canvas.setLocation(this.canvasX, this.canvasY);
         }

         this.fullRedraw = true;
         this.resizeGame();
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1490185666"
   )
   @Export("resizeGame")
   protected abstract void resizeGame();

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "56"
   )
   @Export("clearBackground")
   void clearBackground() {
      int var1 = this.canvasX;
      int var2 = this.canvasY;
      int var3 = this.contentWidth - canvasWidth - var1;
      int var4 = this.contentHeight - class10.canvasHeight - var2;
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

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1726244299"
   )
   @Export("replaceCanvas")
   final void replaceCanvas() {
      keyHandler.method355(this.canvas);
      java.awt.Canvas var1 = this.canvas;
      var1.removeMouseListener(MouseHandler.MouseHandler_instance);
      var1.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
      var1.removeFocusListener(MouseHandler.MouseHandler_instance);
      MouseHandler.MouseHandler_currentButtonVolatile = 0;
      if (this.mouseWheelHandler != null) {
         this.mouseWheelHandler.method308(this.canvas);
      }

      this.addCanvas();
      keyHandler.method354(this.canvas);
      java.awt.Canvas var2 = this.canvas;
      var2.addMouseListener(MouseHandler.MouseHandler_instance);
      var2.addMouseMotionListener(MouseHandler.MouseHandler_instance);
      var2.addFocusListener(MouseHandler.MouseHandler_instance);
      if (this.mouseWheelHandler != null) {
         this.mouseWheelHandler.addTo(this.canvas);
      }

      this.method654();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "385290861"
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
         class10.canvasHeight = var2;
         RunException.RunException_revision = var3;
         RunException.field5018 = var4;
         RunException.RunException_applet = this;
         if (taskHandler == null) {
            taskHandler = new TaskHandler();
         }

         taskHandler.newThreadTask(this, 1);
      } catch (Exception var6) {
         class421.RunException_sendStackTrace((String)null, var6);
         this.error("crash");
      }

   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "292202485"
   )
   @Export("addCanvas")
   final synchronized void addCanvas() {
      Container var1 = this.container();
      if (this.canvas != null) {
         this.canvas.removeFocusListener(this);
         var1.remove(this.canvas);
      }

      canvasWidth = Math.max(var1.getWidth(), this.field224);
      class10.canvasHeight = Math.max(var1.getHeight(), this.field213);
      Insets var2;
      if (this.frame != null) {
         var2 = this.frame.getInsets();
         canvasWidth -= var2.left + var2.right;
         class10.canvasHeight -= var2.bottom + var2.top;
      }

      this.canvas = new Canvas(this);
      var1.setBackground(Color.BLACK);
      var1.setLayout((LayoutManager)null);
      var1.add(this.canvas);
      this.canvas.setSize(canvasWidth, class10.canvasHeight);
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
      if (class1.rasterProvider != null && canvasWidth == class1.rasterProvider.width && class10.canvasHeight == class1.rasterProvider.height) {
         ((RasterProvider)class1.rasterProvider).setComponent(this.canvas);
         class1.rasterProvider.drawFull(0, 0);
      } else {
         class1.rasterProvider = new RasterProvider(canvasWidth, class10.canvasHeight, this.canvas);
      }

      this.isCanvasInvalid = false;
      this.field201 = UserComparator8.method2748();
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1689057535"
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

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "18"
   )
   @Export("clientTick")
   void clientTick() {
      long var1 = UserComparator8.method2748();
      long var3 = clientTickTimes[class12.field66];
      clientTickTimes[class12.field66] = var1;
      class12.field66 = class12.field66 + 1 & 31;
      if (var3 != 0L && var1 > var3) {
      }

      synchronized(this) {
         ChatChannel.hasFocus = volatileFocus;
      }

      this.doCycle();
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1430607867"
   )
   @Export("graphicsTick")
   void graphicsTick() {
      Container var1 = this.container();
      long var2 = UserComparator8.method2748();
      long var4 = graphicsTickTimes[StudioGame.field3743];
      graphicsTickTimes[StudioGame.field3743] = var2;
      StudioGame.field3743 = StudioGame.field3743 + 1 & 31;
      if (0L != var4 && var2 > var4) {
         int var6 = (int)(var2 - var4);
         fps = ((var6 >> 1) + 32000) / var6;
      }

      if (++field212 - 1 > 50) {
         field212 -= 50;
         this.fullRedraw = true;
         this.canvas.setSize(canvasWidth, class10.canvasHeight);
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

      this.method524();
      this.draw(this.fullRedraw);
      if (this.fullRedraw) {
         this.clearBackground();
      }

      this.fullRedraw = false;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "110"
   )
   final void method524() {
      Bounds var1 = this.getFrameContentBounds();
      if (this.contentWidth != var1.highX || var1.highY != this.contentHeight || this.resizeCanvasNextFrame) {
         this.resizeCanvas();
         this.resizeCanvasNextFrame = false;
      }

   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-707731712"
   )
   final void method654() {
      this.resizeCanvasNextFrame = true;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "693331185"
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

         this.vmethod1485();
      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1983760905"
   )
   @Export("setUp")
   protected abstract void setUp();

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1176871177"
   )
   @Export("doCycle")
   protected abstract void doCycle();

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-1054189604"
   )
   @Export("draw")
   protected abstract void draw(boolean var1);

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "-5165"
   )
   @Export("kill0")
   protected abstract void kill0();

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;ZI)V",
      garbageValue = "-1703323928"
   )
   @Export("drawInitial")
   protected final void drawInitial(int var1, String var2, boolean var3) {
      try {
         Graphics var4 = this.canvas.getGraphics();
         if (class126.fontHelvetica13 == null) {
            class126.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
            class10.loginScreenFontMetrics = this.canvas.getFontMetrics(class126.fontHelvetica13);
         }

         if (var3) {
            var4.setColor(Color.black);
            var4.fillRect(0, 0, canvasWidth, class10.canvasHeight);
         }

         Color var5 = new Color(140, 17, 17);

         try {
            if (AttackOption.field1295 == null) {
               AttackOption.field1295 = this.canvas.createImage(304, 34);
            }

            Graphics var6 = AttackOption.field1295.getGraphics();
            var6.setColor(var5);
            var6.drawRect(0, 0, 303, 33);
            var6.fillRect(2, 2, var1 * 3, 30);
            var6.setColor(Color.black);
            var6.drawRect(1, 1, 301, 31);
            var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
            var6.setFont(class126.fontHelvetica13);
            var6.setColor(Color.white);
            var6.drawString(var2, (304 - class10.loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
            var4.drawImage(AttackOption.field1295, canvasWidth / 2 - 152, class10.canvasHeight / 2 - 18, (ImageObserver)null);
         } catch (Exception var9) {
            int var7 = canvasWidth / 2 - 152;
            int var8 = class10.canvasHeight / 2 - 18;
            var4.setColor(var5);
            var4.drawRect(var7, var8, 303, 33);
            var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30);
            var4.setColor(Color.black);
            var4.drawRect(var7 + 1, var8 + 1, 301, 31);
            var4.fillRect(var7 + var1 * 3 + 2, var8 + 2, 300 - var1 * 3, 30);
            var4.setFont(class126.fontHelvetica13);
            var4.setColor(Color.white);
            var4.drawString(var2, var7 + (304 - class10.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22);
         }
      } catch (Exception var10) {
         this.canvas.repaint();
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "30"
   )
   protected final void method536() {
      AttackOption.field1295 = null;
      class126.fontHelvetica13 = null;
      class10.loginScreenFontMetrics = null;
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;S)V",
      garbageValue = "6806"
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

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/awt/Container;",
      garbageValue = "2"
   )
   @Export("container")
   Container container() {
      return (Container)(this.frame != null ? this.frame : this);
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(I)Loq;",
      garbageValue = "805719906"
   )
   @Export("getFrameContentBounds")
   Bounds getFrameContentBounds() {
      Container var1 = this.container();
      int var2 = Math.max(var1.getWidth(), this.field224);
      int var3 = Math.max(var1.getHeight(), this.field213);
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
      garbageValue = "-1473132947"
   )
   @Export("hasFrame")
   protected final boolean hasFrame() {
      return this.frame != null;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1478842545"
   )
   protected abstract void vmethod1485();

   public final void destroy() {
      if (this == gameEngine && !isKilled) {
         stopTimeMs = UserComparator8.method2748();
         class197.method3946(5000L);
         this.kill();
      }
   }

   public final synchronized void paint(Graphics var1) {
      if (this == gameEngine && !isKilled) {
         this.fullRedraw = true;
         if (UserComparator8.method2748() - this.field201 > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if (var2 == null || var2.width >= canvasWidth && var2.height >= class10.canvasHeight) {
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
                  for(var3 = 6; var3 < var2.length() && GrandExchangeOffer.isDigit(var2.charAt(var3)); ++var3) {
                  }

                  String var4 = var2.substring(6, var3);
                  if (WorldMapManager.isNumber(var4) && class100.method2559(var4) < 10) {
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

         class362.clock = (Clock)var8;

         while(0L == stopTimeMs || UserComparator8.method2748() < stopTimeMs) {
            FloorDecoration.gameCyclesToDo = class362.clock.wait(cycleDurationMillis, fiveOrOne);

            for(int var5 = 0; var5 < FloorDecoration.gameCyclesToDo; ++var5) {
               this.clientTick();
            }

            this.graphicsTick();
            this.post(this.canvas);
         }
      } catch (Exception var7) {
         class421.RunException_sendStackTrace((String)null, var7);
         this.error("crash");
      }

      this.kill();
   }

   public final void stop() {
      if (this == gameEngine && !isKilled) {
         stopTimeMs = UserComparator8.method2748() + 4000L;
      }
   }

   public final void focusLost(FocusEvent var1) {
      volatileFocus = false;
   }

   public final void windowActivated(WindowEvent var1) {
   }

   public final void windowClosing(WindowEvent var1) {
      this.destroy();
   }

   public final void windowDeactivated(WindowEvent var1) {
   }

   public final void focusGained(FocusEvent var1) {
      volatileFocus = true;
      this.fullRedraw = true;
   }

   public final void windowIconified(WindowEvent var1) {
   }

   public final void windowOpened(WindowEvent var1) {
   }

   public abstract void init();

   public final void update(Graphics var1) {
      this.paint(var1);
   }

   public final void start() {
      if (this == gameEngine && !isKilled) {
         stopTimeMs = 0L;
      }
   }

   public final void windowDeiconified(WindowEvent var1) {
   }

   public final void windowClosed(WindowEvent var1) {
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "([BI)Lbz;",
      garbageValue = "-2134162282"
   )
   @Export("newScript")
   static Script newScript(byte[] var0) {
      Script var1 = new Script();
      Buffer var2 = new Buffer(var0);
      var2.offset = var2.array.length - 2;
      int var3 = var2.readUnsignedShort();
      int var4 = var2.array.length - 2 - var3 - 12;
      var2.offset = var4;
      int var5 = var2.readInt();
      var1.localIntCount = var2.readUnsignedShort();
      var1.localStringCount = var2.readUnsignedShort();
      var1.intArgumentCount = var2.readUnsignedShort();
      var1.stringArgumentCount = var2.readUnsignedShort();
      int var6 = var2.readUnsignedByte();
      int var7;
      int var8;
      if (var6 > 0) {
         var1.switches = var1.newIterableNodeHashTable(var6);

         for(var7 = 0; var7 < var6; ++var7) {
            var8 = var2.readUnsignedShort();
            IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? class37.method712(var8) : 1);
            var1.switches[var7] = var9;

            while(var8-- > 0) {
               int var10 = var2.readInt();
               int var11 = var2.readInt();
               var9.put(new IntegerNode(var11), (long)var10);
            }
         }
      }

      var2.offset = 0;
      var1.field962 = var2.readStringCp1252NullTerminatedOrNull();
      var1.opcodes = new int[var5];
      var1.intOperands = new int[var5];
      var1.stringOperands = new String[var5];

      for(var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) {
         var8 = var2.readUnsignedShort();
         if (var8 == 3) {
            var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
         } else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
            var1.intOperands[var7] = var2.readInt();
         } else {
            var1.intOperands[var7] = var2.readUnsignedByte();
         }
      }

      return var1;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(I)Lbt;",
      garbageValue = "-1856343638"
   )
   @Export("worldListStart")
   static World worldListStart() {
      World.World_listCount = 0;
      return TextureProvider.getNextWorldListWorld();
   }

   @ObfuscatedName("gq")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-1701204332"
   )
   @Export("doCheat")
   static final void doCheat(String var0) {
      if (var0.equalsIgnoreCase("toggleroof")) {
         BufferedSink.clientPreferences.method2378(!BufferedSink.clientPreferences.method2452());
         if (BufferedSink.clientPreferences.method2452()) {
            MouseHandler.addGameMessage(99, "", "Roofs are now all hidden");
         } else {
            MouseHandler.addGameMessage(99, "", "Roofs will only be removed selectively");
         }
      }

      if (var0.equalsIgnoreCase("displayfps")) {
         BufferedSink.clientPreferences.method2434();
      }

      if (var0.equalsIgnoreCase("renderself")) {
         Client.renderSelf = !Client.renderSelf;
      }

      if (var0.equalsIgnoreCase("mouseovertext")) {
         Client.showMouseOverText = !Client.showMouseOverText;
      }

      if (Client.staffModLevel >= 2) {
         if (var0.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
         }

         if (var0.equalsIgnoreCase("showcoord")) {
            class7.worldMap.showCoord = !class7.worldMap.showCoord;
         }

         if (var0.equalsIgnoreCase("fpson")) {
            BufferedSink.clientPreferences.method2384(true);
         }

         if (var0.equalsIgnoreCase("fpsoff")) {
            BufferedSink.clientPreferences.method2384(false);
         }

         if (var0.equalsIgnoreCase("gc")) {
            System.gc();
         }

         if (var0.equalsIgnoreCase("clientdrop")) {
            WorldMapSection0.method5101();
         }
      }

      PacketBufferNode var1 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.DOCHEAT, Client.packetWriter.isaacCipher);
      var1.packetBuffer.writeByte(var0.length() + 1);
      var1.packetBuffer.writeStringCp1252NullTerminated(var0);
      Client.packetWriter.addNode(var1);
   }

   @ObfuscatedName("hi")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1244279489"
   )
   static final void method662() {
      Client.field687 = 0;
      int var0 = KeyHandler.baseX * 64 + (class296.localPlayer.x >> 7);
      int var1 = class158.baseY * 64 + (class296.localPlayer.y >> 7);
      if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
         Client.field687 = 1;
      }

      if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
         Client.field687 = 1;
      }

      if (Client.field687 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
         Client.field687 = 0;
      }

   }
}
