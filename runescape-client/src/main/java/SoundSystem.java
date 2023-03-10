import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bp")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "Lmy;"
   )
   @Export("scriptActiveWidget")
   static Widget scriptActiveWidget;
   @ObfuscatedName("au")
   @Export("ByteArrayPool_altSizeArrayCounts")
   public static int[] ByteArrayPool_altSizeArrayCounts;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "[Lbd;"
   )
   @Export("players")
   volatile PcmPlayer[] players = new PcmPlayer[2];

   SoundSystem() {
   }

   public void run() {
      try {
         for(int var1 = 0; var1 < 2; ++var1) {
            PcmPlayer var2 = this.players[var1];
            if (var2 != null) {
               var2.run();
            }
         }
      } catch (Exception var4) {
         class364.RunException_sendStackTrace((String)null, var4);
      }

   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "(ILcv;ZB)I",
      garbageValue = "27"
   )
   static int method835(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.publicChatMode;
         return 1;
      } else if (var0 == ScriptOpcodes.CHAT_SETFILTER) {
         Interpreter.Interpreter_intStackSize -= 3;
         Client.publicChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         class207.privateChatMode = class181.method3544(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
         if (class207.privateChatMode == null) {
            class207.privateChatMode = PrivateChatMode.field5040;
         }

         Client.tradeChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
         PacketBufferNode var13 = UserComparator9.getPacketBufferNode(ClientPacket.CHAT_SETFILTER, Client.packetWriter.isaacCipher);
         var13.packetBuffer.writeByte(Client.publicChatMode);
         var13.packetBuffer.writeByte(class207.privateChatMode.field5038);
         var13.packetBuffer.writeByte(Client.tradeChatMode);
         Client.packetWriter.addNode(var13);
         return 1;
      } else {
         PacketBufferNode var6;
         int var7;
         String var8;
         int var9;
         if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) {
            var8 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
            Interpreter.Interpreter_intStackSize -= 2;
            var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            var6 = UserComparator9.getPacketBufferNode(ClientPacket.CHAT_SENDABUSEREPORT, Client.packetWriter.isaacCipher);
            var6.packetBuffer.writeByte(WorldMapLabel.stringCp1252NullTerminatedByteSize(var8) + 2);
            var6.packetBuffer.writeStringCp1252NullTerminated(var8);
            var6.packetBuffer.writeByte(var7 - 1);
            var6.packetBuffer.writeByte(var9);
            Client.packetWriter.addNode(var6);
            return 1;
         } else {
            int var3;
            Message var5;
            if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) {
               Interpreter.Interpreter_intStackSize -= 2;
               var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
               var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
               var5 = TaskHandler.Messages_getByChannelAndID(var3, var7);
               if (var5 != null) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.count;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.cycle;
                  Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
                  Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
                  Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                  Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                  Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else {
               Message var4;
               if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var4 = class208.Messages_getMessage(var3);
                  if (var4 != null) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.type;
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.cycle;
                     Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
                     Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
                     Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
                  } else {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                     Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                  }

                  return 1;
               } else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) {
                  if (class207.privateChatMode == null) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
                  } else {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class207.privateChatMode.field5038;
                  }

                  return 1;
               } else {
                  PacketBufferNode var12;
                  if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) {
                     var8 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                     var12 = BuddyRankComparator.method2887(var7, var8, class69.clientLanguage, -1);
                     Client.packetWriter.addNode(var12);
                     return 1;
                  } else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) {
                     HealthBar.Interpreter_stringStackSize -= 2;
                     var8 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize];
                     String var11 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize + 1];
                     var12 = UserComparator9.getPacketBufferNode(ClientPacket.CHAT_SENDPRIVATE, Client.packetWriter.isaacCipher);
                     var12.packetBuffer.writeShort(0);
                     int var10 = var12.packetBuffer.offset;
                     var12.packetBuffer.writeStringCp1252NullTerminated(var8);
                     ClanChannel.method3325(var12.packetBuffer, var11);
                     var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10);
                     Client.packetWriter.addNode(var12);
                     return 1;
                  } else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) {
                     var8 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                     Interpreter.Interpreter_intStackSize -= 2;
                     var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                     var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                     var6 = BuddyRankComparator.method2887(var7, var8, class69.clientLanguage, var9);
                     Client.packetWriter.addNode(var6);
                     return 1;
                  } else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) {
                     if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) {
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.tradeChatMode;
                        return 1;
                     } else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) {
                        var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SecureRandomCallable.Messages_getHistorySize(var3);
                        return 1;
                     } else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) {
                        var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class1.Messages_getLastChatID(var3);
                        return 1;
                     } else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) {
                        var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class329.method6345(var3);
                        return 1;
                     } else if (var0 == ScriptOpcodes.DOCHEAT) {
                        var8 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                        class122.doCheat(var8);
                        return 1;
                     } else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) {
                        Client.field637 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize].toLowerCase().trim();
                        return 1;
                     } else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) {
                        Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = Client.field637;
                        return 1;
                     } else if (var0 == ScriptOpcodes.WRITECONSOLE) {
                        var8 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                        System.out.println(var8);
                        return 1;
                     } else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYTYPEANDLINE) {
                        Interpreter.Interpreter_intStackSize -= 2;
                        var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                        var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                        var5 = TaskHandler.Messages_getByChannelAndID(var3, var7);
                        if (var5 != null) {
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.count;
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.cycle;
                           Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
                           Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
                           Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
                           Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                        } else {
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                           Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                           Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                        }

                        return 1;
                     } else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYUID) {
                        var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                        var4 = class208.Messages_getMessage(var3);
                        if (var4 != null) {
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.type;
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.cycle;
                           Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
                           Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
                           Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
                           Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                        } else {
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                           Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                           Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                        }

                        return 1;
                     } else {
                        return 2;
                     }
                  } else {
                     if (BuddyRankComparator.localPlayer != null && BuddyRankComparator.localPlayer.username != null) {
                        var8 = BuddyRankComparator.localPlayer.username.getName();
                     } else {
                        var8 = "";
                     }

                     Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var8;
                     return 1;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedName("iv")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1153770034"
   )
   static final void method834() {
      BoundaryObject.method4754(false);
      Client.field627 = 0;
      boolean var0 = true;

      int var1;
      for(var1 = 0; var1 < GrandExchangeOfferOwnWorldComparator.regionLandArchives.length; ++var1) {
         if (PacketBuffer.regionMapArchiveIds[var1] != -1 && GrandExchangeOfferOwnWorldComparator.regionLandArchives[var1] == null) {
            GrandExchangeOfferOwnWorldComparator.regionLandArchives[var1] = ClientPreferences.archive9.takeFile(PacketBuffer.regionMapArchiveIds[var1], 0);
            if (GrandExchangeOfferOwnWorldComparator.regionLandArchives[var1] == null) {
               var0 = false;
               ++Client.field627;
            }
         }

         if (class123.regionLandArchiveIds[var1] != -1 && class372.regionMapArchives[var1] == null) {
            class372.regionMapArchives[var1] = ClientPreferences.archive9.takeFileEncrypted(class123.regionLandArchiveIds[var1], 0, ModelData0.xteaKeys[var1]);
            if (class372.regionMapArchives[var1] == null) {
               var0 = false;
               ++Client.field627;
            }
         }
      }

      if (!var0) {
         Client.field501 = 1;
      } else {
         Client.field548 = 0;
         var0 = true;

         int var3;
         int var4;
         for(var1 = 0; var1 < GrandExchangeOfferOwnWorldComparator.regionLandArchives.length; ++var1) {
            byte[] var17 = class372.regionMapArchives[var1];
            if (var17 != null) {
               var3 = (class12.regions[var1] >> 8) * 64 - GameEngine.baseX * 64;
               var4 = (class12.regions[var1] & 255) * 64 - class178.baseY * 64;
               if (Client.isInInstance) {
                  var3 = 10;
                  var4 = 10;
               }

               var0 &= class150.method3188(var17, var3, var4);
            }
         }

         if (!var0) {
            Client.field501 = 2;
         } else {
            if (Client.field501 != 0) {
               class16.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
            }

            EnumComposition.playPcmPlayers();
            class1.scene.clear();

            for(var1 = 0; var1 < 4; ++var1) {
               Client.collisionMaps[var1].clear();
            }

            int var2;
            for(var1 = 0; var1 < 4; ++var1) {
               for(var2 = 0; var2 < 104; ++var2) {
                  for(var3 = 0; var3 < 104; ++var3) {
                     Tiles.Tiles_renderFlags[var1][var2][var3] = 0;
                  }
               }
            }

            EnumComposition.playPcmPlayers();
            class12.method109();
            var1 = GrandExchangeOfferOwnWorldComparator.regionLandArchives.length;
            class389.method7353();
            BoundaryObject.method4754(true);
            int var5;
            if (!Client.isInInstance) {
               byte[] var16;
               for(var2 = 0; var2 < var1; ++var2) {
                  var3 = (class12.regions[var2] >> 8) * 64 - GameEngine.baseX * 64;
                  var4 = (class12.regions[var2] & 255) * 64 - class178.baseY * 64;
                  var16 = GrandExchangeOfferOwnWorldComparator.regionLandArchives[var2];
                  if (var16 != null) {
                     EnumComposition.playPcmPlayers();
                     Decimator.method1125(var16, var3, var4, class124.field1471 * 8 - 48, ArchiveDiskActionHandler.field4161 * 8 - 48, Client.collisionMaps);
                  }
               }

               for(var2 = 0; var2 < var1; ++var2) {
                  var3 = (class12.regions[var2] >> 8) * 64 - GameEngine.baseX * 64;
                  var4 = (class12.regions[var2] & 255) * 64 - class178.baseY * 64;
                  var16 = GrandExchangeOfferOwnWorldComparator.regionLandArchives[var2];
                  if (var16 == null && ArchiveDiskActionHandler.field4161 < 800) {
                     EnumComposition.playPcmPlayers();
                     class350.method6634(var3, var4, 64, 64);
                  }
               }

               BoundaryObject.method4754(true);

               for(var2 = 0; var2 < var1; ++var2) {
                  byte[] var15 = class372.regionMapArchives[var2];
                  if (var15 != null) {
                     var4 = (class12.regions[var2] >> 8) * 64 - GameEngine.baseX * 64;
                     var5 = (class12.regions[var2] & 255) * 64 - class178.baseY * 64;
                     EnumComposition.playPcmPlayers();
                     WorldMapDecoration.method5220(var15, var4, var5, class1.scene, Client.collisionMaps);
                  }
               }
            }

            int var6;
            int var7;
            int var8;
            if (Client.isInInstance) {
               int var9;
               int var10;
               int var11;
               for(var2 = 0; var2 < 4; ++var2) {
                  EnumComposition.playPcmPlayers();

                  for(var3 = 0; var3 < 13; ++var3) {
                     for(var4 = 0; var4 < 13; ++var4) {
                        boolean var18 = false;
                        var6 = Client.instanceChunkTemplates[var2][var3][var4];
                        if (var6 != -1) {
                           var7 = var6 >> 24 & 3;
                           var8 = var6 >> 1 & 3;
                           var9 = var6 >> 14 & 1023;
                           var10 = var6 >> 3 & 2047;
                           var11 = (var9 / 8 << 8) + var10 / 8;

                           for(int var12 = 0; var12 < class12.regions.length; ++var12) {
                              if (class12.regions[var12] == var11 && GrandExchangeOfferOwnWorldComparator.regionLandArchives[var12] != null) {
                                 int var13 = (var9 - var3) * 8;
                                 int var14 = (var10 - var4) * 8;
                                 class220.method4359(GrandExchangeOfferOwnWorldComparator.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14, Client.collisionMaps);
                                 var18 = true;
                                 break;
                              }
                           }
                        }

                        if (!var18) {
                           MenuAction.method2052(var2, var3 * 8, var4 * 8);
                        }
                     }
                  }
               }

               for(var2 = 0; var2 < 13; ++var2) {
                  for(var3 = 0; var3 < 13; ++var3) {
                     var4 = Client.instanceChunkTemplates[0][var2][var3];
                     if (var4 == -1) {
                        class350.method6634(var2 * 8, var3 * 8, 8, 8);
                     }
                  }
               }

               BoundaryObject.method4754(true);

               for(var2 = 0; var2 < 4; ++var2) {
                  EnumComposition.playPcmPlayers();

                  for(var3 = 0; var3 < 13; ++var3) {
                     for(var4 = 0; var4 < 13; ++var4) {
                        var5 = Client.instanceChunkTemplates[var2][var3][var4];
                        if (var5 != -1) {
                           var6 = var5 >> 24 & 3;
                           var7 = var5 >> 1 & 3;
                           var8 = var5 >> 14 & 1023;
                           var9 = var5 >> 3 & 2047;
                           var10 = (var8 / 8 << 8) + var9 / 8;

                           for(var11 = 0; var11 < class12.regions.length; ++var11) {
                              if (class12.regions[var11] == var10 && class372.regionMapArchives[var11] != null) {
                                 Tiles.method2163(class372.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, class1.scene, Client.collisionMaps);
                                 break;
                              }
                           }
                        }
                     }
                  }
               }
            }

            BoundaryObject.method4754(true);
            EnumComposition.playPcmPlayers();
            UserComparator7.method2855(class1.scene, Client.collisionMaps);
            BoundaryObject.method4754(true);
            var2 = Tiles.Tiles_minPlane;
            if (var2 > TaskHandler.Client_plane) {
               var2 = TaskHandler.Client_plane;
            }

            if (var2 < TaskHandler.Client_plane - 1) {
               var2 = TaskHandler.Client_plane - 1;
            }

            if (Client.isLowDetail) {
               class1.scene.init(Tiles.Tiles_minPlane);
            } else {
               class1.scene.init(0);
            }

            for(var3 = 0; var3 < 104; ++var3) {
               for(var4 = 0; var4 < 104; ++var4) {
                  class148.updateItemPile(var3, var4);
               }
            }

            EnumComposition.playPcmPlayers();
            UserComparator8.method2847();
            ObjectComposition.ObjectDefinition_cachedModelData.clear();
            PacketBufferNode var19;
            if (class392.client.hasFrame()) {
               var19 = UserComparator9.getPacketBufferNode(ClientPacket.DETECT_MODIFIED_CLIENT, Client.packetWriter.isaacCipher);
               var19.packetBuffer.writeInt(1057001181);
               Client.packetWriter.addNode(var19);
            }

            if (!Client.isInInstance) {
               var3 = (class124.field1471 - 6) / 8;
               var4 = (class124.field1471 + 6) / 8;
               var5 = (ArchiveDiskActionHandler.field4161 - 6) / 8;
               var6 = (ArchiveDiskActionHandler.field4161 + 6) / 8;

               for(var7 = var3 - 1; var7 <= var4 + 1; ++var7) {
                  for(var8 = var5 - 1; var8 <= var6 + 1; ++var8) {
                     if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) {
                        ClientPreferences.archive9.loadRegionFromName("m" + var7 + "_" + var8);
                        ClientPreferences.archive9.loadRegionFromName("l" + var7 + "_" + var8);
                     }
                  }
               }
            }

            class19.updateGameState(30);
            EnumComposition.playPcmPlayers();
            class36.method675();
            var19 = UserComparator9.getPacketBufferNode(ClientPacket.field3058, Client.packetWriter.isaacCipher);
            Client.packetWriter.addNode(var19);
            Strings.method6352();
         }
      }
   }
}
