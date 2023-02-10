import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("y")
@Implements("KeyHandler")
public class KeyHandler implements KeyListener, FocusListener {
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lrv;"
   )
   @Export("rasterProvider")
   public static AbstractRasterProvider rasterProvider;
   @ObfuscatedName("ch")
   @ObfuscatedSignature(
      descriptor = "[Lrg;"
   )
   @Export("worldSelectStars")
   static IndexedSprite[] worldSelectStars;
   @ObfuscatedName("ie")
   @ObfuscatedGetter(
      intValue = -1000852529
   )
   static int field147;
   @ObfuscatedName("nr")
   @ObfuscatedSignature(
      descriptor = "Lkz;"
   )
   @Export("mousedOverWidgetIf1")
   static Widget mousedOverWidgetIf1;
   @ObfuscatedName("w")
   Collection field146 = new ArrayList(100);
   @ObfuscatedName("v")
   Collection field153 = new ArrayList(100);
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "[Lag;"
   )
   class29[] field151 = new class29[3];
   @ObfuscatedName("z")
   @Export("KeyHandler_pressedKeys")
   boolean[] KeyHandler_pressedKeys = new boolean[112];
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1971799399
   )
   @Export("KeyHandler_idleCycles")
   volatile int KeyHandler_idleCycles = 0;

   KeyHandler() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lag;IB)V",
      garbageValue = "-21"
   )
   void method352(class29 var1, int var2) {
      this.field151[var2] = var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "2042589970"
   )
   public int method353() {
      return this.KeyHandler_idleCycles;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/Component;I)V",
      garbageValue = "719186766"
   )
   void method354(Component var1) {
      var1.setFocusTraversalKeysEnabled(false);
      var1.addKeyListener(this);
      var1.addFocusListener(this);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/Component;I)V",
      garbageValue = "1271861184"
   )
   synchronized void method372(Component var1) {
      var1.removeKeyListener(this);
      var1.removeFocusListener(this);
      synchronized(this) {
         this.field146.add(new class33(4, 0));
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-7"
   )
   void method356() {
      ++this.KeyHandler_idleCycles;
      this.method351();
      Iterator var1 = this.field153.iterator();

      while(var1.hasNext()) {
         class33 var2 = (class33)var1.next();

         for(int var3 = 0; var3 < this.field151.length && !var2.method494(this.field151[var3]); ++var3) {
         }
      }

      this.field153.clear();
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-850276975"
   )
   synchronized void method351() {
      Collection var1 = this.field153;
      this.field153 = this.field146;
      this.field146 = var1;
   }

   public final synchronized void keyPressed(KeyEvent var1) {
      int var2 = var1.getKeyCode();
      if (var2 >= 0 && var2 < PcmPlayer.method826()) {
         var2 = GrandExchangeOfferUnitPriceComparator.method6729(var2);
         if (class203.method4129(var2)) {
            var2 = -1;
         }
      } else {
         var2 = -1;
      }

      if (var2 >= 0) {
         this.KeyHandler_pressedKeys[var2] = true;
         this.field146.add(new class33(1, var2));
         this.KeyHandler_idleCycles = 0;
      }

      var1.consume();
   }

   public final synchronized void keyReleased(KeyEvent var1) {
      int var2 = var1.getKeyCode();
      if (var2 >= 0 && var2 < PcmPlayer.method826()) {
         var2 = GrandExchangeOfferUnitPriceComparator.method6729(var2) & -129;
      } else {
         var2 = -1;
      }

      if (var2 >= 0) {
         this.KeyHandler_pressedKeys[var2] = false;
         this.field146.add(new class33(2, var2));
      }

      var1.consume();
   }

   public final synchronized void keyTyped(KeyEvent var1) {
      char var2 = var1.getKeyChar();
      if (var2 != 0 && var2 != '\uffff') {
         boolean var3;
         if ((var2 <= 0 || var2 >= 128) && (var2 < 160 || var2 > 255)) {
            label50: {
               if (var2 != 0) {
                  char[] var4 = class362.cp1252AsciiExtension;

                  for(int var5 = 0; var5 < var4.length; ++var5) {
                     char var6 = var4[var5];
                     if (var6 == var2) {
                        var3 = true;
                        break label50;
                     }
                  }
               }

               var3 = false;
            }
         } else {
            var3 = true;
         }

         if (var3) {
            this.field146.add(new class33(3, var2));
         }
      }

      var1.consume();
   }

   public final synchronized void focusLost(FocusEvent var1) {
      for(int var2 = 0; var2 < 112; ++var2) {
         if (this.KeyHandler_pressedKeys[var2]) {
            this.KeyHandler_pressedKeys[var2] = false;
            this.field146.add(new class33(2, var2));
         }
      }

      this.field146.add(new class33(4, 0));
   }

   public final synchronized void focusGained(FocusEvent var1) {
      this.field146.add(new class33(4, 1));
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(CII)Ljava/lang/String;",
      garbageValue = "-1112576285"
   )
   public static String method366(char var0, int var1) {
      char[] var2 = new char[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         var2[var3] = var0;
      }

      return new String(var2);
   }
}
