import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

@ObfuscatedName("b")
class class13 extends DefaultTlsClient {
   @ObfuscatedName("io")
   @Export("regionLandArchiveIds")
   static int[] regionLandArchiveIds;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lp;"
   )
   final class12 this$1;

   @ObfuscatedSignature(
      descriptor = "(Lp;)V"
   )
   class13(class12 var1) {
      this.this$1 = var1;
   }

   public TlsAuthentication getAuthentication() throws IOException {
      return new class11(this);
   }

   public Hashtable getClientExtensions() throws IOException {
      Hashtable var1 = super.getClientExtensions();
      if (var1 == null) {
         var1 = new Hashtable();
      }

      byte[] var2 = this.this$1.val$host.getBytes();
      ByteArrayOutputStream var3 = new ByteArrayOutputStream();
      DataOutputStream var4 = new DataOutputStream(var3);
      var4.writeShort(var2.length + 3);
      var4.writeByte(0);
      var4.writeShort(var2.length);
      var4.write(var2);
      var4.close();
      var1.put(0, var3.toByteArray());
      return var1;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2120776615"
   )
   static void method169() {
      GrandExchangeOfferOwnWorldComparator.method1171(24);
      MusicPatchNode2.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", "");
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(ILbz;ZB)I",
      garbageValue = "-84"
   )
   static int method172(int var0, Script var1, boolean var2) {
      Widget var3;
      if (var0 == ScriptOpcodes.IF_GETINVOBJECT) {
         var3 = class281.getWidget(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]);
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.itemId;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) {
         var3 = class281.getWidget(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]);
         if (var3.itemId != -1) {
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.itemQuantity;
         } else {
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.IF_HASSUB) {
         int var5 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
         InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var5);
         if (var4 != null) {
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 1;
         } else {
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETTOP) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.rootInterface;
         return 1;
      } else if (var0 == 2707) {
         var3 = class281.getWidget(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]);
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.method6075() ? 1 : 0;
         return 1;
      } else if (var0 == 2708) {
         var3 = class281.getWidget(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]);
         return class409.method7736(var3);
      } else if (var0 == 2709) {
         var3 = class281.getWidget(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]);
         return class129.method2946(var3);
      } else {
         return 2;
      }
   }

   @ObfuscatedName("gz")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-7344383"
   )
   @Export("getWindowedMode")
   static int getWindowedMode() {
      return Client.isResizable ? 2 : 1;
   }
}
