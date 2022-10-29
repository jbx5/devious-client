import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "[Ljc;"
   )
   @Export("PacketBufferNode_packetBufferNodes")
   static PacketBufferNode[] PacketBufferNode_packetBufferNodes = new PacketBufferNode[300];
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 781571635
   )
   @Export("PacketBufferNode_packetBufferNodeCount")
   static int PacketBufferNode_packetBufferNodeCount = 0;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   @Export("clientPacket")
   ClientPacket clientPacket;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -212963879
   )
   @Export("clientPacketLength")
   int clientPacketLength;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lqk;"
   )
   @Export("packetBuffer")
   public PacketBuffer packetBuffer;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 486699853
   )
   @Export("index")
   public int index;

   PacketBufferNode() {
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "972666705"
   )
   @Export("release")
   public void release() {
      if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) {
         PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this;
      }
   }

   @ObfuscatedName("id")
   @ObfuscatedSignature(
      descriptor = "(IIIIILjava/lang/String;Ljava/lang/String;III)V",
      garbageValue = "317226197"
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
         var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3080, Client.packetWriter.isaacCipher);
         var9.packetBuffer.writeShortAdd(class1.selectedItemSlot);
         var9.packetBuffer.writeShortAdd(class69.selectedItemId);
         var9.packetBuffer.writeShort(class158.baseY * 64 + var1);
         var9.packetBuffer.writeShortAddLE(KeyHandler.baseX * 64 + var0);
         var9.packetBuffer.writeIntME(class230.selectedItemWidget);
         var9.packetBuffer.writeByte(Client.field733.method3956(82) ? 1 : 0);
         var9.packetBuffer.writeShortAdd(var3);
         Client.packetWriter.addNode(var9);
      } else if (var2 == 2) {
         Client.mouseCrossX = var7;
         Client.mouseCrossY = var8;
         Client.mouseCrossColor = 2;
         Client.mouseCrossState = 0;
         Client.destinationX = var0;
         Client.destinationY = var1;
         var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.OPLOCT, Client.packetWriter.isaacCipher);
         var9.packetBuffer.writeIntIME(class124.selectedSpellWidget);
         var9.packetBuffer.writeShortAdd(var3);
         var9.packetBuffer.writeShortLE(class158.baseY * 64 + var1);
         var9.packetBuffer.writeShortAdd(Client.selectedSpellItemId);
         var9.packetBuffer.writeShortAddLE(Client.selectedSpellChildIndex);
         var9.packetBuffer.writeShortAddLE(KeyHandler.baseX * 64 + var0);
         var9.packetBuffer.writeByteSub(Client.field733.method3956(82) ? 1 : 0);
         Client.packetWriter.addNode(var9);
      } else if (var2 == 3) {
         Client.mouseCrossX = var7;
         Client.mouseCrossY = var8;
         Client.mouseCrossColor = 2;
         Client.mouseCrossState = 0;
         Client.destinationX = var0;
         Client.destinationY = var1;
         var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.OPLOC1, Client.packetWriter.isaacCipher);
         var9.packetBuffer.writeByteNeg(Client.field733.method3956(82) ? 1 : 0);
         var9.packetBuffer.writeShortAdd(KeyHandler.baseX * 64 + var0);
         var9.packetBuffer.writeShortAddLE(class158.baseY * 64 + var1);
         var9.packetBuffer.writeShort(var3);
         Client.packetWriter.addNode(var9);
      } else if (var2 == 4) {
         Client.mouseCrossX = var7;
         Client.mouseCrossY = var8;
         Client.mouseCrossColor = 2;
         Client.mouseCrossState = 0;
         Client.destinationX = var0;
         Client.destinationY = var1;
         var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.OPLOC2, Client.packetWriter.isaacCipher);
         var9.packetBuffer.writeByteNeg(Client.field733.method3956(82) ? 1 : 0);
         var9.packetBuffer.writeShort(KeyHandler.baseX * 64 + var0);
         var9.packetBuffer.writeShortAdd(var3);
         var9.packetBuffer.writeShortLE(class158.baseY * 64 + var1);
         Client.packetWriter.addNode(var9);
      } else if (var2 == 5) {
         Client.mouseCrossX = var7;
         Client.mouseCrossY = var8;
         Client.mouseCrossColor = 2;
         Client.mouseCrossState = 0;
         Client.destinationX = var0;
         Client.destinationY = var1;
         var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.OPLOC3, Client.packetWriter.isaacCipher);
         var9.packetBuffer.writeShortAdd(class158.baseY * 64 + var1);
         var9.packetBuffer.writeShortAdd(KeyHandler.baseX * 64 + var0);
         var9.packetBuffer.writeByte(Client.field733.method3956(82) ? 1 : 0);
         var9.packetBuffer.writeShortLE(var3);
         Client.packetWriter.addNode(var9);
      } else if (var2 == 6) {
         Client.mouseCrossX = var7;
         Client.mouseCrossY = var8;
         Client.mouseCrossColor = 2;
         Client.mouseCrossState = 0;
         Client.destinationX = var0;
         Client.destinationY = var1;
         var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.OPLOC4, Client.packetWriter.isaacCipher);
         var9.packetBuffer.writeShortAddLE(KeyHandler.baseX * 64 + var0);
         var9.packetBuffer.writeByteAdd(Client.field733.method3956(82) ? 1 : 0);
         var9.packetBuffer.writeShortAdd(var3);
         var9.packetBuffer.writeShortAddLE(class158.baseY * 64 + var1);
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
               var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3068, Client.packetWriter.isaacCipher);
               var10.packetBuffer.writeShortAddLE(class1.selectedItemSlot);
               var10.packetBuffer.writeShortLE(class69.selectedItemId);
               var10.packetBuffer.writeShortAdd(var3);
               var10.packetBuffer.writeByteNeg(Client.field733.method3956(82) ? 1 : 0);
               var10.packetBuffer.writeInt(class230.selectedItemWidget);
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
               var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.OPNPCT, Client.packetWriter.isaacCipher);
               var10.packetBuffer.writeShortAddLE(var3);
               var10.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
               var10.packetBuffer.writeByteNeg(Client.field733.method3956(82) ? 1 : 0);
               var10.packetBuffer.writeShortAdd(Client.selectedSpellItemId);
               var10.packetBuffer.writeIntIME(class124.selectedSpellWidget);
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
               var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.OPNPC1, Client.packetWriter.isaacCipher);
               var10.packetBuffer.writeByteNeg(Client.field733.method3956(82) ? 1 : 0);
               var10.packetBuffer.writeShort(var3);
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
               var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.OPNPC2, Client.packetWriter.isaacCipher);
               var10.packetBuffer.writeShortAdd(var3);
               var10.packetBuffer.writeByte(Client.field733.method3956(82) ? 1 : 0);
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
               var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.OPNPC3, Client.packetWriter.isaacCipher);
               var10.packetBuffer.writeShortAdd(var3);
               var10.packetBuffer.writeByteNeg(Client.field733.method3956(82) ? 1 : 0);
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
               var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.OPNPC4, Client.packetWriter.isaacCipher);
               var10.packetBuffer.writeShortLE(var3);
               var10.packetBuffer.writeByteSub(Client.field733.method3956(82) ? 1 : 0);
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
               var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.OPNPC5, Client.packetWriter.isaacCipher);
               var10.packetBuffer.writeShortAddLE(var3);
               var10.packetBuffer.writeByteNeg(Client.field733.method3956(82) ? 1 : 0);
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
                  var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3100, Client.packetWriter.isaacCipher);
                  var10.packetBuffer.writeIntIME(class230.selectedItemWidget);
                  var10.packetBuffer.writeShortAddLE(class1.selectedItemSlot);
                  var10.packetBuffer.writeShortAddLE(class69.selectedItemId);
                  var10.packetBuffer.writeShortAdd(var3);
                  var10.packetBuffer.writeByte(Client.field733.method3956(82) ? 1 : 0);
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
                  var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.OPPLAYERT, Client.packetWriter.isaacCipher);
                  var10.packetBuffer.writeIntME(class124.selectedSpellWidget);
                  var10.packetBuffer.writeShortLE(Client.selectedSpellItemId);
                  var10.packetBuffer.writeByte(Client.field733.method3956(82) ? 1 : 0);
                  var10.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
                  var10.packetBuffer.writeShortAddLE(var3);
                  Client.packetWriter.addNode(var10);
               }
            } else if (var2 == 16) {
               Client.mouseCrossX = var7;
               Client.mouseCrossY = var8;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3014, Client.packetWriter.isaacCipher);
               var9.packetBuffer.writeByteSub(Client.field733.method3956(82) ? 1 : 0);
               var9.packetBuffer.writeShortAdd(class158.baseY * 64 + var1);
               var9.packetBuffer.writeShortLE(class69.selectedItemId);
               var9.packetBuffer.writeShortAddLE(var3);
               var9.packetBuffer.writeIntLE(class230.selectedItemWidget);
               var9.packetBuffer.writeShortLE(class1.selectedItemSlot);
               var9.packetBuffer.writeShort(KeyHandler.baseX * 64 + var0);
               Client.packetWriter.addNode(var9);
            } else if (var2 == 17) {
               Client.mouseCrossX = var7;
               Client.mouseCrossY = var8;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.OPOBJT, Client.packetWriter.isaacCipher);
               var9.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
               var9.packetBuffer.writeShortLE(class158.baseY * 64 + var1);
               var9.packetBuffer.writeIntLE(class124.selectedSpellWidget);
               var9.packetBuffer.writeByteAdd(Client.field733.method3956(82) ? 1 : 0);
               var9.packetBuffer.writeShortLE(KeyHandler.baseX * 64 + var0);
               var9.packetBuffer.writeShortLE(var3);
               var9.packetBuffer.writeShortAdd(Client.selectedSpellItemId);
               Client.packetWriter.addNode(var9);
            } else if (var2 == 18) {
               Client.mouseCrossX = var7;
               Client.mouseCrossY = var8;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.OPOBJ1, Client.packetWriter.isaacCipher);
               var9.packetBuffer.writeShort(var3);
               var9.packetBuffer.writeShortAddLE(KeyHandler.baseX * 64 + var0);
               var9.packetBuffer.writeByteAdd(Client.field733.method3956(82) ? 1 : 0);
               var9.packetBuffer.writeShortLE(class158.baseY * 64 + var1);
               Client.packetWriter.addNode(var9);
            } else if (var2 == 19) {
               Client.mouseCrossX = var7;
               Client.mouseCrossY = var8;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.OPOBJ2, Client.packetWriter.isaacCipher);
               var9.packetBuffer.writeShortAddLE(class158.baseY * 64 + var1);
               var9.packetBuffer.writeShortLE(var3);
               var9.packetBuffer.writeByteAdd(Client.field733.method3956(82) ? 1 : 0);
               var9.packetBuffer.writeShort(KeyHandler.baseX * 64 + var0);
               Client.packetWriter.addNode(var9);
            } else if (var2 == 20) {
               Client.mouseCrossX = var7;
               Client.mouseCrossY = var8;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.OPOBJ3, Client.packetWriter.isaacCipher);
               var9.packetBuffer.writeShort(KeyHandler.baseX * 64 + var0);
               var9.packetBuffer.writeShortAddLE(class158.baseY * 64 + var1);
               var9.packetBuffer.writeShortLE(var3);
               var9.packetBuffer.writeByte(Client.field733.method3956(82) ? 1 : 0);
               Client.packetWriter.addNode(var9);
            } else if (var2 == 21) {
               Client.mouseCrossX = var7;
               Client.mouseCrossY = var8;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.OPOBJ4, Client.packetWriter.isaacCipher);
               var9.packetBuffer.writeByteSub(Client.field733.method3956(82) ? 1 : 0);
               var9.packetBuffer.writeShortLE(class158.baseY * 64 + var1);
               var9.packetBuffer.writeShortLE(KeyHandler.baseX * 64 + var0);
               var9.packetBuffer.writeShortAddLE(var3);
               Client.packetWriter.addNode(var9);
            } else if (var2 == 22) {
               Client.mouseCrossX = var7;
               Client.mouseCrossY = var8;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.OPOBJ5, Client.packetWriter.isaacCipher);
               var9.packetBuffer.writeShortAddLE(KeyHandler.baseX * 64 + var0);
               var9.packetBuffer.writeByteSub(Client.field733.method3956(82) ? 1 : 0);
               var9.packetBuffer.writeShortAddLE(var3);
               var9.packetBuffer.writeShortAddLE(class158.baseY * 64 + var1);
               Client.packetWriter.addNode(var9);
            } else if (var2 == 23) {
               if (Client.isMenuOpen) {
                  class139.scene.setViewportWalking();
               } else {
                  class139.scene.menuOpen(ApproximateRouteStrategy.Client_plane, var0, var1, true);
               }
            } else {
               PacketBufferNode var11;
               Widget var17;
               if (var2 == 24) {
                  var17 = class281.getWidget(var1);
                  if (var17 != null) {
                     boolean var13 = true;
                     if (var17.contentType > 0) {
                        var13 = MilliClock.method3373(var17);
                     }

                     if (var13) {
                        var11 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field2996, Client.packetWriter.isaacCipher);
                        var11.packetBuffer.writeInt(var1);
                        Client.packetWriter.addNode(var11);
                     }
                  }
               } else {
                  if (var2 == 25) {
                     var17 = WorldMapDecoration.getWidgetChild(var1, var0);
                     if (var17 != null) {
                        class101.Widget_runOnTargetLeave();
                        class238.selectSpell(var1, var0, class167.Widget_unpackTargetMask(class197.getWidgetFlags(var17)), var4);
                        Client.isItemSelected = 0;
                        Client.selectedSpellActionName = class313.Widget_getSpellActionName(var17);
                        if (Client.selectedSpellActionName == null) {
                           Client.selectedSpellActionName = "null";
                        }

                        if (var17.isIf3) {
                           Client.selectedSpellName = var17.dataText + GameObject.colorStartTag(16777215);
                        } else {
                           Client.selectedSpellName = GameObject.colorStartTag(65280) + var17.spellName + GameObject.colorStartTag(16777215);
                        }
                     }

                     return;
                  }

                  if (var2 == 26) {
                     class354.method6769();
                  } else {
                     int var12;
                     Widget var15;
                     if (var2 == 28) {
                        var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field2996, Client.packetWriter.isaacCipher);
                        var9.packetBuffer.writeInt(var1);
                        Client.packetWriter.addNode(var9);
                        var15 = class281.getWidget(var1);
                        if (var15 != null && var15.cs1Instructions != null && var15.cs1Instructions[0][0] == 5) {
                           var12 = var15.cs1Instructions[0][1];
                           Varps.Varps_main[var12] = 1 - Varps.Varps_main[var12];
                           ClanChannel.changeGameOptions(var12);
                        }
                     } else if (var2 == 29) {
                        var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field2996, Client.packetWriter.isaacCipher);
                        var9.packetBuffer.writeInt(var1);
                        Client.packetWriter.addNode(var9);
                        var15 = class281.getWidget(var1);
                        if (var15 != null && var15.cs1Instructions != null && var15.cs1Instructions[0][0] == 5) {
                           var12 = var15.cs1Instructions[0][1];
                           if (Varps.Varps_main[var12] != var15.cs1ComparisonValues[0]) {
                              Varps.Varps_main[var12] = var15.cs1ComparisonValues[0];
                              ClanChannel.changeGameOptions(var12);
                           }
                        }
                     } else if (var2 == 30) {
                        if (Client.meslayerContinueWidget == null) {
                           class453.resumePauseWidget(var1, var0);
                           Client.meslayerContinueWidget = WorldMapDecoration.getWidgetChild(var1, var0);
                           class143.invalidateWidget(Client.meslayerContinueWidget);
                        }
                     } else if (var2 == 31) {
                        var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3053, Client.packetWriter.isaacCipher);
                        var9.packetBuffer.writeShortAdd(class1.selectedItemSlot);
                        var9.packetBuffer.writeIntIME(class230.selectedItemWidget);
                        var9.packetBuffer.writeIntIME(var1);
                        var9.packetBuffer.writeShort(var0);
                        var9.packetBuffer.writeShortLE(var4);
                        var9.packetBuffer.writeShort(class69.selectedItemId);
                        Client.packetWriter.addNode(var9);
                        Client.field697 = 0;
                        class133.field1575 = class281.getWidget(var1);
                        Client.field745 = var0;
                     } else if (var2 == 32) {
                        var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field2998, Client.packetWriter.isaacCipher);
                        var9.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
                        var9.packetBuffer.writeShortAddLE(var0);
                        var9.packetBuffer.writeIntME(var1);
                        var9.packetBuffer.writeInt(class124.selectedSpellWidget);
                        var9.packetBuffer.writeShortLE(var4);
                        Client.packetWriter.addNode(var9);
                        Client.field697 = 0;
                        class133.field1575 = class281.getWidget(var1);
                        Client.field745 = var0;
                     } else if (var2 == 33) {
                        var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3024, Client.packetWriter.isaacCipher);
                        var9.packetBuffer.writeShort(var4);
                        var9.packetBuffer.writeShort(var0);
                        var9.packetBuffer.writeInt(var1);
                        Client.packetWriter.addNode(var9);
                        Client.field697 = 0;
                        class133.field1575 = class281.getWidget(var1);
                        Client.field745 = var0;
                     } else if (var2 == 34) {
                        var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3061, Client.packetWriter.isaacCipher);
                        var9.packetBuffer.writeShortAdd(var0);
                        var9.packetBuffer.writeShort(var4);
                        var9.packetBuffer.writeIntME(var1);
                        Client.packetWriter.addNode(var9);
                        Client.field697 = 0;
                        class133.field1575 = class281.getWidget(var1);
                        Client.field745 = var0;
                     } else if (var2 == 35) {
                        var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3048, Client.packetWriter.isaacCipher);
                        var9.packetBuffer.writeInt(var1);
                        var9.packetBuffer.writeShortAddLE(var4);
                        var9.packetBuffer.writeShort(var0);
                        Client.packetWriter.addNode(var9);
                        Client.field697 = 0;
                        class133.field1575 = class281.getWidget(var1);
                        Client.field745 = var0;
                     } else if (var2 == 36) {
                        var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3064, Client.packetWriter.isaacCipher);
                        var9.packetBuffer.writeInt(var1);
                        var9.packetBuffer.writeShortAdd(var0);
                        var9.packetBuffer.writeShortLE(var4);
                        Client.packetWriter.addNode(var9);
                        Client.field697 = 0;
                        class133.field1575 = class281.getWidget(var1);
                        Client.field745 = var0;
                     } else if (var2 == 37) {
                        var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3082, Client.packetWriter.isaacCipher);
                        var9.packetBuffer.writeShort(var0);
                        var9.packetBuffer.writeShortAddLE(var4);
                        var9.packetBuffer.writeIntLE(var1);
                        Client.packetWriter.addNode(var9);
                        Client.field697 = 0;
                        class133.field1575 = class281.getWidget(var1);
                        Client.field745 = var0;
                     } else {
                        if (var2 == 38) {
                           class101.Widget_runOnTargetLeave();
                           var17 = class281.getWidget(var1);
                           Client.isItemSelected = 1;
                           class1.selectedItemSlot = var0;
                           class230.selectedItemWidget = var1;
                           class69.selectedItemId = var4;
                           class143.invalidateWidget(var17);
                           Client.selectedItemName = GameObject.colorStartTag(16748608) + MidiPcmStream.ItemDefinition_get(var4).name + GameObject.colorStartTag(16777215);
                           if (Client.selectedItemName == null) {
                              Client.selectedItemName = "null";
                           }

                           return;
                        }

                        if (var2 == 39) {
                           var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3043, Client.packetWriter.isaacCipher);
                           var9.packetBuffer.writeIntLE(var1);
                           var9.packetBuffer.writeShortLE(var4);
                           var9.packetBuffer.writeShort(var0);
                           Client.packetWriter.addNode(var9);
                           Client.field697 = 0;
                           class133.field1575 = class281.getWidget(var1);
                           Client.field745 = var0;
                        } else if (var2 == 40) {
                           var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3029, Client.packetWriter.isaacCipher);
                           var9.packetBuffer.writeIntIME(var1);
                           var9.packetBuffer.writeShort(var0);
                           var9.packetBuffer.writeShortAddLE(var4);
                           Client.packetWriter.addNode(var9);
                           Client.field697 = 0;
                           class133.field1575 = class281.getWidget(var1);
                           Client.field745 = var0;
                        } else if (var2 == 41) {
                           var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3055, Client.packetWriter.isaacCipher);
                           var9.packetBuffer.writeShortLE(var4);
                           var9.packetBuffer.writeInt(var1);
                           var9.packetBuffer.writeShort(var0);
                           Client.packetWriter.addNode(var9);
                           Client.field697 = 0;
                           class133.field1575 = class281.getWidget(var1);
                           Client.field745 = var0;
                        } else if (var2 == 42) {
                           var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3060, Client.packetWriter.isaacCipher);
                           var9.packetBuffer.writeShortLE(var4);
                           var9.packetBuffer.writeIntIME(var1);
                           var9.packetBuffer.writeShortLE(var0);
                           Client.packetWriter.addNode(var9);
                           Client.field697 = 0;
                           class133.field1575 = class281.getWidget(var1);
                           Client.field745 = var0;
                        } else if (var2 == 43) {
                           var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3087, Client.packetWriter.isaacCipher);
                           var9.packetBuffer.writeShortAdd(var4);
                           var9.packetBuffer.writeIntME(var1);
                           var9.packetBuffer.writeShortLE(var0);
                           Client.packetWriter.addNode(var9);
                           Client.field697 = 0;
                           class133.field1575 = class281.getWidget(var1);
                           Client.field745 = var0;
                        } else if (var2 == 44) {
                           var16 = Client.players[var3];
                           if (var16 != null) {
                              Client.mouseCrossX = var7;
                              Client.mouseCrossY = var8;
                              Client.mouseCrossColor = 2;
                              Client.mouseCrossState = 0;
                              Client.destinationX = var0;
                              Client.destinationY = var1;
                              var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
                              var10.packetBuffer.writeByteSub(Client.field733.method3956(82) ? 1 : 0);
                              var10.packetBuffer.writeShortAddLE(var3);
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
                              var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.OPPLAYER2, Client.packetWriter.isaacCipher);
                              var10.packetBuffer.writeShortAdd(var3);
                              var10.packetBuffer.writeByteNeg(Client.field733.method3956(82) ? 1 : 0);
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
                              var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.OPPLAYER3, Client.packetWriter.isaacCipher);
                              var10.packetBuffer.writeShortAdd(var3);
                              var10.packetBuffer.writeByte(Client.field733.method3956(82) ? 1 : 0);
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
                              var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher);
                              var10.packetBuffer.writeByteSub(Client.field733.method3956(82) ? 1 : 0);
                              var10.packetBuffer.writeShortLE(var3);
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
                              var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.OPPLAYER5, Client.packetWriter.isaacCipher);
                              var10.packetBuffer.writeByteNeg(Client.field733.method3956(82) ? 1 : 0);
                              var10.packetBuffer.writeShort(var3);
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
                              var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
                              var10.packetBuffer.writeShortAddLE(var3);
                              var10.packetBuffer.writeByteSub(Client.field733.method3956(82) ? 1 : 0);
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
                              var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher);
                              var10.packetBuffer.writeShort(var3);
                              var10.packetBuffer.writeByte(Client.field733.method3956(82) ? 1 : 0);
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
                              var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.OPPLAYER8, Client.packetWriter.isaacCipher);
                              var10.packetBuffer.writeShortAdd(var3);
                              var10.packetBuffer.writeByteNeg(Client.field733.method3956(82) ? 1 : 0);
                              Client.packetWriter.addNode(var10);
                           }
                        } else {
                           label662: {
                              if (var2 != 57) {
                                 if (var2 == 58) {
                                    var17 = WorldMapDecoration.getWidgetChild(var1, var0);
                                    if (var17 != null) {
                                       if (var17.field3594 != null) {
                                          ScriptEvent var19 = new ScriptEvent();
                                          var19.widget = var17;
                                          var19.opIndex = var3;
                                          var19.targetName = var6;
                                          var19.args = var17.field3594;
                                          ServerPacket.runScriptEvent(var19);
                                       }

                                       var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.IF_BUTTONT, Client.packetWriter.isaacCipher);
                                       var10.packetBuffer.writeShortAddLE(Client.selectedSpellItemId);
                                       var10.packetBuffer.writeShortAddLE(var0);
                                       var10.packetBuffer.writeIntME(class124.selectedSpellWidget);
                                       var10.packetBuffer.writeShort(var4);
                                       var10.packetBuffer.writeIntLE(var1);
                                       var10.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
                                       Client.packetWriter.addNode(var10);
                                    }
                                    break label662;
                                 }

                                 if (var2 == 1001) {
                                    Client.mouseCrossX = var7;
                                    Client.mouseCrossY = var8;
                                    Client.mouseCrossColor = 2;
                                    Client.mouseCrossState = 0;
                                    Client.destinationX = var0;
                                    Client.destinationY = var1;
                                    var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.OPLOC5, Client.packetWriter.isaacCipher);
                                    var9.packetBuffer.writeShortAddLE(class158.baseY * 64 + var1);
                                    var9.packetBuffer.writeShort(KeyHandler.baseX * 64 + var0);
                                    var9.packetBuffer.writeShortAddLE(var3);
                                    var9.packetBuffer.writeByteNeg(Client.field733.method3956(82) ? 1 : 0);
                                    Client.packetWriter.addNode(var9);
                                    break label662;
                                 }

                                 if (var2 == 1002) {
                                    Client.mouseCrossX = var7;
                                    Client.mouseCrossY = var8;
                                    Client.mouseCrossColor = 2;
                                    Client.mouseCrossState = 0;
                                    var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.OPLOCE, Client.packetWriter.isaacCipher);
                                    var9.packetBuffer.writeShort(var3);
                                    Client.packetWriter.addNode(var9);
                                    break label662;
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
                                          var11 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.OPNPCE, Client.packetWriter.isaacCipher);
                                          var11.packetBuffer.writeShortAddLE(var18.id);
                                          Client.packetWriter.addNode(var11);
                                       }
                                    }
                                    break label662;
                                 }

                                 if (var2 == 1004) {
                                    Client.mouseCrossX = var7;
                                    Client.mouseCrossY = var8;
                                    Client.mouseCrossColor = 2;
                                    Client.mouseCrossState = 0;
                                    var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.OPOBJE, Client.packetWriter.isaacCipher);
                                    var9.packetBuffer.writeShort(KeyHandler.baseX * 64 + var0);
                                    var9.packetBuffer.writeShortAdd(var3);
                                    var9.packetBuffer.writeShort(class158.baseY * 64 + var1);
                                    Client.packetWriter.addNode(var9);
                                    break label662;
                                 }

                                 if (var2 == 1005) {
                                    var17 = class281.getWidget(var1);
                                    if (var17 != null && var17.itemQuantities[var0] >= 100000) {
                                       MouseHandler.addGameMessage(27, "", var17.itemQuantities[var0] + " x " + MidiPcmStream.ItemDefinition_get(var4).name);
                                    } else {
                                       var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3096, Client.packetWriter.isaacCipher);
                                       var10.packetBuffer.writeShortLE(var4);
                                       Client.packetWriter.addNode(var10);
                                    }

                                    Client.field697 = 0;
                                    class133.field1575 = class281.getWidget(var1);
                                    Client.field745 = var0;
                                    break label662;
                                 }

                                 if (var2 != 1007) {
                                    if (var2 == 1010 || var2 == 1011 || var2 == 1009 || var2 == 1008 || var2 == 1012) {
                                       class7.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
                                    }
                                    break label662;
                                 }
                              }

                              var17 = WorldMapDecoration.getWidgetChild(var1, var0);
                              if (var17 != null) {
                                 class279.widgetDefaultMenuAction(var3, var1, var0, var4, var6);
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
         class143.invalidateWidget(class281.getWidget(class230.selectedItemWidget));
      }

      if (Client.isSpellSelected) {
         class101.Widget_runOnTargetLeave();
      }

      if (class133.field1575 != null && Client.field697 == 0) {
         class143.invalidateWidget(class133.field1575);
      }

   }
}
