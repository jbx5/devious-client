import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hk")
public class class217 {
   @ObfuscatedName("ig")
   @Export("regionLandArchiveIds")
   static int[] regionLandArchiveIds;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "[Ldc;"
   )
   class122[] field2517;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 968840143
   )
   int field2516;

   @ObfuscatedSignature(
      descriptor = "(Lrd;I)V"
   )
   class217(Buffer var1, int var2) {
      this.field2517 = new class122[var2];
      this.field2516 = var1.readUnsignedByte();

      for(int var3 = 0; var3 < this.field2517.length; ++var3) {
         class122 var4 = new class122(this.field2516, var1, false);
         this.field2517[var3] = var4;
      }

      this.method4430();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1141045260"
   )
   void method4430() {
      class122[] var1 = this.field2517;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         class122 var3 = var1[var2];
         if (var3.field1491 >= 0) {
            var3.field1500 = this.field2517[var3.field1491];
         }
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "20"
   )
   public int method4428() {
      return this.field2517.length;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(II)Ldc;",
      garbageValue = "-1083474755"
   )
   class122 method4425(int var1) {
      return var1 >= this.method4428() ? null : this.field2517[var1];
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(B)[Ldc;",
      garbageValue = "-24"
   )
   class122[] method4431() {
      return this.field2517;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(Lei;II)V",
      garbageValue = "76193627"
   )
   void method4443(class133 var1, int var2) {
      this.method4423(var1, var2, (boolean[])null, false);
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(Lei;I[ZZI)V",
      garbageValue = "-1598359679"
   )
   void method4423(class133 var1, int var2, boolean[] var3, boolean var4) {
      int var5 = var1.method3117();
      int var6 = 0;
      class122[] var7 = this.method4431();

      for(int var8 = 0; var8 < var7.length; ++var8) {
         class122 var9 = var7[var8];
         if (var3 == null || var4 == var3[var6]) {
            var1.method3097(var2, var9, var6, var5);
         }

         ++var6;
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(ILba;ZI)I",
      garbageValue = "1299309656"
   )
   static int method4444(int var0, Script var1, boolean var2) {
      String var7;
      if (var0 == ScriptOpcodes.MES) {
         var7 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize];
         class280.addGameMessage(0, "", var7);
         return 1;
      } else if (var0 == ScriptOpcodes.ANIM) {
         class302.Interpreter_intStackSize -= 2;
         PendingSpawn.performPlayerAnimation(class387.localPlayer, Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]);
         return 1;
      } else if (var0 == ScriptOpcodes.IF_CLOSE) {
         if (!Interpreter.field866) {
            Interpreter.field851 = true;
         }

         return 1;
      } else {
         int var15;
         if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
            var7 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize];
            var15 = 0;
            if (class142.isNumber(var7)) {
               var15 = WorldMapScaleHandler.method5468(var7);
            }

            PacketBufferNode var13 = Renderable.getPacketBufferNode(ClientPacket.RESUME_COUNTDIALOG, Client.packetWriter.isaacCipher);
            var13.packetBuffer.writeInt(var15);
            Client.packetWriter.addNode(var13);
            return 1;
         } else {
            PacketBufferNode var11;
            if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
               var7 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize];
               var11 = Renderable.getPacketBufferNode(ClientPacket.RESUME_NAMEDIALOG, Client.packetWriter.isaacCipher);
               var11.packetBuffer.writeByte(var7.length() + 1);
               var11.packetBuffer.writeStringCp1252NullTerminated(var7);
               Client.packetWriter.addNode(var11);
               return 1;
            } else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
               var7 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize];
               var11 = Renderable.getPacketBufferNode(ClientPacket.RESUME_STRINGDIALOG, Client.packetWriter.isaacCipher);
               var11.packetBuffer.writeByte(var7.length() + 1);
               var11.packetBuffer.writeStringCp1252NullTerminated(var7);
               Client.packetWriter.addNode(var11);
               return 1;
            } else {
               int var3;
               String var4;
               if (var0 == ScriptOpcodes.OPPLAYER) {
                  var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                  var4 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize];
                  WorldMapIcon_0.method5263(var3, var4);
                  return 1;
               } else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
                  class302.Interpreter_intStackSize -= 3;
                  var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
                  var15 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
                  int var9 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2];
                  Widget var14 = class133.getWidget(var9);
                  UserComparator9.clickWidget(var14, var3, var15);
                  return 1;
               } else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
                  class302.Interpreter_intStackSize -= 2;
                  var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
                  var15 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
                  Widget var12 = var2 ? Interpreter.scriptDotWidget : class85.scriptActiveWidget;
                  UserComparator9.clickWidget(var12, var3, var15);
                  return 1;
               } else if (var0 == ScriptOpcodes.MOUSECAM) {
                  ClanMate.mouseCam = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
                  return 1;
               } else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = PacketWriter.clientPreferences.method2572() ? 1 : 0;
                  return 1;
               } else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
                  PacketWriter.clientPreferences.method2551(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1);
                  return 1;
               } else if (var0 == ScriptOpcodes.OPENURL) {
                  var7 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize];
                  boolean var8 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
                  AttackOption.openURL(var7, var8, false);
                  return 1;
               } else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
                  var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                  var11 = Renderable.getPacketBufferNode(ClientPacket.RESUME_OBJDIALOG, Client.packetWriter.isaacCipher);
                  var11.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var11);
                  return 1;
               } else if (var0 == ScriptOpcodes.BUG_REPORT) {
                  var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                  class20.Interpreter_stringStackSize -= 2;
                  var4 = Interpreter.Interpreter_stringStack[class20.Interpreter_stringStackSize];
                  String var5 = Interpreter.Interpreter_stringStack[class20.Interpreter_stringStackSize + 1];
                  if (var4.length() > 500) {
                     return 1;
                  } else if (var5.length() > 500) {
                     return 1;
                  } else {
                     PacketBufferNode var6 = Renderable.getPacketBufferNode(ClientPacket.field3130, Client.packetWriter.isaacCipher);
                     var6.packetBuffer.writeShort(1 + class96.stringCp1252NullTerminatedByteSize(var4) + class96.stringCp1252NullTerminatedByteSize(var5));
                     var6.packetBuffer.writeStringCp1252NullTerminated(var5);
                     var6.packetBuffer.writeStringCp1252NullTerminated(var4);
                     var6.packetBuffer.writeByteAdd(var3);
                     Client.packetWriter.addNode(var6);
                     return 1;
                  }
               } else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
                  Client.shiftClickDrop = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
                  return 1;
               } else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
                  Client.showMouseOverText = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
                  return 1;
               } else if (var0 == ScriptOpcodes.RENDERSELF) {
                  Client.renderSelf = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
                  return 1;
               } else if (var0 == 3120) {
                  if (Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1) {
                     Client.drawPlayerNames |= 1;
                  } else {
                     Client.drawPlayerNames &= -2;
                  }

                  return 1;
               } else if (var0 == 3121) {
                  if (Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1) {
                     Client.drawPlayerNames |= 2;
                  } else {
                     Client.drawPlayerNames &= -3;
                  }

                  return 1;
               } else if (var0 == 3122) {
                  if (Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1) {
                     Client.drawPlayerNames |= 4;
                  } else {
                     Client.drawPlayerNames &= -5;
                  }

                  return 1;
               } else if (var0 == 3123) {
                  if (Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1) {
                     Client.drawPlayerNames |= 8;
                  } else {
                     Client.drawPlayerNames &= -9;
                  }

                  return 1;
               } else if (var0 == 3124) {
                  Client.drawPlayerNames = 0;
                  return 1;
               } else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
                  Client.showMouseCross = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
                  return 1;
               } else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
                  Client.showLoadingMessages = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
                  return 1;
               } else if (var0 == ScriptOpcodes.SETTAPTODROP) {
                  class237.setTapToDrop(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1);
                  return 1;
               } else if (var0 == ScriptOpcodes.GETTAPTODROP) {
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Language.getTapToDrop() ? 1 : 0;
                  return 1;
               } else if (var0 == 3129) {
                  class302.Interpreter_intStackSize -= 2;
                  Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
                  Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
                  return 1;
               } else if (var0 == 3130) {
                  class302.Interpreter_intStackSize -= 2;
                  return 1;
               } else if (var0 == 3131) {
                  --class302.Interpreter_intStackSize;
                  return 1;
               } else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = GameEngine.canvasWidth;
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class127.canvasHeight;
                  return 1;
               } else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
                  --class302.Interpreter_intStackSize;
                  return 1;
               } else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
                  return 1;
               } else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
                  class302.Interpreter_intStackSize -= 2;
                  return 1;
               } else if (var0 == 3136) {
                  Client.field798 = 3;
                  Client.field677 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                  return 1;
               } else if (var0 == 3137) {
                  Client.field798 = 2;
                  Client.field677 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                  return 1;
               } else if (var0 == 3138) {
                  Client.field798 = 0;
                  return 1;
               } else if (var0 == 3139) {
                  Client.field798 = 1;
                  return 1;
               } else if (var0 == 3140) {
                  Client.field798 = 3;
                  Client.field677 = var2 ? Interpreter.scriptDotWidget.id : class85.scriptActiveWidget.id;
                  return 1;
               } else {
                  boolean var10;
                  if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
                     var10 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
                     PacketWriter.clientPreferences.method2483(var10);
                     return 1;
                  } else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = PacketWriter.clientPreferences.method2484() ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
                     var10 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
                     Client.Login_isUsernameRemembered = var10;
                     if (!var10) {
                        PacketWriter.clientPreferences.method2500("");
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
                     return 1;
                  } else if (var0 == 3146) {
                     var10 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
                     PacketWriter.clientPreferences.method2563(!var10);
                     return 1;
                  } else if (var0 == 3147) {
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = PacketWriter.clientPreferences.method2570() ? 0 : 1;
                     return 1;
                  } else if (var0 == 3148) {
                     return 1;
                  } else if (var0 == 3149) {
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3150) {
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3151) {
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3152) {
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3153) {
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Login.Login_loadingPercent;
                     return 1;
                  } else if (var0 == 3154) {
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class120.method2977();
                     return 1;
                  } else if (var0 == 3155) {
                     --class20.Interpreter_stringStackSize;
                     return 1;
                  } else if (var0 == 3156) {
                     return 1;
                  } else if (var0 == 3157) {
                     class302.Interpreter_intStackSize -= 2;
                     return 1;
                  } else if (var0 == 3158) {
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3159) {
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3160) {
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3161) {
                     --class302.Interpreter_intStackSize;
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3162) {
                     --class302.Interpreter_intStackSize;
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3163) {
                     --class20.Interpreter_stringStackSize;
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3164) {
                     --class302.Interpreter_intStackSize;
                     Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
                     return 1;
                  } else if (var0 == 3165) {
                     --class302.Interpreter_intStackSize;
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3166) {
                     class302.Interpreter_intStackSize -= 2;
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3167) {
                     class302.Interpreter_intStackSize -= 2;
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3168) {
                     class302.Interpreter_intStackSize -= 2;
                     Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
                     return 1;
                  } else if (var0 == 3169) {
                     return 1;
                  } else if (var0 == 3170) {
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3171) {
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3172) {
                     --class302.Interpreter_intStackSize;
                     return 1;
                  } else if (var0 == 3173) {
                     --class302.Interpreter_intStackSize;
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3174) {
                     --class302.Interpreter_intStackSize;
                     return 1;
                  } else if (var0 == 3175) {
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3176) {
                     return 1;
                  } else if (var0 == 3177) {
                     return 1;
                  } else if (var0 == 3178) {
                     --class20.Interpreter_stringStackSize;
                     return 1;
                  } else if (var0 == 3179) {
                     return 1;
                  } else if (var0 == 3180) {
                     --class20.Interpreter_stringStackSize;
                     return 1;
                  } else if (var0 == 3181) {
                     LoginScreenAnimation.method2463(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]);
                     return 1;
                  } else if (var0 == 3182) {
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class463.method8510();
                     return 1;
                  } else if (var0 == 3189) {
                     var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                     Archive.method6515(var3);
                     return 1;
                  } else {
                     return 2;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(ILba;ZS)I",
      garbageValue = "10769"
   )
   static int method4426(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.LOGOUT) {
         Client.logoutTimer = 250;
         return 1;
      } else {
         return 2;
      }
   }
}
