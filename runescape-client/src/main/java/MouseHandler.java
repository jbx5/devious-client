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

@ObfuscatedName("ax")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lax;"
   )
   @Export("MouseHandler_instance")
   public static MouseHandler MouseHandler_instance = new MouseHandler();
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -912265761
   )
   @Export("MouseHandler_idleCycles")
   public static volatile int MouseHandler_idleCycles = 0;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1575282397
   )
   @Export("MouseHandler_currentButtonVolatile")
   static volatile int MouseHandler_currentButtonVolatile = 0;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 1059969675
   )
   @Export("MouseHandler_xVolatile")
   static volatile int MouseHandler_xVolatile = -1;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1998720499
   )
   @Export("MouseHandler_yVolatile")
   static volatile int MouseHandler_yVolatile = -1;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      longValue = 8611634018514314459L
   )
   @Export("MouseHandler_lastMovedVolatile")
   static volatile long MouseHandler_lastMovedVolatile = -1L;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1498866663
   )
   @Export("MouseHandler_x")
   public static int MouseHandler_x = 0;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -384176359
   )
   @Export("MouseHandler_currentButton")
   public static int MouseHandler_currentButton = 0;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -278205531
   )
   @Export("MouseHandler_y")
   public static int MouseHandler_y = 0;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      longValue = 3571772717098428175L
   )
   @Export("MouseHandler_millis")
   public static long MouseHandler_millis = 0L;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1415622569
   )
   @Export("MouseHandler_lastButtonVolatile")
   static volatile int MouseHandler_lastButtonVolatile = 0;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 623256745
   )
   @Export("MouseHandler_lastPressedXVolatile")
   static volatile int MouseHandler_lastPressedXVolatile = 0;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1887239603
   )
   @Export("MouseHandler_lastPressedYVolatile")
   static volatile int MouseHandler_lastPressedYVolatile = 0;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      longValue = 7328677094157922607L
   )
   @Export("MouseHandler_lastPressedTimeMillisVolatile")
   static volatile long MouseHandler_lastPressedTimeMillisVolatile = 0L;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 743788703
   )
   @Export("MouseHandler_lastButton")
   public static int MouseHandler_lastButton = 0;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 1894371577
   )
   @Export("MouseHandler_lastPressedX")
   public static int MouseHandler_lastPressedX = 0;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 464680597
   )
   @Export("MouseHandler_lastPressedY")
   public static int MouseHandler_lastPressedY = 0;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      longValue = 520159285792776095L
   )
   @Export("MouseHandler_lastPressedTimeMillis")
   public static long MouseHandler_lastPressedTimeMillis = 0L;
   @ObfuscatedName("ph")
   @ObfuscatedSignature(
      descriptor = "[Lkz;"
   )
   static Widget[] field262;

   MouseHandler() {
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/event/MouseEvent;I)I",
      garbageValue = "-1007792141"
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

   public final synchronized void mousePressed(MouseEvent var1) {
      if (MouseHandler_instance != null) {
         MouseHandler_idleCycles = 0;
         MouseHandler_lastPressedXVolatile = var1.getX();
         MouseHandler_lastPressedYVolatile = var1.getY();
         MouseHandler_lastPressedTimeMillisVolatile = class153.method3317();
         MouseHandler_lastButtonVolatile = this.getButton(var1);
         if (MouseHandler_lastButtonVolatile != 0) {
            MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
         }
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final void mouseClicked(MouseEvent var1) {
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

   public final synchronized void focusLost(FocusEvent var1) {
      if (MouseHandler_instance != null) {
         MouseHandler_currentButtonVolatile = 0;
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

   public final synchronized void mouseReleased(MouseEvent var1) {
      if (MouseHandler_instance != null) {
         MouseHandler_idleCycles = 0;
         MouseHandler_currentButtonVolatile = 0;
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final void focusGained(FocusEvent var1) {
   }
}
