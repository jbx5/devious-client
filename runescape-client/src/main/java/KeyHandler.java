import java.awt.Component;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ad")
@Implements("KeyHandler")
public class KeyHandler implements KeyListener, FocusListener {
   @ObfuscatedName("al")
   Collection field135 = new ArrayList(100);
   @ObfuscatedName("ac")
   Collection field136 = new ArrayList(100);
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "[Lbs;"
   )
   class29[] field137 = new class29[3];
   @ObfuscatedName("an")
   @Export("KeyHandler_pressedKeys")
   boolean[] KeyHandler_pressedKeys = new boolean[112];
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 318905171
   )
   @Export("KeyHandler_idleCycles")
   volatile int KeyHandler_idleCycles = 0;

   KeyHandler() {
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lbs;II)V",
      garbageValue = "1966830837"
   )
   void method342(class29 var1, int var2) {
      this.field137[var2] = var1;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1308553146"
   )
   public int method343() {
      return this.KeyHandler_idleCycles;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/Component;I)V",
      garbageValue = "-1973917956"
   )
   void method344(Component var1) {
      var1.setFocusTraversalKeysEnabled(false);
      var1.addKeyListener(this);
      var1.addFocusListener(this);
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/Component;I)V",
      garbageValue = "11964527"
   )
   synchronized void method348(Component var1) {
      var1.removeKeyListener(this);
      var1.removeFocusListener(this);
      synchronized(this) {
         this.field135.add(new class33(4, 0));
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "108"
   )
   void method346() {
      ++this.KeyHandler_idleCycles;
      this.method364();
      Iterator var1 = this.field136.iterator();

      while(var1.hasNext()) {
         class33 var2 = (class33)var1.next();

         for(int var3 = 0; var3 < this.field137.length && !var2.method472(this.field137[var3]); ++var3) {
         }
      }

      this.field136.clear();
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1054578134"
   )
   synchronized void method364() {
      Collection var1 = this.field136;
      this.field136 = this.field135;
      this.field135 = var1;
   }

   public final synchronized void keyReleased(KeyEvent var1) {
      int var2 = var1.getKeyCode();
      if (var2 >= 0 && var2 < class365.method6867()) {
         int var3 = class28.KeyHandler_keyCodes[var2];
         var2 = var3 & -129;
      } else {
         var2 = -1;
      }

      if (var2 >= 0) {
         this.KeyHandler_pressedKeys[var2] = false;
         this.field135.add(new class33(2, var2));
      }

      var1.consume();
   }

   public final synchronized void keyTyped(KeyEvent var1) {
      char var2 = var1.getKeyChar();
      if (var2 != 0 && var2 != '\uffff' && WorldMapSection2.method4833(var2)) {
         this.field135.add(new class33(3, var2));
      }

      var1.consume();
   }

   public final synchronized void focusGained(FocusEvent var1) {
      this.field135.add(new class33(4, 1));
   }

   public final synchronized void focusLost(FocusEvent var1) {
      for(int var2 = 0; var2 < 112; ++var2) {
         if (this.KeyHandler_pressedKeys[var2]) {
            this.KeyHandler_pressedKeys[var2] = false;
            this.field135.add(new class33(2, var2));
         }
      }

      this.field135.add(new class33(4, 0));
   }

   public final synchronized void keyPressed(KeyEvent var1) {
      int var2 = var1.getKeyCode();
      if (var2 >= 0 && var2 < class365.method6867()) {
         int var3 = class28.KeyHandler_keyCodes[var2];
         var2 = var3;
         if (class385.method7346(var3)) {
            var2 = -1;
         }
      } else {
         var2 = -1;
      }

      if (var2 >= 0) {
         this.KeyHandler_pressedKeys[var2] = true;
         this.field135.add(new class33(1, var2));
         this.KeyHandler_idleCycles = 0;
      }

      var1.consume();
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;ZZI)V",
      garbageValue = "1745561482"
   )
   @Export("openURL")
   public static void openURL(String var0, boolean var1, boolean var2) {
      if (var1) {
         if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
               Desktop.getDesktop().browse(new URI(var0));
               return;
            } catch (Exception var4) {
            }
         }

         if (class31.field161.startsWith("win")) {
            class166.method3376(var0, 0, "openjs");
         } else if (class31.field161.startsWith("mac")) {
            class166.method3376(var0, 1, "openjs");
         } else {
            class166.method3376(var0, 2, "openjs");
         }
      } else {
         class166.method3376(var0, 3, "openjs");
      }

   }
}
