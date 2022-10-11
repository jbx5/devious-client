import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.imageio.ImageIO;

import net.runelite.mapping.*;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("aj")
@Implements("KeyHandler")
public class KeyHandler implements KeyListener, FocusListener {
   @ObfuscatedName("hi")
   @ObfuscatedGetter(
      intValue = -221852981
   )
   @Export("baseX")
   static int baseX;
   @ObfuscatedName("ib")
   @Export("xteaKeys")
   static int[][] xteaKeys;
   @ObfuscatedName("f")
   Collection field143 = new ArrayList(100);
   @ObfuscatedName("c")
   Collection field136 = new ArrayList(100);
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "[Lac;"
   )
   class30[] field134 = new class30[3];
   @ObfuscatedName("h")
   boolean[] field137 = new boolean[112];
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 453646007
   )
   @Export("KeyHandler_idleCycles")
   public volatile int KeyHandler_idleCycles = 0;

   KeyHandler() {
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lac;II)V",
      garbageValue = "1024395417"
   )
   void method384(class30 var1, int var2) {
      this.field134[var2] = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1886743487"
   )
   public int method353() {
      return this.KeyHandler_idleCycles;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/Component;I)V",
      garbageValue = "100151864"
   )
   void method354(Component var1) {
      var1.setFocusTraversalKeysEnabled(false);
      var1.addKeyListener(this);
      var1.addFocusListener(this);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/Component;I)V",
      garbageValue = "-2141322071"
   )
   synchronized void method355(Component var1) {
      var1.removeKeyListener(this);
      var1.removeFocusListener(this);
      synchronized(this) {
         this.field143.add(new class34(4, 0));
      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "753276149"
   )
   void method356() {
      ++this.KeyHandler_idleCycles;
      this.method358();
      Iterator var1 = this.field136.iterator();

      while(var1.hasNext()) {
         class34 var2 = (class34)var1.next();

         for(int var3 = 0; var3 < this.field134.length && !var2.method501(this.field134[var3]); ++var3) {
         }
      }

      this.field136.clear();
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2113194361"
   )
   synchronized void method358() {
      Collection var1 = this.field136;
      this.field136 = this.field143;
      this.field143 = var1;
   }

   public final synchronized void keyPressed(KeyEvent var1) {
      int var2;
      label24: {
         var2 = var1.getKeyCode();
         if (var2 >= 0) {
            int var4 = class4444.KeyHandler_keyCodes.length;
            if (var2 < var4) {
               int var5 = class4444.KeyHandler_keyCodes[var2];
               var2 = var5;
               boolean var6 = (var5 & 128) != 0;
               if (var6) {
                  var2 = -1;
               }
               break label24;
            }
         }

         var2 = -1;
      }

      if (var2 >= 0) {
         this.field137[var2] = true;
         this.field143.add(new class34(1, var2));
         this.KeyHandler_idleCycles = 0;
      }

      var1.consume();
   }

   public final synchronized void keyReleased(KeyEvent var1) {
      int var2;
      label17: {
         var2 = var1.getKeyCode();
         if (var2 >= 0) {
            int var4 = class4444.KeyHandler_keyCodes.length;
            if (var2 < var4) {
               int var5 = class4444.KeyHandler_keyCodes[var2];
               var2 = var5 & -129;
               break label17;
            }
         }

         var2 = -1;
      }

      if (var2 >= 0) {
         this.field137[var2] = false;
         this.field143.add(new class34(2, var2));
      }

      var1.consume();
   }

   public final synchronized void focusLost(FocusEvent var1) {
      for(int var2 = 0; var2 < 112; ++var2) {
         if (this.field137[var2]) {
            this.field137[var2] = false;
            this.field143.add(new class34(2, var2));
         }
      }

      this.field143.add(new class34(4, 0));
   }

   public final synchronized void keyTyped(KeyEvent var1) {
      char var2 = var1.getKeyChar();
      if (var2 != 0 && var2 != '\uffff') {
         boolean var3;
         if ((var2 <= 0 || var2 >= 128) && (var2 < 160 || var2 > 255)) {
            label49: {
               if (var2 != 0) {
                  char[] var4 = class355.cp1252AsciiExtension;

                  for(int var5 = 0; var5 < var4.length; ++var5) {
                     char var6 = var4[var5];
                     if (var2 == var6) {
                        var3 = true;
                        break label49;
                     }
                  }
               }

               var3 = false;
            }
         } else {
            var3 = true;
         }

         if (var3) {
            this.field143.add(new class34(3, var2));
         }
      }

      var1.consume();
   }

   public final synchronized void focusGained(FocusEvent var1) {
      this.field143.add(new class34(4, 1));
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "([BB)Lri;",
      garbageValue = "25"
   )
   public static final SpritePixels method394(byte[] var0) {
      BufferedImage var1 = null;

      try {
         Class var2 = ImageIO.class;
         synchronized(ImageIO.class) {
            var1 = ImageIO.read(new ByteArrayInputStream(var0));
         }

         int var6 = var1.getWidth();
         int var7 = var1.getHeight();
         int[] var4 = new int[var7 * var6];
         PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var6, var7, var4, 0, var6);
         var5.grabPixels();
         return new SpritePixels(var4, var6, var7);
      } catch (IOException var9) {
      } catch (InterruptedException var10) {
      }

      return new SpritePixels(0, 0);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(CI)C",
      garbageValue = "1852147912"
   )
   public static char method369(char var0) {
      switch (var0) {
         case ' ':
         case '-':
         case '_':
         case ' ':
            return '_';
         case '#':
         case '[':
         case ']':
            return var0;
         case 'À':
         case 'Á':
         case 'Â':
         case 'Ã':
         case 'Ä':
         case 'à':
         case 'á':
         case 'â':
         case 'ã':
         case 'ä':
            return 'a';
         case 'Ç':
         case 'ç':
            return 'c';
         case 'È':
         case 'É':
         case 'Ê':
         case 'Ë':
         case 'è':
         case 'é':
         case 'ê':
         case 'ë':
            return 'e';
         case 'Í':
         case 'Î':
         case 'Ï':
         case 'í':
         case 'î':
         case 'ï':
            return 'i';
         case 'Ñ':
         case 'ñ':
            return 'n';
         case 'Ò':
         case 'Ó':
         case 'Ô':
         case 'Õ':
         case 'Ö':
         case 'ò':
         case 'ó':
         case 'ô':
         case 'õ':
         case 'ö':
            return 'o';
         case 'Ù':
         case 'Ú':
         case 'Û':
         case 'Ü':
         case 'ù':
         case 'ú':
         case 'û':
         case 'ü':
            return 'u';
         case 'ß':
            return 'b';
         case 'ÿ':
         case 'Ÿ':
            return 'y';
         default:
            return Character.toLowerCase(var0);
      }
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(ILbz;ZB)I",
      garbageValue = "2"
   )
   static int method393(int var0, Script var1, boolean var2) {
      int var3;
      Object var4;
      int var5;
      class457 var6;
      int var7;
      if (var0 != ScriptOpcodes.DB_FIND_WITH_COUNT && var0 != ScriptOpcodes.DB_FIND) {
         if (var0 != ScriptOpcodes.DB_FINDNEXT) {
            int var19;
            int var20;
            if (var0 == ScriptOpcodes.DB_GETFIELD) {
               class379.Interpreter_intStackSize -= 3;
               var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
               var19 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
               var5 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2];
               var20 = class413.method7766(var19);
               var7 = ArchiveDiskActionHandler.method6293(var19);
               int var21 = ObjectSound.method1855(var19);
               DbRowType var26 = class153.getDbRowType(var3);
               DbTableType var27 = PcmPlayer.getDbTableType(var20);
               int[] var28 = var27.types[var7];
               int var12 = 0;
               int var13 = var28.length;
               if (var21 >= 0) {
                  if (var21 >= var13) {
                     throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var21 + ", Max: " + var13);
                  }

                  var12 = var21;
                  var13 = var21 + 1;
               }

               Object[] var14 = var26.getColumnType(var7);
               if (var14 == null && var27.defaultValues != null) {
                  var14 = var27.defaultValues[var7];
               }

               int var15;
               int var16;
               if (var14 == null) {
                  for(var15 = var12; var15 < var13; ++var15) {
                     var16 = var28[var15];
                     class453 var22 = class230.method4679(var16);
                     if (var22 == class453.field4836) {
                        Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = "";
                     } else {
                        Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class341.method6557(var16);
                     }
                  }

                  return 1;
               } else {
                  var15 = var14.length / var28.length;
                  if (var5 >= 0 && var5 < var15) {
                     for(var16 = var12; var16 < var13; ++var16) {
                        int var17 = var16 + var28.length * var5;
                        class453 var18 = class230.method4679(var28[var16]);
                        if (var18 == class453.field4836) {
                           Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = (String)var14[var17];
                        } else {
                           Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = (Integer)var14[var17];
                        }
                     }

                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               }
            } else if (var0 == ScriptOpcodes.DB_GETFIELDCOUNT) {
               class379.Interpreter_intStackSize -= 2;
               var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
               var19 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
               var5 = 0;
               var20 = class413.method7766(var19);
               var7 = ArchiveDiskActionHandler.method6293(var19);
               DbRowType var25 = class153.getDbRowType(var3);
               DbTableType var9 = PcmPlayer.getDbTableType(var20);
               int[] var10 = var9.types[var7];
               Object[] var11 = var25.getColumnType(var7);
               if (var11 == null && var9.defaultValues != null) {
                  var11 = var9.defaultValues[var7];
               }

               if (var11 != null) {
                  var5 = var11.length / var10.length;
               }

               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var5;
               return 1;
            } else if (var0 != ScriptOpcodes.DB_FINDALL_WITH_COUNT && var0 != ScriptOpcodes.DB_FIND_FILTER) {
               if (var0 == ScriptOpcodes.DB_GETROWTABLE) {
                  var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                  DbRowType var24 = class153.getDbRowType(var3);
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var24.tableId;
                  return 1;
               } else if (var0 == ScriptOpcodes.DB_GETROW) {
                  var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                  var19 = -1;
                  if (MenuAction.field890 != null && var3 >= 0 && var3 < MenuAction.field890.size()) {
                     var19 = (Integer)MenuAction.field890.get(var3);
                  }

                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var19;
                  return 1;
               } else if (var0 != ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT && var0 != ScriptOpcodes.DB_FINDALL) {
                  return 2;
               } else {
                  var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                  var4 = SecureRandomFuture.method2108(var3);
                  var5 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                  var6 = class230.method4680(var5);
                  if (var6 == null) {
                     throw new RuntimeException();
                  } else if (class413.method7766(var5) != Client.field785) {
                     throw new RuntimeException();
                  } else if (MenuAction.field890 == null && MenuAction.field890.isEmpty()) {
                     throw new RuntimeException();
                  } else {
                     var7 = ObjectSound.method1855(var5);
                     List var8 = var6.method8301(var4, var7);
                     MenuAction.field890 = new LinkedList(MenuAction.field890);
                     if (var8 != null) {
                        MenuAction.field890.retainAll(var8);
                     } else {
                        MenuAction.field890.clear();
                     }

                     class100.field1305 = MenuAction.field890.iterator();
                     if (var0 == ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT) {
                        Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = MenuAction.field890.size();
                     }

                     return 1;
                  }
               }
            } else {
               --class379.Interpreter_intStackSize;
               var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
               class457 var23 = Clock.method3395(var3);
               if (var23 == null) {
                  throw new RuntimeException();
               } else {
                  MenuAction.field890 = var23.method8301(0, 0);
                  var5 = 0;
                  if (MenuAction.field890 != null) {
                     Client.field785 = var3;
                     class100.field1305 = MenuAction.field890.iterator();
                     var5 = MenuAction.field890.size();
                  }

                  if (var0 == ScriptOpcodes.DB_FINDALL_WITH_COUNT) {
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var5;
                  }

                  return 1;
               }
            }
         } else {
            if (class100.field1305 != null && class100.field1305.hasNext()) {
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = (Integer)class100.field1305.next();
            } else {
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1;
            }

            return 1;
         }
      } else {
         var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
         var4 = SecureRandomFuture.method2108(var3);
         var5 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
         var6 = class230.method4680(var5);
         if (var6 == null) {
            throw new RuntimeException();
         } else {
            var7 = ObjectSound.method1855(var5);
            MenuAction.field890 = var6.method8301(var4, var7);
            if (MenuAction.field890 != null) {
               Client.field785 = class413.method7766(var5);
               class100.field1305 = MenuAction.field890.iterator();
               if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = MenuAction.field890.size();
               }
            } else {
               Client.field785 = -1;
               class100.field1305 = null;
               if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
               }
            }

            return 1;
         }
      }
   }
}
