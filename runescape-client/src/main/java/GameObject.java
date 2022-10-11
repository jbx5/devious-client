import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hs")
@Implements("GameObject")
public final class GameObject {
   @ObfuscatedName("vg")
   @ObfuscatedSignature(
      descriptor = "Lob;"
   )
   @Export("masterDisk")
   static ArchiveDisk masterDisk;
   @ObfuscatedName("cj")
   @ObfuscatedSignature(
      descriptor = "Lry;"
   )
   @Export("worldSelectLeftSprite")
   static IndexedSprite worldSelectLeftSprite;
   @ObfuscatedName("dv")
   static boolean field2733;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1345253947
   )
   @Export("plane")
   int plane;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1315903907
   )
   @Export("z")
   int z;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1038617169
   )
   @Export("centerX")
   int centerX;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -2072639915
   )
   @Export("centerY")
   int centerY;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lhd;"
   )
   @Export("renderable")
   public Renderable renderable;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -40540361
   )
   @Export("orientation")
   int orientation;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 2020879011
   )
   @Export("startX")
   int startX;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 446674919
   )
   @Export("endX")
   int endX;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1537502895
   )
   @Export("startY")
   int startY;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 73378603
   )
   @Export("endY")
   int endY;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 901536547
   )
   int field2737;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 529946671
   )
   @Export("lastDrawn")
   int lastDrawn;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      longValue = -7922081182251728711L
   )
   @Export("tag")
   public long tag = 0L;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1855102213
   )
   @Export("flags")
   int flags = 0;

   GameObject() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(II)Ljava/lang/String;",
      garbageValue = "2067332128"
   )
   @Export("colorStartTag")
   static String colorStartTag(int var0) {
      return "<col=" + Integer.toHexString(var0) + ">";
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lkn;I[B[BI)V",
      garbageValue = "1711616226"
   )
   @Export("Widget_setKey")
   static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
      if (var0.field3562 == null) {
         if (var2 == null) {
            return;
         }

         var0.field3562 = new byte[11][];
         var0.field3563 = new byte[11][];
         var0.field3611 = new int[11];
         var0.field3565 = new int[11];
      }

      var0.field3562[var1] = var2;
      if (var2 != null) {
         var0.field3561 = true;
      } else {
         var0.field3561 = false;

         for(int var4 = 0; var4 < var0.field3562.length; ++var4) {
            if (var0.field3562[var4] != null) {
               var0.field3561 = true;
               break;
            }
         }
      }

      var0.field3563[var1] = var3;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(ILbz;ZI)I",
      garbageValue = "-2089814826"
   )
   static int method4663(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? class140.scriptDotWidget : class136.scriptActiveWidget;
      if (var0 == ScriptOpcodes.CC_GETX) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.x;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETY) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.y;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETWIDTH) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.width;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETHEIGHT) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.height;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETHIDE) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETLAYER) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.parentId;
         return 1;
      } else {
         return 2;
      }
   }
}
