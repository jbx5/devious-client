import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("no")
@Implements("NetFileRequest")
public class NetFileRequest extends DualNode {
   @ObfuscatedName("fc")
   @ObfuscatedSignature(
      descriptor = "Lnd;"
   )
   @Export("archive10")
   static Archive archive10;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lnd;"
   )
   @Export("archive")
   Archive archive;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -75260527
   )
   @Export("crc")
   int crc;
   @ObfuscatedName("aw")
   @Export("padding")
   byte padding;

   NetFileRequest() {
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(ILch;ZB)I",
      garbageValue = "-19"
   )
   static int method6685(int var0, Script var1, boolean var2) {
      String var7;
      if (var0 == ScriptOpcodes.MES) {
         var7 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize];
         UserComparator5.addGameMessage(0, "", var7);
         return 1;
      } else if (var0 == ScriptOpcodes.ANIM) {
         Interpreter.Interpreter_intStackSize -= 2;
         FloorDecoration.performPlayerAnimation(MusicPatchNode.localPlayer, Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
         return 1;
      } else if (var0 == ScriptOpcodes.IF_CLOSE) {
         if (!Interpreter.field853) {
            Interpreter.field849 = true;
         }

         return 1;
      } else {
         int var15;
         if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
            var7 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize];
            var15 = 0;
            if (WorldMapSectionType.isNumber(var7)) {
               var15 = PacketBufferNode.method5709(var7);
            }

            PacketBufferNode var13 = class330.getPacketBufferNode(ClientPacket.RESUME_COUNTDIALOG, Client.packetWriter.isaacCipher);
            var13.packetBuffer.writeInt(var15);
            Client.packetWriter.addNode(var13);
            return 1;
         } else {
            PacketBufferNode var11;
            if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
               var7 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize];
               var11 = class330.getPacketBufferNode(ClientPacket.RESUME_NAMEDIALOG, Client.packetWriter.isaacCipher);
               var11.packetBuffer.writeByte(var7.length() + 1);
               var11.packetBuffer.writeStringCp1252NullTerminated(var7);
               Client.packetWriter.addNode(var11);
               return 1;
            } else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
               var7 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize];
               var11 = class330.getPacketBufferNode(ClientPacket.RESUME_STRINGDIALOG, Client.packetWriter.isaacCipher);
               var11.packetBuffer.writeByte(var7.length() + 1);
               var11.packetBuffer.writeStringCp1252NullTerminated(var7);
               Client.packetWriter.addNode(var11);
               return 1;
            } else {
               int var3;
               String var4;
               if (var0 == ScriptOpcodes.OPPLAYER) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var4 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize];
                  UserComparator7.method2909(var3, var4);
                  return 1;
               } else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
                  Interpreter.Interpreter_intStackSize -= 3;
                  var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                  var15 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                  int var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
                  Widget var14 = class165.getWidget(var9);
                  class370.clickWidget(var14, var3, var15);
                  return 1;
               } else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
                  Interpreter.Interpreter_intStackSize -= 2;
                  var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                  var15 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                  Widget var12 = var2 ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget;
                  class370.clickWidget(var12, var3, var15);
                  return 1;
               } else if (var0 == ScriptOpcodes.MOUSECAM) {
                  class473.mouseCam = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                  return 1;
               } else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class20.clientPreferences.method2513() ? 1 : 0;
                  return 1;
               } else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
                  class20.clientPreferences.method2448(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1);
                  return 1;
               } else if (var0 == ScriptOpcodes.OPENURL) {
                  var7 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize];
                  boolean var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                  Ignored.openURL(var7, var8, false);
                  return 1;
               } else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var11 = class330.getPacketBufferNode(ClientPacket.RESUME_OBJDIALOG, Client.packetWriter.isaacCipher);
                  var11.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var11);
                  return 1;
               } else if (var0 == ScriptOpcodes.BUG_REPORT) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  SecureRandomCallable.Interpreter_stringStackSize -= 2;
                  var4 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize];
                  String var5 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize + 1];
                  if (var4.length() > 500) {
                     return 1;
                  } else if (var5.length() > 500) {
                     return 1;
                  } else {
                     PacketBufferNode var6 = class330.getPacketBufferNode(ClientPacket.field3140, Client.packetWriter.isaacCipher);
                     var6.packetBuffer.writeShort(1 + DynamicObject.stringCp1252NullTerminatedByteSize(var4) + DynamicObject.stringCp1252NullTerminatedByteSize(var5));
                     var6.packetBuffer.writeStringCp1252NullTerminated(var4);
                     var6.packetBuffer.writeByteSub(var3);
                     var6.packetBuffer.writeStringCp1252NullTerminated(var5);
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
                  Client.field614 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
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
                  class120.setTapToDrop(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1);
                  return 1;
               } else if (var0 == ScriptOpcodes.GETTAPTODROP) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class13.getTapToDrop() ? 1 : 0;
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
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GameEngine.canvasWidth;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class262.canvasHeight;
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
                  Client.field595 = 3;
                  Client.field658 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  return 1;
               } else if (var0 == 3137) {
                  Client.field595 = 2;
                  Client.field658 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  return 1;
               } else if (var0 == 3138) {
                  Client.field595 = 0;
                  return 1;
               } else if (var0 == 3139) {
                  Client.field595 = 1;
                  return 1;
               } else if (var0 == 3140) {
                  Client.field595 = 3;
                  Client.field658 = var2 ? SoundSystem.scriptDotWidget.id : class1.scriptActiveWidget.id;
                  return 1;
               } else {
                  boolean var10;
                  if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
                     var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     class20.clientPreferences.method2449(var10);
                     return 1;
                  } else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class20.clientPreferences.method2450() ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
                     var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     Client.Login_isUsernameRemembered = var10;
                     if (!var10) {
                        class20.clientPreferences.method2466("");
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
                     return 1;
                  } else if (var0 == 3146) {
                     var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     class20.clientPreferences.method2531(!var10);
                     return 1;
                  } else if (var0 == 3147) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class20.clientPreferences.method2534() ? 0 : 1;
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
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = MouseHandler.method710();
                     return 1;
                  } else if (var0 == 3155) {
                     --SecureRandomCallable.Interpreter_stringStackSize;
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
                     --SecureRandomCallable.Interpreter_stringStackSize;
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3164) {
                     --Interpreter.Interpreter_intStackSize;
                     Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
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
                     Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
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
                     --SecureRandomCallable.Interpreter_stringStackSize;
                     return 1;
                  } else if (var0 == 3179) {
                     return 1;
                  } else if (var0 == 3180) {
                     --SecureRandomCallable.Interpreter_stringStackSize;
                     return 1;
                  } else if (var0 == 3181) {
                     ApproximateRouteStrategy.method1205(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
                     return 1;
                  } else if (var0 == 3182) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class103.method2714();
                     return 1;
                  } else if (var0 == 3189) {
                     var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                     DevicePcmPlayerProvider.method323(var3);
                     return 1;
                  } else {
                     return 2;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "(ILch;ZS)I",
      garbageValue = "-23771"
   )
   static int method6686(int var0, Script var1, boolean var2) {
      if (var0 == 6809) {
         int var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         ObjectComposition var4 = class144.getObjectDefinition(var3);
         Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : "";
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("ik")
   @ObfuscatedSignature(
      descriptor = "(Lde;B)V",
      garbageValue = "-25"
   )
   static final void method6684(Actor var0) {
      var0.isWalking = false;
      if (var0.movementSequence != -1) {
         SequenceDefinition var1 = ItemContainer.SequenceDefinition_get(var0.movementSequence);
         if (var1 != null) {
            if (!var1.isCachedModelIdSet() && var1.frameIds != null) {
               ++var0.movementFrameCycle;
               if (var0.movementFrame < var1.frameIds.length && var0.movementFrameCycle > var1.frameLengths[var0.movementFrame]) {
                  var0.movementFrameCycle = 1;
                  ++var0.movementFrame;
                  class287.method5696(var1, var0.movementFrame, var0.x, var0.y);
               }

               if (var0.movementFrame >= var1.frameIds.length) {
                  if (var1.frameCount > 0) {
                     var0.movementFrame -= var1.frameCount;
                     if (var1.field2307) {
                        ++var0.field1179;
                     }

                     if (var0.movementFrame < 0 || var0.movementFrame >= var1.frameIds.length || var1.field2307 && var0.field1179 >= var1.field2287) {
                        var0.movementFrameCycle = 0;
                        var0.movementFrame = 0;
                        var0.field1179 = 0;
                     }
                  } else {
                     var0.movementFrameCycle = 0;
                     var0.movementFrame = 0;
                  }

                  class287.method5696(var1, var0.movementFrame, var0.x, var0.y);
               }
            } else if (var1.isCachedModelIdSet()) {
               ++var0.movementFrame;
               int var2 = var1.method4135();
               if (var0.movementFrame < var2) {
                  KeyHandler.method386(var1, var0.movementFrame, var0.x, var0.y);
               } else {
                  if (var1.frameCount > 0) {
                     var0.movementFrame -= var1.frameCount;
                     if (var1.field2307) {
                        ++var0.field1179;
                     }

                     if (var0.movementFrame < 0 || var0.movementFrame >= var2 || var1.field2307 && var0.field1179 >= var1.field2287) {
                        var0.movementFrame = 0;
                        var0.movementFrameCycle = 0;
                        var0.field1179 = 0;
                     }
                  } else {
                     var0.movementFrameCycle = 0;
                     var0.movementFrame = 0;
                  }

                  KeyHandler.method386(var1, var0.movementFrame, var0.x, var0.y);
               }
            } else {
               var0.movementSequence = -1;
            }
         } else {
            var0.movementSequence = -1;
         }
      }

      IterableNodeHashTableIterator var7 = new IterableNodeHashTableIterator(var0.getSpotAnimations());

      int var3;
      for(ActorSpotAnim var6 = (ActorSpotAnim)var7.method8686(); var6 != null; var6 = (ActorSpotAnim)var7.next()) {
         if (var6.spotAnimation != -1 && Client.cycle >= var6.field5144) {
            var3 = ItemContainer.SpotAnimationDefinition_get(var6.spotAnimation).sequence;
            if (var3 == -1) {
               var6.remove();
               --var0.graphicsCount;
            } else {
               var6.spotAnimationFrame = Math.max(var6.spotAnimationFrame, 0);
               SequenceDefinition var4 = ItemContainer.SequenceDefinition_get(var3);
               if (var4.frameIds != null && !var4.isCachedModelIdSet()) {
                  ++var6.spotAnimationFrameCycle;
                  if (var6.spotAnimationFrame < var4.frameIds.length && var6.spotAnimationFrameCycle > var4.frameLengths[var6.spotAnimationFrame]) {
                     var6.spotAnimationFrameCycle = 1;
                     ++var6.spotAnimationFrame;
                     class287.method5696(var4, var6.spotAnimationFrame, var0.x, var0.y);
                  }

                  if (var6.spotAnimationFrame >= var4.frameIds.length) {
                     var6.remove();
                     --var0.graphicsCount;
                  }
               } else if (var4.isCachedModelIdSet()) {
                  ++var6.spotAnimationFrame;
                  int var5 = var4.method4135();
                  if (var6.spotAnimationFrame < var5) {
                     KeyHandler.method386(var4, var6.spotAnimationFrame, var0.x, var0.y);
                  } else {
                     var6.remove();
                     --var0.graphicsCount;
                  }
               } else {
                  var6.remove();
                  --var0.graphicsCount;
               }
            }
         }
      }

      SequenceDefinition var8;
      if (var0.sequence != -1 && var0.sequenceDelay <= 1) {
         var8 = ItemContainer.SequenceDefinition_get(var0.sequence);
         if (var8.field2312 == 1 && var0.field1210 > 0 && var0.spotAnimation <= Client.cycle && var0.field1192 < Client.cycle) {
            var0.sequenceDelay = 1;
            return;
         }
      }

      if (var0.sequence != -1 && var0.sequenceDelay == 0) {
         var8 = ItemContainer.SequenceDefinition_get(var0.sequence);
         if (var8 != null) {
            if (!var8.isCachedModelIdSet() && var8.frameIds != null) {
               ++var0.sequenceFrameCycle;
               if (var0.sequenceFrame < var8.frameIds.length && var0.sequenceFrameCycle > var8.frameLengths[var0.sequenceFrame]) {
                  var0.sequenceFrameCycle = 1;
                  ++var0.sequenceFrame;
                  class287.method5696(var8, var0.sequenceFrame, var0.x, var0.y);
               }

               if (var0.sequenceFrame >= var8.frameIds.length) {
                  var0.sequenceFrame -= var8.frameCount;
                  ++var0.field1184;
                  if (var0.field1184 >= var8.field2287) {
                     var0.sequence = -1;
                  } else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var8.frameIds.length) {
                     class287.method5696(var8, var0.sequenceFrame, var0.x, var0.y);
                  } else {
                     var0.sequence = -1;
                  }
               }

               var0.isWalking = var8.field2306;
            } else if (var8.isCachedModelIdSet()) {
               ++var0.sequenceFrame;
               var3 = var8.method4135();
               if (var0.sequenceFrame < var3) {
                  KeyHandler.method386(var8, var0.sequenceFrame, var0.x, var0.y);
               } else {
                  var0.sequenceFrame -= var8.frameCount;
                  ++var0.field1184;
                  if (var0.field1184 >= var8.field2287) {
                     var0.sequence = -1;
                  } else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var3) {
                     KeyHandler.method386(var8, var0.sequenceFrame, var0.x, var0.y);
                  } else {
                     var0.sequence = -1;
                  }
               }
            } else {
               var0.sequence = -1;
            }
         } else {
            var0.sequence = -1;
         }
      }

      if (var0.sequenceDelay > 0) {
         --var0.sequenceDelay;
      }

   }
}
