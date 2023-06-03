import java.awt.Component;
import java.awt.datatransfer.Clipboard;
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

@ObfuscatedName("am")
@Implements("KeyHandler")
public class KeyHandler implements KeyListener, FocusListener {
   @ObfuscatedName("ah")
   @Export("cacheSubPaths")
   static String[] cacheSubPaths;
   @ObfuscatedName("cu")
   @ObfuscatedSignature(
      descriptor = "Lnt;"
   )
   static GameBuild field132;
   @ObfuscatedName("an")
   Collection field127 = new ArrayList(100);
   @ObfuscatedName("av")
   Collection field126 = new ArrayList(100);
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "[Lbo;"
   )
   class29[] field128 = new class29[3];
   @ObfuscatedName("ax")
   @Export("KeyHandler_pressedKeys")
   boolean[] KeyHandler_pressedKeys = new boolean[112];
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -458777637
   )
   @Export("KeyHandler_idleCycles")
   volatile int KeyHandler_idleCycles = 0;

   KeyHandler() {
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lbo;II)V",
      garbageValue = "1361676668"
   )
   void method347(class29 var1, int var2) {
      this.field128[var2] = var1;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-97"
   )
   public int method348() {
      return this.KeyHandler_idleCycles;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/Component;I)V",
      garbageValue = "1463326789"
   )
   void method350(Component var1) {
      var1.setFocusTraversalKeysEnabled(false);
      var1.addKeyListener(this);
      var1.addFocusListener(this);
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/Component;S)V",
      garbageValue = "256"
   )
   synchronized void method359(Component var1) {
      var1.removeKeyListener(this);
      var1.removeFocusListener(this);
      synchronized(this) {
         this.field127.add(new class33(4, 0));
      }
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "3"
   )
   void method351() {
      ++this.KeyHandler_idleCycles;
      this.method349();
      Iterator var1 = this.field126.iterator();

      while(var1.hasNext()) {
         class33 var2 = (class33)var1.next();

         for(int var3 = 0; var3 < this.field128.length && !var2.method457(this.field128[var3]); ++var3) {
         }
      }

      this.field126.clear();
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "662992859"
   )
   synchronized void method349() {
      Collection var1 = this.field126;
      this.field126 = this.field127;
      this.field127 = var1;
   }

   public final synchronized void keyPressed(KeyEvent var1) {
      int var2;
      label24: {
         var2 = var1.getKeyCode();
         if (var2 >= 0) {
            int var4 = class28.KeyHandler_keyCodes.length;
            if (var2 < var4) {
               var2 = MilliClock.method3527(var2);
               boolean var5 = (var2 & 128) != 0;
               if (var5) {
                  var2 = -1;
               }
               break label24;
            }
         }

         var2 = -1;
      }

      if (var2 >= 0) {
         this.KeyHandler_pressedKeys[var2] = true;
         this.field127.add(new class33(1, var2));
         this.KeyHandler_idleCycles = 0;
      }

      var1.consume();
   }

   public final synchronized void keyReleased(KeyEvent var1) {
      int var2;
      label17: {
         var2 = var1.getKeyCode();
         if (var2 >= 0) {
            int var4 = class28.KeyHandler_keyCodes.length;
            if (var2 < var4) {
               var2 = MilliClock.method3527(var2) & -129;
               break label17;
            }
         }

         var2 = -1;
      }

      if (var2 >= 0) {
         this.KeyHandler_pressedKeys[var2] = false;
         this.field127.add(new class33(2, var2));
      }

      var1.consume();
   }

   public final synchronized void keyTyped(KeyEvent var1) {
      char var2 = var1.getKeyChar();
      if (var2 != 0 && var2 != '\uffff') {
         boolean var3;
         if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
            var3 = true;
         } else {
            label53: {
               if (var2 != 0) {
                  char[] var4 = class382.cp1252AsciiExtension;

                  for(int var5 = 0; var5 < var4.length; ++var5) {
                     char var6 = var4[var5];
                     if (var2 == var6) {
                        var3 = true;
                        break label53;
                     }
                  }
               }

               var3 = false;
            }
         }

         if (var3) {
            this.field127.add(new class33(3, var2));
         }
      }

      var1.consume();
   }

   public final synchronized void focusLost(FocusEvent var1) {
      for(int var2 = 0; var2 < 112; ++var2) {
         if (this.KeyHandler_pressedKeys[var2]) {
            this.KeyHandler_pressedKeys[var2] = false;
            this.field127.add(new class33(2, var2));
         }
      }

      this.field127.add(new class33(4, 0));
   }

   public final synchronized void focusGained(FocusEvent var1) {
      this.field127.add(new class33(4, 1));
   }

   @ObfuscatedName("nq")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/awt/datatransfer/Clipboard;",
      garbageValue = "890471143"
   )
   public static Clipboard method375() {
      return class347.client.method466();
   }
}
