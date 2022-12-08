import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("om")
public enum class413 implements MouseWheel {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lom;"
   )
   field4639(2, 1),
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lom;"
   )
   field4635(0, 2),
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lom;"
   )
   field4636(1, 3),
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lom;"
   )
   field4637(3, 10);

   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 2098058349
   )
   final int field4638;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -654043531
   )
   final int field4640;

   class413(int var3, int var4) {
      this.field4638 = var3;
      this.field4640 = var4;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "96"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field4640;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(ILbm;ZB)I",
      garbageValue = "16"
   )
   static int method7863(int var0, Script var1, boolean var2) {
      String var7;
      if (var0 == ScriptOpcodes.MES) {
         var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
         KitDefinition.addGameMessage(0, "", var7);
         return 1;
      } else if (var0 == ScriptOpcodes.ANIM) {
         class87.Interpreter_intStackSize -= 2;
         class262.performPlayerAnimation(class155.localPlayer, Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]);
         return 1;
      } else if (var0 == ScriptOpcodes.IF_CLOSE) {
         if (!Interpreter.field868) {
            Interpreter.field865 = true;
         }

         return 1;
      } else {
         int var16;
         if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
            var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
            var16 = 0;
            if (class346.isNumber(var7)) {
               var16 = class412.method7858(var7);
            }

            PacketBufferNode var14 = class136.getPacketBufferNode(ClientPacket.RESUME_COUNTDIALOG, Client.packetWriter.isaacCipher);
            var14.packetBuffer.writeInt(var16);
            Client.packetWriter.addNode(var14);
            return 1;
         } else {
            PacketBufferNode var12;
            if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
               var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
               var12 = class136.getPacketBufferNode(ClientPacket.RESUME_NAMEDIALOG, Client.packetWriter.isaacCipher);
               var12.packetBuffer.writeByte(var7.length() + 1);
               var12.packetBuffer.writeStringCp1252NullTerminated(var7);
               Client.packetWriter.addNode(var12);
               return 1;
            } else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
               var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
               var12 = class136.getPacketBufferNode(ClientPacket.RESUME_STRINGDIALOG, Client.packetWriter.isaacCipher);
               var12.packetBuffer.writeByte(var7.length() + 1);
               var12.packetBuffer.writeStringCp1252NullTerminated(var7);
               Client.packetWriter.addNode(var12);
               return 1;
            } else {
               int var3;
               String var11;
               if (var0 == ScriptOpcodes.OPPLAYER) {
                  var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                  var11 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
                  PcmPlayer.method856(var3, var11);
                  return 1;
               } else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
                  class87.Interpreter_intStackSize -= 3;
                  var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
                  var16 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
                  int var9 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2];
                  Widget var15 = PlayerCompositionColorTextureOverride.getWidget(var9);
                  class18.clickWidget(var15, var3, var16);
                  return 1;
               } else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
                  class87.Interpreter_intStackSize -= 2;
                  var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
                  var16 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
                  Widget var13 = var2 ? class190.scriptDotWidget : class360.scriptActiveWidget;
                  class18.clickWidget(var13, var3, var16);
                  return 1;
               } else if (var0 == ScriptOpcodes.MOUSECAM) {
                  SceneTilePaint.mouseCam = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
                  return 1;
               } else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = StructComposition.clientPreferences.method2412() ? 1 : 0;
                  return 1;
               } else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
                  StructComposition.clientPreferences.method2486(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1);
                  return 1;
               } else if (var0 == ScriptOpcodes.OPENURL) {
                  var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
                  boolean var8 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
                  ModeWhere.openURL(var7, var8, false);
                  return 1;
               } else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
                  var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                  var12 = class136.getPacketBufferNode(ClientPacket.RESUME_OBJDIALOG, Client.packetWriter.isaacCipher);
                  var12.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var12);
                  return 1;
               } else if (var0 == ScriptOpcodes.BUG_REPORT) {
                  var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                  Interpreter.Interpreter_stringStackSize -= 2;
                  var11 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
                  String var5 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
                  if (var11.length() > 500) {
                     return 1;
                  } else if (var5.length() > 500) {
                     return 1;
                  } else {
                     PacketBufferNode var6 = class136.getPacketBufferNode(ClientPacket.field3115, Client.packetWriter.isaacCipher);
                     var6.packetBuffer.writeShort(1 + class13.stringCp1252NullTerminatedByteSize(var11) + class13.stringCp1252NullTerminatedByteSize(var5));
                     var6.packetBuffer.writeByteSub(var3);
                     var6.packetBuffer.writeStringCp1252NullTerminated(var5);
                     var6.packetBuffer.writeStringCp1252NullTerminated(var11);
                     Client.packetWriter.addNode(var6);
                     return 1;
                  }
               } else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
                  Client.shiftClickDrop = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
                  return 1;
               } else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
                  Client.showMouseOverText = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
                  return 1;
               } else if (var0 == ScriptOpcodes.RENDERSELF) {
                  Client.renderSelf = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
                  return 1;
               } else if (var0 == 3120) {
                  if (Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1) {
                     Client.drawPlayerNames |= 1;
                  } else {
                     Client.drawPlayerNames &= -2;
                  }

                  return 1;
               } else if (var0 == 3121) {
                  if (Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1) {
                     Client.drawPlayerNames |= 2;
                  } else {
                     Client.drawPlayerNames &= -3;
                  }

                  return 1;
               } else if (var0 == 3122) {
                  if (Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1) {
                     Client.drawPlayerNames |= 4;
                  } else {
                     Client.drawPlayerNames &= -5;
                  }

                  return 1;
               } else if (var0 == 3123) {
                  if (Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1) {
                     Client.drawPlayerNames |= 8;
                  } else {
                     Client.drawPlayerNames &= -9;
                  }

                  return 1;
               } else if (var0 == 3124) {
                  Client.drawPlayerNames = 0;
                  return 1;
               } else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
                  Client.showMouseCross = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
                  return 1;
               } else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
                  Client.showLoadingMessages = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
                  return 1;
               } else if (var0 == ScriptOpcodes.SETTAPTODROP) {
                  class358.setTapToDrop(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1);
                  return 1;
               } else if (var0 == ScriptOpcodes.GETTAPTODROP) {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = TextureProvider.getTapToDrop() ? 1 : 0;
                  return 1;
               } else if (var0 == 3129) {
                  class87.Interpreter_intStackSize -= 2;
                  Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
                  Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
                  return 1;
               } else if (var0 == 3130) {
                  class87.Interpreter_intStackSize -= 2;
                  return 1;
               } else if (var0 == 3131) {
                  --class87.Interpreter_intStackSize;
                  return 1;
               } else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = CollisionMap.canvasWidth;
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Language.canvasHeight;
                  return 1;
               } else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
                  --class87.Interpreter_intStackSize;
                  return 1;
               } else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
                  return 1;
               } else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
                  class87.Interpreter_intStackSize -= 2;
                  return 1;
               } else if (var0 == 3136) {
                  Client.field791 = 3;
                  Client.field683 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                  return 1;
               } else if (var0 == 3137) {
                  Client.field791 = 2;
                  Client.field683 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                  return 1;
               } else if (var0 == 3138) {
                  Client.field791 = 0;
                  return 1;
               } else if (var0 == 3139) {
                  Client.field791 = 1;
                  return 1;
               } else if (var0 == 3140) {
                  Client.field791 = 3;
                  Client.field683 = var2 ? class190.scriptDotWidget.id : class360.scriptActiveWidget.id;
                  return 1;
               } else {
                  boolean var10;
                  if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
                     var10 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
                     StructComposition.clientPreferences.method2461(var10);
                     return 1;
                  } else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = StructComposition.clientPreferences.method2413() ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
                     var10 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
                     Client.Login_isUsernameRemembered = var10;
                     if (!var10) {
                        StructComposition.clientPreferences.method2429("");
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
                     return 1;
                  } else if (var0 == 3146) {
                     var10 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
                     StructComposition.clientPreferences.method2448(!var10);
                     return 1;
                  } else if (var0 == 3147) {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = StructComposition.clientPreferences.method2428() ? 0 : 1;
                     return 1;
                  } else if (var0 == 3148) {
                     return 1;
                  } else if (var0 == 3149) {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3150) {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3151) {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3152) {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3153) {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Login.Login_loadingPercent;
                     return 1;
                  } else if (var0 == 3154) {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = GraphicsObject.method2021();
                     return 1;
                  } else if (var0 == 3155) {
                     --Interpreter.Interpreter_stringStackSize;
                     return 1;
                  } else if (var0 == 3156) {
                     return 1;
                  } else if (var0 == 3157) {
                     class87.Interpreter_intStackSize -= 2;
                     return 1;
                  } else if (var0 == 3158) {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3159) {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3160) {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3161) {
                     --class87.Interpreter_intStackSize;
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3162) {
                     --class87.Interpreter_intStackSize;
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3163) {
                     --Interpreter.Interpreter_stringStackSize;
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3164) {
                     --class87.Interpreter_intStackSize;
                     Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                     return 1;
                  } else if (var0 == 3165) {
                     --class87.Interpreter_intStackSize;
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3166) {
                     class87.Interpreter_intStackSize -= 2;
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3167) {
                     class87.Interpreter_intStackSize -= 2;
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3168) {
                     class87.Interpreter_intStackSize -= 2;
                     Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                     return 1;
                  } else if (var0 == 3169) {
                     return 1;
                  } else if (var0 == 3170) {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3171) {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3172) {
                     --class87.Interpreter_intStackSize;
                     return 1;
                  } else if (var0 == 3173) {
                     --class87.Interpreter_intStackSize;
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3174) {
                     --class87.Interpreter_intStackSize;
                     return 1;
                  } else if (var0 == 3175) {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3176) {
                     return 1;
                  } else if (var0 == 3177) {
                     return 1;
                  } else if (var0 == 3178) {
                     --Interpreter.Interpreter_stringStackSize;
                     return 1;
                  } else if (var0 == 3179) {
                     return 1;
                  } else if (var0 == 3180) {
                     --Interpreter.Interpreter_stringStackSize;
                     return 1;
                  } else if (var0 == 3181) {
                     class14.method170(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]);
                     return 1;
                  } else if (var0 == 3182) {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class273.method5478();
                     return 1;
                  } else if (var0 == 3189) {
                     var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                     SequenceDefinition var4 = AABB.SequenceDefinition_get(var3);
                     if (var4.isCachedModelIdSet()) {
                        Login.method2096(var4.SequenceDefinition_cachedModelId);
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

   @ObfuscatedName("lr")
   @ObfuscatedSignature(
      descriptor = "(Lkd;I)V",
      garbageValue = "-458709619"
   )
   static final void method7860(Widget var0) {
      int var1 = var0.contentType;
      if (var1 == 324) {
         if (Client.field792 == -1) {
            Client.field792 = var0.spriteId2;
            Client.field793 = var0.spriteId;
         }

         if (Client.playerAppearance.gender == 1) {
            var0.spriteId2 = Client.field792;
         } else {
            var0.spriteId2 = Client.field793;
         }

      } else if (var1 == 325) {
         if (Client.field792 == -1) {
            Client.field792 = var0.spriteId2;
            Client.field793 = var0.spriteId;
         }

         if (Client.playerAppearance.gender == 1) {
            var0.spriteId2 = Client.field793;
         } else {
            var0.spriteId2 = Client.field792;
         }

      } else if (var1 == 327) {
         var0.modelAngleX = 150;
         var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0) * 256.0) & 2047;
         var0.modelType = 5;
         var0.modelId = 0;
      } else if (var1 == 328) {
         var0.modelAngleX = 150;
         var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0) * 256.0) & 2047;
         var0.modelType = 5;
         var0.modelId = 1;
      }
   }
}
