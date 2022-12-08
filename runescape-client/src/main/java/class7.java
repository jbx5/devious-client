import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("r")
public class class7 {
   @ObfuscatedName("h")
   ExecutorService field23 = Executors.newSingleThreadExecutor();
   @ObfuscatedName("e")
   Future field24;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lqy;"
   )
   final Buffer field25;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lx;"
   )
   final class3 field28;

   @ObfuscatedSignature(
      descriptor = "(Lqy;Lx;)V"
   )
   public class7(Buffer var1, class3 var2) {
      this.field25 = var1;
      this.field28 = var2;
      this.method46();
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "10"
   )
   public boolean method57() {
      return this.field24.isDone();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "67"
   )
   public void method45() {
      this.field23.shutdown();
      this.field23 = null;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)Lqy;",
      garbageValue = "1313541740"
   )
   public Buffer method56() {
      try {
         return (Buffer)this.field24.get();
      } catch (Exception var2) {
         return null;
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "117"
   )
   void method46() {
      this.field24 = this.field23.submit(new class1(this, this.field25, this.field28));
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(ILbm;ZI)I",
      garbageValue = "-831312501"
   )
   static int method54(int var0, Script var1, boolean var2) {
      Widget var3 = PlayerCompositionColorTextureOverride.getWidget(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]);
      if (var0 == ScriptOpcodes.IF_GETSCROLLX) {
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.scrollX;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETSCROLLY) {
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.scrollY;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETTEXT) {
         Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.text;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) {
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.scrollWidth;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) {
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.scrollHeight;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) {
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.modelZoom;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) {
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.modelAngleX;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) {
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.modelAngleZ;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) {
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.modelAngleY;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETTRANS) {
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.transparencyTop;
         return 1;
      } else if (var0 == 2610) {
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.transparencyBot;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETCOLOUR) {
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.color;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) {
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.color2;
         return 1;
      } else if (var0 == 2613) {
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) {
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
         return 1;
      } else {
         class298 var4;
         if (var0 == 2617) {
            var4 = var3.method6293();
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4 != null ? var4.field3454 : 0;
         }

         if (var0 == 2618) {
            var4 = var3.method6293();
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4 != null ? var4.field3456 : 0;
            return 1;
         } else {
            class303 var7;
            if (var0 == 2619) {
               var7 = var3.method6167();
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7 != null ? var7.method5893().method7091() : "";
               return 1;
            } else if (var0 == 2620) {
               var4 = var3.method6293();
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4 != null ? var4.field3455 : 0;
               return 1;
            } else if (var0 == 2621) {
               var7 = var3.method6167();
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7 != null ? var7.method5939() : 0;
               return 1;
            } else if (var0 == 2622) {
               var7 = var3.method6167();
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7 != null ? var7.method5940() : 0;
               return 1;
            } else if (var0 == 2623) {
               var7 = var3.method6167();
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7 != null ? var7.method6111() : 0;
               return 1;
            } else if (var0 == 2624) {
               var7 = var3.method6167();
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7 != null && var7.method5963() ? 1 : 0;
               return 1;
            } else if (var0 != 2625) {
               if (var0 == 2626) {
                  var7 = var3.method6167();
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7 != null ? var7.method5930().method7272() : "";
                  return 1;
               } else if (var0 == 2627) {
                  var7 = var3.method6167();
                  int var5 = var7 != null ? var7.method5913() : 0;
                  int var6 = var7 != null ? var7.method5934() : 0;
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Math.min(var5, var6);
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Math.max(var5, var6);
                  return 1;
               } else if (var0 == 2628) {
                  var7 = var3.method6167();
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7 != null ? var7.method5934() : 0;
                  return 1;
               } else if (var0 == 2629) {
                  var7 = var3.method6167();
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7 != null ? var7.method6054() : 0;
                  return 1;
               } else if (var0 == 2630) {
                  var7 = var3.method6167();
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7 != null ? var7.method5942() : 0;
                  return 1;
               } else if (var0 == 2631) {
                  var7 = var3.method6167();
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7 != null ? var7.method5944() : 0;
                  return 1;
               } else if (var0 == 2632) {
                  var7 = var3.method6167();
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7 != null ? var7.method6024() : 0;
                  return 1;
               } else {
                  class28 var8;
                  if (var0 == 2633) {
                     var8 = var3.method6187();
                     Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize - 1] = var8 != null ? var8.method393(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize - 1]) : 0;
                     return 1;
                  } else if (var0 == 2634) {
                     var8 = var3.method6187();
                     Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize - 1] = var8 != null ? var8.method396((char)Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize - 1]) : 0;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var7 = var3.method6167();
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7 != null && var7.method5878() ? 1 : 0;
               return 1;
            }
         }
      }
   }

   @ObfuscatedName("ld")
   @ObfuscatedSignature(
      descriptor = "(IS)V",
      garbageValue = "255"
   )
   static final void method43(int var0) {
      var0 = Math.min(Math.max(var0, 0), 127);
      StructComposition.clientPreferences.updateSoundEffectVolume(var0);
   }

   @ObfuscatedName("la")
   @ObfuscatedSignature(
      descriptor = "(IIII)Lcx;",
      garbageValue = "-413394938"
   )
   static final InterfaceParent method44(int var0, int var1, int var2) {
      InterfaceParent var3 = new InterfaceParent();
      var3.group = var1;
      var3.type = var2;
      Client.interfaceParents.put(var3, (long)var0);
      class69.Widget_resetModelFrames(var1);
      Widget var4 = PlayerCompositionColorTextureOverride.getWidget(var0);
      class69.invalidateWidget(var4);
      if (Client.meslayerContinueWidget != null) {
         class69.invalidateWidget(Client.meslayerContinueWidget);
         Client.meslayerContinueWidget = null;
      }

      class169.revalidateWidgetScroll(class71.Widget_interfaceComponents[var0 >> 16], var4, false);
      class31.runWidgetOnLoadListener(var1);
      if (Client.rootInterface != -1) {
         GrandExchangeOfferAgeComparator.runIntfCloseListeners(Client.rootInterface, 1);
      }

      return var3;
   }

   @ObfuscatedName("mi")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1774309040"
   )
   @Export("Clan_leaveChat")
   static final void Clan_leaveChat() {
      PacketBufferNode var0 = class136.getPacketBufferNode(ClientPacket.field3145, Client.packetWriter.isaacCipher);
      var0.packetBuffer.writeByte(0);
      Client.packetWriter.addNode(var0);
   }
}
