import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("eu")
public class class107 {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Leu;"
   )
   static final class107 field1359 = new class107(0);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Leu;"
   )
   static final class107 field1347 = new class107(1);
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Leu;"
   )
   static final class107 field1349 = new class107(2);
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Leu;"
   )
   static final class107 field1350 = new class107(3);
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Leu;"
   )
   static final class107 field1351 = new class107(4);
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Leu;"
   )
   static final class107 field1357 = new class107(5);
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Leu;"
   )
   static final class107 field1353 = new class107(6);
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "Leu;"
   )
   static final class107 field1348 = new class107(7);
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "Leu;"
   )
   static final class107 field1355 = new class107(8);
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Leu;"
   )
   static final class107 field1356 = new class107(9);
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Leu;"
   )
   static final class107 field1352 = new class107(10);
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "Leu;"
   )
   static final class107 field1358 = new class107(11);
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Leu;"
   )
   static final class107 field1354 = new class107(12);
   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "Leu;"
   )
   static final class107 field1360 = new class107(13);
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Leu;"
   )
   static final class107 field1361 = new class107(14);
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "Leu;"
   )
   static final class107 field1362 = new class107(15);
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 1697772055
   )
   int field1363;

   class107(int var1) {
      this.field1363 = var1;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lnq;III)Ltm;",
      garbageValue = "-2013610782"
   )
   @Export("SpriteBuffer_getSprite")
   public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
      byte[] var4 = var0.takeFile(var1, var2);
      boolean var3;
      if (var4 == null) {
         var3 = false;
      } else {
         UserComparator2.SpriteBuffer_decode(var4);
         var3 = true;
      }

      if (!var3) {
         return null;
      } else {
         SpritePixels var5 = new SpritePixels();
         var5.width = class330.SpriteBuffer_spriteWidth;
         var5.height = class489.SpriteBuffer_spriteHeight;
         var5.xOffset = class515.SpriteBuffer_xOffsets[0];
         var5.yOffset = class402.SpriteBuffer_yOffsets[0];
         var5.subWidth = class515.SpriteBuffer_spriteWidths[0];
         var5.subHeight = class515.SpriteBuffer_spriteHeights[0];
         int var6 = var5.subWidth * var5.subHeight;
         byte[] var7 = class515.SpriteBuffer_pixels[0];
         var5.pixels = new int[var6];

         for(int var8 = 0; var8 < var6; ++var8) {
            var5.pixels[var8] = class515.SpriteBuffer_spritePalette[var7[var8] & 255];
         }

         TextureProvider.method4758();
         return var5;
      }
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(IIS)I",
      garbageValue = "-100"
   )
   static final int method2701(int var0, int var1) {
      int var2 = GrandExchangeEvents.method6803(var0 + '넵', 91923 + var1, 4) - 128 + (GrandExchangeEvents.method6803(var0 + 10294, '鎽' + var1, 2) - 128 >> 1) + (GrandExchangeEvents.method6803(var0, var1, 1) - 128 >> 2);
      var2 = (int)(0.3 * (double)var2) + 35;
      if (var2 < 10) {
         var2 = 10;
      } else if (var2 > 60) {
         var2 = 60;
      }

      return var2;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(ILdd;ZI)I",
      garbageValue = "-195406746"
   )
   static int method2700(int var0, Script var1, boolean var2) {
      String var7;
      if (var0 == ScriptOpcodes.MES) {
         var7 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
         class59.addGameMessage(0, "", var7);
         return 1;
      } else if (var0 == ScriptOpcodes.ANIM) {
         Interpreter.Interpreter_intStackSize -= 2;
         ServerPacket.performPlayerAnimation(Projectile.localPlayer, Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
         return 1;
      } else if (var0 == ScriptOpcodes.IF_CLOSE) {
         if (!Interpreter.field875) {
            Interpreter.field852 = true;
         }

         return 1;
      } else {
         int var15;
         if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
            var7 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
            var15 = 0;
            if (class146.isNumber(var7)) {
               var15 = TextureProvider.method4744(var7);
            }

            PacketBufferNode var13 = ObjectComposition.getPacketBufferNode(ClientPacket.RESUME_COUNTDIALOG, Client.packetWriter.isaacCipher);
            var13.packetBuffer.writeInt(var15);
            Client.packetWriter.addNode(var13);
            return 1;
         } else {
            PacketBufferNode var11;
            if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
               var7 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
               var11 = ObjectComposition.getPacketBufferNode(ClientPacket.RESUME_NAMEDIALOG, Client.packetWriter.isaacCipher);
               var11.packetBuffer.writeByte(var7.length() + 1);
               var11.packetBuffer.writeStringCp1252NullTerminated(var7);
               Client.packetWriter.addNode(var11);
               return 1;
            } else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
               var7 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
               var11 = ObjectComposition.getPacketBufferNode(ClientPacket.RESUME_STRINGDIALOG, Client.packetWriter.isaacCipher);
               var11.packetBuffer.writeByte(var7.length() + 1);
               var11.packetBuffer.writeStringCp1252NullTerminated(var7);
               Client.packetWriter.addNode(var11);
               return 1;
            } else {
               int var3;
               String var4;
               if (var0 == ScriptOpcodes.OPPLAYER) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var4 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
                  class47.method845(var3, var4);
                  return 1;
               } else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
                  Interpreter.Interpreter_intStackSize -= 3;
                  var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                  var15 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                  int var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
                  Widget var14 = FriendSystem.getWidget(var9);
                  UserComparator10.clickWidget(var14, var3, var15);
                  return 1;
               } else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
                  Interpreter.Interpreter_intStackSize -= 2;
                  var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                  var15 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                  Widget var12 = var2 ? class53.scriptDotWidget : Interpreter.scriptActiveWidget;
                  UserComparator10.clickWidget(var12, var3, var15);
                  return 1;
               } else if (var0 == ScriptOpcodes.MOUSECAM) {
                  class305.mouseCam = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                  return 1;
               } else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class10.clientPreferences.method2434() ? 1 : 0;
                  return 1;
               } else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
                  class10.clientPreferences.method2489(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1);
                  return 1;
               } else if (var0 == ScriptOpcodes.OPENURL) {
                  var7 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
                  boolean var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                  class27.openURL(var7, var8, false);
                  return 1;
               } else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var11 = ObjectComposition.getPacketBufferNode(ClientPacket.RESUME_OBJDIALOG, Client.packetWriter.isaacCipher);
                  var11.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var11);
                  return 1;
               } else if (var0 == ScriptOpcodes.BUG_REPORT) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  class149.Interpreter_stringStackSize -= 2;
                  var4 = Interpreter.Interpreter_stringStack[class149.Interpreter_stringStackSize];
                  String var5 = Interpreter.Interpreter_stringStack[class149.Interpreter_stringStackSize + 1];
                  if (var4.length() > 500) {
                     return 1;
                  } else if (var5.length() > 500) {
                     return 1;
                  } else {
                     PacketBufferNode var6 = ObjectComposition.getPacketBufferNode(ClientPacket.field3150, Client.packetWriter.isaacCipher);
                     var6.packetBuffer.writeShort(1 + Widget.stringCp1252NullTerminatedByteSize(var4) + Widget.stringCp1252NullTerminatedByteSize(var5));
                     var6.packetBuffer.writeStringCp1252NullTerminated(var5);
                     var6.packetBuffer.writeByte(var3);
                     var6.packetBuffer.writeStringCp1252NullTerminated(var4);
                     Client.packetWriter.addNode(var6);
                     return 1;
                  }
               } else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
                  --Interpreter.Interpreter_intStackSize;
                  return 1;
               } else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
                  Client.showMouseOverText = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                  return 1;
               } else if (var0 == ScriptOpcodes.RENDERSELF) {
                  Client.field751 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                  return 1;
               } else if (var0 == 3120) {
                  if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
                     Client.drawPlayerNames |= 1;
                  } else {
                     Client.drawPlayerNames &= -2;
                  }

                  return 1;
               } else if (var0 == 3121) {
                  if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
                     Client.drawPlayerNames |= 2;
                  } else {
                     Client.drawPlayerNames &= -3;
                  }

                  return 1;
               } else if (var0 == 3122) {
                  if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
                     Client.drawPlayerNames |= 4;
                  } else {
                     Client.drawPlayerNames &= -5;
                  }

                  return 1;
               } else if (var0 == 3123) {
                  if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
                     Client.drawPlayerNames |= 8;
                  } else {
                     Client.drawPlayerNames &= -9;
                  }

                  return 1;
               } else if (var0 == 3124) {
                  Client.drawPlayerNames = 0;
                  return 1;
               } else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
                  Client.showMouseCross = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                  return 1;
               } else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
                  Client.showLoadingMessages = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                  return 1;
               } else if (var0 == ScriptOpcodes.SETTAPTODROP) {
                  class105.setTapToDrop(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1);
                  return 1;
               } else if (var0 == ScriptOpcodes.GETTAPTODROP) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SceneTilePaint.getTapToDrop() ? 1 : 0;
                  return 1;
               } else if (var0 == 3129) {
                  Interpreter.Interpreter_intStackSize -= 2;
                  Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                  Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                  return 1;
               } else if (var0 == 3130) {
                  Interpreter.Interpreter_intStackSize -= 2;
                  return 1;
               } else if (var0 == 3131) {
                  --Interpreter.Interpreter_intStackSize;
                  return 1;
               } else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class448.canvasWidth;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapID.canvasHeight;
                  return 1;
               } else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
                  --Interpreter.Interpreter_intStackSize;
                  return 1;
               } else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
                  return 1;
               } else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
                  Interpreter.Interpreter_intStackSize -= 2;
                  return 1;
               } else if (var0 == 3136) {
                  Client.field517 = 3;
                  Client.field613 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  return 1;
               } else if (var0 == 3137) {
                  Client.field517 = 2;
                  Client.field613 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  return 1;
               } else if (var0 == 3138) {
                  Client.field517 = 0;
                  return 1;
               } else if (var0 == 3139) {
                  Client.field517 = 1;
                  return 1;
               } else if (var0 == 3140) {
                  Client.field517 = 3;
                  Client.field613 = var2 ? class53.scriptDotWidget.id : Interpreter.scriptActiveWidget.id;
                  return 1;
               } else {
                  boolean var10;
                  if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
                     var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     class10.clientPreferences.method2524(var10);
                     return 1;
                  } else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class10.clientPreferences.method2472() ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
                     var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     Client.Login_isUsernameRemembered = var10;
                     if (!var10) {
                        class10.clientPreferences.method2432("");
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
                     return 1;
                  } else if (var0 == 3146) {
                     var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     class10.clientPreferences.method2436(!var10);
                     return 1;
                  } else if (var0 == 3147) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class10.clientPreferences.method2437() ? 0 : 1;
                     return 1;
                  } else if (var0 == 3148) {
                     return 1;
                  } else if (var0 == 3149) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3150) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3151) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3152) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3153) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Login.Login_loadingPercent;
                     return 1;
                  } else if (var0 == 3154) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = FriendLoginUpdate.method7786();
                     return 1;
                  } else if (var0 == 3155) {
                     --class149.Interpreter_stringStackSize;
                     return 1;
                  } else if (var0 == 3156) {
                     return 1;
                  } else if (var0 == 3157) {
                     Interpreter.Interpreter_intStackSize -= 2;
                     return 1;
                  } else if (var0 == 3158) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3159) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3160) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3161) {
                     --Interpreter.Interpreter_intStackSize;
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3162) {
                     --Interpreter.Interpreter_intStackSize;
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3163) {
                     --class149.Interpreter_stringStackSize;
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3164) {
                     --Interpreter.Interpreter_intStackSize;
                     Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
                     return 1;
                  } else if (var0 == 3165) {
                     --Interpreter.Interpreter_intStackSize;
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3166) {
                     Interpreter.Interpreter_intStackSize -= 2;
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3167) {
                     Interpreter.Interpreter_intStackSize -= 2;
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3168) {
                     Interpreter.Interpreter_intStackSize -= 2;
                     Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
                     return 1;
                  } else if (var0 == 3169) {
                     return 1;
                  } else if (var0 == 3170) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3171) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3172) {
                     --Interpreter.Interpreter_intStackSize;
                     return 1;
                  } else if (var0 == 3173) {
                     --Interpreter.Interpreter_intStackSize;
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3174) {
                     --Interpreter.Interpreter_intStackSize;
                     return 1;
                  } else if (var0 == 3175) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3176) {
                     return 1;
                  } else if (var0 == 3177) {
                     return 1;
                  } else if (var0 == 3178) {
                     --class149.Interpreter_stringStackSize;
                     return 1;
                  } else if (var0 == 3179) {
                     return 1;
                  } else if (var0 == 3180) {
                     --class149.Interpreter_stringStackSize;
                     return 1;
                  } else if (var0 == 3181) {
                     class164.method3366(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
                     return 1;
                  } else if (var0 == 3182) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class60.method1119();
                     return 1;
                  } else if (var0 == 3189) {
                     var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                     WorldMapIcon_1.method5068(var3);
                     return 1;
                  } else {
                     return 2;
                  }
               }
            }
         }
      }
   }
}
