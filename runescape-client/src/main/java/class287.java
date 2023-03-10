import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lk")
public class class287 {
   @ObfuscatedName("jj")
   @ObfuscatedSignature(
      descriptor = "[Lsn;"
   )
   @Export("headIconPrayerSprites")
   static SpritePixels[] headIconPrayerSprites;

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(B)Lqh;",
      garbageValue = "92"
   )
   public static class420 method5474() {
      synchronized(class420.field4606) {
         if (class420.field4600 == 0) {
            return new class420();
         } else {
            class420.field4606[--class420.field4600].method7818();
            return class420.field4606[class420.field4600];
         }
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "47"
   )
   public static int method5476(int var0) {
      var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
      var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
      var0 = var0 + (var0 >>> 4) & 252645135;
      var0 += var0 >>> 8;
      var0 += var0 >>> 16;
      return var0 & 255;
   }

   @ObfuscatedName("ku")
   @ObfuscatedSignature(
      descriptor = "(IIIIILjava/lang/String;Ljava/lang/String;III)V",
      garbageValue = "1849187210"
   )
   @Export("menuAction")
   static final void menuAction(int var0, int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
      if (var2 >= 2000) {
         var2 -= 2000;
      }

      Player var9;
      PacketBufferNode var10;
      if (var2 == 49) {
         var9 = Client.players[var3];
         if (var9 != null) {
            Client.mouseCrossX = var7;
            Client.mouseCrossY = var8;
            Client.mouseCrossColor = 2;
            Client.mouseCrossState = 0;
            Client.destinationX = var0;
            Client.destinationY = var1;
            var10 = UserComparator9.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
            var10.packetBuffer.writeByte(Client.field712.method4074(82) ? 1 : 0);
            var10.packetBuffer.writeShortAdd(var3);
            Client.packetWriter.addNode(var10);
         }
      }

      PacketBufferNode var14;
      if (var2 == 19) {
         Client.mouseCrossX = var7;
         Client.mouseCrossY = var8;
         Client.mouseCrossColor = 2;
         Client.mouseCrossState = 0;
         Client.destinationX = var0;
         Client.destinationY = var1;
         var14 = UserComparator9.getPacketBufferNode(ClientPacket.OPOBJ2, Client.packetWriter.isaacCipher);
         var14.packetBuffer.writeShortAddLE(var3);
         var14.packetBuffer.writeShortAdd(class178.baseY * 64 + var1);
         var14.packetBuffer.writeShortLE(GameEngine.baseX * 64 + var0);
         var14.packetBuffer.writeByte(Client.field712.method4074(82) ? 1 : 0);
         Client.packetWriter.addNode(var14);
      }

      if (var2 == 23) {
         if (Client.isMenuOpen) {
            class1.scene.setViewportWalking();
         } else {
            class1.scene.menuOpen(TaskHandler.Client_plane, var0, var1, true);
         }
      }

      NPC var15;
      if (var2 == 7) {
         var15 = Client.npcs[var3];
         if (var15 != null) {
            Client.mouseCrossX = var7;
            Client.mouseCrossY = var8;
            Client.mouseCrossColor = 2;
            Client.mouseCrossState = 0;
            Client.destinationX = var0;
            Client.destinationY = var1;
            var10 = UserComparator9.getPacketBufferNode(ClientPacket.field3132, Client.packetWriter.isaacCipher);
            var10.packetBuffer.writeShortLE(class124.field1479);
            var10.packetBuffer.writeShortAddLE(class31.field164);
            var10.packetBuffer.writeByteNeg(Client.field712.method4074(82) ? 1 : 0);
            var10.packetBuffer.writeShort(var3);
            var10.packetBuffer.writeIntLE(Interpreter.field844);
            Client.packetWriter.addNode(var10);
         }
      }

      PacketBufferNode var11;
      if (var2 == 1003) {
         Client.mouseCrossX = var7;
         Client.mouseCrossY = var8;
         Client.mouseCrossColor = 2;
         Client.mouseCrossState = 0;
         var15 = Client.npcs[var3];
         if (var15 != null) {
            NPCComposition var16 = var15.definition;
            if (var16.transforms != null) {
               var16 = var16.transform();
            }

            if (var16 != null) {
               var11 = UserComparator9.getPacketBufferNode(ClientPacket.OPNPCE, Client.packetWriter.isaacCipher);
               var11.packetBuffer.writeShortAddLE(var16.id);
               Client.packetWriter.addNode(var11);
            }
         }
      }

      if (var2 == 51) {
         var9 = Client.players[var3];
         if (var9 != null) {
            Client.mouseCrossX = var7;
            Client.mouseCrossY = var8;
            Client.mouseCrossColor = 2;
            Client.mouseCrossState = 0;
            Client.destinationX = var0;
            Client.destinationY = var1;
            var10 = UserComparator9.getPacketBufferNode(ClientPacket.OPPLAYER8, Client.packetWriter.isaacCipher);
            var10.packetBuffer.writeShortAdd(var3);
            var10.packetBuffer.writeByte(Client.field712.method4074(82) ? 1 : 0);
            Client.packetWriter.addNode(var10);
         }
      }

      if (var2 == 4) {
         Client.mouseCrossX = var7;
         Client.mouseCrossY = var8;
         Client.mouseCrossColor = 2;
         Client.mouseCrossState = 0;
         Client.destinationX = var0;
         Client.destinationY = var1;
         var14 = UserComparator9.getPacketBufferNode(ClientPacket.OPLOC2, Client.packetWriter.isaacCipher);
         var14.packetBuffer.writeShort(class178.baseY * 64 + var1);
         var14.packetBuffer.writeShortAdd(GameEngine.baseX * 64 + var0);
         var14.packetBuffer.writeShortLE(var3);
         var14.packetBuffer.writeByteSub(Client.field712.method4074(82) ? 1 : 0);
         Client.packetWriter.addNode(var14);
      }

      int var12;
      Widget var17;
      if (var2 == 28) {
         var14 = UserComparator9.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
         var14.packetBuffer.writeInt(var1);
         Client.packetWriter.addNode(var14);
         var17 = WorldMapSection1.getWidget(var1);
         if (var17 != null && var17.cs1Instructions != null && var17.cs1Instructions[0][0] == 5) {
            var12 = var17.cs1Instructions[0][1];
            Varps.Varps_main[var12] = 1 - Varps.Varps_main[var12];
            class159.changeGameOptions(var12);
         }
      }

      Widget var18;
      if (var2 == 25) {
         var18 = class36.getWidgetChild(var1, var0);
         if (var18 != null) {
            GameEngine.Widget_runOnTargetLeave();
            TaskHandler.selectSpell(var1, var0, WorldMapDecorationType.Widget_unpackTargetMask(ParamComposition.getWidgetFlags(var18)), var4);
            Client.isItemSelected = 0;
            Client.selectedSpellActionName = Archive.Widget_getSpellActionName(var18);
            if (Client.selectedSpellActionName == null) {
               Client.selectedSpellActionName = "null";
            }

            if (var18.isIf3) {
               Client.selectedSpellName = var18.dataText + Canvas.colorStartTag(16777215);
            } else {
               Client.selectedSpellName = Canvas.colorStartTag(65280) + var18.field3653 + Canvas.colorStartTag(16777215);
            }
         }

      } else {
         if (var2 == 50) {
            var9 = Client.players[var3];
            if (var9 != null) {
               Client.mouseCrossX = var7;
               Client.mouseCrossY = var8;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var10 = UserComparator9.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher);
               var10.packetBuffer.writeShort(var3);
               var10.packetBuffer.writeByte(Client.field712.method4074(82) ? 1 : 0);
               Client.packetWriter.addNode(var10);
            }
         }

         if (var2 == 13) {
            var15 = Client.npcs[var3];
            if (var15 != null) {
               Client.mouseCrossX = var7;
               Client.mouseCrossY = var8;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var10 = UserComparator9.getPacketBufferNode(ClientPacket.OPNPC5, Client.packetWriter.isaacCipher);
               var10.packetBuffer.writeShort(var3);
               var10.packetBuffer.writeByteSub(Client.field712.method4074(82) ? 1 : 0);
               Client.packetWriter.addNode(var10);
            }
         }

         if (var2 == 21) {
            Client.mouseCrossX = var7;
            Client.mouseCrossY = var8;
            Client.mouseCrossColor = 2;
            Client.mouseCrossState = 0;
            Client.destinationX = var0;
            Client.destinationY = var1;
            var14 = UserComparator9.getPacketBufferNode(ClientPacket.OPOBJ4, Client.packetWriter.isaacCipher);
            var14.packetBuffer.writeShortAdd(GameEngine.baseX * 64 + var0);
            var14.packetBuffer.writeShortLE(var3);
            var14.packetBuffer.writeShortAddLE(class178.baseY * 64 + var1);
            var14.packetBuffer.writeByte(Client.field712.method4074(82) ? 1 : 0);
            Client.packetWriter.addNode(var14);
         }

         if (var2 == 12) {
            var15 = Client.npcs[var3];
            if (var15 != null) {
               Client.mouseCrossX = var7;
               Client.mouseCrossY = var8;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var10 = UserComparator9.getPacketBufferNode(ClientPacket.OPNPC4, Client.packetWriter.isaacCipher);
               var10.packetBuffer.writeShort(var3);
               var10.packetBuffer.writeByteNeg(Client.field712.method4074(82) ? 1 : 0);
               Client.packetWriter.addNode(var10);
            }
         }

         if (var2 == 22) {
            Client.mouseCrossX = var7;
            Client.mouseCrossY = var8;
            Client.mouseCrossColor = 2;
            Client.mouseCrossState = 0;
            Client.destinationX = var0;
            Client.destinationY = var1;
            var14 = UserComparator9.getPacketBufferNode(ClientPacket.OPOBJ5, Client.packetWriter.isaacCipher);
            var14.packetBuffer.writeByteAdd(Client.field712.method4074(82) ? 1 : 0);
            var14.packetBuffer.writeShort(class178.baseY * 64 + var1);
            var14.packetBuffer.writeShortLE(GameEngine.baseX * 64 + var0);
            var14.packetBuffer.writeShortAdd(var3);
            Client.packetWriter.addNode(var14);
         }

         if (var2 == 17) {
            Client.mouseCrossX = var7;
            Client.mouseCrossY = var8;
            Client.mouseCrossColor = 2;
            Client.mouseCrossState = 0;
            Client.destinationX = var0;
            Client.destinationY = var1;
            var14 = UserComparator9.getPacketBufferNode(ClientPacket.OPOBJT, Client.packetWriter.isaacCipher);
            var14.packetBuffer.writeShortLE(GameEngine.baseX * 64 + var0);
            var14.packetBuffer.writeInt(class18.selectedSpellWidget);
            var14.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
            var14.packetBuffer.writeShortLE(Client.selectedSpellItemId);
            var14.packetBuffer.writeShortAddLE(var3);
            var14.packetBuffer.writeShort(class178.baseY * 64 + var1);
            var14.packetBuffer.writeByteSub(Client.field712.method4074(82) ? 1 : 0);
            Client.packetWriter.addNode(var14);
         }

         if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) {
            WorldMapData_1.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
         }

         if (var2 == 18) {
            Client.mouseCrossX = var7;
            Client.mouseCrossY = var8;
            Client.mouseCrossColor = 2;
            Client.mouseCrossState = 0;
            Client.destinationX = var0;
            Client.destinationY = var1;
            var14 = UserComparator9.getPacketBufferNode(ClientPacket.OPOBJ1, Client.packetWriter.isaacCipher);
            var14.packetBuffer.writeShortAdd(GameEngine.baseX * 64 + var0);
            var14.packetBuffer.writeShort(class178.baseY * 64 + var1);
            var14.packetBuffer.writeByteAdd(Client.field712.method4074(82) ? 1 : 0);
            var14.packetBuffer.writeShortAdd(var3);
            Client.packetWriter.addNode(var14);
         }

         if (var2 == 45) {
            var9 = Client.players[var3];
            if (var9 != null) {
               Client.mouseCrossX = var7;
               Client.mouseCrossY = var8;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var10 = UserComparator9.getPacketBufferNode(ClientPacket.OPPLAYER2, Client.packetWriter.isaacCipher);
               var10.packetBuffer.writeByteNeg(Client.field712.method4074(82) ? 1 : 0);
               var10.packetBuffer.writeShort(var3);
               Client.packetWriter.addNode(var10);
            }
         }

         if (var2 == 46) {
            var9 = Client.players[var3];
            if (var9 != null) {
               Client.mouseCrossX = var7;
               Client.mouseCrossY = var8;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var10 = UserComparator9.getPacketBufferNode(ClientPacket.OPPLAYER3, Client.packetWriter.isaacCipher);
               var10.packetBuffer.writeShortAddLE(var3);
               var10.packetBuffer.writeByteNeg(Client.field712.method4074(82) ? 1 : 0);
               Client.packetWriter.addNode(var10);
            }
         }

         if (var2 == 1001) {
            Client.mouseCrossX = var7;
            Client.mouseCrossY = var8;
            Client.mouseCrossColor = 2;
            Client.mouseCrossState = 0;
            Client.destinationX = var0;
            Client.destinationY = var1;
            var14 = UserComparator9.getPacketBufferNode(ClientPacket.OPLOC5, Client.packetWriter.isaacCipher);
            var14.packetBuffer.writeShortAddLE(var3);
            var14.packetBuffer.writeByteAdd(Client.field712.method4074(82) ? 1 : 0);
            var14.packetBuffer.writeShort(class178.baseY * 64 + var1);
            var14.packetBuffer.writeShort(GameEngine.baseX * 64 + var0);
            Client.packetWriter.addNode(var14);
         }

         if (var2 == 10) {
            var15 = Client.npcs[var3];
            if (var15 != null) {
               Client.mouseCrossX = var7;
               Client.mouseCrossY = var8;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var10 = UserComparator9.getPacketBufferNode(ClientPacket.OPNPC2, Client.packetWriter.isaacCipher);
               var10.packetBuffer.writeByteSub(Client.field712.method4074(82) ? 1 : 0);
               var10.packetBuffer.writeShortLE(var3);
               Client.packetWriter.addNode(var10);
            }
         }

         if (var2 == 11) {
            var15 = Client.npcs[var3];
            if (var15 != null) {
               Client.mouseCrossX = var7;
               Client.mouseCrossY = var8;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var10 = UserComparator9.getPacketBufferNode(ClientPacket.OPNPC3, Client.packetWriter.isaacCipher);
               var10.packetBuffer.writeByteAdd(Client.field712.method4074(82) ? 1 : 0);
               var10.packetBuffer.writeShort(var3);
               Client.packetWriter.addNode(var10);
            }
         }

         if (var2 == 57 || var2 == 1007) {
            var18 = class36.getWidgetChild(var1, var0);
            if (var18 != null) {
               class333.widgetDefaultMenuAction(var3, var1, var0, var4, var6);
            }
         }

         if (var2 == 5) {
            Client.mouseCrossX = var7;
            Client.mouseCrossY = var8;
            Client.mouseCrossColor = 2;
            Client.mouseCrossState = 0;
            Client.destinationX = var0;
            Client.destinationY = var1;
            var14 = UserComparator9.getPacketBufferNode(ClientPacket.OPLOC3, Client.packetWriter.isaacCipher);
            var14.packetBuffer.writeShortAddLE(class178.baseY * 64 + var1);
            var14.packetBuffer.writeShortAddLE(var3);
            var14.packetBuffer.writeShortLE(GameEngine.baseX * 64 + var0);
            var14.packetBuffer.writeByteSub(Client.field712.method4074(82) ? 1 : 0);
            Client.packetWriter.addNode(var14);
         }

         if (var2 == 48) {
            var9 = Client.players[var3];
            if (var9 != null) {
               Client.mouseCrossX = var7;
               Client.mouseCrossY = var8;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var10 = UserComparator9.getPacketBufferNode(ClientPacket.OPPLAYER5, Client.packetWriter.isaacCipher);
               var10.packetBuffer.writeByteAdd(Client.field712.method4074(82) ? 1 : 0);
               var10.packetBuffer.writeShort(var3);
               Client.packetWriter.addNode(var10);
            }
         }

         if (var2 == 44) {
            var9 = Client.players[var3];
            if (var9 != null) {
               Client.mouseCrossX = var7;
               Client.mouseCrossY = var8;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var10 = UserComparator9.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
               var10.packetBuffer.writeShort(var3);
               var10.packetBuffer.writeByteSub(Client.field712.method4074(82) ? 1 : 0);
               Client.packetWriter.addNode(var10);
            }
         }

         if (var2 == 2) {
            Client.mouseCrossX = var7;
            Client.mouseCrossY = var8;
            Client.mouseCrossColor = 2;
            Client.mouseCrossState = 0;
            Client.destinationX = var0;
            Client.destinationY = var1;
            var14 = UserComparator9.getPacketBufferNode(ClientPacket.OPLOCT, Client.packetWriter.isaacCipher);
            var14.packetBuffer.writeByteNeg(Client.field712.method4074(82) ? 1 : 0);
            var14.packetBuffer.writeShort(Client.selectedSpellItemId);
            var14.packetBuffer.writeIntIME(class18.selectedSpellWidget);
            var14.packetBuffer.writeShort(GameEngine.baseX * 64 + var0);
            var14.packetBuffer.writeShort(var3);
            var14.packetBuffer.writeShortAdd(class178.baseY * 64 + var1);
            var14.packetBuffer.writeShort(Client.selectedSpellChildIndex);
            Client.packetWriter.addNode(var14);
         }

         if (var2 == 8) {
            var15 = Client.npcs[var3];
            if (var15 != null) {
               Client.mouseCrossX = var7;
               Client.mouseCrossY = var8;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var10 = UserComparator9.getPacketBufferNode(ClientPacket.OPNPCT, Client.packetWriter.isaacCipher);
               var10.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
               var10.packetBuffer.writeShortAdd(var3);
               var10.packetBuffer.writeShort(Client.selectedSpellItemId);
               var10.packetBuffer.writeByteSub(Client.field712.method4074(82) ? 1 : 0);
               var10.packetBuffer.writeIntIME(class18.selectedSpellWidget);
               Client.packetWriter.addNode(var10);
            }
         }

         if (var2 == 29) {
            var14 = UserComparator9.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
            var14.packetBuffer.writeInt(var1);
            Client.packetWriter.addNode(var14);
            var17 = WorldMapSection1.getWidget(var1);
            if (var17 != null && var17.cs1Instructions != null && var17.cs1Instructions[0][0] == 5) {
               var12 = var17.cs1Instructions[0][1];
               if (Varps.Varps_main[var12] != var17.cs1ComparisonValues[0]) {
                  Varps.Varps_main[var12] = var17.cs1ComparisonValues[0];
                  class159.changeGameOptions(var12);
               }
            }
         }

         if (var2 == 6) {
            Client.mouseCrossX = var7;
            Client.mouseCrossY = var8;
            Client.mouseCrossColor = 2;
            Client.mouseCrossState = 0;
            Client.destinationX = var0;
            Client.destinationY = var1;
            var14 = UserComparator9.getPacketBufferNode(ClientPacket.OPLOC4, Client.packetWriter.isaacCipher);
            var14.packetBuffer.writeShort(var3);
            var14.packetBuffer.writeShortAddLE(GameEngine.baseX * 64 + var0);
            var14.packetBuffer.writeShortAdd(class178.baseY * 64 + var1);
            var14.packetBuffer.writeByte(Client.field712.method4074(82) ? 1 : 0);
            Client.packetWriter.addNode(var14);
         }

         if (var2 == 9) {
            var15 = Client.npcs[var3];
            if (var15 != null) {
               Client.mouseCrossX = var7;
               Client.mouseCrossY = var8;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var10 = UserComparator9.getPacketBufferNode(ClientPacket.OPNPC1, Client.packetWriter.isaacCipher);
               var10.packetBuffer.writeShort(var3);
               var10.packetBuffer.writeByteNeg(Client.field712.method4074(82) ? 1 : 0);
               Client.packetWriter.addNode(var10);
            }
         }

         if (var2 == 16) {
            Client.mouseCrossX = var7;
            Client.mouseCrossY = var8;
            Client.mouseCrossColor = 2;
            Client.mouseCrossState = 0;
            Client.destinationX = var0;
            Client.destinationY = var1;
            var14 = UserComparator9.getPacketBufferNode(ClientPacket.field3094, Client.packetWriter.isaacCipher);
            var14.packetBuffer.writeIntME(Interpreter.field844);
            var14.packetBuffer.writeByteNeg(Client.field712.method4074(82) ? 1 : 0);
            var14.packetBuffer.writeShortLE(GameEngine.baseX * 64 + var0);
            var14.packetBuffer.writeShortAddLE(class178.baseY * 64 + var1);
            var14.packetBuffer.writeShortAdd(class31.field164);
            var14.packetBuffer.writeShortAddLE(class124.field1479);
            var14.packetBuffer.writeShortLE(var3);
            Client.packetWriter.addNode(var14);
         }

         if (var2 == 1002) {
            Client.mouseCrossX = var7;
            Client.mouseCrossY = var8;
            Client.mouseCrossColor = 2;
            Client.mouseCrossState = 0;
            var14 = UserComparator9.getPacketBufferNode(ClientPacket.OPLOCE, Client.packetWriter.isaacCipher);
            var14.packetBuffer.writeShortLE(var3);
            Client.packetWriter.addNode(var14);
         }

         if (var2 == 15) {
            var9 = Client.players[var3];
            if (var9 != null) {
               Client.mouseCrossX = var7;
               Client.mouseCrossY = var8;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var10 = UserComparator9.getPacketBufferNode(ClientPacket.OPPLAYERT, Client.packetWriter.isaacCipher);
               var10.packetBuffer.writeByteSub(Client.field712.method4074(82) ? 1 : 0);
               var10.packetBuffer.writeShortAddLE(Client.selectedSpellChildIndex);
               var10.packetBuffer.writeShortLE(Client.selectedSpellItemId);
               var10.packetBuffer.writeIntME(class18.selectedSpellWidget);
               var10.packetBuffer.writeShortAddLE(var3);
               Client.packetWriter.addNode(var10);
            }
         }

         if (var2 == 30 && Client.meslayerContinueWidget == null) {
            class130.resumePauseWidget(var1, var0);
            Client.meslayerContinueWidget = class36.getWidgetChild(var1, var0);
            class69.invalidateWidget(Client.meslayerContinueWidget);
         }

         if (var2 == 26) {
            class240.method4792();
         }

         if (var2 == 58) {
            var18 = class36.getWidgetChild(var1, var0);
            if (var18 != null) {
               if (var18.field3622 != null) {
                  ScriptEvent var19 = new ScriptEvent();
                  var19.widget = var18;
                  var19.opIndex = var3;
                  var19.targetName = var6;
                  var19.args = var18.field3622;
                  class9.runScriptEvent(var19);
               }

               var10 = UserComparator9.getPacketBufferNode(ClientPacket.IF_BUTTONT, Client.packetWriter.isaacCipher);
               var10.packetBuffer.writeShort(Client.selectedSpellItemId);
               var10.packetBuffer.writeShortAdd(var4);
               var10.packetBuffer.writeShortAddLE(Client.selectedSpellChildIndex);
               var10.packetBuffer.writeShort(var0);
               var10.packetBuffer.writeIntLE(var1);
               var10.packetBuffer.writeIntME(class18.selectedSpellWidget);
               Client.packetWriter.addNode(var10);
            }
         }

         if (var2 == 1004) {
            Client.mouseCrossX = var7;
            Client.mouseCrossY = var8;
            Client.mouseCrossColor = 2;
            Client.mouseCrossState = 0;
            var14 = UserComparator9.getPacketBufferNode(ClientPacket.OPOBJE, Client.packetWriter.isaacCipher);
            var14.packetBuffer.writeShortAddLE(var3);
            var14.packetBuffer.writeShort(class178.baseY * 64 + var1);
            var14.packetBuffer.writeShortLE(GameEngine.baseX * 64 + var0);
            Client.packetWriter.addNode(var14);
         }

         if (var2 == 1) {
            Client.mouseCrossX = var7;
            Client.mouseCrossY = var8;
            Client.mouseCrossColor = 2;
            Client.mouseCrossState = 0;
            Client.destinationX = var0;
            Client.destinationY = var1;
            var14 = UserComparator9.getPacketBufferNode(ClientPacket.field3079, Client.packetWriter.isaacCipher);
            var14.packetBuffer.writeShort(class31.field164);
            var14.packetBuffer.writeByteSub(Client.field712.method4074(82) ? 1 : 0);
            var14.packetBuffer.writeShortAdd(class178.baseY * 64 + var1);
            var14.packetBuffer.writeShort(GameEngine.baseX * 64 + var0);
            var14.packetBuffer.writeIntLE(Interpreter.field844);
            var14.packetBuffer.writeShortAdd(class124.field1479);
            var14.packetBuffer.writeShortAddLE(var3);
            Client.packetWriter.addNode(var14);
         }

         if (var2 == 3) {
            Client.mouseCrossX = var7;
            Client.mouseCrossY = var8;
            Client.mouseCrossColor = 2;
            Client.mouseCrossState = 0;
            Client.destinationX = var0;
            Client.destinationY = var1;
            var14 = UserComparator9.getPacketBufferNode(ClientPacket.OPLOC1, Client.packetWriter.isaacCipher);
            var14.packetBuffer.writeByteAdd(Client.field712.method4074(82) ? 1 : 0);
            var14.packetBuffer.writeShortAddLE(var3);
            var14.packetBuffer.writeShort(GameEngine.baseX * 64 + var0);
            var14.packetBuffer.writeShortLE(class178.baseY * 64 + var1);
            Client.packetWriter.addNode(var14);
         }

         if (var2 == 47) {
            var9 = Client.players[var3];
            if (var9 != null) {
               Client.mouseCrossX = var7;
               Client.mouseCrossY = var8;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var10 = UserComparator9.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher);
               var10.packetBuffer.writeShortAddLE(var3);
               var10.packetBuffer.writeByteNeg(Client.field712.method4074(82) ? 1 : 0);
               Client.packetWriter.addNode(var10);
            }
         }

         if (var2 == 24) {
            var18 = WorldMapSection1.getWidget(var1);
            if (var18 != null) {
               boolean var13 = true;
               if (var18.contentType > 0) {
                  var13 = class11.method103(var18);
               }

               if (var13) {
                  var11 = UserComparator9.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
                  var11.packetBuffer.writeInt(var1);
                  Client.packetWriter.addNode(var11);
               }
            }
         }

         if (var2 == 20) {
            Client.mouseCrossX = var7;
            Client.mouseCrossY = var8;
            Client.mouseCrossColor = 2;
            Client.mouseCrossState = 0;
            Client.destinationX = var0;
            Client.destinationY = var1;
            var14 = UserComparator9.getPacketBufferNode(ClientPacket.OPOBJ3, Client.packetWriter.isaacCipher);
            var14.packetBuffer.writeShortAdd(class178.baseY * 64 + var1);
            var14.packetBuffer.writeByteNeg(Client.field712.method4074(82) ? 1 : 0);
            var14.packetBuffer.writeShortAdd(var3);
            var14.packetBuffer.writeShortAdd(GameEngine.baseX * 64 + var0);
            Client.packetWriter.addNode(var14);
         }

         if (var2 == 14) {
            var9 = Client.players[var3];
            if (var9 != null) {
               Client.mouseCrossX = var7;
               Client.mouseCrossY = var8;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var10 = UserComparator9.getPacketBufferNode(ClientPacket.field3130, Client.packetWriter.isaacCipher);
               var10.packetBuffer.writeByteSub(Client.field712.method4074(82) ? 1 : 0);
               var10.packetBuffer.writeShortAdd(class31.field164);
               var10.packetBuffer.writeIntLE(Interpreter.field844);
               var10.packetBuffer.writeShortLE(class124.field1479);
               var10.packetBuffer.writeShortAddLE(var3);
               Client.packetWriter.addNode(var10);
            }
         }

         if (Client.isItemSelected != 0) {
            Client.isItemSelected = 0;
            class69.invalidateWidget(WorldMapSection1.getWidget(Interpreter.field844));
         }

         if (Client.isSpellSelected) {
            GameEngine.Widget_runOnTargetLeave();
         }

      }
   }

   @ObfuscatedName("mk")
   @ObfuscatedSignature(
      descriptor = "(Lmy;I)Lmy;",
      garbageValue = "-1669266897"
   )
   static Widget method5477(Widget var0) {
      int var1 = class467.method8481(ParamComposition.getWidgetFlags(var0));
      if (var1 == 0) {
         return null;
      } else {
         for(int var2 = 0; var2 < var1; ++var2) {
            var0 = WorldMapSection1.getWidget(var0.parentId);
            if (var0 == null) {
               return null;
            }
         }

         return var0;
      }
   }
}
