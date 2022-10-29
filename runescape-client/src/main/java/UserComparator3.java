import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dj")
@Implements("UserComparator3")
public class UserComparator3 extends AbstractUserComparator {
   @ObfuscatedName("hr")
   @ObfuscatedSignature(
      descriptor = "Lnl;"
   )
   @Export("fontBold12")
   static Font fontBold12;
   @ObfuscatedName("a")
   @Export("reversed")
   final boolean reversed;

   public UserComparator3(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lof;Lof;I)I",
      garbageValue = "-380202697"
   )
   @Export("compareBuddy")
   int compareBuddy(Buddy var1, Buddy var2) {
      if (var2.world != var1.world) {
         return this.reversed ? var1.world - var2.world : var2.world - var1.world;
      } else {
         return this.compareUser(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2);
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(ILbz;ZI)I",
      garbageValue = "-1356433235"
   )
   static int method2774(int var0, Script var1, boolean var2) {
      int var3;
      if (var0 == ScriptOpcodes.CAM_FORCEANGLE) {
         class379.Interpreter_intStackSize -= 2;
         var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
         int var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
         if (!Client.isCameraLocked) {
            Client.camAngleX = var3;
            Client.camAngleY = var4;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.camAngleX;
         return 1;
      } else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.camAngleY;
         return 1;
      } else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) {
         var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
         if (var3 < 0) {
            var3 = 0;
         }

         Client.camFollowHeight = var3;
         return 1;
      } else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.camFollowHeight;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("mr")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-2081933970"
   )
   public static boolean method2773() {
      return Client.staffModLevel >= 2;
   }
}
