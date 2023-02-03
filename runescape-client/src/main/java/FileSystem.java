import java.io.File;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
@Implements("FileSystem")
public class FileSystem {
   @ObfuscatedName("f")
   @Export("FileSystem_hasPermissions")
   static boolean FileSystem_hasPermissions = false;
   @ObfuscatedName("w")
   @Export("FileSystem_cacheDir")
   static File FileSystem_cacheDir;
   @ObfuscatedName("v")
   @Export("FileSystem_cacheFiles")
   static Hashtable FileSystem_cacheFiles = new Hashtable(16);

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lkz;I)I",
      garbageValue = "-1394707617"
   )
   static int method3510(Widget var0) {
      if (var0.type != 11) {
         --class20.Interpreter_stringStackSize;
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1;
         return 1;
      } else {
         String var1 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize];
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var0.method6216(var1);
         return 1;
      }
   }

   @ObfuscatedName("im")
   @ObfuscatedSignature(
      descriptor = "(IIIIILjava/lang/String;Ljava/lang/String;IIB)V",
      garbageValue = "1"
   )
   @Export("menuAction")
   static final void menuAction(int var0, int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
      if (var2 >= 2000) {
         var2 -= 2000;
      }

      PacketBufferNode var9;
      if (var2 == 1) {
         Client.mouseCrossX = var7;
         Client.mouseCrossY = var8;
         Client.mouseCrossColor = 2;
         Client.mouseCrossState = 0;
         Client.destinationX = var0;
         Client.destinationY = var1;
         var9 = Renderable.getPacketBufferNode(ClientPacket.field3156, Client.packetWriter.isaacCipher);
         var9.packetBuffer.writeIntIME(WorldMapLabel.selectedItemWidget);
         var9.packetBuffer.writeShortAdd(ParamComposition.baseX * 64 + var0);
         var9.packetBuffer.writeByteSub(Client.field702.method4143(82) ? 1 : 0);
         var9.packetBuffer.writeShortAdd(var3);
         var9.packetBuffer.writeShortAdd(WorldMapIcon_0.selectedItemSlot);
         var9.packetBuffer.writeShortAdd(class131.selectedItemId);
         var9.packetBuffer.writeShortAddLE(Client.baseY * 64 + var1);
         Client.packetWriter.addNode(var9);
      } else if (var2 == 2) {
         Client.mouseCrossX = var7;
         Client.mouseCrossY = var8;
         Client.mouseCrossColor = 2;
         Client.mouseCrossState = 0;
         Client.destinationX = var0;
         Client.destinationY = var1;
         var9 = Renderable.getPacketBufferNode(ClientPacket.OPLOCT, Client.packetWriter.isaacCipher);
         var9.packetBuffer.writeShortLE(Client.baseY * 64 + var1);
         var9.packetBuffer.writeShortAddLE(Client.selectedSpellItemId);
         var9.packetBuffer.writeIntIME(class9.selectedSpellWidget);
         var9.packetBuffer.writeByte(Client.field702.method4143(82) ? 1 : 0);
         var9.packetBuffer.writeShort(ParamComposition.baseX * 64 + var0);
         var9.packetBuffer.writeShortLE(var3);
         var9.packetBuffer.writeShort(Client.selectedSpellChildIndex);
         Client.packetWriter.addNode(var9);
      } else if (var2 == 3) {
         Client.mouseCrossX = var7;
         Client.mouseCrossY = var8;
         Client.mouseCrossColor = 2;
         Client.mouseCrossState = 0;
         Client.destinationX = var0;
         Client.destinationY = var1;
         var9 = Renderable.getPacketBufferNode(ClientPacket.OPLOC1, Client.packetWriter.isaacCipher);
         var9.packetBuffer.writeByteAdd(Client.field702.method4143(82) ? 1 : 0);
         var9.packetBuffer.writeShortAdd(ParamComposition.baseX * 64 + var0);
         var9.packetBuffer.writeShortLE(var3);
         var9.packetBuffer.writeShort(Client.baseY * 64 + var1);
         Client.packetWriter.addNode(var9);
      } else if (var2 == 4) {
         Client.mouseCrossX = var7;
         Client.mouseCrossY = var8;
         Client.mouseCrossColor = 2;
         Client.mouseCrossState = 0;
         Client.destinationX = var0;
         Client.destinationY = var1;
         var9 = Renderable.getPacketBufferNode(ClientPacket.OPLOC2, Client.packetWriter.isaacCipher);
         var9.packetBuffer.writeShortAdd(var3);
         var9.packetBuffer.writeShortAdd(ParamComposition.baseX * 64 + var0);
         var9.packetBuffer.writeShort(Client.baseY * 64 + var1);
         var9.packetBuffer.writeByteNeg(Client.field702.method4143(82) ? 1 : 0);
         Client.packetWriter.addNode(var9);
      } else if (var2 == 5) {
         Client.mouseCrossX = var7;
         Client.mouseCrossY = var8;
         Client.mouseCrossColor = 2;
         Client.mouseCrossState = 0;
         Client.destinationX = var0;
         Client.destinationY = var1;
         var9 = Renderable.getPacketBufferNode(ClientPacket.OPLOC3, Client.packetWriter.isaacCipher);
         var9.packetBuffer.writeByteAdd(Client.field702.method4143(82) ? 1 : 0);
         var9.packetBuffer.writeShortAddLE(Client.baseY * 64 + var1);
         var9.packetBuffer.writeShortAdd(ParamComposition.baseX * 64 + var0);
         var9.packetBuffer.writeShortLE(var3);
         Client.packetWriter.addNode(var9);
      } else if (var2 == 6) {
         Client.mouseCrossX = var7;
         Client.mouseCrossY = var8;
         Client.mouseCrossColor = 2;
         Client.mouseCrossState = 0;
         Client.destinationX = var0;
         Client.destinationY = var1;
         var9 = Renderable.getPacketBufferNode(ClientPacket.OPLOC4, Client.packetWriter.isaacCipher);
         var9.packetBuffer.writeShortAdd(ParamComposition.baseX * 64 + var0);
         var9.packetBuffer.writeShort(Client.baseY * 64 + var1);
         var9.packetBuffer.writeShort(var3);
         var9.packetBuffer.writeByteSub(Client.field702.method4143(82) ? 1 : 0);
         Client.packetWriter.addNode(var9);
      } else {
         PacketBufferNode var10;
         NPC var14;
         if (var2 == 7) {
            var14 = Client.npcs[var3];
            if (var14 != null) {
               Client.mouseCrossX = var7;
               Client.mouseCrossY = var8;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var10 = Renderable.getPacketBufferNode(ClientPacket.field3069, Client.packetWriter.isaacCipher);
               var10.packetBuffer.writeShortAdd(WorldMapIcon_0.selectedItemSlot);
               var10.packetBuffer.writeByteSub(Client.field702.method4143(82) ? 1 : 0);
               var10.packetBuffer.writeShort(class131.selectedItemId);
               var10.packetBuffer.writeIntME(WorldMapLabel.selectedItemWidget);
               var10.packetBuffer.writeShortLE(var3);
               Client.packetWriter.addNode(var10);
            }
         } else if (var2 == 8) {
            var14 = Client.npcs[var3];
            if (var14 != null) {
               Client.mouseCrossX = var7;
               Client.mouseCrossY = var8;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var10 = Renderable.getPacketBufferNode(ClientPacket.OPNPCT, Client.packetWriter.isaacCipher);
               var10.packetBuffer.writeIntIME(class9.selectedSpellWidget);
               var10.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
               var10.packetBuffer.writeShortAdd(Client.selectedSpellItemId);
               var10.packetBuffer.writeByteSub(Client.field702.method4143(82) ? 1 : 0);
               var10.packetBuffer.writeShortAdd(var3);
               Client.packetWriter.addNode(var10);
            }
         } else if (var2 == 9) {
            var14 = Client.npcs[var3];
            if (var14 != null) {
               Client.mouseCrossX = var7;
               Client.mouseCrossY = var8;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var10 = Renderable.getPacketBufferNode(ClientPacket.OPNPC1, Client.packetWriter.isaacCipher);
               var10.packetBuffer.writeByteSub(Client.field702.method4143(82) ? 1 : 0);
               var10.packetBuffer.writeShortAdd(var3);
               Client.packetWriter.addNode(var10);
            }
         } else if (var2 == 10) {
            var14 = Client.npcs[var3];
            if (var14 != null) {
               Client.mouseCrossX = var7;
               Client.mouseCrossY = var8;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var10 = Renderable.getPacketBufferNode(ClientPacket.OPNPC2, Client.packetWriter.isaacCipher);
               var10.packetBuffer.writeByte(Client.field702.method4143(82) ? 1 : 0);
               var10.packetBuffer.writeShortAddLE(var3);
               Client.packetWriter.addNode(var10);
            }
         } else if (var2 == 11) {
            var14 = Client.npcs[var3];
            if (var14 != null) {
               Client.mouseCrossX = var7;
               Client.mouseCrossY = var8;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var10 = Renderable.getPacketBufferNode(ClientPacket.OPNPC3, Client.packetWriter.isaacCipher);
               var10.packetBuffer.writeByteAdd(Client.field702.method4143(82) ? 1 : 0);
               var10.packetBuffer.writeShort(var3);
               Client.packetWriter.addNode(var10);
            }
         } else if (var2 == 12) {
            var14 = Client.npcs[var3];
            if (var14 != null) {
               Client.mouseCrossX = var7;
               Client.mouseCrossY = var8;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var10 = Renderable.getPacketBufferNode(ClientPacket.OPNPC4, Client.packetWriter.isaacCipher);
               var10.packetBuffer.writeByte(Client.field702.method4143(82) ? 1 : 0);
               var10.packetBuffer.writeShortLE(var3);
               Client.packetWriter.addNode(var10);
            }
         } else if (var2 == 13) {
            var14 = Client.npcs[var3];
            if (var14 != null) {
               Client.mouseCrossX = var7;
               Client.mouseCrossY = var8;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var10 = Renderable.getPacketBufferNode(ClientPacket.OPNPC5, Client.packetWriter.isaacCipher);
               var10.packetBuffer.writeShortAdd(var3);
               var10.packetBuffer.writeByteNeg(Client.field702.method4143(82) ? 1 : 0);
               Client.packetWriter.addNode(var10);
            }
         } else {
            Player var16;
            if (var2 == 14) {
               var16 = Client.players[var3];
               if (var16 != null) {
                  Client.mouseCrossX = var7;
                  Client.mouseCrossY = var8;
                  Client.mouseCrossColor = 2;
                  Client.mouseCrossState = 0;
                  Client.destinationX = var0;
                  Client.destinationY = var1;
                  var10 = Renderable.getPacketBufferNode(ClientPacket.field3108, Client.packetWriter.isaacCipher);
                  var10.packetBuffer.writeShortAddLE(var3);
                  var10.packetBuffer.writeShort(class131.selectedItemId);
                  var10.packetBuffer.writeIntLE(WorldMapLabel.selectedItemWidget);
                  var10.packetBuffer.writeByteNeg(Client.field702.method4143(82) ? 1 : 0);
                  var10.packetBuffer.writeShortAdd(WorldMapIcon_0.selectedItemSlot);
                  Client.packetWriter.addNode(var10);
               }
            } else if (var2 == 15) {
               var16 = Client.players[var3];
               if (var16 != null) {
                  Client.mouseCrossX = var7;
                  Client.mouseCrossY = var8;
                  Client.mouseCrossColor = 2;
                  Client.mouseCrossState = 0;
                  Client.destinationX = var0;
                  Client.destinationY = var1;
                  var10 = Renderable.getPacketBufferNode(ClientPacket.OPPLAYERT, Client.packetWriter.isaacCipher);
                  var10.packetBuffer.writeByteAdd(Client.field702.method4143(82) ? 1 : 0);
                  var10.packetBuffer.writeShortAddLE(var3);
                  var10.packetBuffer.writeInt(class9.selectedSpellWidget);
                  var10.packetBuffer.writeShortAddLE(Client.selectedSpellItemId);
                  var10.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
                  Client.packetWriter.addNode(var10);
               }
            } else if (var2 == 16) {
               Client.mouseCrossX = var7;
               Client.mouseCrossY = var8;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var9 = Renderable.getPacketBufferNode(ClientPacket.field3117, Client.packetWriter.isaacCipher);
               var9.packetBuffer.writeShortAddLE(var3);
               var9.packetBuffer.writeByteAdd(Client.field702.method4143(82) ? 1 : 0);
               var9.packetBuffer.writeShortAdd(WorldMapIcon_0.selectedItemSlot);
               var9.packetBuffer.writeShortAdd(ParamComposition.baseX * 64 + var0);
               var9.packetBuffer.writeIntIME(WorldMapLabel.selectedItemWidget);
               var9.packetBuffer.writeShortLE(Client.baseY * 64 + var1);
               var9.packetBuffer.writeShortLE(class131.selectedItemId);
               Client.packetWriter.addNode(var9);
            } else if (var2 == 17) {
               Client.mouseCrossX = var7;
               Client.mouseCrossY = var8;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var9 = Renderable.getPacketBufferNode(ClientPacket.OPOBJT, Client.packetWriter.isaacCipher);
               var9.packetBuffer.writeShort(ParamComposition.baseX * 64 + var0);
               var9.packetBuffer.writeShort(var3);
               var9.packetBuffer.writeByteSub(Client.field702.method4143(82) ? 1 : 0);
               var9.packetBuffer.writeShortAdd(Client.selectedSpellItemId);
               var9.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
               var9.packetBuffer.writeIntME(class9.selectedSpellWidget);
               var9.packetBuffer.writeShortAddLE(Client.baseY * 64 + var1);
               Client.packetWriter.addNode(var9);
            } else if (var2 == 18) {
               Client.mouseCrossX = var7;
               Client.mouseCrossY = var8;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var9 = Renderable.getPacketBufferNode(ClientPacket.OPOBJ1, Client.packetWriter.isaacCipher);
               var9.packetBuffer.writeShortAdd(Client.baseY * 64 + var1);
               var9.packetBuffer.writeByteAdd(Client.field702.method4143(82) ? 1 : 0);
               var9.packetBuffer.writeShortAddLE(ParamComposition.baseX * 64 + var0);
               var9.packetBuffer.writeShortLE(var3);
               Client.packetWriter.addNode(var9);
            } else if (var2 == 19) {
               Client.mouseCrossX = var7;
               Client.mouseCrossY = var8;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var9 = Renderable.getPacketBufferNode(ClientPacket.OPOBJ2, Client.packetWriter.isaacCipher);
               var9.packetBuffer.writeShortAddLE(var3);
               var9.packetBuffer.writeShortAdd(Client.baseY * 64 + var1);
               var9.packetBuffer.writeByteSub(Client.field702.method4143(82) ? 1 : 0);
               var9.packetBuffer.writeShortLE(ParamComposition.baseX * 64 + var0);
               Client.packetWriter.addNode(var9);
            } else if (var2 == 20) {
               Client.mouseCrossX = var7;
               Client.mouseCrossY = var8;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var9 = Renderable.getPacketBufferNode(ClientPacket.OPOBJ3, Client.packetWriter.isaacCipher);
               var9.packetBuffer.writeShortLE(ParamComposition.baseX * 64 + var0);
               var9.packetBuffer.writeShortAddLE(Client.baseY * 64 + var1);
               var9.packetBuffer.writeByteAdd(Client.field702.method4143(82) ? 1 : 0);
               var9.packetBuffer.writeShortAdd(var3);
               Client.packetWriter.addNode(var9);
            } else if (var2 == 21) {
               Client.mouseCrossX = var7;
               Client.mouseCrossY = var8;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var9 = Renderable.getPacketBufferNode(ClientPacket.OPOBJ4, Client.packetWriter.isaacCipher);
               var9.packetBuffer.writeShortAddLE(var3);
               var9.packetBuffer.writeByteNeg(Client.field702.method4143(82) ? 1 : 0);
               var9.packetBuffer.writeShortAdd(ParamComposition.baseX * 64 + var0);
               var9.packetBuffer.writeShortAddLE(Client.baseY * 64 + var1);
               Client.packetWriter.addNode(var9);
            } else if (var2 == 22) {
               Client.mouseCrossX = var7;
               Client.mouseCrossY = var8;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var9 = Renderable.getPacketBufferNode(ClientPacket.OPOBJ5, Client.packetWriter.isaacCipher);
               var9.packetBuffer.writeShortLE(Client.baseY * 64 + var1);
               var9.packetBuffer.writeByteNeg(Client.field702.method4143(82) ? 1 : 0);
               var9.packetBuffer.writeShort(var3);
               var9.packetBuffer.writeShortAddLE(ParamComposition.baseX * 64 + var0);
               Client.packetWriter.addNode(var9);
            } else if (var2 == 23) {
               if (Client.isMenuOpen) {
                  WorldMapAreaData.scene.setViewportWalking();
               } else {
                  WorldMapAreaData.scene.menuOpen(class103.Client_plane, var0, var1, true);
               }
            } else {
               PacketBufferNode var11;
               Widget var17;
               if (var2 == 24) {
                  var17 = class133.getWidget(var1);
                  if (var17 != null) {
                     boolean var12 = true;
                     if (var17.contentType > 0) {
                        var12 = class276.method5534(var17);
                     }

                     if (var12) {
                        var11 = Renderable.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
                        var11.packetBuffer.writeInt(var1);
                        Client.packetWriter.addNode(var11);
                     }
                  }
               } else {
                  if (var2 == 25) {
                     var17 = class135.getWidgetChild(var1, var0);
                     if (var17 != null) {
                        class18.Widget_runOnTargetLeave();
                        ClanChannel.selectSpell(var1, var0, MenuAction.Widget_unpackTargetMask(class173.getWidgetFlags(var17)), var4);
                        Client.isItemSelected = 0;
                        Client.selectedSpellActionName = class317.Widget_getSpellActionName(var17);
                        if (Client.selectedSpellActionName == null) {
                           Client.selectedSpellActionName = "null";
                        }

                        if (var17.isIf3) {
                           Client.selectedSpellName = var17.dataText + class149.colorStartTag(16777215);
                        } else {
                           Client.selectedSpellName = class149.colorStartTag(65280) + var17.spellName + class149.colorStartTag(16777215);
                        }
                     }

                     return;
                  }

                  if (var2 == 26) {
                     SoundCache.method869();
                  } else {
                     int var13;
                     Widget var15;
                     if (var2 == 28) {
                        var9 = Renderable.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
                        var9.packetBuffer.writeInt(var1);
                        Client.packetWriter.addNode(var9);
                        var15 = class133.getWidget(var1);
                        if (var15 != null && var15.cs1Instructions != null && var15.cs1Instructions[0][0] == 5) {
                           var13 = var15.cs1Instructions[0][1];
                           Varps.Varps_main[var13] = 1 - Varps.Varps_main[var13];
                           ReflectionCheck.changeGameOptions(var13);
                        }
                     } else if (var2 == 29) {
                        var9 = Renderable.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
                        var9.packetBuffer.writeInt(var1);
                        Client.packetWriter.addNode(var9);
                        var15 = class133.getWidget(var1);
                        if (var15 != null && var15.cs1Instructions != null && var15.cs1Instructions[0][0] == 5) {
                           var13 = var15.cs1Instructions[0][1];
                           if (Varps.Varps_main[var13] != var15.cs1ComparisonValues[0]) {
                              Varps.Varps_main[var13] = var15.cs1ComparisonValues[0];
                              ReflectionCheck.changeGameOptions(var13);
                           }
                        }
                     } else if (var2 == 30) {
                        if (Client.meslayerContinueWidget == null) {
                           class205.resumePauseWidget(var1, var0);
                           Client.meslayerContinueWidget = class135.getWidgetChild(var1, var0);
                           LoginScreenAnimation.invalidateWidget(Client.meslayerContinueWidget);
                        }
                     } else if (var2 == 31) {
                        var9 = Renderable.getPacketBufferNode(ClientPacket.field3088, Client.packetWriter.isaacCipher);
                        var9.packetBuffer.writeShortLE(WorldMapIcon_0.selectedItemSlot);
                        var9.packetBuffer.writeShortAdd(var4);
                        var9.packetBuffer.writeShortLE(var0);
                        var9.packetBuffer.writeIntLE(WorldMapLabel.selectedItemWidget);
                        var9.packetBuffer.writeInt(var1);
                        var9.packetBuffer.writeShortAddLE(class131.selectedItemId);
                        Client.packetWriter.addNode(var9);
                        Client.field743 = 0;
                        class378.field4437 = class133.getWidget(var1);
                        Client.field619 = var0;
                     } else if (var2 == 32) {
                        var9 = Renderable.getPacketBufferNode(ClientPacket.field3080, Client.packetWriter.isaacCipher);
                        var9.packetBuffer.writeShortAddLE(var0);
                        var9.packetBuffer.writeInt(var1);
                        var9.packetBuffer.writeIntIME(class9.selectedSpellWidget);
                        var9.packetBuffer.writeShortAdd(var4);
                        var9.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
                        Client.packetWriter.addNode(var9);
                        Client.field743 = 0;
                        class378.field4437 = class133.getWidget(var1);
                        Client.field619 = var0;
                     } else if (var2 == 33) {
                        var9 = Renderable.getPacketBufferNode(ClientPacket.field3138, Client.packetWriter.isaacCipher);
                        var9.packetBuffer.writeShort(var0);
                        var9.packetBuffer.writeIntIME(var1);
                        var9.packetBuffer.writeShortAddLE(var4);
                        Client.packetWriter.addNode(var9);
                        Client.field743 = 0;
                        class378.field4437 = class133.getWidget(var1);
                        Client.field619 = var0;
                     } else if (var2 == 34) {
                        var9 = Renderable.getPacketBufferNode(ClientPacket.field3152, Client.packetWriter.isaacCipher);
                        var9.packetBuffer.writeIntME(var1);
                        var9.packetBuffer.writeShortAddLE(var4);
                        var9.packetBuffer.writeShortAddLE(var0);
                        Client.packetWriter.addNode(var9);
                        Client.field743 = 0;
                        class378.field4437 = class133.getWidget(var1);
                        Client.field619 = var0;
                     } else if (var2 == 35) {
                        var9 = Renderable.getPacketBufferNode(ClientPacket.field3094, Client.packetWriter.isaacCipher);
                        var9.packetBuffer.writeShortAdd(var0);
                        var9.packetBuffer.writeShortAddLE(var4);
                        var9.packetBuffer.writeIntIME(var1);
                        Client.packetWriter.addNode(var9);
                        Client.field743 = 0;
                        class378.field4437 = class133.getWidget(var1);
                        Client.field619 = var0;
                     } else if (var2 == 36) {
                        var9 = Renderable.getPacketBufferNode(ClientPacket.field3162, Client.packetWriter.isaacCipher);
                        var9.packetBuffer.writeIntIME(var1);
                        var9.packetBuffer.writeShortLE(var0);
                        var9.packetBuffer.writeShortLE(var4);
                        Client.packetWriter.addNode(var9);
                        Client.field743 = 0;
                        class378.field4437 = class133.getWidget(var1);
                        Client.field619 = var0;
                     } else if (var2 == 37) {
                        var9 = Renderable.getPacketBufferNode(ClientPacket.field3137, Client.packetWriter.isaacCipher);
                        var9.packetBuffer.writeShort(var0);
                        var9.packetBuffer.writeInt(var1);
                        var9.packetBuffer.writeShortLE(var4);
                        Client.packetWriter.addNode(var9);
                        Client.field743 = 0;
                        class378.field4437 = class133.getWidget(var1);
                        Client.field619 = var0;
                     } else {
                        if (var2 == 38) {
                           class18.Widget_runOnTargetLeave();
                           var17 = class133.getWidget(var1);
                           Client.isItemSelected = 1;
                           WorldMapIcon_0.selectedItemSlot = var0;
                           WorldMapLabel.selectedItemWidget = var1;
                           class131.selectedItemId = var4;
                           LoginScreenAnimation.invalidateWidget(var17);
                           Client.selectedItemName = class149.colorStartTag(16748608) + TileItem.ItemDefinition_get(var4).name + class149.colorStartTag(16777215);
                           if (Client.selectedItemName == null) {
                              Client.selectedItemName = "null";
                           }

                           return;
                        }

                        if (var2 == 39) {
                           var9 = Renderable.getPacketBufferNode(ClientPacket.field3106, Client.packetWriter.isaacCipher);
                           var9.packetBuffer.writeShort(var4);
                           var9.packetBuffer.writeShort(var0);
                           var9.packetBuffer.writeInt(var1);
                           Client.packetWriter.addNode(var9);
                           Client.field743 = 0;
                           class378.field4437 = class133.getWidget(var1);
                           Client.field619 = var0;
                        } else if (var2 == 40) {
                           var9 = Renderable.getPacketBufferNode(ClientPacket.field3142, Client.packetWriter.isaacCipher);
                           var9.packetBuffer.writeShortAdd(var0);
                           var9.packetBuffer.writeShortAdd(var4);
                           var9.packetBuffer.writeIntLE(var1);
                           Client.packetWriter.addNode(var9);
                           Client.field743 = 0;
                           class378.field4437 = class133.getWidget(var1);
                           Client.field619 = var0;
                        } else if (var2 == 41) {
                           var9 = Renderable.getPacketBufferNode(ClientPacket.field3099, Client.packetWriter.isaacCipher);
                           var9.packetBuffer.writeIntLE(var1);
                           var9.packetBuffer.writeShort(var4);
                           var9.packetBuffer.writeShort(var0);
                           Client.packetWriter.addNode(var9);
                           Client.field743 = 0;
                           class378.field4437 = class133.getWidget(var1);
                           Client.field619 = var0;
                        } else if (var2 == 42) {
                           var9 = Renderable.getPacketBufferNode(ClientPacket.field3125, Client.packetWriter.isaacCipher);
                           var9.packetBuffer.writeShort(var4);
                           var9.packetBuffer.writeShortLE(var0);
                           var9.packetBuffer.writeIntME(var1);
                           Client.packetWriter.addNode(var9);
                           Client.field743 = 0;
                           class378.field4437 = class133.getWidget(var1);
                           Client.field619 = var0;
                        } else if (var2 == 43) {
                           var9 = Renderable.getPacketBufferNode(ClientPacket.field3105, Client.packetWriter.isaacCipher);
                           var9.packetBuffer.writeShortAddLE(var4);
                           var9.packetBuffer.writeShortLE(var0);
                           var9.packetBuffer.writeInt(var1);
                           Client.packetWriter.addNode(var9);
                           Client.field743 = 0;
                           class378.field4437 = class133.getWidget(var1);
                           Client.field619 = var0;
                        } else if (var2 == 44) {
                           var16 = Client.players[var3];
                           if (var16 != null) {
                              Client.mouseCrossX = var7;
                              Client.mouseCrossY = var8;
                              Client.mouseCrossColor = 2;
                              Client.mouseCrossState = 0;
                              Client.destinationX = var0;
                              Client.destinationY = var1;
                              var10 = Renderable.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
                              var10.packetBuffer.writeShortAddLE(var3);
                              var10.packetBuffer.writeByteSub(Client.field702.method4143(82) ? 1 : 0);
                              Client.packetWriter.addNode(var10);
                           }
                        } else if (var2 == 45) {
                           var16 = Client.players[var3];
                           if (var16 != null) {
                              Client.mouseCrossX = var7;
                              Client.mouseCrossY = var8;
                              Client.mouseCrossColor = 2;
                              Client.mouseCrossState = 0;
                              Client.destinationX = var0;
                              Client.destinationY = var1;
                              var10 = Renderable.getPacketBufferNode(ClientPacket.OPPLAYER2, Client.packetWriter.isaacCipher);
                              var10.packetBuffer.writeShortAdd(var3);
                              var10.packetBuffer.writeByte(Client.field702.method4143(82) ? 1 : 0);
                              Client.packetWriter.addNode(var10);
                           }
                        } else if (var2 == 46) {
                           var16 = Client.players[var3];
                           if (var16 != null) {
                              Client.mouseCrossX = var7;
                              Client.mouseCrossY = var8;
                              Client.mouseCrossColor = 2;
                              Client.mouseCrossState = 0;
                              Client.destinationX = var0;
                              Client.destinationY = var1;
                              var10 = Renderable.getPacketBufferNode(ClientPacket.OPPLAYER3, Client.packetWriter.isaacCipher);
                              var10.packetBuffer.writeByte(Client.field702.method4143(82) ? 1 : 0);
                              var10.packetBuffer.writeShortAdd(var3);
                              Client.packetWriter.addNode(var10);
                           }
                        } else if (var2 == 47) {
                           var16 = Client.players[var3];
                           if (var16 != null) {
                              Client.mouseCrossX = var7;
                              Client.mouseCrossY = var8;
                              Client.mouseCrossColor = 2;
                              Client.mouseCrossState = 0;
                              Client.destinationX = var0;
                              Client.destinationY = var1;
                              var10 = Renderable.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher);
                              var10.packetBuffer.writeShort(var3);
                              var10.packetBuffer.writeByteNeg(Client.field702.method4143(82) ? 1 : 0);
                              Client.packetWriter.addNode(var10);
                           }
                        } else if (var2 == 48) {
                           var16 = Client.players[var3];
                           if (var16 != null) {
                              Client.mouseCrossX = var7;
                              Client.mouseCrossY = var8;
                              Client.mouseCrossColor = 2;
                              Client.mouseCrossState = 0;
                              Client.destinationX = var0;
                              Client.destinationY = var1;
                              var10 = Renderable.getPacketBufferNode(ClientPacket.OPPLAYER5, Client.packetWriter.isaacCipher);
                              var10.packetBuffer.writeByteAdd(Client.field702.method4143(82) ? 1 : 0);
                              var10.packetBuffer.writeShortLE(var3);
                              Client.packetWriter.addNode(var10);
                           }
                        } else if (var2 == 49) {
                           var16 = Client.players[var3];
                           if (var16 != null) {
                              Client.mouseCrossX = var7;
                              Client.mouseCrossY = var8;
                              Client.mouseCrossColor = 2;
                              Client.mouseCrossState = 0;
                              Client.destinationX = var0;
                              Client.destinationY = var1;
                              var10 = Renderable.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
                              var10.packetBuffer.writeByteNeg(Client.field702.method4143(82) ? 1 : 0);
                              var10.packetBuffer.writeShort(var3);
                              Client.packetWriter.addNode(var10);
                           }
                        } else if (var2 == 50) {
                           var16 = Client.players[var3];
                           if (var16 != null) {
                              Client.mouseCrossX = var7;
                              Client.mouseCrossY = var8;
                              Client.mouseCrossColor = 2;
                              Client.mouseCrossState = 0;
                              Client.destinationX = var0;
                              Client.destinationY = var1;
                              var10 = Renderable.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher);
                              var10.packetBuffer.writeShortAddLE(var3);
                              var10.packetBuffer.writeByteAdd(Client.field702.method4143(82) ? 1 : 0);
                              Client.packetWriter.addNode(var10);
                           }
                        } else if (var2 == 51) {
                           var16 = Client.players[var3];
                           if (var16 != null) {
                              Client.mouseCrossX = var7;
                              Client.mouseCrossY = var8;
                              Client.mouseCrossColor = 2;
                              Client.mouseCrossState = 0;
                              Client.destinationX = var0;
                              Client.destinationY = var1;
                              var10 = Renderable.getPacketBufferNode(ClientPacket.OPPLAYER8, Client.packetWriter.isaacCipher);
                              var10.packetBuffer.writeByte(Client.field702.method4143(82) ? 1 : 0);
                              var10.packetBuffer.writeShortAdd(var3);
                              Client.packetWriter.addNode(var10);
                           }
                        } else {
                           label651: {
                              if (var2 != 57) {
                                 if (var2 == 58) {
                                    var17 = class135.getWidgetChild(var1, var0);
                                    if (var17 != null) {
                                       if (var17.field3664 != null) {
                                          ScriptEvent var19 = new ScriptEvent();
                                          var19.widget = var17;
                                          var19.opIndex = var3;
                                          var19.targetName = var6;
                                          var19.args = var17.field3664;
                                          WorldMapAreaData.runScriptEvent(var19);
                                       }

                                       var10 = Renderable.getPacketBufferNode(ClientPacket.IF_BUTTONT, Client.packetWriter.isaacCipher);
                                       var10.packetBuffer.writeShortLE(var0);
                                       var10.packetBuffer.writeShortAddLE(Client.selectedSpellItemId);
                                       var10.packetBuffer.writeIntIME(class9.selectedSpellWidget);
                                       var10.packetBuffer.writeShortLE(var4);
                                       var10.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
                                       var10.packetBuffer.writeIntIME(var1);
                                       Client.packetWriter.addNode(var10);
                                    }
                                    break label651;
                                 }

                                 if (var2 == 1001) {
                                    Client.mouseCrossX = var7;
                                    Client.mouseCrossY = var8;
                                    Client.mouseCrossColor = 2;
                                    Client.mouseCrossState = 0;
                                    Client.destinationX = var0;
                                    Client.destinationY = var1;
                                    var9 = Renderable.getPacketBufferNode(ClientPacket.OPLOC5, Client.packetWriter.isaacCipher);
                                    var9.packetBuffer.writeShortLE(Client.baseY * 64 + var1);
                                    var9.packetBuffer.writeShortLE(ParamComposition.baseX * 64 + var0);
                                    var9.packetBuffer.writeShortAdd(var3);
                                    var9.packetBuffer.writeByteNeg(Client.field702.method4143(82) ? 1 : 0);
                                    Client.packetWriter.addNode(var9);
                                    break label651;
                                 }

                                 if (var2 == 1002) {
                                    Client.mouseCrossX = var7;
                                    Client.mouseCrossY = var8;
                                    Client.mouseCrossColor = 2;
                                    Client.mouseCrossState = 0;
                                    var9 = Renderable.getPacketBufferNode(ClientPacket.OPLOCE, Client.packetWriter.isaacCipher);
                                    var9.packetBuffer.writeShortAddLE(var3);
                                    Client.packetWriter.addNode(var9);
                                    break label651;
                                 }

                                 if (var2 == 1003) {
                                    Client.mouseCrossX = var7;
                                    Client.mouseCrossY = var8;
                                    Client.mouseCrossColor = 2;
                                    Client.mouseCrossState = 0;
                                    var14 = Client.npcs[var3];
                                    if (var14 != null) {
                                       NPCComposition var18 = var14.definition;
                                       if (var18.transforms != null) {
                                          var18 = var18.transform();
                                       }

                                       if (var18 != null) {
                                          var11 = Renderable.getPacketBufferNode(ClientPacket.OPNPCE, Client.packetWriter.isaacCipher);
                                          var11.packetBuffer.writeShortLE(var18.id);
                                          Client.packetWriter.addNode(var11);
                                       }
                                    }
                                    break label651;
                                 }

                                 if (var2 == 1004) {
                                    Client.mouseCrossX = var7;
                                    Client.mouseCrossY = var8;
                                    Client.mouseCrossColor = 2;
                                    Client.mouseCrossState = 0;
                                    var9 = Renderable.getPacketBufferNode(ClientPacket.OPOBJE, Client.packetWriter.isaacCipher);
                                    var9.packetBuffer.writeShortLE(var3);
                                    var9.packetBuffer.writeShort(ParamComposition.baseX * 64 + var0);
                                    var9.packetBuffer.writeShortLE(Client.baseY * 64 + var1);
                                    Client.packetWriter.addNode(var9);
                                    break label651;
                                 }

                                 if (var2 == 1005) {
                                    var17 = class133.getWidget(var1);
                                    if (var17 != null && var17.itemQuantities[var0] >= 100000) {
                                       class280.addGameMessage(27, "", var17.itemQuantities[var0] + " x " + TileItem.ItemDefinition_get(var4).name);
                                    } else {
                                       var10 = Renderable.getPacketBufferNode(ClientPacket.field3092, Client.packetWriter.isaacCipher);
                                       var10.packetBuffer.writeShortAddLE(var4);
                                       Client.packetWriter.addNode(var10);
                                    }

                                    Client.field743 = 0;
                                    class378.field4437 = class133.getWidget(var1);
                                    Client.field619 = var0;
                                    break label651;
                                 }

                                 if (var2 != 1007) {
                                    if (var2 == 1008 || var2 == 1009 || var2 == 1011 || var2 == 1010 || var2 == 1012) {
                                       GrandExchangeOfferUnitPriceComparator.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
                                    }
                                    break label651;
                                 }
                              }

                              var17 = class135.getWidgetChild(var1, var0);
                              if (var17 != null) {
                                 class16.widgetDefaultMenuAction(var3, var1, var0, var4, var6);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      if (Client.isItemSelected != 0) {
         Client.isItemSelected = 0;
         LoginScreenAnimation.invalidateWidget(class133.getWidget(WorldMapLabel.selectedItemWidget));
      }

      if (Client.isSpellSelected) {
         class18.Widget_runOnTargetLeave();
      }

      if (class378.field4437 != null && Client.field743 == 0) {
         LoginScreenAnimation.invalidateWidget(class378.field4437);
      }

   }
}
