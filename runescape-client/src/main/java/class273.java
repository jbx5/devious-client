import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jk")
public class class273 {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Ljk;"
   )
   public static final class273 field3109 = new class273(5);
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Ljk;"
   )
   public static final class273 field3107 = new class273(4);
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Ljk;"
   )
   public static final class273 field3108 = new class273(5);
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Ljk;"
   )
   public static final class273 field3116 = new class273(7);
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Ljk;"
   )
   public static final class273 field3110 = new class273(5);
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Ljk;"
   )
   public static final class273 field3111 = new class273(15);
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "Ljk;"
   )
   public static final class273 field3106 = new class273(14);
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Ljk;"
   )
   public static final class273 field3119 = new class273(4);
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Ljk;"
   )
   public static final class273 field3114 = new class273(6);
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "Ljk;"
   )
   public static final class273 field3113 = new class273(2);
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "Ljk;"
   )
   public static final class273 field3112 = new class273(16);
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Ljk;"
   )
   public static final class273 field3117 = new class273(4);
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "Ljk;"
   )
   public static final class273 field3118 = new class273(5);
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "Ljk;"
   )
   public static final class273 field3121 = new class273(8);
   @ObfuscatedName("fa")
   @Export("worldHost")
   static String worldHost;

   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "5"
   )
   class273(int var1) {
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(ILbz;ZI)I",
      garbageValue = "-201098025"
   )
   static int method5374(int var0, Script var1, boolean var2) {
      String var7;
      if (var0 == ScriptOpcodes.MES) {
         var7 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize];
         MouseHandler.addGameMessage(0, "", var7);
         return 1;
      } else if (var0 == ScriptOpcodes.ANIM) {
         class379.Interpreter_intStackSize -= 2;
         FontName.performPlayerAnimation(class296.localPlayer, Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]);
         return 1;
      } else if (var0 == ScriptOpcodes.IF_CLOSE) {
         if (!Interpreter.field850) {
            Interpreter.field849 = true;
         }

         return 1;
      } else {
         int var16;
         if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
            var7 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize];
            var16 = 0;
            if (WorldMapManager.isNumber(var7)) {
               var16 = class100.method2559(var7);
            }

            PacketBufferNode var14 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.RESUME_COUNTDIALOG, Client.packetWriter.isaacCipher);
            var14.packetBuffer.writeInt(var16);
            Client.packetWriter.addNode(var14);
            return 1;
         } else {
            PacketBufferNode var12;
            if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
               var7 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize];
               var12 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.RESUME_NAMEDIALOG, Client.packetWriter.isaacCipher);
               var12.packetBuffer.writeByte(var7.length() + 1);
               var12.packetBuffer.writeStringCp1252NullTerminated(var7);
               Client.packetWriter.addNode(var12);
               return 1;
            } else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
               var7 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize];
               var12 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.RESUME_STRINGDIALOG, Client.packetWriter.isaacCipher);
               var12.packetBuffer.writeByte(var7.length() + 1);
               var12.packetBuffer.writeStringCp1252NullTerminated(var7);
               Client.packetWriter.addNode(var12);
               return 1;
            } else {
               int var3;
               String var11;
               if (var0 == ScriptOpcodes.OPPLAYER) {
                  var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                  var11 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize];
                  class96.method2517(var3, var11);
                  return 1;
               } else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
                  class379.Interpreter_intStackSize -= 3;
                  var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
                  var16 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
                  int var9 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2];
                  Widget var15 = class281.getWidget(var9);
                  Huffman.clickWidget(var15, var3, var16);
                  return 1;
               } else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
                  class379.Interpreter_intStackSize -= 2;
                  var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
                  var16 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
                  Widget var13 = var2 ? class140.scriptDotWidget : class136.scriptActiveWidget;
                  Huffman.clickWidget(var13, var3, var16);
                  return 1;
               } else if (var0 == ScriptOpcodes.MOUSECAM) {
                  class82.mouseCam = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
                  return 1;
               } else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = BufferedSink.clientPreferences.method2452() ? 1 : 0;
                  return 1;
               } else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
                  BufferedSink.clientPreferences.method2378(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1);
                  return 1;
               } else if (var0 == ScriptOpcodes.OPENURL) {
                  var7 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize];
                  boolean var8 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
                  UrlRequester.openURL(var7, var8, false);
                  return 1;
               } else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
                  var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                  var12 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.RESUME_OBJDIALOG, Client.packetWriter.isaacCipher);
                  var12.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var12);
                  return 1;
               } else if (var0 == ScriptOpcodes.BUG_REPORT) {
                  var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                  class125.Interpreter_stringStackSize -= 2;
                  var11 = Interpreter.Interpreter_stringStack[class125.Interpreter_stringStackSize];
                  String var5 = Interpreter.Interpreter_stringStack[class125.Interpreter_stringStackSize + 1];
                  if (var11.length() > 500) {
                     return 1;
                  } else if (var5.length() > 500) {
                     return 1;
                  } else {
                     PacketBufferNode var6 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.BUG_REPORT, Client.packetWriter.isaacCipher);
                     var6.packetBuffer.writeShort(1 + Actor.stringCp1252NullTerminatedByteSize(var11) + Actor.stringCp1252NullTerminatedByteSize(var5));
                     var6.packetBuffer.writeStringCp1252NullTerminated(var5);
                     var6.packetBuffer.writeByteNeg(var3);
                     var6.packetBuffer.writeStringCp1252NullTerminated(var11);
                     Client.packetWriter.addNode(var6);
                     return 1;
                  }
               } else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
                  Client.shiftClickDrop = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
                  return 1;
               } else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
                  Client.showMouseOverText = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
                  return 1;
               } else if (var0 == ScriptOpcodes.RENDERSELF) {
                  Client.renderSelf = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
                  return 1;
               } else if (var0 == 3120) {
                  if (Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1) {
                     Client.drawPlayerNames |= 1;
                  } else {
                     Client.drawPlayerNames &= -2;
                  }

                  return 1;
               } else if (var0 == 3121) {
                  if (Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1) {
                     Client.drawPlayerNames |= 2;
                  } else {
                     Client.drawPlayerNames &= -3;
                  }

                  return 1;
               } else if (var0 == 3122) {
                  if (Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1) {
                     Client.drawPlayerNames |= 4;
                  } else {
                     Client.drawPlayerNames &= -5;
                  }

                  return 1;
               } else if (var0 == 3123) {
                  if (Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1) {
                     Client.drawPlayerNames |= 8;
                  } else {
                     Client.drawPlayerNames &= -9;
                  }

                  return 1;
               } else if (var0 == 3124) {
                  Client.drawPlayerNames = 0;
                  return 1;
               } else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
                  Client.showMouseCross = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
                  return 1;
               } else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
                  Client.showLoadingMessages = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
                  return 1;
               } else if (var0 == ScriptOpcodes.SETTAPTODROP) {
                  IsaacCipher.setTapToDrop(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1);
                  return 1;
               } else if (var0 == ScriptOpcodes.GETTAPTODROP) {
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Tile.getTapToDrop() ? 1 : 0;
                  return 1;
               } else if (var0 == 3129) {
                  class379.Interpreter_intStackSize -= 2;
                  Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
                  Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
                  return 1;
               } else if (var0 == 3130) {
                  class379.Interpreter_intStackSize -= 2;
                  return 1;
               } else if (var0 == 3131) {
                  --class379.Interpreter_intStackSize;
                  return 1;
               } else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = GameEngine.canvasWidth;
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class10.canvasHeight;
                  return 1;
               } else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
                  --class379.Interpreter_intStackSize;
                  return 1;
               } else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
                  return 1;
               } else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
                  class379.Interpreter_intStackSize -= 2;
                  return 1;
               } else if (var0 == 3136) {
                  Client.field668 = 3;
                  Client.field755 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                  return 1;
               } else if (var0 == 3137) {
                  Client.field668 = 2;
                  Client.field755 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                  return 1;
               } else if (var0 == 3138) {
                  Client.field668 = 0;
                  return 1;
               } else if (var0 == 3139) {
                  Client.field668 = 1;
                  return 1;
               } else if (var0 == 3140) {
                  Client.field668 = 3;
                  Client.field755 = var2 ? class140.scriptDotWidget.id : class136.scriptActiveWidget.id;
                  return 1;
               } else {
                  boolean var10;
                  if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
                     var10 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
                     BufferedSink.clientPreferences.method2430(var10);
                     return 1;
                  } else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = BufferedSink.clientPreferences.method2381() ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
                     var10 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
                     Client.Login_isUsernameRemembered = var10;
                     if (!var10) {
                        BufferedSink.clientPreferences.method2385("");
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
                     return 1;
                  } else if (var0 == 3146) {
                     var10 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
                     BufferedSink.clientPreferences.method2382(!var10);
                     return 1;
                  } else if (var0 == 3147) {
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = BufferedSink.clientPreferences.method2383() ? 0 : 1;
                     return 1;
                  } else if (var0 == 3148) {
                     return 1;
                  } else if (var0 == 3149) {
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3150) {
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3151) {
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3152) {
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3153) {
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Login.Login_loadingPercent;
                     return 1;
                  } else if (var0 == 3154) {
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = PcmPlayer.method829();
                     return 1;
                  } else if (var0 == 3155) {
                     --class125.Interpreter_stringStackSize;
                     return 1;
                  } else if (var0 == 3156) {
                     return 1;
                  } else if (var0 == 3157) {
                     class379.Interpreter_intStackSize -= 2;
                     return 1;
                  } else if (var0 == 3158) {
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3159) {
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3160) {
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3161) {
                     --class379.Interpreter_intStackSize;
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3162) {
                     --class379.Interpreter_intStackSize;
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3163) {
                     --class125.Interpreter_stringStackSize;
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3164) {
                     --class379.Interpreter_intStackSize;
                     Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = "";
                     return 1;
                  } else if (var0 == 3165) {
                     --class379.Interpreter_intStackSize;
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3166) {
                     class379.Interpreter_intStackSize -= 2;
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3167) {
                     class379.Interpreter_intStackSize -= 2;
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3168) {
                     class379.Interpreter_intStackSize -= 2;
                     Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = "";
                     return 1;
                  } else if (var0 == 3169) {
                     return 1;
                  } else if (var0 == 3170) {
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3171) {
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3172) {
                     --class379.Interpreter_intStackSize;
                     return 1;
                  } else if (var0 == 3173) {
                     --class379.Interpreter_intStackSize;
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3174) {
                     --class379.Interpreter_intStackSize;
                     return 1;
                  } else if (var0 == 3175) {
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3176) {
                     return 1;
                  } else if (var0 == 3177) {
                     return 1;
                  } else if (var0 == 3178) {
                     --class125.Interpreter_stringStackSize;
                     return 1;
                  } else if (var0 == 3179) {
                     return 1;
                  } else if (var0 == 3180) {
                     --class125.Interpreter_stringStackSize;
                     return 1;
                  } else if (var0 == 3181) {
                     WorldMapData_0.method4676(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]);
                     return 1;
                  } else if (var0 == 3182) {
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class356.method6783();
                     return 1;
                  } else if (var0 == 3189) {
                     var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                     SequenceDefinition var4 = WorldMapElement.SequenceDefinition_get(var3);
                     if (var4.isCachedModelIdSet()) {
                        ObjectComposition.method3734(var4.SequenceDefinition_cachedModelId);
                     }

                     return 1;
                  } else {
                     return 2;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(ILbz;ZI)I",
      garbageValue = "469376671"
   )
   static int method5380(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
         class379.Interpreter_intStackSize -= 2;
         Client.field764 = (short)class298.method5728(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]);
         if (Client.field764 <= 0) {
            Client.field764 = 256;
         }

         Client.field649 = (short)class298.method5728(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]);
         if (Client.field649 <= 0) {
            Client.field649 = 256;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
         class379.Interpreter_intStackSize -= 2;
         Client.zoomHeight = (short)Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
         if (Client.zoomHeight <= 0) {
            Client.zoomHeight = 256;
         }

         Client.zoomWidth = (short)Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
         if (Client.zoomWidth <= 0) {
            Client.zoomWidth = 320;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
         class379.Interpreter_intStackSize -= 4;
         Client.field601 = (short)Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
         if (Client.field601 <= 0) {
            Client.field601 = 1;
         }

         Client.field769 = (short)Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
         if (Client.field769 <= 0) {
            Client.field769 = 32767;
         } else if (Client.field769 < Client.field601) {
            Client.field769 = Client.field601;
         }

         Client.field562 = (short)Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2];
         if (Client.field562 <= 0) {
            Client.field562 = 1;
         }

         Client.field771 = (short)Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 3];
         if (Client.field771 <= 0) {
            Client.field771 = 32767;
         } else if (Client.field771 < Client.field562) {
            Client.field771 = Client.field562;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
         if (Client.viewportWidget != null) {
            MouseHandler.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false);
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.viewportWidth;
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.viewportHeight;
         } else {
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1;
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.zoomHeight;
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.zoomWidth;
         return 1;
      } else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class156.method3226(Client.field764);
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class156.method3226(Client.field649);
         return 1;
      } else if (var0 == 6220) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
         return 1;
      } else if (var0 == 6221) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
         return 1;
      } else if (var0 == 6222) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = GameEngine.canvasWidth;
         return 1;
      } else if (var0 == 6223) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class10.canvasHeight;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("gk")
   @ObfuscatedSignature(
      descriptor = "(IIIB)V",
      garbageValue = "-54"
   )
   @Export("queueSoundEffect")
   static void queueSoundEffect(int var0, int var1, int var2) {
      if (BufferedSink.clientPreferences.method2427() != 0 && var1 != 0 && Client.soundEffectCount < 50) {
         Client.soundEffectIds[Client.soundEffectCount] = var0;
         Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1;
         Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2;
         Client.soundEffects[Client.soundEffectCount] = null;
         Client.soundLocations[Client.soundEffectCount] = 0;
         ++Client.soundEffectCount;
      }

   }
}
