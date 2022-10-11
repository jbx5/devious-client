import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("r")
public class class9 implements MouseWheel {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lr;"
   )
   public static final class9 field42 = new class9(0, "POST", true, true);
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lr;"
   )
   public static final class9 field39 = new class9(1, "GET", true, false);
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lr;"
   )
   static final class9 field43 = new class9(2, "PUT", false, true);
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lr;"
   )
   static final class9 field41 = new class9(3, "PATCH", false, true);
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lr;"
   )
   static final class9 field46 = new class9(4, "DELETE", false, true);
   @ObfuscatedName("ie")
   @Export("regionMapArchives")
   static byte[][] regionMapArchives;
   @ObfuscatedName("qw")
   @ObfuscatedSignature(
      descriptor = "Lfk;"
   )
   @Export("mouseWheel")
   static class165 mouseWheel;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 347878083
   )
   int field48;
   @ObfuscatedName("y")
   String field44;
   @ObfuscatedName("d")
   boolean field45;
   @ObfuscatedName("n")
   boolean field38;

   class9(int var1, String var2, boolean var3, boolean var4) {
      this.field48 = var1;
      this.field44 = var2;
      this.field45 = var3;
      this.field38 = var4;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "0"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field48;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-2103039666"
   )
   boolean method73() {
      return this.field45;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-1133174080"
   )
   public String method70() {
      return this.field44;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1967949034"
   )
   boolean method62() {
      return this.field38;
   }

   @ObfuscatedName("a")
   public static final int method72(double var0, double var2, double var4) {
      double var6 = var4;
      double var8 = var4;
      double var10 = var4;
      if (0.0 != var2) {
         double var12;
         if (var4 < 0.5) {
            var12 = (var2 + 1.0) * var4;
         } else {
            var12 = var4 + var2 - var2 * var4;
         }

         double var14 = 2.0 * var4 - var12;
         double var16 = var0 + 0.3333333333333333;
         if (var16 > 1.0) {
            --var16;
         }

         double var20 = var0 - 0.3333333333333333;
         if (var20 < 0.0) {
            ++var20;
         }

         if (6.0 * var16 < 1.0) {
            var6 = var14 + var16 * (var12 - var14) * 6.0;
         } else if (2.0 * var16 < 1.0) {
            var6 = var12;
         } else if (3.0 * var16 < 2.0) {
            var6 = 6.0 * (var12 - var14) * (0.6666666666666666 - var16) + var14;
         } else {
            var6 = var14;
         }

         if (var0 * 6.0 < 1.0) {
            var8 = var0 * 6.0 * (var12 - var14) + var14;
         } else if (var0 * 2.0 < 1.0) {
            var8 = var12;
         } else if (var0 * 3.0 < 2.0) {
            var8 = var14 + 6.0 * (0.6666666666666666 - var0) * (var12 - var14);
         } else {
            var8 = var14;
         }

         if (6.0 * var20 < 1.0) {
            var10 = var20 * 6.0 * (var12 - var14) + var14;
         } else if (2.0 * var20 < 1.0) {
            var10 = var12;
         } else if (var20 * 3.0 < 2.0) {
            var10 = (0.6666666666666666 - var20) * (var12 - var14) * 6.0 + var14;
         } else {
            var10 = var14;
         }
      }

      int var22 = (int)(256.0 * var6);
      int var13 = (int)(256.0 * var8);
      int var23 = (int)(var10 * 256.0);
      int var15 = var23 + (var13 << 8) + (var22 << 16);
      return var15;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/security/SecureRandom;",
      garbageValue = "900581302"
   )
   static SecureRandom method74() {
      SecureRandom var0 = new SecureRandom();
      var0.nextInt();
      return var0;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIB)Z",
      garbageValue = "-94"
   )
   static final boolean method75(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = ViewportMouse.ViewportMouse_y + var6;
      if (var7 < var0 && var7 < var1 && var7 < var2) {
         return false;
      } else {
         var7 = ViewportMouse.ViewportMouse_y - var6;
         if (var7 > var0 && var7 > var1 && var7 > var2) {
            return false;
         } else {
            var7 = ViewportMouse.ViewportMouse_x + var6;
            if (var7 < var3 && var7 < var4 && var7 < var5) {
               return false;
            } else {
               var7 = ViewportMouse.ViewportMouse_x - var6;
               return var7 <= var3 || var7 <= var4 || var7 <= var5;
            }
         }
      }
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(ILbz;ZB)I",
      garbageValue = "23"
   )
   static int method76(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? class140.scriptDotWidget : class136.scriptActiveWidget;
      if (var0 == ScriptOpcodes.CC_GETTARGETMASK) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class167.Widget_unpackTargetMask(class197.getWidgetFlags(var3));
         return 1;
      } else if (var0 != ScriptOpcodes.CC_GETOP) {
         if (var0 == ScriptOpcodes.CC_GETOPBASE) {
            if (var3.dataText == null) {
               Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = "";
            } else {
               Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var3.dataText;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var4 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
         --var4;
         if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
            Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var3.actions[var4];
         } else {
            Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = "";
         }

         return 1;
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(ILbz;ZB)I",
      garbageValue = "17"
   )
   static int method66(int var0, Script var1, boolean var2) {
      return 2;
   }

   @ObfuscatedName("gn")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1744196611"
   )
   static void method61() {
      PacketBufferNode var0 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher);
      var0.packetBuffer.writeByte(class13.getWindowedMode());
      var0.packetBuffer.writeShort(GameEngine.canvasWidth);
      var0.packetBuffer.writeShort(class10.canvasHeight);
      Client.packetWriter.addNode(var0);
   }
}
