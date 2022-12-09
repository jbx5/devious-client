import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hd")
@Implements("WorldMapData_0")
public class WorldMapData_0 extends AbstractWorldMapData {
   WorldMapData_0() {
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)V",
      garbageValue = "106235772"
   )
   @Export("init")
   void init(Buffer var1) {
      int var2 = var1.readUnsignedByte();
      if (var2 != WorldMapID.field2984.value) {
         throw new IllegalStateException("");
      } else {
         super.minPlane = var1.readUnsignedByte();
         super.planes = var1.readUnsignedByte();
         super.regionXLow = var1.readUnsignedShort() * 4096;
         super.regionYLow = var1.readUnsignedShort() * 64;
         super.regionX = var1.readUnsignedShort();
         super.regionY = var1.readUnsignedShort();
         super.groupId = var1.readNullableLargeSmart();
         super.fileId = var1.readNullableLargeSmart();
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)V",
      garbageValue = "1703912011"
   )
   @Export("readGeography")
   void readGeography(Buffer var1) {
      super.planes = Math.min(super.planes, 4);
      super.floorUnderlayIds = new short[1][64][64];
      super.floorOverlayIds = new short[super.planes][64][64];
      super.field2950 = new byte[super.planes][64][64];
      super.field2951 = new byte[super.planes][64][64];
      super.decorations = new WorldMapDecoration[super.planes][64][64][];
      int var2 = var1.readUnsignedByte();
      if (var2 != class251.field2976.value) {
         throw new IllegalStateException("");
      } else {
         int var3 = var1.readUnsignedByte();
         int var4 = var1.readUnsignedByte();
         if (var3 == super.regionX && var4 == super.regionY) {
            for(int var5 = 0; var5 < 64; ++var5) {
               for(int var6 = 0; var6 < 64; ++var6) {
                  this.readTile(var5, var6, var1);
               }
            }

         } else {
            throw new IllegalStateException("");
         }
      }
   }

   public int hashCode() {
      return super.regionX | super.regionY << 8;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof WorldMapData_0)) {
         return false;
      } else {
         WorldMapData_0 var2 = (WorldMapData_0)var1;
         return super.regionX == var2.regionX && var2.regionY == super.regionY;
      }
   }

   @ObfuscatedName("jh")
   @ObfuscatedSignature(
      descriptor = "(IIIIILjava/lang/String;Ljava/lang/String;III)V",
      garbageValue = "649826417"
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
         var9 = class136.getPacketBufferNode(ClientPacket.field3069, Client.packetWriter.isaacCipher);
         var9.packetBuffer.writeShortLE(var3);
         var9.packetBuffer.writeShortLE(class365.baseY * 64 + var1);
         var9.packetBuffer.writeShortLE(class101.selectedItemSlot);
         var9.packetBuffer.writeShortAdd(HealthBarUpdate.selectedItemId);
         var9.packetBuffer.writeIntLE(ModeWhere.selectedItemWidget);
         var9.packetBuffer.writeShortAdd(class154.baseX * 64 + var0);
         var9.packetBuffer.writeByte(Client.field747.method4106(82) ? 1 : 0);
         Client.packetWriter.addNode(var9);
      } else if (var2 == 2) {
         Client.mouseCrossX = var7;
         Client.mouseCrossY = var8;
         Client.mouseCrossColor = 2;
         Client.mouseCrossState = 0;
         Client.destinationX = var0;
         Client.destinationY = var1;
         var9 = class136.getPacketBufferNode(ClientPacket.OPLOCT, Client.packetWriter.isaacCipher);
         var9.packetBuffer.writeShortAddLE(class154.baseX * 64 + var0);
         var9.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
         var9.packetBuffer.writeIntIME(class358.selectedSpellWidget);
         var9.packetBuffer.writeShortAdd(Client.selectedSpellItemId);
         var9.packetBuffer.writeShort(class365.baseY * 64 + var1);
         var9.packetBuffer.writeByteNeg(Client.field747.method4106(82) ? 1 : 0);
         var9.packetBuffer.writeShortAdd(var3);
         Client.packetWriter.addNode(var9);
      } else if (var2 == 3) {
         Client.mouseCrossX = var7;
         Client.mouseCrossY = var8;
         Client.mouseCrossColor = 2;
         Client.mouseCrossState = 0;
         Client.destinationX = var0;
         Client.destinationY = var1;
         var9 = class136.getPacketBufferNode(ClientPacket.OPLOC1, Client.packetWriter.isaacCipher);
         var9.packetBuffer.writeByte(Client.field747.method4106(82) ? 1 : 0);
         var9.packetBuffer.writeShortAddLE(class154.baseX * 64 + var0);
         var9.packetBuffer.writeShortAdd(class365.baseY * 64 + var1);
         var9.packetBuffer.writeShort(var3);
         Client.packetWriter.addNode(var9);
      } else if (var2 == 4) {
         Client.mouseCrossX = var7;
         Client.mouseCrossY = var8;
         Client.mouseCrossColor = 2;
         Client.mouseCrossState = 0;
         Client.destinationX = var0;
         Client.destinationY = var1;
         var9 = class136.getPacketBufferNode(ClientPacket.OPLOC2, Client.packetWriter.isaacCipher);
         var9.packetBuffer.writeByteAdd(Client.field747.method4106(82) ? 1 : 0);
         var9.packetBuffer.writeShortLE(var3);
         var9.packetBuffer.writeShortAddLE(class365.baseY * 64 + var1);
         var9.packetBuffer.writeShortLE(class154.baseX * 64 + var0);
         Client.packetWriter.addNode(var9);
      } else if (var2 == 5) {
         Client.mouseCrossX = var7;
         Client.mouseCrossY = var8;
         Client.mouseCrossColor = 2;
         Client.mouseCrossState = 0;
         Client.destinationX = var0;
         Client.destinationY = var1;
         var9 = class136.getPacketBufferNode(ClientPacket.OPLOC3, Client.packetWriter.isaacCipher);
         var9.packetBuffer.writeByteAdd(Client.field747.method4106(82) ? 1 : 0);
         var9.packetBuffer.writeShortAddLE(class365.baseY * 64 + var1);
         var9.packetBuffer.writeShortAdd(class154.baseX * 64 + var0);
         var9.packetBuffer.writeShortAdd(var3);
         Client.packetWriter.addNode(var9);
      } else if (var2 == 6) {
         Client.mouseCrossX = var7;
         Client.mouseCrossY = var8;
         Client.mouseCrossColor = 2;
         Client.mouseCrossState = 0;
         Client.destinationX = var0;
         Client.destinationY = var1;
         var9 = class136.getPacketBufferNode(ClientPacket.OPLOC4, Client.packetWriter.isaacCipher);
         var9.packetBuffer.writeShort(var3);
         var9.packetBuffer.writeByteNeg(Client.field747.method4106(82) ? 1 : 0);
         var9.packetBuffer.writeShortAddLE(class365.baseY * 64 + var1);
         var9.packetBuffer.writeShortLE(class154.baseX * 64 + var0);
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
               var10 = class136.getPacketBufferNode(ClientPacket.field3082, Client.packetWriter.isaacCipher);
               var10.packetBuffer.writeIntIME(ModeWhere.selectedItemWidget);
               var10.packetBuffer.writeByteSub(Client.field747.method4106(82) ? 1 : 0);
               var10.packetBuffer.writeShortAddLE(var3);
               var10.packetBuffer.writeShortAdd(class101.selectedItemSlot);
               var10.packetBuffer.writeShortAdd(HealthBarUpdate.selectedItemId);
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
               var10 = class136.getPacketBufferNode(ClientPacket.OPNPCT, Client.packetWriter.isaacCipher);
               var10.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
               var10.packetBuffer.writeShortAddLE(var3);
               var10.packetBuffer.writeIntME(class358.selectedSpellWidget);
               var10.packetBuffer.writeShortAdd(Client.selectedSpellItemId);
               var10.packetBuffer.writeByteSub(Client.field747.method4106(82) ? 1 : 0);
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
               var10 = class136.getPacketBufferNode(ClientPacket.OPNPC1, Client.packetWriter.isaacCipher);
               var10.packetBuffer.writeShortLE(var3);
               var10.packetBuffer.writeByteAdd(Client.field747.method4106(82) ? 1 : 0);
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
               var10 = class136.getPacketBufferNode(ClientPacket.OPNPC2, Client.packetWriter.isaacCipher);
               var10.packetBuffer.writeShortAddLE(var3);
               var10.packetBuffer.writeByte(Client.field747.method4106(82) ? 1 : 0);
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
               var10 = class136.getPacketBufferNode(ClientPacket.OPNPC3, Client.packetWriter.isaacCipher);
               var10.packetBuffer.writeShortAdd(var3);
               var10.packetBuffer.writeByte(Client.field747.method4106(82) ? 1 : 0);
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
               var10 = class136.getPacketBufferNode(ClientPacket.OPNPC4, Client.packetWriter.isaacCipher);
               var10.packetBuffer.writeByteNeg(Client.field747.method4106(82) ? 1 : 0);
               var10.packetBuffer.writeShort(var3);
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
               var10 = class136.getPacketBufferNode(ClientPacket.OPNPC5, Client.packetWriter.isaacCipher);
               var10.packetBuffer.writeShortAddLE(var3);
               var10.packetBuffer.writeByteNeg(Client.field747.method4106(82) ? 1 : 0);
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
                  var10 = class136.getPacketBufferNode(ClientPacket.field3086, Client.packetWriter.isaacCipher);
                  var10.packetBuffer.writeByteSub(Client.field747.method4106(82) ? 1 : 0);
                  var10.packetBuffer.writeIntME(ModeWhere.selectedItemWidget);
                  var10.packetBuffer.writeShortAddLE(class101.selectedItemSlot);
                  var10.packetBuffer.writeShortAddLE(HealthBarUpdate.selectedItemId);
                  var10.packetBuffer.writeShortAdd(var3);
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
                  var10 = class136.getPacketBufferNode(ClientPacket.OPPLAYERT, Client.packetWriter.isaacCipher);
                  var10.packetBuffer.writeShort(var3);
                  var10.packetBuffer.writeByteAdd(Client.field747.method4106(82) ? 1 : 0);
                  var10.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
                  var10.packetBuffer.writeInt(class358.selectedSpellWidget);
                  var10.packetBuffer.writeShortAddLE(Client.selectedSpellItemId);
                  Client.packetWriter.addNode(var10);
               }
            } else if (var2 == 16) {
               Client.mouseCrossX = var7;
               Client.mouseCrossY = var8;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var9 = class136.getPacketBufferNode(ClientPacket.field3061, Client.packetWriter.isaacCipher);
               var9.packetBuffer.writeShort(var3);
               var9.packetBuffer.writeShortAdd(class365.baseY * 64 + var1);
               var9.packetBuffer.writeByteNeg(Client.field747.method4106(82) ? 1 : 0);
               var9.packetBuffer.writeShortAddLE(class101.selectedItemSlot);
               var9.packetBuffer.writeInt(ModeWhere.selectedItemWidget);
               var9.packetBuffer.writeShortAddLE(HealthBarUpdate.selectedItemId);
               var9.packetBuffer.writeShortAdd(class154.baseX * 64 + var0);
               Client.packetWriter.addNode(var9);
            } else if (var2 == 17) {
               Client.mouseCrossX = var7;
               Client.mouseCrossY = var8;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var9 = class136.getPacketBufferNode(ClientPacket.OPOBJT, Client.packetWriter.isaacCipher);
               var9.packetBuffer.writeShort(class365.baseY * 64 + var1);
               var9.packetBuffer.writeShort(Client.selectedSpellChildIndex);
               var9.packetBuffer.writeIntME(class358.selectedSpellWidget);
               var9.packetBuffer.writeShortAddLE(class154.baseX * 64 + var0);
               var9.packetBuffer.writeShort(var3);
               var9.packetBuffer.writeByteAdd(Client.field747.method4106(82) ? 1 : 0);
               var9.packetBuffer.writeShort(Client.selectedSpellItemId);
               Client.packetWriter.addNode(var9);
            } else if (var2 == 18) {
               Client.mouseCrossX = var7;
               Client.mouseCrossY = var8;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var9 = class136.getPacketBufferNode(ClientPacket.OPOBJ1, Client.packetWriter.isaacCipher);
               var9.packetBuffer.writeShortLE(class365.baseY * 64 + var1);
               var9.packetBuffer.writeByte(Client.field747.method4106(82) ? 1 : 0);
               var9.packetBuffer.writeShortAddLE(var3);
               var9.packetBuffer.writeShortLE(class154.baseX * 64 + var0);
               Client.packetWriter.addNode(var9);
            } else if (var2 == 19) {
               Client.mouseCrossX = var7;
               Client.mouseCrossY = var8;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var9 = class136.getPacketBufferNode(ClientPacket.OPOBJ2, Client.packetWriter.isaacCipher);
               var9.packetBuffer.writeShortLE(var3);
               var9.packetBuffer.writeByteAdd(Client.field747.method4106(82) ? 1 : 0);
               var9.packetBuffer.writeShort(class365.baseY * 64 + var1);
               var9.packetBuffer.writeShortAdd(class154.baseX * 64 + var0);
               Client.packetWriter.addNode(var9);
            } else if (var2 == 20) {
               Client.mouseCrossX = var7;
               Client.mouseCrossY = var8;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var9 = class136.getPacketBufferNode(ClientPacket.OPOBJ3, Client.packetWriter.isaacCipher);
               var9.packetBuffer.writeShortAdd(class154.baseX * 64 + var0);
               var9.packetBuffer.writeShortLE(var3);
               var9.packetBuffer.writeShortLE(class365.baseY * 64 + var1);
               var9.packetBuffer.writeByteAdd(Client.field747.method4106(82) ? 1 : 0);
               Client.packetWriter.addNode(var9);
            } else if (var2 == 21) {
               Client.mouseCrossX = var7;
               Client.mouseCrossY = var8;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var9 = class136.getPacketBufferNode(ClientPacket.OPOBJ4, Client.packetWriter.isaacCipher);
               var9.packetBuffer.writeShortAdd(class154.baseX * 64 + var0);
               var9.packetBuffer.writeByteSub(Client.field747.method4106(82) ? 1 : 0);
               var9.packetBuffer.writeShort(class365.baseY * 64 + var1);
               var9.packetBuffer.writeShort(var3);
               Client.packetWriter.addNode(var9);
            } else if (var2 == 22) {
               Client.mouseCrossX = var7;
               Client.mouseCrossY = var8;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var9 = class136.getPacketBufferNode(ClientPacket.OPOBJ5, Client.packetWriter.isaacCipher);
               var9.packetBuffer.writeShortAddLE(class365.baseY * 64 + var1);
               var9.packetBuffer.writeShortLE(var3);
               var9.packetBuffer.writeByteAdd(Client.field747.method4106(82) ? 1 : 0);
               var9.packetBuffer.writeShortLE(class154.baseX * 64 + var0);
               Client.packetWriter.addNode(var9);
            } else if (var2 == 23) {
               if (Client.isMenuOpen) {
                  ReflectionCheck.scene.setViewportWalking();
               } else {
                  ReflectionCheck.scene.menuOpen(class383.Client_plane, var0, var1, true);
               }
            } else {
               PacketBufferNode var13;
               Widget var17;
               if (var2 == 24) {
                  var17 = PlayerCompositionColorTextureOverride.getWidget(var1);
                  if (var17 != null) {
                     boolean var12 = true;
                     if (var17.contentType > 0) {
                        var12 = NPC.method2583(var17);
                     }

                     if (var12) {
                        var13 = class136.getPacketBufferNode(ClientPacket.field3133, Client.packetWriter.isaacCipher);
                        var13.packetBuffer.writeInt(var1);
                        Client.packetWriter.addNode(var13);
                     }
                  }
               } else {
                  if (var2 == 25) {
                     var17 = AttackOption.getWidgetChild(var1, var0);
                     if (var17 != null) {
                        Widget.Widget_runOnTargetLeave();
                        class32.selectSpell(var1, var0, PacketWriter.Widget_unpackTargetMask(Clock.getWidgetFlags(var17)), var4);
                        Client.isItemSelected = 0;
                        Client.selectedSpellActionName = ArchiveLoader.Widget_getSpellActionName(var17);
                        if (Client.selectedSpellActionName == null) {
                           Client.selectedSpellActionName = "null";
                        }

                        if (var17.isIf3) {
                           Client.selectedSpellName = var17.dataText + MouseRecorder.colorStartTag(16777215);
                        } else {
                           Client.selectedSpellName = MouseRecorder.colorStartTag(65280) + var17.spellName + MouseRecorder.colorStartTag(16777215);
                        }
                     }

                     return;
                  }

                  if (var2 == 26) {
                     WorldMapSectionType.method5236();
                  } else {
                     int var11;
                     Widget var15;
                     if (var2 == 28) {
                        var9 = class136.getPacketBufferNode(ClientPacket.field3133, Client.packetWriter.isaacCipher);
                        var9.packetBuffer.writeInt(var1);
                        Client.packetWriter.addNode(var9);
                        var15 = PlayerCompositionColorTextureOverride.getWidget(var1);
                        if (var15 != null && var15.cs1Instructions != null && var15.cs1Instructions[0][0] == 5) {
                           var11 = var15.cs1Instructions[0][1];
                           Varps.Varps_main[var11] = 1 - Varps.Varps_main[var11];
                           MouseRecorder.changeGameOptions(var11);
                        }
                     } else if (var2 == 29) {
                        var9 = class136.getPacketBufferNode(ClientPacket.field3133, Client.packetWriter.isaacCipher);
                        var9.packetBuffer.writeInt(var1);
                        Client.packetWriter.addNode(var9);
                        var15 = PlayerCompositionColorTextureOverride.getWidget(var1);
                        if (var15 != null && var15.cs1Instructions != null && var15.cs1Instructions[0][0] == 5) {
                           var11 = var15.cs1Instructions[0][1];
                           if (Varps.Varps_main[var11] != var15.cs1ComparisonValues[0]) {
                              Varps.Varps_main[var11] = var15.cs1ComparisonValues[0];
                              MouseRecorder.changeGameOptions(var11);
                           }
                        }
                     } else if (var2 == 30) {
                        if (Client.meslayerContinueWidget == null) {
                           class262.resumePauseWidget(var1, var0);
                           Client.meslayerContinueWidget = AttackOption.getWidgetChild(var1, var0);
                           class69.invalidateWidget(Client.meslayerContinueWidget);
                        }
                     } else if (var2 == 31) {
                        var9 = class136.getPacketBufferNode(ClientPacket.field3131, Client.packetWriter.isaacCipher);
                        var9.packetBuffer.writeIntME(var1);
                        var9.packetBuffer.writeIntLE(ModeWhere.selectedItemWidget);
                        var9.packetBuffer.writeShort(var4);
                        var9.packetBuffer.writeShortLE(class101.selectedItemSlot);
                        var9.packetBuffer.writeShortLE(var0);
                        var9.packetBuffer.writeShort(HealthBarUpdate.selectedItemId);
                        Client.packetWriter.addNode(var9);
                        Client.field624 = 0;
                        MusicPatchPcmStream.field3411 = PlayerCompositionColorTextureOverride.getWidget(var1);
                        Client.field625 = var0;
                     } else if (var2 == 32) {
                        var9 = class136.getPacketBufferNode(ClientPacket.field3049, Client.packetWriter.isaacCipher);
                        var9.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
                        var9.packetBuffer.writeShortAddLE(var4);
                        var9.packetBuffer.writeIntIME(class358.selectedSpellWidget);
                        var9.packetBuffer.writeShortAddLE(var0);
                        var9.packetBuffer.writeIntLE(var1);
                        Client.packetWriter.addNode(var9);
                        Client.field624 = 0;
                        MusicPatchPcmStream.field3411 = PlayerCompositionColorTextureOverride.getWidget(var1);
                        Client.field625 = var0;
                     } else if (var2 == 33) {
                        var9 = class136.getPacketBufferNode(ClientPacket.field3095, Client.packetWriter.isaacCipher);
                        var9.packetBuffer.writeShortLE(var0);
                        var9.packetBuffer.writeIntME(var1);
                        var9.packetBuffer.writeShortAdd(var4);
                        Client.packetWriter.addNode(var9);
                        Client.field624 = 0;
                        MusicPatchPcmStream.field3411 = PlayerCompositionColorTextureOverride.getWidget(var1);
                        Client.field625 = var0;
                     } else if (var2 == 34) {
                        var9 = class136.getPacketBufferNode(ClientPacket.field3101, Client.packetWriter.isaacCipher);
                        var9.packetBuffer.writeShortAddLE(var4);
                        var9.packetBuffer.writeIntLE(var1);
                        var9.packetBuffer.writeShortLE(var0);
                        Client.packetWriter.addNode(var9);
                        Client.field624 = 0;
                        MusicPatchPcmStream.field3411 = PlayerCompositionColorTextureOverride.getWidget(var1);
                        Client.field625 = var0;
                     } else if (var2 == 35) {
                        var9 = class136.getPacketBufferNode(ClientPacket.field3093, Client.packetWriter.isaacCipher);
                        var9.packetBuffer.writeInt(var1);
                        var9.packetBuffer.writeShortAdd(var4);
                        var9.packetBuffer.writeShortAdd(var0);
                        Client.packetWriter.addNode(var9);
                        Client.field624 = 0;
                        MusicPatchPcmStream.field3411 = PlayerCompositionColorTextureOverride.getWidget(var1);
                        Client.field625 = var0;
                     } else if (var2 == 36) {
                        var9 = class136.getPacketBufferNode(ClientPacket.field3122, Client.packetWriter.isaacCipher);
                        var9.packetBuffer.writeIntME(var1);
                        var9.packetBuffer.writeShort(var0);
                        var9.packetBuffer.writeShortAddLE(var4);
                        Client.packetWriter.addNode(var9);
                        Client.field624 = 0;
                        MusicPatchPcmStream.field3411 = PlayerCompositionColorTextureOverride.getWidget(var1);
                        Client.field625 = var0;
                     } else if (var2 == 37) {
                        var9 = class136.getPacketBufferNode(ClientPacket.field3104, Client.packetWriter.isaacCipher);
                        var9.packetBuffer.writeIntME(var1);
                        var9.packetBuffer.writeShort(var4);
                        var9.packetBuffer.writeShortAdd(var0);
                        Client.packetWriter.addNode(var9);
                        Client.field624 = 0;
                        MusicPatchPcmStream.field3411 = PlayerCompositionColorTextureOverride.getWidget(var1);
                        Client.field625 = var0;
                     } else {
                        if (var2 == 38) {
                           Widget.Widget_runOnTargetLeave();
                           var17 = PlayerCompositionColorTextureOverride.getWidget(var1);
                           Client.isItemSelected = 1;
                           class101.selectedItemSlot = var0;
                           ModeWhere.selectedItemWidget = var1;
                           HealthBarUpdate.selectedItemId = var4;
                           class69.invalidateWidget(var17);
                           Client.selectedItemName = MouseRecorder.colorStartTag(16748608) + NPCComposition.ItemDefinition_get(var4).name + MouseRecorder.colorStartTag(16777215);
                           if (Client.selectedItemName == null) {
                              Client.selectedItemName = "null";
                           }

                           return;
                        }

                        if (var2 == 39) {
                           var9 = class136.getPacketBufferNode(ClientPacket.field3059, Client.packetWriter.isaacCipher);
                           var9.packetBuffer.writeInt(var1);
                           var9.packetBuffer.writeShortAdd(var4);
                           var9.packetBuffer.writeShortAddLE(var0);
                           Client.packetWriter.addNode(var9);
                           Client.field624 = 0;
                           MusicPatchPcmStream.field3411 = PlayerCompositionColorTextureOverride.getWidget(var1);
                           Client.field625 = var0;
                        } else if (var2 == 40) {
                           var9 = class136.getPacketBufferNode(ClientPacket.field3139, Client.packetWriter.isaacCipher);
                           var9.packetBuffer.writeShort(var0);
                           var9.packetBuffer.writeInt(var1);
                           var9.packetBuffer.writeShortLE(var4);
                           Client.packetWriter.addNode(var9);
                           Client.field624 = 0;
                           MusicPatchPcmStream.field3411 = PlayerCompositionColorTextureOverride.getWidget(var1);
                           Client.field625 = var0;
                        } else if (var2 == 41) {
                           var9 = class136.getPacketBufferNode(ClientPacket.field3116, Client.packetWriter.isaacCipher);
                           var9.packetBuffer.writeIntIME(var1);
                           var9.packetBuffer.writeShortAddLE(var0);
                           var9.packetBuffer.writeShortAdd(var4);
                           Client.packetWriter.addNode(var9);
                           Client.field624 = 0;
                           MusicPatchPcmStream.field3411 = PlayerCompositionColorTextureOverride.getWidget(var1);
                           Client.field625 = var0;
                        } else if (var2 == 42) {
                           var9 = class136.getPacketBufferNode(ClientPacket.field3056, Client.packetWriter.isaacCipher);
                           var9.packetBuffer.writeShortLE(var0);
                           var9.packetBuffer.writeShortLE(var4);
                           var9.packetBuffer.writeIntME(var1);
                           Client.packetWriter.addNode(var9);
                           Client.field624 = 0;
                           MusicPatchPcmStream.field3411 = PlayerCompositionColorTextureOverride.getWidget(var1);
                           Client.field625 = var0;
                        } else if (var2 == 43) {
                           var9 = class136.getPacketBufferNode(ClientPacket.field3111, Client.packetWriter.isaacCipher);
                           var9.packetBuffer.writeShort(var4);
                           var9.packetBuffer.writeShortAdd(var0);
                           var9.packetBuffer.writeIntLE(var1);
                           Client.packetWriter.addNode(var9);
                           Client.field624 = 0;
                           MusicPatchPcmStream.field3411 = PlayerCompositionColorTextureOverride.getWidget(var1);
                           Client.field625 = var0;
                        } else if (var2 == 44) {
                           var16 = Client.players[var3];
                           if (var16 != null) {
                              Client.mouseCrossX = var7;
                              Client.mouseCrossY = var8;
                              Client.mouseCrossColor = 2;
                              Client.mouseCrossState = 0;
                              Client.destinationX = var0;
                              Client.destinationY = var1;
                              var10 = class136.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
                              var10.packetBuffer.writeByte(Client.field747.method4106(82) ? 1 : 0);
                              var10.packetBuffer.writeShort(var3);
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
                              var10 = class136.getPacketBufferNode(ClientPacket.OPPLAYER2, Client.packetWriter.isaacCipher);
                              var10.packetBuffer.writeShortAdd(var3);
                              var10.packetBuffer.writeByte(Client.field747.method4106(82) ? 1 : 0);
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
                              var10 = class136.getPacketBufferNode(ClientPacket.OPPLAYER3, Client.packetWriter.isaacCipher);
                              var10.packetBuffer.writeByte(Client.field747.method4106(82) ? 1 : 0);
                              var10.packetBuffer.writeShortAddLE(var3);
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
                              var10 = class136.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher);
                              var10.packetBuffer.writeShort(var3);
                              var10.packetBuffer.writeByteSub(Client.field747.method4106(82) ? 1 : 0);
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
                              var10 = class136.getPacketBufferNode(ClientPacket.OPPLAYER5, Client.packetWriter.isaacCipher);
                              var10.packetBuffer.writeShortLE(var3);
                              var10.packetBuffer.writeByteSub(Client.field747.method4106(82) ? 1 : 0);
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
                              var10 = class136.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
                              var10.packetBuffer.writeByteSub(Client.field747.method4106(82) ? 1 : 0);
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
                              var10 = class136.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher);
                              var10.packetBuffer.writeShortAddLE(var3);
                              var10.packetBuffer.writeByteSub(Client.field747.method4106(82) ? 1 : 0);
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
                              var10 = class136.getPacketBufferNode(ClientPacket.OPPLAYER8, Client.packetWriter.isaacCipher);
                              var10.packetBuffer.writeShortAddLE(var3);
                              var10.packetBuffer.writeByteAdd(Client.field747.method4106(82) ? 1 : 0);
                              Client.packetWriter.addNode(var10);
                           }
                        } else {
                           label652: {
                              if (var2 != 57) {
                                 if (var2 == 58) {
                                    var17 = AttackOption.getWidgetChild(var1, var0);
                                    if (var17 != null) {
                                       if (var17.field3654 != null) {
                                          ScriptEvent var19 = new ScriptEvent();
                                          var19.widget = var17;
                                          var19.opIndex = var3;
                                          var19.targetName = var6;
                                          var19.args = var17.field3654;
                                          WorldMapElement.runScriptEvent(var19);
                                       }

                                       var10 = class136.getPacketBufferNode(ClientPacket.IF_BUTTONT, Client.packetWriter.isaacCipher);
                                       var10.packetBuffer.writeShortLE(Client.selectedSpellItemId);
                                       var10.packetBuffer.writeInt(var1);
                                       var10.packetBuffer.writeIntME(class358.selectedSpellWidget);
                                       var10.packetBuffer.writeShortAddLE(Client.selectedSpellChildIndex);
                                       var10.packetBuffer.writeShortLE(var0);
                                       var10.packetBuffer.writeShortAddLE(var4);
                                       Client.packetWriter.addNode(var10);
                                    }
                                    break label652;
                                 }

                                 if (var2 == 1001) {
                                    Client.mouseCrossX = var7;
                                    Client.mouseCrossY = var8;
                                    Client.mouseCrossColor = 2;
                                    Client.mouseCrossState = 0;
                                    Client.destinationX = var0;
                                    Client.destinationY = var1;
                                    var9 = class136.getPacketBufferNode(ClientPacket.OPLOC5, Client.packetWriter.isaacCipher);
                                    var9.packetBuffer.writeShortAddLE(class365.baseY * 64 + var1);
                                    var9.packetBuffer.writeShort(class154.baseX * 64 + var0);
                                    var9.packetBuffer.writeShortAdd(var3);
                                    var9.packetBuffer.writeByteAdd(Client.field747.method4106(82) ? 1 : 0);
                                    Client.packetWriter.addNode(var9);
                                    break label652;
                                 }

                                 if (var2 == 1002) {
                                    Client.mouseCrossX = var7;
                                    Client.mouseCrossY = var8;
                                    Client.mouseCrossColor = 2;
                                    Client.mouseCrossState = 0;
                                    var9 = class136.getPacketBufferNode(ClientPacket.OPLOCE, Client.packetWriter.isaacCipher);
                                    var9.packetBuffer.writeShortAddLE(var3);
                                    Client.packetWriter.addNode(var9);
                                    break label652;
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
                                          var13 = class136.getPacketBufferNode(ClientPacket.OPNPCE, Client.packetWriter.isaacCipher);
                                          var13.packetBuffer.writeShortAddLE(var18.id);
                                          Client.packetWriter.addNode(var13);
                                       }
                                    }
                                    break label652;
                                 }

                                 if (var2 == 1004) {
                                    Client.mouseCrossX = var7;
                                    Client.mouseCrossY = var8;
                                    Client.mouseCrossColor = 2;
                                    Client.mouseCrossState = 0;
                                    var9 = class136.getPacketBufferNode(ClientPacket.OPOBJE, Client.packetWriter.isaacCipher);
                                    var9.packetBuffer.writeShortAdd(class154.baseX * 64 + var0);
                                    var9.packetBuffer.writeShort(class365.baseY * 64 + var1);
                                    var9.packetBuffer.writeShortAddLE(var3);
                                    Client.packetWriter.addNode(var9);
                                    break label652;
                                 }

                                 if (var2 == 1005) {
                                    var17 = PlayerCompositionColorTextureOverride.getWidget(var1);
                                    if (var17 != null && var17.itemQuantities[var0] >= 100000) {
                                       KitDefinition.addGameMessage(27, "", var17.itemQuantities[var0] + " x " + NPCComposition.ItemDefinition_get(var4).name);
                                    } else {
                                       var10 = class136.getPacketBufferNode(ClientPacket.field3127, Client.packetWriter.isaacCipher);
                                       var10.packetBuffer.writeShortAddLE(var4);
                                       Client.packetWriter.addNode(var10);
                                    }

                                    Client.field624 = 0;
                                    MusicPatchPcmStream.field3411 = PlayerCompositionColorTextureOverride.getWidget(var1);
                                    Client.field625 = var0;
                                    break label652;
                                 }

                                 if (var2 != 1007) {
                                    if (var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1008 || var2 == 1012) {
                                       KitDefinition.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
                                    }
                                    break label652;
                                 }
                              }

                              var17 = AttackOption.getWidgetChild(var1, var0);
                              if (var17 != null) {
                                 ModelData0.widgetDefaultMenuAction(var3, var1, var0, var4, var6);
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
         class69.invalidateWidget(PlayerCompositionColorTextureOverride.getWidget(ModeWhere.selectedItemWidget));
      }

      if (Client.isSpellSelected) {
         Widget.Widget_runOnTargetLeave();
      }

      if (MusicPatchPcmStream.field3411 != null && Client.field624 == 0) {
         class69.invalidateWidget(MusicPatchPcmStream.field3411);
      }

   }

   @ObfuscatedName("nu")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1283712243"
   )
   static void method4848() {
      StructComposition.clientPreferences.method2431(Client.field511);
   }
}
