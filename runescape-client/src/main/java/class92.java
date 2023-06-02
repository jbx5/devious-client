import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dp")
public class class92 {
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(ILdd;ZI)I",
      garbageValue = "575831891"
   )
   static int method2342(int var0, Script var1, boolean var2) {
      Widget var3;
      if (var0 == ScriptOpcodes.IF_GETINVOBJECT) {
         var3 = FriendSystem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemId;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) {
         var3 = FriendSystem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
         if (var3.itemId != -1) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemQuantity;
         } else {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.IF_HASSUB) {
         int var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var5);
         if (var4 != null) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
         } else {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETTOP) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.rootInterface;
         return 1;
      } else if (var0 == 2707) {
         var3 = FriendSystem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method6359() ? 1 : 0;
         return 1;
      } else if (var0 == 2708) {
         var3 = FriendSystem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
         return MenuAction.method2056(var3);
      } else if (var0 == 2709) {
         var3 = FriendSystem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
         return class10.method103(var3);
      } else {
         return 2;
      }
   }

   @ObfuscatedName("jt")
   @ObfuscatedSignature(
      descriptor = "(Ltl;I)V",
      garbageValue = "-1716509361"
   )
   static final void method2344(PacketBuffer var0) {
      var0.importIndex();
      int var1 = var0.readBits(8);
      int var2;
      if (var1 < Client.npcCount) {
         for(var2 = var1; var2 < Client.npcCount; ++var2) {
            Client.field635[++Client.field634 - 1] = Client.npcIndices[var2];
         }
      }

      if (var1 > Client.npcCount) {
         throw new RuntimeException("");
      } else {
         Client.npcCount = 0;

         for(var2 = 0; var2 < var1; ++var2) {
            int var3 = Client.npcIndices[var2];
            NPC var4 = Client.npcs[var3];
            int var5 = var0.readBits(1);
            if (var5 == 0) {
               Client.npcIndices[++Client.npcCount - 1] = var3;
               var4.npcCycle = Client.cycle;
            } else {
               int var6 = var0.readBits(2);
               if (var6 == 0) {
                  Client.npcIndices[++Client.npcCount - 1] = var3;
                  var4.npcCycle = Client.cycle;
                  Client.field566[++Client.field579 - 1] = var3;
               } else {
                  int var7;
                  int var8;
                  if (var6 == 1) {
                     Client.npcIndices[++Client.npcCount - 1] = var3;
                     var4.npcCycle = Client.cycle;
                     var7 = var0.readBits(3);
                     var4.method2559(var7, class216.field2395);
                     var8 = var0.readBits(1);
                     if (var8 == 1) {
                        Client.field566[++Client.field579 - 1] = var3;
                     }
                  } else if (var6 == 2) {
                     Client.npcIndices[++Client.npcCount - 1] = var3;
                     var4.npcCycle = Client.cycle;
                     if (var0.readBits(1) == 1) {
                        var7 = var0.readBits(3);
                        var4.method2559(var7, class216.field2396);
                        var8 = var0.readBits(3);
                        var4.method2559(var8, class216.field2396);
                     } else {
                        var7 = var0.readBits(3);
                        var4.method2559(var7, class216.field2394);
                     }

                     var7 = var0.readBits(1);
                     if (var7 == 1) {
                        Client.field566[++Client.field579 - 1] = var3;
                     }
                  } else if (var6 == 3) {
                     Client.field635[++Client.field634 - 1] = var3;
                  }
               }
            }
         }

      }
   }
}
