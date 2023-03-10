import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hy")
final class class199 implements ThreadFactory {
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 352168865
   )
   public static int field2093;
   @ObfuscatedName("cd")
   static String field2088;

   public Thread newThread(Runnable var1) {
      return new Thread(var1, "OSRS Maya Anim Load");
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(ILcv;ZI)I",
      garbageValue = "316630129"
   )
   static int method3795(int var0, Script var1, boolean var2) {
      int var4;
      int var9;
      if (var0 == ScriptOpcodes.CC_CREATE) {
         Interpreter.Interpreter_intStackSize -= 3;
         var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         int var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
         if (var4 == 0) {
            throw new RuntimeException();
         } else {
            Widget var6 = WorldMapSection1.getWidget(var9);
            if (var6.children == null) {
               var6.children = new Widget[var11 + 1];
            }

            if (var6.children.length <= var11) {
               Widget[] var7 = new Widget[var11 + 1];

               for(int var8 = 0; var8 < var6.children.length; ++var8) {
                  var7[var8] = var6.children[var8];
               }

               var6.children = var7;
            }

            if (var11 > 0 && var6.children[var11 - 1] == null) {
               throw new RuntimeException("" + (var11 - 1));
            } else {
               Widget var12 = new Widget();
               var12.type = var4;
               var12.parentId = var12.id = var6.id;
               var12.childIndex = var11;
               var12.isIf3 = true;
               if (var4 == 12) {
                  var12.method6117();
                  var12.method6118().method5864(new class102(var12));
                  var12.method6118().method5851(new class103(var12));
               }

               var6.children[var11] = var12;
               if (var2) {
                  GameObject.scriptDotWidget = var12;
               } else {
                  SoundSystem.scriptActiveWidget = var12;
               }

               class69.invalidateWidget(var6);
               return 1;
            }
         }
      } else {
         Widget var3;
         if (var0 == ScriptOpcodes.CC_DELETE) {
            var3 = var2 ? GameObject.scriptDotWidget : SoundSystem.scriptActiveWidget;
            Widget var10 = WorldMapSection1.getWidget(var3.id);
            var10.children[var3.childIndex] = null;
            class69.invalidateWidget(var10);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_DELETEALL) {
            var3 = WorldMapSection1.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
            var3.children = null;
            class69.invalidateWidget(var3);
            return 1;
         } else if (var0 != ScriptOpcodes.CC_FIND) {
            if (var0 == ScriptOpcodes.IF_FIND) {
               var3 = WorldMapSection1.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
               if (var3 != null) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
                  if (var2) {
                     GameObject.scriptDotWidget = var3;
                  } else {
                     SoundSystem.scriptActiveWidget = var3;
                  }
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else {
               return 2;
            }
         } else {
            Interpreter.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Widget var5 = class36.getWidgetChild(var9, var4);
            if (var5 != null && var4 != -1) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
               if (var2) {
                  GameObject.scriptDotWidget = var5;
               } else {
                  SoundSystem.scriptActiveWidget = var5;
               }
            } else {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
            }

            return 1;
         }
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(CLnq;B)I",
      garbageValue = "122"
   )
   @Export("lowercaseChar")
   static int lowercaseChar(char var0, Language var1) {
      int var2 = var0 << 4;
      if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
         var0 = Character.toLowerCase(var0);
         var2 = (var0 << 4) + 1;
      }

      if (var0 == 241 && var1 == Language.Language_ES) {
         var2 = 1762;
      }

      return var2;
   }

   @ObfuscatedName("mq")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-629099983"
   )
   static final void method3798(int var0, int var1) {
      if (Client.currentClanChannels[var0] != null) {
         if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3329()) {
            ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
            if (var2.rank == -1) {
               PacketBufferNode var3 = UserComparator9.getPacketBufferNode(ClientPacket.field3144, Client.packetWriter.isaacCipher);
               var3.packetBuffer.writeByte(3 + WorldMapLabel.stringCp1252NullTerminatedByteSize(var2.username.getName()));
               var3.packetBuffer.writeByte(var0);
               var3.packetBuffer.writeShort(var1);
               var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName());
               Client.packetWriter.addNode(var3);
            }
         }
      }
   }
}
