import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ba")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lba;"
   )
   @Export("MouseHandler_instance")
   public static MouseHandler MouseHandler_instance = new MouseHandler();
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1987262087
   )
   @Export("MouseHandler_idleCycles")
   public static volatile int MouseHandler_idleCycles = 0;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 1385846391
   )
   @Export("MouseHandler_currentButtonVolatile")
   public static volatile int MouseHandler_currentButtonVolatile = 0;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 1511190679
   )
   @Export("MouseHandler_xVolatile")
   public static volatile int MouseHandler_xVolatile = -1;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1489239099
   )
   @Export("MouseHandler_yVolatile")
   public static volatile int MouseHandler_yVolatile = -1;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      longValue = -5981974476361673339L
   )
   @Export("MouseHandler_lastMovedVolatile")
   public static volatile long MouseHandler_lastMovedVolatile = -1L;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -1610660239
   )
   @Export("MouseHandler_currentButton")
   public static int MouseHandler_currentButton = 0;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -1669207625
   )
   @Export("MouseHandler_x")
   public static int MouseHandler_x = 0;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -1454192657
   )
   @Export("MouseHandler_y")
   public static int MouseHandler_y = 0;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      longValue = 3732620679591487245L
   )
   @Export("MouseHandler_millis")
   public static long MouseHandler_millis = 0L;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = 803125775
   )
   @Export("MouseHandler_lastButtonVolatile")
   public static volatile int MouseHandler_lastButtonVolatile = 0;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -881246975
   )
   @Export("MouseHandler_lastPressedXVolatile")
   public static volatile int MouseHandler_lastPressedXVolatile = 0;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = 1882873589
   )
   @Export("MouseHandler_lastPressedYVolatile")
   public static volatile int MouseHandler_lastPressedYVolatile = 0;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      longValue = -3087638509118740407L
   )
   @Export("MouseHandler_lastPressedTimeMillisVolatile")
   public static volatile long MouseHandler_lastPressedTimeMillisVolatile = 0L;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 1984618151
   )
   @Export("MouseHandler_lastButton")
   public static int MouseHandler_lastButton = 0;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -1263219177
   )
   @Export("MouseHandler_lastPressedX")
   public static int MouseHandler_lastPressedX = 0;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 449055161
   )
   @Export("MouseHandler_lastPressedY")
   public static int MouseHandler_lastPressedY = 0;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      longValue = 5420353047671154647L
   )
   @Export("MouseHandler_lastPressedTimeMillis")
   public static long MouseHandler_lastPressedTimeMillis = 0L;

   MouseHandler() {
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/event/MouseEvent;I)I",
      garbageValue = "-1524282401"
   )
   @Export("getButton")
   final int getButton(MouseEvent var1) {
      int var2 = var1.getButton();
      if (!var1.isAltDown() && var2 != 2) {
         return !var1.isMetaDown() && var2 != 3 ? 1 : 2;
      } else {
         return 4;
      }
   }

   public final synchronized void mouseMoved(MouseEvent var1) {
      if (MouseHandler_instance != null) {
         MouseHandler_idleCycles = 0;
         MouseHandler_xVolatile = var1.getX();
         MouseHandler_yVolatile = var1.getY();
         MouseHandler_lastMovedVolatile = var1.getWhen();
      }

   }

   public final synchronized void focusLost(FocusEvent var1) {
      if (MouseHandler_instance != null) {
         MouseHandler_currentButtonVolatile = 0;
      }

   }

   public final synchronized void mousePressed(MouseEvent var1) {
      if (MouseHandler_instance != null) {
         MouseHandler_idleCycles = 0;
         MouseHandler_lastPressedXVolatile = var1.getX();
         MouseHandler_lastPressedYVolatile = var1.getY();
         MouseHandler_lastPressedTimeMillisVolatile = WorldMapSection2.method4844();
         MouseHandler_lastButtonVolatile = this.getButton(var1);
         if (MouseHandler_lastButtonVolatile != 0) {
            MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
         }
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseEntered(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   public final synchronized void mouseDragged(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   public final void focusGained(FocusEvent var1) {
   }

   public final void mouseClicked(MouseEvent var1) {
      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseReleased(MouseEvent var1) {
      if (MouseHandler_instance != null) {
         MouseHandler_idleCycles = 0;
         MouseHandler_currentButtonVolatile = 0;
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseExited(MouseEvent var1) {
      if (MouseHandler_instance != null) {
         MouseHandler_idleCycles = 0;
         MouseHandler_xVolatile = -1;
         MouseHandler_yVolatile = -1;
         MouseHandler_lastMovedVolatile = var1.getWhen();
      }

   }
}
