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

@ObfuscatedName("ap")
@Implements("KeyHandler")
public class KeyHandler implements KeyListener, FocusListener {
   @ObfuscatedName("ul")
   @ObfuscatedGetter(
      intValue = 2083910077
   )
   static int field137;
   @ObfuscatedName("an")
   Collection field132 = new ArrayList(100);
   @ObfuscatedName("aw")
   Collection field131 = new ArrayList(100);
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "[Lbe;"
   )
   class29[] field135 = new class29[3];
   @ObfuscatedName("au")
   @Export("KeyHandler_pressedKeys")
   boolean[] KeyHandler_pressedKeys = new boolean[112];
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 581428417
   )
   @Export("KeyHandler_idleCycles")
   volatile int KeyHandler_idleCycles = 0;

   KeyHandler() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lbe;II)V",
      garbageValue = "107693889"
   )
   void method353(class29 var1, int var2) {
      this.field135[var2] = var1;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-31"
   )
   public int method354() {
      return this.KeyHandler_idleCycles;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/Component;B)V",
      garbageValue = "64"
   )
   void method355(Component var1) {
      var1.setFocusTraversalKeysEnabled(false);
      var1.addKeyListener(this);
      var1.addFocusListener(this);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/Component;I)V",
      garbageValue = "-2015254392"
   )
   synchronized void method370(Component var1) {
      var1.removeKeyListener(this);
      var1.removeFocusListener(this);
      synchronized(this) {
         this.field132.add(new class33(4, 0));
      }
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "190164456"
   )
   void method357() {
      ++this.KeyHandler_idleCycles;
      this.method360();
      Iterator var1 = this.field131.iterator();

      while(var1.hasNext()) {
         class33 var2 = (class33)var1.next();

         for(int var3 = 0; var3 < this.field135.length && !var2.method499(this.field135[var3]); ++var3) {
         }
      }

      this.field131.clear();
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-64"
   )
   synchronized void method360() {
      Collection var1 = this.field131;
      this.field131 = this.field132;
      this.field132 = var1;
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
                  char[] var4 = class369.cp1252AsciiExtension;

                  for(int var5 = 0; var5 < var4.length; ++var5) {
                     char var6 = var4[var5];
                     if (var6 == var2) {
                        var3 = true;
                        break label53;
                     }
                  }
               }

               var3 = false;
            }
         }

         if (var3) {
            this.field132.add(new class33(3, var2));
         }
      }

      var1.consume();
   }

   public final synchronized void focusGained(FocusEvent var1) {
      this.field132.add(new class33(4, 1));
   }

   public final synchronized void focusLost(FocusEvent var1) {
      for(int var2 = 0; var2 < 112; ++var2) {
         if (this.KeyHandler_pressedKeys[var2]) {
            this.KeyHandler_pressedKeys[var2] = false;
            this.field132.add(new class33(2, var2));
         }
      }

      this.field132.add(new class33(4, 0));
   }

   public final synchronized void keyPressed(KeyEvent var1) {
      int var2;
      label24: {
         var2 = var1.getKeyCode();
         if (var2 >= 0) {
            int var4 = class28.KeyHandler_keyCodes.length;
            if (var2 < var4) {
               var2 = ViewportMouse.method4908(var2);
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
         this.field132.add(new class33(1, var2));
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
               var2 = ViewportMouse.method4908(var2) & -129;
               break label17;
            }
         }

         var2 = -1;
      }

      if (var2 >= 0) {
         this.KeyHandler_pressedKeys[var2] = false;
         this.field132.add(new class33(2, var2));
      }

      var1.consume();
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-10"
   )
   public static int method389() {
      return ViewportMouse.ViewportMouse_entityCount;
   }

   @ObfuscatedName("an")
   public static double method390(double var0, double var2, double var4) {
      return class138.method3201((var0 - var2) / var4) / var4;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lnm;Lnm;ZIB)V",
      garbageValue = "-43"
   )
   static void method366(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
      if (class12.clearLoginScreen) {
         if (var3 == 4) {
            class129.method3124(4);
         }

      } else {
         if (var3 == 0) {
            Login.method2100(var2);
         } else {
            class129.method3124(var3);
         }

         Rasterizer2D.Rasterizer2D_clear();
         byte[] var4 = var0.takeFileByNames("title.jpg", "");
         class123.leftTitleSprite = Strings.method6601(var4);
         ParamComposition.rightTitleSprite = class123.leftTitleSprite.mirrorHorizontally();
         int var5 = Client.worldProperties;
         if ((var5 & 536870912) != 0) {
            Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "");
         } else if ((var5 & 1073741824) != 0) {
            Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "");
         } else if ((var5 & 256) != 0) {
            Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(var1, "logo_speedrunning", "");
         } else {
            Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "");
         }

         Login.titleboxSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
         class292.titlebuttonSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
         class439.field4717 = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", "");
         class376.field4398 = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", "");
         MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", "");
         class396.runesSprite = class314.method6353(var1, "runes", "");
         class148.title_muteSprite = class314.method6353(var1, "title_mute", "");
         Login.options_buttons_0Sprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
         Login.field893 = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
         class158.options_buttons_2Sprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
         Login.field907 = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
         ChatChannel.field992 = Login.options_buttons_0Sprite.subWidth;
         FloorUnderlayDefinition.field2096 = Login.options_buttons_0Sprite.subHeight;
         class121.loginScreenRunesAnimation = new LoginScreenAnimation(class396.runesSprite);
         if (var2) {
            Login.Login_username = "";
            Login.Login_password = "";
            Login.field910 = new String[8];
            Login.field909 = 0;
         }

         class204.field2330 = 0;
         Messages.otp = "";
         Login.field914 = true;
         Login.worldSelectOpen = false;
         if (!class20.clientPreferences.method2534()) {
            class282.method5684(2, class399.archive6, "scape main", "", 255, false);
         } else {
            class297.musicPlayerStatus = 1;
            class297.musicTrackArchive = null;
            class379.musicTrackGroupId = -1;
            VarpDefinition.musicTrackFileId = -1;
            class100.musicTrackVolume = 0;
            class120.musicTrackBoolean = false;
            class162.pcmSampleLength = 2;
         }

         class177.method3617(false);
         class12.clearLoginScreen = true;
         Login.xPadding = (GameEngine.canvasWidth - 765) / 2;
         Login.loginBoxX = Login.xPadding + 202;
         class143.loginBoxCenter = Login.loginBoxX + 180;
         class123.leftTitleSprite.drawAt(Login.xPadding, 0);
         ParamComposition.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
         Canvas.logoSprite.drawAt(Login.xPadding + 382 - Canvas.logoSprite.subWidth / 2, 18);
      }
   }

   @ObfuscatedName("ha")
   @ObfuscatedSignature(
      descriptor = "(Lha;IIII)V",
      garbageValue = "1996468807"
   )
   static void method386(SequenceDefinition var0, int var1, int var2, int var3) {
      if (Client.soundEffectCount < 50 && class20.clientPreferences.method2465() != 0) {
         if (var0.field2311 != null && var0.field2311.containsKey(var1)) {
            class161.method3447((Integer)var0.field2311.get(var1), var2, var3);
         }
      }
   }

   @ObfuscatedName("jl")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "98"
   )
   static final void method379() {
      for(PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) {
         if (var0.hitpoints == -1) {
            var0.delay = 0;
            Messages.method2763(var0);
         } else {
            var0.remove();
         }
      }

   }

   @ObfuscatedName("ng")
   @ObfuscatedSignature(
      descriptor = "(Lmq;I)I",
      garbageValue = "311252747"
   )
   @Export("getWidgetFlags")
   static int getWidgetFlags(Widget var0) {
      IntegerNode var1 = (IntegerNode)Client.widgetFlags.get((long)var0.childIndex + ((long)var0.id << 32));
      return var1 != null ? var1.integer : var0.flags;
   }
}
